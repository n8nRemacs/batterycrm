package com.avito.android.advert.item;

import android.os.Bundle;
import androidx.recyclerview.widget.GridLayoutManager;
import com.avito.android.B2;
import com.avito.android.C29640d;
import com.avito.android.R;
import com.avito.android.ab_tests.configs.RiseIcebreakersItemTestGroup;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.advert.InterfaceC28240u;
import com.avito.android.advert.di.C27710t;
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
import com.avito.android.advert.item.auto_media.AdvertDetailsAutoMediaItem;
import com.avito.android.advert.item.auto_media.select_pixel.AdvertDetailsAutoMediaSelectPixelItem;
import com.avito.android.advert.item.auto_picker_banner.AutoPickerBannerItem;
import com.avito.android.advert.item.autoteka.common.AdvertDetailsAutotekaTeaserItemCommon;
import com.avito.android.advert.item.autoteka.teaser.AdvertDetailsAutotekaTeaserItem;
import com.avito.android.advert.item.autoteka.teaser_v2.AdvertDetailsAutotekaTeaserV2Item;
import com.avito.android.advert.item.autoteka.teaser_v3.AdvertDetailsAutotekaTeaserV3Item;
import com.avito.android.advert.item.autoteka_select.teaser.AdvertDetailsAutotekaSelectTeaserItem;
import com.avito.android.advert.item.b2c.AdvertDetailsB2CBottomItem;
import com.avito.android.advert.item.blocks.items_factories.A4;
import com.avito.android.advert.item.blocks.items_factories.AdvertDetailsHotelDescriptionItemFactory;
import com.avito.android.advert.item.blocks.items_factories.B3;
import com.avito.android.advert.item.blocks.items_factories.B5;
import com.avito.android.advert.item.blocks.items_factories.C27934b5;
import com.avito.android.advert.item.blocks.items_factories.C28070w1;
import com.avito.android.advert.item.blocks.items_factories.D2;
import com.avito.android.advert.item.blocks.items_factories.D4;
import com.avito.android.advert.item.blocks.items_factories.E3;
import com.avito.android.advert.item.blocks.items_factories.E5;
import com.avito.android.advert.item.blocks.items_factories.G2;
import com.avito.android.advert.item.blocks.items_factories.G4;
import com.avito.android.advert.item.blocks.items_factories.H3;
import com.avito.android.advert.item.blocks.items_factories.H5;
import com.avito.android.advert.item.blocks.items_factories.InterfaceC27921a;
import com.avito.android.advert.item.blocks.items_factories.InterfaceC27923a1;
import com.avito.android.advert.item.blocks.items_factories.InterfaceC27936c0;
import com.avito.android.advert.item.blocks.items_factories.InterfaceC27939c3;
import com.avito.android.advert.item.blocks.items_factories.InterfaceC27940c4;
import com.avito.android.advert.item.blocks.items_factories.InterfaceC27942d;
import com.avito.android.advert.item.blocks.items_factories.InterfaceC27944d1;
import com.avito.android.advert.item.blocks.items_factories.InterfaceC27948d5;
import com.avito.android.advert.item.blocks.items_factories.InterfaceC27952e2;
import com.avito.android.advert.item.blocks.items_factories.InterfaceC27957f0;
import com.avito.android.advert.item.blocks.items_factories.InterfaceC27961f4;
import com.avito.android.advert.item.blocks.items_factories.InterfaceC27963g;
import com.avito.android.advert.item.blocks.items_factories.InterfaceC27965g1;
import com.avito.android.advert.item.blocks.items_factories.InterfaceC27967g3;
import com.avito.android.advert.item.blocks.items_factories.InterfaceC27969g5;
import com.avito.android.advert.item.blocks.items_factories.InterfaceC27973h2;
import com.avito.android.advert.item.blocks.items_factories.InterfaceC27978i0;
import com.avito.android.advert.item.blocks.items_factories.InterfaceC27982i4;
import com.avito.android.advert.item.blocks.items_factories.InterfaceC27984j;
import com.avito.android.advert.item.blocks.items_factories.InterfaceC27986j1;
import com.avito.android.advert.item.blocks.items_factories.InterfaceC27988j3;
import com.avito.android.advert.item.blocks.items_factories.InterfaceC27990j5;
import com.avito.android.advert.item.blocks.items_factories.InterfaceC27994k2;
import com.avito.android.advert.item.blocks.items_factories.InterfaceC28003l4;
import com.avito.android.advert.item.blocks.items_factories.InterfaceC28005m;
import com.avito.android.advert.item.blocks.items_factories.InterfaceC28007m1;
import com.avito.android.advert.item.blocks.items_factories.InterfaceC28009m3;
import com.avito.android.advert.item.blocks.items_factories.InterfaceC28011m5;
import com.avito.android.advert.item.blocks.items_factories.InterfaceC28020o0;
import com.avito.android.advert.item.blocks.items_factories.InterfaceC28022o2;
import com.avito.android.advert.item.blocks.items_factories.InterfaceC28024o4;
import com.avito.android.advert.item.blocks.items_factories.InterfaceC28026p;
import com.avito.android.advert.item.blocks.items_factories.InterfaceC28028p1;
import com.avito.android.advert.item.blocks.items_factories.InterfaceC28030p3;
import com.avito.android.advert.item.blocks.items_factories.InterfaceC28032p5;
import com.avito.android.advert.item.blocks.items_factories.InterfaceC28039r0;
import com.avito.android.advert.item.blocks.items_factories.InterfaceC28041r2;
import com.avito.android.advert.item.blocks.items_factories.InterfaceC28043r4;
import com.avito.android.advert.item.blocks.items_factories.InterfaceC28044s;
import com.avito.android.advert.item.blocks.items_factories.InterfaceC28046s1;
import com.avito.android.advert.item.blocks.items_factories.InterfaceC28048s3;
import com.avito.android.advert.item.blocks.items_factories.InterfaceC28057u0;
import com.avito.android.advert.item.blocks.items_factories.InterfaceC28059u2;
import com.avito.android.advert.item.blocks.items_factories.InterfaceC28061u4;
import com.avito.android.advert.item.blocks.items_factories.InterfaceC28066v3;
import com.avito.android.advert.item.blocks.items_factories.InterfaceC28068w;
import com.avito.android.advert.item.blocks.items_factories.InterfaceC28075x0;
import com.avito.android.advert.item.blocks.items_factories.InterfaceC28079x4;
import com.avito.android.advert.item.blocks.items_factories.InterfaceC28082y1;
import com.avito.android.advert.item.blocks.items_factories.InterfaceC28084y3;
import com.avito.android.advert.item.blocks.items_factories.J4;
import com.avito.android.advert.item.blocks.items_factories.K2;
import com.avito.android.advert.item.blocks.items_factories.K3;
import com.avito.android.advert.item.blocks.items_factories.K5;
import com.avito.android.advert.item.blocks.items_factories.M4;
import com.avito.android.advert.item.blocks.items_factories.N2;
import com.avito.android.advert.item.blocks.items_factories.N3;
import com.avito.android.advert.item.blocks.items_factories.P4;
import com.avito.android.advert.item.blocks.items_factories.Q3;
import com.avito.android.advert.item.blocks.items_factories.T2;
import com.avito.android.advert.item.blocks.items_factories.T3;
import com.avito.android.advert.item.blocks.items_factories.W2;
import com.avito.android.advert.item.blocks.items_factories.W3;
import com.avito.android.advert.item.blocks.items_factories.Y4;
import com.avito.android.advert.item.blocks.items_factories.Z3;
import com.avito.android.advert.item.blocks.items_factories.s5;
import com.avito.android.advert.item.blocks.items_factories.v5;
import com.avito.android.advert.item.blocks.items_factories.y5;
import com.avito.android.advert.item.brandingGallery.block.BrandingGalleryBlockItem;
import com.avito.android.advert.item.branding_advantages.block.BrandingAdvantagesBlockItem;
import com.avito.android.advert.item.buyer_trust_banner.BuyerTrustBannerItem;
import com.avito.android.advert.item.chat_history.ChatHistoryItem;
import com.avito.android.advert.item.comfortable_deal.ExpertBlockItem;
import com.avito.android.advert.item.commercials.AdvertSerpCommercialBanner;
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
import com.avito.android.advert.item.cv_phone_actualization.AdvertCvPhoneActualizationAction;
import com.avito.android.advert.item.cv_phone_actualization.AdvertCvPhoneActualizationActionType;
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
import com.avito.android.advert.item.icebreakers_redesign.IcebreakersRedesignItem;
import com.avito.android.advert.item.installments.InstallmentsBlockItem;
import com.avito.android.advert.item.interiorPhotos.InteriorPhotosItem;
import com.avito.android.advert.item.items_list_builder.c;
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
import com.avito.android.advert.item.realty_usp.RealtyUspItem;
import com.avito.android.advert.item.recall_me.RecallMeBlockItem;
import com.avito.android.advert.item.rent_agreement.RentAgreementItem;
import com.avito.android.advert.item.reservation.AdvertReservationInfoItem;
import com.avito.android.advert.item.reusable_amenities.AmenitiesItem;
import com.avito.android.advert.item.reviews.AdvertDetailsRatingLLMSummaryItem;
import com.avito.android.advert.item.reviews.AdvertDetailsReviewsScoreItem;
import com.avito.android.advert.item.safedeal.info.AdvertDetailsSafeDealInfoItem;
import com.avito.android.advert.item.safedeal.real_one_click_payment_block.AdvertDetailsSafeDealPaymentBlockItem;
import com.avito.android.advert.item.safedeal.real_one_click_payment_block.PaymentBlockItemState;
import com.avito.android.advert.item.safedeal.services.AdvertDetailsSafeDealServicesItem;
import com.avito.android.advert.item.safedeal.trust_factors.TrustFactorsItem;
import com.avito.android.advert.item.salary_range.AdvertSalaryRangeItem;
import com.avito.android.advert.item.sales_banner.AdvertDetailsStickedSalesBannerItem;
import com.avito.android.advert.item.scroll_up.AdvertDetailsScrollUpItem;
import com.avito.android.advert.item.select.benefits.AdvertDetailsAutoSelectItem;
import com.avito.android.advert.item.select.booking.AutoSelectBookingItem;
import com.avito.android.advert.item.select.controls.AutoSelectControlsItem;
import com.avito.android.advert.item.select.no_click_contact.AutoSelectNoClickContactItem;
import com.avito.android.advert.item.select.number_input.AutoSelectNumberInputButtonParams;
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
import com.avito.android.advert.item.similars.SimilarsStartMarkerItem;
import com.avito.android.advert.item.similars_button.AdvertDetailsSimilarsButtonItem;
import com.avito.android.advert.item.skeleton.AdvertDetailsSkeletonItem;
import com.avito.android.advert.item.sparePartsCost.SparePartsCostItem;
import com.avito.android.advert.item.styled_title.StyledTitleItem;
import com.avito.android.advert.item.sx_addresses_header.AdvertDetailsSxAddressesHeaderItem;
import com.avito.android.advert.item.travel.price.AdvertDetailsTravelPriceItem;
import com.avito.android.advert.item.travel.trust.AdvertDetailsTravelTrustItem;
import com.avito.android.advert.item.trust_factors.DeliveryTrustFactorsItem;
import com.avito.android.advert.item.verification.AdvertVerificationItem;
import com.avito.android.advert.item.video_call_request.AdvertVideoCallRequestItem;
import com.avito.android.advert.item.wallet_info.WalletInfoItem;
import com.avito.android.advert_amenities.Amenities;
import com.avito.android.advert_amenities.InteriorPhotosBlock;
import com.avito.android.advert_amenities.SellerDetails;
import com.avito.android.advert_amenities.analytics.AmenitiesAndInteriorPhotoAnalyticsTrackerImpl;
import com.avito.android.advert_core.advert.AdvertDetailsFlatViewType;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.advert_core.advert_badge_bar.AdvertBadgeBarItem;
import com.avito.android.advert_core.analytics.body_condition.FromPage;
import com.avito.android.advert_core.auto_select_banner.AutoSelectBannerItem;
import com.avito.android.advert_core.auto_select_manager_info.AutoSelectManagerInfoItem;
import com.avito.android.advert_core.auto_select_parameters_v2.AutoSelectParametersV2Item;
import com.avito.android.advert_core.auto_select_parameters_v2.advantage.AutoSelectExpandableAdvantageItem;
import com.avito.android.advert_core.body_condition.AdvertDetailsCarBodyConditionItem;
import com.avito.android.advert_core.comfortable_deal_promo.AdvertDetailsComfortableDealPromoItem;
import com.avito.android.advert_core.development_offers.DevelopmentOffersItem;
import com.avito.android.advert_core.domoteka_report_teaser.AdvertDetailsDomotekaReportTeaserItem;
import com.avito.android.advert_core.equipments.redesign.EquipmentsItem;
import com.avito.android.advert_core.equipments.redesign.Page;
import com.avito.android.advert_core.expand_items_button.ExpandItemsButtonItem;
import com.avito.android.advert_core.gap.AdvertDetailsGapItem;
import com.avito.android.advert_core.information_about.InformationAboutItem;
import com.avito.android.advert_core.map.AdvertMapItem;
import com.avito.android.advert_core.offers.OffersItem;
import com.avito.android.advert_core.pp_recall_promo.AdvertDetailsPpRecallPromoItem;
import com.avito.android.advert_core.price_list.preview.AdvertPriceListPreviewItem;
import com.avito.android.advert_core.safedeal.trust_factors.TrustFactorsComponent;
import com.avito.android.advert_core.service_education.ServiceEducationItem;
import com.avito.android.advert_details.AdvertDetailsStyle;
import com.avito.android.advert_details_items.address.AdvertDetailsAddressItem;
import com.avito.android.advert_details_items.campaigns.AdvertDetailsCampaignsItem;
import com.avito.android.advert_details_items.carousel_photogallery.CarouselPhotoGalleryItem;
import com.avito.android.advert_details_items.description.AdvertDetailsDescriptionItem;
import com.avito.android.advert_details_items.flats.AdvertDetailsFlatsItem;
import com.avito.android.advert_details_items.geo_market_report.AdvertDetailsGeoMarketReportItem;
import com.avito.android.advert_details_items.geo_zones.AdvertDetailsGeoZonesItem;
import com.avito.android.advert_details_items.georeference.AdvertDetailsGeoReferenceItem;
import com.avito.android.advert_details_items.imv_v4_cars.ImvCarsData;
import com.avito.android.advert_details_items.imv_v4_cars.ImvCarsV4Item;
import com.avito.android.advert_details_items.neighboring_dates.AdvertDetailsNeighboringDatesItem;
import com.avito.android.advert_details_items.optimal_price.AdvertDetailsOptimalPriceItem;
import com.avito.android.advert_details_items.photogallery.AdvertDetailsGalleryItem;
import com.avito.android.advert_details_items.portfolio.AdvertDetailsPortfolioBlockItem;
import com.avito.android.advert_details_items.price.AdvertDetailsPriceItem;
import com.avito.android.advert_details_items.price_description_button.AdvertDetailsPriceDescriptionButtonItem;
import com.avito.android.advert_details_items.price_discount.PriceWithDiscountItem;
import com.avito.android.advert_details_items.price_history.PriceHistoryItem;
import com.avito.android.advert_details_items.search_suggests.AdvertDetailsSearchSuggestsItem;
import com.avito.android.advert_details_items.sellerprofile.AdvertDetailsSellerProfileItem;
import com.avito.android.advert_details_items.sellerprofile.subscription.SellerSubscriptionItem;
import com.avito.android.advert_details_items.services_discount_and_gifts.AdvertDetailsServicesDiscountAndBuyerGiftItem;
import com.avito.android.advert_details_items.show_description_button.AdvertDetailsShowDescriptionItem;
import com.avito.android.advert_details_items.status_badge.AdvertDetailsClosingReasonItem;
import com.avito.android.advert_details_items.title.AdvertDetailsTitleItem;
import com.avito.android.advert_details_items.work_time.AdvertDetailsServicesWorkTimeItem;
import com.avito.android.advert_multi_items.AdvertDetailsMultiItemState;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.auto_loans_composite_broker.v1.AdvertDetailsCompositeBrokerV1Item;
import com.avito.android.auto_loans_composite_broker.v2.AdvertDetailsCompositeBrokerV2Item;
import com.avito.android.avito_map.AvitoMapMarkerKt;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.comfortable_deal.deeplink.PpRecallDeeplink;
import com.avito.android.component.advert_badge_bar.badge.BadgeItem;
import com.avito.android.credits.CreditCalculatorItem;
import com.avito.android.credits.broker_link.CreditBrokerLinkItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.di.module.InterfaceC30174s;
import com.avito.android.features.auto.ab_tests.configs.AutoMediaMotoWaterTestGroup;
import com.avito.android.html_formatter.HtmlCharSequence;
import com.avito.android.remote.cv_phone_actualization_banner.CvPhoneActualizationBanner;
import com.avito.android.remote.cv_state.CvState;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.AdditionalSeller;
import com.avito.android.remote.model.AdvertAction;
import com.avito.android.remote.model.AdvertActions;
import com.avito.android.remote.model.AdvertAutoSelect;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.AdvertDetailsAutoPickerBanner;
import com.avito.android.remote.model.AdvertEquipments;
import com.avito.android.remote.model.AdvertParameters;
import com.avito.android.remote.model.AdvertPrice;
import com.avito.android.remote.model.AdvertSeller;
import com.avito.android.remote.model.AdvertVerification;
import com.avito.android.remote.model.CarMarketPrice;
import com.avito.android.remote.model.DevelopmentOffersPosition;
import com.avito.android.remote.model.ExpandItemsButton;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.OfferType;
import com.avito.android.remote.model.OffersPosition;
import com.avito.android.remote.model.PriceRanges;
import com.avito.android.remote.model.Range;
import com.avito.android.remote.model.SimpleAdvertAction;
import com.avito.android.remote.model.SparePartsCost;
import com.avito.android.remote.model.UniversalColorKt;
import com.avito.android.remote.model.advert_details.consultation_auto.AutoNewCarsLeadForm;
import com.avito.android.remote.model.advert_service.AdvertServiceAppFilling;
import com.avito.android.remote.model.advert_service_discount_and_buyer_gift.AdvertServicesDiscountAndBuyerGift;
import com.avito.android.remote.model.auto_select.AutoSelectAdvantage;
import com.avito.android.remote.model.auto_select.AutoSelectBooking;
import com.avito.android.remote.model.auto_select.AutoSelectControls;
import com.avito.android.remote.model.auto_select.AutoSelectNoClickContact;
import com.avito.android.remote.model.auto_select.AutoSelectParametersV2;
import com.avito.android.remote.model.auto_select.AutoSelectTeaser;
import com.avito.android.remote.model.autotekateaser.AutotekaTeaserItemResponse;
import com.avito.android.remote.model.credit_broker.AdvertCreditCompositeBrokerV2;
import com.avito.android.remote.model.credit_broker.CreditBrokerProduct;
import com.avito.android.remote.model.item_reviews.ItemReviews;
import com.avito.android.remote.model.item_reviews.ItemReviewsEntry;
import com.avito.android.remote.model.item_reviews.ItemReviewsMain;
import com.avito.android.remote.model.model_card.ModelCardInfo;
import com.avito.android.remote.model.price_list.AdvertPriceListPreviewResponse;
import com.avito.android.remote.model.rich_geo_block.RichGeoBlock;
import com.avito.android.remote.model.service_education.ServiceEducation;
import com.avito.android.remote.model.service_order.ServiceOrder;
import com.avito.android.remote.model.service_order.ServiceOrderAction;
import com.avito.android.remote.model.services_review_volunteers.ServicesReviewVolunteers;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.parse.adapter.CompositeBrokerCalculatorV2;
import com.avito.android.remote.safedeal.SafeDeal;
import com.avito.android.repair_calculator.AdvertDetailsRepairCalculatorItem;
import com.avito.android.serp.adapter.PersistableSpannedItem;
import com.avito.android.service_booking.remote.model.ServiceBooking;
import com.avito.android.service_booking.remote.model.ServiceBookingTooltip;
import com.avito.android.service_transportation_info.advert_details.geo.AdvertDetailsServicesTransportationGeoItem;
import com.avito.android.service_transportation_info.model.TransportInfo;
import com.avito.android.util.Kundle;
import com.avito.android.util.O2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C42822w;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.internal.C43238h;
import lD.C43617a;

/* compiled from: AdvertDetailsItemsPresenter.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/T;", "Lcom/avito/android/advert/item/S;", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class T implements S {

    /* renamed from: Z5, reason: collision with root package name */
    public static final /* synthetic */ int f71797Z5 = 0;

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public final B3 f71798A;

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public final A4 f71799A0;

    /* renamed from: A1, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28046s1 f71800A1;

    /* renamed from: A2, reason: collision with root package name */
    @Y61.l
    public AutoSelectControlsItem f71801A2;

    /* renamed from: A3, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsFmpCalculatorItem f71802A3;

    /* renamed from: A4, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsPriceDescriptionButtonItem f71803A4;

    /* renamed from: A5, reason: collision with root package name */
    @Y61.l
    public AdvertVideoCallRequestItem f71804A5;

    /* renamed from: B, reason: collision with root package name */
    @Y61.k
    public final W3 f71805B;

    /* renamed from: B0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28041r2 f71806B0;

    /* renamed from: B1, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.blocks.items_factories.C1 f71807B1;

    /* renamed from: B2, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsAutoSelectItem f71808B2;

    /* renamed from: B3, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsFmpOfferItem f71809B3;

    /* renamed from: B4, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsPrivacyDisclaimerItem f71810B4;

    /* renamed from: B5, reason: collision with root package name */
    @Y61.l
    public WalletInfoItem f71811B5;

    /* renamed from: C, reason: collision with root package name */
    @Y61.k
    public final N2 f71812C;

    /* renamed from: C0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28059u2 f71813C0;

    /* renamed from: C1, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28082y1 f71814C1;

    /* renamed from: C2, reason: collision with root package name */
    @Y61.l
    public AutoSelectManagerInfoItem f71815C2;

    /* renamed from: C3, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsFmpProductsItem f71816C3;

    /* renamed from: C4, reason: collision with root package name */
    @Y61.l
    public PromoMechanicsItem f71817C4;

    /* renamed from: C5, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsServicesWorkTimeItem f71818C5;

    /* renamed from: D, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27978i0 f71819D;

    /* renamed from: D0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27957f0 f71820D0;

    /* renamed from: D1, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.blocks.items_factories.G1 f71821D1;

    /* renamed from: D2, reason: collision with root package name */
    @Y61.l
    public AutoSelectNoClickContactItem f71822D2;

    /* renamed from: D3, reason: collision with root package name */
    @Y61.l
    public CarouselPhotoGalleryItem f71823D3;

    /* renamed from: D4, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsRatingPublishItem f71824D4;

    /* renamed from: D5, reason: collision with root package name */
    @Y61.l
    public AutoNewCarsLeadFormItem f71825D5;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final W2 f71826E;

    /* renamed from: E0, reason: collision with root package name */
    @Y61.k
    public final T2 f71827E0;

    /* renamed from: E1, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27948d5 f71828E1;

    /* renamed from: E2, reason: collision with root package name */
    @Y61.l
    public AutoSelectParametersV2Item f71829E2;

    /* renamed from: E3, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsGalleryItem f71830E3;

    /* renamed from: E4, reason: collision with root package name */
    @Y61.l
    public InformationAboutItem f71831E4;

    /* renamed from: E5, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsNeighboringDatesItem f71832E5;

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28024o4 f71833F;

    /* renamed from: F0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27923a1 f71834F0;

    /* renamed from: F1, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28084y3 f71835F1;

    /* renamed from: F2, reason: collision with root package name */
    @Y61.l
    public AutoSelectParametersV3Item f71836F2;

    /* renamed from: F3, reason: collision with root package name */
    @Y61.l
    public GarageCompatibilityV2Item f71837F3;

    /* renamed from: F4, reason: collision with root package name */
    @Y61.l
    public PersistableSpannedItem f71838F4;

    /* renamed from: F5, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsTravelTrustItem f71839F5;

    /* renamed from: G, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28043r4 f71840G;

    /* renamed from: G0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27936c0 f71841G0;

    /* renamed from: G1, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27939c3 f71842G1;

    /* renamed from: G2, reason: collision with root package name */
    @Y61.l
    public AutoSelectTeaserItem f71843G2;

    /* renamed from: G3, reason: collision with root package name */
    @Y61.l
    public GarageCompatibilityV3Item f71844G3;

    /* renamed from: G4, reason: collision with root package name */
    @Y61.l
    public RealtyImvItem f71845G4;

    /* renamed from: G5, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsOptimalPriceItem f71846G5;

    /* renamed from: H, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28075x0 f71847H;

    /* renamed from: H0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28009m3 f71848H0;

    /* renamed from: H1, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28007m1 f71849H1;

    /* renamed from: H2, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsAutotekaTeaserItem f71850H2;

    /* renamed from: H3, reason: collision with root package name */
    @Y61.l
    public GarageCompatibilityV4Item f71851H3;

    /* renamed from: H4, reason: collision with root package name */
    @Y61.l
    public RealtyQuizBannerItem f71852H4;

    /* renamed from: H5, reason: collision with root package name */
    @Y61.l
    public ExpertBlockItem f71853H5;

    /* renamed from: I, reason: collision with root package name */
    @Y61.k
    public final C27934b5 f71854I;

    /* renamed from: I0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28039r0 f71855I0;

    /* renamed from: I1, reason: collision with root package name */
    @Y61.k
    public final G2 f71856I1;

    /* renamed from: I2, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsAutotekaTeaserV2Item f71857I2;

    /* renamed from: I3, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsGeoMarketReportItem f71858I3;

    /* renamed from: I4, reason: collision with root package name */
    @Y61.l
    public RealtyUspItem f71859I4;

    /* renamed from: I5, reason: collision with root package name */
    @Y61.l
    public List<? extends PersistableSpannedItem> f71860I5;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28044s f71861J;

    /* renamed from: J0, reason: collision with root package name */
    @Y61.k
    public final E4.d f71862J0;

    /* renamed from: J1, reason: collision with root package name */
    @Y61.k
    public final K2 f71863J1;

    /* renamed from: J2, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsAutotekaTeaserV3Item f71864J2;

    /* renamed from: J3, reason: collision with root package name */
    @Y61.l
    public List<AdvertDetailsGeoReferenceItem> f71865J3;

    /* renamed from: J4, reason: collision with root package name */
    @Y61.l
    public RecallMeBlockItem f71866J4;

    /* renamed from: J5, reason: collision with root package name */
    @Y61.l
    public DeepLink f71867J5;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.blocks.items_factories.Q1 f71868K;

    /* renamed from: K0, reason: collision with root package name */
    @Y61.k
    public final E4.a f71869K0;

    /* renamed from: K1, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.blocks.items_factories.W1 f71870K1;

    /* renamed from: K2, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsAutotekaSelectTeaserItem f71871K2;

    /* renamed from: K3, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsGeoZonesItem f71872K3;

    /* renamed from: K4, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsFlatsItem f71873K4;

    /* renamed from: K5, reason: collision with root package name */
    @Y61.l
    public kotlin.ranges.l f71874K5;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.blocks.items_factories.N1 f71875L;

    /* renamed from: L0, reason: collision with root package name */
    @Y61.k
    public final E4.l f71876L0;

    /* renamed from: L1, reason: collision with root package name */
    @Y61.k
    public final L4.a f71877L1;

    /* renamed from: L2, reason: collision with root package name */
    @Y61.l
    public PersistableSpannedItem f71878L2;

    /* renamed from: L3, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsDutiesItem f71879L3;

    /* renamed from: L4, reason: collision with root package name */
    @Y61.l
    public RentAgreementItem f71880L4;

    /* renamed from: L5, reason: collision with root package name */
    @Y61.l
    public String f71881L5;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28026p f71882M;

    /* renamed from: M0, reason: collision with root package name */
    @Y61.k
    public final F4.a f71883M0;

    /* renamed from: M1, reason: collision with root package name */
    @Y61.k
    public final P4.a f71884M1;

    /* renamed from: M2, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsB2CBottomItem f71885M2;

    /* renamed from: M3, reason: collision with root package name */
    @Y61.l
    public AdvertMapItem f71886M3;

    /* renamed from: M4, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsRepairCalculatorItem f71887M4;

    /* renamed from: M5, reason: collision with root package name */
    public boolean f71888M5;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final P4 f71889N;

    /* renamed from: N0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_core.short_term_rent.a f71890N0;

    /* renamed from: N1, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28020o0 f71891N1;

    /* renamed from: N2, reason: collision with root package name */
    @Y61.l
    public AdvertBadgeBarItem f71892N2;

    /* renamed from: N3, reason: collision with root package name */
    @Y61.l
    public GigPersonalInfoItem f71893N3;

    /* renamed from: N4, reason: collision with root package name */
    @Y61.l
    public PersistableSpannedItem f71894N4;

    /* renamed from: N5, reason: collision with root package name */
    public boolean f71895N5;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28022o2 f71896O;

    /* renamed from: O0, reason: collision with root package name */
    @Y61.k
    public final E4.i f71897O0;

    /* renamed from: O1, reason: collision with root package name */
    @Y61.k
    public final M4 f71898O1;

    /* renamed from: O2, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsBadgeBarLightItem f71899O2;

    /* renamed from: O3, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsGigSellerItem f71900O3;

    /* renamed from: O4, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsScrollUpItem f71901O4;

    /* renamed from: O5, reason: collision with root package name */
    @Y61.l
    public String f71902O5;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27961f4 f71903P;

    /* renamed from: P0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28032p5 f71904P0;

    /* renamed from: P1, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.blocks.items_factories.M0 f71905P1;

    /* renamed from: P2, reason: collision with root package name */
    @Y61.l
    public BrandingAdvantagesBlockItem f71906P2;

    /* renamed from: P3, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsGroupsItem f71907P3;

    /* renamed from: P4, reason: collision with root package name */
    @Y61.l
    public BlockItem f71908P4;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27940c4 f71910Q;

    /* renamed from: Q0, reason: collision with root package name */
    @Y61.k
    public final s5 f71911Q0;

    /* renamed from: Q1, reason: collision with root package name */
    @Y61.k
    public final H3 f71912Q1;

    /* renamed from: Q2, reason: collision with root package name */
    @Y61.l
    public BrandingGalleryBlockItem f71913Q2;

    /* renamed from: Q3, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsReviewsScoreItem f71914Q3;

    /* renamed from: Q4, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsServicesTransportationGeoItem f71915Q4;

    /* renamed from: Q5, reason: collision with root package name */
    public int f71916Q5;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28003l4 f71917R;

    /* renamed from: R0, reason: collision with root package name */
    @Y61.k
    public final v5 f71918R0;

    /* renamed from: R1, reason: collision with root package name */
    @Y61.k
    public final K3 f71919R1;

    /* renamed from: R2, reason: collision with root package name */
    @Y61.l
    public BuzzoolaCreditBannerItem f71920R2;

    /* renamed from: R3, reason: collision with root package name */
    @Y61.l
    public AdvertHotelDescriptionItem f71921R3;

    /* renamed from: R4, reason: collision with root package name */
    @Y61.l
    public AdvertReservationInfoItem f71922R4;

    /* renamed from: R5, reason: collision with root package name */
    public boolean f71923R5;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.blocks.items_factories.D f71924S;

    /* renamed from: S0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27984j f71925S0;

    /* renamed from: S1, reason: collision with root package name */
    @Y61.k
    public final E4.g f71926S1;

    /* renamed from: S2, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsCampaignsItem f71927S2;

    /* renamed from: S3, reason: collision with root package name */
    @Y61.l
    public AdvertHotelDescriptionItem f71928S3;

    /* renamed from: S4, reason: collision with root package name */
    @Y61.l
    public PersistableSpannedItem f71929S4;

    /* renamed from: S5, reason: collision with root package name */
    @Y61.l
    public DevelopmentOffersPosition f71930S5;

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.blocks.items_factories.G f71931T;

    /* renamed from: T0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28005m f71932T0;

    /* renamed from: T1, reason: collision with root package name */
    @Y61.k
    public final F4.e f71933T1;

    /* renamed from: T2, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsCarBodyConditionItem f71934T2;

    /* renamed from: T3, reason: collision with root package name */
    @Y61.l
    public StyledTitleItem f71935T3;

    /* renamed from: T4, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsSafeDealInfoItem f71936T4;

    /* renamed from: T5, reason: collision with root package name */
    @Y61.l
    public OffersPosition f71937T5;

    /* renamed from: U, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.blocks.items_factories.M f71938U;

    /* renamed from: U0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27963g f71939U0;

    /* renamed from: U1, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28028p1 f71940U1;

    /* renamed from: U2, reason: collision with root package name */
    @Y61.l
    public ChatHistoryItem f71941U2;

    /* renamed from: U3, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsHotelOfferItem f71942U3;

    /* renamed from: U4, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsSafeDealPaymentBlockItem f71943U4;

    /* renamed from: U5, reason: collision with root package name */
    @Y61.l
    public ServicesReviewVolunteers.Position f71944U5;

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final Q3 f71945V;

    /* renamed from: V0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.blocks.items_factories.R0 f71946V0;

    /* renamed from: V1, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f71947V1;

    /* renamed from: V2, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsFlatsItem f71948V2;

    /* renamed from: V3, reason: collision with root package name */
    @Y61.l
    public AdvertHotelPromoWidgetItem f71949V3;

    /* renamed from: V4, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsSafeDealServicesItem f71950V4;

    /* renamed from: V5, reason: collision with root package name */
    @Y61.l
    public AdvertDetails f71951V5;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27944d1 f71952W;

    /* renamed from: W0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.blocks.items_factories.U0 f71953W0;

    /* renamed from: W1, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.O0 f71954W1;

    /* renamed from: W2, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsClosingReasonItem f71955W2;

    /* renamed from: W3, reason: collision with root package name */
    @Y61.l
    public AdvertHotelReviewItem f71956W3;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.blocks.items_factories.P f71959X;

    /* renamed from: X0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.blocks.items_factories.X0 f71960X0;

    /* renamed from: X1, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.bottom_gap.d f71961X1;

    /* renamed from: X2, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsCompositeBrokerV1Item f71962X2;

    /* renamed from: X3, reason: collision with root package name */
    @Y61.l
    public IceBreakersItem f71963X3;

    /* renamed from: X4, reason: collision with root package name */
    @Y61.l
    public AdvertSalaryRangeItem f71964X4;

    /* renamed from: X5, reason: collision with root package name */
    @Y61.k
    public final C43238h f71965X5;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28061u4 f71966Y;

    /* renamed from: Y0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28057u0 f71967Y0;

    /* renamed from: Y1, reason: collision with root package name */
    @Y61.l
    public I1 f71968Y1;

    /* renamed from: Y2, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsCompositeBrokerV2Item f71969Y2;

    /* renamed from: Y3, reason: collision with root package name */
    @Y61.l
    public IcebreakersRedesignItem f71970Y3;

    /* renamed from: Y4, reason: collision with root package name */
    @Y61.l
    public AdvertCvInfoItem f71971Y4;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.blocks.items_factories.K1 f71973Z;

    /* renamed from: Z0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.blocks.items_factories.A2 f71974Z0;

    /* renamed from: Z2, reason: collision with root package name */
    @Y61.l
    public ConsultationAfterIceBreakersItem f71976Z2;

    /* renamed from: Z3, reason: collision with root package name */
    @Y61.l
    public ImvCarsV4Item f71977Z3;

    /* renamed from: Z4, reason: collision with root package name */
    @Y61.l
    public CvMotivationBannerItem f71978Z4;

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f71979a;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.blocks.items_factories.C0 f71980a0;

    /* renamed from: a1, reason: collision with root package name */
    @Y61.k
    public final E3 f71981a1;

    /* renamed from: a3, reason: collision with root package name */
    @Y61.l
    public ConsultationButtonItem f71983a3;

    /* renamed from: a4, reason: collision with root package name */
    @Y61.l
    public AdvertJobSearchStatusItem f71984a4;

    /* renamed from: a5, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsSearchSuggestsItem f71985a5;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f71986b;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.blocks.items_factories.Z f71987b0;

    /* renamed from: b1, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.a f71988b1;

    /* renamed from: b3, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsConsultationItem f71990b3;

    /* renamed from: b4, reason: collision with root package name */
    @Y61.l
    public SeekerResponsesInfoItemV2 f71991b4;

    /* renamed from: b5, reason: collision with root package name */
    @Y61.l
    public SecondaryConsultationItem f71992b5;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.navbar.b f71993c;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.blocks.items_factories.F0 f71994c0;

    /* renamed from: c1, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.commercials.f f71995c1;

    /* renamed from: c2, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsAbuseItem f71996c2;

    /* renamed from: c3, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsContactBarItem f71997c3;

    /* renamed from: c4, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsLeasingBeduinItem f71998c4;

    /* renamed from: c5, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsSellerProfileItem f71999c5;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f72000d;

    /* renamed from: d0, reason: collision with root package name */
    @Y61.k
    public final D2 f72001d0;

    /* renamed from: d1, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.auto_media.h f72002d1;

    /* renamed from: d2, reason: collision with root package name */
    @Y61.l
    public AdditionalSellerButtonItem f72003d2;

    /* renamed from: d3, reason: collision with root package name */
    @Y61.l
    public CreditCalculatorItem f72004d3;

    /* renamed from: d4, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsLeasingCalculatorItem f72005d4;

    /* renamed from: d5, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsSellerSubscriptionItem f72006d5;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28240u f72007e;

    /* renamed from: e0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28030p3 f72008e0;

    /* renamed from: e1, reason: collision with root package name */
    @Y61.k
    public final u3.l<AutoMediaMotoWaterTestGroup> f72009e1;

    /* renamed from: e2, reason: collision with root package name */
    @Y61.l
    public AdditionalSellerFeaturesItem f72010e2;

    /* renamed from: e3, reason: collision with root package name */
    @Y61.l
    public CreditBrokerLinkItem f72011e3;

    /* renamed from: e4, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsLeasingLinkItem f72012e4;

    /* renamed from: e5, reason: collision with root package name */
    @Y61.l
    public ServiceBookingItem f72013e5;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.J0 f72014f;

    /* renamed from: f0, reason: collision with root package name */
    @Y61.k
    public final K5 f72015f0;

    /* renamed from: f1, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27986j1 f72016f1;

    /* renamed from: f2, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsFlatsItem f72017f2;

    /* renamed from: f3, reason: collision with root package name */
    @Y61.l
    public InstallmentsBlockItem f72018f3;

    /* renamed from: f4, reason: collision with root package name */
    @Y61.l
    public MarketplaceSalesAdvertPromoBannerItem f72019f4;

    /* renamed from: f5, reason: collision with root package name */
    @Y61.l
    public ServiceEducationItem f72020f5;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_core.analytics.a f72021g;

    /* renamed from: g0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27967g3 f72022g0;

    /* renamed from: g1, reason: collision with root package name */
    @Y61.k
    public final AdvertDetailsHotelDescriptionItemFactory f72023g1;

    /* renamed from: g2, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsReviewsScoreItem f72024g2;

    /* renamed from: g3, reason: collision with root package name */
    @Y61.l
    public AdvertCvPhoneActualizationItem f72025g3;

    /* renamed from: g4, reason: collision with root package name */
    @Y61.l
    public MarketplaceSalesBannerItem f72026g4;

    /* renamed from: g5, reason: collision with root package name */
    @Y61.l
    public ServiceOrderRequestItem f72027g5;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f72028h;

    /* renamed from: h0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.blocks.items_factories.A f72029h0;

    /* renamed from: h1, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28068w f72030h1;

    /* renamed from: h2, reason: collision with root package name */
    @Y61.l
    public AdditionalSellerTitleItem f72031h2;

    /* renamed from: h3, reason: collision with root package name */
    @Y61.l
    public AdvertCvStateItem f72032h3;

    /* renamed from: h4, reason: collision with root package name */
    @Y61.l
    public MarketplaceRewardsBannerItem f72033h4;

    /* renamed from: h5, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsServicesDiscountAndBuyerGiftItem f72034h5;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final C29640d f72035i;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.blocks.items_factories.J0 f72036i0;

    /* renamed from: i1, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.reusable_amenities.c f72037i1;

    /* renamed from: i2, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsSxAddressesHeaderItem f72038i2;

    /* renamed from: i3, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsDeliverySuggestsItem f72039i3;

    /* renamed from: i4, reason: collision with root package name */
    @Y61.l
    public MarketplaceSalesBannerOutOfBoundsItem f72040i4;

    /* renamed from: i5, reason: collision with root package name */
    @Y61.l
    public ServicesPriceItem f72041i5;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.Z0 f72042j;

    /* renamed from: j0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27921a f72043j0;

    /* renamed from: j1, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.interiorPhotos.c f72044j1;

    /* renamed from: j2, reason: collision with root package name */
    @Y61.l
    public AddressCentrityBlockItem f72045j2;

    /* renamed from: j3, reason: collision with root package name */
    @Y61.l
    public DeliveryTrustFactorsItem f72046j3;

    /* renamed from: j4, reason: collision with root package name */
    @Y61.l
    public BuyerTrustBannerItem f72047j4;

    /* renamed from: j5, reason: collision with root package name */
    @Y61.l
    public ServicesReviewVolunteersItem f72048j5;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final B2 f72049k;

    /* renamed from: k0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28011m5 f72050k0;

    /* renamed from: k1, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27952e2 f72051k1;

    /* renamed from: k2, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsAddressGeoDistanceItem f72052k2;

    /* renamed from: k3, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsDescriptionItem f72053k3;

    /* renamed from: k4, reason: collision with root package name */
    @Y61.l
    public MarketplaceStocksItem f72054k4;

    /* renamed from: k5, reason: collision with root package name */
    @Y61.l
    public ServicesTitleItem f72055k5;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final C43617a f72056l;

    /* renamed from: l0, reason: collision with root package name */
    @Y61.k
    public final E5 f72057l0;

    /* renamed from: l1, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27973h2 f72058l1;

    /* renamed from: l2, reason: collision with root package name */
    @Y61.l
    public AddressHint f72059l2;

    /* renamed from: l3, reason: collision with root package name */
    @Y61.l
    public DeveloperButtonItem f72060l3;

    /* renamed from: l4, reason: collision with root package name */
    @Y61.l
    public MortgageCalculatorItem f72061l4;

    /* renamed from: l5, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsShortTermRentItemDiscountItem f72062l5;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.sellersubscription.p f72063m;

    /* renamed from: m0, reason: collision with root package name */
    @Y61.k
    public final H5 f72064m0;

    /* renamed from: m1, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27994k2 f72065m1;

    /* renamed from: m2, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsAddressItem f72066m2;

    /* renamed from: m3, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsFlatsItem f72067m3;

    /* renamed from: m4, reason: collision with root package name */
    @Y61.l
    public MortgageSnippetItem f72068m4;

    /* renamed from: m5, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsShortTermRentStrButtonsItem f72069m5;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.credits.q f72070n;

    /* renamed from: n0, reason: collision with root package name */
    @Y61.k
    public final B5 f72071n0;

    /* renamed from: n1, reason: collision with root package name */
    @Y61.k
    public final G5.a f72072n1;

    /* renamed from: n2, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsAdvertNumberItem f72073n2;

    /* renamed from: n3, reason: collision with root package name */
    @Y61.l
    public DeveloperTrustItem f72074n3;

    /* renamed from: n4, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsMultiItemItem f72075n4;

    /* renamed from: n5, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsTravelPaymentTogglesItem f72076n5;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f72077o;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final y5 f72078o0;

    /* renamed from: o1, reason: collision with root package name */
    @Y61.k
    public final u3.l<SimpleTestGroupWithNone> f72079o1;

    /* renamed from: o2, reason: collision with root package name */
    @Y61.l
    public AdvertServiceAppFillingButtonItem f72080o2;

    /* renamed from: o3, reason: collision with root package name */
    @Y61.l
    public DevelopmentOffersItem f72081o3;

    /* renamed from: o4, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsNoteItem f72082o4;

    /* renamed from: o5, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsTravelPriceItem f72083o5;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final AdvertDetailsFastOpenParams f72084p;

    /* renamed from: p0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.blocks.items_factories.W f72085p0;

    /* renamed from: p1, reason: collision with root package name */
    @Y61.k
    public final u3.l<RiseIcebreakersItemTestGroup> f72086p1;

    /* renamed from: p2, reason: collision with root package name */
    @Y61.l
    public AdvertServiceAppFillingInfoItem f72087p2;

    /* renamed from: p3, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsDisclaimerItem f72088p3;

    /* renamed from: p4, reason: collision with root package name */
    @Y61.l
    public OffersItem f72089p4;

    /* renamed from: p5, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsShowDescriptionItem f72090p5;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public final AdvertDetailsMultiItemState f72091q;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.k
    public final Y4 f72092q0;

    /* renamed from: q1, reason: collision with root package name */
    @Y61.k
    public final h2 f72093q1;

    /* renamed from: q2, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsAmenitiesItem f72094q2;

    /* renamed from: q3, reason: collision with root package name */
    @Y61.l
    public DisclaimerPDItem f72095q3;

    /* renamed from: q4, reason: collision with root package name */
    @Y61.l
    public OwnershipCostItem f72096q4;

    /* renamed from: q5, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsShowOnMapItem f72097q5;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.multi_item.b f72098r;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.blocks.items_factories.P0 f72099r0;

    /* renamed from: r1, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.safedeal.trust_factors.f f72100r1;

    /* renamed from: r2, reason: collision with root package name */
    @Y61.l
    public AmenitiesItem f72101r2;

    /* renamed from: r3, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsDockingBadgeBarItem f72102r3;

    /* renamed from: r4, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsParkingAddressItem f72103r4;

    /* renamed from: r5, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsShowOnMapItem f72104r5;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.recomendations.j f72105s;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public final C28070w1 f72106s0;

    /* renamed from: s1, reason: collision with root package name */
    @Y61.k
    public final T3 f72107s1;

    /* renamed from: s2, reason: collision with root package name */
    @Y61.l
    public InteriorPhotosItem f72108s2;

    /* renamed from: s3, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsDomotekaReportTeaserItem f72109s3;

    /* renamed from: s4, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsPopularityInfoItem f72110s4;

    @Y61.l
    public AdvertDetailsSimilarsButtonItem s5;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.leasing_calculator.m f72111t;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27965g1 f72112t0;

    /* renamed from: t1, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.blocks.items_factories.J f72113t1;

    /* renamed from: t2, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsAnchorTrustFactorsItem f72114t2;

    /* renamed from: t3, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsDomotekaTeaserItem f72115t3;

    /* renamed from: t4, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsPortfolioBlockItem f72116t4;

    /* renamed from: t5, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsSimilarShiftsItem f72117t5;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final T6.a f72118u;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final Z3 f72119u0;

    /* renamed from: u1, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.blocks.items_factories.T1 f72120u1;

    /* renamed from: u2, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsAutoLoansItem f72121u2;

    /* renamed from: u3, reason: collision with root package name */
    @Y61.l
    public DynamicConsultationAfterIceBreakersItem f72122u3;

    /* renamed from: u4, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsPpRecallPromoItem f72123u4;

    /* renamed from: u5, reason: collision with root package name */
    @Y61.l
    public SparePartsCostItem f72124u5;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final D6.a f72125v;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27969g5 f72126v0;

    /* renamed from: v1, reason: collision with root package name */
    @Y61.k
    public final N3 f72127v1;

    /* renamed from: v2, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsAutoMediaItem f72128v2;

    /* renamed from: v3, reason: collision with root package name */
    @Y61.l
    public EarlyAccessAdvertItem f72129v3;

    /* renamed from: v4, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsComfortableDealPromoItem f72130v4;

    /* renamed from: v5, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsStickedSalesBannerItem f72131v5;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.account.E f72132w;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28079x4 f72133w0;

    /* renamed from: w1, reason: collision with root package name */
    @Y61.k
    public final G4 f72134w1;

    /* renamed from: w2, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsAutoMediaSelectPixelItem f72135w2;

    /* renamed from: w3, reason: collision with root package name */
    @Y61.l
    public EquipmentsItem f72136w3;

    /* renamed from: w4, reason: collision with root package name */
    @Y61.l
    public PriceComparisonItem f72137w4;

    /* renamed from: w5, reason: collision with root package name */
    @Y61.l
    public PersistableSpannedItem f72138w5;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.realty_quiz_banner.k f72139x;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28066v3 f72140x0;

    /* renamed from: x1, reason: collision with root package name */
    @Y61.k
    public final J4 f72141x1;

    /* renamed from: x2, reason: collision with root package name */
    @Y61.l
    public AutoPickerBannerItem f72142x2;

    /* renamed from: x3, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsEquipmentsTileItem f72143x3;

    /* renamed from: x4, reason: collision with root package name */
    @Y61.l
    public PersistableSpannedItem f72144x4;

    /* renamed from: x5, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsTitleItem f72145x5;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27982i4 f72146y;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28048s3 f72147y0;

    /* renamed from: y1, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27988j3 f72148y1;

    /* renamed from: y2, reason: collision with root package name */
    @Y61.l
    public AutoSelectBannerItem f72149y2;

    /* renamed from: y3, reason: collision with root package name */
    @Y61.l
    public List<AdvertDetailsFlatsItem> f72150y3;

    /* renamed from: y4, reason: collision with root package name */
    @Y61.l
    public PersistableSpannedItem f72151y4;

    /* renamed from: y5, reason: collision with root package name */
    @Y61.l
    public StyledTitleItem f72152y5;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27942d f72153z;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public final D4 f72154z0;

    /* renamed from: z1, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27990j5 f72155z1;

    /* renamed from: z2, reason: collision with root package name */
    @Y61.l
    public AutoSelectBookingItem f72156z2;

    /* renamed from: z3, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsFmpBannerItem f72157z3;

    /* renamed from: z4, reason: collision with root package name */
    @Y61.l
    public AdvertPriceListPreviewItem f72158z4;

    /* renamed from: z5, reason: collision with root package name */
    @Y61.l
    public AdvertVerificationItem f72159z5;

    /* renamed from: Z1, reason: collision with root package name */
    @Y61.k
    public ArrayList f71975Z1 = new ArrayList();

    /* renamed from: a2, reason: collision with root package name */
    @Y61.k
    public ArrayList f71982a2 = new ArrayList();

    /* renamed from: b2, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f71989b2 = new LinkedHashMap();

    /* renamed from: W4, reason: collision with root package name */
    @Y61.k
    public List<? extends TrustFactorsItem> f71957W4 = C42784z0.f406748b;

    /* renamed from: P5, reason: collision with root package name */
    public int f71909P5 = -1;

    /* renamed from: W5, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f71958W5 = C42727D.c(new c());

    /* renamed from: Y5, reason: collision with root package name */
    @Y61.k
    public final kotlinx.coroutines.flow.e2 f71972Y5 = kotlinx.coroutines.flow.f2.b(0, 1, null, 5);

    /* compiled from: AdvertDetailsItemsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/T$a;", "", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AdvertDetailsItemsPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f72160a;

        static {
            int[] iArr = new int[OfferType.values().length];
            try {
                iArr[OfferType.SMALL_CARD_OFFER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f72160a = iArr;
            int[] iArr2 = new int[RiseIcebreakersItemTestGroup.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                RiseIcebreakersItemTestGroup riseIcebreakersItemTestGroup = RiseIcebreakersItemTestGroup.f67917c;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                RiseIcebreakersItemTestGroup riseIcebreakersItemTestGroup2 = RiseIcebreakersItemTestGroup.f67917c;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                RiseIcebreakersItemTestGroup riseIcebreakersItemTestGroup3 = RiseIcebreakersItemTestGroup.f67917c;
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: AdvertDetailsItemsPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<Boolean> {
        public c() {
            super(0);
        }

        /* JADX WARN: Removed duplicated region for block: B:44:0x00c4  */
        @Override // Y41.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Boolean invoke() {
            /*
                r19 = this;
                r0 = r19
                com.avito.android.advert.item.T r1 = com.avito.android.advert.item.T.this
                com.avito.android.advert.item.icebreakers.IceBreakersItem r2 = r1.f71963X3
                r3 = 0
                if (r2 == 0) goto Lc5
                com.avito.android.remote.model.AdvertDetails r2 = r1.f71951V5
                r4 = 0
                if (r2 == 0) goto L13
                com.avito.android.remote.model.AdvertShortTermRent r2 = r2.getShortTermRent()
                goto L14
            L13:
                r2 = r4
            L14:
                if (r2 != 0) goto Lc5
                com.avito.android.remote.model.CategoryIds$AUTO$Companion r2 = com.avito.android.remote.model.CategoryIds.AUTO.INSTANCE
                com.avito.android.remote.model.AdvertDetails r5 = r1.f71951V5
                if (r5 == 0) goto L21
                java.lang.String r5 = r5.getCategoryId()
                goto L22
            L21:
                r5 = r4
            L22:
                boolean r2 = r2.isNotAutoWithoutSpareParts(r5)
                if (r2 == 0) goto Lc5
                com.avito.android.remote.model.AdvertDetails r2 = r1.f71951V5
                if (r2 == 0) goto L30
                java.lang.String r4 = r2.getCategoryId()
            L30:
                com.avito.android.remote.model.CategoryIds$JOB r2 = com.avito.android.remote.model.CategoryIds.JOB.f253588CV
                java.lang.String r2 = r2.getId()
                boolean r2 = kotlin.jvm.internal.L.f(r4, r2)
                if (r2 != 0) goto Lc5
                u3.l<com.avito.android.ab_tests.configs.RiseIcebreakersItemTestGroup> r2 = r1.f72086p1
                u3.m<T> r4 = r2.f439745a
                T r4 = r4.f439749b
                com.avito.android.ab_tests.configs.RiseIcebreakersItemTestGroup r4 = (com.avito.android.ab_tests.configs.RiseIcebreakersItemTestGroup) r4
                int r4 = r4.ordinal()
                r5 = 1
                com.avito.android.analytics.a r1 = r1.f71947V1
                if (r4 == 0) goto L88
                if (r4 == r5) goto L78
                r6 = 2
                if (r4 == r6) goto L66
                r6 = 3
                if (r4 == r6) goto L56
                goto L99
            L56:
                com.avito.android.analytics.statsd.y$a r4 = new com.avito.android.analytics.statsd.y$a
                r11 = 2
                r12 = 0
                java.lang.String r8 = "riseIcebreakersItems.none"
                r9 = 0
                r7 = r4
                r7.<init>(r8, r9, r11, r12)
                r1.c(r4)
                goto L99
            L66:
                com.avito.android.analytics.statsd.y$a r4 = new com.avito.android.analytics.statsd.y$a
                r17 = 2
                r18 = 0
                java.lang.String r14 = "riseIcebreakersItems.over_preferences"
                r15 = 0
                r13 = r4
                r13.<init>(r14, r15, r17, r18)
                r1.c(r4)
                goto L99
            L78:
                com.avito.android.analytics.statsd.y$a r4 = new com.avito.android.analytics.statsd.y$a
                r10 = 2
                r11 = 0
                java.lang.String r7 = "riseIcebreakersItems.under_preferences"
                r8 = 0
                r6 = r4
                r6.<init>(r7, r8, r10, r11)
                r1.c(r4)
                goto L99
            L88:
                com.avito.android.analytics.statsd.y$a r4 = new com.avito.android.analytics.statsd.y$a
                r16 = 2
                r17 = 0
                java.lang.String r13 = "riseIcebreakersItems.control"
                r14 = 0
                r12 = r4
                r12.<init>(r13, r14, r16, r17)
                r1.c(r4)
            L99:
                u3.m<T> r1 = r2.f439745a
                T r4 = r1.f439749b
                com.avito.android.ab_tests.configs.RiseIcebreakersItemTestGroup r4 = (com.avito.android.ab_tests.configs.RiseIcebreakersItemTestGroup) r4
                com.avito.android.ab_tests.configs.RiseIcebreakersItemTestGroup r6 = com.avito.android.ab_tests.configs.RiseIcebreakersItemTestGroup.f67917c
                if (r4 != r6) goto La7
                r4.getClass()
                goto Lb2
            La7:
                r4.getClass()
                com.avito.android.ab_tests.configs.RiseIcebreakersItemTestGroup r6 = com.avito.android.ab_tests.configs.RiseIcebreakersItemTestGroup.f67918d
                if (r4 == r6) goto Lb2
                com.avito.android.ab_tests.configs.RiseIcebreakersItemTestGroup r6 = com.avito.android.ab_tests.configs.RiseIcebreakersItemTestGroup.f67919e
                if (r4 != r6) goto Lb5
            Lb2:
                r2.b()
            Lb5:
                T r1 = r1.f439749b
                com.avito.android.ab_tests.configs.RiseIcebreakersItemTestGroup r1 = (com.avito.android.ab_tests.configs.RiseIcebreakersItemTestGroup) r1
                r1.getClass()
                com.avito.android.ab_tests.configs.RiseIcebreakersItemTestGroup r2 = com.avito.android.ab_tests.configs.RiseIcebreakersItemTestGroup.f67918d
                if (r1 == r2) goto Lc4
                com.avito.android.ab_tests.configs.RiseIcebreakersItemTestGroup r2 = com.avito.android.ab_tests.configs.RiseIcebreakersItemTestGroup.f67919e
                if (r1 != r2) goto Lc5
            Lc4:
                r3 = r5
            Lc5:
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.T.c.invoke():java.lang.Object");
        }
    }

    /* compiled from: AdvertDetailsItemsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/serp/adapter/PersistableSpannedItem;", "invoke", "(Lcom/avito/android/serp/adapter/PersistableSpannedItem;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends kotlin.jvm.internal.N implements Y41.l<PersistableSpannedItem, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f72162l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(1);
            this.f72162l = str;
        }

        @Override // Y41.l
        public final Boolean invoke(PersistableSpannedItem persistableSpannedItem) {
            PersistableSpannedItem persistableSpannedItem2 = persistableSpannedItem;
            return Boolean.valueOf((persistableSpannedItem2 instanceof TrustFactorsItem) && kotlin.jvm.internal.L.f(persistableSpannedItem2.getF273226b(), this.f72162l));
        }
    }

    /* compiled from: AdvertDetailsItemsPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/serp/adapter/PersistableSpannedItem;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends kotlin.jvm.internal.N implements Y41.a<PersistableSpannedItem> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ AdvertDetails f72164m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(AdvertDetails advertDetails) {
            super(0);
            this.f72164m = advertDetails;
        }

        @Override // Y41.a
        public final PersistableSpannedItem invoke() {
            return T.this.f72140x0.a(this.f72164m);
        }
    }

    /* compiled from: AdvertDetailsItemsPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/serp/adapter/PersistableSpannedItem;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class f extends kotlin.jvm.internal.N implements Y41.a<PersistableSpannedItem> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ AdvertDetails f72166m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(AdvertDetails advertDetails) {
            super(0);
            this.f72166m = advertDetails;
        }

        @Override // Y41.a
        public final PersistableSpannedItem invoke() {
            return T.this.f72147y0.a(this.f72166m);
        }
    }

    /* compiled from: AdvertDetailsItemsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/serp/adapter/PersistableSpannedItem;", "invoke", "(Lcom/avito/android/serp/adapter/PersistableSpannedItem;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class g extends kotlin.jvm.internal.N implements Y41.l<PersistableSpannedItem, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final g f72167l = new g();

        public g() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(PersistableSpannedItem persistableSpannedItem) {
            return Boolean.valueOf(persistableSpannedItem instanceof TrustFactorsItem);
        }
    }

    static {
        new a(null);
    }

    @Inject
    public T(@C27710t.InterfaceC2166t @Y61.l String str, @Y61.k @InterfaceC30174s String str2, @Y61.k com.avito.android.advert.navbar.b bVar, @Y61.k com.avito.android.advert.item.similars.j jVar, @Y61.k InterfaceC28240u interfaceC28240u, @Y61.k com.avito.android.J0 j02, @Y61.k com.avito.android.advert_core.analytics.a aVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2, @Y61.k C29640d c29640d, @Y61.k com.avito.android.Z0 z02, @Y61.k B2 b22, @Y61.k C43617a c43617a, @Y61.k com.avito.android.advert.item.sellersubscription.p pVar, @Y61.k com.avito.android.credits.q qVar, @C27710t.q boolean z12, @Y61.k AdvertDetailsFastOpenParams advertDetailsFastOpenParams, @Y61.l AdvertDetailsMultiItemState advertDetailsMultiItemState, @Y61.k com.avito.android.advert.item.multi_item.b bVar2, @Y61.k com.avito.android.serp.adapter.recomendations.j jVar2, @Y61.k com.avito.android.leasing_calculator.m mVar, @Y61.k T6.a aVar3, @Y61.k D6.a aVar4, @Y61.k com.avito.android.account.E e12, @Y61.k com.avito.android.advert.item.realty_quiz_banner.k kVar, @Y61.k InterfaceC27982i4 interfaceC27982i4, @Y61.k InterfaceC27942d interfaceC27942d, @Y61.k B3 b32, @Y61.k W3 w32, @Y61.k N2 n22, @Y61.k InterfaceC27978i0 interfaceC27978i0, @Y61.k W2 w22, @Y61.k InterfaceC28024o4 interfaceC28024o4, @Y61.k InterfaceC28043r4 interfaceC28043r4, @Y61.k InterfaceC28075x0 interfaceC28075x0, @Y61.k C27934b5 c27934b5, @Y61.k InterfaceC28044s interfaceC28044s, @Y61.k com.avito.android.advert.item.blocks.items_factories.Q1 q12, @Y61.k com.avito.android.advert.item.blocks.items_factories.N1 n12, @Y61.k InterfaceC28026p interfaceC28026p, @Y61.k P4 p42, @Y61.k InterfaceC28022o2 interfaceC28022o2, @Y61.k InterfaceC27961f4 interfaceC27961f4, @Y61.k InterfaceC27940c4 interfaceC27940c4, @Y61.k InterfaceC28003l4 interfaceC28003l4, @Y61.k com.avito.android.advert.item.blocks.items_factories.D d12, @Y61.k com.avito.android.advert.item.blocks.items_factories.G g12, @Y61.k com.avito.android.advert.item.blocks.items_factories.M m12, @Y61.k Q3 q32, @Y61.k InterfaceC27944d1 interfaceC27944d1, @Y61.k com.avito.android.advert.item.blocks.items_factories.P p12, @Y61.k InterfaceC28061u4 interfaceC28061u4, @Y61.k com.avito.android.advert.item.blocks.items_factories.K1 k12, @Y61.k com.avito.android.advert.item.blocks.items_factories.C0 c02, @Y61.k com.avito.android.advert.item.blocks.items_factories.Z z13, @Y61.k com.avito.android.advert.item.blocks.items_factories.F0 f02, @Y61.k D2 d22, @Y61.k InterfaceC28030p3 interfaceC28030p3, @Y61.k K5 k52, @Y61.k InterfaceC27967g3 interfaceC27967g3, @Y61.k com.avito.android.advert.item.blocks.items_factories.A a12, @Y61.k com.avito.android.advert.item.blocks.items_factories.J0 j03, @Y61.k InterfaceC27921a interfaceC27921a, @Y61.k InterfaceC28011m5 interfaceC28011m5, @Y61.k E5 e52, @Y61.k H5 h52, @Y61.k B5 b52, @Y61.k y5 y5Var, @Y61.k com.avito.android.advert.item.blocks.items_factories.W w12, @Y61.k Y4 y42, @Y61.k com.avito.android.advert.item.blocks.items_factories.P0 p02, @Y61.k C28070w1 c28070w1, @Y61.k InterfaceC27965g1 interfaceC27965g1, @Y61.k Z3 z32, @Y61.k InterfaceC27969g5 interfaceC27969g5, @Y61.k InterfaceC28079x4 interfaceC28079x4, @Y61.k InterfaceC28066v3 interfaceC28066v3, @Y61.k InterfaceC28048s3 interfaceC28048s3, @Y61.k D4 d42, @Y61.k A4 a42, @Y61.k InterfaceC28041r2 interfaceC28041r2, @Y61.k InterfaceC28059u2 interfaceC28059u2, @Y61.k InterfaceC27957f0 interfaceC27957f0, @Y61.k T2 t22, @Y61.k InterfaceC27923a1 interfaceC27923a1, @Y61.k InterfaceC27936c0 interfaceC27936c0, @Y61.k InterfaceC28009m3 interfaceC28009m3, @Y61.k InterfaceC28039r0 interfaceC28039r0, @Y61.k E4.d dVar, @Y61.k E4.a aVar5, @Y61.k E4.l lVar, @Y61.k F4.a aVar6, @Y61.k com.avito.android.advert_core.short_term_rent.a aVar7, @Y61.k E4.i iVar, @Y61.k InterfaceC28032p5 interfaceC28032p5, @Y61.k s5 s5Var, @Y61.k v5 v5Var, @Y61.k InterfaceC27984j interfaceC27984j, @Y61.k InterfaceC28005m interfaceC28005m, @Y61.k InterfaceC27963g interfaceC27963g, @Y61.k com.avito.android.advert.item.blocks.items_factories.R0 r02, @Y61.k com.avito.android.advert.item.blocks.items_factories.U0 u02, @Y61.k com.avito.android.advert.item.blocks.items_factories.X0 x02, @Y61.k InterfaceC28057u0 interfaceC28057u0, @Y61.k com.avito.android.advert.item.blocks.items_factories.A2 a22, @Y61.k E3 e32, @Y61.k com.avito.android.advert.item.similars.a aVar8, @Y61.k com.avito.android.advert.item.commercials.f fVar, @Y61.k com.avito.android.advert.item.auto_media.h hVar, @oD.k @Y61.k u3.l<AutoMediaMotoWaterTestGroup> lVar2, @Y61.k InterfaceC27986j1 interfaceC27986j1, @Y61.k AdvertDetailsHotelDescriptionItemFactory advertDetailsHotelDescriptionItemFactory, @Y61.k InterfaceC28068w interfaceC28068w, @Y61.k com.avito.android.advert.item.reusable_amenities.c cVar, @Y61.k com.avito.android.advert.item.interiorPhotos.c cVar2, @Y61.k InterfaceC27952e2 interfaceC27952e2, @Y61.k InterfaceC27973h2 interfaceC27973h2, @Y61.k InterfaceC27994k2 interfaceC27994k2, @Y61.k G5.a aVar9, @oD.l @Y61.k u3.l<SimpleTestGroupWithNone> lVar3, @Y61.k u3.l<RiseIcebreakersItemTestGroup> lVar4, @Y61.k h2 h2Var, @Y61.k com.avito.android.advert.item.safedeal.trust_factors.f fVar2, @Y61.k T3 t32, @Y61.k com.avito.android.advert.item.blocks.items_factories.J j12, @Y61.k com.avito.android.advert.item.blocks.items_factories.T1 t12, @Y61.k N3 n32, @Y61.k G4 g42, @Y61.k J4 j42, @Y61.k InterfaceC27988j3 interfaceC27988j3, @Y61.k InterfaceC27990j5 interfaceC27990j5, @Y61.k InterfaceC28046s1 interfaceC28046s1, @Y61.k com.avito.android.advert.item.blocks.items_factories.C1 c12, @Y61.k InterfaceC28082y1 interfaceC28082y1, @Y61.k com.avito.android.advert.item.blocks.items_factories.G1 g13, @Y61.k InterfaceC27948d5 interfaceC27948d5, @Y61.k InterfaceC28084y3 interfaceC28084y3, @Y61.k InterfaceC27939c3 interfaceC27939c3, @Y61.k InterfaceC28007m1 interfaceC28007m1, @Y61.k G2 g22, @Y61.k K2 k22, @Y61.k com.avito.android.advert.item.blocks.items_factories.W1 w13, @Y61.k L4.a aVar10, @Y61.k P4.a aVar11, @Y61.k InterfaceC28020o0 interfaceC28020o0, @Y61.k M4 m42, @Y61.k com.avito.android.advert.item.blocks.items_factories.M0 m02, @Y61.k H3 h32, @Y61.k K3 k32, @Y61.k E4.g gVar, @Y61.k F4.e eVar, @Y61.k InterfaceC28028p1 interfaceC28028p1, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.util.O0 o02, @Y61.k com.avito.android.util.bottom_gap.d dVar2, @Y61.k com.avito.android.util.R0 r03) {
        AdvertDetailsMultiItemState.ParamsState paramsState;
        AdvertDetailsMultiItemState.ParamsItemState paramsItemState;
        this.f71979a = str;
        this.f71986b = str2;
        this.f71993c = bVar;
        this.f72000d = jVar;
        this.f72007e = interfaceC28240u;
        this.f72014f = j02;
        this.f72021g = aVar;
        this.f72028h = aVar2;
        this.f72035i = c29640d;
        this.f72042j = z02;
        this.f72049k = b22;
        this.f72056l = c43617a;
        this.f72063m = pVar;
        this.f72070n = qVar;
        this.f72077o = z12;
        this.f72084p = advertDetailsFastOpenParams;
        this.f72091q = advertDetailsMultiItemState;
        this.f72098r = bVar2;
        this.f72105s = jVar2;
        this.f72111t = mVar;
        this.f72118u = aVar3;
        this.f72125v = aVar4;
        this.f72132w = e12;
        this.f72139x = kVar;
        this.f72146y = interfaceC27982i4;
        this.f72153z = interfaceC27942d;
        this.f71798A = b32;
        this.f71805B = w32;
        this.f71812C = n22;
        this.f71819D = interfaceC27978i0;
        this.f71826E = w22;
        this.f71833F = interfaceC28024o4;
        this.f71840G = interfaceC28043r4;
        this.f71847H = interfaceC28075x0;
        this.f71854I = c27934b5;
        this.f71861J = interfaceC28044s;
        this.f71868K = q12;
        this.f71875L = n12;
        this.f71882M = interfaceC28026p;
        this.f71889N = p42;
        this.f71896O = interfaceC28022o2;
        this.f71903P = interfaceC27961f4;
        this.f71910Q = interfaceC27940c4;
        this.f71917R = interfaceC28003l4;
        this.f71924S = d12;
        this.f71931T = g12;
        this.f71938U = m12;
        this.f71945V = q32;
        this.f71952W = interfaceC27944d1;
        this.f71959X = p12;
        this.f71966Y = interfaceC28061u4;
        this.f71973Z = k12;
        this.f71980a0 = c02;
        this.f71987b0 = z13;
        this.f71994c0 = f02;
        this.f72001d0 = d22;
        this.f72008e0 = interfaceC28030p3;
        this.f72015f0 = k52;
        this.f72022g0 = interfaceC27967g3;
        this.f72029h0 = a12;
        this.f72036i0 = j03;
        this.f72043j0 = interfaceC27921a;
        this.f72050k0 = interfaceC28011m5;
        this.f72057l0 = e52;
        this.f72064m0 = h52;
        this.f72071n0 = b52;
        this.f72078o0 = y5Var;
        this.f72085p0 = w12;
        this.f72092q0 = y42;
        this.f72099r0 = p02;
        this.f72106s0 = c28070w1;
        this.f72112t0 = interfaceC27965g1;
        this.f72119u0 = z32;
        this.f72126v0 = interfaceC27969g5;
        this.f72133w0 = interfaceC28079x4;
        this.f72140x0 = interfaceC28066v3;
        this.f72147y0 = interfaceC28048s3;
        this.f72154z0 = d42;
        this.f71799A0 = a42;
        this.f71806B0 = interfaceC28041r2;
        this.f71813C0 = interfaceC28059u2;
        this.f71820D0 = interfaceC27957f0;
        this.f71827E0 = t22;
        this.f71834F0 = interfaceC27923a1;
        this.f71841G0 = interfaceC27936c0;
        this.f71848H0 = interfaceC28009m3;
        this.f71855I0 = interfaceC28039r0;
        this.f71862J0 = dVar;
        this.f71869K0 = aVar5;
        this.f71876L0 = lVar;
        this.f71883M0 = aVar6;
        this.f71890N0 = aVar7;
        this.f71897O0 = iVar;
        this.f71904P0 = interfaceC28032p5;
        this.f71911Q0 = s5Var;
        this.f71918R0 = v5Var;
        this.f71925S0 = interfaceC27984j;
        this.f71932T0 = interfaceC28005m;
        this.f71939U0 = interfaceC27963g;
        this.f71946V0 = r02;
        this.f71953W0 = u02;
        this.f71960X0 = x02;
        this.f71967Y0 = interfaceC28057u0;
        this.f71974Z0 = a22;
        this.f71981a1 = e32;
        this.f71988b1 = aVar8;
        this.f71995c1 = fVar;
        this.f72002d1 = hVar;
        this.f72009e1 = lVar2;
        this.f72016f1 = interfaceC27986j1;
        this.f72023g1 = advertDetailsHotelDescriptionItemFactory;
        this.f72030h1 = interfaceC28068w;
        this.f72037i1 = cVar;
        this.f72044j1 = cVar2;
        this.f72051k1 = interfaceC27952e2;
        this.f72058l1 = interfaceC27973h2;
        this.f72065m1 = interfaceC27994k2;
        this.f72072n1 = aVar9;
        this.f72079o1 = lVar3;
        this.f72086p1 = lVar4;
        this.f72093q1 = h2Var;
        this.f72100r1 = fVar2;
        this.f72107s1 = t32;
        this.f72113t1 = j12;
        this.f72120u1 = t12;
        this.f72127v1 = n32;
        this.f72134w1 = g42;
        this.f72141x1 = j42;
        this.f72148y1 = interfaceC27988j3;
        this.f72155z1 = interfaceC27990j5;
        this.f71800A1 = interfaceC28046s1;
        this.f71807B1 = c12;
        this.f71814C1 = interfaceC28082y1;
        this.f71821D1 = g13;
        this.f71828E1 = interfaceC27948d5;
        this.f71835F1 = interfaceC28084y3;
        this.f71842G1 = interfaceC27939c3;
        this.f71849H1 = interfaceC28007m1;
        this.f71856I1 = g22;
        this.f71863J1 = k22;
        this.f71870K1 = w13;
        this.f71877L1 = aVar10;
        this.f71884M1 = aVar11;
        this.f71891N1 = interfaceC28020o0;
        this.f71898O1 = m42;
        this.f71905P1 = m02;
        this.f71912Q1 = h32;
        this.f71919R1 = k32;
        this.f71926S1 = gVar;
        this.f71933T1 = eVar;
        this.f71940U1 = interfaceC28028p1;
        this.f71947V1 = interfaceC28373a;
        this.f71954W1 = o02;
        this.f71961X1 = dVar2;
        this.f71965X5 = kotlinx.coroutines.U.a(CoroutineContext.Element.DefaultImpls.plus((kotlinx.coroutines.V0) kotlinx.coroutines.t1.b(), r03.d()));
        if (advertDetailsMultiItemState == null || (paramsState = advertDetailsMultiItemState.f85869c) == null || (paramsItemState = paramsState.f85875c) == null) {
            return;
        }
        bVar2.f77727a = paramsItemState;
    }

    public static AutoNewCarsLeadFormItem M(AutoNewCarsLeadForm autoNewCarsLeadForm, long j12, Long l12, Long l13) {
        return new AutoNewCarsLeadFormItem(0L, null, 0, autoNewCarsLeadForm, j12, l12, l13, 7, null);
    }

    public static AdvertDetailsAutotekaSelectTeaserItem V(T t12) {
        t12.getClass();
        return new AdvertDetailsAutotekaSelectTeaserItem(t12.f72000d.a(), null, null, t12.f71979a, 2, null);
    }

    public static boolean l1(AdvertDetails advertDetails) {
        return kotlin.jvm.internal.L.f(advertDetails.getShouldShowDomotekaTeaser(), Boolean.TRUE);
    }

    public static /* synthetic */ AdvertDetailsFlatsItem o0(T t12, List list, boolean z12, AttributedText attributedText, ExpandItemsButton expandItemsButton, boolean z13) {
        return t12.n0(list, z12, attributedText, expandItemsButton, AdvertDetailsFlatViewType.f82420b, z13);
    }

    @Override // com.avito.android.advert.item.S
    public final void A() {
        Object next;
        Iterator it = this.f71975Z1.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((PersistableSpannedItem) next) instanceof ServiceBookingItem) {
                    break;
                }
            }
        }
        ServiceBookingItem serviceBookingItem = (ServiceBookingItem) (next instanceof ServiceBookingItem ? next : null);
        if (serviceBookingItem == null) {
            return;
        }
        ServiceBookingItem serviceBookingItemB = ServiceBookingItem.b(serviceBookingItem, 0, 1015);
        this.f72013e5 = serviceBookingItemB;
        e(serviceBookingItemB);
    }

    public final InteriorPhotosItem A0(AdvertDetails advertDetails) {
        List<Image> images;
        SellerDetails sellerDetails = advertDetails.getSellerDetails();
        if (sellerDetails == null) {
            return null;
        }
        Map<String, Object> mapD = sellerDetails.getAmenities() == null ? sellerDetails.d() : null;
        InteriorPhotosBlock interiorPhotosBlock = sellerDetails.getInteriorPhotosBlock();
        if (interiorPhotosBlock == null || (images = interiorPhotosBlock.getImages()) == null) {
            return null;
        }
        AttributedText title = sellerDetails.getTitle();
        AmenitiesAndInteriorPhotoAnalyticsTrackerImpl.FromBlock[] fromBlockArr = AmenitiesAndInteriorPhotoAnalyticsTrackerImpl.FromBlock.f81146b;
        return this.f72044j1.a(title, images, mapD);
    }

    @Override // com.avito.android.advert.item.S
    public final void B(@Y61.k String str) {
        AdvertDetails advertDetails = this.f71951V5;
        if (advertDetails != null) {
            AdvertDetailsSimilarShiftsItem advertDetailsSimilarShiftsItemA = this.f71870K1.a(advertDetails, this.f72117t5, (52 & 4) != 0 ? null : null, (52 & 8) != 0 ? null : str, false, false);
            this.f72117t5 = advertDetailsSimilarShiftsItemA;
            PersistableSpannedItem persistableSpannedItemC = this.f71870K1.c(advertDetailsSimilarShiftsItemA);
            if (persistableSpannedItemC == null) {
                persistableSpannedItemC = this.f72151y4;
            }
            this.f72151y4 = persistableSpannedItemC;
            this.f71997c3 = c0(advertDetails);
            D();
            i(0);
        }
    }

    public final List<PersistableSpannedItem> B0(AdvertDetails advertDetails) {
        List<ItemReviewsEntry> entries;
        ItemReviews itemReviews = advertDetails.getItemReviews();
        ItemReviewsMain main = itemReviews != null ? itemReviews.getMain() : null;
        if (main == null || (entries = main.getEntries()) == null) {
            return null;
        }
        this.f71867J5 = main.getOnFirstReviewShownAction();
        return this.f72125v.a(entries, advertDetails.isRestyle() || advertDetails.isRealtyRedesign(), this.f71888M5, advertDetails.isServicesRedesign());
    }

    @Override // com.avito.android.advert.item.S
    public final void C() {
        Object next;
        Iterator it = this.f71975Z1.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((PersistableSpannedItem) next) instanceof AdvertDetailsPpRecallPromoItem) {
                    break;
                }
            }
        }
        AdvertDetailsPpRecallPromoItem advertDetailsPpRecallPromoItem = (AdvertDetailsPpRecallPromoItem) (next instanceof AdvertDetailsPpRecallPromoItem ? next : null);
        if (advertDetailsPpRecallPromoItem == null) {
            return;
        }
        this.f71975Z1.set(this.f71975Z1.indexOf(advertDetailsPpRecallPromoItem), AdvertDetailsPpRecallPromoItem.a(advertDetailsPpRecallPromoItem, 0, 0L, null, false, false, 114687));
        i(this.f71909P5);
    }

    public final AdvertDetailsLeasingBeduinItem C0(AdvertDetails advertDetails) {
        List<BeduinModel> list;
        List<BeduinModel> leasingCalculatorComponents = advertDetails.getLeasingCalculatorComponents();
        C29640d c29640d = this.f72035i;
        c29640d.getClass();
        kotlin.reflect.n<Object> nVar = C29640d.f132175X[26];
        if (!((Boolean) c29640d.f132223z.a().invoke()).booleanValue() || (list = leasingCalculatorComponents) == null || list.isEmpty()) {
            return null;
        }
        return new AdvertDetailsLeasingBeduinItem(0L, null, null, null, this.f72000d.a(), leasingCalculatorComponents, 15, null);
    }

    public final int D() {
        this.f71975Z1.clear();
        AdvertDetails advertDetails = this.f71951V5;
        if (advertDetails == null || advertDetails.getRenderByBeduin()) {
            return 0;
        }
        c.a aVar = com.avito.android.advert.item.items_list_builder.c.f76821a;
        AdvertDetails advertDetails2 = this.f71951V5;
        String str = this.f71881L5;
        String str2 = this.f71902O5;
        DevelopmentOffersPosition developmentOffersPosition = this.f71930S5;
        LinkedHashMap linkedHashMap = this.f71989b2;
        boolean zBooleanValue = ((Boolean) this.f71958W5.getValue()).booleanValue();
        List<? extends PersistableSpannedItem> list = this.f71860I5;
        OffersPosition offersPosition = this.f71937T5;
        ServicesReviewVolunteers.Position position = this.f71944U5;
        I1 i12 = this.f71968Y1;
        kotlin.ranges.l lVar = this.f71874K5;
        AdvertDetailsAbuseItem advertDetailsAbuseItem = this.f71996c2;
        AdditionalSellerButtonItem additionalSellerButtonItem = this.f72003d2;
        AdditionalSellerFeaturesItem additionalSellerFeaturesItem = this.f72010e2;
        AdvertDetailsFlatsItem advertDetailsFlatsItem = this.f72017f2;
        AdvertDetailsReviewsScoreItem advertDetailsReviewsScoreItem = this.f72024g2;
        AdditionalSellerTitleItem additionalSellerTitleItem = this.f72031h2;
        AdvertDetailsSxAddressesHeaderItem advertDetailsSxAddressesHeaderItem = this.f72038i2;
        AddressCentrityBlockItem addressCentrityBlockItem = this.f72045j2;
        AdvertDetailsAddressGeoDistanceItem advertDetailsAddressGeoDistanceItem = this.f72052k2;
        AddressHint addressHint = this.f72059l2;
        AdvertDetailsAddressItem advertDetailsAddressItem = this.f72066m2;
        AdvertDetailsAdvertNumberItem advertDetailsAdvertNumberItem = this.f72073n2;
        AdvertServiceAppFillingButtonItem advertServiceAppFillingButtonItem = this.f72080o2;
        AdvertServiceAppFillingInfoItem advertServiceAppFillingInfoItem = this.f72087p2;
        AdvertDetailsAmenitiesItem advertDetailsAmenitiesItem = this.f72094q2;
        AmenitiesItem amenitiesItem = this.f72101r2;
        InteriorPhotosItem interiorPhotosItem = this.f72108s2;
        AdvertDetailsAnchorTrustFactorsItem advertDetailsAnchorTrustFactorsItem = this.f72114t2;
        AdvertDetailsAutoLoansItem advertDetailsAutoLoansItem = this.f72121u2;
        AutoPickerBannerItem autoPickerBannerItem = this.f72142x2;
        AutoSelectBannerItem autoSelectBannerItem = this.f72149y2;
        AutoSelectBookingItem autoSelectBookingItem = this.f72156z2;
        AutoSelectControlsItem autoSelectControlsItem = this.f71801A2;
        AdvertDetailsAutoSelectItem advertDetailsAutoSelectItem = this.f71808B2;
        AutoSelectManagerInfoItem autoSelectManagerInfoItem = this.f71815C2;
        AutoSelectNoClickContactItem autoSelectNoClickContactItem = this.f71822D2;
        AutoSelectParametersV2Item autoSelectParametersV2Item = this.f71829E2;
        AutoSelectParametersV3Item autoSelectParametersV3Item = this.f71836F2;
        AutoSelectTeaserItem autoSelectTeaserItem = this.f71843G2;
        AdvertDetailsAutotekaTeaserItem advertDetailsAutotekaTeaserItem = this.f71850H2;
        AdvertDetailsAutotekaTeaserV2Item advertDetailsAutotekaTeaserV2Item = this.f71857I2;
        AdvertDetailsAutotekaTeaserV3Item advertDetailsAutotekaTeaserV3Item = this.f71864J2;
        AdvertDetailsAutotekaSelectTeaserItem advertDetailsAutotekaSelectTeaserItem = this.f71871K2;
        PersistableSpannedItem persistableSpannedItem = this.f71878L2;
        AdvertDetailsB2CBottomItem advertDetailsB2CBottomItem = this.f71885M2;
        AdvertBadgeBarItem advertBadgeBarItem = this.f71892N2;
        AdvertDetailsBadgeBarLightItem advertDetailsBadgeBarLightItem = this.f71899O2;
        PersistableSpannedItem persistableSpannedItem2 = this.f71838F4;
        BrandingAdvantagesBlockItem brandingAdvantagesBlockItem = this.f71906P2;
        BrandingGalleryBlockItem brandingGalleryBlockItem = this.f71913Q2;
        BuzzoolaCreditBannerItem buzzoolaCreditBannerItem = this.f71920R2;
        AdvertDetailsCampaignsItem advertDetailsCampaignsItem = this.f71927S2;
        AdvertDetailsCarBodyConditionItem advertDetailsCarBodyConditionItem = this.f71934T2;
        ChatHistoryItem chatHistoryItem = this.f71941U2;
        AdvertDetailsFlatsItem advertDetailsFlatsItem2 = this.f71948V2;
        AdvertDetailsClosingReasonItem advertDetailsClosingReasonItem = this.f71955W2;
        AdvertDetailsCompositeBrokerV1Item advertDetailsCompositeBrokerV1Item = this.f71962X2;
        AdvertDetailsCompositeBrokerV2Item advertDetailsCompositeBrokerV2Item = this.f71969Y2;
        ConsultationAfterIceBreakersItem consultationAfterIceBreakersItem = this.f71976Z2;
        ConsultationButtonItem consultationButtonItem = this.f71983a3;
        AdvertDetailsConsultationItem advertDetailsConsultationItem = this.f71990b3;
        AdvertDetailsContactBarItem advertDetailsContactBarItem = this.f71997c3;
        InstallmentsBlockItem installmentsBlockItem = this.f72018f3;
        CreditCalculatorItem creditCalculatorItem = this.f72004d3;
        CreditBrokerLinkItem creditBrokerLinkItem = this.f72011e3;
        AdvertCvPhoneActualizationItem advertCvPhoneActualizationItem = this.f72025g3;
        AdvertCvStateItem advertCvStateItem = this.f72032h3;
        AdvertCvInfoItem advertCvInfoItem = this.f71971Y4;
        CvMotivationBannerItem cvMotivationBannerItem = this.f71978Z4;
        AdvertDetailsDeliverySuggestsItem advertDetailsDeliverySuggestsItem = this.f72039i3;
        DeliveryTrustFactorsItem deliveryTrustFactorsItem = this.f72046j3;
        AdvertDetailsDescriptionItem advertDetailsDescriptionItem = this.f72053k3;
        DeveloperButtonItem developerButtonItem = this.f72060l3;
        AdvertDetailsFlatsItem advertDetailsFlatsItem3 = this.f72067m3;
        DeveloperTrustItem developerTrustItem = this.f72074n3;
        DevelopmentOffersItem developmentOffersItem = this.f72081o3;
        AdvertDetailsDisclaimerItem advertDetailsDisclaimerItem = this.f72088p3;
        DisclaimerPDItem disclaimerPDItem = this.f72095q3;
        AdvertDetailsDockingBadgeBarItem advertDetailsDockingBadgeBarItem = this.f72102r3;
        AdvertDetailsDomotekaReportTeaserItem advertDetailsDomotekaReportTeaserItem = this.f72109s3;
        AdvertDetailsDomotekaTeaserItem advertDetailsDomotekaTeaserItem = this.f72115t3;
        DynamicConsultationAfterIceBreakersItem dynamicConsultationAfterIceBreakersItem = this.f72122u3;
        EarlyAccessAdvertItem earlyAccessAdvertItem = this.f72129v3;
        EquipmentsItem equipmentsItem = this.f72136w3;
        AdvertDetailsEquipmentsTileItem advertDetailsEquipmentsTileItem = this.f72143x3;
        List<AdvertDetailsFlatsItem> list2 = this.f72150y3;
        AdvertDetailsFmpBannerItem advertDetailsFmpBannerItem = this.f72157z3;
        AdvertDetailsFmpCalculatorItem advertDetailsFmpCalculatorItem = this.f71802A3;
        AdvertDetailsFmpOfferItem advertDetailsFmpOfferItem = this.f71809B3;
        AdvertDetailsFmpProductsItem advertDetailsFmpProductsItem = this.f71816C3;
        CarouselPhotoGalleryItem carouselPhotoGalleryItem = this.f71823D3;
        AdvertDetailsGalleryItem advertDetailsGalleryItem = this.f71830E3;
        GarageCompatibilityV2Item garageCompatibilityV2Item = this.f71837F3;
        GarageCompatibilityV3Item garageCompatibilityV3Item = this.f71844G3;
        GarageCompatibilityV4Item garageCompatibilityV4Item = this.f71851H3;
        AdvertDetailsGeoMarketReportItem advertDetailsGeoMarketReportItem = this.f71858I3;
        List<AdvertDetailsGeoReferenceItem> list3 = this.f71865J3;
        AdvertDetailsGeoZonesItem advertDetailsGeoZonesItem = this.f71872K3;
        AdvertDetailsDutiesItem advertDetailsDutiesItem = this.f71879L3;
        AdvertMapItem advertMapItem = this.f71886M3;
        GigPersonalInfoItem gigPersonalInfoItem = this.f71893N3;
        AdvertDetailsGigSellerItem advertDetailsGigSellerItem = this.f71900O3;
        AdvertDetailsGroupsItem advertDetailsGroupsItem = this.f71907P3;
        AdvertDetailsReviewsScoreItem advertDetailsReviewsScoreItem2 = this.f71914Q3;
        AdvertHotelDescriptionItem advertHotelDescriptionItem = this.f71921R3;
        AdvertHotelDescriptionItem advertHotelDescriptionItem2 = this.f71928S3;
        StyledTitleItem styledTitleItem = this.f71935T3;
        AdvertDetailsHotelOfferItem advertDetailsHotelOfferItem = this.f71942U3;
        AdvertHotelPromoWidgetItem advertHotelPromoWidgetItem = this.f71949V3;
        AdvertHotelReviewItem advertHotelReviewItem = this.f71956W3;
        IceBreakersItem iceBreakersItem = this.f71963X3;
        IcebreakersRedesignItem icebreakersRedesignItem = this.f71970Y3;
        ImvCarsV4Item imvCarsV4Item = this.f71977Z3;
        AdvertJobSearchStatusItem advertJobSearchStatusItem = this.f71984a4;
        SeekerResponsesInfoItemV2 seekerResponsesInfoItemV2 = this.f71991b4;
        AdvertDetailsLeasingBeduinItem advertDetailsLeasingBeduinItem = this.f71998c4;
        AdvertDetailsLeasingCalculatorItem advertDetailsLeasingCalculatorItem = this.f72005d4;
        AdvertDetailsLeasingLinkItem advertDetailsLeasingLinkItem = this.f72012e4;
        MarketplaceSalesBannerItem marketplaceSalesBannerItem = this.f72026g4;
        MarketplaceSalesAdvertPromoBannerItem marketplaceSalesAdvertPromoBannerItem = this.f72019f4;
        MarketplaceSalesBannerOutOfBoundsItem marketplaceSalesBannerOutOfBoundsItem = this.f72040i4;
        MarketplaceStocksItem marketplaceStocksItem = this.f72054k4;
        PersistableSpannedItem persistableSpannedItem3 = this.f71894N4;
        MortgageCalculatorItem mortgageCalculatorItem = this.f72061l4;
        MortgageSnippetItem mortgageSnippetItem = this.f72068m4;
        AdvertDetailsMultiItemItem advertDetailsMultiItemItem = this.f72075n4;
        AdvertDetailsNoteItem advertDetailsNoteItem = this.f72082o4;
        OffersItem offersItem = this.f72089p4;
        OwnershipCostItem ownershipCostItem = this.f72096q4;
        AdvertDetailsParkingAddressItem advertDetailsParkingAddressItem = this.f72103r4;
        AdvertDetailsPopularityInfoItem advertDetailsPopularityInfoItem = this.f72110s4;
        AdvertDetailsPortfolioBlockItem advertDetailsPortfolioBlockItem = this.f72116t4;
        AdvertDetailsPpRecallPromoItem advertDetailsPpRecallPromoItem = this.f72123u4;
        AdvertDetailsComfortableDealPromoItem advertDetailsComfortableDealPromoItem = this.f72130v4;
        PriceComparisonItem priceComparisonItem = this.f72137w4;
        PersistableSpannedItem persistableSpannedItem4 = this.f72144x4;
        PersistableSpannedItem persistableSpannedItem5 = this.f72151y4;
        AdvertDetailsPriceDescriptionButtonItem advertDetailsPriceDescriptionButtonItem = this.f71803A4;
        AdvertPriceListPreviewItem advertPriceListPreviewItem = this.f72158z4;
        AdvertDetailsPrivacyDisclaimerItem advertDetailsPrivacyDisclaimerItem = this.f71810B4;
        PromoMechanicsItem promoMechanicsItem = this.f71817C4;
        AdvertDetailsRatingPublishItem advertDetailsRatingPublishItem = this.f71824D4;
        InformationAboutItem informationAboutItem = this.f71831E4;
        RealtyImvItem realtyImvItem = this.f71845G4;
        RealtyQuizBannerItem realtyQuizBannerItem = this.f71852H4;
        RealtyUspItem realtyUspItem = this.f71859I4;
        RecallMeBlockItem recallMeBlockItem = this.f71866J4;
        RentAgreementItem rentAgreementItem = this.f71880L4;
        AdvertDetailsFlatsItem advertDetailsFlatsItem4 = this.f71873K4;
        AdvertDetailsRepairCalculatorItem advertDetailsRepairCalculatorItem = this.f71887M4;
        BlockItem blockItem = this.f71908P4;
        AdvertDetailsServicesTransportationGeoItem advertDetailsServicesTransportationGeoItem = this.f71915Q4;
        AdvertReservationInfoItem advertReservationInfoItem = this.f71922R4;
        PersistableSpannedItem persistableSpannedItem6 = this.f71929S4;
        AdvertDetailsSafeDealInfoItem advertDetailsSafeDealInfoItem = this.f71936T4;
        AdvertDetailsSafeDealPaymentBlockItem advertDetailsSafeDealPaymentBlockItem = this.f71943U4;
        AdvertDetailsSafeDealServicesItem advertDetailsSafeDealServicesItem = this.f71950V4;
        List<? extends TrustFactorsItem> list4 = this.f71957W4;
        AdvertSalaryRangeItem advertSalaryRangeItem = this.f71964X4;
        AdvertDetailsScrollUpItem advertDetailsScrollUpItem = this.f71901O4;
        AdvertDetailsSearchSuggestsItem advertDetailsSearchSuggestsItem = this.f71985a5;
        SecondaryConsultationItem secondaryConsultationItem = this.f71992b5;
        AdvertDetailsSellerProfileItem advertDetailsSellerProfileItem = this.f71999c5;
        AdvertDetailsSellerSubscriptionItem advertDetailsSellerSubscriptionItem = this.f72006d5;
        ServiceBookingItem serviceBookingItem = this.f72013e5;
        ServiceEducationItem serviceEducationItem = this.f72020f5;
        ServiceOrderRequestItem serviceOrderRequestItem = this.f72027g5;
        AdvertDetailsServicesDiscountAndBuyerGiftItem advertDetailsServicesDiscountAndBuyerGiftItem = this.f72034h5;
        ServicesPriceItem servicesPriceItem = this.f72041i5;
        ServicesReviewVolunteersItem servicesReviewVolunteersItem = this.f72048j5;
        ServicesTitleItem servicesTitleItem = this.f72055k5;
        AdvertDetailsShortTermRentItemDiscountItem advertDetailsShortTermRentItemDiscountItem = this.f72062l5;
        AdvertDetailsTravelPaymentTogglesItem advertDetailsTravelPaymentTogglesItem = this.f72076n5;
        AdvertDetailsTravelPriceItem advertDetailsTravelPriceItem = this.f72083o5;
        AdvertDetailsShortTermRentStrButtonsItem advertDetailsShortTermRentStrButtonsItem = this.f72069m5;
        AdvertDetailsShowDescriptionItem advertDetailsShowDescriptionItem = this.f72090p5;
        AdvertDetailsShowOnMapItem advertDetailsShowOnMapItem = this.f72097q5;
        AdvertDetailsShowOnMapItem advertDetailsShowOnMapItem2 = this.f72104r5;
        AdvertDetailsSimilarsButtonItem advertDetailsSimilarsButtonItem = this.s5;
        AdvertDetailsSimilarShiftsItem advertDetailsSimilarShiftsItem = this.f72117t5;
        SparePartsCostItem sparePartsCostItem = this.f72124u5;
        AdvertDetailsStickedSalesBannerItem advertDetailsStickedSalesBannerItem = this.f72131v5;
        PersistableSpannedItem persistableSpannedItem7 = this.f72138w5;
        AdvertDetailsTitleItem advertDetailsTitleItem = this.f72145x5;
        StyledTitleItem styledTitleItem2 = this.f72152y5;
        AdvertVerificationItem advertVerificationItem = this.f72159z5;
        AdvertVideoCallRequestItem advertVideoCallRequestItem = this.f71804A5;
        WalletInfoItem walletInfoItem = this.f71811B5;
        AdvertDetailsServicesWorkTimeItem advertDetailsServicesWorkTimeItem = this.f71818C5;
        AutoNewCarsLeadFormItem autoNewCarsLeadFormItem = this.f71825D5;
        MarketplaceRewardsBannerItem marketplaceRewardsBannerItem = this.f72033h4;
        AdvertDetailsNeighboringDatesItem advertDetailsNeighboringDatesItem = this.f71832E5;
        AdvertDetailsTravelTrustItem advertDetailsTravelTrustItem = this.f71839F5;
        AdvertDetailsOptimalPriceItem advertDetailsOptimalPriceItem = this.f71846G5;
        ExpertBlockItem expertBlockItem = this.f71853H5;
        BuyerTrustBannerItem buyerTrustBannerItem = this.f72047j4;
        aVar.getClass();
        com.avito.android.advert.item.items_list_builder.e eVarA = c.a.a(advertDetails2, this.f72035i, str, this.f72021g, this.f72056l, str2, this.f72070n, this.f72099r0, developmentOffersPosition, linkedHashMap, this.f72072n1, zBooleanValue, list, this.f72042j, offersPosition, this.f72007e, this.f72086p1, this.f72049k, this.f71799A0, position, this.f72154z0, this.f71890N0, this.f72000d, i12, lVar, advertDetailsAbuseItem, additionalSellerButtonItem, additionalSellerFeaturesItem, advertDetailsFlatsItem, advertDetailsReviewsScoreItem, additionalSellerTitleItem, advertDetailsSxAddressesHeaderItem, addressCentrityBlockItem, advertDetailsAddressGeoDistanceItem, addressHint, advertDetailsAddressItem, advertDetailsAdvertNumberItem, advertServiceAppFillingButtonItem, advertServiceAppFillingInfoItem, advertDetailsAmenitiesItem, amenitiesItem, interiorPhotosItem, advertDetailsAnchorTrustFactorsItem, advertDetailsAutoLoansItem, autoPickerBannerItem, autoSelectBannerItem, autoSelectBookingItem, autoSelectControlsItem, advertDetailsAutoSelectItem, autoSelectManagerInfoItem, autoSelectNoClickContactItem, autoSelectParametersV2Item, autoSelectParametersV3Item, autoSelectTeaserItem, advertDetailsAutotekaTeaserItem, advertDetailsAutotekaTeaserV2Item, advertDetailsAutotekaTeaserV3Item, advertDetailsAutotekaSelectTeaserItem, persistableSpannedItem, advertDetailsB2CBottomItem, advertBadgeBarItem, advertDetailsBadgeBarLightItem, persistableSpannedItem2, brandingAdvantagesBlockItem, brandingGalleryBlockItem, buzzoolaCreditBannerItem, advertDetailsCampaignsItem, advertDetailsCarBodyConditionItem, chatHistoryItem, advertDetailsFlatsItem2, advertDetailsClosingReasonItem, advertDetailsCompositeBrokerV1Item, advertDetailsCompositeBrokerV2Item, consultationAfterIceBreakersItem, consultationButtonItem, advertDetailsConsultationItem, advertDetailsContactBarItem, installmentsBlockItem, creditCalculatorItem, creditBrokerLinkItem, advertCvPhoneActualizationItem, advertCvStateItem, advertCvInfoItem, cvMotivationBannerItem, advertDetailsDeliverySuggestsItem, deliveryTrustFactorsItem, advertDetailsDescriptionItem, developerButtonItem, advertDetailsFlatsItem3, developerTrustItem, developmentOffersItem, advertDetailsDisclaimerItem, disclaimerPDItem, advertDetailsDockingBadgeBarItem, advertDetailsDomotekaReportTeaserItem, advertDetailsDomotekaTeaserItem, dynamicConsultationAfterIceBreakersItem, earlyAccessAdvertItem, equipmentsItem, advertDetailsEquipmentsTileItem, list2, advertDetailsFmpBannerItem, advertDetailsFmpCalculatorItem, advertDetailsFmpOfferItem, advertDetailsFmpProductsItem, carouselPhotoGalleryItem, advertDetailsGalleryItem, garageCompatibilityV2Item, garageCompatibilityV3Item, garageCompatibilityV4Item, advertDetailsGeoMarketReportItem, list3, advertDetailsGeoZonesItem, advertDetailsDutiesItem, advertMapItem, gigPersonalInfoItem, advertDetailsGigSellerItem, advertDetailsGroupsItem, advertDetailsReviewsScoreItem2, advertHotelDescriptionItem, advertHotelDescriptionItem2, styledTitleItem, advertDetailsHotelOfferItem, advertHotelPromoWidgetItem, advertHotelReviewItem, iceBreakersItem, icebreakersRedesignItem, imvCarsV4Item, advertJobSearchStatusItem, seekerResponsesInfoItemV2, advertDetailsLeasingBeduinItem, advertDetailsLeasingCalculatorItem, advertDetailsLeasingLinkItem, marketplaceSalesBannerItem, marketplaceSalesAdvertPromoBannerItem, marketplaceSalesBannerOutOfBoundsItem, marketplaceStocksItem, persistableSpannedItem3, mortgageCalculatorItem, mortgageSnippetItem, advertDetailsMultiItemItem, advertDetailsNoteItem, offersItem, ownershipCostItem, advertDetailsParkingAddressItem, advertDetailsPopularityInfoItem, advertDetailsPortfolioBlockItem, advertDetailsPpRecallPromoItem, advertDetailsComfortableDealPromoItem, priceComparisonItem, persistableSpannedItem4, persistableSpannedItem5, advertDetailsPriceDescriptionButtonItem, advertPriceListPreviewItem, advertDetailsPrivacyDisclaimerItem, promoMechanicsItem, advertDetailsRatingPublishItem, informationAboutItem, realtyImvItem, realtyQuizBannerItem, realtyUspItem, recallMeBlockItem, rentAgreementItem, advertDetailsFlatsItem4, advertDetailsRepairCalculatorItem, blockItem, advertDetailsServicesTransportationGeoItem, advertReservationInfoItem, persistableSpannedItem6, advertDetailsSafeDealInfoItem, advertDetailsSafeDealPaymentBlockItem, advertDetailsSafeDealServicesItem, list4, advertSalaryRangeItem, advertDetailsScrollUpItem, advertDetailsSearchSuggestsItem, secondaryConsultationItem, advertDetailsSellerProfileItem, advertDetailsSellerSubscriptionItem, serviceBookingItem, serviceEducationItem, serviceOrderRequestItem, advertDetailsServicesDiscountAndBuyerGiftItem, servicesPriceItem, servicesReviewVolunteersItem, servicesTitleItem, advertDetailsShortTermRentItemDiscountItem, advertDetailsTravelPaymentTogglesItem, advertDetailsTravelPriceItem, advertDetailsShortTermRentStrButtonsItem, advertDetailsShowDescriptionItem, advertDetailsShowOnMapItem, advertDetailsShowOnMapItem2, advertDetailsSimilarsButtonItem, advertDetailsSimilarShiftsItem, sparePartsCostItem, advertDetailsStickedSalesBannerItem, persistableSpannedItem7, advertDetailsTitleItem, styledTitleItem2, advertVerificationItem, advertVideoCallRequestItem, walletInfoItem, advertDetailsServicesWorkTimeItem, autoNewCarsLeadFormItem, marketplaceRewardsBannerItem, advertDetailsNeighboringDatesItem, advertDetailsTravelTrustItem, advertDetailsOptimalPriceItem, expertBlockItem, buyerTrustBannerItem, this.f71961X1).a();
        boolean diffBlocksUtilEnabled = advertDetails.getDiffBlocksUtilEnabled();
        List<PersistableSpannedItem> list5 = eVarA.f76824a;
        if (diffBlocksUtilEnabled) {
            this.f71954W1.b(advertDetails.getId(), list5);
        }
        this.f71975Z1 = new ArrayList(list5);
        linkedHashMap.clear();
        linkedHashMap.putAll(eVarA.f76826c);
        this.f71874K5 = eVarA.f76827d;
        return eVarA.f76825b;
    }

    public final AdvertDetailsLeasingLinkItem D0() {
        Long lF2;
        if (this.f72077o || (lF2 = this.f72111t.f()) == null) {
            return null;
        }
        long jLongValue = lF2.longValue();
        C29640d c29640d = this.f72035i;
        c29640d.getClass();
        kotlin.reflect.n<Object> nVar = C29640d.f132175X[14];
        if (((Boolean) c29640d.f132213p.a().invoke()).booleanValue()) {
            return new AdvertDetailsLeasingLinkItem(0L, null, jLongValue, this.f72000d.a(), null, null, 51, null);
        }
        return null;
    }

    public final boolean E(AdvertDetails advertDetails) {
        if (kotlin.jvm.internal.L.f(advertDetails.getContactButtonsAlwaysVisible(), Boolean.TRUE)) {
            B2 b22 = this.f72049k;
            b22.getClass();
            kotlin.reflect.n<Object> nVar = B2.f67184X[9];
            if (((Boolean) b22.f67217k.a().invoke()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final MarketplaceRewardsBannerItem E0(AdvertDetails advertDetails) {
        return this.f72078o0.a(advertDetails);
    }

    public final AdvertDetailsAbuseItem F(AdvertDetails advertDetails) {
        C28131g1.f75660a.getClass();
        return this.f72153z.a(C28131g1.a(this.f72084p, advertDetails), advertDetails.isRestyle() || advertDetails.isRealtyRedesign(), advertDetails.isGigItem());
    }

    public final MarketplaceSalesAdvertPromoBannerItem F0(AdvertDetails advertDetails) {
        return this.f72071n0.a(advertDetails);
    }

    public final AdvertDetailsReviewsScoreItem G(AdvertDetails advertDetails) {
        AdditionalSeller additionalSeller = advertDetails.getAdditionalSeller();
        AdvertDetailsReviewsScoreItem advertDetailsReviewsScoreItemA = this.f71798A.a(additionalSeller != null ? additionalSeller.getRatingPreview() : null);
        if (advertDetailsReviewsScoreItemA != null) {
            return advertDetailsReviewsScoreItemA;
        }
        return null;
    }

    public final MarketplaceSalesBannerItem G0(AdvertDetails advertDetails) {
        return this.f72057l0.a(advertDetails);
    }

    @Override // com.avito.android.advert.item.InterfaceC27816b0
    @Y61.k
    public final Bundle H() {
        m1();
        Bundle bundle = new Bundle();
        com.avito.android.util.G.e("advertItems", bundle, this.f71975Z1);
        com.avito.android.util.G.c(bundle, "complementaryBlocks", this.f71988b1.d0());
        com.avito.android.util.G.c(bundle, "commercialsBlocks", this.f71995c1.d0());
        bundle.putLong("idProvider", this.f72014f.a());
        bundle.putInt("prevColumns", this.f71916Q5);
        bundle.putBoolean("multiItemStateConsumed", this.f71923R5);
        com.avito.android.util.G.c(bundle, "sellerSubscriptionPresenter", this.f72063m.d0());
        com.avito.android.util.G.c(bundle, "expandable_section_state", this.f72105s.l1());
        return bundle;
    }

    public final MarketplaceSalesBannerOutOfBoundsItem H0(AdvertDetails advertDetails) {
        return this.f72064m0.a(advertDetails);
    }

    public final AdvertDetailsAnchorTrustFactorsItem I(AdvertDetails advertDetails) {
        return this.f72029h0.a(advertDetails);
    }

    public final MarketplaceStocksItem I0(AdvertDetails advertDetails) {
        return this.f72015f0.a(advertDetails);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.advert.item.auto_credits.AdvertDetailsAutoLoansItem J(com.avito.android.remote.model.AdvertDetails r21) {
        /*
            r20 = this;
            r0 = r20
            com.avito.android.remote.model.credit_broker.CreditBrokerProduct r1 = r21.getCreditInfo()
            boolean r2 = r1 instanceof com.avito.android.remote.model.credit_broker.AdvertCreditCompositeBroker
            lD.a r3 = r0.f72056l
            r4 = 0
            r5 = 0
            if (r2 == 0) goto L49
            r3.getClass()
            kotlin.reflect.n<java.lang.Object>[] r2 = lD.C43617a.f413588V
            r6 = 14
            r2 = r2[r6]
            com.avito.android.A0$a r2 = r3.f413624p
            DE0.a r2 = r2.a()
            java.lang.Object r2 = r2.invoke()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L49
            com.avito.android.remote.model.credit_broker.AdvertCreditCompositeBroker r1 = (com.avito.android.remote.model.credit_broker.AdvertCreditCompositeBroker) r1
            com.avito.android.remote.parse.adapter.CompositeBrokerEntryPoint r2 = r1.getEntryPoint()
            if (r2 == 0) goto L48
            com.avito.android.remote.parse.adapter.CompositeBrokerCalculator r1 = r1.getCalculator()
            if (r1 == 0) goto L42
            java.lang.Boolean r1 = r1.getNeedToScroll()
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r1 = kotlin.jvm.internal.L.f(r1, r3)
            goto L43
        L42:
            r1 = r5
        L43:
            r13 = r1
            r11 = r2
            r12 = r5
            r14 = r12
            goto L9b
        L48:
            return r4
        L49:
            boolean r2 = r1 instanceof com.avito.android.remote.model.credit_broker.AdvertCreditCompositeBrokerV2
            r6 = 1
            if (r2 == 0) goto L90
            r3.getClass()
            kotlin.reflect.n<java.lang.Object>[] r2 = lD.C43617a.f413588V
            r7 = 15
            r2 = r2[r7]
            com.avito.android.A0$a r2 = r3.f413625q
            DE0.a r2 = r2.a()
            java.lang.Object r2 = r2.invoke()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L90
            com.avito.android.remote.model.credit_broker.AdvertCreditCompositeBrokerV2 r1 = (com.avito.android.remote.model.credit_broker.AdvertCreditCompositeBrokerV2) r1
            com.avito.android.remote.parse.adapter.CompositeBrokerEntryPoint r2 = r1.getEntryPoint()
            if (r2 == 0) goto L8f
            com.avito.android.remote.parse.adapter.CompositeBrokerCalculatorV2 r3 = r1.getCalculator()
            if (r3 == 0) goto L7f
            boolean r3 = r3.getNeedToScroll()
            if (r3 != r6) goto L7f
            r3 = r6
            goto L80
        L7f:
            r3 = r5
        L80:
            com.avito.android.remote.parse.adapter.CompositeBrokerCalculatorV2 r1 = r1.getCalculator()
            if (r1 == 0) goto L8a
            boolean r5 = r1.getNeedAuth()
        L8a:
            r11 = r2
            r13 = r3
            r14 = r5
            r12 = r6
            goto L9b
        L8f:
            return r4
        L90:
            boolean r2 = r1 instanceof com.avito.android.remote.model.credit_broker.AutoLoansWithoutCalculator
            if (r2 == 0) goto Lb3
            r2 = r1
            com.avito.android.remote.model.credit_broker.AdvertDetailsAutoLoansData r2 = (com.avito.android.remote.model.credit_broker.AdvertDetailsAutoLoansData) r2
            r11 = r2
            r12 = r5
            r13 = r12
            r14 = r6
        L9b:
            com.avito.android.advert.item.similars.j r1 = r0.f72000d
            int r15 = r1.a()
            com.avito.android.advert.item.auto_credits.AdvertDetailsAutoLoansItem r1 = new com.avito.android.advert.item.auto_credits.AdvertDetailsAutoLoansItem
            r16 = 0
            r17 = 0
            r8 = 0
            r10 = 0
            r18 = 387(0x183, float:5.42E-43)
            r19 = 0
            r7 = r1
            r7.<init>(r8, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r1
        Lb3:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.T.J(com.avito.android.remote.model.AdvertDetails):com.avito.android.advert.item.auto_credits.AdvertDetailsAutoLoansItem");
    }

    public final AdvertDetailsOptimalPriceItem J0(AdvertDetails advertDetails) {
        return this.f71897O0.a(advertDetails);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.advert.item.auto_media.AdvertDetailsAutoMediaItem K(com.avito.android.remote.model.AdvertDetails r18) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.T.K(com.avito.android.remote.model.AdvertDetails):com.avito.android.advert.item.auto_media.AdvertDetailsAutoMediaItem");
    }

    public final OwnershipCostItem K0() {
        AdvertDetails advertDetails;
        AdvertDetails advertDetails2 = this.f71951V5;
        if (advertDetails2 != null && advertDetails2.isGigItem()) {
            return null;
        }
        int iA2 = this.f72000d.a();
        boolean z12 = false;
        boolean z13 = this.f72136w3 == null && ((advertDetails = this.f71951V5) == null || !advertDetails.isRedesign());
        AdvertDetails advertDetails3 = this.f71951V5;
        if (advertDetails3 != null && advertDetails3.isRedesign()) {
            z12 = true;
        }
        return new OwnershipCostItem(0L, null, iA2, null, null, z13, !z12, false, 155, null);
    }

    public final AdvertDetailsAutoMediaSelectPixelItem L(AdvertDetails advertDetails) {
        if (kotlin.jvm.internal.L.f(advertDetails.getIsAutoSelectView(), Boolean.TRUE) && this.f72079o1.f439745a.f439749b.a()) {
            return new AdvertDetailsAutoMediaSelectPixelItem(0L, null, this.f72000d.a(), null, null, 27, null);
        }
        return null;
    }

    public final AdvertDetailsPopularityInfoItem L0(AdvertDetails advertDetails) {
        return this.f72022g0.a(advertDetails);
    }

    public final AdvertDetailsPortfolioBlockItem M0(AdvertDetails advertDetails) {
        AdvertDetailsPortfolioBlockItem advertDetailsPortfolioBlockItemA = this.f72148y1.a(advertDetails);
        if (advertDetailsPortfolioBlockItemA != null) {
            return advertDetailsPortfolioBlockItemA;
        }
        return null;
    }

    public final AutoPickerBannerItem N(AdvertDetails advertDetails) {
        AdvertDetailsAutoPickerBanner autoPickerBanner;
        String subtitle;
        C43617a c43617a = this.f72056l;
        c43617a.getClass();
        kotlin.reflect.n<Object> nVar = C43617a.f413588V[12];
        if (!((Boolean) c43617a.f413622n.a().invoke()).booleanValue() || (autoPickerBanner = advertDetails.getAutoPickerBanner()) == null) {
            return null;
        }
        String title = autoPickerBanner.getTitle();
        if ((title == null || title.length() == 0) && (((subtitle = autoPickerBanner.getSubtitle()) == null || subtitle.length() == 0) && autoPickerBanner.getImage() == null && autoPickerBanner.getButton() == null)) {
            return null;
        }
        return new AutoPickerBannerItem(0L, null, autoPickerBanner, this.f72000d.a(), null, null, 51, null);
    }

    public final PriceComparisonItem N0(AdvertDetails advertDetails) {
        ModelCardInfo modelCardInfo = advertDetails.getModelCardInfo();
        if (modelCardInfo != null) {
            ModelCardInfo modelCardInfo2 = modelCardInfo.getPriceInfo() != null ? modelCardInfo : null;
            if (modelCardInfo2 != null) {
                return new PriceComparisonItem(0L, null, this.f72000d.a(), modelCardInfo2, null, null, 51, null);
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
    @Override // com.avito.android.advert.item.InterfaceC27816b0
    public final void O(int i12, long j12) {
        AdvertDetailsGalleryItem next;
        AdvertDetailsGalleryItem advertDetailsGalleryItem = this.f71830E3;
        if (advertDetailsGalleryItem != null) {
            advertDetailsGalleryItem.f85012k = i12;
        }
        CarouselPhotoGalleryItem carouselPhotoGalleryItem = this.f71823D3;
        if (carouselPhotoGalleryItem != null) {
            carouselPhotoGalleryItem.f84534f = i12;
        }
        Iterator it = this.f71975Z1.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = 0;
                break;
            }
            next = it.next();
            PersistableSpannedItem persistableSpannedItem = (PersistableSpannedItem) next;
            if ((persistableSpannedItem instanceof AdvertDetailsGalleryItem) && ((AdvertDetailsGalleryItem) persistableSpannedItem).f85013l == j12) {
                break;
            }
        }
        AdvertDetailsGalleryItem advertDetailsGalleryItem2 = next instanceof AdvertDetailsGalleryItem ? next : null;
        if (advertDetailsGalleryItem2 == null) {
            return;
        }
        advertDetailsGalleryItem2.f85012k = i12;
    }

    public final AdvertDetailsPriceDescriptionButtonItem O0(AdvertDetails advertDetails) {
        return this.f72008e0.a(advertDetails);
    }

    public final AutoSelectBookingItem P(AdvertDetails advertDetails) {
        AutoSelectBooking autoSelectBooking = advertDetails.getAutoSelectBooking();
        C43617a c43617a = this.f72056l;
        c43617a.getClass();
        kotlin.reflect.n<Object> nVar = C43617a.f413588V[20];
        if (!((Boolean) c43617a.f413630v.a().invoke()).booleanValue() || autoSelectBooking == null) {
            return null;
        }
        return new AutoSelectBookingItem(0L, this.f72000d.a(), null, null, null, autoSelectBooking, 29, null);
    }

    public final AdvertPriceListPreviewItem P0(AdvertDetails advertDetails) {
        AdvertPriceListPreviewResponse priceListPreview;
        AdvertParameters parameters = advertDetails.getParameters();
        if (parameters == null || (priceListPreview = parameters.getPriceListPreview()) == null) {
            return null;
        }
        return new AdvertPriceListPreviewItem(0L, null, null, null, this.f72000d.a(), advertDetails.isBusinessServicesRedesignEnabled() ? this.f72007e.b() : priceListPreview.getTitle(), priceListPreview.getButtonTitle(), priceListPreview.getValues(), priceListPreview.getPriceList(), priceListPreview.getButtonClickedEvent(), advertDetails.isRestyle(), advertDetails.isBusinessServicesRedesignEnabled(), advertDetails.isServicesRedesign(), 15, null);
    }

    public final AutoSelectControlsItem Q(AdvertDetails advertDetails) {
        AutoSelectControls autoSelectControls;
        if (!this.f72056l.v().invoke().booleanValue() || advertDetails.getAutoSelectBooking() != null || (autoSelectControls = advertDetails.getAutoSelectControls()) == null) {
            return null;
        }
        if (autoSelectControls.getFirstButton() == null && autoSelectControls.getSecondButton() == null) {
            return null;
        }
        return new AutoSelectControlsItem(0L, null, null, null, this.f72000d.a(), autoSelectControls, advertDetails.getAutoSelectContactMe(), 15, null);
    }

    public final AdvertDetailsRatingPublishItem Q0(AdvertDetails advertDetails) {
        Action ratingAction;
        AdvertSeller seller = advertDetails.getSeller();
        if (seller == null || (ratingAction = seller.getRatingAction()) == null) {
            return null;
        }
        return new AdvertDetailsRatingPublishItem(this.f72000d.a(), ratingAction);
    }

    public final AdvertDetailsAutoSelectItem R(AdvertDetails advertDetails) {
        AdvertAutoSelect autoSelect;
        String title;
        C43617a c43617a = this.f72056l;
        c43617a.getClass();
        kotlin.reflect.n<Object> nVar = C43617a.f413588V[21];
        if (!((Boolean) c43617a.f413631w.a().invoke()).booleanValue() || (autoSelect = advertDetails.getAutoSelect()) == null) {
            return null;
        }
        List<AdvertAutoSelect.AutoSelectBenefit> benefits = autoSelect.getBenefits();
        if ((benefits == null || benefits.isEmpty()) && (((title = autoSelect.getTitle()) == null || title.length() == 0) && autoSelect.getButton() == null)) {
            return null;
        }
        return new AdvertDetailsAutoSelectItem(0L, null, this.f72000d.a(), null, null, autoSelect, 27, null);
    }

    public final RealtyImvItem R0(AdvertDetails advertDetails) {
        return this.f71981a1.a(advertDetails);
    }

    public final AutoSelectNoClickContactItem S(AdvertDetails advertDetails) {
        AutoSelectNoClickContact autoSelectNoClickContact = advertDetails.getAutoSelectNoClickContact();
        if (autoSelectNoClickContact == null) {
            return null;
        }
        String title = autoSelectNoClickContact.getTitle();
        AutoSelectNoClickContactItem.NoClickContactCard noClickContactCard = new AutoSelectNoClickContactItem.NoClickContactCard(autoSelectNoClickContact.getLeftCard().getImage(), autoSelectNoClickContact.getLeftCard().getText());
        AutoSelectNoClickContactItem.NoClickContactCard noClickContactCard2 = new AutoSelectNoClickContactItem.NoClickContactCard(autoSelectNoClickContact.getRightCard().getImage(), autoSelectNoClickContact.getRightCard().getText());
        String inputTitle = autoSelectNoClickContact.getInputTitle();
        AutoSelectNumberInputButtonParams autoSelectNumberInputButtonParams = new AutoSelectNumberInputButtonParams(autoSelectNoClickContact.getSubmitButton().getText(), autoSelectNoClickContact.getSubmitButton().getDeepLink(), autoSelectNoClickContact.getSubmitButton().getStyle());
        AttributedText disclaimer = autoSelectNoClickContact.getDisclaimer();
        AutoSelectNoClickContactItem.Analytics analytics = new AutoSelectNoClickContactItem.Analytics(autoSelectNoClickContact.getAnalytics().getOnShowForm());
        AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
        return new AutoSelectNoClickContactItem(title, noClickContactCard, noClickContactCard2, inputTitle, autoSelectNumberInputButtonParams, disclaimer, analytics, "ITEM_AUTO_SELECT_NO_CLICK_CONTACT", 152, this.f72000d.a(), null, null, 3072, null);
    }

    public final RecallMeBlockItem S0(AdvertDetails advertDetails) {
        return this.f71924S.a(advertDetails);
    }

    public final AutoSelectParametersV2Item T(AdvertDetails advertDetails) {
        AutoSelectParametersV2 autoSelectParametersV2 = advertDetails.getAutoSelectParametersV2();
        if (autoSelectParametersV2 == null) {
            return null;
        }
        AttributedText title = autoSelectParametersV2.getTitle();
        AttributedText description = autoSelectParametersV2.getDescription();
        Image image = autoSelectParametersV2.getImage();
        List<AutoSelectAdvantage> advantages = autoSelectParametersV2.getAdvantages();
        ArrayList arrayList = new ArrayList(C42745f0.q(advantages, 10));
        Iterator<T> it = advantages.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            com.avito.android.advert.item.similars.j jVar = this.f72000d;
            if (!zHasNext) {
                AttributedText footer = autoSelectParametersV2.getFooter();
                String componentSlug = autoSelectParametersV2.getComponentSlug();
                AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
                return new AutoSelectParametersV2Item(title, description, image, arrayList, footer, componentSlug, "ITEM_AUTO_SELECT_PARAMETERS_V2", 149, jVar.a(), null, null, 1536, null);
            }
            AutoSelectAdvantage autoSelectAdvantage = (AutoSelectAdvantage) it.next();
            arrayList.add(new AutoSelectExpandableAdvantageItem(autoSelectAdvantage.getIcon(), autoSelectAdvantage.getTitle(), autoSelectAdvantage.getDescription(), autoSelectAdvantage.getComponentSlug(), null, jVar.a(), 16, null));
        }
    }

    public final AdvertDetailsRepairCalculatorItem T0(AdvertDetails advertDetails) {
        AdvertDetailsRepairCalculatorItem advertDetailsRepairCalculatorItemA = this.f72127v1.a(advertDetails);
        if (advertDetailsRepairCalculatorItemA != null) {
            return advertDetailsRepairCalculatorItemA;
        }
        return null;
    }

    public final AutoSelectTeaserItem U(AdvertDetails advertDetails) {
        AutoSelectTeaser autoSelectTeaser;
        C43617a c43617a = this.f72056l;
        c43617a.getClass();
        kotlin.reflect.n<Object> nVar = C43617a.f413588V[19];
        if (((Boolean) c43617a.f413629u.a().invoke()).booleanValue() && (autoSelectTeaser = advertDetails.getAutoSelectTeaser()) != null) {
            return new AutoSelectTeaserItem(0L, null, null, null, this.f72000d.a(), autoSelectTeaser, 15, null);
        }
        return null;
    }

    public final AmenitiesItem U0(AdvertDetails advertDetails) {
        String str;
        Amenities amenities;
        InteriorPhotosBlock interiorPhotosBlock;
        SellerDetails sellerDetails;
        InteriorPhotosBlock interiorPhotosBlock2;
        SellerDetails sellerDetails2 = advertDetails.getSellerDetails();
        AttributedText title = (((sellerDetails2 == null || (interiorPhotosBlock2 = sellerDetails2.getInteriorPhotosBlock()) == null) ? null : interiorPhotosBlock2.getImages()) != null || (sellerDetails = advertDetails.getSellerDetails()) == null) ? null : sellerDetails.getTitle();
        SellerDetails sellerDetails3 = advertDetails.getSellerDetails();
        if (((sellerDetails3 == null || (interiorPhotosBlock = sellerDetails3.getInteriorPhotosBlock()) == null) ? null : interiorPhotosBlock.getImages()) != null) {
            AmenitiesAndInteriorPhotoAnalyticsTrackerImpl.FromBlock[] fromBlockArr = AmenitiesAndInteriorPhotoAnalyticsTrackerImpl.FromBlock.f81146b;
            str = "amenitiesAndInteriorPhotos";
        } else {
            AmenitiesAndInteriorPhotoAnalyticsTrackerImpl.FromBlock[] fromBlockArr2 = AmenitiesAndInteriorPhotoAnalyticsTrackerImpl.FromBlock.f81146b;
            str = "amenities";
        }
        SellerDetails sellerDetails4 = advertDetails.getSellerDetails();
        if (sellerDetails4 == null || (amenities = sellerDetails4.getAmenities()) == null) {
            return null;
        }
        SellerDetails sellerDetails5 = advertDetails.getSellerDetails();
        return this.f72037i1.a(amenities, title, sellerDetails5 != null ? sellerDetails5.d() : null, str);
    }

    public final AdvertDetailsSafeDealServicesItem V0(AdvertDetails advertDetails) {
        SafeDeal safeDeal = advertDetails.getSafeDeal();
        SafeDeal safeDeal2 = (safeDeal == null || safeDeal.f() == null) ? null : safeDeal;
        if (safeDeal2 != null) {
            return new AdvertDetailsSafeDealServicesItem(0L, null, safeDeal2, this.f72000d.a(), null, null, 51, null);
        }
        return null;
    }

    public final AdvertDetailsAutotekaTeaserItemCommon<AutotekaTeaserItemResponse> W(AdvertDetails advertDetails) {
        return this.f71931T.a(advertDetails);
    }

    public final AdvertDetailsSellerSubscriptionItem W0(AdvertDetails advertDetails) {
        AdvertDetailsSellerSubscriptionItem advertDetailsSellerSubscriptionItemA = this.f71840G.a(advertDetails);
        if (advertDetailsSellerSubscriptionItemA != null) {
            return advertDetailsSellerSubscriptionItemA;
        }
        return null;
    }

    public final AdvertBadgeBarItem X(AdvertDetails advertDetails) {
        return this.f72043j0.a(advertDetails);
    }

    public final ServiceBookingItem X0(AdvertDetails advertDetails) {
        ServiceBooking serviceBooking;
        ServiceBookingItem.TooltipInfo tooltipInfo;
        if (E(advertDetails) || (serviceBooking = advertDetails.getServiceBooking()) == null) {
            return null;
        }
        String title = serviceBooking.getAction().getTitle();
        DeepLink uri = serviceBooking.getAction().getUri();
        String description = serviceBooking.getDescription();
        int iA2 = this.f72000d.a();
        if (serviceBooking.getTooltip() != null) {
            ServiceBookingTooltip tooltip = serviceBooking.getTooltip();
            String title2 = tooltip != null ? tooltip.getTitle() : null;
            ServiceBookingTooltip tooltip2 = serviceBooking.getTooltip();
            String body = tooltip2 != null ? tooltip2.getBody() : null;
            ServiceBookingTooltip tooltip3 = serviceBooking.getTooltip();
            String key = tooltip3 != null ? tooltip3.getKey() : null;
            ServiceBookingTooltip tooltip4 = serviceBooking.getTooltip();
            tooltipInfo = new ServiceBookingItem.TooltipInfo(title2, body, key, tooltip4 != null ? tooltip4.getButtonText() : null);
        } else {
            tooltipInfo = null;
        }
        ServiceBookingTooltip tooltip5 = serviceBooking.getTooltip();
        return new ServiceBookingItem(title, description, uri, !this.f72118u.b(tooltip5 != null ? tooltip5.getKey() : null) ? tooltipInfo : null, advertDetails.isRestyle(), 0L, null, iA2, null, null, 864, null);
    }

    public final AdvertDetailsCarBodyConditionItem Y(AdvertDetails advertDetails) {
        if (advertDetails.getBodyCondition() == null) {
            return null;
        }
        return new AdvertDetailsCarBodyConditionItem(0L, null, advertDetails.getBodyCondition(), advertDetails.getId(), FromPage.f82800c, null, this.f72000d.a(), null, 163, null);
    }

    public final ServiceEducationItem Y0(AdvertDetails advertDetails) {
        AdvertParameters parameters = advertDetails.getParameters();
        ServiceEducation serviceEducation = parameters != null ? parameters.getServiceEducation() : null;
        if (serviceEducation != null) {
            return this.f71966Y.a(serviceEducation, advertDetails.getId());
        }
        return null;
    }

    public final ChatHistoryItem Z(AdvertDetails advertDetails) {
        return this.f71820D0.a(advertDetails);
    }

    public final ServiceOrderRequestItem Z0(AdvertDetails advertDetails) {
        ServiceOrder serviceOrderButton;
        if (E(advertDetails) || (serviceOrderButton = advertDetails.getServiceOrderButton()) == null) {
            return null;
        }
        DeepLink uri = serviceOrderButton.getPrimaryAction().getUri();
        String title = serviceOrderButton.getPrimaryAction().getTitle();
        Boolean isLoading = serviceOrderButton.getPrimaryAction().getIsLoading();
        ServiceOrderRequestItem.Action action = new ServiceOrderRequestItem.Action(title, uri, isLoading != null ? isLoading.booleanValue() : false);
        ServiceOrderAction secondaryAction = serviceOrderButton.getSecondaryAction();
        ServiceOrderRequestItem serviceOrderRequestItem = new ServiceOrderRequestItem(serviceOrderButton.getDescription(), serviceOrderButton.getDescriptionLink(), action, secondaryAction != null ? new ServiceOrderRequestItem.Action(secondaryAction.getUri(), secondaryAction.getTitle(), false, 4, null) : null, advertDetails.isRedesign(), serviceOrderButton.getPrimaryTooltip(), 0L, null, this.f72000d.a(), null, null, 1728, null);
        String id2 = advertDetails.getId();
        String str = serviceOrderRequestItem.f79871d.f79881c;
        com.avito.android.advert_core.analytics.a aVar = this.f72021g;
        aVar.k3(id2, str);
        ServiceOrderRequestItem.Action action2 = serviceOrderRequestItem.f79872e;
        if (action2 != null) {
            aVar.k3(advertDetails.getId(), action2.f79881c);
        }
        return serviceOrderRequestItem;
    }

    @Override // com.avito.android.advert.item.Q
    @Y61.k
    public final ArrayList a() {
        return C42745f0.B(this.f71975Z1, SellerSubscriptionItem.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.auto_loans_composite_broker.v1.AdvertDetailsCompositeBrokerV1Item a0(com.avito.android.remote.model.AdvertDetails r14) {
        /*
            r13 = this;
            lD.a r0 = r13.f72056l
            r0.getClass()
            kotlin.reflect.n<java.lang.Object>[] r1 = lD.C43617a.f413588V
            r2 = 14
            r1 = r1[r2]
            com.avito.android.A0$a r0 = r0.f413624p
            DE0.a r0 = r0.a()
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L29
            com.avito.android.remote.model.credit_broker.CreditBrokerProduct r0 = r14.getCreditInfo()
            boolean r2 = r0 instanceof com.avito.android.remote.model.credit_broker.AdvertCreditCompositeBroker
            if (r2 == 0) goto L29
            com.avito.android.remote.model.credit_broker.AdvertCreditCompositeBroker r0 = (com.avito.android.remote.model.credit_broker.AdvertCreditCompositeBroker) r0
            goto L2a
        L29:
            r0 = r1
        L2a:
            if (r0 == 0) goto L53
            com.avito.android.remote.parse.adapter.CompositeBrokerCalculator r6 = r0.getCalculator()
            if (r6 != 0) goto L33
            goto L53
        L33:
            com.avito.android.advert.item.similars.j r0 = r13.f72000d
            int r8 = r0.a()
            com.avito.android.remote.model.AdvertPrice r14 = r14.getPrice()
            if (r14 == 0) goto L43
            java.lang.String r1 = r14.getValue()
        L43:
            r7 = r1
            com.avito.android.auto_loans_composite_broker.v1.AdvertDetailsCompositeBrokerV1Item r14 = new com.avito.android.auto_loans_composite_broker.v1.AdvertDetailsCompositeBrokerV1Item
            r9 = 0
            r10 = 0
            r3 = 0
            r5 = 0
            r11 = 99
            r12 = 0
            r2 = r14
            r2.<init>(r3, r5, r6, r7, r8, r9, r10, r11, r12)
            return r14
        L53:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.T.a0(com.avito.android.remote.model.AdvertDetails):com.avito.android.auto_loans_composite_broker.v1.AdvertDetailsCompositeBrokerV1Item");
    }

    public final AdvertServiceAppFillingButtonItem a1(AdvertDetails advertDetails) {
        SimpleAdvertAction button;
        AdvertServiceAppFilling serviceAppFilling = advertDetails.getServiceAppFilling();
        if (serviceAppFilling == null || (button = serviceAppFilling.getButton()) == null) {
            return null;
        }
        return new AdvertServiceAppFillingButtonItem(0L, null, null, null, this.f72000d.a(), button, 15, null);
    }

    @Override // com.avito.android.advert.item.InterfaceC27816b0
    public final void b(@Y61.k Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("advertItems");
        if (parcelableArrayList != null) {
            this.f71975Z1 = new ArrayList(parcelableArrayList);
        }
        Kundle kundleA = com.avito.android.util.G.a(bundle, "complementaryBlocks");
        if (kundleA != null) {
            this.f71988b1.f0(kundleA);
        }
        Kundle kundleA2 = com.avito.android.util.G.a(bundle, "commercialsBlocks");
        if (kundleA2 != null) {
            this.f71995c1.f0(kundleA2);
        }
        Kundle kundleA3 = com.avito.android.util.G.a(bundle, "sellerSubscriptionPresenter");
        if (kundleA3 != null) {
            this.f72063m.f0(kundleA3);
        }
        this.f72014f.b(bundle.getLong("idProvider"));
        this.f71916Q5 = bundle.getInt("prevColumns", 0);
        boolean z12 = bundle.getBoolean("multiItemStateConsumed", false);
        this.f71923R5 = z12;
        if (z12) {
            this.f72098r.f77727a = null;
        }
        Kundle kundleA4 = com.avito.android.util.G.a(bundle, "expandable_section_state");
        if (kundleA4 != null) {
            this.f72105s.f0(kundleA4);
        }
    }

    public final AdvertDetailsCompositeBrokerV2Item b0(AdvertDetails advertDetails) {
        CompositeBrokerCalculatorV2 calculator;
        C43617a c43617a = this.f72056l;
        c43617a.getClass();
        kotlin.reflect.n<Object> nVar = C43617a.f413588V[15];
        if (!((Boolean) c43617a.f413625q.a().invoke()).booleanValue()) {
            return null;
        }
        CreditBrokerProduct creditInfo = advertDetails.getCreditInfo();
        AdvertCreditCompositeBrokerV2 advertCreditCompositeBrokerV2 = creditInfo instanceof AdvertCreditCompositeBrokerV2 ? (AdvertCreditCompositeBrokerV2) creditInfo : null;
        if (advertCreditCompositeBrokerV2 == null || (calculator = advertCreditCompositeBrokerV2.getCalculator()) == null) {
            return null;
        }
        int iA2 = this.f72000d.a();
        AdvertPrice price = advertDetails.getPrice();
        return new AdvertDetailsCompositeBrokerV2Item(0L, null, calculator, price != null ? price.getValue() : null, iA2, null, null, 99, null);
    }

    public final AdvertServiceAppFillingInfoItem b1(AdvertDetails advertDetails) {
        AdvertServiceAppFilling.AdvertServiceAppFillingDescription description;
        AdvertServiceAppFilling serviceAppFilling = advertDetails.getServiceAppFilling();
        if (serviceAppFilling == null || (description = serviceAppFilling.getDescription()) == null) {
            return null;
        }
        return new AdvertServiceAppFillingInfoItem(0L, null, null, null, this.f72000d.a(), description, 15, null);
    }

    @Override // com.avito.android.advert.item.InterfaceC27816b0
    public final void c(@Y61.k PaymentBlockItemState paymentBlockItemState) {
        Object next;
        Iterator it = this.f71975Z1.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((PersistableSpannedItem) next) instanceof AdvertDetailsSafeDealPaymentBlockItem) {
                    break;
                }
            }
        }
        AdvertDetailsSafeDealPaymentBlockItem advertDetailsSafeDealPaymentBlockItem = (AdvertDetailsSafeDealPaymentBlockItem) (next instanceof AdvertDetailsSafeDealPaymentBlockItem ? next : null);
        if (advertDetailsSafeDealPaymentBlockItem == null) {
            return;
        }
        e(AdvertDetailsSafeDealPaymentBlockItem.b(advertDetailsSafeDealPaymentBlockItem, 0, paymentBlockItemState, 31));
    }

    public final AdvertDetailsContactBarItem c0(AdvertDetails advertDetails) {
        C28131g1.f75660a.getClass();
        AdvertDetailsStyle advertDetailsStyleA = C28131g1.a(this.f72084p, advertDetails);
        if (advertDetails.isGigItem()) {
            return this.f71870K1.b(this.f72117t5);
        }
        AdvertDetailsContactBarItem advertDetailsContactBarItemA = this.f71847H.a(advertDetails, advertDetailsStyleA);
        if (advertDetailsContactBarItemA != null) {
            return advertDetailsContactBarItemA;
        }
        return null;
    }

    public final AdvertDetailsServicesDiscountAndBuyerGiftItem c1(AdvertServicesDiscountAndBuyerGift.Discount discount, AdvertServicesDiscountAndBuyerGift.Gift gift) {
        String id2;
        if (gift == null && discount == null) {
            return null;
        }
        String strA = this.f72132w.a();
        Long lZ02 = strA != null ? C43066x.z0(strA) : null;
        AdvertDetails advertDetails = this.f71951V5;
        Long lZ03 = (advertDetails == null || (id2 = advertDetails.getId()) == null) ? null : C43066x.z0(id2);
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder(" ");
        sb3.append(discount != null ? discount.getTitle() : null);
        sb2.append(sb3.toString());
        StringBuilder sb4 = new StringBuilder(" ");
        sb4.append(discount != null ? discount.getAmount() : null);
        sb2.append(sb4.toString());
        StringBuilder sb5 = new StringBuilder(" ");
        sb5.append(discount != null ? discount.getDescription() : null);
        sb2.append(sb5.toString());
        StringBuilder sb6 = new StringBuilder(" ");
        sb6.append(gift != null ? gift.getTitle() : null);
        sb2.append(sb6.toString());
        return this.f72133w0.a(gift, discount, lZ02, lZ03, sb2.toString());
    }

    @Override // com.avito.android.advert.item.InterfaceC27816b0
    public final void clearItems() {
        this.f71975Z1.clear();
        this.f71982a2.clear();
        this.f71989b2.clear();
    }

    @Override // com.avito.android.advert.item.InterfaceC27816b0
    public final void d(@Y61.k List<? extends TrustFactorsComponent> list, boolean z12) {
        ArrayList arrayListA = com.avito.android.advert.item.safedeal.trust_factors.g.a(this.f72100r1, list);
        Iterator it = this.f71975Z1.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            } else if (((PersistableSpannedItem) it.next()) instanceof TrustFactorsItem) {
                break;
            } else {
                i12++;
            }
        }
        Integer numValueOf = Integer.valueOf(i12);
        if (i12 == -1) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            C42745f0.l0(g.f72167l, this.f71975Z1);
            this.f71975Z1.addAll(iIntValue, arrayListA);
            i(this.f71909P5);
        }
    }

    public final AdvertCvPhoneActualizationItem d0(AdvertDetails advertDetails) {
        CvPhoneActualizationBanner cvPhoneActualizationBanner = advertDetails.getCvPhoneActualizationBanner();
        if (cvPhoneActualizationBanner == null) {
            return null;
        }
        int iA2 = this.f72000d.a();
        String title = cvPhoneActualizationBanner.getTitle();
        String subtitle = cvPhoneActualizationBanner.getSubtitle();
        long cvId = cvPhoneActualizationBanner.getCvId();
        List<CvPhoneActualizationBanner.CvPhoneActualizationAction> actions = cvPhoneActualizationBanner.getActions();
        ArrayList arrayList = new ArrayList();
        for (CvPhoneActualizationBanner.CvPhoneActualizationAction cvPhoneActualizationAction : actions) {
            String type = cvPhoneActualizationAction.getType();
            AdvertCvPhoneActualizationAction advertCvPhoneActualizationAction = kotlin.jvm.internal.L.f(type, "keep") ? new AdvertCvPhoneActualizationAction(cvPhoneActualizationAction.getTitle(), AdvertCvPhoneActualizationActionType.f75029b, null, 4, null) : kotlin.jvm.internal.L.f(type, "change") ? new AdvertCvPhoneActualizationAction(cvPhoneActualizationAction.getTitle(), AdvertCvPhoneActualizationActionType.f75030c, cvPhoneActualizationAction.getDeepLink()) : null;
            if (advertCvPhoneActualizationAction != null) {
                arrayList.add(advertCvPhoneActualizationAction);
            }
        }
        return new AdvertCvPhoneActualizationItem(0L, null, iA2, title, subtitle, cvId, arrayList, null, null, 387, null);
    }

    public final ServicesReviewVolunteersItem d1(AdvertDetails advertDetails) {
        ServicesReviewVolunteers servicesReviewVolunteers = advertDetails.getServicesReviewVolunteers();
        if (servicesReviewVolunteers == null) {
            return null;
        }
        this.f71944U5 = servicesReviewVolunteers.getPosition();
        return new ServicesReviewVolunteersItem(0L, null, this.f72000d.a(), null, null, servicesReviewVolunteers.getTitle(), servicesReviewVolunteers.getSubtitle(), new ServicesReviewVolunteersItem.Action(servicesReviewVolunteers.getAction().getTitle(), servicesReviewVolunteers.getAction().getUri()), 27, null);
    }

    @Override // com.avito.android.advert.item.Q
    public final void e(@Y61.k PersistableSpannedItem persistableSpannedItem) {
        Iterator it = this.f71975Z1.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            } else if (kotlin.jvm.internal.L.f(((PersistableSpannedItem) it.next()).getF273226b(), persistableSpannedItem.getF273226b())) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 >= 0) {
            this.f71975Z1.set(i12, persistableSpannedItem);
        }
        I1 i13 = this.f71968Y1;
        if (i13 != null) {
            i13.i0(persistableSpannedItem);
        }
    }

    @Override // com.avito.android.advert.item.S
    public final void e0() {
        m1();
        I1 i12 = this.f71968Y1;
        if (i12 != null) {
            i12.J();
        }
        this.f71968Y1 = null;
        kotlinx.coroutines.Q0.d(this.f71965X5.f411905b);
    }

    public final BlockItem e1(AdvertDetails advertDetails) {
        ExpandItemsButtonItem expandItemsButtonItem;
        TransportInfo transportInfo = advertDetails.getTransportInfo();
        if (transportInfo == null) {
            return null;
        }
        boolean zIsEmpty = transportInfo.getItems().isEmpty();
        G4 g42 = this.f72134w1;
        if (!zIsEmpty) {
            return g42.a(advertDetails);
        }
        C28070w1.a aVarB = g42.b(advertDetails);
        if (aVarB != null && (expandItemsButtonItem = aVarB.f74054b) != null) {
            this.f71989b2.put(Long.valueOf(aVarB.f74053a.f84654b), expandItemsButtonItem);
        }
        if (aVarB != null) {
            return aVarB.f74053a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.advert.item.InterfaceC27816b0
    public final void f(@Y61.k String str) {
        d dVar = new d(str);
        Iterator it = this.f71975Z1.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            } else if (((Boolean) dVar.invoke(it.next())).booleanValue()) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 < 0) {
            return;
        }
        TrustFactorsItem trustFactorsItemS3 = ((TrustFactorsItem) this.f71975Z1.get(i12)).S3(null);
        this.f71975Z1.set(i12, trustFactorsItemS3);
        List<? extends TrustFactorsItem> list = this.f71957W4;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (TrustFactorsItem trustFactorsItem : list) {
            if (((Boolean) dVar.invoke(trustFactorsItem)).booleanValue()) {
                trustFactorsItem = trustFactorsItemS3;
            }
            arrayList.add(trustFactorsItem);
        }
        this.f71957W4 = arrayList;
        e(trustFactorsItemS3);
    }

    public final AdvertDetailsDeliverySuggestsItem f0(AdvertDetails advertDetails) {
        return this.f72036i0.a(advertDetails);
    }

    public final AdvertDetailsServicesTransportationGeoItem f1(AdvertDetails advertDetails) {
        return this.f72141x1.a(advertDetails);
    }

    @Override // com.avito.android.advert.item.S
    public final void g(@Y61.l com.avito.android.deeplink_handler.handler.bundle.a aVar, boolean z12) {
        Object next;
        if ((aVar != null ? aVar.f134520a : null) instanceof PpRecallDeeplink) {
            Bundle bundle = aVar.f134522c;
            boolean z13 = bundle != null ? bundle.getBoolean("ppRecallWidgetResultTag", false) : false;
            Iterator it = this.f71975Z1.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((PersistableSpannedItem) next) instanceof AdvertDetailsPpRecallPromoItem) {
                        break;
                    }
                }
            }
            AdvertDetailsPpRecallPromoItem advertDetailsPpRecallPromoItem = (AdvertDetailsPpRecallPromoItem) (next instanceof AdvertDetailsPpRecallPromoItem ? next : null);
            if (advertDetailsPpRecallPromoItem == null) {
                return;
            }
            this.f71975Z1.set(this.f71975Z1.indexOf(advertDetailsPpRecallPromoItem), AdvertDetailsPpRecallPromoItem.a(advertDetailsPpRecallPromoItem, 0, 0L, null, z12, z13, 32767));
            i(this.f71909P5);
        }
    }

    public final DeliveryTrustFactorsItem g0(AdvertDetails advertDetails) {
        C29640d c29640d = this.f72035i;
        c29640d.getClass();
        kotlin.reflect.n<Object> nVar = C29640d.f132175X[33];
        if (((Boolean) c29640d.f132182G.a().invoke()).booleanValue()) {
            return this.f71905P1.a(advertDetails);
        }
        return null;
    }

    public final AdvertDetailsSimilarsButtonItem g1(SimpleAdvertAction simpleAdvertAction) {
        if (simpleAdvertAction == null) {
            return null;
        }
        return new AdvertDetailsSimilarsButtonItem(simpleAdvertAction.getTitle(), simpleAdvertAction.getDeepLink(), false, 0L, null, this.f72000d.a(), null, null, 220, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0679  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x068e  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x06e7  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x06ec  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x071f  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0737  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0743  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x074e  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0752  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x075d  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0761  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x076c  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0770  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x07ad  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x07b8  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0824  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0826  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x082b  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0862  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0869  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0872  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x088a  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x088f  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x08a3  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x08aa  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x08bb  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0912  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ad  */
    @Override // com.avito.android.advert.item.InterfaceC27816b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(@Y61.k com.avito.android.advert_core.advert.AdvertDetailsWithMeta r60) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 4183
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.T.h(com.avito.android.advert_core.advert.AdvertDetailsWithMeta):void");
    }

    public final AdvertDetailsDescriptionItem h0(String str, HtmlCharSequence htmlCharSequence, boolean z12, boolean z13, Integer num) {
        AdvertDetails advertDetails = this.f71951V5;
        boolean z14 = advertDetails != null && advertDetails.isHotel();
        AdvertDetails advertDetails2 = this.f71951V5;
        boolean z15 = advertDetails2 != null && advertDetails2.isGigItem();
        AdvertDetails advertDetails3 = this.f71951V5;
        return this.f72099r0.b(str, htmlCharSequence, z12, z13, z14, z15, num, advertDetails3 != null && advertDetails3.isServicesRedesign());
    }

    public final SparePartsCostItem h1(AdvertDetails advertDetails) {
        SparePartsCost sparePartsCost = advertDetails.getSparePartsCost();
        if (sparePartsCost == null) {
            return null;
        }
        C43617a c43617a = this.f72056l;
        c43617a.getClass();
        kotlin.reflect.n<Object> nVar = C43617a.f413588V[6];
        if (!((Boolean) c43617a.f413616h.a().invoke()).booleanValue()) {
            return null;
        }
        return new SparePartsCostItem(0L, null, this.f72000d.a(), null, null, sparePartsCost, advertDetails.getId(), 27, null);
    }

    public final void i(int i12) {
        I1 i13;
        ArrayList arrayList = this.f71975Z1;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.avito.conveyor_item.a commercialSerpItem = (PersistableSpannedItem) it.next();
            if (commercialSerpItem instanceof AdvertSerpCommercialBanner) {
                commercialSerpItem = ((AdvertSerpCommercialBanner) commercialSerpItem).getCommercialSerpItem();
            }
            arrayList2.add(commercialSerpItem);
        }
        I1 i14 = this.f71968Y1;
        if (i14 != null) {
            i14.A(i12, arrayList2, true);
        }
        AdvertDetailsMultiItemState advertDetailsMultiItemState = this.f72091q;
        if (advertDetailsMultiItemState == null || this.f71923R5) {
            return;
        }
        this.f71923R5 = true;
        Iterator it2 = arrayList2.iterator();
        int i15 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i15 = -1;
                break;
            } else if (((com.avito.android.serp.adapter.i1) it2.next()) instanceof AdvertDetailsMultiItemItem) {
                break;
            } else {
                i15++;
            }
        }
        if (i15 < 0 || (i13 = this.f71968Y1) == null) {
            return;
        }
        AdvertDetailsMultiItemState.ParamsState paramsState = advertDetailsMultiItemState.f85869c;
        i13.O(i15, paramsState != null ? paramsState.f85874b : 0);
    }

    public final DeveloperButtonItem i0(AdvertDetails advertDetails) {
        return this.f71946V0.a(advertDetails);
    }

    public final AdvertDetailsTitleItem i1(String str, AttributedText attributedText, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        return this.f72126v0.a(str, attributedText, z12, z13, z14, z15, z16, z17);
    }

    public final DeveloperTrustItem j0(AdvertDetails advertDetails) {
        return this.f71953W0.a(advertDetails);
    }

    public final AdvertVerificationItem j1(AdvertVerification advertVerification) {
        if (advertVerification == null) {
            return null;
        }
        String descriptionTitle = advertVerification.getDescriptionTitle();
        String description = advertVerification.getDescription();
        AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
        String strValueOf = String.valueOf(74);
        String title = advertVerification.getTitle();
        String subtitle = advertVerification.getSubtitle();
        if (subtitle == null) {
            subtitle = "";
        }
        return new AdvertVerificationItem(0L, null, descriptionTitle, description, new BadgeItem(strValueOf, -1, title, subtitle, UniversalColorKt.universalColorOf$default("green50", 0, 2, null), UniversalColorKt.universalColorOf$default("green50", 0, 2, null), UniversalColorKt.universalColorOf$default(AvitoMapMarkerKt.AMENITY_TYPE_BLACK, 0, 2, null), 1, 1, null, null, false, false, null, 15872, null), this.f72000d.a(), null, null, 195, null);
    }

    @Override // com.avito.android.advert.item.S
    public final void k(@Y61.l I1 i12) {
        this.f71968Y1 = i12;
        C43197r1 c43197r1 = new C43197r1(new X(2, this, T.class, "bindComplementarySection", "bindComplementarySection(Lcom/avito/android/advert/item/similars/ComplementarySection;)V", 4), C43175k.Y(this.f71972Y5, new U(this, null)));
        C43238h c43238h = this.f71965X5;
        C43175k.K(c43197r1, c43238h);
        C43175k.K(new C43197r1(new Y(this, null), this.f71961X1.c()), c43238h);
    }

    public final AdvertDetailsDisclaimerItem k0(AdvertDetails advertDetails) {
        return this.f71834F0.a(advertDetails);
    }

    public final AdvertVideoCallRequestItem k1(AdvertDetails advertDetails) {
        C28131g1.f75660a.getClass();
        return this.f72050k0.a(advertDetails, C28131g1.a(this.f72084p, advertDetails));
    }

    @Override // com.avito.android.advert.item.S
    public final void l(@Y61.k ExpandItemsButtonItem expandItemsButtonItem) {
        int iIndexOf = this.f71975Z1.indexOf(expandItemsButtonItem);
        if (iIndexOf >= 0) {
            this.f71975Z1.remove(iIndexOf);
            i(this.f71909P5);
        }
        for (PersistableSpannedItem persistableSpannedItem : expandItemsButtonItem.f83565i) {
            Iterator it = this.f71975Z1.iterator();
            int i12 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i12 = -1;
                    break;
                } else if (kotlin.jvm.internal.L.f(((PersistableSpannedItem) it.next()).getF273226b(), persistableSpannedItem.getF273226b())) {
                    break;
                } else {
                    i12++;
                }
            }
            if (i12 >= 0) {
                this.f71975Z1.set(i12, persistableSpannedItem);
            }
            I1 i13 = this.f71968Y1;
            if (i13 != null) {
                i13.k0(persistableSpannedItem);
            }
        }
    }

    public final EquipmentsItem l0(AdvertDetails advertDetails) {
        AdvertEquipments equipments;
        AdvertParameters parameters = advertDetails.getParameters();
        if (parameters == null || (equipments = parameters.getEquipments()) == null) {
            return null;
        }
        return new EquipmentsItem(0L, null, equipments, Page.f83476c, advertDetails.getId(), Boolean.valueOf(!advertDetails.isActive()), this.f72000d.a(), null, null, 387, null);
    }

    @Override // com.avito.android.advert.item.S
    public final void m() {
        Object next;
        Iterator it = this.f71975Z1.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((PersistableSpannedItem) next) instanceof AdvertJobSearchStatusItem) {
                    break;
                }
            }
        }
        AdvertJobSearchStatusItem advertJobSearchStatusItem = (AdvertJobSearchStatusItem) (next instanceof AdvertJobSearchStatusItem ? next : null);
        if (advertJobSearchStatusItem == null) {
            return;
        }
        int iIndexOf = this.f71975Z1.indexOf(advertJobSearchStatusItem);
        int i12 = iIndexOf - 1;
        int i13 = iIndexOf + 1;
        if (i13 < this.f71975Z1.size() && i13 >= 0 && (this.f71975Z1.get(i13) instanceof AdvertDetailsGapItem)) {
            this.f71975Z1.remove(i13);
            this.f71975Z1.add(i13, r0(16));
        }
        if (i12 >= 0 && (this.f71975Z1.get(i12) instanceof AdvertDetailsGapItem)) {
            this.f71975Z1.remove(i12);
        }
        this.f71975Z1.remove(advertJobSearchStatusItem);
        i(this.f71909P5);
    }

    public final ExpertBlockItem m0(AdvertDetails advertDetails) {
        if (advertDetails.getComfortableDealExpertBlock() == null) {
            return null;
        }
        return this.f71940U1.a(advertDetails);
    }

    public final void m1() {
        if (this.f71982a2.isEmpty()) {
            return;
        }
        C42745f0.l0(Z.f72291l, this.f71975Z1);
        Iterator it = this.f71982a2.iterator();
        while (it.hasNext()) {
            this.f71975Z1.remove((PersistableSpannedItem) it.next());
        }
        int size = this.f71975Z1.size();
        int i12 = this.f71909P5;
        if (i12 < 0 || i12 >= size) {
            return;
        }
        this.f71975Z1.add(i12, new SimilarsStartMarkerItem(0L, null, 0, 7, null));
    }

    @Override // com.avito.android.advert.item.S
    public final void n(@Y61.l CvState cvState, boolean z12) {
        int iIndexOf;
        Object next;
        Object obj = this.f72032h3;
        if (obj == null) {
            Iterator it = this.f71975Z1.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((PersistableSpannedItem) next) instanceof AdvertCvStateItem) {
                        break;
                    }
                }
            }
            obj = (PersistableSpannedItem) next;
        }
        if (obj == null || !(obj instanceof AdvertCvStateItem) || (iIndexOf = this.f71975Z1.indexOf(obj)) == -1) {
            return;
        }
        if (cvState == null) {
            cvState = ((AdvertCvStateItem) obj).f75056d;
        }
        AdvertCvStateItem advertCvStateItem = new AdvertCvStateItem(0L, null, cvState, z12, this.f72000d.a(), null, null, 99, null);
        this.f72032h3 = advertCvStateItem;
        this.f71975Z1.set(iIndexOf, advertCvStateItem);
        I1 i12 = this.f71968Y1;
        if (i12 != null) {
            i12.i0(advertCvStateItem);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.advert_details_items.flats.AdvertDetailsFlatsItem n0(java.util.List r19, boolean r20, com.avito.android.remote.model.text.AttributedText r21, com.avito.android.remote.model.ExpandItemsButton r22, com.avito.android.advert_core.advert.AdvertDetailsFlatViewType r23, boolean r24) {
        /*
            r18 = this;
            r0 = r18
            com.avito.android.advert.item.similars.j r1 = r0.f72000d
            int r9 = r1.a()
            com.avito.android.remote.model.AdvertDetails r1 = r0.f71951V5
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L16
            boolean r1 = r1.hasModelCardLink()
            if (r1 != r3) goto L16
            r13 = r3
            goto L17
        L16:
            r13 = r2
        L17:
            com.avito.android.remote.model.AdvertDetails r1 = r0.f71951V5
            if (r1 == 0) goto L3e
            boolean r1 = r1.isAutoFlatsRedesign()
            if (r1 != r3) goto L3e
            lD.a r1 = r0.f72056l
            r1.getClass()
            kotlin.reflect.n<java.lang.Object>[] r4 = lD.C43617a.f413588V
            r4 = r4[r3]
            com.avito.android.A0$a r1 = r1.f413611c
            DE0.a r1 = r1.a()
            java.lang.Object r1 = r1.invoke()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L3e
            r14 = r3
            goto L3f
        L3e:
            r14 = r2
        L3f:
            r15 = 0
            r16 = 0
            com.avito.android.advert.item.blocks.items_factories.w1 r2 = r0.f72106s0
            r10 = 0
            r11 = 0
            r12 = 0
            r17 = 12544(0x3100, float:1.7578E-41)
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r24
            com.avito.android.advert.item.blocks.items_factories.w1$a r1 = com.avito.android.advert.item.blocks.items_factories.C28070w1.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            if (r1 == 0) goto L6c
            com.avito.android.advert_core.expand_items_button.ExpandItemsButtonItem r2 = r1.f74054b
            if (r2 == 0) goto L6c
            java.util.LinkedHashMap r3 = r0.f71989b2
            com.avito.android.advert_details_items.flats.AdvertDetailsFlatsItem r4 = r1.f74053a
            long r4 = r4.f84654b
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r3.put(r4, r2)
        L6c:
            if (r1 == 0) goto L71
            com.avito.android.advert_details_items.flats.AdvertDetailsFlatsItem r1 = r1.f74053a
            goto L72
        L71:
            r1 = 0
        L72:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.T.n0(java.util.List, boolean, com.avito.android.remote.model.text.AttributedText, com.avito.android.remote.model.ExpandItemsButton, com.avito.android.advert_core.advert.AdvertDetailsFlatViewType, boolean):com.avito.android.advert_details_items.flats.AdvertDetailsFlatsItem");
    }

    /* JADX WARN: Removed duplicated region for block: B:845:0x09f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n1(com.avito.android.advert_core.advert.AdvertDetailsWithMeta r28) {
        /*
            Method dump skipped, instructions count: 7104
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.T.n1(com.avito.android.advert_core.advert.AdvertDetailsWithMeta):void");
    }

    @Override // com.avito.android.advert.item.S
    public final void o(@Y61.k kotlin.ranges.l lVar) {
        Set setP0;
        if (this.f71895N5) {
            return;
        }
        kotlin.ranges.l lVar2 = this.f71874K5;
        if ((lVar2 == null || (setP0 = C42745f0.P0(lVar2)) == null) ? false : !C42745f0.M(setP0, C42745f0.P0(lVar)).isEmpty()) {
            this.f71895N5 = true;
            com.avito.android.deeplink_handler.handler.composite.b.a(this.f72028h, this.f71867J5);
        }
    }

    public final PersistableSpannedItem o1(Y41.a<? extends PersistableSpannedItem> aVar) {
        Object next;
        Iterator it = this.f71975Z1.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((PersistableSpannedItem) next) instanceof PriceHistoryItem) {
                break;
            }
        }
        PersistableSpannedItem persistableSpannedItem = (PersistableSpannedItem) next;
        return persistableSpannedItem == null ? (PersistableSpannedItem) ((f) aVar).invoke() : persistableSpannedItem;
    }

    @Override // com.avito.android.advert.item.S
    public final void p() {
        I1 i12;
        kotlin.ranges.l lVar;
        Set setP0;
        AdvertDetails advertDetails = this.f71951V5;
        if (advertDetails == null || (i12 = this.f71968Y1) == null) {
            return;
        }
        GridLayoutManager gridLayoutManager = i12.f71676S0;
        Set setP02 = C42745f0.P0(new kotlin.ranges.l(gridLayoutManager.H1(), gridLayoutManager.L1(), 1));
        if (setP02 == null || (lVar = this.f71874K5) == null || (setP0 = C42745f0.P0(lVar)) == null || C42745f0.M(setP02, setP0).isEmpty()) {
            return;
        }
        this.f72021g.R2(advertDetails.getId());
    }

    public final ArrayList p0(AdvertDetails advertDetails, AdvertParameters advertParameters, boolean z12, boolean z13) {
        if (advertDetails.isGigItem()) {
            return null;
        }
        List<C28070w1.a> listB = this.f72106s0.b(advertDetails, advertParameters, z13, z12, this.f72000d.a(), true);
        ArrayList arrayList = new ArrayList(C42745f0.q(listB, 10));
        for (C28070w1.a aVar : listB) {
            ExpandItemsButtonItem expandItemsButtonItem = aVar.f74054b;
            AdvertDetailsFlatsItem advertDetailsFlatsItem = aVar.f74053a;
            if (expandItemsButtonItem != null) {
                this.f71989b2.put(Long.valueOf(advertDetailsFlatsItem.f84654b), expandItemsButtonItem);
            }
            arrayList.add(advertDetailsFlatsItem);
        }
        return arrayList;
    }

    public final PersistableSpannedItem p1(Y41.a<? extends PersistableSpannedItem> aVar) {
        Object obj;
        Object next;
        Iterator it = this.f71975Z1.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((PersistableSpannedItem) next) instanceof AdvertDetailsPriceItem) {
                break;
            }
        }
        PersistableSpannedItem persistableSpannedItem = (PersistableSpannedItem) next;
        if (persistableSpannedItem != null) {
            return persistableSpannedItem;
        }
        Iterator it2 = this.f71975Z1.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (((PersistableSpannedItem) next2) instanceof PriceWithDiscountItem) {
                obj = next2;
                break;
            }
        }
        PersistableSpannedItem persistableSpannedItem2 = (PersistableSpannedItem) obj;
        return persistableSpannedItem2 != null ? persistableSpannedItem2 : (PersistableSpannedItem) ((e) aVar).invoke();
    }

    @Override // com.avito.android.advert.item.S
    public final void q(@Y61.k AdvertDetailsFastOpenParams advertDetailsFastOpenParams) {
        ArrayList arrayList = new ArrayList();
        if (advertDetailsFastOpenParams.f71329f != null && !C42745f0.r(C28093c0.f74233a, advertDetailsFastOpenParams.f71330g)) {
            if (!kotlin.jvm.internal.L.f(advertDetailsFastOpenParams.f71331h, Boolean.FALSE)) {
                AdvertDetailsGalleryItem advertDetailsGalleryItemA = this.f71973Z.a(advertDetailsFastOpenParams.f71333j, this.f71986b);
                if (advertDetailsGalleryItemA == null) {
                    advertDetailsGalleryItemA = null;
                }
                if (advertDetailsGalleryItemA != null) {
                    arrayList.add(advertDetailsGalleryItemA);
                }
            }
        }
        arrayList.add(r0(16));
        String str = advertDetailsFastOpenParams.f71325b;
        arrayList.add(this.f72126v0.a(str == null ? "" : str, null, false, false, false, false, false, false));
        String str2 = advertDetailsFastOpenParams.f71326c;
        if (str2 != null) {
            String str3 = advertDetailsFastOpenParams.f71327d;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = advertDetailsFastOpenParams.f71328e;
            AdvertDetailsPriceItem advertDetailsPriceItemB = this.f72140x0.b(str2, str3, str4 != null ? str4 : "");
            if (advertDetailsPriceItemB != null) {
                arrayList.add(advertDetailsPriceItemB);
            }
        }
        arrayList.add(new AdvertDetailsSkeletonItem(0L, null, this.f72000d.a(), null, null, 27, null));
        I1 i12 = this.f71968Y1;
        if (i12 != null) {
            i12.A(-1, arrayList, true);
        }
    }

    public final AdvertDetailsFmpCalculatorItem q0(AdvertDetails advertDetails) {
        return this.f71814C1.a(advertDetails);
    }

    @Override // com.avito.android.advert.item.S
    public final void r() {
        AdvertActions contacts;
        List<AdvertAction> actions;
        DeepLink deepLink;
        Object next;
        Object obj = this.f71804A5;
        Object obj2 = null;
        if (obj == null) {
            Iterator it = this.f71975Z1.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((PersistableSpannedItem) next) instanceof AdvertVideoCallRequestItem) {
                        break;
                    }
                }
            }
            obj = (PersistableSpannedItem) next;
            if (obj == null) {
                return;
            }
        }
        AdvertDetails advertDetails = this.f71951V5;
        if (advertDetails == null || (contacts = advertDetails.getContacts()) == null || (actions = contacts.getActions()) == null) {
            return;
        }
        Iterator<T> it2 = actions.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (((AdvertAction) next2) instanceof AdvertAction.Messenger) {
                obj2 = next2;
                break;
            }
        }
        AdvertAction advertAction = (AdvertAction) obj2;
        if (advertAction == null || (deepLink = advertAction.getDeepLink()) == null) {
            return;
        }
        AdvertVideoCallRequestItem.Type type = AdvertVideoCallRequestItem.Type.f80683b;
        AdvertVideoCallRequestItem advertVideoCallRequestItemA = AdvertVideoCallRequestItem.a((AdvertVideoCallRequestItem) obj, 0, deepLink, 103);
        int iIndexOf = this.f71975Z1.indexOf(obj);
        if (iIndexOf == -1) {
            return;
        }
        this.f71804A5 = advertVideoCallRequestItemA;
        this.f71975Z1.set(iIndexOf, advertVideoCallRequestItemA);
        I1 i12 = this.f71968Y1;
        if (i12 != null) {
            i12.i0(advertVideoCallRequestItemA);
        }
    }

    public final AdvertDetailsGapItem r0(int i12) {
        AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
        return new AdvertDetailsGapItem(52, null, i12, this.f72000d.a(), null, null, 50, null);
    }

    @Override // com.avito.android.advert.item.S
    public final void s(@Y61.k String str) {
        AdvertDetails advertDetails = this.f71951V5;
        if (advertDetails != null) {
            AdvertDetailsSimilarShiftsItem advertDetailsSimilarShiftsItemA = this.f71870K1.a(advertDetails, this.f72117t5, (52 & 4) != 0 ? null : str, (52 & 8) != 0 ? null : null, false, false);
            this.f72117t5 = advertDetailsSimilarShiftsItemA;
            PersistableSpannedItem persistableSpannedItemC = this.f71870K1.c(advertDetailsSimilarShiftsItemA);
            if (persistableSpannedItemC == null) {
                persistableSpannedItemC = this.f72151y4;
            }
            this.f72151y4 = persistableSpannedItemC;
            this.f71997c3 = c0(advertDetails);
            D();
            i(0);
        }
    }

    public final List<AdvertDetailsGeoReferenceItem> s0(AdvertDetails advertDetails) {
        RichGeoBlock richGeoBlock = advertDetails.getRichGeoBlock();
        if (O2.a(richGeoBlock != null ? richGeoBlock.getGeoReferenceList() : null)) {
            return C42784z0.f406748b;
        }
        List<PersistableSpannedItem> listA = this.f71868K.a(advertDetails);
        ArrayList arrayList = new ArrayList();
        for (PersistableSpannedItem persistableSpannedItem : listA) {
            AdvertDetailsGeoReferenceItem advertDetailsGeoReferenceItem = persistableSpannedItem instanceof AdvertDetailsGeoReferenceItem ? (AdvertDetailsGeoReferenceItem) persistableSpannedItem : null;
            if (advertDetailsGeoReferenceItem != null) {
                arrayList.add(advertDetailsGeoReferenceItem);
            }
        }
        return arrayList;
    }

    @Override // com.avito.android.advert.item.S
    public final void t(boolean z12) {
        Object next;
        this.f71888M5 = z12;
        Iterator it = this.f71975Z1.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((PersistableSpannedItem) next) instanceof AdvertDetailsRatingLLMSummaryItem) {
                    break;
                }
            }
        }
        AdvertDetailsRatingLLMSummaryItem advertDetailsRatingLLMSummaryItem = (AdvertDetailsRatingLLMSummaryItem) (next instanceof AdvertDetailsRatingLLMSummaryItem ? next : null);
        if (advertDetailsRatingLLMSummaryItem == null) {
            return;
        }
        advertDetailsRatingLLMSummaryItem.f78652m = !z12;
        e(advertDetailsRatingLLMSummaryItem);
    }

    public final AdvertDetailsGroupsItem t0(List<AdvertParameters.Group> list) {
        List<AdvertParameters.Group> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        return new AdvertDetailsGroupsItem(0L, null, list, this.f72000d.a(), null, null, 51, null);
    }

    @Override // com.avito.android.advert.item.S
    public final void u() {
        int iD2 = D();
        this.f71909P5 = iD2;
        i(iD2);
    }

    public final AdvertDetailsReviewsScoreItem u0(AdvertDetails advertDetails) {
        ItemReviews itemReviews = advertDetails.getItemReviews();
        AdvertDetailsReviewsScoreItem advertDetailsReviewsScoreItemA = this.f71798A.a(itemReviews != null ? itemReviews.getHeader() : null);
        if (advertDetailsReviewsScoreItemA != null) {
            return advertDetailsReviewsScoreItemA;
        }
        return null;
    }

    @Override // com.avito.android.advert.item.S
    public final void v() {
        Object next;
        this.f72139x.b();
        Iterator it = this.f71975Z1.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((PersistableSpannedItem) next) instanceof RealtyQuizBannerItem) {
                    break;
                }
            }
        }
        RealtyQuizBannerItem realtyQuizBannerItem = (RealtyQuizBannerItem) (next instanceof RealtyQuizBannerItem ? next : null);
        if (realtyQuizBannerItem == null) {
            return;
        }
        int iIndexOf = this.f71975Z1.indexOf(realtyQuizBannerItem) - 1;
        if (iIndexOf >= 0 && (this.f71975Z1.get(iIndexOf) instanceof AdvertDetailsGapItem)) {
            this.f71975Z1.remove(iIndexOf);
        }
        this.f71975Z1.remove(realtyQuizBannerItem);
        i(this.f71909P5);
    }

    public final StyledTitleItem v0(AdvertDetails advertDetails) {
        if (!advertDetails.isHotel()) {
            return null;
        }
        if (advertDetails.getGeoReferences() == null && (advertDetails.getCoordinates().isEmpty() || advertDetails.getAddress().length() == 0)) {
            return null;
        }
        String strO = this.f72007e.o();
        AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
        return new StyledTitleItem(strO, R.style.Re23_Text_H25, "ITEM_HOTEL_LOCATION_TITLE", 176, this.f72000d.a(), null, null, 96, null);
    }

    @Override // com.avito.android.advert.item.S
    public final void w() {
        Object next;
        Iterator it = this.f71975Z1.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((PersistableSpannedItem) next) instanceof AdvertCvPhoneActualizationItem) {
                    break;
                }
            }
        }
        AdvertCvPhoneActualizationItem advertCvPhoneActualizationItem = (AdvertCvPhoneActualizationItem) (next instanceof AdvertCvPhoneActualizationItem ? next : null);
        if (advertCvPhoneActualizationItem == null) {
            return;
        }
        int iIndexOf = this.f71975Z1.indexOf(advertCvPhoneActualizationItem) - 1;
        if (iIndexOf >= 0 && (this.f71975Z1.get(iIndexOf) instanceof AdvertDetailsGapItem)) {
            this.f71975Z1.remove(iIndexOf);
        }
        this.f71975Z1.remove(advertCvPhoneActualizationItem);
        i(this.f71909P5);
    }

    public final AdvertDetailsShowOnMapItem w0(AdvertDetails advertDetails) {
        return this.f71896O.a(advertDetails);
    }

    @Override // com.avito.android.advert.item.S
    public final void x() {
        Object next;
        Iterator it = this.f71975Z1.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((PersistableSpannedItem) next) instanceof OwnershipCostItem) {
                    break;
                }
            }
        }
        OwnershipCostItem ownershipCostItem = (OwnershipCostItem) (next instanceof OwnershipCostItem ? next : null);
        if (ownershipCostItem == null) {
            return;
        }
        this.f71975Z1.remove(ownershipCostItem);
        i(this.f71909P5);
    }

    public final IceBreakersItem x0(AdvertDetails advertDetails) {
        return this.f71806B0.a(advertDetails);
    }

    @Override // com.avito.android.advert.item.S
    public final void y() {
        Object next;
        Iterator it = this.f71975Z1.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((PersistableSpannedItem) next) instanceof OwnershipCostItem) {
                    break;
                }
            }
        }
        OwnershipCostItem ownershipCostItem = (OwnershipCostItem) (next instanceof OwnershipCostItem ? next : null);
        if (ownershipCostItem == null) {
            return;
        }
        ownershipCostItem.f77955i = true;
        e(ownershipCostItem);
    }

    public final IcebreakersRedesignItem y0(AdvertDetails advertDetails) {
        return this.f71813C0.a(advertDetails);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: SimplifyVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v1 int, still in use, count: 2, list:
          (r1v1 int) from 0x0069: INVOKE 
          (wrap:java.util.ArrayList:0x0065: IGET (r18v0 'this' com.avito.android.advert.item.T A[IMMUTABLE_TYPE, THIS]) A[WRAPPED] (LINE:102) com.avito.android.advert.item.T.Z1 java.util.ArrayList)
          (r1v1 int)
          (r15v0 com.avito.android.advert.item.salary_range.AdvertSalaryRangeItem)
         VIRTUAL call: java.util.ArrayList.add(int, java.lang.Object):void A[MD:(int, E):void (c)] (LINE:106)
          (r1v1 int) from 0x0070: INVOKE 
          (r2v3 com.avito.android.advert.item.I1)
          (r15v0 com.avito.android.advert.item.salary_range.AdvertSalaryRangeItem)
          (r1v1 int)
         VIRTUAL call: com.avito.android.advert.item.I1.F(com.avito.android.advert_core.advert.BlockItem, int):void A[MD:(com.avito.android.advert_core.advert.BlockItem, int):void (m)] (LINE:113)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.unbindArgUsage(InsnRemover.java:174)
        	at jadx.core.utils.InsnRemover.unbindAllArgs(InsnRemover.java:106)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:90)
        	at jadx.core.utils.InsnRemover.unbindArgUsage(InsnRemover.java:174)
        	at jadx.core.dex.instructions.args.InsnArg.wrapInstruction(InsnArg.java:141)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyArgs(SimplifyVisitor.java:116)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyInsn(SimplifyVisitor.java:132)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyBlock(SimplifyVisitor.java:86)
        	at jadx.core.dex.visitors.SimplifyVisitor.visit(SimplifyVisitor.java:71)
        */
    @Override // com.avito.android.advert.item.S
    public final void z(@Y61.k da.C39687a r19) {
        /*
            r18 = this;
            r0 = r18
            java.util.ArrayList r1 = r0.f71975Z1
            com.avito.android.advert_details_items.description.AdvertDetailsDescriptionItem r2 = r0.f72053k3
            if (r2 != 0) goto L9
            return
        L9:
            int r1 = r1.indexOf(r2)
            int r2 = r1 + (-1)
            if (r2 >= 0) goto L12
            return
        L12:
            com.avito.android.advert.item.salary_range.AdvertSalaryRangeItem r15 = new com.avito.android.advert.item.salary_range.AdvertSalaryRangeItem
            com.avito.android.advert.item.similars.j r3 = r0.f72000d
            int r4 = r3.a()
            java.lang.String r6 = r19.getTitle()
            if (r6 != 0) goto L21
            return
        L21:
            java.lang.String r7 = r19.getDescription()
            if (r7 != 0) goto L28
            return
        L28:
            java.lang.Long r3 = r19.getRangeFrom()
            if (r3 == 0) goto L73
            long r8 = r3.longValue()
            java.lang.Long r3 = r19.getRangeTo()
            if (r3 == 0) goto L73
            long r10 = r3.longValue()
            java.lang.Long r12 = r19.getSalaryFrom()
            java.lang.Long r13 = r19.getSalaryTo()
            r16 = 0
            r5 = 0
            r14 = 2
            r3 = r15
            r17 = r1
            r1 = r15
            r15 = r16
            r3.<init>(r4, r5, r6, r7, r8, r10, r12, r13, r14, r15)
            r0.f71964X4 = r1
            r3 = 16
            com.avito.android.advert_core.gap.AdvertDetailsGapItem r3 = r0.r0(r3)
            java.util.ArrayList r4 = r0.f71975Z1
            r4.add(r2, r3)
            com.avito.android.advert.item.I1 r4 = r0.f71968Y1
            if (r4 == 0) goto L65
            r4.F(r3, r2)
        L65:
            java.util.ArrayList r2 = r0.f71975Z1
            r3 = r17
            r2.add(r3, r1)
            com.avito.android.advert.item.I1 r2 = r0.f71968Y1
            if (r2 == 0) goto L73
            r2.F(r1, r3)
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.T.z(da.a):void");
    }

    public final ImvCarsV4Item z0(AdvertDetails advertDetails) {
        PriceRanges priceRanges;
        List<Range> ranges;
        CarMarketPrice carMarketPrice = advertDetails.getCarMarketPrice();
        if (carMarketPrice == null || (priceRanges = carMarketPrice.getPriceRanges()) == null || (ranges = priceRanges.getRanges()) == null || ranges.isEmpty()) {
            return null;
        }
        return new ImvCarsV4Item(0L, null, new ImvCarsData(priceRanges.getTitle(), priceRanges.getDisclaimer(), priceRanges.getSubtitle(), priceRanges.getDetails()), priceRanges.getRanges(), this.f71986b, this.f72000d.a(), null, null, 195, null);
    }
}
