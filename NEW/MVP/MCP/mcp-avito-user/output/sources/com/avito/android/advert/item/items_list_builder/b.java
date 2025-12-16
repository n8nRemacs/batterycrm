package com.avito.android.advert.item.items_list_builder;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.B2;
import com.avito.android.R;
import com.avito.android.Z0;
import com.avito.android.ab_tests.configs.RiseIcebreakersItemTestGroup;
import com.avito.android.advert.InterfaceC28240u;
import com.avito.android.advert.item.I1;
import com.avito.android.advert.item.abuse.AdvertDetailsAbuseItem;
import com.avito.android.advert.item.additionalSeller.AdditionalSellerButtonItem;
import com.avito.android.advert.item.additionalSeller.AdditionalSellerFeaturesItem;
import com.avito.android.advert.item.additionalSeller.title_item.AdditionalSellerTitleItem;
import com.avito.android.advert.item.address_centrity.AddressCentrityBlockItem;
import com.avito.android.advert.item.adress_hint.AddressHint;
import com.avito.android.advert.item.advert_badge_bar_light.AdvertDetailsBadgeBarLightItem;
import com.avito.android.advert.item.advert_docking_badge_bar.AdvertDetailsDockingBadgeBarItem;
import com.avito.android.advert.item.advertnumber.AdvertDetailsAdvertNumberItem;
import com.avito.android.advert.item.amenities.AdvertDetailsAmenitiesItem;
import com.avito.android.advert.item.anchor_trust_factors.AdvertDetailsAnchorTrustFactorsItem;
import com.avito.android.advert.item.auto_credits.AdvertDetailsAutoLoansItem;
import com.avito.android.advert.item.auto_picker_banner.AutoPickerBannerItem;
import com.avito.android.advert.item.autoteka.teaser.AdvertDetailsAutotekaTeaserItem;
import com.avito.android.advert.item.autoteka.teaser_v2.AdvertDetailsAutotekaTeaserV2Item;
import com.avito.android.advert.item.autoteka.teaser_v3.AdvertDetailsAutotekaTeaserV3Item;
import com.avito.android.advert.item.autoteka_select.teaser.AdvertDetailsAutotekaSelectTeaserItem;
import com.avito.android.advert.item.b2c.AdvertDetailsB2CBottomItem;
import com.avito.android.advert.item.blocks.items_factories.A4;
import com.avito.android.advert.item.blocks.items_factories.D4;
import com.avito.android.advert.item.blocks.items_factories.P0;
import com.avito.android.advert.item.brandingGallery.block.BrandingGalleryBlockItem;
import com.avito.android.advert.item.branding_advantages.block.BrandingAdvantagesBlockItem;
import com.avito.android.advert.item.buyer_trust_banner.BuyerTrustBannerItem;
import com.avito.android.advert.item.chat_history.ChatHistoryItem;
import com.avito.android.advert.item.compatibility.v2.GarageCompatibilityV2Item;
import com.avito.android.advert.item.compatibility.v3.GarageCompatibilityV3Item;
import com.avito.android.advert.item.compatibility.v4.GarageCompatibilityV4Item;
import com.avito.android.advert.item.consultation.AdvertDetailsConsultationItem;
import com.avito.android.advert.item.consultation.ConsultationAfterIceBreakersItem;
import com.avito.android.advert.item.consultation.ConsultationButtonItem;
import com.avito.android.advert.item.consultation.dynamic_content.DynamicConsultationAfterIceBreakersItem;
import com.avito.android.advert.item.consultation.secondary.SecondaryConsultationItem;
import com.avito.android.advert.item.contactbar.AdvertDetailsContactBarItem;
import com.avito.android.advert.item.creditinfo.buzzoola.BuzzoolaCreditBannerItem;
import com.avito.android.advert.item.cv_motivation_banner.CvMotivationBannerItem;
import com.avito.android.advert.item.cv_phone_actualization.AdvertCvPhoneActualizationItem;
import com.avito.android.advert.item.cv_state.AdvertCvStateItem;
import com.avito.android.advert.item.delivery_suggests.AdvertDetailsDeliverySuggestsItem;
import com.avito.android.advert.item.developer.button.DeveloperButtonItem;
import com.avito.android.advert.item.developer.trust.DeveloperTrustItem;
import com.avito.android.advert.item.disclaimer.AdvertDetailsDisclaimerItem;
import com.avito.android.advert.item.disclaimer_pd.DisclaimerPDItem;
import com.avito.android.advert.item.domoteka.conveyor.AdvertDetailsDomotekaTeaserItem;
import com.avito.android.advert.item.early_access_fakedoor.konveyor.EarlyAccessAdvertItem;
import com.avito.android.advert.item.equipmentsTile.AdvertDetailsEquipmentsTileItem;
import com.avito.android.advert.item.fmp.banner.AdvertDetailsFmpBannerItem;
import com.avito.android.advert.item.fmp.calculator.AdvertDetailsFmpCalculatorItem;
import com.avito.android.advert.item.fmp.offer.AdvertDetailsFmpOfferItem;
import com.avito.android.advert.item.fmp.products.AdvertDetailsFmpProductsItem;
import com.avito.android.advert.item.geo_distance.AdvertDetailsAddressGeoDistanceItem;
import com.avito.android.advert.item.groups.AdvertDetailsGroupsItem;
import com.avito.android.advert.item.hotel.hotel_description.AdvertHotelDescriptionItem;
import com.avito.android.advert.item.hotel.hotel_offer.konveyor.main.AdvertDetailsHotelOfferItem;
import com.avito.android.advert.item.hotel.hotel_promo_widget.AdvertHotelPromoWidgetItem;
import com.avito.android.advert.item.hotel.hotel_review.AdvertHotelReviewItem;
import com.avito.android.advert.item.icebreakers.IceBreakersItem;
import com.avito.android.advert.item.icebreakers_redesign.IcebreakersRedesignItem;
import com.avito.android.advert.item.installments.InstallmentsBlockItem;
import com.avito.android.advert.item.job_cv_info.AdvertCvInfoItem;
import com.avito.android.advert.item.job_search_status.AdvertJobSearchStatusItem;
import com.avito.android.advert.item.job_seeker_apply_info.SeekerResponsesInfoItemV2;
import com.avito.android.advert.item.leadauto.AutoNewCarsLeadFormItem;
import com.avito.android.advert.item.leasing_beduin.AdvertDetailsLeasingBeduinItem;
import com.avito.android.advert.item.leasing_calculator.AdvertDetailsLeasingCalculatorItem;
import com.avito.android.advert.item.leasing_calculator.link_item.AdvertDetailsLeasingLinkItem;
import com.avito.android.advert.item.marketplace_rewards.MarketplaceRewardsBannerItem;
import com.avito.android.advert.item.marketplace_sales_advert_promo_banner.MarketplaceSalesAdvertPromoBannerItem;
import com.avito.android.advert.item.marketplace_sales_banner.MarketplaceSalesBannerItem;
import com.avito.android.advert.item.marketplace_sales_banner_out_of_bound.MarketplaceSalesBannerOutOfBoundsItem;
import com.avito.android.advert.item.marketplace_stocks.MarketplaceStocksItem;
import com.avito.android.advert.item.mortgage_calculator.MortgageCalculatorItem;
import com.avito.android.advert.item.mortgage_snippet.MortgageSnippetItem;
import com.avito.android.advert.item.multi_item.AdvertDetailsMultiItemItem;
import com.avito.android.advert.item.note.AdvertDetailsNoteItem;
import com.avito.android.advert.item.ownership_cost.items.OwnershipCostItem;
import com.avito.android.advert.item.parking.AdvertDetailsParkingAddressItem;
import com.avito.android.advert.item.popularity_info.AdvertDetailsPopularityInfoItem;
import com.avito.android.advert.item.price_comparison.PriceComparisonItem;
import com.avito.android.advert.item.privacyDisclaimer.AdvertDetailsPrivacyDisclaimerItem;
import com.avito.android.advert.item.promo_mechanics.PromoMechanicsItem;
import com.avito.android.advert.item.rating_publish.AdvertDetailsRatingPublishItem;
import com.avito.android.advert.item.realty_imv.RealtyImvItem;
import com.avito.android.advert.item.realty_quiz_banner.RealtyQuizBannerItem;
import com.avito.android.advert.item.recall_me.RecallMeBlockItem;
import com.avito.android.advert.item.reservation.AdvertReservationInfoItem;
import com.avito.android.advert.item.reviews.AdvertDetailsReviewsScoreItem;
import com.avito.android.advert.item.safedeal.info.AdvertDetailsSafeDealInfoItem;
import com.avito.android.advert.item.safedeal.real_one_click_payment_block.AdvertDetailsSafeDealPaymentBlockItem;
import com.avito.android.advert.item.safedeal.services.AdvertDetailsSafeDealServicesItem;
import com.avito.android.advert.item.safedeal.trust_factors.TrustFactorsItem;
import com.avito.android.advert.item.salary_range.AdvertSalaryRangeItem;
import com.avito.android.advert.item.sales_banner.AdvertDetailsStickedSalesBannerItem;
import com.avito.android.advert.item.scroll_up.AdvertDetailsScrollUpItem;
import com.avito.android.advert.item.select.benefits.AdvertDetailsAutoSelectItem;
import com.avito.android.advert.item.select.booking.AutoSelectBookingItem;
import com.avito.android.advert.item.select.controls.AutoSelectControlsItem;
import com.avito.android.advert.item.select.no_click_contact.AutoSelectNoClickContactItem;
import com.avito.android.advert.item.select.parameters_v3.AutoSelectParametersV3Item;
import com.avito.android.advert.item.select.teaser.AutoSelectTeaserItem;
import com.avito.android.advert.item.sellersubscription.AdvertDetailsSellerSubscriptionItem;
import com.avito.android.advert.item.service_app_filling.button.AdvertServiceAppFillingButtonItem;
import com.avito.android.advert.item.service_app_filling.info.AdvertServiceAppFillingInfoItem;
import com.avito.android.advert.item.service_booking.ServiceBookingItem;
import com.avito.android.advert.item.service_order_request.ServiceOrderRequestItem;
import com.avito.android.advert.item.services_price.ServicesPriceItem;
import com.avito.android.advert.item.services_review_volunteers.ServicesReviewVolunteersItem;
import com.avito.android.advert.item.services_title.ServicesTitleItem;
import com.avito.android.advert.item.short_term_rent.item_discount.AdvertDetailsShortTermRentItemDiscountItem;
import com.avito.android.advert.item.short_term_rent.str_buttons.AdvertDetailsShortTermRentStrButtonsItem;
import com.avito.android.advert.item.show_on_map.AdvertDetailsShowOnMapItem;
import com.avito.android.advert.item.similars.j;
import com.avito.android.advert.item.similars_button.AdvertDetailsSimilarsButtonItem;
import com.avito.android.advert.item.sparePartsCost.SparePartsCostItem;
import com.avito.android.advert.item.styled_title.StyledTitleItem;
import com.avito.android.advert.item.sx_addresses_header.AdvertDetailsSxAddressesHeaderItem;
import com.avito.android.advert.item.trust_factors.DeliveryTrustFactorsItem;
import com.avito.android.advert.item.verification.AdvertVerificationItem;
import com.avito.android.advert.item.video_call_request.AdvertVideoCallRequestItem;
import com.avito.android.advert.item.wallet_info.WalletInfoItem;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.advert_core.advert_badge_bar.AdvertBadgeBarItem;
import com.avito.android.advert_core.auto_select_banner.AutoSelectBannerItem;
import com.avito.android.advert_core.auto_select_manager_info.AutoSelectManagerInfoItem;
import com.avito.android.advert_core.auto_select_parameters_v2.AutoSelectParametersV2Item;
import com.avito.android.advert_core.body_condition.AdvertDetailsCarBodyConditionItem;
import com.avito.android.advert_core.comfortable_deal_promo.AdvertDetailsComfortableDealPromoItem;
import com.avito.android.advert_core.development_offers.DevelopmentOffersItem;
import com.avito.android.advert_core.divider.AdvertDetailsDividerItem;
import com.avito.android.advert_core.domoteka_report_teaser.AdvertDetailsDomotekaReportTeaserItem;
import com.avito.android.advert_core.equipments.redesign.EquipmentsItem;
import com.avito.android.advert_core.expand_items_button.ExpandItemsButtonItem;
import com.avito.android.advert_core.gap.AdvertDetailsGapItem;
import com.avito.android.advert_core.information_about.InformationAboutItem;
import com.avito.android.advert_core.offers.OffersItem;
import com.avito.android.advert_core.pp_recall_promo.AdvertDetailsPpRecallPromoItem;
import com.avito.android.advert_core.price_list.preview.AdvertPriceListPreviewItem;
import com.avito.android.advert_core.service_education.ServiceEducationItem;
import com.avito.android.advert_details_items.address.AdvertDetailsAddressItem;
import com.avito.android.advert_details_items.campaigns.AdvertDetailsCampaignsItem;
import com.avito.android.advert_details_items.carousel_photogallery.CarouselPhotoGalleryItem;
import com.avito.android.advert_details_items.description.AdvertDetailsDescriptionItem;
import com.avito.android.advert_details_items.flats.AdvertDetailsFlatsItem;
import com.avito.android.advert_details_items.geo_market_report.AdvertDetailsGeoMarketReportItem;
import com.avito.android.advert_details_items.geo_zones.AdvertDetailsGeoZonesItem;
import com.avito.android.advert_details_items.georeference.AdvertDetailsGeoReferenceItem;
import com.avito.android.advert_details_items.imv_v4_cars.ImvCarsV4Item;
import com.avito.android.advert_details_items.photogallery.AdvertDetailsGalleryItem;
import com.avito.android.advert_details_items.portfolio.AdvertDetailsPortfolioBlockItem;
import com.avito.android.advert_details_items.price_description_button.AdvertDetailsPriceDescriptionButtonItem;
import com.avito.android.advert_details_items.search_suggests.AdvertDetailsSearchSuggestsItem;
import com.avito.android.advert_details_items.sellerprofile.AdvertDetailsSellerProfileItem;
import com.avito.android.advert_details_items.services_discount_and_gifts.AdvertDetailsServicesDiscountAndBuyerGiftItem;
import com.avito.android.advert_details_items.show_description_button.AdvertDetailsShowDescriptionItem;
import com.avito.android.advert_details_items.status_badge.AdvertDetailsClosingReasonItem;
import com.avito.android.advert_details_items.title.AdvertDetailsTitleItem;
import com.avito.android.advert_details_items.work_time.AdvertDetailsServicesWorkTimeItem;
import com.avito.android.analytics_ratings_reviews.ReviewsOpenPageFrom;
import com.avito.android.auto_loans_composite_broker.v1.AdvertDetailsCompositeBrokerV1Item;
import com.avito.android.auto_loans_composite_broker.v2.AdvertDetailsCompositeBrokerV2Item;
import com.avito.android.credits.CreditCalculatorItem;
import com.avito.android.credits.broker_link.CreditBrokerLinkItem;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.AdvertParameters;
import com.avito.android.remote.model.DevelopmentOffersPosition;
import com.avito.android.remote.model.ItemCardRedesign;
import com.avito.android.remote.model.OffersPosition;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.remote.model.advert_details.reviews.ItemReviewsHeader;
import com.avito.android.remote.model.item_reviews.ItemReviews;
import com.avito.android.remote.model.item_reviews.ItemReviewsMain;
import com.avito.android.remote.model.services_review_volunteers.ServicesReviewVolunteers;
import com.avito.android.repair_calculator.AdvertDetailsRepairCalculatorItem;
import com.avito.android.serp.adapter.PersistableSpannedItem;
import com.avito.android.services_realty_sheet.link.ServicesRealtySheetLink;
import com.avito.android.util.O2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import lD.C43617a;

/* compiled from: DefaultItemListBuilder.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/items_list_builder/b;", "Lcom/avito/android/advert/item/items_list_builder/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements com.avito.android.advert.item.items_list_builder.c {

    /* renamed from: A, reason: collision with root package name */
    @l
    public final AdditionalSellerFeaturesItem f76614A;

    /* renamed from: A0, reason: collision with root package name */
    @l
    public final AdvertCvInfoItem f76615A0;

    /* renamed from: A1, reason: collision with root package name */
    @l
    public final MortgageSnippetItem f76616A1;

    /* renamed from: A2, reason: collision with root package name */
    @l
    public final PersistableSpannedItem f76617A2;

    /* renamed from: B, reason: collision with root package name */
    @l
    public final AdvertDetailsFlatsItem f76618B;

    /* renamed from: B0, reason: collision with root package name */
    @l
    public final CvMotivationBannerItem f76619B0;

    /* renamed from: B1, reason: collision with root package name */
    @l
    public final AdvertDetailsMultiItemItem f76620B1;

    /* renamed from: B2, reason: collision with root package name */
    @l
    public final AdvertDetailsTitleItem f76621B2;

    /* renamed from: C, reason: collision with root package name */
    @l
    public final AdvertDetailsReviewsScoreItem f76622C;

    /* renamed from: C0, reason: collision with root package name */
    @l
    public final AdvertDetailsDeliverySuggestsItem f76623C0;

    /* renamed from: C1, reason: collision with root package name */
    @l
    public final AdvertDetailsNoteItem f76624C1;

    /* renamed from: C2, reason: collision with root package name */
    @l
    public final StyledTitleItem f76625C2;

    /* renamed from: D, reason: collision with root package name */
    @l
    public final AdditionalSellerTitleItem f76626D;

    /* renamed from: D0, reason: collision with root package name */
    @l
    public final DeliveryTrustFactorsItem f76627D0;

    /* renamed from: D1, reason: collision with root package name */
    @l
    public final OffersItem f76628D1;

    /* renamed from: D2, reason: collision with root package name */
    @l
    public final AdvertVerificationItem f76629D2;

    /* renamed from: E, reason: collision with root package name */
    @l
    public final AdvertDetailsSxAddressesHeaderItem f76630E;

    /* renamed from: E0, reason: collision with root package name */
    @l
    public final AdvertDetailsDescriptionItem f76631E0;

    /* renamed from: E1, reason: collision with root package name */
    @l
    public final OwnershipCostItem f76632E1;

    /* renamed from: E2, reason: collision with root package name */
    @l
    public final AdvertVideoCallRequestItem f76633E2;

    /* renamed from: F, reason: collision with root package name */
    @l
    public final AddressCentrityBlockItem f76634F;

    /* renamed from: F0, reason: collision with root package name */
    @l
    public final DeveloperButtonItem f76635F0;

    /* renamed from: F1, reason: collision with root package name */
    @l
    public final AdvertDetailsParkingAddressItem f76636F1;

    /* renamed from: F2, reason: collision with root package name */
    @l
    public final WalletInfoItem f76637F2;

    /* renamed from: G, reason: collision with root package name */
    @l
    public final AdvertDetailsAddressGeoDistanceItem f76638G;

    /* renamed from: G0, reason: collision with root package name */
    @l
    public final AdvertDetailsFlatsItem f76639G0;

    /* renamed from: G1, reason: collision with root package name */
    @l
    public final AdvertDetailsPopularityInfoItem f76640G1;

    /* renamed from: G2, reason: collision with root package name */
    @l
    public final AdvertDetailsServicesWorkTimeItem f76641G2;

    /* renamed from: H, reason: collision with root package name */
    @l
    public final AddressHint f76642H;

    /* renamed from: H0, reason: collision with root package name */
    @l
    public final DeveloperTrustItem f76643H0;

    /* renamed from: H1, reason: collision with root package name */
    @l
    public final AdvertDetailsPortfolioBlockItem f76644H1;

    /* renamed from: H2, reason: collision with root package name */
    @l
    public final AutoNewCarsLeadFormItem f76645H2;

    /* renamed from: I, reason: collision with root package name */
    @l
    public final AdvertDetailsAddressItem f76646I;

    /* renamed from: I0, reason: collision with root package name */
    @l
    public final DevelopmentOffersItem f76647I0;

    /* renamed from: I1, reason: collision with root package name */
    @l
    public final AdvertDetailsPpRecallPromoItem f76648I1;

    /* renamed from: I2, reason: collision with root package name */
    @l
    public final MarketplaceRewardsBannerItem f76649I2;

    /* renamed from: J, reason: collision with root package name */
    @l
    public final AdvertDetailsAdvertNumberItem f76650J;

    /* renamed from: J0, reason: collision with root package name */
    @l
    public final AdvertDetailsDisclaimerItem f76651J0;

    /* renamed from: J1, reason: collision with root package name */
    @l
    public final AdvertDetailsComfortableDealPromoItem f76652J1;

    /* renamed from: J2, reason: collision with root package name */
    @l
    public final BuyerTrustBannerItem f76653J2;

    /* renamed from: K, reason: collision with root package name */
    @l
    public final AdvertServiceAppFillingButtonItem f76654K;

    /* renamed from: K0, reason: collision with root package name */
    @l
    public final DisclaimerPDItem f76655K0;

    /* renamed from: K1, reason: collision with root package name */
    @l
    public final PriceComparisonItem f76656K1;

    /* renamed from: K2, reason: collision with root package name */
    @k
    public final com.avito.android.util.bottom_gap.d f76657K2;

    /* renamed from: L, reason: collision with root package name */
    @l
    public final AdvertServiceAppFillingInfoItem f76658L;

    /* renamed from: L0, reason: collision with root package name */
    @l
    public final AdvertDetailsDockingBadgeBarItem f76659L0;

    /* renamed from: L1, reason: collision with root package name */
    @l
    public final PersistableSpannedItem f76660L1;

    /* renamed from: L2, reason: collision with root package name */
    @k
    public List<PersistableSpannedItem> f76661L2 = new ArrayList();

    /* renamed from: M, reason: collision with root package name */
    @l
    public final AdvertDetailsAmenitiesItem f76662M;

    /* renamed from: M0, reason: collision with root package name */
    @l
    public final AdvertDetailsDomotekaReportTeaserItem f76663M0;

    /* renamed from: M1, reason: collision with root package name */
    @l
    public final PersistableSpannedItem f76664M1;

    /* renamed from: N, reason: collision with root package name */
    @l
    public final AdvertDetailsAnchorTrustFactorsItem f76665N;

    /* renamed from: N0, reason: collision with root package name */
    @l
    public final AdvertDetailsDomotekaTeaserItem f76666N0;

    /* renamed from: N1, reason: collision with root package name */
    @l
    public final AdvertDetailsPriceDescriptionButtonItem f76667N1;

    /* renamed from: O, reason: collision with root package name */
    @l
    public final AdvertDetailsAutoLoansItem f76668O;

    /* renamed from: O0, reason: collision with root package name */
    @l
    public final DynamicConsultationAfterIceBreakersItem f76669O0;

    /* renamed from: O1, reason: collision with root package name */
    @l
    public final AdvertPriceListPreviewItem f76670O1;

    /* renamed from: P, reason: collision with root package name */
    @l
    public final AutoPickerBannerItem f76671P;

    /* renamed from: P0, reason: collision with root package name */
    @l
    public final EarlyAccessAdvertItem f76672P0;

    /* renamed from: P1, reason: collision with root package name */
    @l
    public final AdvertDetailsPrivacyDisclaimerItem f76673P1;

    /* renamed from: Q, reason: collision with root package name */
    @l
    public final AutoSelectBannerItem f76674Q;

    /* renamed from: Q0, reason: collision with root package name */
    @l
    public final EquipmentsItem f76675Q0;

    /* renamed from: Q1, reason: collision with root package name */
    @l
    public final PromoMechanicsItem f76676Q1;

    /* renamed from: R, reason: collision with root package name */
    @l
    public final AutoSelectBookingItem f76677R;

    /* renamed from: R0, reason: collision with root package name */
    @l
    public final AdvertDetailsEquipmentsTileItem f76678R0;

    /* renamed from: R1, reason: collision with root package name */
    @l
    public final AdvertDetailsRatingPublishItem f76679R1;

    /* renamed from: S, reason: collision with root package name */
    @l
    public final AutoSelectControlsItem f76680S;

    /* renamed from: S0, reason: collision with root package name */
    @l
    public final List<AdvertDetailsFlatsItem> f76681S0;

    /* renamed from: S1, reason: collision with root package name */
    @l
    public final InformationAboutItem f76682S1;

    /* renamed from: T, reason: collision with root package name */
    @l
    public final AdvertDetailsAutoSelectItem f76683T;

    /* renamed from: T0, reason: collision with root package name */
    @l
    public final AdvertDetailsFmpBannerItem f76684T0;

    /* renamed from: T1, reason: collision with root package name */
    @l
    public final RealtyImvItem f76685T1;

    /* renamed from: U, reason: collision with root package name */
    @l
    public final AutoSelectManagerInfoItem f76686U;

    /* renamed from: U0, reason: collision with root package name */
    @l
    public final AdvertDetailsFmpCalculatorItem f76687U0;

    /* renamed from: U1, reason: collision with root package name */
    @l
    public final RealtyQuizBannerItem f76688U1;

    /* renamed from: V, reason: collision with root package name */
    @l
    public final AutoSelectNoClickContactItem f76689V;

    /* renamed from: V0, reason: collision with root package name */
    @l
    public final AdvertDetailsFmpOfferItem f76690V0;

    /* renamed from: V1, reason: collision with root package name */
    @l
    public final RecallMeBlockItem f76691V1;

    /* renamed from: W, reason: collision with root package name */
    @l
    public final AutoSelectParametersV2Item f76692W;

    /* renamed from: W0, reason: collision with root package name */
    @l
    public final AdvertDetailsFmpProductsItem f76693W0;

    /* renamed from: W1, reason: collision with root package name */
    @l
    public final AdvertDetailsFlatsItem f76694W1;

    /* renamed from: X, reason: collision with root package name */
    @l
    public final AutoSelectParametersV3Item f76695X;

    /* renamed from: X0, reason: collision with root package name */
    @l
    public final CarouselPhotoGalleryItem f76696X0;

    /* renamed from: X1, reason: collision with root package name */
    @l
    public final AdvertDetailsRepairCalculatorItem f76697X1;

    /* renamed from: Y, reason: collision with root package name */
    @l
    public final AutoSelectTeaserItem f76698Y;

    /* renamed from: Y0, reason: collision with root package name */
    @l
    public final AdvertDetailsGalleryItem f76699Y0;

    /* renamed from: Y1, reason: collision with root package name */
    @l
    public final BlockItem f76700Y1;

    /* renamed from: Z, reason: collision with root package name */
    @l
    public final AdvertDetailsAutotekaTeaserItem f76701Z;

    /* renamed from: Z0, reason: collision with root package name */
    @l
    public final GarageCompatibilityV2Item f76702Z0;

    /* renamed from: Z1, reason: collision with root package name */
    @l
    public final AdvertReservationInfoItem f76703Z1;

    /* renamed from: a0, reason: collision with root package name */
    @l
    public final AdvertDetailsAutotekaTeaserV2Item f76704a0;

    /* renamed from: a1, reason: collision with root package name */
    @l
    public final GarageCompatibilityV3Item f76705a1;

    /* renamed from: a2, reason: collision with root package name */
    @l
    public final PersistableSpannedItem f76706a2;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final AdvertDetails f76707b;

    /* renamed from: b0, reason: collision with root package name */
    @l
    public final AdvertDetailsAutotekaTeaserV3Item f76708b0;

    /* renamed from: b1, reason: collision with root package name */
    @l
    public final GarageCompatibilityV4Item f76709b1;

    /* renamed from: b2, reason: collision with root package name */
    @l
    public final AdvertDetailsSafeDealInfoItem f76710b2;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f76711c;

    /* renamed from: c0, reason: collision with root package name */
    @l
    public final AdvertDetailsAutotekaSelectTeaserItem f76712c0;

    /* renamed from: c1, reason: collision with root package name */
    @l
    public final AdvertDetailsGeoMarketReportItem f76713c1;

    /* renamed from: c2, reason: collision with root package name */
    @l
    public final AdvertDetailsSafeDealPaymentBlockItem f76714c2;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.advert_core.analytics.a f76715d;

    /* renamed from: d0, reason: collision with root package name */
    @l
    public final PersistableSpannedItem f76716d0;

    /* renamed from: d1, reason: collision with root package name */
    @l
    public final List<AdvertDetailsGeoReferenceItem> f76717d1;

    /* renamed from: d2, reason: collision with root package name */
    @l
    public final AdvertDetailsSafeDealServicesItem f76718d2;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C43617a f76719e;

    /* renamed from: e0, reason: collision with root package name */
    @l
    public final AdvertDetailsB2CBottomItem f76720e0;

    /* renamed from: e1, reason: collision with root package name */
    @l
    public final AdvertDetailsGeoZonesItem f76721e1;

    /* renamed from: e2, reason: collision with root package name */
    @k
    public final List<TrustFactorsItem> f76722e2;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f76723f;

    /* renamed from: f0, reason: collision with root package name */
    @l
    public final AdvertBadgeBarItem f76724f0;

    /* renamed from: f1, reason: collision with root package name */
    @l
    public final AdvertDetailsGroupsItem f76725f1;

    /* renamed from: f2, reason: collision with root package name */
    @l
    public final AdvertSalaryRangeItem f76726f2;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final P0 f76727g;

    /* renamed from: g0, reason: collision with root package name */
    @l
    public final AdvertDetailsBadgeBarLightItem f76728g0;

    /* renamed from: g1, reason: collision with root package name */
    @l
    public final AdvertDetailsReviewsScoreItem f76729g1;

    /* renamed from: g2, reason: collision with root package name */
    @l
    public final AdvertDetailsScrollUpItem f76730g2;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final DevelopmentOffersPosition f76731h;

    /* renamed from: h0, reason: collision with root package name */
    @l
    public final BrandingAdvantagesBlockItem f76732h0;

    /* renamed from: h1, reason: collision with root package name */
    @l
    public final AdvertHotelDescriptionItem f76733h1;

    /* renamed from: h2, reason: collision with root package name */
    @l
    public final AdvertDetailsSearchSuggestsItem f76734h2;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final LinkedHashMap f76735i;

    /* renamed from: i0, reason: collision with root package name */
    @l
    public final BrandingGalleryBlockItem f76736i0;

    /* renamed from: i1, reason: collision with root package name */
    @l
    public final AdvertHotelDescriptionItem f76737i1;

    /* renamed from: i2, reason: collision with root package name */
    @l
    public final SecondaryConsultationItem f76738i2;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final G5.a f76739j;

    /* renamed from: j0, reason: collision with root package name */
    @l
    public final BuzzoolaCreditBannerItem f76740j0;

    /* renamed from: j1, reason: collision with root package name */
    @l
    public final StyledTitleItem f76741j1;

    /* renamed from: j2, reason: collision with root package name */
    @l
    public final AdvertDetailsSellerProfileItem f76742j2;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f76743k;

    /* renamed from: k0, reason: collision with root package name */
    @l
    public final AdvertDetailsCampaignsItem f76744k0;

    /* renamed from: k1, reason: collision with root package name */
    @l
    public final AdvertDetailsHotelOfferItem f76745k1;

    /* renamed from: k2, reason: collision with root package name */
    @l
    public final AdvertDetailsSellerSubscriptionItem f76746k2;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final List<PersistableSpannedItem> f76747l;

    /* renamed from: l0, reason: collision with root package name */
    @l
    public final AdvertDetailsCarBodyConditionItem f76748l0;

    /* renamed from: l1, reason: collision with root package name */
    @l
    public final AdvertHotelPromoWidgetItem f76749l1;

    /* renamed from: l2, reason: collision with root package name */
    @l
    public final ServiceBookingItem f76750l2;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final Z0 f76751m;

    /* renamed from: m0, reason: collision with root package name */
    @l
    public final ChatHistoryItem f76752m0;

    /* renamed from: m1, reason: collision with root package name */
    @l
    public final AdvertHotelReviewItem f76753m1;

    /* renamed from: m2, reason: collision with root package name */
    @l
    public final ServiceEducationItem f76754m2;

    /* renamed from: n, reason: collision with root package name */
    @l
    public final OffersPosition f76755n;

    /* renamed from: n0, reason: collision with root package name */
    @l
    public final AdvertDetailsFlatsItem f76756n0;

    /* renamed from: n1, reason: collision with root package name */
    @l
    public final IceBreakersItem f76757n1;

    /* renamed from: n2, reason: collision with root package name */
    @l
    public final ServiceOrderRequestItem f76758n2;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final InterfaceC28240u f76759o;

    /* renamed from: o0, reason: collision with root package name */
    @l
    public final AdvertDetailsClosingReasonItem f76760o0;

    /* renamed from: o1, reason: collision with root package name */
    @l
    public final IcebreakersRedesignItem f76761o1;

    /* renamed from: o2, reason: collision with root package name */
    @l
    public final AdvertDetailsServicesDiscountAndBuyerGiftItem f76762o2;

    /* renamed from: p, reason: collision with root package name */
    @k
    public final u3.l<RiseIcebreakersItemTestGroup> f76763p;

    /* renamed from: p0, reason: collision with root package name */
    @l
    public final AdvertDetailsCompositeBrokerV1Item f76764p0;

    /* renamed from: p1, reason: collision with root package name */
    @l
    public final ImvCarsV4Item f76765p1;

    /* renamed from: p2, reason: collision with root package name */
    @l
    public final ServicesPriceItem f76766p2;

    /* renamed from: q, reason: collision with root package name */
    @k
    public final B2 f76767q;

    /* renamed from: q0, reason: collision with root package name */
    @l
    public final AdvertDetailsCompositeBrokerV2Item f76768q0;

    /* renamed from: q1, reason: collision with root package name */
    @l
    public final AdvertJobSearchStatusItem f76769q1;

    /* renamed from: q2, reason: collision with root package name */
    @l
    public final ServicesReviewVolunteersItem f76770q2;

    /* renamed from: r, reason: collision with root package name */
    @k
    public final A4 f76771r;

    /* renamed from: r0, reason: collision with root package name */
    @l
    public final ConsultationAfterIceBreakersItem f76772r0;

    /* renamed from: r1, reason: collision with root package name */
    @l
    public final SeekerResponsesInfoItemV2 f76773r1;

    /* renamed from: r2, reason: collision with root package name */
    @l
    public final ServicesTitleItem f76774r2;

    /* renamed from: s, reason: collision with root package name */
    @l
    public final ServicesReviewVolunteers.Position f76775s;

    /* renamed from: s0, reason: collision with root package name */
    @l
    public final ConsultationButtonItem f76776s0;

    /* renamed from: s1, reason: collision with root package name */
    @l
    public final AdvertDetailsLeasingBeduinItem f76777s1;

    /* renamed from: s2, reason: collision with root package name */
    @l
    public final AdvertDetailsShortTermRentItemDiscountItem f76778s2;

    /* renamed from: t, reason: collision with root package name */
    @k
    public final D4 f76779t;

    /* renamed from: t0, reason: collision with root package name */
    @l
    public final AdvertDetailsConsultationItem f76780t0;

    /* renamed from: t1, reason: collision with root package name */
    @l
    public final AdvertDetailsLeasingCalculatorItem f76781t1;

    /* renamed from: t2, reason: collision with root package name */
    @l
    public final AdvertDetailsShortTermRentStrButtonsItem f76782t2;

    /* renamed from: u, reason: collision with root package name */
    @k
    public final com.avito.android.advert_core.short_term_rent.a f76783u;

    /* renamed from: u0, reason: collision with root package name */
    @l
    public final AdvertDetailsContactBarItem f76784u0;

    /* renamed from: u1, reason: collision with root package name */
    @l
    public final AdvertDetailsLeasingLinkItem f76785u1;

    /* renamed from: u2, reason: collision with root package name */
    @l
    public final AdvertDetailsShowDescriptionItem f76786u2;

    /* renamed from: v, reason: collision with root package name */
    @k
    public final j f76787v;

    /* renamed from: v0, reason: collision with root package name */
    @l
    public final InstallmentsBlockItem f76788v0;

    /* renamed from: v1, reason: collision with root package name */
    @l
    public final MarketplaceSalesBannerItem f76789v1;

    /* renamed from: v2, reason: collision with root package name */
    @l
    public final AdvertDetailsShowOnMapItem f76790v2;

    /* renamed from: w, reason: collision with root package name */
    @l
    public final I1 f76791w;

    /* renamed from: w0, reason: collision with root package name */
    @l
    public final CreditCalculatorItem f76792w0;

    /* renamed from: w1, reason: collision with root package name */
    @l
    public final MarketplaceSalesAdvertPromoBannerItem f76793w1;

    /* renamed from: w2, reason: collision with root package name */
    @l
    public final AdvertDetailsShowOnMapItem f76794w2;

    /* renamed from: x, reason: collision with root package name */
    @l
    public kotlin.ranges.l f76795x;

    /* renamed from: x0, reason: collision with root package name */
    @l
    public final CreditBrokerLinkItem f76796x0;

    /* renamed from: x1, reason: collision with root package name */
    @l
    public final MarketplaceSalesBannerOutOfBoundsItem f76797x1;

    /* renamed from: x2, reason: collision with root package name */
    @l
    public final AdvertDetailsSimilarsButtonItem f76798x2;

    /* renamed from: y, reason: collision with root package name */
    @l
    public final AdvertDetailsAbuseItem f76799y;

    /* renamed from: y0, reason: collision with root package name */
    @l
    public final AdvertCvPhoneActualizationItem f76800y0;

    /* renamed from: y1, reason: collision with root package name */
    @l
    public final MarketplaceStocksItem f76801y1;

    /* renamed from: y2, reason: collision with root package name */
    @l
    public final SparePartsCostItem f76802y2;

    /* renamed from: z, reason: collision with root package name */
    @l
    public final AdditionalSellerButtonItem f76803z;

    /* renamed from: z0, reason: collision with root package name */
    @l
    public final AdvertCvStateItem f76804z0;

    /* renamed from: z1, reason: collision with root package name */
    @l
    public final MortgageCalculatorItem f76805z1;

    /* renamed from: z2, reason: collision with root package name */
    @l
    public final AdvertDetailsStickedSalesBannerItem f76806z2;

    /* compiled from: DefaultItemListBuilder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f76807a;

        static {
            int[] iArr = new int[ItemReviews.Type.values().length];
            try {
                iArr[ItemReviews.Type.SELLER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ItemReviews.Type.MODEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f76807a = iArr;
        }
    }

    /* compiled from: DefaultItemListBuilder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.item.items_list_builder.b$b, reason: collision with other inner class name */
    public static final class C2271b extends N implements Y41.a<G0> {
        public C2271b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            b.this.f76715d.T1();
            return G0.f406611a;
        }
    }

    /* compiled from: DefaultItemListBuilder.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ AdvertHotelPromoWidgetItem f76809l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ b f76810m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AdvertHotelPromoWidgetItem advertHotelPromoWidgetItem, b bVar) {
            super(0);
            this.f76809l = advertHotelPromoWidgetItem;
            this.f76810m = bVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            ParametrizedEvent parametrizedEvent = this.f76809l.f76208g;
            if (parametrizedEvent != null) {
                this.f76810m.f76739j.q(parametrizedEvent);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: DefaultItemListBuilder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            b.this.f76715d.T1();
            return G0.f406611a;
        }
    }

    /* compiled from: DefaultItemListBuilder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ AdvertDetails f76813m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(AdvertDetails advertDetails) {
            super(0);
            this.f76813m = advertDetails;
        }

        @Override // Y41.a
        public final G0 invoke() {
            ItemReviewsMain main;
            b bVar = b.this;
            if (bVar.f76711c != null) {
                ItemReviews itemReviews = this.f76813m.getItemReviews();
                ItemReviewsMain.AnalyticsParams analyticsParams = (itemReviews == null || (main = itemReviews.getMain()) == null) ? null : main.getAnalyticsParams();
                bVar.f76715d.O4(bVar.f76711c, ReviewsOpenPageFrom.ItemScroll.f91259d, analyticsParams != null ? analyticsParams.getAggregationType() : null, analyticsParams != null ? analyticsParams.getFirstReviewRelevanceBy() : null);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: DefaultItemListBuilder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ AdvertDetails f76815m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ l0.f f76816n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(AdvertDetails advertDetails, l0.f fVar) {
            super(0);
            this.f76815m = advertDetails;
            this.f76816n = fVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            ItemReviewsHeader header;
            Float scoreValue;
            com.avito.android.advert_core.analytics.a aVar = b.this.f76715d;
            AdvertDetails advertDetails = this.f76815m;
            String id2 = advertDetails.getId();
            ItemReviews itemReviews = advertDetails.getItemReviews();
            float fFloatValue = (itemReviews == null || (header = itemReviews.getHeader()) == null || (scoreValue = header.getScoreValue()) == null) ? 0.0f : scoreValue.floatValue();
            String categoryId = advertDetails.getCategoryId();
            if (categoryId == null) {
                categoryId = "";
            }
            aVar.R4(id2, categoryId, this.f76816n.f406840b, fFloatValue);
            return G0.f406611a;
        }
    }

    /* compiled from: DefaultItemListBuilder.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ AdvertHotelReviewItem f76817l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ b f76818m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(AdvertHotelReviewItem advertHotelReviewItem, b bVar) {
            super(0);
            this.f76817l = advertHotelReviewItem;
            this.f76818m = bVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            ParametrizedEvent parametrizedEvent = this.f76817l.f76238k;
            if (parametrizedEvent != null) {
                this.f76818m.f76739j.q(parametrizedEvent);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: DefaultItemListBuilder.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ AdvertHotelPromoWidgetItem f76819l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ b f76820m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(AdvertHotelPromoWidgetItem advertHotelPromoWidgetItem, b bVar) {
            super(0);
            this.f76819l = advertHotelPromoWidgetItem;
            this.f76820m = bVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            ParametrizedEvent parametrizedEvent = this.f76819l.f76208g;
            if (parametrizedEvent != null) {
                this.f76820m.f76739j.q(parametrizedEvent);
            }
            return G0.f406611a;
        }
    }

    public b(@l AdvertDetails advertDetails, @l String str, @k com.avito.android.advert_core.analytics.a aVar, @k C43617a c43617a, @l String str2, @k P0 p02, @l DevelopmentOffersPosition developmentOffersPosition, @k LinkedHashMap linkedHashMap, @k G5.a aVar2, boolean z12, @l List list, @k Z0 z02, @l OffersPosition offersPosition, @k InterfaceC28240u interfaceC28240u, @k u3.l lVar, @k B2 b22, @k A4 a42, @l ServicesReviewVolunteers.Position position, @k D4 d42, @k com.avito.android.advert_core.short_term_rent.a aVar3, @k j jVar, @l I1 i12, @l kotlin.ranges.l lVar2, @l AdvertDetailsAbuseItem advertDetailsAbuseItem, @l AdditionalSellerButtonItem additionalSellerButtonItem, @l AdditionalSellerFeaturesItem additionalSellerFeaturesItem, @l AdvertDetailsFlatsItem advertDetailsFlatsItem, @l AdvertDetailsReviewsScoreItem advertDetailsReviewsScoreItem, @l AdditionalSellerTitleItem additionalSellerTitleItem, @l AdvertDetailsSxAddressesHeaderItem advertDetailsSxAddressesHeaderItem, @l AddressCentrityBlockItem addressCentrityBlockItem, @l AdvertDetailsAddressGeoDistanceItem advertDetailsAddressGeoDistanceItem, @l AddressHint addressHint, @l AdvertDetailsAddressItem advertDetailsAddressItem, @l AdvertDetailsAdvertNumberItem advertDetailsAdvertNumberItem, @l AdvertServiceAppFillingButtonItem advertServiceAppFillingButtonItem, @l AdvertServiceAppFillingInfoItem advertServiceAppFillingInfoItem, @l AdvertDetailsAmenitiesItem advertDetailsAmenitiesItem, @l AdvertDetailsAnchorTrustFactorsItem advertDetailsAnchorTrustFactorsItem, @l AdvertDetailsAutoLoansItem advertDetailsAutoLoansItem, @l AutoPickerBannerItem autoPickerBannerItem, @l AutoSelectBannerItem autoSelectBannerItem, @l AutoSelectBookingItem autoSelectBookingItem, @l AutoSelectControlsItem autoSelectControlsItem, @l AdvertDetailsAutoSelectItem advertDetailsAutoSelectItem, @l AutoSelectManagerInfoItem autoSelectManagerInfoItem, @l AutoSelectNoClickContactItem autoSelectNoClickContactItem, @l AutoSelectParametersV2Item autoSelectParametersV2Item, @l AutoSelectParametersV3Item autoSelectParametersV3Item, @l AutoSelectTeaserItem autoSelectTeaserItem, @l AdvertDetailsAutotekaTeaserItem advertDetailsAutotekaTeaserItem, @l AdvertDetailsAutotekaTeaserV2Item advertDetailsAutotekaTeaserV2Item, @l AdvertDetailsAutotekaTeaserV3Item advertDetailsAutotekaTeaserV3Item, @l AdvertDetailsAutotekaSelectTeaserItem advertDetailsAutotekaSelectTeaserItem, @l PersistableSpannedItem persistableSpannedItem, @l AdvertDetailsB2CBottomItem advertDetailsB2CBottomItem, @l AdvertBadgeBarItem advertBadgeBarItem, @l AdvertDetailsBadgeBarLightItem advertDetailsBadgeBarLightItem, @l BrandingAdvantagesBlockItem brandingAdvantagesBlockItem, @l BrandingGalleryBlockItem brandingGalleryBlockItem, @l BuzzoolaCreditBannerItem buzzoolaCreditBannerItem, @l AdvertDetailsCampaignsItem advertDetailsCampaignsItem, @l AdvertDetailsCarBodyConditionItem advertDetailsCarBodyConditionItem, @l ChatHistoryItem chatHistoryItem, @l AdvertDetailsFlatsItem advertDetailsFlatsItem2, @l AdvertDetailsClosingReasonItem advertDetailsClosingReasonItem, @l AdvertDetailsCompositeBrokerV1Item advertDetailsCompositeBrokerV1Item, @l AdvertDetailsCompositeBrokerV2Item advertDetailsCompositeBrokerV2Item, @l ConsultationAfterIceBreakersItem consultationAfterIceBreakersItem, @l ConsultationButtonItem consultationButtonItem, @l AdvertDetailsConsultationItem advertDetailsConsultationItem, @l AdvertDetailsContactBarItem advertDetailsContactBarItem, @l InstallmentsBlockItem installmentsBlockItem, @l CreditCalculatorItem creditCalculatorItem, @l CreditBrokerLinkItem creditBrokerLinkItem, @l AdvertCvPhoneActualizationItem advertCvPhoneActualizationItem, @l AdvertCvStateItem advertCvStateItem, @l AdvertCvInfoItem advertCvInfoItem, @l CvMotivationBannerItem cvMotivationBannerItem, @l AdvertDetailsDeliverySuggestsItem advertDetailsDeliverySuggestsItem, @l DeliveryTrustFactorsItem deliveryTrustFactorsItem, @l AdvertDetailsDescriptionItem advertDetailsDescriptionItem, @l DeveloperButtonItem developerButtonItem, @l AdvertDetailsFlatsItem advertDetailsFlatsItem3, @l DeveloperTrustItem developerTrustItem, @l DevelopmentOffersItem developmentOffersItem, @l AdvertDetailsDisclaimerItem advertDetailsDisclaimerItem, @l DisclaimerPDItem disclaimerPDItem, @l AdvertDetailsDockingBadgeBarItem advertDetailsDockingBadgeBarItem, @l AdvertDetailsDomotekaReportTeaserItem advertDetailsDomotekaReportTeaserItem, @l AdvertDetailsDomotekaTeaserItem advertDetailsDomotekaTeaserItem, @l DynamicConsultationAfterIceBreakersItem dynamicConsultationAfterIceBreakersItem, @l EarlyAccessAdvertItem earlyAccessAdvertItem, @l EquipmentsItem equipmentsItem, @l AdvertDetailsEquipmentsTileItem advertDetailsEquipmentsTileItem, @l List list2, @l AdvertDetailsFmpBannerItem advertDetailsFmpBannerItem, @l AdvertDetailsFmpCalculatorItem advertDetailsFmpCalculatorItem, @l AdvertDetailsFmpOfferItem advertDetailsFmpOfferItem, @l AdvertDetailsFmpProductsItem advertDetailsFmpProductsItem, @l CarouselPhotoGalleryItem carouselPhotoGalleryItem, @l AdvertDetailsGalleryItem advertDetailsGalleryItem, @l GarageCompatibilityV2Item garageCompatibilityV2Item, @l GarageCompatibilityV3Item garageCompatibilityV3Item, @l GarageCompatibilityV4Item garageCompatibilityV4Item, @l AdvertDetailsGeoMarketReportItem advertDetailsGeoMarketReportItem, @l List list3, @l AdvertDetailsGeoZonesItem advertDetailsGeoZonesItem, @l AdvertDetailsGroupsItem advertDetailsGroupsItem, @l AdvertDetailsReviewsScoreItem advertDetailsReviewsScoreItem2, @l AdvertHotelDescriptionItem advertHotelDescriptionItem, @l AdvertHotelDescriptionItem advertHotelDescriptionItem2, @l StyledTitleItem styledTitleItem, @l AdvertDetailsHotelOfferItem advertDetailsHotelOfferItem, @l AdvertHotelPromoWidgetItem advertHotelPromoWidgetItem, @l AdvertHotelReviewItem advertHotelReviewItem, @l IceBreakersItem iceBreakersItem, @l IcebreakersRedesignItem icebreakersRedesignItem, @l ImvCarsV4Item imvCarsV4Item, @l AdvertJobSearchStatusItem advertJobSearchStatusItem, @l SeekerResponsesInfoItemV2 seekerResponsesInfoItemV2, @l AdvertDetailsLeasingBeduinItem advertDetailsLeasingBeduinItem, @l AdvertDetailsLeasingCalculatorItem advertDetailsLeasingCalculatorItem, @l AdvertDetailsLeasingLinkItem advertDetailsLeasingLinkItem, @l MarketplaceSalesBannerItem marketplaceSalesBannerItem, @l MarketplaceSalesAdvertPromoBannerItem marketplaceSalesAdvertPromoBannerItem, @l MarketplaceSalesBannerOutOfBoundsItem marketplaceSalesBannerOutOfBoundsItem, @l MarketplaceStocksItem marketplaceStocksItem, @l MortgageCalculatorItem mortgageCalculatorItem, @l MortgageSnippetItem mortgageSnippetItem, @l AdvertDetailsMultiItemItem advertDetailsMultiItemItem, @l AdvertDetailsNoteItem advertDetailsNoteItem, @l OffersItem offersItem, @l OwnershipCostItem ownershipCostItem, @l AdvertDetailsParkingAddressItem advertDetailsParkingAddressItem, @l AdvertDetailsPopularityInfoItem advertDetailsPopularityInfoItem, @l AdvertDetailsPortfolioBlockItem advertDetailsPortfolioBlockItem, @l AdvertDetailsPpRecallPromoItem advertDetailsPpRecallPromoItem, @l AdvertDetailsComfortableDealPromoItem advertDetailsComfortableDealPromoItem, @l PriceComparisonItem priceComparisonItem, @l PersistableSpannedItem persistableSpannedItem2, @l PersistableSpannedItem persistableSpannedItem3, @l AdvertDetailsPriceDescriptionButtonItem advertDetailsPriceDescriptionButtonItem, @l AdvertPriceListPreviewItem advertPriceListPreviewItem, @l AdvertDetailsPrivacyDisclaimerItem advertDetailsPrivacyDisclaimerItem, @l PromoMechanicsItem promoMechanicsItem, @l AdvertDetailsRatingPublishItem advertDetailsRatingPublishItem, @l InformationAboutItem informationAboutItem, @l RealtyImvItem realtyImvItem, @l RealtyQuizBannerItem realtyQuizBannerItem, @l RecallMeBlockItem recallMeBlockItem, @l AdvertDetailsFlatsItem advertDetailsFlatsItem4, @l AdvertDetailsRepairCalculatorItem advertDetailsRepairCalculatorItem, @l BlockItem blockItem, @l AdvertReservationInfoItem advertReservationInfoItem, @l PersistableSpannedItem persistableSpannedItem4, @l AdvertDetailsSafeDealInfoItem advertDetailsSafeDealInfoItem, @l AdvertDetailsSafeDealPaymentBlockItem advertDetailsSafeDealPaymentBlockItem, @l AdvertDetailsSafeDealServicesItem advertDetailsSafeDealServicesItem, @k List list4, @l AdvertSalaryRangeItem advertSalaryRangeItem, @l AdvertDetailsScrollUpItem advertDetailsScrollUpItem, @l AdvertDetailsSearchSuggestsItem advertDetailsSearchSuggestsItem, @l SecondaryConsultationItem secondaryConsultationItem, @l AdvertDetailsSellerProfileItem advertDetailsSellerProfileItem, @l AdvertDetailsSellerSubscriptionItem advertDetailsSellerSubscriptionItem, @l ServiceBookingItem serviceBookingItem, @l ServiceEducationItem serviceEducationItem, @l ServiceOrderRequestItem serviceOrderRequestItem, @l AdvertDetailsServicesDiscountAndBuyerGiftItem advertDetailsServicesDiscountAndBuyerGiftItem, @l ServicesPriceItem servicesPriceItem, @l ServicesReviewVolunteersItem servicesReviewVolunteersItem, @l ServicesTitleItem servicesTitleItem, @l AdvertDetailsShortTermRentItemDiscountItem advertDetailsShortTermRentItemDiscountItem, @l AdvertDetailsShortTermRentStrButtonsItem advertDetailsShortTermRentStrButtonsItem, @l AdvertDetailsShowDescriptionItem advertDetailsShowDescriptionItem, @l AdvertDetailsShowOnMapItem advertDetailsShowOnMapItem, @l AdvertDetailsShowOnMapItem advertDetailsShowOnMapItem2, @l AdvertDetailsSimilarsButtonItem advertDetailsSimilarsButtonItem, @l SparePartsCostItem sparePartsCostItem, @l AdvertDetailsStickedSalesBannerItem advertDetailsStickedSalesBannerItem, @l PersistableSpannedItem persistableSpannedItem5, @l AdvertDetailsTitleItem advertDetailsTitleItem, @l StyledTitleItem styledTitleItem2, @l AdvertVerificationItem advertVerificationItem, @l AdvertVideoCallRequestItem advertVideoCallRequestItem, @l WalletInfoItem walletInfoItem, @l AdvertDetailsServicesWorkTimeItem advertDetailsServicesWorkTimeItem, @l AutoNewCarsLeadFormItem autoNewCarsLeadFormItem, @l MarketplaceRewardsBannerItem marketplaceRewardsBannerItem, @l BuyerTrustBannerItem buyerTrustBannerItem, @k com.avito.android.util.bottom_gap.d dVar) {
        this.f76707b = advertDetails;
        this.f76711c = str;
        this.f76715d = aVar;
        this.f76719e = c43617a;
        this.f76723f = str2;
        this.f76727g = p02;
        this.f76731h = developmentOffersPosition;
        this.f76735i = linkedHashMap;
        this.f76739j = aVar2;
        this.f76743k = z12;
        this.f76747l = list;
        this.f76751m = z02;
        this.f76755n = offersPosition;
        this.f76759o = interfaceC28240u;
        this.f76763p = lVar;
        this.f76767q = b22;
        this.f76771r = a42;
        this.f76775s = position;
        this.f76779t = d42;
        this.f76783u = aVar3;
        this.f76787v = jVar;
        this.f76791w = i12;
        this.f76795x = lVar2;
        this.f76799y = advertDetailsAbuseItem;
        this.f76803z = additionalSellerButtonItem;
        this.f76614A = additionalSellerFeaturesItem;
        this.f76618B = advertDetailsFlatsItem;
        this.f76622C = advertDetailsReviewsScoreItem;
        this.f76626D = additionalSellerTitleItem;
        this.f76630E = advertDetailsSxAddressesHeaderItem;
        this.f76634F = addressCentrityBlockItem;
        this.f76638G = advertDetailsAddressGeoDistanceItem;
        this.f76642H = addressHint;
        this.f76646I = advertDetailsAddressItem;
        this.f76650J = advertDetailsAdvertNumberItem;
        this.f76654K = advertServiceAppFillingButtonItem;
        this.f76658L = advertServiceAppFillingInfoItem;
        this.f76662M = advertDetailsAmenitiesItem;
        this.f76665N = advertDetailsAnchorTrustFactorsItem;
        this.f76668O = advertDetailsAutoLoansItem;
        this.f76671P = autoPickerBannerItem;
        this.f76674Q = autoSelectBannerItem;
        this.f76677R = autoSelectBookingItem;
        this.f76680S = autoSelectControlsItem;
        this.f76683T = advertDetailsAutoSelectItem;
        this.f76686U = autoSelectManagerInfoItem;
        this.f76689V = autoSelectNoClickContactItem;
        this.f76692W = autoSelectParametersV2Item;
        this.f76695X = autoSelectParametersV3Item;
        this.f76698Y = autoSelectTeaserItem;
        this.f76701Z = advertDetailsAutotekaTeaserItem;
        this.f76704a0 = advertDetailsAutotekaTeaserV2Item;
        this.f76708b0 = advertDetailsAutotekaTeaserV3Item;
        this.f76712c0 = advertDetailsAutotekaSelectTeaserItem;
        this.f76716d0 = persistableSpannedItem;
        this.f76720e0 = advertDetailsB2CBottomItem;
        this.f76724f0 = advertBadgeBarItem;
        this.f76728g0 = advertDetailsBadgeBarLightItem;
        this.f76732h0 = brandingAdvantagesBlockItem;
        this.f76736i0 = brandingGalleryBlockItem;
        this.f76740j0 = buzzoolaCreditBannerItem;
        this.f76744k0 = advertDetailsCampaignsItem;
        this.f76748l0 = advertDetailsCarBodyConditionItem;
        this.f76752m0 = chatHistoryItem;
        this.f76756n0 = advertDetailsFlatsItem2;
        this.f76760o0 = advertDetailsClosingReasonItem;
        this.f76764p0 = advertDetailsCompositeBrokerV1Item;
        this.f76768q0 = advertDetailsCompositeBrokerV2Item;
        this.f76772r0 = consultationAfterIceBreakersItem;
        this.f76776s0 = consultationButtonItem;
        this.f76780t0 = advertDetailsConsultationItem;
        this.f76784u0 = advertDetailsContactBarItem;
        this.f76788v0 = installmentsBlockItem;
        this.f76792w0 = creditCalculatorItem;
        this.f76796x0 = creditBrokerLinkItem;
        this.f76800y0 = advertCvPhoneActualizationItem;
        this.f76804z0 = advertCvStateItem;
        this.f76615A0 = advertCvInfoItem;
        this.f76619B0 = cvMotivationBannerItem;
        this.f76623C0 = advertDetailsDeliverySuggestsItem;
        this.f76627D0 = deliveryTrustFactorsItem;
        this.f76631E0 = advertDetailsDescriptionItem;
        this.f76635F0 = developerButtonItem;
        this.f76639G0 = advertDetailsFlatsItem3;
        this.f76643H0 = developerTrustItem;
        this.f76647I0 = developmentOffersItem;
        this.f76651J0 = advertDetailsDisclaimerItem;
        this.f76655K0 = disclaimerPDItem;
        this.f76659L0 = advertDetailsDockingBadgeBarItem;
        this.f76663M0 = advertDetailsDomotekaReportTeaserItem;
        this.f76666N0 = advertDetailsDomotekaTeaserItem;
        this.f76669O0 = dynamicConsultationAfterIceBreakersItem;
        this.f76672P0 = earlyAccessAdvertItem;
        this.f76675Q0 = equipmentsItem;
        this.f76678R0 = advertDetailsEquipmentsTileItem;
        this.f76681S0 = list2;
        this.f76684T0 = advertDetailsFmpBannerItem;
        this.f76687U0 = advertDetailsFmpCalculatorItem;
        this.f76690V0 = advertDetailsFmpOfferItem;
        this.f76693W0 = advertDetailsFmpProductsItem;
        this.f76696X0 = carouselPhotoGalleryItem;
        this.f76699Y0 = advertDetailsGalleryItem;
        this.f76702Z0 = garageCompatibilityV2Item;
        this.f76705a1 = garageCompatibilityV3Item;
        this.f76709b1 = garageCompatibilityV4Item;
        this.f76713c1 = advertDetailsGeoMarketReportItem;
        this.f76717d1 = list3;
        this.f76721e1 = advertDetailsGeoZonesItem;
        this.f76725f1 = advertDetailsGroupsItem;
        this.f76729g1 = advertDetailsReviewsScoreItem2;
        this.f76733h1 = advertHotelDescriptionItem;
        this.f76737i1 = advertHotelDescriptionItem2;
        this.f76741j1 = styledTitleItem;
        this.f76745k1 = advertDetailsHotelOfferItem;
        this.f76749l1 = advertHotelPromoWidgetItem;
        this.f76753m1 = advertHotelReviewItem;
        this.f76757n1 = iceBreakersItem;
        this.f76761o1 = icebreakersRedesignItem;
        this.f76765p1 = imvCarsV4Item;
        this.f76769q1 = advertJobSearchStatusItem;
        this.f76773r1 = seekerResponsesInfoItemV2;
        this.f76777s1 = advertDetailsLeasingBeduinItem;
        this.f76781t1 = advertDetailsLeasingCalculatorItem;
        this.f76785u1 = advertDetailsLeasingLinkItem;
        this.f76789v1 = marketplaceSalesBannerItem;
        this.f76793w1 = marketplaceSalesAdvertPromoBannerItem;
        this.f76797x1 = marketplaceSalesBannerOutOfBoundsItem;
        this.f76801y1 = marketplaceStocksItem;
        this.f76805z1 = mortgageCalculatorItem;
        this.f76616A1 = mortgageSnippetItem;
        this.f76620B1 = advertDetailsMultiItemItem;
        this.f76624C1 = advertDetailsNoteItem;
        this.f76628D1 = offersItem;
        this.f76632E1 = ownershipCostItem;
        this.f76636F1 = advertDetailsParkingAddressItem;
        this.f76640G1 = advertDetailsPopularityInfoItem;
        this.f76644H1 = advertDetailsPortfolioBlockItem;
        this.f76648I1 = advertDetailsPpRecallPromoItem;
        this.f76652J1 = advertDetailsComfortableDealPromoItem;
        this.f76656K1 = priceComparisonItem;
        this.f76660L1 = persistableSpannedItem2;
        this.f76664M1 = persistableSpannedItem3;
        this.f76667N1 = advertDetailsPriceDescriptionButtonItem;
        this.f76670O1 = advertPriceListPreviewItem;
        this.f76673P1 = advertDetailsPrivacyDisclaimerItem;
        this.f76676Q1 = promoMechanicsItem;
        this.f76679R1 = advertDetailsRatingPublishItem;
        this.f76682S1 = informationAboutItem;
        this.f76685T1 = realtyImvItem;
        this.f76688U1 = realtyQuizBannerItem;
        this.f76691V1 = recallMeBlockItem;
        this.f76694W1 = advertDetailsFlatsItem4;
        this.f76697X1 = advertDetailsRepairCalculatorItem;
        this.f76700Y1 = blockItem;
        this.f76703Z1 = advertReservationInfoItem;
        this.f76706a2 = persistableSpannedItem4;
        this.f76710b2 = advertDetailsSafeDealInfoItem;
        this.f76714c2 = advertDetailsSafeDealPaymentBlockItem;
        this.f76718d2 = advertDetailsSafeDealServicesItem;
        this.f76722e2 = list4;
        this.f76726f2 = advertSalaryRangeItem;
        this.f76730g2 = advertDetailsScrollUpItem;
        this.f76734h2 = advertDetailsSearchSuggestsItem;
        this.f76738i2 = secondaryConsultationItem;
        this.f76742j2 = advertDetailsSellerProfileItem;
        this.f76746k2 = advertDetailsSellerSubscriptionItem;
        this.f76750l2 = serviceBookingItem;
        this.f76754m2 = serviceEducationItem;
        this.f76758n2 = serviceOrderRequestItem;
        this.f76762o2 = advertDetailsServicesDiscountAndBuyerGiftItem;
        this.f76766p2 = servicesPriceItem;
        this.f76770q2 = servicesReviewVolunteersItem;
        this.f76774r2 = servicesTitleItem;
        this.f76778s2 = advertDetailsShortTermRentItemDiscountItem;
        this.f76782t2 = advertDetailsShortTermRentStrButtonsItem;
        this.f76786u2 = advertDetailsShowDescriptionItem;
        this.f76790v2 = advertDetailsShowOnMapItem;
        this.f76794w2 = advertDetailsShowOnMapItem2;
        this.f76798x2 = advertDetailsSimilarsButtonItem;
        this.f76802y2 = sparePartsCostItem;
        this.f76806z2 = advertDetailsStickedSalesBannerItem;
        this.f76617A2 = persistableSpannedItem5;
        this.f76621B2 = advertDetailsTitleItem;
        this.f76625C2 = styledTitleItem2;
        this.f76629D2 = advertVerificationItem;
        this.f76633E2 = advertVideoCallRequestItem;
        this.f76637F2 = walletInfoItem;
        this.f76641G2 = advertDetailsServicesWorkTimeItem;
        this.f76645H2 = autoNewCarsLeadFormItem;
        this.f76649I2 = marketplaceRewardsBannerItem;
        this.f76653J2 = buyerTrustBannerItem;
        this.f76657K2 = dVar;
    }

    public static void c(b bVar) {
        bVar.f76661L2.add(new AdvertDetailsDividerItem(0L, null, 20, 0, bVar.f76787v.a(), null, null, null, 227, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:1039:0x134c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:1062:0x13a9  */
    /* JADX WARN: Removed duplicated region for block: B:1063:0x13ac  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:1152:0x152a  */
    /* JADX WARN: Removed duplicated region for block: B:1158:0x153e  */
    /* JADX WARN: Removed duplicated region for block: B:1161:0x1542  */
    /* JADX WARN: Removed duplicated region for block: B:1162:0x1545  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x052f A[PHI: r25 r31
  0x052f: PHI (r25v9 com.avito.android.advert_details_items.photogallery.AdvertDetailsGalleryItem) = 
  (r25v10 com.avito.android.advert_details_items.photogallery.AdvertDetailsGalleryItem)
  (r25v13 com.avito.android.advert_details_items.photogallery.AdvertDetailsGalleryItem)
 binds: [B:269:0x053b, B:264:0x052c] A[DONT_GENERATE, DONT_INLINE]
  0x052f: PHI (r31v5 com.avito.android.advert_core.price_list.preview.AdvertPriceListPreviewItem) = 
  (r31v6 com.avito.android.advert_core.price_list.preview.AdvertPriceListPreviewItem)
  (r31v8 com.avito.android.advert_core.price_list.preview.AdvertPriceListPreviewItem)
 binds: [B:269:0x053b, B:264:0x052c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x07e5  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x08d8  */
    /* JADX WARN: Removed duplicated region for block: B:570:0x0ab8  */
    /* JADX WARN: Removed duplicated region for block: B:572:0x0abc  */
    /* JADX WARN: Removed duplicated region for block: B:573:0x0acc  */
    /* JADX WARN: Removed duplicated region for block: B:576:0x0ad1  */
    /* JADX WARN: Removed duplicated region for block: B:710:0x0d5e  */
    /* JADX WARN: Removed duplicated region for block: B:933:0x1187  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01fe  */
    @Override // com.avito.android.advert.item.items_list_builder.c
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.advert.item.items_list_builder.e a() {
        /*
            Method dump skipped, instructions count: 5626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.items_list_builder.b.a():com.avito.android.advert.item.items_list_builder.e");
    }

    public final void b(int i12) {
        this.f76661L2.add(new AdvertDetailsDividerItem(0L, null, i12, i12, this.f76787v.a(), null, null, null, 227, null));
    }

    public final List<PersistableSpannedItem> d(List<PersistableSpannedItem> list) {
        AdvertDetailsBadgeBarLightItem advertDetailsBadgeBarLightItem = this.f76728g0;
        if (advertDetailsBadgeBarLightItem != null && advertDetailsBadgeBarLightItem.f72680e) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            PersistableSpannedItem persistableSpannedItem = (PersistableSpannedItem) obj;
            arrayList.add(persistableSpannedItem);
            PersistableSpannedItem persistableSpannedItem2 = (PersistableSpannedItem) C42745f0.K(i13, list);
            if ((persistableSpannedItem instanceof AdvertDetailsGalleryItem) && !(persistableSpannedItem2 instanceof AdvertDetailsGapItem)) {
                arrayList.add(f(16));
            }
            i12 = i13;
        }
        return arrayList;
    }

    public final void e(AdvertDetails advertDetails) {
        AdvertDetailsMultiItemItem advertDetailsMultiItemItem = this.f76620B1;
        if (advertDetailsMultiItemItem == null) {
            return;
        }
        if (!advertDetails.isRedesign()) {
            this.f76661L2.add(f(10));
            this.f76661L2.add(advertDetailsMultiItemItem);
            this.f76661L2.add(f(6));
        } else {
            this.f76661L2.add(f(16));
            this.f76661L2.add(advertDetailsMultiItemItem);
            Integer num = !this.f76722e2.isEmpty() ? 2 : this.f76784u0 != null ? 10 : null;
            if (num != null) {
                this.f76661L2.add(f(num.intValue()));
            }
        }
    }

    public final AdvertDetailsGapItem f(int i12) {
        AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
        return new AdvertDetailsGapItem(52, null, i12, this.f76787v.a(), null, null, 50, null);
    }

    public final void g() {
        Object objRemove;
        AdvertDetails advertDetails = this.f76707b;
        if (advertDetails == null) {
            return;
        }
        AdditionalSellerTitleItem additionalSellerTitleItem = this.f76626D;
        if (additionalSellerTitleItem != null) {
            this.f76661L2.add(additionalSellerTitleItem);
            this.f76661L2.add(f(8));
        }
        AdvertDetailsReviewsScoreItem advertDetailsReviewsScoreItem = this.f76622C;
        if (advertDetailsReviewsScoreItem != null) {
            this.f76661L2.add(advertDetailsReviewsScoreItem);
            this.f76661L2.add(f(2));
        }
        int i12 = 12;
        AdvertDetailsFlatsItem advertDetailsFlatsItem = this.f76618B;
        if (advertDetailsFlatsItem != null) {
            if (!(C42745f0.S(this.f76661L2) instanceof AdvertDetailsGapItem)) {
                this.f76661L2.add(f(16));
            }
            this.f76661L2.add(advertDetailsFlatsItem);
            objRemove = this.f76735i.remove(Long.valueOf(advertDetailsFlatsItem.f84654b));
            ExpandItemsButtonItem expandItemsButtonItem = (ExpandItemsButtonItem) objRemove;
            if (expandItemsButtonItem != null) {
                this.f76661L2.add(expandItemsButtonItem);
                this.f76661L2.add(f(12));
            } else if (!advertDetails.isRedesign()) {
                this.f76661L2.add(f(12));
            }
        } else {
            objRemove = null;
        }
        AdditionalSellerFeaturesItem additionalSellerFeaturesItem = this.f76614A;
        if (additionalSellerFeaturesItem != null) {
            this.f76661L2.add(f(objRemove != null ? 20 : 12));
            this.f76661L2.add(additionalSellerFeaturesItem);
        }
        AdditionalSellerButtonItem additionalSellerButtonItem = this.f76803z;
        if (additionalSellerButtonItem != null) {
            List<PersistableSpannedItem> list = this.f76661L2;
            if (additionalSellerFeaturesItem != null) {
                i12 = 24;
            } else if (objRemove != null) {
                i12 = 20;
            }
            list.add(f(i12));
            this.f76661L2.add(additionalSellerButtonItem);
        }
    }

    public final void h(AdvertDetails advertDetails, boolean z12) {
        G0 g02;
        Object next;
        G0 g03;
        if (z12) {
            GarageCompatibilityV3Item garageCompatibilityV3Item = this.f76705a1;
            if (garageCompatibilityV3Item != null) {
                this.f76661L2.add(f(20));
                this.f76661L2.add(garageCompatibilityV3Item);
            }
            List<AdvertDetailsFlatsItem> list = this.f76681S0;
            boolean zA2 = O2.a(list);
            IceBreakersItem iceBreakersItem = this.f76757n1;
            u3.l<RiseIcebreakersItemTestGroup> lVar = this.f76763p;
            boolean z13 = this.f76743k;
            if (zA2 && z13) {
                RiseIcebreakersItemTestGroup riseIcebreakersItemTestGroup = lVar.f439745a.f439749b;
                riseIcebreakersItemTestGroup.getClass();
                if (riseIcebreakersItemTestGroup == RiseIcebreakersItemTestGroup.f67919e) {
                    if (C42745f0.S(this.f76661L2) instanceof AdvertDetailsNoteItem) {
                        this.f76661L2.add(f(18));
                    }
                    if (iceBreakersItem != null) {
                        this.f76661L2.add(iceBreakersItem);
                    }
                    this.f76661L2.add(f(20));
                }
            }
            LinkedHashMap linkedHashMap = this.f76735i;
            G0 g04 = null;
            if (list != null) {
                int i12 = 0;
                for (Object obj : list) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    AdvertDetailsFlatsItem advertDetailsFlatsItem = (AdvertDetailsFlatsItem) obj;
                    if (i12 == 0 && advertDetailsFlatsItem.f84658f != null && ((this.f76750l2 == null || advertDetails.isRedesign()) && !(C42745f0.S(this.f76661L2) instanceof IceBreakersItem) && !(C42745f0.S(this.f76661L2) instanceof AdvertDetailsGapItem))) {
                        this.f76661L2.add(f(this.f76755n == OffersPosition.BEFORE_ALL_PARAMETERS ? 12 : 16));
                    }
                    Iterator<T> it = advertDetailsFlatsItem.f84656d.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            if (((AdvertParameters.Parameter) next).getDeepLink() instanceof ServicesRealtySheetLink) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    AdvertParameters.Parameter parameter = (AdvertParameters.Parameter) next;
                    if (parameter != null) {
                        this.f76715d.B1(String.valueOf(((ServicesRealtySheetLink) parameter.getDeepLink()).f280421e));
                    }
                    this.f76661L2.add(advertDetailsFlatsItem);
                    ExpandItemsButtonItem expandItemsButtonItem = (ExpandItemsButtonItem) linkedHashMap.remove(Long.valueOf(advertDetailsFlatsItem.f84654b));
                    if (expandItemsButtonItem != null) {
                        this.f76661L2.add(expandItemsButtonItem);
                        if (!advertDetails.isRedesign()) {
                            this.f76661L2.add(f(12));
                        }
                        g03 = G0.f406611a;
                    } else {
                        g03 = null;
                    }
                    if (g03 == null && !advertDetails.isRedesign()) {
                        this.f76661L2.add(f(12));
                    }
                    i12 = i13;
                }
            }
            if (O2.a(list) && z13) {
                RiseIcebreakersItemTestGroup riseIcebreakersItemTestGroup2 = lVar.f439745a.f439749b;
                riseIcebreakersItemTestGroup2.getClass();
                if (riseIcebreakersItemTestGroup2 == RiseIcebreakersItemTestGroup.f67918d) {
                    if ((C42745f0.S(this.f76661L2) instanceof AdvertDetailsFlatsItem) || (C42745f0.S(this.f76661L2) instanceof ExpandItemsButtonItem)) {
                        this.f76661L2.add(f(18));
                    }
                    if (iceBreakersItem != null) {
                        this.f76661L2.add(iceBreakersItem);
                    }
                }
            }
            EarlyAccessAdvertItem earlyAccessAdvertItem = this.f76672P0;
            if (earlyAccessAdvertItem != null) {
                this.f76661L2.add(f(16));
                this.f76661L2.add(earlyAccessAdvertItem);
            }
            AdvertDetailsFlatsItem advertDetailsFlatsItem2 = this.f76694W1;
            if (advertDetailsFlatsItem2 != null) {
                if (!(C42745f0.S(this.f76661L2) instanceof AdvertDetailsGapItem)) {
                    this.f76661L2.add(f(28));
                }
                this.f76661L2.add(advertDetailsFlatsItem2);
                ExpandItemsButtonItem expandItemsButtonItem2 = (ExpandItemsButtonItem) linkedHashMap.remove(Long.valueOf(advertDetailsFlatsItem2.f84654b));
                if (expandItemsButtonItem2 != null) {
                    this.f76661L2.add(expandItemsButtonItem2);
                    if (!advertDetails.isRedesign()) {
                        this.f76661L2.add(f(12));
                    }
                    g02 = G0.f406611a;
                } else {
                    g02 = null;
                }
                if (g02 == null && !advertDetails.isRedesign()) {
                    this.f76661L2.add(f(12));
                }
            }
            AdvertDetailsFlatsItem advertDetailsFlatsItem3 = this.f76756n0;
            if (advertDetailsFlatsItem3 != null) {
                if (!(C42745f0.S(this.f76661L2) instanceof AdvertDetailsGapItem)) {
                    this.f76661L2.add(f(28));
                }
                this.f76661L2.add(advertDetailsFlatsItem3);
                ExpandItemsButtonItem expandItemsButtonItem3 = (ExpandItemsButtonItem) linkedHashMap.remove(Long.valueOf(advertDetailsFlatsItem3.f84654b));
                if (expandItemsButtonItem3 != null) {
                    this.f76661L2.add(expandItemsButtonItem3);
                    if (!advertDetails.isRedesign()) {
                        this.f76661L2.add(f(12));
                    }
                    g04 = G0.f406611a;
                }
                if (g04 != null || advertDetails.isRedesign()) {
                    return;
                }
                this.f76661L2.add(f(12));
            }
        }
    }

    public final void i(boolean z12, boolean z13) {
        int i12;
        if (z12) {
            List<AdvertDetailsFlatsItem> list = this.f76681S0;
            IceBreakersItem iceBreakersItem = this.f76757n1;
            u3.l<RiseIcebreakersItemTestGroup> lVar = this.f76763p;
            boolean z14 = this.f76743k;
            if ((list == null || list.isEmpty()) && z14) {
                RiseIcebreakersItemTestGroup riseIcebreakersItemTestGroup = lVar.f439745a.f439749b;
                riseIcebreakersItemTestGroup.getClass();
                if (riseIcebreakersItemTestGroup == RiseIcebreakersItemTestGroup.f67919e && iceBreakersItem != null) {
                    this.f76661L2.add(iceBreakersItem);
                }
            }
            AdvertDetailsDescriptionItem advertDetailsDescriptionItem = this.f76631E0;
            if (advertDetailsDescriptionItem != null) {
                if (z13) {
                    String strG = this.f76759o.g();
                    PersistableSpannedItem persistableSpannedItem = (PersistableSpannedItem) C42745f0.S(this.f76661L2);
                    boolean z15 = persistableSpannedItem instanceof AdvertPriceListPreviewItem;
                    AdvertDetails advertDetails = this.f76707b;
                    if (z15) {
                        String str = ((AdvertPriceListPreviewItem) persistableSpannedItem).f84113h;
                        i12 = (str == null || str.length() == 0) ? 20 : 28;
                    } else {
                        i12 = (advertDetails == null || !advertDetails.isRedesign()) ? 12 : 32;
                    }
                    this.f76661L2.add(this.f76727g.a(Integer.valueOf(i12), Integer.valueOf(((advertDetails == null || !advertDetails.isRestyle()) && (advertDetails == null || !advertDetails.isRealtyRedesign())) ? R.attr.textHeadingLarge : R.attr.textH2), null, strG));
                }
                this.f76661L2.add(advertDetailsDescriptionItem);
            }
            if ((list == null || list.isEmpty()) && z14) {
                RiseIcebreakersItemTestGroup riseIcebreakersItemTestGroup2 = lVar.f439745a.f439749b;
                riseIcebreakersItemTestGroup2.getClass();
                if (riseIcebreakersItemTestGroup2 != RiseIcebreakersItemTestGroup.f67918d || iceBreakersItem == null) {
                    return;
                }
                this.f76661L2.add(iceBreakersItem);
            }
        }
    }

    public final boolean j(AdvertDetails advertDetails) {
        ItemCardRedesign itemCardRedesign = advertDetails.getItemCardRedesign();
        if (!(itemCardRedesign != null ? L.f(itemCardRedesign.getIsPriceListOnTopPosition(), Boolean.TRUE) : false)) {
            return false;
        }
        B2 b22 = this.f76767q;
        b22.getClass();
        n<Object> nVar = B2.f67184X[6];
        return ((Boolean) b22.f67214h.a().invoke()).booleanValue();
    }

    public final boolean k(AdvertDetails advertDetails) {
        return this.f76779t.a(advertDetails) || this.f76771r.a(advertDetails);
    }
}
