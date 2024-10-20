
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;


public class GroupSynchronizationPage extends SalesforceCommonPage {

	/**
	 * delete selected profile button
	 */
	@OTFindBy(css = "input[value='Delete Selected']")
	public WebElement deleteSelectedButtonProfile;

	/**
	 * checkall checkbox profile
	 */
	@OTFindBy(css = "div[id*='Profile']  input[onclick*='event']")
	public WebElement checkAllProfile;

	/**
	 * Add new profile button
	 */
	@OTFindBy(css = "input[value='Add New']")
	public WebElement addNewProfile;

	/**
	 * Select profilename dropdown
	 */
	@OTFindBy(xpath = "//table[contains(@class,'list')]//select[contains(@name,'Profile')]")
	public WebElement profilenameDropDown;

	/**
	 * profile name textbox
	 */
	@OTFindBy(xpath = "//table[contains(@class,'list')]//input[@type='text']")
	public WebElement profileNameTextBox;

	/**
	 * profile CheckBox
	 */
	@OTFindBy(xpath = "//td[contains(@class,'center')]/input[@type='checkbox']")
	public WebElement profileCheckBox;

	/**
	 * save profile button
	 */
	@OTFindBy(xpath = "//input[@value='Save']")
	public WebElement saveProfile;

	/**
	 * profile message
	 */
	@OTFindBy(xpath = "//div[@class='messageText'] ")
	public WebElement profileMessage;

	/**
	 * sync profile button
	 */
	@OTFindBy(css = ".dataRow.even.first a[onClick*='syncId']")
	public WebElement syncProfile;

	/**
	 * find specific profile name record
	 */
	@OTFindBy(css = "table[id*='ProfileMappingTable'] tbody tr")
	public WebElement findProfileName;

	/**
	 * PERMISSION SET Tab
	 */
	@OTFindBy(css = "table[onclick*='PermissionSet'] td[class*='rich-tab-header']")
	public WebElement permissionSetTab;

	/**
	 * Delete Selected permission set button
	 */
	@OTFindBy(css = "input[name*='PermissionSet'][value='Delete Selected']")
	public WebElement deleteSelectedButtonPermissionSet;

	/**
	 * checkall checkbox permission set
	 */
	@OTFindBy(css = "div[id*='PermissionSet']  input[onclick*='event']")
	public WebElement checkAllPermissionSet;

	/**
	 * Add new permissionset button
	 */
	@OTFindBy(css = "input[name*='PermissionSet'][value='Add New']")
	public WebElement addNewPermissionSet;

	/**
	 * select permissionsetName Dropdown
	 */
	@OTFindBy(css = "table[id*='PermissionSet'] select")
	public WebElement permissionSetNameDropdown;

	/**
	 * permissionsetGroupName TextBox
	 */
	@OTFindBy(css = "input[name*='PermissionSet'][type='text']")
	public WebElement permissionSetGroupNameTextBox;

	/**
	 * permissionset checkbox
	 */
	@OTFindBy(css = ".dataCell.center input[type='checkbox']")
	public WebElement permissionSetCheckbox;

	/**
	 * permissionset Save Button
	 */
	@OTFindBy(css = "input[name*='PermissionSet'][value='Save']")
	public WebElement permissionSetSaveBtn;

	/**
	 * permissionset Message
	 */
	@OTFindBy(css = ".messageCell div[id*='PermissionSet']")
	public WebElement permissionSetMessage;

	/**
	 * permissionset Sync Button
	 */
	@OTFindBy(css = ".dataRow.even.first a[onClick*='syncId']")
	public WebElement permissionSetSyncBtn;

	/**
	 * permissionset Pagenation
	 */
	@OTFindBy(css = ".pbButtonb select[name*='PermissionSet']")
	public WebElement permissionSetPagenation;

	/**
	 * page - iframe
	 */
	@OTFindBy(xpath = "//iframe[@title='accessibility title']")
	public WebElement iFrame;

	/**
	 * InternalUser Tab
	 */
	@OTFindBy(css = "table[onclick*='InternalUsers'] td[class*='rich-tab-header']")
	public WebElement internalUserTab;

	/**
	 * InternalUser Delete Button
	 */
	@OTFindBy(css = ".dataRow.even.first a[onclick*='deleteId']")
	public WebElement internalUserDeleteBtn;

	/**
	 * InternalUser Add button
	 */
	@OTFindBy(css = "input[value='Add']")
	public WebElement addInternalUser;

	/**
	 * InternalUser GroupName TextBox
	 */
	@OTFindBy(css = "input[type='text'][name*='internalUserMappingTable']")
	public WebElement internalUserGroupName;

	/**
	 * InternalUser Checkbox
	 */
	@OTFindBy(css = "input[type='checkbox'][name*='internalUserMappingTable']")
	public WebElement internalUserCheckbox;

	/**
	 * InternalUser Save Button
	 */
	@OTFindBy(css = "input[name*='internalUser'][value='Save']")
	public WebElement internalUserSaveBtn;

	/**
	 * InternalUser Save Message
	 */
	@OTFindBy(css = ".messageCell div[id*='internalUser']")
	public WebElement internalUserMessage;

	/**
	 * InternalUser Sync Button
	 */
	@OTFindBy(css = "tbody[id*='internalUser'] a[onClick*='syncId']")
	public WebElement internalUserSyncBtn;

	/**
	 * publicGroup Tab
	 */
	@OTFindBy(css = "table[onclick*='PublicGroup'] td[class*='rich-tab-header']")
	public WebElement publicGroupTab;

	/**
	 * publicGroup Delete Button
	 */
	@OTFindBy(css = ".dataRow.even.first a[onclick*='deleteId']")
	public WebElement publicGroupDeleteButton;

	/**
	 * publicGroup AddNew button
	 */
	@OTFindBy(css = "input[name*='Public'][value='Add New']")
	public WebElement addpublicGroup;

	/**
	 * publicGroup GroupName Dropdown
	 */
	@OTFindBy(css = "table[id*='Public'] select")
	public WebElement sfGroupNameDropDown;

	/**
	 * xECMGroupName TextBox
	 */
	@OTFindBy(css = "input[name*='PublicGroup'][type='text']")
	public WebElement xecmGroupName;

	/**
	 * publicGroup Checkbox
	 */
	@OTFindBy(css = ".dataCell.center input[type='checkbox']")
	public WebElement publicGroupCheckbox;

	/**
	 * publicGroup Save Button
	 */
	@OTFindBy(css = "input[name*='PublicGroup'][value='Save']")
	public WebElement publicGroupSaveButton;

	/**
	 * publicGroup Message
	 */
	@OTFindBy(css = ".messageCell div[id*='PublicGroup']")
	public WebElement publicGroupMessage;

	/**
	 * publicGroup Sync Button
	 */
	@OTFindBy(css = ".dataRow.even.first a[onClick*='syncId']")
	public WebElement publicGroupSyncButton;

	/**
	 * find publicGroupName Table
	 */
	@OTFindBy(css = "table[id*='PublicGroup'] tbody tr")
	public WebElement findPublicGroupName;

	public GroupSynchronizationPage() {
		OTPageFactory.initElements(driver, this);
	}
	 /**
	   * select All
	   */

	@OTFindBy(xpath = "//input[@name='j_id0:groupSynchronizationForm:ProfileMappingTable:j_id72:j_id74']")
	public WebElement selectAllCheckBox;
	 /**
	   * synchronizedSelected
	   */

	@OTFindBy(xpath = "//input[@name='j_id0:groupSynchronizationForm:ProfileMappingTable:j_id39:j_id52']")
	public WebElement synchronizeSelected;

	
	
	 /**
	   * input box of public group name
	   */


	@OTFindBy(xpath = "//input[@class='valueEditable']")
	public WebElement cspnamefind;
	 /**
	   * find 
	   */


	@OTFindBy(xpath = "//input[@value='Find']")
	public WebElement find;
	 /**
	   * dropdown of usergroups
	   */

	@OTFindBy(xpath = "//select[@name='_ug_searchColumn']")
	public WebElement UserGroupsdropdown;
	 /**
	   * usergroups
	   */


	@OTFindBy(xpath = "//option[contains(text(),'Group Name')]")
	public WebElement UserGroups;
	/**
	 * This method is used to add a new profile record
         * @author Bharath reddy

	 */

	public void addProfileRecord(String sfProfileName, String csName) {

		wait.until(ExpectedConditions.visibilityOf(iFrame));
		wait.until(ExpectedConditions.elementToBeClickable(iFrame));
		driver.switchTo().frame(iFrame);

		// Delete record that matches with the sfProfileName if present
		List<WebElement> listOfRows = driver
				.findElements(OTBy.cssSelector("table[id*='ProfileMappingTable'] tbody tr"));
		for (int i = 0; i < listOfRows.size(); i++) {
			WebElement webElement = listOfRows.get(i);
			String profileName = webElement.findElement(OTBy.cssSelector("select option[selected='selected']"))
					.getText();
			if (profileName.equals(sfProfileName)) {
				webElement.findElement(OTBy.cssSelector("a[onClick*='delete']")).click();
				wait.until(ExpectedConditions.visibilityOf(profileMessage));
				logger.info(profileMessage.getText());
				break;
			}
		}

		logger.info("Waiting for element " + elementPresent(OTBy.cssSelector("a[name='data']"), 5000));
		wait.until(ExpectedConditions.visibilityOf(addNewProfile));
		addNewProfile.click();
		wait.until(ExpectedConditions.visibilityOf(profilenameDropDown));
		Select s = new Select(profilenameDropDown);
		s.selectByValue(sfProfileName);
		wait.until(ExpectedConditions.visibilityOf(profileNameTextBox));
		profileNameTextBox.clear();
		profileNameTextBox.sendKeys(csName);
		wait.until(ExpectedConditions.visibilityOf(profileCheckBox));
		profileCheckBox.click();
		logger.info("Waiting for element " + elementPresent(OTBy.cssSelector("a[name='data']"), 10000));
		wait.until(ExpectedConditions.visibilityOf(saveProfile));
		saveProfile.click();
		wait.until(ExpectedConditions.visibilityOf(profileMessage));
		String saveMessage = profileMessage.getText();
		logger.info("The save message is: " + saveMessage);
		List<WebElement> listOfRowsNew = driver
				.findElements(OTBy.cssSelector("table[id*='ProfileMappingTable'] tbody tr"));
		for (int i = 0; i < listOfRowsNew.size(); i++) {
			WebElement webElement = listOfRowsNew.get(i);
			String profileName = webElement.findElement(OTBy.cssSelector("select option[selected='selected']"))
					.getText();
			if (profileName.equals(sfProfileName)) {
				logger.info("Waiting for element " + elementPresent(OTBy.cssSelector("a[name='data']"), 10000));
				wait.until(ExpectedConditions
						.visibilityOf(webElement.findElement(OTBy.cssSelector("a[onClick*='syncId']"))));
				webElement.findElement(OTBy.cssSelector("a[onClick*='syncId']")).click();
				wait.until(ExpectedConditions.visibilityOf(profileMessage));
				logger.info(profileMessage.getText());
				break;
			}
		}
		wait.until(ExpectedConditions.visibilityOf(selectAllCheckBox));
		wait.until(ExpectedConditions.elementToBeClickable(selectAllCheckBox));
//		try {
//			Thread.sleep(4000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		selectAllCheckBox.click();
//		try {
//			Thread.sleep(4000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		// selectAllCheckBox.click();
		wait.until(ExpectedConditions.visibilityOf(synchronizeSelected));
		wait.until(ExpectedConditions.elementToBeClickable(synchronizeSelected));
		synchronizeSelected.click();
		driver.switchTo().defaultContent();
	}

	
	public boolean PublicGroupVerification(String csname) {
		boolean status=false;
		wait.until(ExpectedConditions.elementToBeClickable(UserGroupsdropdown));
		UserGroupsdropdown.click();
		wait.until(ExpectedConditions.elementToBeClickable(UserGroups));
		UserGroups.click();
		wait.until(ExpectedConditions.elementToBeClickable(cspnamefind));
		cspnamefind.click();
		cspnamefind.sendKeys(csname);
		wait.until(ExpectedConditions.elementToBeClickable(find));
		find.click();
		
		String groupVerification = String.format("//a[text()='%s']", csname);

		
		try {
			WebElement element = driver.findElement(OTBy.xpath(groupVerification));
			if (element.isDisplayed()) {
				logger.info("yes group is verified");
				status=true;
			}
		} catch (Exception ex) {
			ex.getMessage();
			logger.info("There are warnings Group not verified");
		}
		return status;
	

	}

	/**
	 * This method is used to add a new permission set record
	 * 
	 *  @author Bharath reddy
	 */
	public void addPermissionSetRecord(String sfPermissionSetName, String CSName) {

		wait.until(ExpectedConditions.visibilityOf(iFrame));
		wait.until(ExpectedConditions.elementToBeClickable(iFrame));
		driver.switchTo().frame(iFrame);
		wait.until(ExpectedConditions.visibilityOf(permissionSetTab));
		wait.until(ExpectedConditions.elementToBeClickable(permissionSetTab));
		permissionSetTab.click();

		// Delete record that matches with the sfPermissionSetName if present
		wait.until(ExpectedConditions.visibilityOf(permissionSetPagenation));
		Select page = new Select(permissionSetPagenation);
		page.selectByValue("25");
		wait.until(ExpectedConditions.visibilityOf(permissionSetPagenation));
		List<WebElement> listOfRows = driver.findElements(OTBy.cssSelector("table[id*='PermissionSet'] tbody tr"));
		//listOfRows.size()
		for (int i = 0; i < 2; i++) {
			WebElement webElement = listOfRows.get(i);
			String permissionSetName = webElement.findElement(OTBy.cssSelector("select option[selected='selected']"))
					.getText();
			if (sfPermissionSetName.equals(permissionSetName)) {
				webElement.findElement(OTBy.cssSelector("a[onClick*='delete']")).click();
				wait.until(ExpectedConditions.visibilityOf(permissionSetMessage));
				logger.info(permissionSetMessage.getText());
				break;
			}
		}

		logger.info("Waiting for element " + elementPresent(OTBy.cssSelector("a[name='data']"), 10000));
		wait.until(ExpectedConditions.visibilityOf(addNewPermissionSet));
		addNewPermissionSet.click();
		logger.info("Waiting for element " + elementPresent(OTBy.cssSelector("a[name='data']"), 5000));
		wait.until(ExpectedConditions.visibilityOf(permissionSetNameDropdown));
		Select s = new Select(permissionSetNameDropdown);
		s.selectByValue(sfPermissionSetName);
		wait.until(ExpectedConditions.visibilityOf(permissionSetGroupNameTextBox));
		permissionSetGroupNameTextBox.clear();
		permissionSetGroupNameTextBox.sendKeys(CSName);
		wait.until(ExpectedConditions.visibilityOf(permissionSetCheckbox));
		permissionSetCheckbox.click();
		logger.info("Waiting for element " + elementPresent(OTBy.cssSelector("a[name='data']"), 5000));
		wait.until(ExpectedConditions.visibilityOf(permissionSetSaveBtn));
		permissionSetSaveBtn.click();
		wait.until(ExpectedConditions.visibilityOf(permissionSetMessage));
		String saveMessage = permissionSetMessage.getText();
		logger.info("The save message is: " + saveMessage);
		List<WebElement> listOfRowsNew = driver.findElements(OTBy.cssSelector("table[id*='PermissionSet'] tbody tr"));
		for (int i = 0; i < listOfRowsNew.size(); i++) {
			WebElement webElement = listOfRowsNew.get(i);
			String permissionSetName = webElement.findElement(OTBy.cssSelector("select option[selected='selected']"))
					.getText();
			if (sfPermissionSetName.equals(permissionSetName)) {
				logger.info("Waiting for element " + elementPresent(OTBy.cssSelector("a[name='data']"), 10000));
				wait.until(ExpectedConditions
						.visibilityOf(webElement.findElement(OTBy.cssSelector("a[onClick*='syncId']"))));
				webElement.findElement(OTBy.cssSelector("a[onClick*='syncId']")).click();
				wait.until(ExpectedConditions.visibilityOf(permissionSetMessage));
				logger.info(permissionSetMessage.getText());
				break;
			}
		}
		driver.switchTo().defaultContent();
	}

	/**
	 * This method is used to add a new Internal users record
	 * 
	 * @author Bharath reddy
	 */
	public void addInternalUsersRecord(String CSname) {

		wait.until(ExpectedConditions.visibilityOf(iFrame));
		wait.until(ExpectedConditions.elementToBeClickable(iFrame));
		driver.switchTo().frame(iFrame);
		wait.until(ExpectedConditions.visibilityOf(internalUserTab));
		internalUserTab.click();
		if (!addInternalUser.isEnabled()) {
			internalUserDeleteBtn.click();
			wait.until(ExpectedConditions.visibilityOf(internalUserMessage));
			logger.info(internalUserMessage.getText());
		}
		logger.info("Waiting for element " + elementPresent(OTBy.cssSelector("a[name='data']"), 5000));
		wait.until(ExpectedConditions.visibilityOf(addInternalUser));
		addInternalUser.click();
		internalUserGroupName.clear();
		wait.until(ExpectedConditions.visibilityOf(internalUserGroupName));
		internalUserGroupName.sendKeys(CSname);
		logger.info("Waiting for element " + elementPresent(OTBy.cssSelector("a[name='data']"), 5000));
		wait.until(ExpectedConditions.visibilityOf(internalUserCheckbox));
		internalUserCheckbox.click();
		logger.info("Waiting for element " + elementPresent(OTBy.cssSelector("a[name='data']"), 5000));
		wait.until(ExpectedConditions.visibilityOf(internalUserSaveBtn));
		internalUserSaveBtn.click();
		wait.until(ExpectedConditions.visibilityOf(internalUserMessage));
		String saveMessage = internalUserMessage.getText();
		logger.info("The save message is: " + saveMessage);
		logger.info("Waiting for element " + elementPresent(OTBy.cssSelector("a[name='data']"), 5000));
		wait.until(ExpectedConditions.visibilityOf(internalUserSyncBtn));
		internalUserSyncBtn.click();
		wait.until(ExpectedConditions.visibilityOf(internalUserMessage));
		String syncMessage = internalUserMessage.getText();
		logger.info("The sync message is: " + syncMessage);
		driver.switchTo().defaultContent();
	}

	/**
	 * This method is used to add a new public group record
	 * 
	 * @author Bharath Reddy
	 */
	public void addPublicGroupRecord(String sfPublicGroupName, String xecmName) {

		wait.until(ExpectedConditions.visibilityOf(iFrame));
		wait.until(ExpectedConditions.elementToBeClickable(iFrame));
		driver.switchTo().frame(iFrame);
		wait.until(ExpectedConditions.visibilityOf(publicGroupTab));
		wait.until(ExpectedConditions.elementToBeClickable(publicGroupTab));
		publicGroupTab.click();

		// Delete record that matches with the sfPublicGroupName if present
		List<WebElement> listOfRows = driver.findElements(OTBy.cssSelector("table[id*='PublicGroup'] tbody tr"));
		for (int i = 0; i < listOfRows.size(); i++) {
			WebElement webElement = listOfRows.get(i);
			String publicGroupName = webElement.findElement(OTBy.cssSelector("select option[selected='selected']"))
					.getAttribute("value");
			if (sfPublicGroupName.equals(publicGroupName)) {
				webElement.findElement(OTBy.cssSelector("a[onClick*='delete']")).click();
				wait.until(ExpectedConditions.visibilityOf(publicGroupMessage));
				logger.info(publicGroupMessage.getText());
				break;
			}
		}

		logger.info("Waiting for element " + elementPresent(OTBy.cssSelector("a[name='data']"), 10000));
		wait.until(ExpectedConditions.visibilityOf(addpublicGroup));
		addpublicGroup.click();
		logger.info("Waiting for element " + elementPresent(OTBy.cssSelector("a[name='data']"), 5000));
		wait.until(ExpectedConditions.visibilityOf(sfGroupNameDropDown));
		Select s = new Select(sfGroupNameDropDown);
		s.selectByValue(sfPublicGroupName);
		wait.until(ExpectedConditions.visibilityOf(xecmGroupName));
		xecmGroupName.clear();
		xecmGroupName.sendKeys(xecmName);
		wait.until(ExpectedConditions.visibilityOf(publicGroupCheckbox));
		publicGroupCheckbox.click();
		logger.info("Waiting for element " + elementPresent(OTBy.cssSelector("a[name='data']"), 5000));
		wait.until(ExpectedConditions.visibilityOf(publicGroupSaveButton));
		publicGroupSaveButton.click();
		wait.until(ExpectedConditions.visibilityOf(publicGroupMessage));
		String saveMessage = publicGroupMessage.getText();
		logger.info("The save message is: " + saveMessage);
		List<WebElement> listOfRowsNew = driver.findElements(OTBy.cssSelector("table[id*='PublicGroup'] tbody tr"));
		for (int i = 0; i < listOfRowsNew.size(); i++) {
			WebElement webElement = listOfRowsNew.get(i);
			String publicGroupName = webElement.findElement(OTBy.cssSelector("select option[selected='selected']"))
					.getAttribute("value");
			if (sfPublicGroupName.equals(publicGroupName)) {
				logger.info("Waiting for element " + elementPresent(OTBy.cssSelector("a[name='data']"), 5000));
				wait.until(ExpectedConditions
						.visibilityOf(webElement.findElement(OTBy.cssSelector("a[onClick*='syncId']"))));
				webElement.findElement(OTBy.cssSelector("a[onClick*='syncId']")).click();
				wait.until(ExpectedConditions.visibilityOf(publicGroupMessage));
				logger.info(publicGroupMessage.getText());
				break;
			}
		}
		driver.switchTo().defaultContent();
	}

}
