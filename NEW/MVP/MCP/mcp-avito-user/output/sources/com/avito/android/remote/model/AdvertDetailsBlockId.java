package com.avito.android.remote.model;

import Y61.k;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.google.gson.annotations.c;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import com.my.tracker.ads.AdFormat;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdvertDetailsBlockId.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\bt\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bsj\u0002\bt¨\u0006u"}, d2 = {"Lcom/avito/android/remote/model/AdvertDetailsBlockId;", "", "(Ljava/lang/String;I)V", "GALLERY", "BEDUIN", "RFP", "AVITO_FOR_BUSINESS", "HEADER", "CREDIT_BROKER_LINK", "CREDIT_CALCULATOR", "BUZZOOLA_CREDIT_BANNER", "ABUSE", "RATING", "MULTI_ITEM_PARAMS", "CLOSING_REASON", "STATISTICS", "AVITO_BLACK_TITLE_AND_PRICE", "TITLE", "PRICE", "PRICE_WITH_NORMALIZED_PRICE_AND_PRICE_HISTORY", "PRICE_HISTORY", "SERVICES_TITLE", "SERVICES_PRICE", "ICE_BREAKERS", "CHAT_HISTORY", "SELLER_INFO", "CONTACT_BAR", "SIMPLE_CONTACT_BAR", "GEO_REFERENCE", "GEO_MARKET_REPORT", "ADDRESS", "SHOW_ON_MAP", "ADDRESS_GEO_DISTANCE", "BRANDING_GALLERY", "BRANDING_ADVANTAGES", "SAFE_DEAL", "SAFE_DEAL_PAYMENT_BLOCK", "COMFORTABLE_DEAL_INFO", "B2C", "RESERVATION_INFO", "DOCKING_BADGE_BAR", "BADGE_BAR_LIGHT", "COMPLEMENTARY_ITEMS", "TABBED_DETAILS", "DESCRIPTION", "DOMOTEKA_REPORT_TEASER", "OTHER_CATEGORIES", "SAFE_DEAL_INFO", "AUTO_RECALL_ME", "SEARCH_SUGGESTS", "AUTOTEKA_TEASER", "GARAGE_COMPATIBILITY_V2", "GARAGE_COMPATIBILITY_V3", "GARAGE_COMPATIBILITY_V4", "PARAMETERS", "ABOUT_DEVELOPER", "ABOUT_HOUSE", "DEVELOPMENT_OFFERS", "CONSULTATION", "CONSULTATION_SUPER_FORM", "CONSULTATION_QUIZ", "REALTOR_BONUS", "REALTY_IMV", "REALTY_USP", "PRIVATE_PARTNER_RECALL", "COMFORTABLE_DEAL_PROMO", "RENT_CONDITIONS", "RENT_AGREEMENT", "CHECK_IN_RULES", "SECONDARY_CONSULTATION", "DYNAMIC_CONSULTATION", "SHORT_TERM_RENT", "TRAVEL_TRUST_ITEM", "NOTE", "DISCLAIMER", "CAMPAIGNS", "COMMERCIALS_BANNER", "COMMERCIALS_PROFILE_PROMO_GALLERY", "EARLY_ACCESS_ADVERT", "MARKETPLACE_STOCKS", "BADGE_BAR", "VIDEO_CALL_REQUEST", "MODEL_SPECS_LINK", "MARKETPLACE_SALES_BANNER", "MARKETPLACE_SALES_BANNER_WITH_FLEXIBLE_IMAGE", "MARKETPLACE_SALES_ADVERT_PROMO_BANNER", "MARKETPLACE_REWARDS_BANNER", "HOTEL_CHECKIN_RULES", "HOTEL_GUEST_INFO", "HOTEL_OFFER", "HOTEL_PROMO_WIDGET", "HOTEL_RATING", "HOTEL_SHOW_ON_MAP", "REVIEWS", "AMENITIES", "STICKED_SALES_BANNER", "GEO_ZONES_TITLE", "REPAIR_CALCULATOR", "TRANSPORT_INFO", "TRANSPORTATION_GEO", "ITEM_ANCHOR_TRUST_FACTORS", "TIRES_BANNER", "PROMO_MECHANICS", "ITEM_DELIVERY_SUGGESTS", "PARKING", "ITEM_EQUIPMENT_TILE", "IMV_CARS_V4", "ITEM_POPULARITY_INFO", "ITEM_FMP_BANNER", "ITEM_FMP_OFFER", "ITEM_FMP_CALCULATOR", "ITEM_FMP_PRODUCTS", "SERVICES_WORK_TIME", "ITEM_DELIVERY_TRUST_FACTORS", "ADDRESS_TITLE", "ICEBREAKERS_REDESIGN", "BUYER_TRUST_BANNER", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AdvertDetailsBlockId {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AdvertDetailsBlockId[] $VALUES;

    @c(AdvertDetailsBlockIdKt.GALLERY_BLOCK)
    public static final AdvertDetailsBlockId GALLERY = new AdvertDetailsBlockId("GALLERY", 0);

    @c("beduinItems")
    public static final AdvertDetailsBlockId BEDUIN = new AdvertDetailsBlockId("BEDUIN", 1);

    @c("rfp")
    public static final AdvertDetailsBlockId RFP = new AdvertDetailsBlockId("RFP", 2);

    @c("avitoForBusiness")
    public static final AdvertDetailsBlockId AVITO_FOR_BUSINESS = new AdvertDetailsBlockId("AVITO_FOR_BUSINESS", 3);

    @c("header")
    public static final AdvertDetailsBlockId HEADER = new AdvertDetailsBlockId("HEADER", 4);

    @c("creditTeaser")
    public static final AdvertDetailsBlockId CREDIT_BROKER_LINK = new AdvertDetailsBlockId("CREDIT_BROKER_LINK", 5);

    @c(AdvertDetailsBlockIdKt.BLOCK_ID_CREDIT_CALCULATOR)
    public static final AdvertDetailsBlockId CREDIT_CALCULATOR = new AdvertDetailsBlockId("CREDIT_CALCULATOR", 6);

    @c("buzzoolaCreditBanner")
    public static final AdvertDetailsBlockId BUZZOOLA_CREDIT_BANNER = new AdvertDetailsBlockId("BUZZOOLA_CREDIT_BANNER", 7);

    @c("abuse")
    public static final AdvertDetailsBlockId ABUSE = new AdvertDetailsBlockId("ABUSE", 8);

    @c("rating")
    public static final AdvertDetailsBlockId RATING = new AdvertDetailsBlockId("RATING", 9);

    @c("multiItemParams")
    public static final AdvertDetailsBlockId MULTI_ITEM_PARAMS = new AdvertDetailsBlockId("MULTI_ITEM_PARAMS", 10);

    @c("closingReason")
    public static final AdvertDetailsBlockId CLOSING_REASON = new AdvertDetailsBlockId("CLOSING_REASON", 11);

    @c("statistics")
    public static final AdvertDetailsBlockId STATISTICS = new AdvertDetailsBlockId("STATISTICS", 12);

    @c("avitoBlackTitleAndPrice")
    public static final AdvertDetailsBlockId AVITO_BLACK_TITLE_AND_PRICE = new AdvertDetailsBlockId("AVITO_BLACK_TITLE_AND_PRICE", 13);

    @c("title")
    public static final AdvertDetailsBlockId TITLE = new AdvertDetailsBlockId("TITLE", 14);

    @c("price")
    public static final AdvertDetailsBlockId PRICE = new AdvertDetailsBlockId("PRICE", 15);

    @c("priceWithNormalizedPriceAndPriceHistory")
    public static final AdvertDetailsBlockId PRICE_WITH_NORMALIZED_PRICE_AND_PRICE_HISTORY = new AdvertDetailsBlockId("PRICE_WITH_NORMALIZED_PRICE_AND_PRICE_HISTORY", 16);

    @c("priceHistory")
    public static final AdvertDetailsBlockId PRICE_HISTORY = new AdvertDetailsBlockId("PRICE_HISTORY", 17);

    @c("servicesTitle")
    public static final AdvertDetailsBlockId SERVICES_TITLE = new AdvertDetailsBlockId("SERVICES_TITLE", 18);

    @c("servicesPrice")
    public static final AdvertDetailsBlockId SERVICES_PRICE = new AdvertDetailsBlockId("SERVICES_PRICE", 19);

    @c("iceBreakers")
    public static final AdvertDetailsBlockId ICE_BREAKERS = new AdvertDetailsBlockId("ICE_BREAKERS", 20);

    @c("chatHistory")
    public static final AdvertDetailsBlockId CHAT_HISTORY = new AdvertDetailsBlockId("CHAT_HISTORY", 21);

    @c("sellerInfo")
    public static final AdvertDetailsBlockId SELLER_INFO = new AdvertDetailsBlockId("SELLER_INFO", 22);

    @c(AdvertDetailsBlockIdKt.BLOCK_ID_CONTACT_BAR)
    public static final AdvertDetailsBlockId CONTACT_BAR = new AdvertDetailsBlockId("CONTACT_BAR", 23);

    @c("simpleContactBar")
    public static final AdvertDetailsBlockId SIMPLE_CONTACT_BAR = new AdvertDetailsBlockId("SIMPLE_CONTACT_BAR", 24);

    @c("geoReference")
    public static final AdvertDetailsBlockId GEO_REFERENCE = new AdvertDetailsBlockId("GEO_REFERENCE", 25);

    @c("geoMarketReport")
    public static final AdvertDetailsBlockId GEO_MARKET_REPORT = new AdvertDetailsBlockId("GEO_MARKET_REPORT", 26);

    @c(AddressParameter.TYPE)
    public static final AdvertDetailsBlockId ADDRESS = new AdvertDetailsBlockId("ADDRESS", 27);

    @c("showOnMap")
    public static final AdvertDetailsBlockId SHOW_ON_MAP = new AdvertDetailsBlockId("SHOW_ON_MAP", 28);

    @c("addressGeoDistance")
    public static final AdvertDetailsBlockId ADDRESS_GEO_DISTANCE = new AdvertDetailsBlockId("ADDRESS_GEO_DISTANCE", 29);

    @c("brandingGallery")
    public static final AdvertDetailsBlockId BRANDING_GALLERY = new AdvertDetailsBlockId("BRANDING_GALLERY", 30);

    @c("brandingAdvantages")
    public static final AdvertDetailsBlockId BRANDING_ADVANTAGES = new AdvertDetailsBlockId("BRANDING_ADVANTAGES", 31);

    @c("goodsSafeDealButtons")
    public static final AdvertDetailsBlockId SAFE_DEAL = new AdvertDetailsBlockId("SAFE_DEAL", 32);

    @c("goodsSafeDealPaymentBlock")
    public static final AdvertDetailsBlockId SAFE_DEAL_PAYMENT_BLOCK = new AdvertDetailsBlockId("SAFE_DEAL_PAYMENT_BLOCK", 33);

    @c("comfortableDealInfo")
    public static final AdvertDetailsBlockId COMFORTABLE_DEAL_INFO = new AdvertDetailsBlockId("COMFORTABLE_DEAL_INFO", 34);

    @c("b2c")
    public static final AdvertDetailsBlockId B2C = new AdvertDetailsBlockId("B2C", 35);

    @c("goodsReservationInfo")
    public static final AdvertDetailsBlockId RESERVATION_INFO = new AdvertDetailsBlockId("RESERVATION_INFO", 36);

    @c("dockingBadgeBar")
    public static final AdvertDetailsBlockId DOCKING_BADGE_BAR = new AdvertDetailsBlockId("DOCKING_BADGE_BAR", 37);

    @c("badgeBarLight")
    public static final AdvertDetailsBlockId BADGE_BAR_LIGHT = new AdvertDetailsBlockId("BADGE_BAR_LIGHT", 38);

    @c(AdvertDetailsBlockIdKt.COMPLEMENTARY_ITEMS_BLOCK)
    public static final AdvertDetailsBlockId COMPLEMENTARY_ITEMS = new AdvertDetailsBlockId("COMPLEMENTARY_ITEMS", 39);

    @c("tabbedAdvertisementDetails")
    public static final AdvertDetailsBlockId TABBED_DETAILS = new AdvertDetailsBlockId("TABBED_DETAILS", 40);

    @c("description")
    public static final AdvertDetailsBlockId DESCRIPTION = new AdvertDetailsBlockId("DESCRIPTION", 41);

    @c("domotekaReportTeaser")
    public static final AdvertDetailsBlockId DOMOTEKA_REPORT_TEASER = new AdvertDetailsBlockId("DOMOTEKA_REPORT_TEASER", 42);

    @c("otherCategories")
    public static final AdvertDetailsBlockId OTHER_CATEGORIES = new AdvertDetailsBlockId("OTHER_CATEGORIES", 43);

    @c("goodsSafeDealInfo")
    public static final AdvertDetailsBlockId SAFE_DEAL_INFO = new AdvertDetailsBlockId("SAFE_DEAL_INFO", 44);

    @c("autoRecallMe")
    public static final AdvertDetailsBlockId AUTO_RECALL_ME = new AdvertDetailsBlockId("AUTO_RECALL_ME", 45);

    @c("searchSuggests")
    public static final AdvertDetailsBlockId SEARCH_SUGGESTS = new AdvertDetailsBlockId("SEARCH_SUGGESTS", 46);

    @c("autotekaTeaser")
    public static final AdvertDetailsBlockId AUTOTEKA_TEASER = new AdvertDetailsBlockId("AUTOTEKA_TEASER", 47);

    @c("garageCompatibilityV2")
    public static final AdvertDetailsBlockId GARAGE_COMPATIBILITY_V2 = new AdvertDetailsBlockId("GARAGE_COMPATIBILITY_V2", 48);

    @c("compatibilitiesV3")
    public static final AdvertDetailsBlockId GARAGE_COMPATIBILITY_V3 = new AdvertDetailsBlockId("GARAGE_COMPATIBILITY_V3", 49);

    @c("compatibilitiesV4")
    public static final AdvertDetailsBlockId GARAGE_COMPATIBILITY_V4 = new AdvertDetailsBlockId("GARAGE_COMPATIBILITY_V4", 50);

    @c(AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS)
    public static final AdvertDetailsBlockId PARAMETERS = new AdvertDetailsBlockId("PARAMETERS", 51);

    @c("aboutDeveloper")
    public static final AdvertDetailsBlockId ABOUT_DEVELOPER = new AdvertDetailsBlockId("ABOUT_DEVELOPER", 52);

    @c("aboutHouse")
    public static final AdvertDetailsBlockId ABOUT_HOUSE = new AdvertDetailsBlockId("ABOUT_HOUSE", 53);

    @c("developmentOffers")
    public static final AdvertDetailsBlockId DEVELOPMENT_OFFERS = new AdvertDetailsBlockId("DEVELOPMENT_OFFERS", 54);

    @c("consultation")
    public static final AdvertDetailsBlockId CONSULTATION = new AdvertDetailsBlockId("CONSULTATION", 55);

    @c("consultationSuperForm")
    public static final AdvertDetailsBlockId CONSULTATION_SUPER_FORM = new AdvertDetailsBlockId("CONSULTATION_SUPER_FORM", 56);

    @c("consultationQuiz")
    public static final AdvertDetailsBlockId CONSULTATION_QUIZ = new AdvertDetailsBlockId("CONSULTATION_QUIZ", 57);

    @c("realtorBonus")
    public static final AdvertDetailsBlockId REALTOR_BONUS = new AdvertDetailsBlockId("REALTOR_BONUS", 58);

    @c("realtyImv")
    public static final AdvertDetailsBlockId REALTY_IMV = new AdvertDetailsBlockId("REALTY_IMV", 59);

    @c("realtyUsp")
    public static final AdvertDetailsBlockId REALTY_USP = new AdvertDetailsBlockId("REALTY_USP", 60);

    @c("ppRecall")
    public static final AdvertDetailsBlockId PRIVATE_PARTNER_RECALL = new AdvertDetailsBlockId("PRIVATE_PARTNER_RECALL", 61);

    @c("comfortableDealPromo")
    public static final AdvertDetailsBlockId COMFORTABLE_DEAL_PROMO = new AdvertDetailsBlockId("COMFORTABLE_DEAL_PROMO", 62);

    @c("rentConditions")
    public static final AdvertDetailsBlockId RENT_CONDITIONS = new AdvertDetailsBlockId("RENT_CONDITIONS", 63);

    @c("rentAgreement")
    public static final AdvertDetailsBlockId RENT_AGREEMENT = new AdvertDetailsBlockId("RENT_AGREEMENT", 64);

    @c("checkInRules")
    public static final AdvertDetailsBlockId CHECK_IN_RULES = new AdvertDetailsBlockId("CHECK_IN_RULES", 65);

    @c("secondaryConsultation")
    public static final AdvertDetailsBlockId SECONDARY_CONSULTATION = new AdvertDetailsBlockId("SECONDARY_CONSULTATION", 66);

    @c("dynamicConsultation")
    public static final AdvertDetailsBlockId DYNAMIC_CONSULTATION = new AdvertDetailsBlockId("DYNAMIC_CONSULTATION", 67);

    @c("shortTermRent")
    public static final AdvertDetailsBlockId SHORT_TERM_RENT = new AdvertDetailsBlockId("SHORT_TERM_RENT", 68);

    @c("travelTrustItem")
    public static final AdvertDetailsBlockId TRAVEL_TRUST_ITEM = new AdvertDetailsBlockId("TRAVEL_TRUST_ITEM", 69);

    @c("note")
    public static final AdvertDetailsBlockId NOTE = new AdvertDetailsBlockId("NOTE", 70);

    @c(ServiceTransportationWidget.DisclaimerField.TYPE)
    public static final AdvertDetailsBlockId DISCLAIMER = new AdvertDetailsBlockId("DISCLAIMER", 71);

    @c("campaigns")
    public static final AdvertDetailsBlockId CAMPAIGNS = new AdvertDetailsBlockId("CAMPAIGNS", 72);

    @c(AdvertDetailsBlockIdKt.COMMERCIALS_BANNER_BLOCK)
    public static final AdvertDetailsBlockId COMMERCIALS_BANNER = new AdvertDetailsBlockId("COMMERCIALS_BANNER", 73);

    @c(AdvertDetailsBlockIdKt.COMMERCIALS_PROFILE_PROMO_GALLERY_BLOCK)
    public static final AdvertDetailsBlockId COMMERCIALS_PROFILE_PROMO_GALLERY = new AdvertDetailsBlockId("COMMERCIALS_PROFILE_PROMO_GALLERY", 74);

    @c("early_access_advert")
    public static final AdvertDetailsBlockId EARLY_ACCESS_ADVERT = new AdvertDetailsBlockId("EARLY_ACCESS_ADVERT", 75);

    @c("marketplaceStocks")
    public static final AdvertDetailsBlockId MARKETPLACE_STOCKS = new AdvertDetailsBlockId("MARKETPLACE_STOCKS", 76);

    @c(AdvertDetailsBlockIdKt.BLOCK_ID_BADGE_BAR)
    public static final AdvertDetailsBlockId BADGE_BAR = new AdvertDetailsBlockId("BADGE_BAR", 77);

    @c("videoCallRequest")
    public static final AdvertDetailsBlockId VIDEO_CALL_REQUEST = new AdvertDetailsBlockId("VIDEO_CALL_REQUEST", 78);

    @c("modelSpecsLink")
    public static final AdvertDetailsBlockId MODEL_SPECS_LINK = new AdvertDetailsBlockId("MODEL_SPECS_LINK", 79);

    @c("marketplaceSalesBanner")
    public static final AdvertDetailsBlockId MARKETPLACE_SALES_BANNER = new AdvertDetailsBlockId("MARKETPLACE_SALES_BANNER", 80);

    @c("marketplaceSalesBannerWithFlexibleImage")
    public static final AdvertDetailsBlockId MARKETPLACE_SALES_BANNER_WITH_FLEXIBLE_IMAGE = new AdvertDetailsBlockId("MARKETPLACE_SALES_BANNER_WITH_FLEXIBLE_IMAGE", 81);

    @c("marketplaceSalesAdvertPromoBanner")
    public static final AdvertDetailsBlockId MARKETPLACE_SALES_ADVERT_PROMO_BANNER = new AdvertDetailsBlockId("MARKETPLACE_SALES_ADVERT_PROMO_BANNER", 82);

    @c("marketplaceRewardsBanner")
    public static final AdvertDetailsBlockId MARKETPLACE_REWARDS_BANNER = new AdvertDetailsBlockId("MARKETPLACE_REWARDS_BANNER", 83);

    @c("hotelCheckinRules")
    public static final AdvertDetailsBlockId HOTEL_CHECKIN_RULES = new AdvertDetailsBlockId("HOTEL_CHECKIN_RULES", 84);

    @c("hotelGuestInfo")
    public static final AdvertDetailsBlockId HOTEL_GUEST_INFO = new AdvertDetailsBlockId("HOTEL_GUEST_INFO", 85);

    @c("hotelOffer")
    public static final AdvertDetailsBlockId HOTEL_OFFER = new AdvertDetailsBlockId("HOTEL_OFFER", 86);

    @c("hotelPromoWidget")
    public static final AdvertDetailsBlockId HOTEL_PROMO_WIDGET = new AdvertDetailsBlockId("HOTEL_PROMO_WIDGET", 87);

    @c("hotelRating")
    public static final AdvertDetailsBlockId HOTEL_RATING = new AdvertDetailsBlockId("HOTEL_RATING", 88);

    @c("hotelShowOnMap")
    public static final AdvertDetailsBlockId HOTEL_SHOW_ON_MAP = new AdvertDetailsBlockId("HOTEL_SHOW_ON_MAP", 89);

    @c("reviews")
    public static final AdvertDetailsBlockId REVIEWS = new AdvertDetailsBlockId("REVIEWS", 90);

    @c("amenities")
    public static final AdvertDetailsBlockId AMENITIES = new AdvertDetailsBlockId("AMENITIES", 91);

    @c("stickedSalesBanner")
    public static final AdvertDetailsBlockId STICKED_SALES_BANNER = new AdvertDetailsBlockId("STICKED_SALES_BANNER", 92);

    @c("geoZonesTitle")
    public static final AdvertDetailsBlockId GEO_ZONES_TITLE = new AdvertDetailsBlockId("GEO_ZONES_TITLE", 93);

    @c("repairCalculator")
    public static final AdvertDetailsBlockId REPAIR_CALCULATOR = new AdvertDetailsBlockId("REPAIR_CALCULATOR", 94);

    @c("transportInfo")
    public static final AdvertDetailsBlockId TRANSPORT_INFO = new AdvertDetailsBlockId("TRANSPORT_INFO", 95);

    @c("transportationGeo")
    public static final AdvertDetailsBlockId TRANSPORTATION_GEO = new AdvertDetailsBlockId("TRANSPORTATION_GEO", 96);

    @c(AdvertDetailsBlockIdKt.BLOCK_ID_ITEM_ANCHOR_TRUST_FACTORS)
    public static final AdvertDetailsBlockId ITEM_ANCHOR_TRUST_FACTORS = new AdvertDetailsBlockId("ITEM_ANCHOR_TRUST_FACTORS", 97);

    @c("tiresBanner")
    public static final AdvertDetailsBlockId TIRES_BANNER = new AdvertDetailsBlockId("TIRES_BANNER", 98);

    @c("promoMechanics")
    public static final AdvertDetailsBlockId PROMO_MECHANICS = new AdvertDetailsBlockId("PROMO_MECHANICS", 99);

    @c(AdvertDetailsBlockIdKt.BLOCK_ID_ITEM_DELIVERY_SUGGESTS)
    public static final AdvertDetailsBlockId ITEM_DELIVERY_SUGGESTS = new AdvertDetailsBlockId("ITEM_DELIVERY_SUGGESTS", 100);

    @c("parking")
    public static final AdvertDetailsBlockId PARKING = new AdvertDetailsBlockId("PARKING", UpdateStatusCode.DialogButton.CONFIRM);

    @c("equipmentsTile")
    public static final AdvertDetailsBlockId ITEM_EQUIPMENT_TILE = new AdvertDetailsBlockId("ITEM_EQUIPMENT_TILE", 102);

    @c("imvCarsV4")
    public static final AdvertDetailsBlockId IMV_CARS_V4 = new AdvertDetailsBlockId("IMV_CARS_V4", 103);

    @c("itemPopularity")
    public static final AdvertDetailsBlockId ITEM_POPULARITY_INFO = new AdvertDetailsBlockId("ITEM_POPULARITY_INFO", 104);

    @c(AdFormat.BANNER)
    public static final AdvertDetailsBlockId ITEM_FMP_BANNER = new AdvertDetailsBlockId("ITEM_FMP_BANNER", 105);

    @c("offer")
    public static final AdvertDetailsBlockId ITEM_FMP_OFFER = new AdvertDetailsBlockId("ITEM_FMP_OFFER", 106);

    @c("calculator")
    public static final AdvertDetailsBlockId ITEM_FMP_CALCULATOR = new AdvertDetailsBlockId("ITEM_FMP_CALCULATOR", 107);

    @c("products")
    public static final AdvertDetailsBlockId ITEM_FMP_PRODUCTS = new AdvertDetailsBlockId("ITEM_FMP_PRODUCTS", 108);

    @c("servicesWorkHours")
    public static final AdvertDetailsBlockId SERVICES_WORK_TIME = new AdvertDetailsBlockId("SERVICES_WORK_TIME", 109);

    @c("deliveryTrustFactors")
    public static final AdvertDetailsBlockId ITEM_DELIVERY_TRUST_FACTORS = new AdvertDetailsBlockId("ITEM_DELIVERY_TRUST_FACTORS", 110);

    @c("addressTitle")
    public static final AdvertDetailsBlockId ADDRESS_TITLE = new AdvertDetailsBlockId("ADDRESS_TITLE", 111);

    @c("icebreakersRedesign")
    public static final AdvertDetailsBlockId ICEBREAKERS_REDESIGN = new AdvertDetailsBlockId("ICEBREAKERS_REDESIGN", 112);

    @c("buyerTrustBanner")
    public static final AdvertDetailsBlockId BUYER_TRUST_BANNER = new AdvertDetailsBlockId("BUYER_TRUST_BANNER", 113);

    private static final /* synthetic */ AdvertDetailsBlockId[] $values() {
        return new AdvertDetailsBlockId[]{GALLERY, BEDUIN, RFP, AVITO_FOR_BUSINESS, HEADER, CREDIT_BROKER_LINK, CREDIT_CALCULATOR, BUZZOOLA_CREDIT_BANNER, ABUSE, RATING, MULTI_ITEM_PARAMS, CLOSING_REASON, STATISTICS, AVITO_BLACK_TITLE_AND_PRICE, TITLE, PRICE, PRICE_WITH_NORMALIZED_PRICE_AND_PRICE_HISTORY, PRICE_HISTORY, SERVICES_TITLE, SERVICES_PRICE, ICE_BREAKERS, CHAT_HISTORY, SELLER_INFO, CONTACT_BAR, SIMPLE_CONTACT_BAR, GEO_REFERENCE, GEO_MARKET_REPORT, ADDRESS, SHOW_ON_MAP, ADDRESS_GEO_DISTANCE, BRANDING_GALLERY, BRANDING_ADVANTAGES, SAFE_DEAL, SAFE_DEAL_PAYMENT_BLOCK, COMFORTABLE_DEAL_INFO, B2C, RESERVATION_INFO, DOCKING_BADGE_BAR, BADGE_BAR_LIGHT, COMPLEMENTARY_ITEMS, TABBED_DETAILS, DESCRIPTION, DOMOTEKA_REPORT_TEASER, OTHER_CATEGORIES, SAFE_DEAL_INFO, AUTO_RECALL_ME, SEARCH_SUGGESTS, AUTOTEKA_TEASER, GARAGE_COMPATIBILITY_V2, GARAGE_COMPATIBILITY_V3, GARAGE_COMPATIBILITY_V4, PARAMETERS, ABOUT_DEVELOPER, ABOUT_HOUSE, DEVELOPMENT_OFFERS, CONSULTATION, CONSULTATION_SUPER_FORM, CONSULTATION_QUIZ, REALTOR_BONUS, REALTY_IMV, REALTY_USP, PRIVATE_PARTNER_RECALL, COMFORTABLE_DEAL_PROMO, RENT_CONDITIONS, RENT_AGREEMENT, CHECK_IN_RULES, SECONDARY_CONSULTATION, DYNAMIC_CONSULTATION, SHORT_TERM_RENT, TRAVEL_TRUST_ITEM, NOTE, DISCLAIMER, CAMPAIGNS, COMMERCIALS_BANNER, COMMERCIALS_PROFILE_PROMO_GALLERY, EARLY_ACCESS_ADVERT, MARKETPLACE_STOCKS, BADGE_BAR, VIDEO_CALL_REQUEST, MODEL_SPECS_LINK, MARKETPLACE_SALES_BANNER, MARKETPLACE_SALES_BANNER_WITH_FLEXIBLE_IMAGE, MARKETPLACE_SALES_ADVERT_PROMO_BANNER, MARKETPLACE_REWARDS_BANNER, HOTEL_CHECKIN_RULES, HOTEL_GUEST_INFO, HOTEL_OFFER, HOTEL_PROMO_WIDGET, HOTEL_RATING, HOTEL_SHOW_ON_MAP, REVIEWS, AMENITIES, STICKED_SALES_BANNER, GEO_ZONES_TITLE, REPAIR_CALCULATOR, TRANSPORT_INFO, TRANSPORTATION_GEO, ITEM_ANCHOR_TRUST_FACTORS, TIRES_BANNER, PROMO_MECHANICS, ITEM_DELIVERY_SUGGESTS, PARKING, ITEM_EQUIPMENT_TILE, IMV_CARS_V4, ITEM_POPULARITY_INFO, ITEM_FMP_BANNER, ITEM_FMP_OFFER, ITEM_FMP_CALCULATOR, ITEM_FMP_PRODUCTS, SERVICES_WORK_TIME, ITEM_DELIVERY_TRUST_FACTORS, ADDRESS_TITLE, ICEBREAKERS_REDESIGN, BUYER_TRUST_BANNER};
    }

    static {
        AdvertDetailsBlockId[] advertDetailsBlockIdArr$values = $values();
        $VALUES = advertDetailsBlockIdArr$values;
        $ENTRIES = kotlin.enums.c.a(advertDetailsBlockIdArr$values);
    }

    private AdvertDetailsBlockId(String str, int i12) {
    }

    @k
    public static a<AdvertDetailsBlockId> getEntries() {
        return $ENTRIES;
    }

    public static AdvertDetailsBlockId valueOf(String str) {
        return (AdvertDetailsBlockId) Enum.valueOf(AdvertDetailsBlockId.class, str);
    }

    public static AdvertDetailsBlockId[] values() {
        return (AdvertDetailsBlockId[]) $VALUES.clone();
    }
}
