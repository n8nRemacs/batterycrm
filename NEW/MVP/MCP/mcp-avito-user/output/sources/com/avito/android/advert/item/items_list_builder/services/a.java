package com.avito.android.advert.item.items_list_builder.services;

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
import com.avito.android.advert.item.gig.documents.GigPersonalInfoItem;
import com.avito.android.advert.item.gig.duties.AdvertDetailsDutiesItem;
import com.avito.android.advert.item.gig.seller.AdvertDetailsGigSellerItem;
import com.avito.android.advert.item.gig.similar_shifts.AdvertDetailsSimilarShiftsItem;
import com.avito.android.advert.item.groups.AdvertDetailsGroupsItem;
import com.avito.android.advert.item.hotel.hotel_description.AdvertHotelDescriptionItem;
import com.avito.android.advert.item.hotel.hotel_offer.konveyor.main.AdvertDetailsHotelOfferItem;
import com.avito.android.advert.item.hotel.hotel_promo_widget.AdvertHotelPromoWidgetItem;
import com.avito.android.advert.item.hotel.hotel_review.AdvertHotelReviewItem;
import com.avito.android.advert.item.icebreakers.IceBreakersItem;
import com.avito.android.advert.item.installments.InstallmentsBlockItem;
import com.avito.android.advert.item.interiorPhotos.InteriorPhotosItem;
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
import com.avito.android.advert.item.reusable_amenities.AmenitiesItem;
import com.avito.android.advert.item.reviews.AdvertDetailsModelReviewItem;
import com.avito.android.advert.item.reviews.AdvertDetailsReviewItem;
import com.avito.android.advert.item.reviews.AdvertDetailsReviewsScoreItem;
import com.avito.android.advert.item.reviews.entries.AdvertReviewsStatisticItem;
import com.avito.android.advert.item.reviews.info.AdvertDetailsReviewsInfoItem;
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
import com.avito.android.advert.item.short_term_rent.payment_toggles.AdvertDetailsTravelPaymentTogglesItem;
import com.avito.android.advert.item.short_term_rent.str_buttons.AdvertDetailsShortTermRentStrButtonsItem;
import com.avito.android.advert.item.show_on_map.AdvertDetailsShowOnMapItem;
import com.avito.android.advert.item.similars.j;
import com.avito.android.advert.item.similars_button.AdvertDetailsSimilarsButtonItem;
import com.avito.android.advert.item.sparePartsCost.SparePartsCostItem;
import com.avito.android.advert.item.styled_title.StyledTitleItem;
import com.avito.android.advert.item.sx_addresses_header.AdvertDetailsSxAddressesHeaderItem;
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
import com.avito.android.advert_core.map.AdvertMapItem;
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
import com.avito.android.credits.q;
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
import com.avito.android.service_transportation_info.advert_details.geo.AdvertDetailsServicesTransportationGeoItem;
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

/* compiled from: ServicesItemListBuilder.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/items_list_builder/services/a;", "Lcom/avito/android/advert/item/items_list_builder/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements com.avito.android.advert.item.items_list_builder.c {

    /* renamed from: A, reason: collision with root package name */
    @l
    public final AdditionalSellerButtonItem f76984A;

    /* renamed from: A0, reason: collision with root package name */
    @l
    public final AdvertCvStateItem f76985A0;

    /* renamed from: A1, reason: collision with root package name */
    @l
    public final MortgageCalculatorItem f76986A1;

    /* renamed from: A2, reason: collision with root package name */
    @l
    public final AdvertDetailsSimilarsButtonItem f76987A2;

    /* renamed from: B, reason: collision with root package name */
    @l
    public final AdditionalSellerFeaturesItem f76988B;

    /* renamed from: B0, reason: collision with root package name */
    @l
    public final AdvertCvInfoItem f76989B0;

    /* renamed from: B1, reason: collision with root package name */
    @l
    public final MortgageSnippetItem f76990B1;

    /* renamed from: B2, reason: collision with root package name */
    @l
    public final AdvertDetailsSimilarShiftsItem f76991B2;

    /* renamed from: C, reason: collision with root package name */
    @l
    public final AdvertDetailsFlatsItem f76992C;

    /* renamed from: C0, reason: collision with root package name */
    @l
    public final CvMotivationBannerItem f76993C0;

    /* renamed from: C1, reason: collision with root package name */
    @l
    public final AdvertDetailsMultiItemItem f76994C1;

    /* renamed from: C2, reason: collision with root package name */
    @l
    public final SparePartsCostItem f76995C2;

    /* renamed from: D, reason: collision with root package name */
    @l
    public final AdvertDetailsReviewsScoreItem f76996D;

    /* renamed from: D0, reason: collision with root package name */
    @l
    public final AdvertDetailsDeliverySuggestsItem f76997D0;

    /* renamed from: D1, reason: collision with root package name */
    @l
    public final AdvertDetailsNoteItem f76998D1;

    /* renamed from: D2, reason: collision with root package name */
    @l
    public final AdvertDetailsStickedSalesBannerItem f76999D2;

    /* renamed from: E, reason: collision with root package name */
    @l
    public final AdditionalSellerTitleItem f77000E;

    /* renamed from: E0, reason: collision with root package name */
    @l
    public final AdvertDetailsDescriptionItem f77001E0;

    /* renamed from: E1, reason: collision with root package name */
    @l
    public final OffersItem f77002E1;

    /* renamed from: E2, reason: collision with root package name */
    @l
    public final PersistableSpannedItem f77003E2;

    /* renamed from: F, reason: collision with root package name */
    @l
    public final AddressCentrityBlockItem f77004F;

    /* renamed from: F0, reason: collision with root package name */
    @l
    public final DeveloperButtonItem f77005F0;

    /* renamed from: F1, reason: collision with root package name */
    @l
    public final OwnershipCostItem f77006F1;

    /* renamed from: F2, reason: collision with root package name */
    @l
    public final AdvertDetailsTitleItem f77007F2;

    /* renamed from: G, reason: collision with root package name */
    @l
    public final AdvertDetailsAddressGeoDistanceItem f77008G;

    /* renamed from: G0, reason: collision with root package name */
    @l
    public final AdvertDetailsFlatsItem f77009G0;

    /* renamed from: G1, reason: collision with root package name */
    @l
    public final AdvertDetailsParkingAddressItem f77010G1;

    /* renamed from: G2, reason: collision with root package name */
    @l
    public final StyledTitleItem f77011G2;

    /* renamed from: H, reason: collision with root package name */
    @l
    public final AdvertDetailsSxAddressesHeaderItem f77012H;

    /* renamed from: H0, reason: collision with root package name */
    @l
    public final DeveloperTrustItem f77013H0;

    /* renamed from: H1, reason: collision with root package name */
    @l
    public final AdvertDetailsPopularityInfoItem f77014H1;

    /* renamed from: H2, reason: collision with root package name */
    @l
    public final AdvertVerificationItem f77015H2;

    /* renamed from: I, reason: collision with root package name */
    @l
    public final AddressHint f77016I;

    /* renamed from: I0, reason: collision with root package name */
    @l
    public final DevelopmentOffersItem f77017I0;

    /* renamed from: I1, reason: collision with root package name */
    @l
    public final AdvertDetailsPortfolioBlockItem f77018I1;

    /* renamed from: I2, reason: collision with root package name */
    @l
    public final AdvertVideoCallRequestItem f77019I2;

    /* renamed from: J, reason: collision with root package name */
    @l
    public final AdvertDetailsAddressItem f77020J;

    /* renamed from: J0, reason: collision with root package name */
    @l
    public final AdvertDetailsDisclaimerItem f77021J0;

    /* renamed from: J1, reason: collision with root package name */
    @l
    public final AdvertDetailsPpRecallPromoItem f77022J1;

    /* renamed from: J2, reason: collision with root package name */
    @l
    public final WalletInfoItem f77023J2;

    /* renamed from: K, reason: collision with root package name */
    @l
    public final AdvertDetailsAdvertNumberItem f77024K;

    /* renamed from: K0, reason: collision with root package name */
    @l
    public final DisclaimerPDItem f77025K0;

    /* renamed from: K1, reason: collision with root package name */
    @l
    public final AdvertDetailsComfortableDealPromoItem f77026K1;

    /* renamed from: K2, reason: collision with root package name */
    @l
    public final AdvertDetailsServicesWorkTimeItem f77027K2;

    /* renamed from: L, reason: collision with root package name */
    @l
    public final AdvertServiceAppFillingButtonItem f77028L;

    /* renamed from: L0, reason: collision with root package name */
    @l
    public final AdvertDetailsDockingBadgeBarItem f77029L0;

    /* renamed from: L1, reason: collision with root package name */
    @l
    public final PriceComparisonItem f77030L1;

    /* renamed from: L2, reason: collision with root package name */
    @l
    public final AutoNewCarsLeadFormItem f77031L2;

    /* renamed from: M, reason: collision with root package name */
    @l
    public final AdvertServiceAppFillingInfoItem f77032M;

    /* renamed from: M0, reason: collision with root package name */
    @l
    public final AdvertDetailsDomotekaReportTeaserItem f77033M0;

    /* renamed from: M1, reason: collision with root package name */
    @l
    public final PersistableSpannedItem f77034M1;

    /* renamed from: M2, reason: collision with root package name */
    @l
    public final MarketplaceRewardsBannerItem f77035M2;

    /* renamed from: N, reason: collision with root package name */
    @l
    public final AdvertDetailsAmenitiesItem f77036N;

    /* renamed from: N0, reason: collision with root package name */
    @l
    public final AdvertDetailsDomotekaTeaserItem f77037N0;

    /* renamed from: N1, reason: collision with root package name */
    @l
    public final PersistableSpannedItem f77038N1;

    /* renamed from: N2, reason: collision with root package name */
    @k
    public final com.avito.android.util.bottom_gap.d f77039N2;

    /* renamed from: O, reason: collision with root package name */
    @l
    public final AdvertDetailsAnchorTrustFactorsItem f77040O;

    /* renamed from: O0, reason: collision with root package name */
    @l
    public final DynamicConsultationAfterIceBreakersItem f77041O0;

    /* renamed from: O1, reason: collision with root package name */
    @l
    public final AdvertPriceListPreviewItem f77042O1;

    /* renamed from: O2, reason: collision with root package name */
    @k
    public List<PersistableSpannedItem> f77043O2 = new ArrayList();

    /* renamed from: P, reason: collision with root package name */
    @l
    public final AdvertDetailsAutoLoansItem f77044P;

    /* renamed from: P0, reason: collision with root package name */
    @l
    public final EarlyAccessAdvertItem f77045P0;

    /* renamed from: P1, reason: collision with root package name */
    @l
    public final AdvertDetailsPrivacyDisclaimerItem f77046P1;

    /* renamed from: Q, reason: collision with root package name */
    @l
    public final AutoPickerBannerItem f77047Q;

    /* renamed from: Q0, reason: collision with root package name */
    @l
    public final EquipmentsItem f77048Q0;

    /* renamed from: Q1, reason: collision with root package name */
    @l
    public final PromoMechanicsItem f77049Q1;

    /* renamed from: R, reason: collision with root package name */
    @l
    public final AutoSelectBannerItem f77050R;

    /* renamed from: R0, reason: collision with root package name */
    @l
    public final AdvertDetailsEquipmentsTileItem f77051R0;

    /* renamed from: R1, reason: collision with root package name */
    @l
    public final AdvertDetailsRatingPublishItem f77052R1;

    /* renamed from: S, reason: collision with root package name */
    @l
    public final AutoSelectBookingItem f77053S;

    /* renamed from: S0, reason: collision with root package name */
    @l
    public final List<AdvertDetailsFlatsItem> f77054S0;

    /* renamed from: S1, reason: collision with root package name */
    @l
    public final InformationAboutItem f77055S1;

    /* renamed from: T, reason: collision with root package name */
    @l
    public final AutoSelectControlsItem f77056T;

    /* renamed from: T0, reason: collision with root package name */
    @l
    public final AdvertDetailsFmpBannerItem f77057T0;

    /* renamed from: T1, reason: collision with root package name */
    @l
    public final RealtyImvItem f77058T1;

    /* renamed from: U, reason: collision with root package name */
    @l
    public final AdvertDetailsAutoSelectItem f77059U;

    /* renamed from: U0, reason: collision with root package name */
    @l
    public final AdvertDetailsFmpCalculatorItem f77060U0;

    /* renamed from: U1, reason: collision with root package name */
    @l
    public final RealtyQuizBannerItem f77061U1;

    /* renamed from: V, reason: collision with root package name */
    @l
    public final AutoSelectManagerInfoItem f77062V;

    /* renamed from: V0, reason: collision with root package name */
    @l
    public final AdvertDetailsFmpOfferItem f77063V0;

    /* renamed from: V1, reason: collision with root package name */
    @l
    public final RecallMeBlockItem f77064V1;

    /* renamed from: W, reason: collision with root package name */
    @l
    public final AutoSelectNoClickContactItem f77065W;

    /* renamed from: W0, reason: collision with root package name */
    @l
    public final AdvertDetailsFmpProductsItem f77066W0;

    /* renamed from: W1, reason: collision with root package name */
    @l
    public final AdvertDetailsFlatsItem f77067W1;

    /* renamed from: X, reason: collision with root package name */
    @l
    public final AutoSelectParametersV2Item f77068X;

    /* renamed from: X0, reason: collision with root package name */
    @l
    public final CarouselPhotoGalleryItem f77069X0;

    /* renamed from: X1, reason: collision with root package name */
    @l
    public final AdvertDetailsRepairCalculatorItem f77070X1;

    /* renamed from: Y, reason: collision with root package name */
    @l
    public final AutoSelectParametersV3Item f77071Y;

    /* renamed from: Y0, reason: collision with root package name */
    @l
    public final AdvertDetailsGalleryItem f77072Y0;

    /* renamed from: Y1, reason: collision with root package name */
    @l
    public final AdvertReservationInfoItem f77073Y1;

    /* renamed from: Z, reason: collision with root package name */
    @l
    public final AutoSelectTeaserItem f77074Z;

    /* renamed from: Z0, reason: collision with root package name */
    @l
    public final GarageCompatibilityV2Item f77075Z0;

    /* renamed from: Z1, reason: collision with root package name */
    @l
    public final PersistableSpannedItem f77076Z1;

    /* renamed from: a0, reason: collision with root package name */
    @l
    public final AdvertDetailsAutotekaTeaserItem f77077a0;

    /* renamed from: a1, reason: collision with root package name */
    @l
    public final GarageCompatibilityV3Item f77078a1;

    /* renamed from: a2, reason: collision with root package name */
    @l
    public final AdvertDetailsSafeDealInfoItem f77079a2;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final AdvertDetails f77080b;

    /* renamed from: b0, reason: collision with root package name */
    @l
    public final AdvertDetailsAutotekaTeaserV2Item f77081b0;

    /* renamed from: b1, reason: collision with root package name */
    @l
    public final GarageCompatibilityV4Item f77082b1;

    /* renamed from: b2, reason: collision with root package name */
    @l
    public final AdvertDetailsSafeDealPaymentBlockItem f77083b2;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f77084c;

    /* renamed from: c0, reason: collision with root package name */
    @l
    public final AdvertDetailsAutotekaTeaserV3Item f77085c0;

    /* renamed from: c1, reason: collision with root package name */
    @l
    public final AdvertDetailsGeoMarketReportItem f77086c1;

    /* renamed from: c2, reason: collision with root package name */
    @l
    public final AdvertDetailsSafeDealServicesItem f77087c2;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.advert_core.analytics.a f77088d;

    /* renamed from: d0, reason: collision with root package name */
    @l
    public final AdvertDetailsAutotekaSelectTeaserItem f77089d0;

    /* renamed from: d1, reason: collision with root package name */
    @l
    public final List<AdvertDetailsGeoReferenceItem> f77090d1;

    /* renamed from: d2, reason: collision with root package name */
    @l
    public final BlockItem f77091d2;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C43617a f77092e;

    /* renamed from: e0, reason: collision with root package name */
    @l
    public final PersistableSpannedItem f77093e0;

    /* renamed from: e1, reason: collision with root package name */
    @l
    public final AdvertDetailsGeoZonesItem f77094e1;

    /* renamed from: e2, reason: collision with root package name */
    @l
    public final AdvertDetailsServicesTransportationGeoItem f77095e2;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f77096f;

    /* renamed from: f0, reason: collision with root package name */
    @l
    public final AdvertDetailsB2CBottomItem f77097f0;

    /* renamed from: f1, reason: collision with root package name */
    @l
    public final AdvertDetailsDutiesItem f77098f1;

    /* renamed from: f2, reason: collision with root package name */
    @k
    public final List<TrustFactorsItem> f77099f2;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final q f77100g;

    /* renamed from: g0, reason: collision with root package name */
    @l
    public final AdvertBadgeBarItem f77101g0;

    /* renamed from: g1, reason: collision with root package name */
    @l
    public final AdvertMapItem f77102g1;

    /* renamed from: g2, reason: collision with root package name */
    @l
    public final AdvertSalaryRangeItem f77103g2;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final P0 f77104h;

    /* renamed from: h0, reason: collision with root package name */
    @l
    public final AdvertDetailsBadgeBarLightItem f77105h0;

    /* renamed from: h1, reason: collision with root package name */
    @l
    public final GigPersonalInfoItem f77106h1;

    /* renamed from: h2, reason: collision with root package name */
    @l
    public final AdvertDetailsScrollUpItem f77107h2;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final DevelopmentOffersPosition f77108i;

    /* renamed from: i0, reason: collision with root package name */
    @l
    public final BrandingAdvantagesBlockItem f77109i0;

    /* renamed from: i1, reason: collision with root package name */
    @l
    public final AdvertDetailsGigSellerItem f77110i1;

    /* renamed from: i2, reason: collision with root package name */
    @l
    public final AdvertDetailsSearchSuggestsItem f77111i2;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final LinkedHashMap f77112j;

    /* renamed from: j0, reason: collision with root package name */
    @l
    public final BrandingGalleryBlockItem f77113j0;

    /* renamed from: j1, reason: collision with root package name */
    @l
    public final AdvertDetailsGroupsItem f77114j1;

    /* renamed from: j2, reason: collision with root package name */
    @l
    public final SecondaryConsultationItem f77115j2;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final G5.a f77116k;

    /* renamed from: k0, reason: collision with root package name */
    @l
    public final BuzzoolaCreditBannerItem f77117k0;

    /* renamed from: k1, reason: collision with root package name */
    @l
    public final AdvertDetailsReviewsScoreItem f77118k1;

    /* renamed from: k2, reason: collision with root package name */
    @l
    public final AdvertDetailsSellerProfileItem f77119k2;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f77120l;

    /* renamed from: l0, reason: collision with root package name */
    @l
    public final AdvertDetailsCampaignsItem f77121l0;

    /* renamed from: l1, reason: collision with root package name */
    @l
    public final AdvertHotelDescriptionItem f77122l1;

    /* renamed from: l2, reason: collision with root package name */
    @l
    public final AdvertDetailsSellerSubscriptionItem f77123l2;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final List<PersistableSpannedItem> f77124m;

    /* renamed from: m0, reason: collision with root package name */
    @l
    public final AdvertDetailsCarBodyConditionItem f77125m0;

    /* renamed from: m1, reason: collision with root package name */
    @l
    public final AdvertHotelDescriptionItem f77126m1;

    /* renamed from: m2, reason: collision with root package name */
    @l
    public final ServiceBookingItem f77127m2;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final Z0 f77128n;

    /* renamed from: n0, reason: collision with root package name */
    @l
    public final ChatHistoryItem f77129n0;

    /* renamed from: n1, reason: collision with root package name */
    @l
    public final AdvertDetailsHotelOfferItem f77130n1;

    /* renamed from: n2, reason: collision with root package name */
    @l
    public final ServiceEducationItem f77131n2;

    /* renamed from: o, reason: collision with root package name */
    @l
    public final OffersPosition f77132o;

    /* renamed from: o0, reason: collision with root package name */
    @l
    public final AdvertDetailsFlatsItem f77133o0;

    /* renamed from: o1, reason: collision with root package name */
    @l
    public final AdvertHotelPromoWidgetItem f77134o1;

    /* renamed from: o2, reason: collision with root package name */
    @l
    public final ServiceOrderRequestItem f77135o2;

    /* renamed from: p, reason: collision with root package name */
    @k
    public final InterfaceC28240u f77136p;

    /* renamed from: p0, reason: collision with root package name */
    @l
    public final AdvertDetailsClosingReasonItem f77137p0;

    /* renamed from: p1, reason: collision with root package name */
    @l
    public final AdvertHotelReviewItem f77138p1;

    /* renamed from: p2, reason: collision with root package name */
    @l
    public final AdvertDetailsServicesDiscountAndBuyerGiftItem f77139p2;

    /* renamed from: q, reason: collision with root package name */
    @k
    public final u3.l<RiseIcebreakersItemTestGroup> f77140q;

    /* renamed from: q0, reason: collision with root package name */
    @l
    public final AdvertDetailsCompositeBrokerV1Item f77141q0;

    /* renamed from: q1, reason: collision with root package name */
    @l
    public final IceBreakersItem f77142q1;

    /* renamed from: q2, reason: collision with root package name */
    @l
    public final ServicesPriceItem f77143q2;

    /* renamed from: r, reason: collision with root package name */
    @k
    public final B2 f77144r;

    /* renamed from: r0, reason: collision with root package name */
    @l
    public final AdvertDetailsCompositeBrokerV2Item f77145r0;

    /* renamed from: r1, reason: collision with root package name */
    @l
    public final ImvCarsV4Item f77146r1;

    /* renamed from: r2, reason: collision with root package name */
    @l
    public final AmenitiesItem f77147r2;

    /* renamed from: s, reason: collision with root package name */
    @k
    public final A4 f77148s;

    /* renamed from: s0, reason: collision with root package name */
    @l
    public final ConsultationAfterIceBreakersItem f77149s0;

    /* renamed from: s1, reason: collision with root package name */
    @l
    public final AdvertJobSearchStatusItem f77150s1;

    /* renamed from: s2, reason: collision with root package name */
    @l
    public final InteriorPhotosItem f77151s2;

    /* renamed from: t, reason: collision with root package name */
    @l
    public final ServicesReviewVolunteers.Position f77152t;

    /* renamed from: t0, reason: collision with root package name */
    @l
    public final ConsultationButtonItem f77153t0;

    /* renamed from: t1, reason: collision with root package name */
    @l
    public final SeekerResponsesInfoItemV2 f77154t1;

    /* renamed from: t2, reason: collision with root package name */
    @l
    public final ServicesReviewVolunteersItem f77155t2;

    /* renamed from: u, reason: collision with root package name */
    @k
    public final D4 f77156u;

    /* renamed from: u0, reason: collision with root package name */
    @l
    public final AdvertDetailsConsultationItem f77157u0;

    /* renamed from: u1, reason: collision with root package name */
    @l
    public final AdvertDetailsLeasingBeduinItem f77158u1;

    /* renamed from: u2, reason: collision with root package name */
    @l
    public final ServicesTitleItem f77159u2;

    /* renamed from: v, reason: collision with root package name */
    @k
    public final com.avito.android.advert_core.short_term_rent.a f77160v;

    /* renamed from: v0, reason: collision with root package name */
    @l
    public final AdvertDetailsContactBarItem f77161v0;

    /* renamed from: v1, reason: collision with root package name */
    @l
    public final AdvertDetailsLeasingCalculatorItem f77162v1;

    /* renamed from: v2, reason: collision with root package name */
    @l
    public final AdvertDetailsShortTermRentItemDiscountItem f77163v2;

    /* renamed from: w, reason: collision with root package name */
    @k
    public final j f77164w;

    /* renamed from: w0, reason: collision with root package name */
    @l
    public final InstallmentsBlockItem f77165w0;

    /* renamed from: w1, reason: collision with root package name */
    @l
    public final AdvertDetailsLeasingLinkItem f77166w1;

    /* renamed from: w2, reason: collision with root package name */
    @l
    public final AdvertDetailsTravelPaymentTogglesItem f77167w2;

    /* renamed from: x, reason: collision with root package name */
    @l
    public final I1 f77168x;

    /* renamed from: x0, reason: collision with root package name */
    @l
    public final CreditCalculatorItem f77169x0;

    /* renamed from: x1, reason: collision with root package name */
    @l
    public final MarketplaceSalesAdvertPromoBannerItem f77170x1;

    /* renamed from: x2, reason: collision with root package name */
    @l
    public final AdvertDetailsShortTermRentStrButtonsItem f77171x2;

    /* renamed from: y, reason: collision with root package name */
    @l
    public kotlin.ranges.l f77172y;

    /* renamed from: y0, reason: collision with root package name */
    @l
    public final CreditBrokerLinkItem f77173y0;

    /* renamed from: y1, reason: collision with root package name */
    @l
    public final MarketplaceSalesBannerItem f77174y1;

    /* renamed from: y2, reason: collision with root package name */
    @l
    public final AdvertDetailsShowDescriptionItem f77175y2;

    /* renamed from: z, reason: collision with root package name */
    @l
    public final AdvertDetailsAbuseItem f77176z;

    /* renamed from: z0, reason: collision with root package name */
    @l
    public final AdvertCvPhoneActualizationItem f77177z0;

    /* renamed from: z1, reason: collision with root package name */
    @l
    public final MarketplaceStocksItem f77178z1;

    /* renamed from: z2, reason: collision with root package name */
    @l
    public final AdvertDetailsShowOnMapItem f77179z2;

    /* compiled from: ServicesItemListBuilder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert.item.items_list_builder.services.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C2274a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f77180a;

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
            f77180a = iArr;
        }
    }

    /* compiled from: ServicesItemListBuilder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ AdvertDetails f77182m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AdvertDetails advertDetails) {
            super(0);
            this.f77182m = advertDetails;
        }

        @Override // Y41.a
        public final G0 invoke() {
            ItemReviewsMain main;
            a aVar = a.this;
            if (aVar.f77084c != null) {
                ItemReviews itemReviews = this.f77182m.getItemReviews();
                ItemReviewsMain.AnalyticsParams analyticsParams = (itemReviews == null || (main = itemReviews.getMain()) == null) ? null : main.getAnalyticsParams();
                aVar.f77088d.O4(aVar.f77084c, ReviewsOpenPageFrom.ItemScroll.f91259d, analyticsParams != null ? analyticsParams.getAggregationType() : null, analyticsParams != null ? analyticsParams.getFirstReviewRelevanceBy() : null);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ServicesItemListBuilder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ AdvertDetails f77184m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ l0.f f77185n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AdvertDetails advertDetails, l0.f fVar) {
            super(0);
            this.f77184m = advertDetails;
            this.f77185n = fVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            ItemReviewsHeader header;
            Float scoreValue;
            com.avito.android.advert_core.analytics.a aVar = a.this.f77088d;
            AdvertDetails advertDetails = this.f77184m;
            String id2 = advertDetails.getId();
            ItemReviews itemReviews = advertDetails.getItemReviews();
            float fFloatValue = (itemReviews == null || (header = itemReviews.getHeader()) == null || (scoreValue = header.getScoreValue()) == null) ? 0.0f : scoreValue.floatValue();
            String categoryId = advertDetails.getCategoryId();
            if (categoryId == null) {
                categoryId = "";
            }
            aVar.R4(id2, categoryId, this.f77185n.f406840b, fFloatValue);
            return G0.f406611a;
        }
    }

    /* compiled from: ServicesItemListBuilder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a.this.f77088d.T1();
            return G0.f406611a;
        }
    }

    /* compiled from: ServicesItemListBuilder.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ AdvertHotelPromoWidgetItem f77187l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ a f77188m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(AdvertHotelPromoWidgetItem advertHotelPromoWidgetItem, a aVar) {
            super(0);
            this.f77187l = advertHotelPromoWidgetItem;
            this.f77188m = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            ParametrizedEvent parametrizedEvent = this.f77187l.f76208g;
            if (parametrizedEvent != null) {
                this.f77188m.f77116k.q(parametrizedEvent);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ServicesItemListBuilder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<G0> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a.this.f77088d.T1();
            return G0.f406611a;
        }
    }

    /* compiled from: ServicesItemListBuilder.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ AdvertHotelReviewItem f77190l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ a f77191m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(AdvertHotelReviewItem advertHotelReviewItem, a aVar) {
            super(0);
            this.f77190l = advertHotelReviewItem;
            this.f77191m = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            ParametrizedEvent parametrizedEvent = this.f77190l.f76238k;
            if (parametrizedEvent != null) {
                this.f77191m.f77116k.q(parametrizedEvent);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ServicesItemListBuilder.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ AdvertHotelPromoWidgetItem f77192l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ a f77193m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(AdvertHotelPromoWidgetItem advertHotelPromoWidgetItem, a aVar) {
            super(0);
            this.f77192l = advertHotelPromoWidgetItem;
            this.f77193m = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            ParametrizedEvent parametrizedEvent = this.f77192l.f76208g;
            if (parametrizedEvent != null) {
                this.f77193m.f77116k.q(parametrizedEvent);
            }
            return G0.f406611a;
        }
    }

    public a(@l AdvertDetails advertDetails, @l String str, @k com.avito.android.advert_core.analytics.a aVar, @k C43617a c43617a, @l String str2, @k q qVar, @k P0 p02, @l DevelopmentOffersPosition developmentOffersPosition, @k LinkedHashMap linkedHashMap, @k G5.a aVar2, boolean z12, @l List list, @k Z0 z02, @l OffersPosition offersPosition, @k InterfaceC28240u interfaceC28240u, @k u3.l lVar, @k B2 b22, @k A4 a42, @l ServicesReviewVolunteers.Position position, @k D4 d42, @k com.avito.android.advert_core.short_term_rent.a aVar3, @k j jVar, @l I1 i12, @l kotlin.ranges.l lVar2, @l AdvertDetailsAbuseItem advertDetailsAbuseItem, @l AdditionalSellerButtonItem additionalSellerButtonItem, @l AdditionalSellerFeaturesItem additionalSellerFeaturesItem, @l AdvertDetailsFlatsItem advertDetailsFlatsItem, @l AdvertDetailsReviewsScoreItem advertDetailsReviewsScoreItem, @l AdditionalSellerTitleItem additionalSellerTitleItem, @l AddressCentrityBlockItem addressCentrityBlockItem, @l AdvertDetailsAddressGeoDistanceItem advertDetailsAddressGeoDistanceItem, @l AdvertDetailsSxAddressesHeaderItem advertDetailsSxAddressesHeaderItem, @l AddressHint addressHint, @l AdvertDetailsAddressItem advertDetailsAddressItem, @l AdvertDetailsAdvertNumberItem advertDetailsAdvertNumberItem, @l AdvertServiceAppFillingButtonItem advertServiceAppFillingButtonItem, @l AdvertServiceAppFillingInfoItem advertServiceAppFillingInfoItem, @l AdvertDetailsAmenitiesItem advertDetailsAmenitiesItem, @l AdvertDetailsAnchorTrustFactorsItem advertDetailsAnchorTrustFactorsItem, @l AdvertDetailsAutoLoansItem advertDetailsAutoLoansItem, @l AutoPickerBannerItem autoPickerBannerItem, @l AutoSelectBannerItem autoSelectBannerItem, @l AutoSelectBookingItem autoSelectBookingItem, @l AutoSelectControlsItem autoSelectControlsItem, @l AdvertDetailsAutoSelectItem advertDetailsAutoSelectItem, @l AutoSelectManagerInfoItem autoSelectManagerInfoItem, @l AutoSelectNoClickContactItem autoSelectNoClickContactItem, @l AutoSelectParametersV2Item autoSelectParametersV2Item, @l AutoSelectParametersV3Item autoSelectParametersV3Item, @l AutoSelectTeaserItem autoSelectTeaserItem, @l AdvertDetailsAutotekaTeaserItem advertDetailsAutotekaTeaserItem, @l AdvertDetailsAutotekaTeaserV2Item advertDetailsAutotekaTeaserV2Item, @l AdvertDetailsAutotekaTeaserV3Item advertDetailsAutotekaTeaserV3Item, @l AdvertDetailsAutotekaSelectTeaserItem advertDetailsAutotekaSelectTeaserItem, @l PersistableSpannedItem persistableSpannedItem, @l AdvertDetailsB2CBottomItem advertDetailsB2CBottomItem, @l AdvertBadgeBarItem advertBadgeBarItem, @l AdvertDetailsBadgeBarLightItem advertDetailsBadgeBarLightItem, @l BrandingAdvantagesBlockItem brandingAdvantagesBlockItem, @l BrandingGalleryBlockItem brandingGalleryBlockItem, @l BuzzoolaCreditBannerItem buzzoolaCreditBannerItem, @l AdvertDetailsCampaignsItem advertDetailsCampaignsItem, @l AdvertDetailsCarBodyConditionItem advertDetailsCarBodyConditionItem, @l ChatHistoryItem chatHistoryItem, @l AdvertDetailsFlatsItem advertDetailsFlatsItem2, @l AdvertDetailsClosingReasonItem advertDetailsClosingReasonItem, @l AdvertDetailsCompositeBrokerV1Item advertDetailsCompositeBrokerV1Item, @l AdvertDetailsCompositeBrokerV2Item advertDetailsCompositeBrokerV2Item, @l ConsultationAfterIceBreakersItem consultationAfterIceBreakersItem, @l ConsultationButtonItem consultationButtonItem, @l AdvertDetailsConsultationItem advertDetailsConsultationItem, @l AdvertDetailsContactBarItem advertDetailsContactBarItem, @l InstallmentsBlockItem installmentsBlockItem, @l CreditCalculatorItem creditCalculatorItem, @l CreditBrokerLinkItem creditBrokerLinkItem, @l AdvertCvPhoneActualizationItem advertCvPhoneActualizationItem, @l AdvertCvStateItem advertCvStateItem, @l AdvertCvInfoItem advertCvInfoItem, @l CvMotivationBannerItem cvMotivationBannerItem, @l AdvertDetailsDeliverySuggestsItem advertDetailsDeliverySuggestsItem, @l AdvertDetailsDescriptionItem advertDetailsDescriptionItem, @l DeveloperButtonItem developerButtonItem, @l AdvertDetailsFlatsItem advertDetailsFlatsItem3, @l DeveloperTrustItem developerTrustItem, @l DevelopmentOffersItem developmentOffersItem, @l AdvertDetailsDisclaimerItem advertDetailsDisclaimerItem, @l DisclaimerPDItem disclaimerPDItem, @l AdvertDetailsDockingBadgeBarItem advertDetailsDockingBadgeBarItem, @l AdvertDetailsDomotekaReportTeaserItem advertDetailsDomotekaReportTeaserItem, @l AdvertDetailsDomotekaTeaserItem advertDetailsDomotekaTeaserItem, @l DynamicConsultationAfterIceBreakersItem dynamicConsultationAfterIceBreakersItem, @l EarlyAccessAdvertItem earlyAccessAdvertItem, @l EquipmentsItem equipmentsItem, @l AdvertDetailsEquipmentsTileItem advertDetailsEquipmentsTileItem, @l List list2, @l AdvertDetailsFmpBannerItem advertDetailsFmpBannerItem, @l AdvertDetailsFmpCalculatorItem advertDetailsFmpCalculatorItem, @l AdvertDetailsFmpOfferItem advertDetailsFmpOfferItem, @l AdvertDetailsFmpProductsItem advertDetailsFmpProductsItem, @l CarouselPhotoGalleryItem carouselPhotoGalleryItem, @l AdvertDetailsGalleryItem advertDetailsGalleryItem, @l GarageCompatibilityV2Item garageCompatibilityV2Item, @l GarageCompatibilityV3Item garageCompatibilityV3Item, @l GarageCompatibilityV4Item garageCompatibilityV4Item, @l AdvertDetailsGeoMarketReportItem advertDetailsGeoMarketReportItem, @l List list3, @l AdvertDetailsGeoZonesItem advertDetailsGeoZonesItem, @l AdvertDetailsDutiesItem advertDetailsDutiesItem, @l AdvertMapItem advertMapItem, @l GigPersonalInfoItem gigPersonalInfoItem, @l AdvertDetailsGigSellerItem advertDetailsGigSellerItem, @l AdvertDetailsGroupsItem advertDetailsGroupsItem, @l AdvertDetailsReviewsScoreItem advertDetailsReviewsScoreItem2, @l AdvertHotelDescriptionItem advertHotelDescriptionItem, @l AdvertHotelDescriptionItem advertHotelDescriptionItem2, @l AdvertDetailsHotelOfferItem advertDetailsHotelOfferItem, @l AdvertHotelPromoWidgetItem advertHotelPromoWidgetItem, @l AdvertHotelReviewItem advertHotelReviewItem, @l IceBreakersItem iceBreakersItem, @l ImvCarsV4Item imvCarsV4Item, @l AdvertJobSearchStatusItem advertJobSearchStatusItem, @l SeekerResponsesInfoItemV2 seekerResponsesInfoItemV2, @l AdvertDetailsLeasingBeduinItem advertDetailsLeasingBeduinItem, @l AdvertDetailsLeasingCalculatorItem advertDetailsLeasingCalculatorItem, @l AdvertDetailsLeasingLinkItem advertDetailsLeasingLinkItem, @l MarketplaceSalesAdvertPromoBannerItem marketplaceSalesAdvertPromoBannerItem, @l MarketplaceSalesBannerItem marketplaceSalesBannerItem, @l MarketplaceStocksItem marketplaceStocksItem, @l MortgageCalculatorItem mortgageCalculatorItem, @l MortgageSnippetItem mortgageSnippetItem, @l AdvertDetailsMultiItemItem advertDetailsMultiItemItem, @l AdvertDetailsNoteItem advertDetailsNoteItem, @l OffersItem offersItem, @l OwnershipCostItem ownershipCostItem, @l AdvertDetailsParkingAddressItem advertDetailsParkingAddressItem, @l AdvertDetailsPopularityInfoItem advertDetailsPopularityInfoItem, @l AdvertDetailsPortfolioBlockItem advertDetailsPortfolioBlockItem, @l AdvertDetailsPpRecallPromoItem advertDetailsPpRecallPromoItem, @l AdvertDetailsComfortableDealPromoItem advertDetailsComfortableDealPromoItem, @l PriceComparisonItem priceComparisonItem, @l PersistableSpannedItem persistableSpannedItem2, @l PersistableSpannedItem persistableSpannedItem3, @l AdvertPriceListPreviewItem advertPriceListPreviewItem, @l AdvertDetailsPrivacyDisclaimerItem advertDetailsPrivacyDisclaimerItem, @l PromoMechanicsItem promoMechanicsItem, @l AdvertDetailsRatingPublishItem advertDetailsRatingPublishItem, @l InformationAboutItem informationAboutItem, @l RealtyImvItem realtyImvItem, @l RealtyQuizBannerItem realtyQuizBannerItem, @l RecallMeBlockItem recallMeBlockItem, @l AdvertDetailsFlatsItem advertDetailsFlatsItem4, @l AdvertDetailsRepairCalculatorItem advertDetailsRepairCalculatorItem, @l AdvertReservationInfoItem advertReservationInfoItem, @l PersistableSpannedItem persistableSpannedItem4, @l AdvertDetailsSafeDealInfoItem advertDetailsSafeDealInfoItem, @l AdvertDetailsSafeDealPaymentBlockItem advertDetailsSafeDealPaymentBlockItem, @l AdvertDetailsSafeDealServicesItem advertDetailsSafeDealServicesItem, @l BlockItem blockItem, @l AdvertDetailsServicesTransportationGeoItem advertDetailsServicesTransportationGeoItem, @k List list4, @l AdvertSalaryRangeItem advertSalaryRangeItem, @l AdvertDetailsScrollUpItem advertDetailsScrollUpItem, @l AdvertDetailsSearchSuggestsItem advertDetailsSearchSuggestsItem, @l SecondaryConsultationItem secondaryConsultationItem, @l AdvertDetailsSellerProfileItem advertDetailsSellerProfileItem, @l AdvertDetailsSellerSubscriptionItem advertDetailsSellerSubscriptionItem, @l ServiceBookingItem serviceBookingItem, @l ServiceEducationItem serviceEducationItem, @l ServiceOrderRequestItem serviceOrderRequestItem, @l AdvertDetailsServicesDiscountAndBuyerGiftItem advertDetailsServicesDiscountAndBuyerGiftItem, @l ServicesPriceItem servicesPriceItem, @l AmenitiesItem amenitiesItem, @l InteriorPhotosItem interiorPhotosItem, @l ServicesReviewVolunteersItem servicesReviewVolunteersItem, @l ServicesTitleItem servicesTitleItem, @l AdvertDetailsShortTermRentItemDiscountItem advertDetailsShortTermRentItemDiscountItem, @l AdvertDetailsTravelPaymentTogglesItem advertDetailsTravelPaymentTogglesItem, @l AdvertDetailsShortTermRentStrButtonsItem advertDetailsShortTermRentStrButtonsItem, @l AdvertDetailsShowDescriptionItem advertDetailsShowDescriptionItem, @l AdvertDetailsShowOnMapItem advertDetailsShowOnMapItem, @l AdvertDetailsSimilarsButtonItem advertDetailsSimilarsButtonItem, @l AdvertDetailsSimilarShiftsItem advertDetailsSimilarShiftsItem, @l SparePartsCostItem sparePartsCostItem, @l AdvertDetailsStickedSalesBannerItem advertDetailsStickedSalesBannerItem, @l PersistableSpannedItem persistableSpannedItem5, @l AdvertDetailsTitleItem advertDetailsTitleItem, @l StyledTitleItem styledTitleItem, @l AdvertVerificationItem advertVerificationItem, @l AdvertVideoCallRequestItem advertVideoCallRequestItem, @l WalletInfoItem walletInfoItem, @l AdvertDetailsServicesWorkTimeItem advertDetailsServicesWorkTimeItem, @l AutoNewCarsLeadFormItem autoNewCarsLeadFormItem, @l MarketplaceRewardsBannerItem marketplaceRewardsBannerItem, @k com.avito.android.util.bottom_gap.d dVar) {
        this.f77080b = advertDetails;
        this.f77084c = str;
        this.f77088d = aVar;
        this.f77092e = c43617a;
        this.f77096f = str2;
        this.f77100g = qVar;
        this.f77104h = p02;
        this.f77108i = developmentOffersPosition;
        this.f77112j = linkedHashMap;
        this.f77116k = aVar2;
        this.f77120l = z12;
        this.f77124m = list;
        this.f77128n = z02;
        this.f77132o = offersPosition;
        this.f77136p = interfaceC28240u;
        this.f77140q = lVar;
        this.f77144r = b22;
        this.f77148s = a42;
        this.f77152t = position;
        this.f77156u = d42;
        this.f77160v = aVar3;
        this.f77164w = jVar;
        this.f77168x = i12;
        this.f77172y = lVar2;
        this.f77176z = advertDetailsAbuseItem;
        this.f76984A = additionalSellerButtonItem;
        this.f76988B = additionalSellerFeaturesItem;
        this.f76992C = advertDetailsFlatsItem;
        this.f76996D = advertDetailsReviewsScoreItem;
        this.f77000E = additionalSellerTitleItem;
        this.f77004F = addressCentrityBlockItem;
        this.f77008G = advertDetailsAddressGeoDistanceItem;
        this.f77012H = advertDetailsSxAddressesHeaderItem;
        this.f77016I = addressHint;
        this.f77020J = advertDetailsAddressItem;
        this.f77024K = advertDetailsAdvertNumberItem;
        this.f77028L = advertServiceAppFillingButtonItem;
        this.f77032M = advertServiceAppFillingInfoItem;
        this.f77036N = advertDetailsAmenitiesItem;
        this.f77040O = advertDetailsAnchorTrustFactorsItem;
        this.f77044P = advertDetailsAutoLoansItem;
        this.f77047Q = autoPickerBannerItem;
        this.f77050R = autoSelectBannerItem;
        this.f77053S = autoSelectBookingItem;
        this.f77056T = autoSelectControlsItem;
        this.f77059U = advertDetailsAutoSelectItem;
        this.f77062V = autoSelectManagerInfoItem;
        this.f77065W = autoSelectNoClickContactItem;
        this.f77068X = autoSelectParametersV2Item;
        this.f77071Y = autoSelectParametersV3Item;
        this.f77074Z = autoSelectTeaserItem;
        this.f77077a0 = advertDetailsAutotekaTeaserItem;
        this.f77081b0 = advertDetailsAutotekaTeaserV2Item;
        this.f77085c0 = advertDetailsAutotekaTeaserV3Item;
        this.f77089d0 = advertDetailsAutotekaSelectTeaserItem;
        this.f77093e0 = persistableSpannedItem;
        this.f77097f0 = advertDetailsB2CBottomItem;
        this.f77101g0 = advertBadgeBarItem;
        this.f77105h0 = advertDetailsBadgeBarLightItem;
        this.f77109i0 = brandingAdvantagesBlockItem;
        this.f77113j0 = brandingGalleryBlockItem;
        this.f77117k0 = buzzoolaCreditBannerItem;
        this.f77121l0 = advertDetailsCampaignsItem;
        this.f77125m0 = advertDetailsCarBodyConditionItem;
        this.f77129n0 = chatHistoryItem;
        this.f77133o0 = advertDetailsFlatsItem2;
        this.f77137p0 = advertDetailsClosingReasonItem;
        this.f77141q0 = advertDetailsCompositeBrokerV1Item;
        this.f77145r0 = advertDetailsCompositeBrokerV2Item;
        this.f77149s0 = consultationAfterIceBreakersItem;
        this.f77153t0 = consultationButtonItem;
        this.f77157u0 = advertDetailsConsultationItem;
        this.f77161v0 = advertDetailsContactBarItem;
        this.f77165w0 = installmentsBlockItem;
        this.f77169x0 = creditCalculatorItem;
        this.f77173y0 = creditBrokerLinkItem;
        this.f77177z0 = advertCvPhoneActualizationItem;
        this.f76985A0 = advertCvStateItem;
        this.f76989B0 = advertCvInfoItem;
        this.f76993C0 = cvMotivationBannerItem;
        this.f76997D0 = advertDetailsDeliverySuggestsItem;
        this.f77001E0 = advertDetailsDescriptionItem;
        this.f77005F0 = developerButtonItem;
        this.f77009G0 = advertDetailsFlatsItem3;
        this.f77013H0 = developerTrustItem;
        this.f77017I0 = developmentOffersItem;
        this.f77021J0 = advertDetailsDisclaimerItem;
        this.f77025K0 = disclaimerPDItem;
        this.f77029L0 = advertDetailsDockingBadgeBarItem;
        this.f77033M0 = advertDetailsDomotekaReportTeaserItem;
        this.f77037N0 = advertDetailsDomotekaTeaserItem;
        this.f77041O0 = dynamicConsultationAfterIceBreakersItem;
        this.f77045P0 = earlyAccessAdvertItem;
        this.f77048Q0 = equipmentsItem;
        this.f77051R0 = advertDetailsEquipmentsTileItem;
        this.f77054S0 = list2;
        this.f77057T0 = advertDetailsFmpBannerItem;
        this.f77060U0 = advertDetailsFmpCalculatorItem;
        this.f77063V0 = advertDetailsFmpOfferItem;
        this.f77066W0 = advertDetailsFmpProductsItem;
        this.f77069X0 = carouselPhotoGalleryItem;
        this.f77072Y0 = advertDetailsGalleryItem;
        this.f77075Z0 = garageCompatibilityV2Item;
        this.f77078a1 = garageCompatibilityV3Item;
        this.f77082b1 = garageCompatibilityV4Item;
        this.f77086c1 = advertDetailsGeoMarketReportItem;
        this.f77090d1 = list3;
        this.f77094e1 = advertDetailsGeoZonesItem;
        this.f77098f1 = advertDetailsDutiesItem;
        this.f77102g1 = advertMapItem;
        this.f77106h1 = gigPersonalInfoItem;
        this.f77110i1 = advertDetailsGigSellerItem;
        this.f77114j1 = advertDetailsGroupsItem;
        this.f77118k1 = advertDetailsReviewsScoreItem2;
        this.f77122l1 = advertHotelDescriptionItem;
        this.f77126m1 = advertHotelDescriptionItem2;
        this.f77130n1 = advertDetailsHotelOfferItem;
        this.f77134o1 = advertHotelPromoWidgetItem;
        this.f77138p1 = advertHotelReviewItem;
        this.f77142q1 = iceBreakersItem;
        this.f77146r1 = imvCarsV4Item;
        this.f77150s1 = advertJobSearchStatusItem;
        this.f77154t1 = seekerResponsesInfoItemV2;
        this.f77158u1 = advertDetailsLeasingBeduinItem;
        this.f77162v1 = advertDetailsLeasingCalculatorItem;
        this.f77166w1 = advertDetailsLeasingLinkItem;
        this.f77170x1 = marketplaceSalesAdvertPromoBannerItem;
        this.f77174y1 = marketplaceSalesBannerItem;
        this.f77178z1 = marketplaceStocksItem;
        this.f76986A1 = mortgageCalculatorItem;
        this.f76990B1 = mortgageSnippetItem;
        this.f76994C1 = advertDetailsMultiItemItem;
        this.f76998D1 = advertDetailsNoteItem;
        this.f77002E1 = offersItem;
        this.f77006F1 = ownershipCostItem;
        this.f77010G1 = advertDetailsParkingAddressItem;
        this.f77014H1 = advertDetailsPopularityInfoItem;
        this.f77018I1 = advertDetailsPortfolioBlockItem;
        this.f77022J1 = advertDetailsPpRecallPromoItem;
        this.f77026K1 = advertDetailsComfortableDealPromoItem;
        this.f77030L1 = priceComparisonItem;
        this.f77034M1 = persistableSpannedItem2;
        this.f77038N1 = persistableSpannedItem3;
        this.f77042O1 = advertPriceListPreviewItem;
        this.f77046P1 = advertDetailsPrivacyDisclaimerItem;
        this.f77049Q1 = promoMechanicsItem;
        this.f77052R1 = advertDetailsRatingPublishItem;
        this.f77055S1 = informationAboutItem;
        this.f77058T1 = realtyImvItem;
        this.f77061U1 = realtyQuizBannerItem;
        this.f77064V1 = recallMeBlockItem;
        this.f77067W1 = advertDetailsFlatsItem4;
        this.f77070X1 = advertDetailsRepairCalculatorItem;
        this.f77073Y1 = advertReservationInfoItem;
        this.f77076Z1 = persistableSpannedItem4;
        this.f77079a2 = advertDetailsSafeDealInfoItem;
        this.f77083b2 = advertDetailsSafeDealPaymentBlockItem;
        this.f77087c2 = advertDetailsSafeDealServicesItem;
        this.f77091d2 = blockItem;
        this.f77095e2 = advertDetailsServicesTransportationGeoItem;
        this.f77099f2 = list4;
        this.f77103g2 = advertSalaryRangeItem;
        this.f77107h2 = advertDetailsScrollUpItem;
        this.f77111i2 = advertDetailsSearchSuggestsItem;
        this.f77115j2 = secondaryConsultationItem;
        this.f77119k2 = advertDetailsSellerProfileItem;
        this.f77123l2 = advertDetailsSellerSubscriptionItem;
        this.f77127m2 = serviceBookingItem;
        this.f77131n2 = serviceEducationItem;
        this.f77135o2 = serviceOrderRequestItem;
        this.f77139p2 = advertDetailsServicesDiscountAndBuyerGiftItem;
        this.f77143q2 = servicesPriceItem;
        this.f77147r2 = amenitiesItem;
        this.f77151s2 = interiorPhotosItem;
        this.f77155t2 = servicesReviewVolunteersItem;
        this.f77159u2 = servicesTitleItem;
        this.f77163v2 = advertDetailsShortTermRentItemDiscountItem;
        this.f77167w2 = advertDetailsTravelPaymentTogglesItem;
        this.f77171x2 = advertDetailsShortTermRentStrButtonsItem;
        this.f77175y2 = advertDetailsShowDescriptionItem;
        this.f77179z2 = advertDetailsShowOnMapItem;
        this.f76987A2 = advertDetailsSimilarsButtonItem;
        this.f76991B2 = advertDetailsSimilarShiftsItem;
        this.f76995C2 = sparePartsCostItem;
        this.f76999D2 = advertDetailsStickedSalesBannerItem;
        this.f77003E2 = persistableSpannedItem5;
        this.f77007F2 = advertDetailsTitleItem;
        this.f77011G2 = styledTitleItem;
        this.f77015H2 = advertVerificationItem;
        this.f77019I2 = advertVideoCallRequestItem;
        this.f77023J2 = walletInfoItem;
        this.f77027K2 = advertDetailsServicesWorkTimeItem;
        this.f77031L2 = autoNewCarsLeadFormItem;
        this.f77035M2 = marketplaceRewardsBannerItem;
        this.f77039N2 = dVar;
    }

    public static void c(a aVar) {
        aVar.f77043O2.add(new AdvertDetailsDividerItem(0L, null, 20, 0, aVar.f77164w.a(), null, null, null, 227, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:1002:0x1282  */
    /* JADX WARN: Removed duplicated region for block: B:1005:0x128b  */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:1012:0x12a8  */
    /* JADX WARN: Removed duplicated region for block: B:1014:0x12af  */
    /* JADX WARN: Removed duplicated region for block: B:1020:0x12c2  */
    /* JADX WARN: Removed duplicated region for block: B:1025:0x12d2  */
    /* JADX WARN: Removed duplicated region for block: B:1028:0x12db  */
    /* JADX WARN: Removed duplicated region for block: B:1031:0x12e4  */
    /* JADX WARN: Removed duplicated region for block: B:1034:0x12ed  */
    /* JADX WARN: Removed duplicated region for block: B:1044:0x1322 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:1047:0x132b  */
    /* JADX WARN: Removed duplicated region for block: B:1048:0x1346  */
    /* JADX WARN: Removed duplicated region for block: B:1051:0x134e  */
    /* JADX WARN: Removed duplicated region for block: B:1059:0x137b  */
    /* JADX WARN: Removed duplicated region for block: B:1069:0x13b0  */
    /* JADX WARN: Removed duplicated region for block: B:1072:0x13c4  */
    /* JADX WARN: Removed duplicated region for block: B:1078:0x13de  */
    /* JADX WARN: Removed duplicated region for block: B:1080:0x13f0  */
    /* JADX WARN: Removed duplicated region for block: B:1081:0x13f5  */
    /* JADX WARN: Removed duplicated region for block: B:1084:0x13fb  */
    /* JADX WARN: Removed duplicated region for block: B:1089:0x1407  */
    /* JADX WARN: Removed duplicated region for block: B:1090:0x140a  */
    /* JADX WARN: Removed duplicated region for block: B:1100:0x142e  */
    /* JADX WARN: Removed duplicated region for block: B:1103:0x1442  */
    /* JADX WARN: Removed duplicated region for block: B:1110:0x145e  */
    /* JADX WARN: Removed duplicated region for block: B:1111:0x146f  */
    /* JADX WARN: Removed duplicated region for block: B:1114:0x1475  */
    /* JADX WARN: Removed duplicated region for block: B:1117:0x147e  */
    /* JADX WARN: Removed duplicated region for block: B:1120:0x1487  */
    /* JADX WARN: Removed duplicated region for block: B:1123:0x1490  */
    /* JADX WARN: Removed duplicated region for block: B:1126:0x14a4  */
    /* JADX WARN: Removed duplicated region for block: B:1129:0x14b8  */
    /* JADX WARN: Removed duplicated region for block: B:1132:0x14d2  */
    /* JADX WARN: Removed duplicated region for block: B:1135:0x14db  */
    /* JADX WARN: Removed duplicated region for block: B:1136:0x14ec  */
    /* JADX WARN: Removed duplicated region for block: B:1138:0x14f0  */
    /* JADX WARN: Removed duplicated region for block: B:1144:0x1503  */
    /* JADX WARN: Removed duplicated region for block: B:1147:0x1517  */
    /* JADX WARN: Removed duplicated region for block: B:1159:0x153a  */
    /* JADX WARN: Removed duplicated region for block: B:1162:0x1543  */
    /* JADX WARN: Removed duplicated region for block: B:1165:0x154c  */
    /* JADX WARN: Removed duplicated region for block: B:1168:0x156e  */
    /* JADX WARN: Removed duplicated region for block: B:1169:0x1578  */
    /* JADX WARN: Removed duplicated region for block: B:1207:0x160e  */
    /* JADX WARN: Removed duplicated region for block: B:1210:0x1616  */
    /* JADX WARN: Removed duplicated region for block: B:1212:0x1619  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x057d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x067d  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0686  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0697  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x069b  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x06a2  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x06ab  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x06ea  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x06fa  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0722  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0744  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x07c4  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x07d8  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x07e1  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x07f3  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x081c  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0822  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0835  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x083b  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x0854  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0860  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x086a  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x0881  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x08a0  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x08a9  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x08ba  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x08cb  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x08d3  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x08d9  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x08e2  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x08eb  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x08fe  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x0902  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x0915  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x091b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:506:0x091e  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x0921  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x0929  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x092c  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x0943  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x094a  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x0981  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x0994  */
    /* JADX WARN: Removed duplicated region for block: B:537:0x099a  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x09be  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x09d4  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x09e6  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x0a0a  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x0a22  */
    /* JADX WARN: Removed duplicated region for block: B:565:0x0a37  */
    /* JADX WARN: Removed duplicated region for block: B:568:0x0a3d  */
    /* JADX WARN: Removed duplicated region for block: B:571:0x0a4f  */
    /* JADX WARN: Removed duplicated region for block: B:574:0x0a58  */
    /* JADX WARN: Removed duplicated region for block: B:578:0x0a85  */
    /* JADX WARN: Removed duplicated region for block: B:581:0x0a8d  */
    /* JADX WARN: Removed duplicated region for block: B:591:0x0ac0  */
    /* JADX WARN: Removed duplicated region for block: B:594:0x0ac9  */
    /* JADX WARN: Removed duplicated region for block: B:595:0x0ada  */
    /* JADX WARN: Removed duplicated region for block: B:598:0x0ae0  */
    /* JADX WARN: Removed duplicated region for block: B:601:0x0af4  */
    /* JADX WARN: Removed duplicated region for block: B:604:0x0afb  */
    /* JADX WARN: Removed duplicated region for block: B:607:0x0b04  */
    /* JADX WARN: Removed duplicated region for block: B:610:0x0b0d  */
    /* JADX WARN: Removed duplicated region for block: B:613:0x0b2e  */
    /* JADX WARN: Removed duplicated region for block: B:616:0x0b40  */
    /* JADX WARN: Removed duplicated region for block: B:617:0x0b4d  */
    /* JADX WARN: Removed duplicated region for block: B:620:0x0b53  */
    /* JADX WARN: Removed duplicated region for block: B:623:0x0b65  */
    /* JADX WARN: Removed duplicated region for block: B:626:0x0b77  */
    /* JADX WARN: Removed duplicated region for block: B:635:0x0b9e  */
    /* JADX WARN: Removed duplicated region for block: B:644:0x0bc5  */
    /* JADX WARN: Removed duplicated region for block: B:653:0x0bec  */
    /* JADX WARN: Removed duplicated region for block: B:662:0x0c13  */
    /* JADX WARN: Removed duplicated region for block: B:665:0x0c27  */
    /* JADX WARN: Removed duplicated region for block: B:685:0x0c71  */
    /* JADX WARN: Removed duplicated region for block: B:688:0x0c7e  */
    /* JADX WARN: Removed duplicated region for block: B:690:0x0c82  */
    /* JADX WARN: Removed duplicated region for block: B:695:0x0ca8  */
    /* JADX WARN: Removed duplicated region for block: B:698:0x0cc1  */
    /* JADX WARN: Removed duplicated region for block: B:701:0x0ccb  */
    /* JADX WARN: Removed duplicated region for block: B:707:0x0cf9  */
    /* JADX WARN: Removed duplicated region for block: B:712:0x0d15  */
    /* JADX WARN: Removed duplicated region for block: B:717:0x0d2f  */
    /* JADX WARN: Removed duplicated region for block: B:721:0x0d37  */
    /* JADX WARN: Removed duplicated region for block: B:725:0x0d5a  */
    /* JADX WARN: Removed duplicated region for block: B:729:0x0d6e  */
    /* JADX WARN: Removed duplicated region for block: B:730:0x0d7f  */
    /* JADX WARN: Removed duplicated region for block: B:733:0x0d85  */
    /* JADX WARN: Removed duplicated region for block: B:736:0x0d97  */
    /* JADX WARN: Removed duplicated region for block: B:739:0x0da9  */
    /* JADX WARN: Removed duplicated region for block: B:742:0x0dc3  */
    /* JADX WARN: Removed duplicated region for block: B:753:0x0ddf  */
    /* JADX WARN: Removed duplicated region for block: B:756:0x0de9  */
    /* JADX WARN: Removed duplicated region for block: B:786:0x0e75  */
    /* JADX WARN: Removed duplicated region for block: B:789:0x0e92  */
    /* JADX WARN: Removed duplicated region for block: B:792:0x0ea7  */
    /* JADX WARN: Removed duplicated region for block: B:795:0x0ead  */
    /* JADX WARN: Removed duplicated region for block: B:798:0x0ebf  */
    /* JADX WARN: Removed duplicated region for block: B:806:0x0ef3  */
    /* JADX WARN: Removed duplicated region for block: B:809:0x0ef9  */
    /* JADX WARN: Removed duplicated region for block: B:812:0x0f0d  */
    /* JADX WARN: Removed duplicated region for block: B:815:0x0f21  */
    /* JADX WARN: Removed duplicated region for block: B:816:0x0f32  */
    /* JADX WARN: Removed duplicated region for block: B:819:0x0f38  */
    /* JADX WARN: Removed duplicated region for block: B:822:0x0f4a  */
    /* JADX WARN: Removed duplicated region for block: B:824:0x0f5c  */
    /* JADX WARN: Removed duplicated region for block: B:830:0x0f6f  */
    /* JADX WARN: Removed duplicated region for block: B:833:0x0f78  */
    /* JADX WARN: Removed duplicated region for block: B:836:0x0f81  */
    /* JADX WARN: Removed duplicated region for block: B:839:0x0f8a  */
    /* JADX WARN: Removed duplicated region for block: B:842:0x0f93  */
    /* JADX WARN: Removed duplicated region for block: B:845:0x0f9c  */
    /* JADX WARN: Removed duplicated region for block: B:846:0x0f9f  */
    /* JADX WARN: Removed duplicated region for block: B:849:0x0fa7  */
    /* JADX WARN: Removed duplicated region for block: B:857:0x0fcd  */
    /* JADX WARN: Removed duplicated region for block: B:860:0x0fe1  */
    /* JADX WARN: Removed duplicated region for block: B:863:0x0ff5  */
    /* JADX WARN: Removed duplicated region for block: B:865:0x1007  */
    /* JADX WARN: Removed duplicated region for block: B:870:0x1018  */
    /* JADX WARN: Removed duplicated region for block: B:877:0x1043  */
    /* JADX WARN: Removed duplicated region for block: B:881:0x1067  */
    /* JADX WARN: Removed duplicated region for block: B:883:0x1077  */
    /* JADX WARN: Removed duplicated region for block: B:889:0x1093  */
    /* JADX WARN: Removed duplicated region for block: B:891:0x109a  */
    /* JADX WARN: Removed duplicated region for block: B:893:0x10a1  */
    /* JADX WARN: Removed duplicated region for block: B:896:0x10aa  */
    /* JADX WARN: Removed duplicated region for block: B:899:0x10c9  */
    /* JADX WARN: Removed duplicated region for block: B:902:0x10d2  */
    /* JADX WARN: Removed duplicated region for block: B:905:0x10db  */
    /* JADX WARN: Removed duplicated region for block: B:911:0x10f5  */
    /* JADX WARN: Removed duplicated region for block: B:914:0x1105  */
    /* JADX WARN: Removed duplicated region for block: B:917:0x1112  */
    /* JADX WARN: Removed duplicated region for block: B:919:0x1116  */
    /* JADX WARN: Removed duplicated region for block: B:924:0x1123  */
    /* JADX WARN: Removed duplicated region for block: B:927:0x1142  */
    /* JADX WARN: Removed duplicated region for block: B:930:0x1156  */
    /* JADX WARN: Removed duplicated region for block: B:947:0x1198  */
    /* JADX WARN: Removed duplicated region for block: B:950:0x11ae  */
    /* JADX WARN: Removed duplicated region for block: B:953:0x11c0  */
    /* JADX WARN: Removed duplicated region for block: B:956:0x11d4  */
    /* JADX WARN: Removed duplicated region for block: B:970:0x1213  */
    /* JADX WARN: Removed duplicated region for block: B:973:0x121b  */
    /* JADX WARN: Removed duplicated region for block: B:977:0x1225  */
    /* JADX WARN: Removed duplicated region for block: B:978:0x1228  */
    /* JADX WARN: Removed duplicated region for block: B:982:0x123c  */
    /* JADX WARN: Removed duplicated region for block: B:986:0x1246  */
    /* JADX WARN: Removed duplicated region for block: B:987:0x1249  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:991:0x125b  */
    /* JADX WARN: Removed duplicated region for block: B:997:0x1275  */
    @Override // com.avito.android.advert.item.items_list_builder.c
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.advert.item.items_list_builder.e a() {
        /*
            Method dump skipped, instructions count: 5677
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.items_list_builder.services.a.a():com.avito.android.advert.item.items_list_builder.e");
    }

    public final void b(int i12) {
        this.f77043O2.add(new AdvertDetailsDividerItem(0L, null, i12, i12, this.f77164w.a(), null, null, null, 227, null));
    }

    public final List<PersistableSpannedItem> d(List<PersistableSpannedItem> list) {
        AdvertDetailsBadgeBarLightItem advertDetailsBadgeBarLightItem = this.f77105h0;
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
                arrayList.add(g(16));
            }
            i12 = i13;
        }
        return arrayList;
    }

    public final void e(List<? extends PersistableSpannedItem> list, AdvertDetails advertDetails) {
        l0.f fVar = new l0.f();
        int i12 = 0;
        boolean z12 = false;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            PersistableSpannedItem persistableSpannedItem = (PersistableSpannedItem) obj;
            if (persistableSpannedItem instanceof AdvertReviewsStatisticItem) {
                fVar.f406840b = ((AdvertReviewsStatisticItem) persistableSpannedItem).f78703c;
            }
            this.f77043O2.add(persistableSpannedItem);
            ItemReviews itemReviews = advertDetails.getItemReviews();
            ItemReviews.Type type = itemReviews != null ? itemReviews.getType() : null;
            int i14 = type == null ? -1 : C2274a.f77180a[type.ordinal()];
            I1 i15 = this.f77168x;
            if (i14 != 1) {
                if (i14 == 2 && !z12 && ((persistableSpannedItem instanceof AdvertDetailsReviewItem) || (persistableSpannedItem instanceof AdvertDetailsModelReviewItem))) {
                    if (i15 != null) {
                        i15.v(this.f77043O2.size(), new c(advertDetails, fVar));
                    }
                    z12 = true;
                }
            } else if ((persistableSpannedItem instanceof AdvertDetailsReviewsInfoItem) && i15 != null) {
                i15.v(this.f77043O2.size(), new b(advertDetails));
            }
            i12 = i13;
        }
    }

    public final void f(AdvertDetails advertDetails) {
        AdvertDetailsMultiItemItem advertDetailsMultiItemItem = this.f76994C1;
        if (advertDetailsMultiItemItem == null) {
            return;
        }
        if (!advertDetails.isRedesign()) {
            this.f77043O2.add(g(10));
            this.f77043O2.add(advertDetailsMultiItemItem);
            this.f77043O2.add(g(6));
        } else {
            this.f77043O2.add(g(16));
            this.f77043O2.add(advertDetailsMultiItemItem);
            Integer num = !this.f77099f2.isEmpty() ? 2 : this.f77161v0 != null ? 10 : null;
            if (num != null) {
                this.f77043O2.add(g(num.intValue()));
            }
        }
    }

    public final AdvertDetailsGapItem g(int i12) {
        AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
        return new AdvertDetailsGapItem(52, null, i12, this.f77164w.a(), null, null, 50, null);
    }

    public final void h(AdvertDetails advertDetails) {
        AddressHint addressHint = this.f77016I;
        if (addressHint != null) {
            this.f77043O2.add(addressHint);
        }
        List<AdvertDetailsGeoReferenceItem> list = this.f77090d1;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                this.f77043O2.add((AdvertDetailsGeoReferenceItem) it.next());
            }
        }
        AdvertDetailsAddressItem advertDetailsAddressItem = this.f77020J;
        if (advertDetailsAddressItem != null) {
            this.f77043O2.add(advertDetailsAddressItem);
        }
        AdvertDetailsServicesWorkTimeItem advertDetailsServicesWorkTimeItem = this.f77027K2;
        if (advertDetailsServicesWorkTimeItem != null) {
            this.f77043O2.add(advertDetailsServicesWorkTimeItem);
        }
        AdvertDetailsGeoZonesItem advertDetailsGeoZonesItem = this.f77094e1;
        if (advertDetailsGeoZonesItem != null) {
            this.f77043O2.add(advertDetailsGeoZonesItem);
        }
        AdvertDetailsAddressGeoDistanceItem advertDetailsAddressGeoDistanceItem = this.f77008G;
        if (advertDetailsAddressGeoDistanceItem != null) {
            this.f77043O2.add(advertDetailsAddressGeoDistanceItem);
        }
        AdvertDetailsShowOnMapItem advertDetailsShowOnMapItem = this.f77179z2;
        if (advertDetailsShowOnMapItem != null) {
            this.f77043O2.add(advertDetailsShowOnMapItem);
        }
        ServiceBookingItem serviceBookingItem = this.f77127m2;
        if (serviceBookingItem != null) {
            this.f77043O2.add(serviceBookingItem);
        }
        AdvertDetailsContactBarItem advertDetailsContactBarItem = this.f77161v0;
        if (advertDetailsContactBarItem != null) {
            this.f77043O2.add(g(advertDetails.isGigItem() ? 12 : advertDetails.isRedesign() ? 20 : 26));
            this.f77043O2.add(advertDetailsContactBarItem);
        }
    }

    public final void i(AdvertDetails advertDetails) {
        ServiceBookingItem serviceBookingItem = this.f77127m2;
        if (serviceBookingItem != null) {
            this.f77043O2.add(serviceBookingItem);
        }
        AdvertDetailsContactBarItem advertDetailsContactBarItem = this.f77161v0;
        if (advertDetailsContactBarItem != null) {
            this.f77043O2.add(g(advertDetails.isGigItem() ? 12 : advertDetails.isRedesign() ? 22 : 26));
            this.f77043O2.add(advertDetailsContactBarItem);
        }
        AddressHint addressHint = this.f77016I;
        if (addressHint != null) {
            this.f77043O2.add(addressHint);
            this.f77043O2.add(g(2));
        }
        List<AdvertDetailsGeoReferenceItem> list = this.f77090d1;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                this.f77043O2.add((AdvertDetailsGeoReferenceItem) it.next());
            }
        }
        AdvertDetailsAddressItem advertDetailsAddressItem = this.f77020J;
        if (advertDetailsAddressItem != null) {
            this.f77043O2.add(advertDetailsAddressItem);
        }
        AdvertDetailsServicesWorkTimeItem advertDetailsServicesWorkTimeItem = this.f77027K2;
        if (advertDetailsServicesWorkTimeItem != null) {
            this.f77043O2.add(advertDetailsServicesWorkTimeItem);
        }
        AdvertDetailsGeoZonesItem advertDetailsGeoZonesItem = this.f77094e1;
        if (advertDetailsGeoZonesItem != null) {
            this.f77043O2.add(advertDetailsGeoZonesItem);
        }
        AdvertDetailsAddressGeoDistanceItem advertDetailsAddressGeoDistanceItem = this.f77008G;
        if (advertDetailsAddressGeoDistanceItem != null) {
            this.f77043O2.add(advertDetailsAddressGeoDistanceItem);
        }
        AdvertDetailsShowOnMapItem advertDetailsShowOnMapItem = this.f77179z2;
        if (advertDetailsShowOnMapItem != null) {
            this.f77043O2.add(advertDetailsShowOnMapItem);
        }
    }

    public final void j() {
        Object objRemove;
        AdvertDetails advertDetails = this.f77080b;
        if (advertDetails == null) {
            return;
        }
        AdditionalSellerTitleItem additionalSellerTitleItem = this.f77000E;
        if (additionalSellerTitleItem != null) {
            this.f77043O2.add(additionalSellerTitleItem);
            this.f77043O2.add(g(8));
        }
        AdvertDetailsReviewsScoreItem advertDetailsReviewsScoreItem = this.f76996D;
        if (advertDetailsReviewsScoreItem != null) {
            this.f77043O2.add(advertDetailsReviewsScoreItem);
            this.f77043O2.add(g(2));
        }
        int i12 = 12;
        AdvertDetailsFlatsItem advertDetailsFlatsItem = this.f76992C;
        if (advertDetailsFlatsItem != null) {
            if (!(C42745f0.S(this.f77043O2) instanceof AdvertDetailsGapItem)) {
                this.f77043O2.add(g(16));
            }
            this.f77043O2.add(advertDetailsFlatsItem);
            objRemove = this.f77112j.remove(Long.valueOf(advertDetailsFlatsItem.f84654b));
            ExpandItemsButtonItem expandItemsButtonItem = (ExpandItemsButtonItem) objRemove;
            if (expandItemsButtonItem != null) {
                this.f77043O2.add(expandItemsButtonItem);
                this.f77043O2.add(g(12));
            } else if (!advertDetails.isRedesign()) {
                this.f77043O2.add(g(12));
            }
        } else {
            objRemove = null;
        }
        AdditionalSellerFeaturesItem additionalSellerFeaturesItem = this.f76988B;
        if (additionalSellerFeaturesItem != null) {
            this.f77043O2.add(g(objRemove != null ? 20 : 12));
            this.f77043O2.add(additionalSellerFeaturesItem);
        }
        AdditionalSellerButtonItem additionalSellerButtonItem = this.f76984A;
        if (additionalSellerButtonItem != null) {
            List<PersistableSpannedItem> list = this.f77043O2;
            if (additionalSellerFeaturesItem != null) {
                i12 = 24;
            } else if (objRemove != null) {
                i12 = 20;
            }
            list.add(g(i12));
            this.f77043O2.add(additionalSellerButtonItem);
        }
    }

    public final void k(AdvertDetails advertDetails, boolean z12) {
        G0 g02;
        Object next;
        G0 g03;
        if (z12) {
            GarageCompatibilityV3Item garageCompatibilityV3Item = this.f77078a1;
            if (garageCompatibilityV3Item != null) {
                this.f77043O2.add(g(20));
                this.f77043O2.add(garageCompatibilityV3Item);
            }
            List<AdvertDetailsFlatsItem> list = this.f77054S0;
            boolean zA2 = O2.a(list);
            IceBreakersItem iceBreakersItem = this.f77142q1;
            u3.l<RiseIcebreakersItemTestGroup> lVar = this.f77140q;
            boolean z13 = this.f77120l;
            if (zA2 && z13) {
                RiseIcebreakersItemTestGroup riseIcebreakersItemTestGroup = lVar.f439745a.f439749b;
                riseIcebreakersItemTestGroup.getClass();
                if (riseIcebreakersItemTestGroup == RiseIcebreakersItemTestGroup.f67919e) {
                    if (C42745f0.S(this.f77043O2) instanceof AdvertDetailsNoteItem) {
                        this.f77043O2.add(g(18));
                    }
                    if (iceBreakersItem != null) {
                        this.f77043O2.add(iceBreakersItem);
                    }
                    this.f77043O2.add(g(20));
                }
            }
            LinkedHashMap linkedHashMap = this.f77112j;
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
                    if (i12 == 0 && advertDetailsFlatsItem.f84658f != null && ((this.f77127m2 == null || advertDetails.isRedesign()) && !(C42745f0.S(this.f77043O2) instanceof IceBreakersItem) && !(C42745f0.S(this.f77043O2) instanceof AdvertDetailsGapItem))) {
                        this.f77043O2.add(g(this.f77132o == OffersPosition.BEFORE_ALL_PARAMETERS ? 12 : 16));
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
                        this.f77088d.B1(String.valueOf(((ServicesRealtySheetLink) parameter.getDeepLink()).f280421e));
                    }
                    this.f77043O2.add(advertDetailsFlatsItem);
                    ExpandItemsButtonItem expandItemsButtonItem = (ExpandItemsButtonItem) linkedHashMap.remove(Long.valueOf(advertDetailsFlatsItem.f84654b));
                    if (expandItemsButtonItem != null) {
                        this.f77043O2.add(expandItemsButtonItem);
                        if (!advertDetails.isRedesign()) {
                            this.f77043O2.add(g(12));
                        }
                        g03 = G0.f406611a;
                    } else {
                        g03 = null;
                    }
                    if (g03 == null && !advertDetails.isRedesign()) {
                        this.f77043O2.add(g(12));
                    }
                    i12 = i13;
                }
            }
            if (O2.a(list) && z13) {
                RiseIcebreakersItemTestGroup riseIcebreakersItemTestGroup2 = lVar.f439745a.f439749b;
                riseIcebreakersItemTestGroup2.getClass();
                if (riseIcebreakersItemTestGroup2 == RiseIcebreakersItemTestGroup.f67918d) {
                    if ((C42745f0.S(this.f77043O2) instanceof AdvertDetailsFlatsItem) || (C42745f0.S(this.f77043O2) instanceof ExpandItemsButtonItem)) {
                        this.f77043O2.add(g(18));
                    }
                    if (iceBreakersItem != null) {
                        this.f77043O2.add(iceBreakersItem);
                    }
                }
            }
            EarlyAccessAdvertItem earlyAccessAdvertItem = this.f77045P0;
            if (earlyAccessAdvertItem != null) {
                this.f77043O2.add(g(16));
                this.f77043O2.add(earlyAccessAdvertItem);
            }
            AdvertDetailsFlatsItem advertDetailsFlatsItem2 = this.f77067W1;
            if (advertDetailsFlatsItem2 != null) {
                if (!(C42745f0.S(this.f77043O2) instanceof AdvertDetailsGapItem)) {
                    this.f77043O2.add(g(28));
                }
                this.f77043O2.add(advertDetailsFlatsItem2);
                ExpandItemsButtonItem expandItemsButtonItem2 = (ExpandItemsButtonItem) linkedHashMap.remove(Long.valueOf(advertDetailsFlatsItem2.f84654b));
                if (expandItemsButtonItem2 != null) {
                    this.f77043O2.add(expandItemsButtonItem2);
                    if (!advertDetails.isRedesign()) {
                        this.f77043O2.add(g(12));
                    }
                    g02 = G0.f406611a;
                } else {
                    g02 = null;
                }
                if (g02 == null && !advertDetails.isRedesign()) {
                    this.f77043O2.add(g(12));
                }
            }
            AdvertDetailsFlatsItem advertDetailsFlatsItem3 = this.f77133o0;
            if (advertDetailsFlatsItem3 != null) {
                if (!(C42745f0.S(this.f77043O2) instanceof AdvertDetailsGapItem)) {
                    this.f77043O2.add(g(28));
                }
                this.f77043O2.add(advertDetailsFlatsItem3);
                ExpandItemsButtonItem expandItemsButtonItem3 = (ExpandItemsButtonItem) linkedHashMap.remove(Long.valueOf(advertDetailsFlatsItem3.f84654b));
                if (expandItemsButtonItem3 != null) {
                    this.f77043O2.add(expandItemsButtonItem3);
                    if (!advertDetails.isRedesign()) {
                        this.f77043O2.add(g(12));
                    }
                    g04 = G0.f406611a;
                }
                if (g04 != null || advertDetails.isRedesign()) {
                    return;
                }
                this.f77043O2.add(g(12));
            }
        }
    }

    public final void l(boolean z12, boolean z13, AdvertDetails advertDetails) {
        if (z12) {
            List<AdvertDetailsFlatsItem> list = this.f77054S0;
            IceBreakersItem iceBreakersItem = this.f77142q1;
            u3.l<RiseIcebreakersItemTestGroup> lVar = this.f77140q;
            boolean z14 = this.f77120l;
            if ((list == null || list.isEmpty()) && z14) {
                RiseIcebreakersItemTestGroup riseIcebreakersItemTestGroup = lVar.f439745a.f439749b;
                riseIcebreakersItemTestGroup.getClass();
                if (riseIcebreakersItemTestGroup == RiseIcebreakersItemTestGroup.f67919e && iceBreakersItem != null) {
                    this.f77043O2.add(iceBreakersItem);
                }
            }
            AdvertDetailsDescriptionItem advertDetailsDescriptionItem = this.f77001E0;
            if (advertDetailsDescriptionItem != null) {
                if (z13) {
                    boolean zIsGigItem = advertDetails.isGigItem();
                    InterfaceC28240u interfaceC28240u = this.f77136p;
                    String strD = zIsGigItem ? interfaceC28240u.d() : interfaceC28240u.g();
                    PersistableSpannedItem persistableSpannedItem = (PersistableSpannedItem) C42745f0.S(this.f77043O2);
                    boolean z15 = persistableSpannedItem instanceof AdvertPriceListPreviewItem;
                    AdvertDetails advertDetails2 = this.f77080b;
                    int i12 = 28;
                    if (z15) {
                        String str = ((AdvertPriceListPreviewItem) persistableSpannedItem).f84113h;
                        if (str == null || str.length() == 0) {
                            i12 = 20;
                        }
                    } else if (advertDetails2 == null || !advertDetails2.isGigItem()) {
                        i12 = (advertDetails2 == null || !advertDetails2.isRedesign()) ? 12 : 32;
                    }
                    Integer numValueOf = Integer.valueOf(i12);
                    Integer numValueOf2 = null;
                    Integer numValueOf3 = ((advertDetails2 == null || !advertDetails2.isGigItem()) && (advertDetails2 == null || !advertDetails2.isServicesRedesign())) ? ((advertDetails2 == null || !advertDetails2.isRestyle()) && (advertDetails2 == null || !advertDetails2.isRealtyRedesign())) ? Integer.valueOf(R.attr.textHeadingLarge) : Integer.valueOf(R.attr.textH2) : null;
                    if ((advertDetails2 != null && advertDetails2.isGigItem()) || (advertDetails2 != null && advertDetails2.isServicesRedesign())) {
                        numValueOf2 = Integer.valueOf(R.style.Re23_Text_H25);
                    }
                    this.f77043O2.add(this.f77104h.a(numValueOf, numValueOf3, numValueOf2, strD));
                }
                this.f77043O2.add(advertDetailsDescriptionItem);
            }
            if ((list == null || list.isEmpty()) && z14) {
                RiseIcebreakersItemTestGroup riseIcebreakersItemTestGroup2 = lVar.f439745a.f439749b;
                riseIcebreakersItemTestGroup2.getClass();
                if (riseIcebreakersItemTestGroup2 != RiseIcebreakersItemTestGroup.f67918d || iceBreakersItem == null) {
                    return;
                }
                this.f77043O2.add(iceBreakersItem);
            }
        }
    }

    public final boolean m(AdvertDetails advertDetails) {
        ItemCardRedesign itemCardRedesign = advertDetails.getItemCardRedesign();
        if (!(itemCardRedesign != null ? L.f(itemCardRedesign.getIsPriceListOnTopPosition(), Boolean.TRUE) : false)) {
            return false;
        }
        B2 b22 = this.f77144r;
        b22.getClass();
        n<Object> nVar = B2.f67184X[6];
        return ((Boolean) b22.f67214h.a().invoke()).booleanValue();
    }

    public final boolean n(AdvertDetails advertDetails) {
        return this.f77156u.a(advertDetails) || this.f77148s.a(advertDetails);
    }
}
