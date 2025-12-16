package com.avito.android.remote.model.category_parameters.slot;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.category_parameters.EditCategoryParameter;
import com.avito.android.remote.model.category_parameters.slot.accordion.AccordionSlot;
import com.avito.android.remote.model.category_parameters.slot.advantage_banners.AdvantageBannersSlot;
import com.avito.android.remote.model.category_parameters.slot.age_range.AgeRangeSlot;
import com.avito.android.remote.model.category_parameters.slot.anonymous_number.AnonymousNumberSlot;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.additional_options.GroupAdditionalOptionsSlot;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.car_body_condition.GroupBodyConditionBlockSlot;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.contact.GroupContactSlot;
import com.avito.android.remote.model.category_parameters.slot.auto_publish.AutoPublishSlot;
import com.avito.android.remote.model.category_parameters.slot.car_body_condition.CarBodyConditionSlot;
import com.avito.android.remote.model.category_parameters.slot.car_info_short.CarInfoShortSlot;
import com.avito.android.remote.model.category_parameters.slot.card_select.CardSelectSlot;
import com.avito.android.remote.model.category_parameters.slot.check_verification_slot.CheckVerificationSlot;
import com.avito.android.remote.model.category_parameters.slot.contact_info.ContactInfoSlot;
import com.avito.android.remote.model.category_parameters.slot.contact_method.ContactMethodSlot;
import com.avito.android.remote.model.category_parameters.slot.cpa_reassignment.CpaReassignmentSlot;
import com.avito.android.remote.model.category_parameters.slot.cpa_tariff.CpaTariffSlot;
import com.avito.android.remote.model.category_parameters.slot.cpt_unswitchable_delivery.CptUnswitchableDeliverySlot;
import com.avito.android.remote.model.category_parameters.slot.cv_upload.CvUploadSlot;
import com.avito.android.remote.model.category_parameters.slot.delivery_addresses.DeliveryAddressesSlot;
import com.avito.android.remote.model.category_parameters.slot.delivery_all_toggles.DeliveryAllTogglesSlot;
import com.avito.android.remote.model.category_parameters.slot.delivery_cnc.DeliveryCncTogglesSlot;
import com.avito.android.remote.model.category_parameters.slot.delivery_dbs_toggles.DeliveryDbsTogglesSlot;
import com.avito.android.remote.model.category_parameters.slot.delivery_return_policy.DeliveryReturnPolicySlot;
import com.avito.android.remote.model.category_parameters.slot.delivery_return_policy_block.DeliveryReturnPolicyBlockSlot;
import com.avito.android.remote.model.category_parameters.slot.delivery_seller.DeliverySellerSlot;
import com.avito.android.remote.model.category_parameters.slot.delivery_subsidies.DeliverySubsidiesSlot;
import com.avito.android.remote.model.category_parameters.slot.delivery_summary.DeliverySummarySlot;
import com.avito.android.remote.model.category_parameters.slot.delivery_summary_edit.DeliverySummaryEditSlot;
import com.avito.android.remote.model.category_parameters.slot.delivery_toggles.DeliveryTogglesSlot;
import com.avito.android.remote.model.category_parameters.slot.edit_category.EditCategorySlot;
import com.avito.android.remote.model.category_parameters.slot.final_state_suggest.FinalStateSuggestSlot;
import com.avito.android.remote.model.category_parameters.slot.generate_text_buttons.GenerateTextButtonsSlot;
import com.avito.android.remote.model.category_parameters.slot.group_inlined_block_slot.GroupInlinedBlockSlot;
import com.avito.android.remote.model.category_parameters.slot.header.SectionSeparatorSlot;
import com.avito.android.remote.model.category_parameters.slot.iac_devices.IacDevicesSlot;
import com.avito.android.remote.model.category_parameters.slot.image.ImageSlot;
import com.avito.android.remote.model.category_parameters.slot.image_perception.ImagePerceptionSlot;
import com.avito.android.remote.model.category_parameters.slot.images_enhancement.ImagesEnhancementSlot;
import com.avito.android.remote.model.category_parameters.slot.images_groups.ImagesGroupsSlot;
import com.avito.android.remote.model.category_parameters.slot.images_groups_recommendations.ImagesGroupsRecommendationsSlot;
import com.avito.android.remote.model.category_parameters.slot.imv.InstantMarketValueSlot;
import com.avito.android.remote.model.category_parameters.slot.information.InformationSlot;
import com.avito.android.remote.model.category_parameters.slot.information.InformationWithUserIdSlot;
import com.avito.android.remote.model.category_parameters.slot.item_info.ItemInfoSlot;
import com.avito.android.remote.model.category_parameters.slot.job_premoderation.JobPremoderationSlot;
import com.avito.android.remote.model.category_parameters.slot.job_warning_toast.JobToastSlot;
import com.avito.android.remote.model.category_parameters.slot.link.LinkSlot;
import com.avito.android.remote.model.category_parameters.slot.market_price.MarketPriceSlot;
import com.avito.android.remote.model.category_parameters.slot.network_stores_fake_door.NetworkStoresFakeDoorSlot;
import com.avito.android.remote.model.category_parameters.slot.no_car.NoCarSlot;
import com.avito.android.remote.model.category_parameters.slot.notification_banner.FashionAuthenticationCheckBannerSlot;
import com.avito.android.remote.model.category_parameters.slot.parameters_suggest.ParametersSuggestByAddressSlot;
import com.avito.android.remote.model.category_parameters.slot.profile_info.ProfileInfoSlot;
import com.avito.android.remote.model.category_parameters.slot.promoblock.PromoblockSlot;
import com.avito.android.remote.model.category_parameters.slot.regnum_suggest.RegnumSuggestSlot;
import com.avito.android.remote.model.category_parameters.slot.residential_complex.ResidentialComplexSlot;
import com.avito.android.remote.model.category_parameters.slot.salary_range.SalaryRangeSlot;
import com.avito.android.remote.model.category_parameters.slot.select_address_in_list.AddressesFromProfileSlot;
import com.avito.android.remote.model.category_parameters.slot.sleeping_places.SleepingPlacesSlot;
import com.avito.android.remote.model.category_parameters.slot.stockManagement.StockManagementSlot;
import com.avito.android.remote.model.category_parameters.slot.text_suggests.TextSuggestionsSlot;
import com.avito.android.remote.model.category_parameters.slot.universal_beduin.UniversalBeduinSlot;
import com.avito.android.remote.model.category_parameters.slot.universal_beduin_v2.UniversalBeduinV2Slot;
import com.avito.android.remote.model.category_parameters.slot.user_verification.UserVerificationSlot;
import com.avito.android.remote.model.category_parameters.slot.verification.VerificationSlot;
import com.avito.android.remote.model.category_parameters.slot.vin_cropped_image.VinCroppedImageSlot;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.enums.a;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SlotType.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\bN\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u001d\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001b\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQ¨\u0006R"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/SlotType;", "", "", "strValue", "Lkotlin/reflect/d;", "slotClass", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lkotlin/reflect/d;)V", "Ljava/lang/String;", "getStrValue", "()Ljava/lang/String;", "Lkotlin/reflect/d;", "getSlotClass", "()Lkotlin/reflect/d;", "Companion", "OTHER", "PROFILE_INFO", "CONTACT_INFO", "TEXT_SUGGESTIONS", "NO_CAR", "MARKET_PRICE", "ANONYMOUS_NUMBER", "CONTACT_METHOD", "IAC_DEVICES", "EDIT_CATEGORY", "AUTO_PUBLISH", "INSTANT_MARKET_VALUE", "RESIDENTIAL_COMPLEX", "INFORMATION", "IMAGE", "IMAGES_GROUPS", "IMAGES_GROUPS_RECOMMENDATIONS", "SECTION_SEPARATOR", "LINK", "PROMOBLOCK", "ACCORDION", "INFORMATION_WITH_USER_ID", "PARAMETERS_SUGGEST_BY_ADDRESS", "CPA_TARIFF_NOTIFICATION", "CPA_REASSIGNMENT", "SALARY_RANGE", "AGE_RANGE", "DELIVERY_SELLER", "DELIVERY_TOGGLES", "DELIVERY_DBS_TOGGLES", "DELIVERY_CNC_TOGGLES", "DELIVERY_ALL_TOGGLES", "DELIVERY_SUBSIDIES", "DELIVERY_RETURN_POLICY", "DELIVERY_RETURN_POLICY_BLOCK", "DELIVERY_SUMMARY", "DELIVERY_SUMMARY_EDIT", "CPT_UNSWITCHABLE_DELIVERY", "CAR_BODY_CONDITION", "REGNUM_SUGGEST", "GROUP_BODY_CONDITION", "GROUP_CONTACT", "GROUP_ADDITIONAL_OPTIONS", "GROUP_INLINED_BLOCK", "JOB_PREMODERATION", "JOB_TOAST", "FASHION_AUTHENTICATION_CHECK_BANNER", "CARD_SELECT", "STOCK_MANAGEMENT", "VERIFICATION", "USER_VERIFICATION", "ADVANTAGE_BANNERS", "VIN_CROPPED_IMAGE", "CAR_INFO_SHORT", "ITEM_INFO", "FINAL_STATE_SUGGEST", "UNIVERSAL_BEDUIN", "UNIVERSAL_BEDUIN_V2", "CV_UPLOAD", "SLEEPING_PLACES", "CHECK_VERIFICATION", "DELIVERY_ADDRESSES", "GENERATE_TEXT_BUTTONS", "IMAGES_ENHANCEMENT", "IMAGE_PERCEPTION", "ADDRESSES_FROM_PROFILE", "NETWORK_STORES_FAKE_DOOR_SLOT", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SlotType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SlotType[] $VALUES;
    public static final SlotType ACCORDION;
    public static final SlotType ADDRESSES_FROM_PROFILE;
    public static final SlotType ADVANTAGE_BANNERS;
    public static final SlotType AGE_RANGE;
    public static final SlotType ANONYMOUS_NUMBER;
    public static final SlotType AUTO_PUBLISH;
    public static final SlotType CARD_SELECT;
    public static final SlotType CAR_BODY_CONDITION;
    public static final SlotType CAR_INFO_SHORT;
    public static final SlotType CHECK_VERIFICATION;
    public static final SlotType CONTACT_INFO;
    public static final SlotType CONTACT_METHOD;
    public static final SlotType CPA_REASSIGNMENT;
    public static final SlotType CPA_TARIFF_NOTIFICATION;
    public static final SlotType CPT_UNSWITCHABLE_DELIVERY;
    public static final SlotType CV_UPLOAD;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE;
    public static final SlotType DELIVERY_ADDRESSES;
    public static final SlotType DELIVERY_ALL_TOGGLES;
    public static final SlotType DELIVERY_CNC_TOGGLES;
    public static final SlotType DELIVERY_DBS_TOGGLES;
    public static final SlotType DELIVERY_RETURN_POLICY;
    public static final SlotType DELIVERY_RETURN_POLICY_BLOCK;
    public static final SlotType DELIVERY_SELLER;
    public static final SlotType DELIVERY_SUBSIDIES;
    public static final SlotType DELIVERY_SUMMARY;
    public static final SlotType DELIVERY_SUMMARY_EDIT;
    public static final SlotType DELIVERY_TOGGLES;
    public static final SlotType EDIT_CATEGORY;
    public static final SlotType FASHION_AUTHENTICATION_CHECK_BANNER;
    public static final SlotType FINAL_STATE_SUGGEST;
    public static final SlotType GENERATE_TEXT_BUTTONS;
    public static final SlotType GROUP_ADDITIONAL_OPTIONS;
    public static final SlotType GROUP_BODY_CONDITION;
    public static final SlotType GROUP_CONTACT;
    public static final SlotType GROUP_INLINED_BLOCK;
    public static final SlotType IAC_DEVICES;
    public static final SlotType IMAGE;
    public static final SlotType IMAGES_ENHANCEMENT;
    public static final SlotType IMAGES_GROUPS;
    public static final SlotType IMAGES_GROUPS_RECOMMENDATIONS;
    public static final SlotType IMAGE_PERCEPTION;
    public static final SlotType INFORMATION;
    public static final SlotType INFORMATION_WITH_USER_ID;
    public static final SlotType INSTANT_MARKET_VALUE;
    public static final SlotType ITEM_INFO;
    public static final SlotType JOB_PREMODERATION;
    public static final SlotType JOB_TOAST;
    public static final SlotType LINK;
    public static final SlotType MARKET_PRICE;
    public static final SlotType NETWORK_STORES_FAKE_DOOR_SLOT;
    public static final SlotType NO_CAR;
    public static final SlotType OTHER;
    public static final SlotType PARAMETERS_SUGGEST_BY_ADDRESS;
    public static final SlotType PROFILE_INFO;
    public static final SlotType PROMOBLOCK;
    public static final SlotType REGNUM_SUGGEST;
    public static final SlotType RESIDENTIAL_COMPLEX;
    public static final SlotType SALARY_RANGE;
    public static final SlotType SECTION_SEPARATOR;
    public static final SlotType SLEEPING_PLACES;
    public static final SlotType STOCK_MANAGEMENT;
    public static final SlotType TEXT_SUGGESTIONS;
    public static final SlotType UNIVERSAL_BEDUIN;
    public static final SlotType UNIVERSAL_BEDUIN_V2;
    public static final SlotType USER_VERIFICATION;
    public static final SlotType VERIFICATION;
    public static final SlotType VIN_CROPPED_IMAGE;

    @k
    private static final Map<String, SlotType> valuesMap;

    @k
    private final d<?> slotClass;

    @k
    private final String strValue;

    /* compiled from: SlotType.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0005R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/SlotType$Companion;", "", "()V", "valuesMap", "", "", "Lcom/avito/android/remote/model/category_parameters/slot/SlotType;", "valueOfStr", "strValue", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final SlotType valueOfStr(@l String strValue) {
            if (strValue == null) {
                return SlotType.OTHER;
            }
            SlotType slotType = (SlotType) SlotType.valuesMap.get(strValue);
            return slotType == null ? SlotType.OTHER : slotType;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ SlotType[] $values() {
        return new SlotType[]{OTHER, PROFILE_INFO, CONTACT_INFO, TEXT_SUGGESTIONS, NO_CAR, MARKET_PRICE, ANONYMOUS_NUMBER, CONTACT_METHOD, IAC_DEVICES, EDIT_CATEGORY, AUTO_PUBLISH, INSTANT_MARKET_VALUE, RESIDENTIAL_COMPLEX, INFORMATION, IMAGE, IMAGES_GROUPS, IMAGES_GROUPS_RECOMMENDATIONS, SECTION_SEPARATOR, LINK, PROMOBLOCK, ACCORDION, INFORMATION_WITH_USER_ID, PARAMETERS_SUGGEST_BY_ADDRESS, CPA_TARIFF_NOTIFICATION, CPA_REASSIGNMENT, SALARY_RANGE, AGE_RANGE, DELIVERY_SELLER, DELIVERY_TOGGLES, DELIVERY_DBS_TOGGLES, DELIVERY_CNC_TOGGLES, DELIVERY_ALL_TOGGLES, DELIVERY_SUBSIDIES, DELIVERY_RETURN_POLICY, DELIVERY_RETURN_POLICY_BLOCK, DELIVERY_SUMMARY, DELIVERY_SUMMARY_EDIT, CPT_UNSWITCHABLE_DELIVERY, CAR_BODY_CONDITION, REGNUM_SUGGEST, GROUP_BODY_CONDITION, GROUP_CONTACT, GROUP_ADDITIONAL_OPTIONS, GROUP_INLINED_BLOCK, JOB_PREMODERATION, JOB_TOAST, FASHION_AUTHENTICATION_CHECK_BANNER, CARD_SELECT, STOCK_MANAGEMENT, VERIFICATION, USER_VERIFICATION, ADVANTAGE_BANNERS, VIN_CROPPED_IMAGE, CAR_INFO_SHORT, ITEM_INFO, FINAL_STATE_SUGGEST, UNIVERSAL_BEDUIN, UNIVERSAL_BEDUIN_V2, CV_UPLOAD, SLEEPING_PLACES, CHECK_VERIFICATION, DELIVERY_ADDRESSES, GENERATE_TEXT_BUTTONS, IMAGES_ENHANCEMENT, IMAGE_PERCEPTION, ADDRESSES_FROM_PROFILE, NETWORK_STORES_FAKE_DOOR_SLOT};
    }

    static {
        n0 n0Var = m0.f406844a;
        OTHER = new SlotType("OTHER", 0, "", n0Var.b(Object.class));
        PROFILE_INFO = new SlotType("PROFILE_INFO", 1, "profileInfo", n0Var.b(ProfileInfoSlot.class));
        CONTACT_INFO = new SlotType("CONTACT_INFO", 2, "contactInfo", n0Var.b(ContactInfoSlot.class));
        TEXT_SUGGESTIONS = new SlotType("TEXT_SUGGESTIONS", 3, "textSuggestions", n0Var.b(TextSuggestionsSlot.class));
        NO_CAR = new SlotType("NO_CAR", 4, "noCar", n0Var.b(NoCarSlot.class));
        MARKET_PRICE = new SlotType("MARKET_PRICE", 5, "marketPrice", n0Var.b(MarketPriceSlot.class));
        ANONYMOUS_NUMBER = new SlotType("ANONYMOUS_NUMBER", 6, "anonymousNumber", n0Var.b(AnonymousNumberSlot.class));
        CONTACT_METHOD = new SlotType("CONTACT_METHOD", 7, "contactMethod", n0Var.b(ContactMethodSlot.class));
        IAC_DEVICES = new SlotType("IAC_DEVICES", 8, "inAppCallsDevices", n0Var.b(IacDevicesSlot.class));
        EDIT_CATEGORY = new SlotType("EDIT_CATEGORY", 9, EditCategoryParameter.TYPE, n0Var.b(EditCategorySlot.class));
        AUTO_PUBLISH = new SlotType("AUTO_PUBLISH", 10, "autoPublish", n0Var.b(AutoPublishSlot.class));
        INSTANT_MARKET_VALUE = new SlotType("INSTANT_MARKET_VALUE", 11, "instantMarketValue", n0Var.b(InstantMarketValueSlot.class));
        RESIDENTIAL_COMPLEX = new SlotType("RESIDENTIAL_COMPLEX", 12, "residentialComplex", n0Var.b(ResidentialComplexSlot.class));
        INFORMATION = new SlotType("INFORMATION", 13, "information", n0Var.b(InformationSlot.class));
        IMAGE = new SlotType("IMAGE", 14, "image", n0Var.b(ImageSlot.class));
        IMAGES_GROUPS = new SlotType("IMAGES_GROUPS", 15, ImagesGroupsSlot.f253817ID, n0Var.b(ImagesGroupsSlot.class));
        IMAGES_GROUPS_RECOMMENDATIONS = new SlotType("IMAGES_GROUPS_RECOMMENDATIONS", 16, ImagesGroupsRecommendationsSlot.f253818ID, n0Var.b(ImagesGroupsRecommendationsSlot.class));
        SECTION_SEPARATOR = new SlotType("SECTION_SEPARATOR", 17, "sectionSeparator", n0Var.b(SectionSeparatorSlot.class));
        LINK = new SlotType("LINK", 18, "link", n0Var.b(LinkSlot.class));
        PROMOBLOCK = new SlotType("PROMOBLOCK", 19, "promoblock", n0Var.b(PromoblockSlot.class));
        ACCORDION = new SlotType("ACCORDION", 20, "accordion", n0Var.b(AccordionSlot.class));
        INFORMATION_WITH_USER_ID = new SlotType("INFORMATION_WITH_USER_ID", 21, "UserIdentifierSlot", n0Var.b(InformationWithUserIdSlot.class));
        PARAMETERS_SUGGEST_BY_ADDRESS = new SlotType("PARAMETERS_SUGGEST_BY_ADDRESS", 22, "parametersSuggestByAddress", n0Var.b(ParametersSuggestByAddressSlot.class));
        CPA_TARIFF_NOTIFICATION = new SlotType("CPA_TARIFF_NOTIFICATION", 23, "cpaNotification", n0Var.b(CpaTariffSlot.class));
        CPA_REASSIGNMENT = new SlotType("CPA_REASSIGNMENT", 24, "cpaShareholder", n0Var.b(CpaReassignmentSlot.class));
        SALARY_RANGE = new SlotType("SALARY_RANGE", 25, "salary", n0Var.b(SalaryRangeSlot.class));
        AGE_RANGE = new SlotType("AGE_RANGE", 26, "ageRange", n0Var.b(AgeRangeSlot.class));
        DELIVERY_SELLER = new SlotType("DELIVERY_SELLER", 27, "deliverySeller", n0Var.b(DeliverySellerSlot.class));
        DELIVERY_TOGGLES = new SlotType("DELIVERY_TOGGLES", 28, "deliveryToggles", n0Var.b(DeliveryTogglesSlot.class));
        DELIVERY_DBS_TOGGLES = new SlotType("DELIVERY_DBS_TOGGLES", 29, "deliveryDbsToggles", n0Var.b(DeliveryDbsTogglesSlot.class));
        DELIVERY_CNC_TOGGLES = new SlotType("DELIVERY_CNC_TOGGLES", 30, "deliveryCncToggles", n0Var.b(DeliveryCncTogglesSlot.class));
        DELIVERY_ALL_TOGGLES = new SlotType("DELIVERY_ALL_TOGGLES", 31, "deliveryAllToggles", n0Var.b(DeliveryAllTogglesSlot.class));
        DELIVERY_SUBSIDIES = new SlotType("DELIVERY_SUBSIDIES", 32, "deliverySubsidies", n0Var.b(DeliverySubsidiesSlot.class));
        DELIVERY_RETURN_POLICY = new SlotType("DELIVERY_RETURN_POLICY", 33, "deliveryReturnPolicy", n0Var.b(DeliveryReturnPolicySlot.class));
        DELIVERY_RETURN_POLICY_BLOCK = new SlotType("DELIVERY_RETURN_POLICY_BLOCK", 34, "deliveryReturnPolicyBlock", n0Var.b(DeliveryReturnPolicyBlockSlot.class));
        DELIVERY_SUMMARY = new SlotType("DELIVERY_SUMMARY", 35, "deliverySummaryAdd", n0Var.b(DeliverySummarySlot.class));
        DELIVERY_SUMMARY_EDIT = new SlotType("DELIVERY_SUMMARY_EDIT", 36, "deliverySummaryEdit", n0Var.b(DeliverySummaryEditSlot.class));
        CPT_UNSWITCHABLE_DELIVERY = new SlotType("CPT_UNSWITCHABLE_DELIVERY", 37, "cptUnswitchableDelivery", n0Var.b(CptUnswitchableDeliverySlot.class));
        CAR_BODY_CONDITION = new SlotType("CAR_BODY_CONDITION", 38, "bodyCondition", n0Var.b(CarBodyConditionSlot.class));
        REGNUM_SUGGEST = new SlotType("REGNUM_SUGGEST", 39, "regNumByPhotoSlot", n0Var.b(RegnumSuggestSlot.class));
        GROUP_BODY_CONDITION = new SlotType("GROUP_BODY_CONDITION", 40, "groupBodyConditionBlock", n0Var.b(GroupBodyConditionBlockSlot.class));
        GROUP_CONTACT = new SlotType("GROUP_CONTACT", 41, "groupContactBlock", n0Var.b(GroupContactSlot.class));
        GROUP_ADDITIONAL_OPTIONS = new SlotType("GROUP_ADDITIONAL_OPTIONS", 42, "groupAdditionalOptionBlock", n0Var.b(GroupAdditionalOptionsSlot.class));
        GROUP_INLINED_BLOCK = new SlotType("GROUP_INLINED_BLOCK", 43, "groupInlinedBlock", n0Var.b(GroupInlinedBlockSlot.class));
        JOB_PREMODERATION = new SlotType("JOB_PREMODERATION", 44, "jobPremoderation", n0Var.b(JobPremoderationSlot.class));
        JOB_TOAST = new SlotType("JOB_TOAST", 45, "job_edit_moderation_toast", n0Var.b(JobToastSlot.class));
        FASHION_AUTHENTICATION_CHECK_BANNER = new SlotType("FASHION_AUTHENTICATION_CHECK_BANNER", 46, "fashionAuthenticationCheckBannerSlot", n0Var.b(FashionAuthenticationCheckBannerSlot.class));
        CARD_SELECT = new SlotType("CARD_SELECT", 47, ServiceTransportationWidget.CardSelectField.TYPE, n0Var.b(CardSelectSlot.class));
        STOCK_MANAGEMENT = new SlotType("STOCK_MANAGEMENT", 48, "stockManagement", n0Var.b(StockManagementSlot.class));
        VERIFICATION = new SlotType("VERIFICATION", 49, "verification", n0Var.b(VerificationSlot.class));
        USER_VERIFICATION = new SlotType("USER_VERIFICATION", 50, "userVerification", n0Var.b(UserVerificationSlot.class));
        ADVANTAGE_BANNERS = new SlotType("ADVANTAGE_BANNERS", 51, "advantageBanners", n0Var.b(AdvantageBannersSlot.class));
        VIN_CROPPED_IMAGE = new SlotType("VIN_CROPPED_IMAGE", 52, "vinCroppedImage", n0Var.b(VinCroppedImageSlot.class));
        CAR_INFO_SHORT = new SlotType("CAR_INFO_SHORT", 53, "carInfoShort", n0Var.b(CarInfoShortSlot.class));
        ITEM_INFO = new SlotType("ITEM_INFO", 54, "itemInfo", n0Var.b(ItemInfoSlot.class));
        FINAL_STATE_SUGGEST = new SlotType("FINAL_STATE_SUGGEST", 55, "finalStateSuggest", n0Var.b(FinalStateSuggestSlot.class));
        UNIVERSAL_BEDUIN = new SlotType("UNIVERSAL_BEDUIN", 56, "universalBeduin", n0Var.b(UniversalBeduinSlot.class));
        UNIVERSAL_BEDUIN_V2 = new SlotType("UNIVERSAL_BEDUIN_V2", 57, "universalBeduinV2", n0Var.b(UniversalBeduinV2Slot.class));
        CV_UPLOAD = new SlotType("CV_UPLOAD", 58, "cvUploadBanner", n0Var.b(CvUploadSlot.class));
        SLEEPING_PLACES = new SlotType("SLEEPING_PLACES", 59, "sleepingPlaces", n0Var.b(SleepingPlacesSlot.class));
        CHECK_VERIFICATION = new SlotType("CHECK_VERIFICATION", 60, "checkVerification", n0Var.b(CheckVerificationSlot.class));
        DELIVERY_ADDRESSES = new SlotType("DELIVERY_ADDRESSES", 61, "deliveryAddress", n0Var.b(DeliveryAddressesSlot.class));
        GENERATE_TEXT_BUTTONS = new SlotType("GENERATE_TEXT_BUTTONS", 62, "generateWorkPlaceResponsibilityButtons", n0Var.b(GenerateTextButtonsSlot.class));
        IMAGES_ENHANCEMENT = new SlotType("IMAGES_ENHANCEMENT", 63, "autoImageEnhancement", n0Var.b(ImagesEnhancementSlot.class));
        IMAGE_PERCEPTION = new SlotType("IMAGE_PERCEPTION", 64, "imagePerception", n0Var.b(ImagePerceptionSlot.class));
        ADDRESSES_FROM_PROFILE = new SlotType("ADDRESSES_FROM_PROFILE", 65, "sellerAddresses", n0Var.b(AddressesFromProfileSlot.class));
        NETWORK_STORES_FAKE_DOOR_SLOT = new SlotType("NETWORK_STORES_FAKE_DOOR_SLOT", 66, "networkStoresFakeDoorSlot", n0Var.b(NetworkStoresFakeDoorSlot.class));
        SlotType[] slotTypeArr$values = $values();
        $VALUES = slotTypeArr$values;
        $ENTRIES = c.a(slotTypeArr$values);
        INSTANCE = new Companion(null);
        SlotType[] slotTypeArrValues = values();
        int iF2 = P0.f(slotTypeArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2 >= 16 ? iF2 : 16);
        for (SlotType slotType : slotTypeArrValues) {
            linkedHashMap.put(slotType.strValue, slotType);
        }
        valuesMap = linkedHashMap;
    }

    private SlotType(String str, int i12, String str2, d dVar) {
        this.strValue = str2;
        this.slotClass = dVar;
    }

    @k
    public static a<SlotType> getEntries() {
        return $ENTRIES;
    }

    public static SlotType valueOf(String str) {
        return (SlotType) Enum.valueOf(SlotType.class, str);
    }

    public static SlotType[] values() {
        return (SlotType[]) $VALUES.clone();
    }

    @k
    public final d<?> getSlotClass() {
        return this.slotClass;
    }

    @k
    public final String getStrValue() {
        return this.strValue;
    }
}
