
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;


@AutomationTestLibrary(description = "Automation test case for group synchronization salesforce - Lightning UI")
public class TestGroupSynchronization extends AutomationFrameworkTest {

	SalesCommonPage salesCommonPage;
	WorkspacePage wsPage;
	CommonUtility commonUtility;
	LightningCommonPage lightningCommonPage;
	SalesforceLoginPage salesforceLoginPage;
	CreateBusinessObjectPage createBusinessObjectPage;
	OTXECMHomePage oTXECMHomePage;
	GroupSynchronizationPage groupSyncPage;
	GroupSynchronizationQueuePage groupSyncQueuePage;
	UsersAndGroupPage usersAndGroupsPage;
	EditGroupPage editGroupPage;
	SFAdministrationPage adminPage;

	 String salesforceURL = System.getProperty("automation.salesforceurl");
		String adminLogin = System.getProperty("automation.csusername");
		String csPassword = System.getProperty("automation.cspassword");
		String salesforceUsername = System.getProperty("automation.salesforceusername");
		String salesforcePassword = System.getProperty("automation.salesforcepassword");
		String salesforceAdminUsername = System.getProperty("automation.salesforceadminusername");
		String salesforceAdminPassword = System.getProperty("automation.salesforceadminpassword");
		String csWorkspacePath = System.getProperty("automation.csworkspacebrowse");
		String grantService = System.getProperty("automation.grantservice");
		String clientID = System.getProperty("automation.clientid");
		String clientSecret = System.getProperty("automation.clientsecret");
		String securityToken = System.getProperty("automation.securitytoken");
		String restEndPoint = System.getProperty("automation.endpoint");
		String apiVersion = System.getProperty("automation.apiversion");

	public String sfProfileName = "Standard User";
	public String sfProfileName1="Analytics Cloud Integration User";
//	public String sfProfileName2="";
//	public String sfProfileName3="";
//	public String sfProfileName4="";
	public String sfPermSetName = "xECM_Workspace_Permission_Set";
	public String sfPublicGroupName = "Group_One";

	@Override
	public void setup() {
		salesforceLoginPage = new SalesforceLoginPage();
		salesforceLoginPage.loginAs(salesforceURL, salesforceAdminUsername, salesforceAdminPassword);
		logger.info("Entered username Id \"" + salesforceUsername + "\"");
		lightningCommonPage = new LightningCommonPage();
		lightningCommonPage.navigateToTab("Administration");
		logger.info("Check 'Group Synchronization Enabled' under 'System Configuration' and Save");
		adminPage = new SFAdministrationPage();
		adminPage.navigateToOption("Environment:Group Synchronization Settings");
		adminPage.enableOrDisableGroupSync(true);
		lightningCommonPage.navigateToTab("Group Synchronization");
	}

	@Test
	@AutomationTestCase(author = "Bharath reddy", description = "Verify  group synchronization - Lightning ", category = AutomationTestCategory.SURFACE, database = "DB Empty", type = AutomationTestType.WebDriver)
	public void addProfile() {
		salesCommonPage = new SalesCommonPage();
		String csGroupName = salesCommonPage.generateBOName();
		groupSyncPage = new GroupSynchronizationPage();
		groupSyncPage.addProfileRecord(sfProfileName, csGroupName);
		
		String csGroupName1 = salesCommonPage.generateBOName();
		groupSyncPage = new GroupSynchronizationPage();
		groupSyncPage.addProfileRecord(sfProfileName1, csGroupName1);
		
		lightningCommonPage = new LightningCommonPage();
       
		driver.get(url);
		LoginPage loginPage = new LoginPage();
		wsPage = new WorkspacePage();
		wsPage = loginPage.loginAs(adminLogin, csPassword);
		logger.info("Logged in as \"" + adminLogin + "\"");
		wsPage.accessGlobalMenu("Enterprise", "Users & Groups");
		usersAndGroupsPage = new UsersAndGroupPage();
		//--
		assertTrue("Group is not verified",groupSyncPage.PublicGroupVerification(csGroupName));
		//--
	//	groupSyncPage.PublicGroupVerification(csGroupName);

		int csGroupUserCount = usersAndGroupsPage.getGroupUserCount(csGroupName);
		logger.info(csGroupUserCount);
		wsPage.accessGlobalMenu("Enterprise", "Users & Groups");
		usersAndGroupsPage.findUser(csGroupName, "Group Name");
		editGroupPage = usersAndGroupsPage.editGroup(csGroupName);
		editGroupPage.deleteGroup();
		}


	@Override
	public void cleanup() {
	}

}
