package automation;

public class LocatorsJava {

    public static String solutionLink = "//a[@href='/home']";

    public static String pricingLink = "//a[@href='/pricing']";

    public static String blogLink = "//a[@href='/blogs']";

    public static String aboutUslink = "//a[@href='/about-us']";

    public static String contactLink = "//a[@href='/contact-us']";



    public String startNowBtn = "//button[@class='primary-btn'][text()='Start now!']";

    public static String phoneInput = "//input[@formcontrolname='phoneNo']";

    public static String nextBtn = "//span[@class='mdc-button__label'][text()='Next']";

    public static String errorText = "//div[@formgroupname='mobileNo']/following-sibling::div";

    public static String verifyOTPBtn = "//span[text()='Verify OTP']";

    public static String dashboardBtn = "//div[text()='Dashboard']";

    public static String menuDropDown = "//div[@aria-haspopup='menu']/div[contains(@class, 'icon dropdown-icon')]";

    public static String myProfileBtn = "//div[text()='My Profile']";

    public static String uploadPhotoEditIcon = "//div[@class='w-full h-full icon action-icon edit-icon']";

    public static String profileNameEdit = "//input[@formcontrolname='name']";

    public static String profileCompanyNameEdit = "//input[@formcontrolname='companyName']";

    public static String profileAbout = "//textarea[@formcontrolname='about']";

    public static String profileCurrencySelectDropDown = "//mat-select[@role='combobox'][@formcontrolname='currency']";

    public static String profileRupeesOption = "//mat-option/span[contains(text(), 'Rupees')]";

    public static String profileEmailInput = "//input[@formcontrolname='email']";

    public static String addBtn = "//span[text()='Add']";

    public static String catalogueGroupBtn = "//div/span/div[@class='text-sm'][text()='Catalogue group']";

    public static String uploadPhotoEditIcon1 = "//input[@type='file']";

    public static String groupName = "//input[@formcontrolname='name']";

    public static String allRadioBtns = "//span[@class='mdc-switch__handle']";

    public static String unitOfMeasureSelect = "//mat-select[@formcontrolname='unitOfMeasure']";

    public static String unitOfMeasureGrams = "//mat-option[@role='option']/span[contains(text(), 'Grams')]";

    public static String quantitySelect = "//mat-select[@formcontrolname='mainInventoryTypeId']";

    public static String getQuantityKiloGram = "//mat-option[@role='option']/span[contains(text(), 'Kilogram')]";

    public static String otherFields1 = "//input[@formcontrolname='keyName']";

    public static String otherFields2 = "(//input[@formcontrolname='keyName'])[2]";

    public static String whiteListRadio = "//input[@value='WHITELIST']";

    public static String createBtn = "//span[text()='Create']";

    public static String confirmYesBtn = "//span[text()='Yes']";

    public static String confirmNoBtn = "//button[text()='No']";

    public static String catalogueBtn = "//div/span/div[@class='text-sm'][text()='Catalogue']";

    public static String uploadPhotoEditIcon2 = "//input[@type='file']";

    public static String catalogueName = "//input[@formcontrolname='title']";

    public static String unitOfMeasureCatalogue = "//mat-select[@id='mat-select-10']";

    public static String privacyPublic = "//div[@formgroupname='settings']/label/span[text()='Public']";

    //public static String myCataloguesBtn = "//div[text()='My Catalogues']";

    //public static String addToCatalogues = "//table/tbody/tr/td[6]/div/action-button[1]";


    public static String addProductButton = "//button/span/span[@class='px-4'][text()=' Add Product']";

    public static String uploadImage = "//input[@type='file']";

    public static String productTitle = "//input[@id='_0title']";

    public static String productDescription = "//input[@id='_0description']";

    public static String productSKU = "//input[@id='_0sku']";

    public static String productUOM = "//input[@id='_0uom']";

    public static String productTag = "//input[@id='_0tags']";

    public static String productSave = "//span[@class='mdc-button__label'][text()='Save']";

    public static String productFilter = "//button/div[@class='w-full h-full icon action-icon filter-icon']";

    public static String productAvailability = "//span[text()=' Availability ']";

//    public static String productInStock = "//*[@id='cdk-accordion-child-1']/div/div/div[1]/div";

    public static String productOutOfStock = "//label[text()=' Out of Stock ']";

    public static String productApply = "//button/span[text()='Apply']";

    public static String productShare = "//button/div[@class='w-full h-full icon action-icon share-icon']";

    public static String productManageInventory = "//button/div[@class='w-full h-full icon action-icon manageInventory-icon']";

//    public static String productMnKg = "//*[@id='mat-input-14']";

//    public static String productMnSubBtn = "//span[text()='Submit']";

    public static String forwardToSupplier = "//button/div[@class='w-full h-full icon action-icon forwardOrder-icon']";

    public static String searchSupplier = "//mat-label[text()='Search Supplier']";

    public static String supplier1 = "//span[text()='Sanji (+918956237478)']";

    public static String s1 = "//div[text()='Sanji']";

    public static String orderValue = "//mat-label[contains(text(),'Order Value')]/ancestor::mat-form-field//input";


    //public static String orderDate = "//input[@id='mat-input-18']/following::button[1]";

    public static String selectDate =  "//div[contains(@class,'mat-calendar-body-today')]";

    public static String forward = "//span[text()='Forward']";



    public static String productDesc = "//textarea[@id='mat-input-11']";

    public static String productExpire = "//div[@id='mat-select-value-15']";

    public static String productExpireOption = "//mat-option[@id='mat-option-41']";

    public static String productShareBtn = "//span[text()='Share']";

    public static String productShareLink = "//p[text()='Copy Link']";

    public static String productShareClose = "//div[@class='w-6 h-6 icon close-icon bg-black']";

    public static String productImage = "//img[@class='w-full h-full object-contain cursor-grab']";

    public static String productCheckBox = "//*[@id='mat-mdc-checkbox-10-input']";

    public static String productDownload = "//product-list/div/div[1]/div[2]/action-button[7]";

    public static String productSupplier = "//span[text() = 'Select Supplier ']";

    public static String productSupplierAdd = "//div[text()='Add New Supplier']";

    public static String productCompanyName = "//input[@id='mat-input-11']";

    public static String productSupplierName = "//input[@id='mat-input-12']";

    public static String ProductSupplierNo = "//input[@id='mat-input-13']";

    public static String ProductSupplierEmail = "//input[@id='mat-input-14']";

    public static String ProductSupplierPinCode = "//input[@id='mat-input-15']";

    public static String ProductSupplierCountry = "//input[@id='mat-input-16']";

    public static String ProductSupplierState = "//input[@id='mat-input-17']";

    public static String ProductSupplierCity = "//input[@id='mat-input-18']";

    public static String productSupplierLandMark = "//input[@id='mat-input-19']";

    public static String productSupplierAdd1 = "//input[@id='mat-input-20']";

    public static String productSupplierAdd2 = "//input[@id='mat-input-21']";

    public static String productSupplierBtn = "//*[@id='mat-mdc-dialog-4']/div/div/add-supplier-popup/div/button/span[2]";

    public static String productSupplierList = "//input[@id='mat-radio-7-input']";

    public static String productSupplierSubmit = "//span[text()='Submit']";

    public static String productEdit = "//div[@class='w-full h-full icon action-icon edit-icon']";

    public static String productSupplierSave = "//button/span[text()='Save']";

    public static String productForward = "//button/div[@class='w-full h-full icon action-icon forwardOrder-icon']";

    public static String selectSuppliers = "//mat-label[text()='Search Supplier']";

    public static String supplierDropDown = "//span[text()='Sanji (+918956237478)']";


}
