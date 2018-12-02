package com;

import org.openqa.selenium.By;
public class CommonElements {
	/*Login page*/
	public static final By userId= By.id("pt1:_pt_it1::content");
	public static final By password= By.id("pt1:_pt_it2::content");
	public static final By signinButton=  By.id("pt1:_pt_cb1");

	/*Contractor Creation*/
	public static final By users= By.xpath("//span[text()='Users']");
	public static final By searchResultsHeader= By.xpath("//h1[text()='Search Results']");
	public static final By createBtn= By.xpath("//span[text()=' Create']");
	public static final By userType=By.id("pt1:_d_reg:region2:1:r2:0:_xg_35::content");
	public static final By firstName=By.id("pt1:_d_reg:region2:1:r2:0:_xg_17::content");
	public static final By lastName=By.id("pt1:_d_reg:region2:1:r2:0:_xg_26::content");

	/*Manager selection*/

	public static final By managerSearchIcon=By.id("pt1:_d_reg:region2:1:r2:0:dtrt_dc_8796465622::lovIconId");
	public static final By managerId=By.id("pt1:_d_reg:region2:1:r2:0:dtrt_dc_8796465622::_afrLovInternalQueryId:value00::content");
	public static final By managersearchBtn=By.id("pt1:_d_reg:region2:1:r2:0:dtrt_dc_8796465622::_afrLovInternalQueryId::search");

	/*manager name selection*/
	public static final By mgrokBtn=By.id("pt1:_d_reg:region2:1:r2:0:dtrt_dc_8796465622::lovDialogId::ok");

	public static final By country=By.id("pt1:_d_reg:region2:1:r2:0:dtrt_dc_948349037::content");
	public static final By contractorSubType=By.id("pt1:_d_reg:region2:1:r2:0:dtrt_dc_8575523695::content");
	public static final By loadingIcon=By.xpath("//span[@id='pt1:ptsi1']/img");

	/*Other attributes*/
	public static final By buisiness_Unit=By.id("pt1:_d_reg:region2:1:r2:0:dtrt_dc_1913690719::content");
	public static final By vendor_Name=By.id("pt1:_d_reg:region2:1:r2:0:dtrt_dc_7836551102::content");
	public static final By contractor_Type=By.id("pt1:_d_reg:region2:1:r2:0:dtrt_dc_5779962447::content");
	public static final By language=By.id("pt1:_d_reg:region2:1:r2:0:dtrt_dc_3177120163::content");
	public static final By organizationUnitName=By.id("pt1:_d_reg:region2:1:r2:0:dtrt_dc_5990165759::content");
	public static final By salutation=By.id("pt1:_d_reg:region2:1:r2:0:dtrt_dc_2498594382::content");


	/*company code selection*/

	public static final By companyCodeSearchIcon=By.id("pt1:_d_reg:region2:1:r2:0:dtrt_dc_6911552204::lovIconId");
	public static final By compnayCodetxtBox=By.id("pt1:_d_reg:region2:1:r2:0:dtrt_dc_6911552204::_afrLovInternalQueryId:value00::content");
	public static final By companySearchBtn=By.id("pt1:_d_reg:region2:1:r2:0:dtrt_dc_6911552204::_afrLovInternalQueryId::search");
	public static final By companyokBtn=By.id("pt1:_d_reg:region2:1:r2:0:dtrt_dc_6911552204::lovDialogId::ok");

	public static final By userLocationSearchIcon=By.xpath("//a[@title='Search: User Location']");

	public static final By userLocationSearchBtn=By.id("pt1:_d_reg:region2:1:r2:0:dtrt_dc_9678057072::_afrLovInternalQueryId::search");
	public static final By userLocationokBtn=By.id("pt1:_d_reg:region2:1:r2:0:dtrt_dc_9678057072::lovDialogId::ok");
	public static final By userLocationIdtxt=By.id("pt1:_d_reg:region2:1:r2:0:dtrt_dc_9678057072::_afrLovInternalQueryId:value00::content");

	public static final By costCenter=By.id("pt1:_d_reg:region2:1:r2:0:dtrt_dc_3061496392::content");
	/*submiting the form*/
	public static final By submitBtn=By.xpath("//span[text()='Submit']");
	public static final By signOutbtn=By.linkText("Sign Out");


	/*storing the request ID and Userlogin*/
	public static final By requestDetails=By.linkText("Request Details");
	public static final By accountsTab=By.linkText("Accounts");

	public static final By userLoginId=By.id("pt1:_d_reg:region2:2:r1:0:r2:0:_xg_42::content");



	/** run evaluate policy after approve**/

	public static final By scheduler=By.xpath("//span[text()='Scheduler']");
	public static final By scheduleJobLbl=By.xpath("//span[text()='Search Scheduled Jobs']");
	public static final By searchScheduleTxtbox=By.id("PANEL_PAGE:_iam_54:simpleSearchInput::content");
	public static final By searchArrowIcon=By.id("PANEL_PAGE:_iam_54::search_icon");
	public static final By evalPolicyLink=By.linkText("Evaluate User Policies");
	public static final By jobDetailsLbl=By.xpath("//div[@title='Job Details : Evaluate User Policies']");
	public static final By evalRunNowBtn=By.xpath("//button[@title='Run the job now']");
	public static final By evalRefreshBtn=By.xpath("//button[@title='Refresh the job']");
	public static final By evalConfirmationMsg=By.xpath("//td[text()='Confirmation']");
	public static final By adminSignout=By.id("pt1:_shgnp1:cni2");
	public static final By policy_LoadingIcon=By.xpath("//span[@id='PANEL_PAGE:ptsi1']/img");


	/*Contractor Manager Approval*/

	public static final By inbox= By.xpath("//span[text()='Inbox']");
	public static final By inboxSearchText = By.xpath("//input[@id='pt1:_d_reg:region1:1:r1:0:tldc:keywordFilter::content']");
	public static final By inboxSearchicon = By.id("pt1:_d_reg:region1:1:r1:0:tldc:searchButton::icon");
	public static final By selectMail = By.id("pt1:_d_reg:region1:1:r1:0:tldc:taskTable:68:j_id__ctru126pc112");
	public static final By assignedimg = By.xpath("//img[@alt='Assigned']");

	public static final By actionslink = By.linkText("Actions");

	public static final By actionsTab = By.id("pt1:_d_reg:region2:1:r1:0:tldc:taskActionsSelect");
	public static final By approveLink = By.xpath("//tr[@id='pt1:_d_reg:region1:1:r1:0:tldc:caitr:0:cami']/td[2]");

	/*Modify contractor*/
	public static final By searchUsersHeader = By.xpath("//h1[text()='Search Users']");
	public static final By firstNameSearchtxt = By.id("pt1:_d_reg:region1:1:qryId1:value10::content");

	public static final By selectIdentityStatus = By.id("pt1:_d_reg:region1:1:qryId1:value30::content");
	public static final By organization = By.id("pt1:_d_reg:region1:1:qryId1:value90::content");
	public static final By selectUserType = By.id("pt1:_d_reg:region1:1:qryId1:value80::content");


	public static final By userLogintxt = By.id("pt1:_d_reg:region1:1:qryId1:value00::content");
	public static final By userSearchBtn = By.id("pt1:_d_reg:region1:1:qryId1::search");

	public static final By modifyUserLink = By.xpath("//span[text()='Modify User']");
	public static final By modifyUsersPage = By.xpath("//h1[contains(text(), 'Modify User :' )]");
	public static final By modFirstName = By.id("pt1:_d_reg:region3:1:r2:0:_xg_17::content");

	public static final By modLastName = By.id("pt1:_d_reg:region3:1:r2:0:_xg_26::content");
	public static final By modSubmitBtn = By.xpath("//span[text()='Submit']");
	public static final By summaryInfo = By.xpath("//h1[text()='Summary Information']");
	public static final By attributesLink = By.linkText("Attributes");
	public static final By modifiedFirstName = By.xpath("//tr[@id='pt1:_d_reg:region2:1:plam43']/td[2]");
	public static final By modifiedLastName = By.xpath("//tr[@id='pt1:_d_reg:region2:1:plam17']/td[2]");
	public static final By refreshBtn = By.xpath("//span[text()=' Refresh']");

	/*HelpDesk*/
	public static final By usersearch = By.xpath("//input[@id='pt1:_d_reg:region1:1:qryId1:value00::content']");
	public static final By search = By.xpath("//button[contains(@id, 'qryId1::search')]");
	public static final By searchLink = By.xpath("//a[@id='pt1:_d_reg:region1:1:pc1:t1:72:cl1']");
	public static final By attributes = By.id("pt1:_d_reg:region2:1:sdi1::disAcr");
	public static final By helpdeskPinAttribute = By.xpath("//label[text()='Help Desk PIN']");
	public static final By helpdeskValue = By.xpath("//*[@id=\"pt1:_d_reg:region2:1:dtrt_dc_9798857841\"]/td[2]");
	public static final By UserType = By.id("pt1:_d_reg:region1:1:qryId1:value80::content");
	public static final By removeMgr=By.xpath("//a[@title='Remove: Manager']");
	public static final By searchlinkforContractor = By.id("pt1:_d_reg:region1:1:pc1:t1:0:cl1");

	/*Termination*/
	public static final By personStatus = By.id("pt1:_d_reg:region3:1:r2:0:dtrt_dc_4412066317::content");
	public static final By teminationRequestId= By.xpath("//tr[@id='pt1:_d_reg:region3:2:r2:0:plam11']/td[2]");


	/* Agent Creation*/
	public static final By agentType = By.id("pt1:_d_reg:region2:1:r2:0:dtrt_dc_1237099122::content");
	public static final By agentMgrSearchIcon = By.id("pt1:_d_reg:region2:1:r2:0:cil2::icon");
	public static final By agentMgrId = By.xpath("//input[@id='pt1:_d_reg:region2:1:r2:0:r1:0:qryId1:criterionValue::content']");
	public static final By agentMgrSearch = By.id("pt1:_d_reg:region2:1:r2:0:r1:0:qryId1::search_icon");
	public static final By agentMgrSelect = By.id("//span[text()='Jyothi Tumula']");
	public static final By agentMgrSelection = By.id("pt1:_d_reg:region2:1:r2:0:r1:0:cb1");
	public static final By agentSubmit = By.id("pt1:_d_reg:region2:1:commandToolbarButton2");
	public static final By agentRole = By.id("pt1:_d_reg:region2:2:sdi2::disAcr");
	public static final By roleRefresh = By.id("pt1:_d_reg:region2:2:r3:0:pc1:ctb3::icon");
	public static final By agentAccounts = By.id("pt1:_d_reg:region2:2:sdi4::disAcr");
	public static final By accountRefresh = By.id("pt1:_d_reg:region2:2:r5:0:pc1:ctb6");
	public static final By agentOrg = By.id("pt1:_d_reg:region2:2:sdi6::disAcr");
	public static final By orgRefresh = By.id("pt1:_d_reg:region2:2:r1:0:pc1:cil1::icon");


	/*Agent MOdify*/
	public static final By clearManager = By.id("pt1:_d_reg:region1:1:qryId1:value100::content");
	public static final By modifyAgent= By.xpath("//span[text()='Modify User']");
	public static final By BIE2AccessType = By.id("pt1:_d_reg:region3:1:r2:0:dtrt_dc_4877321812::content");
	public static final By BIE2Habitational = By.id("pt1:_d_reg:region3:1:r2:0:dtrt_dc_2115477925::content");
	public static final By BIE2Restaurant = By.id("pt1:_d_reg:region3:1:r2:0:dtrt_dc_7948431333::content");
	public static final By BIE2Retail = By.id("pt1:_d_reg:region3:1:r2:0:dtrt_dc_9575515808::content");
	public static final By BIE2Service = By.id("pt1:_d_reg:region3:1:r2:0:dtrt_dc_7563174745::content");
	public static final By BIE2Office = By.id("pt1:_d_reg:region3:1:r2:0:dtrt_dc_1942994715::content");
	public static final By BIE2Wholesale = By.id("pt1:_d_reg:region3:1:r2:0:dtrt_dc_8250467727::content");
	public static final By BIE2Tradesman = By.id("pt1:_d_reg:region3:1:r2:0:dtrt_dc_860996505::content");
	public static final By BIE2Manufacturing = By.id("pt1:_d_reg:region3:1:r2:0:dtrt_dc_9727108697::content");
	public static final By BIE2Instutional = By.id("pt1:_d_reg:region3:1:r2:0:dtrt_dc_4369785553::content");
	public static final By BIE2Pricing = By.id("pt1:_d_reg:region3:1:r2:0:dtrt_dc_7046270285::content");
	public static final By SDA = By.id("pt1:_d_reg:region3:0:r2:0:dtrt_dc_5715737018::content");
	public static final By agentModifySubmit= By.xpath("//span[text()='Submit']");
	public static final By userDetailsPage= By.id("pt1:_sh_np2:_dtb_2::disclosureAnchor");
	public static final By roleModify= By.id("pt1:_d_reg:region2:1:sdi2::disAcr");
	public static final By roleRef= By.id("pt1:_d_reg:region2:1:r3:0:pc1:ctb3::icon");
	public static final By agentModifiedAcc= By.id("pt1:_d_reg:region2:1:sdi4::disAcr");
	public static final By agentModifiedRefresh= By.id("pt1:_d_reg:region2:1:r5:0:pc1:ctb6::icon");
	public static final By stateCode= By.id("pt1:_d_reg:region3:1:r2:0:dtrt_dc_4454194692::content");
	public static final By districtCode= By.id("pt1:_d_reg:region3:1:r2:0:dtrt_dc_9195762313::content");
	public static final By agentCode= By.id("pt1:_d_reg:region3:1:r2:0:dtrt_dc_1637976657::content");


	/*Agent Staff creation*/
	public static final By agentTypeCode= By.id("pt1:_d_reg:region2:1:r2:0:dtrt_dc_3757213991::content");
	public static final By agentStaffAccount= By.id("pt1:_d_reg:region2:2:sdi4::disAcr");
	public static final By agentStaffAccountRefresh= By.id("pt1:_d_reg:region2:2:r5:0:pc1:ctb6::icon");
	public static final By agentStaffRole= By.id("pt1:_d_reg:region2:2:sdi2::disAcr");
	public static final By agentStaffRoleRefresh= By.id("pt1:_d_reg:region2:2:r3:0:pc1:ctb3::icon");
	public static final By agentStaffDisplayname= By.id("pt1:_d_reg:region1:1:qryId1:value70::content");
	public static final By staffFirstName= By.xpath("//input[@id='pt1:_d_reg:region1:1:qryId1:value10::content']");
	public static final By staffLastName= By.xpath("//input[@id='pt1:_d_reg:region1:1:qryId1:value20::content']");

	/*ResetPassword and helpdeskpin*/
	public static final By resetPwd= By.xpath("//span[text()='Reset Password']");
	public static final By pwdChangeBtn= By.id("pt1:_diags:dgTfRg:1:sbr1::content");
	public static final By newPwd= By.xpath("//input[@id='pt1:_diags:dgTfRg:1:it2::content']");

	public static final By confirmNewPwd= By.xpath("//input[@id='pt1:_diags:dgTfRg:1:it22::content']");
	public static final By resetPwdBtn= By.id("pt1:_diags:dgTfRg:1:cb1");
	public static final By helpDeskPin= By.id("pt1:_d_reg:region0:0:ZFS_HELP_DESK_PIN::content");
	public static final By oldPwd= By.id("pt1:_d_reg:region0:0:it6::content");
	public static final By newPwdforLogin= By.id("pt1:_d_reg:region0:0:it3::content");
	public static final By retypeNewPwd= By.id("pt1:_d_reg:region0:0:it2::content");
	public static final By question1= By.id("pt1:_d_reg:region0:0:soc1::content");
	public static final By question2= By.id("pt1:_d_reg:region0:0:soc2::content");
	public static final By question3= By.id("pt1:_d_reg:region0:0:soc3::content");
	public static final By answer1= By.id("pt1:_d_reg:region0:0:it4::content");
	public static final By answer2= By.id("pt1:_d_reg:region0:0:it1::content");
	public static final By answer3= By.id("pt1:_d_reg:region0:0:it5::content");
	public static final By modifyHelpDeskPin = By.id("pt1:_d_reg:region3:1:r2:0:dtrt_dc_7459223163::content");
	public static final By attributesRefresh = By.id("pt1:_d_reg:region2:1:ctb3::icon");

	//Password Reset AZCorp
	public static final By password_reset_tab= By.id("pt1:_d_reg:region2:1:cil6");
	public static final By password_reset_window= By.id("pt1:_diags:pw0::_ttxt");
	public static final By manually_change_password_button= By.id("pt1:_diags:dgTfRg:1:sbr1::content");
	public static final By enter_password_textbox=By.id("pt1:_diags:dgTfRg:1:it2::content");
	public static final By confirm_password_textbox=By.id("pt1:_diags:dgTfRg:1:it22::content");
	public static final By check_email_to_user_button=By.id("pt1:_diags:dgTfRg:1:sbc1::content");
	public static final By submit_button=By.id("pt1:_diags:dgTfRg:1:cb1");

	//Requesting ZNA RACF account (Request based provisionig)
	public static final By request_new_acc_tab= By.id("pt1:_d_reg:region2:1:r5:0:pc1:ctb4");
	public static final By input_text_box_znaracf= By.id("pt1:_d_reg:region3:1:s27:it1::content");
	public static final By search_Btn= By.id("pt1:_d_reg:region3:1:s27:cil2::icon");
	public static final By zna_racf_label=By.id("pt1:_d_reg:region3:1:t1:26:pgl7");
	public static final By add_to_cart_btn=By.id("pt1:_d_reg:region3:1:t1:26:cb3::icon");
	public static final By checkout_btn=By.id("pt1:_d_reg:region3:1:ctb2::icon");
	public static final By job_name=By.id("pt1:_d_reg:region3:2:r2:0:_xg_65::content");
	public static final By org_unit=By.id("pt1:_d_reg:region3:2:r2:0:_xg_66::content");
	public static final By branch_code=By.id("pt1:_d_reg:region3:2:r2:0:_xg_92::content");
	public static final By business_unit=By.id("pt1:_d_reg:region3:2:r2:0:_xg_68::content");
	public static final By cost_center=By.id("pt1:_d_reg:region3:2:r2:0:_xg_69::content");
	public static final By ready_to_submit_btn=By.id("pt1:_d_reg:region3:2:r2:0:cb2");
	public static final By submit_btn=By.id("pt1:_d_reg:region3:2:commandToolbarButton2");
	public static final By successfully_completed_operation_label=By.id("pt1:_d_reg:region3:3:pgl2");

	public static final By org_unit_icon=By.id("pt1:_d_reg:region3:2:r2:0:_xg_66::lovIconId");
	public static final By job_name_icon=By.id("pt1:_d_reg:region3:2:r2:0:_xg_65::lovIconId");
	public static final By branch_code_icon=By.id("pt1:_d_reg:region3:2:r2:0:_xg_92::lovIconId");
	public static final By business_unit_icon=By.id("pt1:_d_reg:region3:2:r2:0:_xg_68::lovIconId");

	public static final By job_unit_meaning_textbox=By.id("pt1:_d_reg:region3:2:r2:0:_xg_65::_afrLovInternalQueryId:value00::content");
	public static final By org_name_txtbox=By.id("pt1:_d_reg:region3:2:r2:0:_xg_66::_afrLovInternalQueryId:value00::content");
	public static final By branch_code_txtbox=By.id("pt1:_d_reg:region3:2:r2:0:_xg_92::_afrLovInternalQueryId:value00::content");
	public static final By business_unit_txtbox=By.id("pt1:_d_reg:region3:2:r2:0:_xg_68::_afrLovInternalQueryId:value00::content");


	public static final By business_unit_searchbtn=By.id("pt1:_d_reg:region3:2:r2:0:_xg_68::_afrLovInternalQueryId::search");
	public static final By branch_code_searchbtn=By.id("pt1:_d_reg:region3:2:r2:0:_xg_92::_afrLovInternalQueryId::search");
	public static final By org_unit_name_searchbtn=By.id("pt1:_d_reg:region3:2:r2:0:_xg_66::_afrLovInternalQueryId::search");
	public static final By job_name_searchbtn=By.id("pt1:_d_reg:region3:2:r2:0:_xg_65::_afrLovInternalQueryId::search");

	public static final By job_name_okbtn=By.id("pt1:_d_reg:region3:2:r2:0:_xg_65::lovDialogId::ok");
	public static final By org_unit_okbtn=By.id("pt1:_d_reg:region3:2:r2:0:_xg_66::lovDialogId::ok");
	public static final By branch_code_okbtn=By.id("pt1:_d_reg:region3:2:r2:0:_xg_92::lovDialogId::ok");
	public static final By business_unit_okbtn=By.id("pt1:_d_reg:region3:2:r2:0:_xg_68::lovDialogId::ok");

}
