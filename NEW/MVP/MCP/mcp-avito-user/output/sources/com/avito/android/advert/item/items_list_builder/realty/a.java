package com.avito.android.advert.item.items_list_builder.realty;

import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.Z0;
import com.avito.android.advert.InterfaceC28240u;
import com.avito.android.advert.item.I1;
import com.avito.android.advert.item.abuse.AdvertDetailsAbuseItem;
import com.avito.android.advert.item.additionalSeller.AdditionalSellerButtonItem;
import com.avito.android.advert.item.additionalSeller.AdditionalSellerFeaturesItem;
import com.avito.android.advert.item.additionalSeller.title_item.AdditionalSellerTitleItem;
import com.avito.android.advert.item.address_centrity.AddressCentrityBlockItem;
import com.avito.android.advert.item.adress_hint.AddressHint;
import com.avito.android.advert.item.advert_badge_bar_light.AdvertDetailsBadgeBarLightItem;
import com.avito.android.advert.item.advertnumber.AdvertDetailsAdvertNumberItem;
import com.avito.android.advert.item.amenities.AdvertDetailsAmenitiesItem;
import com.avito.android.advert.item.anchor_trust_factors.AdvertDetailsAnchorTrustFactorsItem;
import com.avito.android.advert.item.b2c.AdvertDetailsB2CBottomItem;
import com.avito.android.advert.item.blocks.items_factories.P0;
import com.avito.android.advert.item.chat_history.ChatHistoryItem;
import com.avito.android.advert.item.comfortable_deal.ExpertBlockItem;
import com.avito.android.advert.item.consultation.ConsultationAfterIceBreakersItem;
import com.avito.android.advert.item.consultation.ConsultationButtonItem;
import com.avito.android.advert.item.consultation.dynamic_content.DynamicConsultationAfterIceBreakersItem;
import com.avito.android.advert.item.consultation.secondary.SecondaryConsultationItem;
import com.avito.android.advert.item.contactbar.AdvertDetailsContactBarItem;
import com.avito.android.advert.item.creditinfo.buzzoola.BuzzoolaCreditBannerItem;
import com.avito.android.advert.item.description_header.AdvertDetailsDescriptionHeaderItem;
import com.avito.android.advert.item.developer.button.DeveloperButtonItem;
import com.avito.android.advert.item.developer.trust.DeveloperTrustItem;
import com.avito.android.advert.item.disclaimer.AdvertDetailsDisclaimerItem;
import com.avito.android.advert.item.disclaimer_pd.DisclaimerPDItem;
import com.avito.android.advert.item.domoteka.conveyor.AdvertDetailsDomotekaTeaserItem;
import com.avito.android.advert.item.early_access_fakedoor.konveyor.EarlyAccessAdvertItem;
import com.avito.android.advert.item.fmp.banner.AdvertDetailsFmpBannerItem;
import com.avito.android.advert.item.fmp.calculator.AdvertDetailsFmpCalculatorItem;
import com.avito.android.advert.item.fmp.offer.AdvertDetailsFmpOfferItem;
import com.avito.android.advert.item.fmp.products.AdvertDetailsFmpProductsItem;
import com.avito.android.advert.item.geo_distance.AdvertDetailsAddressGeoDistanceItem;
import com.avito.android.advert.item.groups.AdvertDetailsGroupsItem;
import com.avito.android.advert.item.hotel.hotel_promo_widget.AdvertHotelPromoWidgetItem;
import com.avito.android.advert.item.icebreakers.IceBreakersItem;
import com.avito.android.advert.item.installments.InstallmentsBlockItem;
import com.avito.android.advert.item.marketplace_sales_advert_promo_banner.MarketplaceSalesAdvertPromoBannerItem;
import com.avito.android.advert.item.mortgage_calculator.MortgageCalculatorItem;
import com.avito.android.advert.item.mortgage_snippet.MortgageSnippetItem;
import com.avito.android.advert.item.note.AdvertDetailsNoteItem;
import com.avito.android.advert.item.price_comparison.PriceComparisonItem;
import com.avito.android.advert.item.privacyDisclaimer.AdvertDetailsPrivacyDisclaimerItem;
import com.avito.android.advert.item.rating_publish.AdvertDetailsRatingPublishItem;
import com.avito.android.advert.item.realty_imv.RealtyImvItem;
import com.avito.android.advert.item.realty_usp.RealtyUspItem;
import com.avito.android.advert.item.recall_me.RecallMeBlockItem;
import com.avito.android.advert.item.rent_agreement.RentAgreementItem;
import com.avito.android.advert.item.reviews.AdvertDetailsReviewsScoreItem;
import com.avito.android.advert.item.safedeal.trust_factors.TrustFactorsItem;
import com.avito.android.advert.item.scroll_up.AdvertDetailsScrollUpItem;
import com.avito.android.advert.item.sellersubscription.AdvertDetailsSellerSubscriptionItem;
import com.avito.android.advert.item.short_term_rent.item_discount.AdvertDetailsShortTermRentItemDiscountItem;
import com.avito.android.advert.item.short_term_rent.payment_toggles.AdvertDetailsTravelPaymentTogglesItem;
import com.avito.android.advert.item.short_term_rent.str_buttons.AdvertDetailsShortTermRentStrButtonsItem;
import com.avito.android.advert.item.show_on_map.AdvertDetailsShowOnMapItem;
import com.avito.android.advert.item.similars_button.AdvertDetailsSimilarsButtonItem;
import com.avito.android.advert.item.travel.price.AdvertDetailsTravelPriceItem;
import com.avito.android.advert.item.travel.trust.AdvertDetailsTravelTrustItem;
import com.avito.android.advert.item.video_call_request.AdvertVideoCallRequestItem;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert_badge_bar.AdvertBadgeBarItem;
import com.avito.android.advert_core.comfortable_deal_promo.AdvertDetailsComfortableDealPromoItem;
import com.avito.android.advert_core.development_offers.DevelopmentOffersItem;
import com.avito.android.advert_core.divider.AdvertDetailsDividerItem;
import com.avito.android.advert_core.domoteka_report_teaser.AdvertDetailsDomotekaReportTeaserItem;
import com.avito.android.advert_core.expand_items_button.ExpandItemsButtonItem;
import com.avito.android.advert_core.gap.AdvertDetailsGapItem;
import com.avito.android.advert_core.information_about.InformationAboutItem;
import com.avito.android.advert_core.offers.OffersItem;
import com.avito.android.advert_core.pp_recall_promo.AdvertDetailsPpRecallPromoItem;
import com.avito.android.advert_core.price_list.preview.AdvertPriceListPreviewItem;
import com.avito.android.advert_details_items.address.AdvertDetailsAddressItem;
import com.avito.android.advert_details_items.carousel_photogallery.CarouselPhotoGalleryItem;
import com.avito.android.advert_details_items.description.AdvertDetailsDescriptionItem;
import com.avito.android.advert_details_items.flats.AdvertDetailsFlatsItem;
import com.avito.android.advert_details_items.geo_market_report.AdvertDetailsGeoMarketReportItem;
import com.avito.android.advert_details_items.geo_zones.AdvertDetailsGeoZonesItem;
import com.avito.android.advert_details_items.georeference.AdvertDetailsGeoReferenceItem;
import com.avito.android.advert_details_items.neighboring_dates.AdvertDetailsNeighboringDatesItem;
import com.avito.android.advert_details_items.optimal_price.AdvertDetailsOptimalPriceItem;
import com.avito.android.advert_details_items.photogallery.AdvertDetailsGalleryItem;
import com.avito.android.advert_details_items.search_suggests.AdvertDetailsSearchSuggestsItem;
import com.avito.android.advert_details_items.sellerprofile.AdvertDetailsSellerProfileItem;
import com.avito.android.advert_details_items.show_description_button.AdvertDetailsShowDescriptionItem;
import com.avito.android.advert_details_items.title.AdvertDetailsTitleItem;
import com.avito.android.analytics_ratings_reviews.ReviewsOpenPageFrom;
import com.avito.android.credits.CreditCalculatorItem;
import com.avito.android.credits.broker_link.CreditBrokerLinkItem;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.AdvertParameters;
import com.avito.android.remote.model.Developer;
import com.avito.android.remote.model.OffersPosition;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.remote.model.advert_details.reviews.ItemReviewsHeader;
import com.avito.android.remote.model.item_reviews.ItemReviews;
import com.avito.android.remote.model.item_reviews.ItemReviewsMain;
import com.avito.android.remote.model.text.AttributedText;
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
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;

/* compiled from: RealtyItemListBuilder.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/items_list_builder/realty/a;", "Lcom/avito/android/advert/item/items_list_builder/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements com.avito.android.advert.item.items_list_builder.c {

    /* renamed from: A, reason: collision with root package name */
    @Y61.l
    public final PersistableSpannedItem f76828A;

    /* renamed from: A0, reason: collision with root package name */
    @Y61.l
    public final AdvertDetailsRatingPublishItem f76829A0;

    /* renamed from: B, reason: collision with root package name */
    @Y61.l
    public final AdvertDetailsB2CBottomItem f76830B;

    /* renamed from: B0, reason: collision with root package name */
    @Y61.l
    public final InformationAboutItem f76831B0;

    /* renamed from: C, reason: collision with root package name */
    @Y61.l
    public final AdvertBadgeBarItem f76832C;

    /* renamed from: C0, reason: collision with root package name */
    @Y61.l
    public final RealtyImvItem f76833C0;

    /* renamed from: D, reason: collision with root package name */
    @Y61.l
    public final AdvertDetailsBadgeBarLightItem f76834D;

    /* renamed from: D0, reason: collision with root package name */
    @Y61.l
    public final RealtyUspItem f76835D0;

    /* renamed from: E, reason: collision with root package name */
    @Y61.l
    public final PersistableSpannedItem f76836E;

    /* renamed from: E0, reason: collision with root package name */
    @Y61.l
    public final RecallMeBlockItem f76837E0;

    /* renamed from: F, reason: collision with root package name */
    @Y61.l
    public final BuzzoolaCreditBannerItem f76838F;

    /* renamed from: F0, reason: collision with root package name */
    @Y61.l
    public final RentAgreementItem f76839F0;

    /* renamed from: G, reason: collision with root package name */
    @Y61.l
    public final ChatHistoryItem f76840G;

    /* renamed from: G0, reason: collision with root package name */
    @Y61.l
    public final AdvertDetailsFlatsItem f76841G0;

    /* renamed from: H, reason: collision with root package name */
    @Y61.l
    public final AdvertDetailsFlatsItem f76842H;

    /* renamed from: H0, reason: collision with root package name */
    @Y61.l
    public final AdvertDetailsRepairCalculatorItem f76843H0;

    /* renamed from: I, reason: collision with root package name */
    @Y61.l
    public final ConsultationAfterIceBreakersItem f76844I;

    /* renamed from: I0, reason: collision with root package name */
    @Y61.k
    public final List<TrustFactorsItem> f76845I0;

    /* renamed from: J, reason: collision with root package name */
    @Y61.l
    public final ConsultationButtonItem f76846J;

    /* renamed from: J0, reason: collision with root package name */
    @Y61.l
    public final AdvertDetailsScrollUpItem f76847J0;

    /* renamed from: K, reason: collision with root package name */
    @Y61.l
    public final AdvertDetailsContactBarItem f76848K;

    /* renamed from: K0, reason: collision with root package name */
    @Y61.l
    public final AdvertDetailsSearchSuggestsItem f76849K0;

    /* renamed from: L, reason: collision with root package name */
    @Y61.l
    public final InstallmentsBlockItem f76850L;

    /* renamed from: L0, reason: collision with root package name */
    @Y61.l
    public final SecondaryConsultationItem f76851L0;

    /* renamed from: M, reason: collision with root package name */
    @Y61.l
    public final CreditCalculatorItem f76852M;

    /* renamed from: M0, reason: collision with root package name */
    @Y61.l
    public final AdvertDetailsSellerProfileItem f76853M0;

    /* renamed from: N, reason: collision with root package name */
    @Y61.l
    public final CreditBrokerLinkItem f76854N;

    /* renamed from: N0, reason: collision with root package name */
    @Y61.l
    public final AdvertDetailsSellerSubscriptionItem f76855N0;

    /* renamed from: O, reason: collision with root package name */
    @Y61.l
    public final AdvertDetailsDescriptionItem f76856O;

    /* renamed from: O0, reason: collision with root package name */
    @Y61.l
    public final AdvertDetailsShortTermRentItemDiscountItem f76857O0;

    /* renamed from: P, reason: collision with root package name */
    @Y61.l
    public final DeveloperButtonItem f76858P;

    /* renamed from: P0, reason: collision with root package name */
    @Y61.l
    public final AdvertDetailsTravelPaymentTogglesItem f76859P0;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.l
    public final AdvertDetailsFlatsItem f76860Q;

    /* renamed from: Q0, reason: collision with root package name */
    @Y61.l
    public final AdvertDetailsTravelPriceItem f76861Q0;

    /* renamed from: R, reason: collision with root package name */
    @Y61.l
    public final DeveloperTrustItem f76862R;

    /* renamed from: R0, reason: collision with root package name */
    @Y61.l
    public final AdvertDetailsShortTermRentStrButtonsItem f76863R0;

    /* renamed from: S, reason: collision with root package name */
    @Y61.l
    public final DevelopmentOffersItem f76864S;

    /* renamed from: S0, reason: collision with root package name */
    @Y61.l
    public final AdvertDetailsShowDescriptionItem f76865S0;

    /* renamed from: T, reason: collision with root package name */
    @Y61.l
    public final AdvertDetailsDisclaimerItem f76866T;

    /* renamed from: T0, reason: collision with root package name */
    @Y61.l
    public final AdvertDetailsShowOnMapItem f76867T0;

    /* renamed from: U, reason: collision with root package name */
    @Y61.l
    public final DisclaimerPDItem f76868U;

    /* renamed from: U0, reason: collision with root package name */
    @Y61.l
    public final AdvertDetailsSimilarsButtonItem f76869U0;

    /* renamed from: V, reason: collision with root package name */
    @Y61.l
    public final AdvertDetailsDomotekaReportTeaserItem f76870V;

    /* renamed from: V0, reason: collision with root package name */
    @Y61.l
    public final AdvertDetailsTitleItem f76871V0;

    /* renamed from: W, reason: collision with root package name */
    @Y61.l
    public final AdvertDetailsDomotekaTeaserItem f76872W;

    /* renamed from: W0, reason: collision with root package name */
    @Y61.l
    public final AdvertVideoCallRequestItem f76873W0;

    /* renamed from: X, reason: collision with root package name */
    @Y61.l
    public final DynamicConsultationAfterIceBreakersItem f76874X;

    /* renamed from: X0, reason: collision with root package name */
    @Y61.l
    public final AdvertDetailsNeighboringDatesItem f76875X0;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.l
    public final EarlyAccessAdvertItem f76876Y;

    /* renamed from: Y0, reason: collision with root package name */
    @Y61.l
    public final AdvertDetailsTravelTrustItem f76877Y0;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.l
    public final ExpertBlockItem f76878Z;

    /* renamed from: Z0, reason: collision with root package name */
    @Y61.l
    public final AdvertDetailsOptimalPriceItem f76879Z0;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.l
    public final List<AdvertDetailsFlatsItem> f76880a0;

    /* renamed from: a1, reason: collision with root package name */
    @Y61.l
    public final MarketplaceSalesAdvertPromoBannerItem f76881a1;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final AdvertDetails f76882b;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.l
    public final AdvertDetailsFmpBannerItem f76883b0;

    /* renamed from: b1, reason: collision with root package name */
    @Y61.l
    public final AdvertDetailsAnchorTrustFactorsItem f76884b1;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f76885c;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.l
    public final AdvertDetailsFmpCalculatorItem f76886c0;

    /* renamed from: c1, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.bottom_gap.d f76887c1;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_core.analytics.a f76888d;

    /* renamed from: d0, reason: collision with root package name */
    @Y61.l
    public final AdvertDetailsFmpOfferItem f76889d0;

    /* renamed from: d1, reason: collision with root package name */
    @Y61.k
    public List<PersistableSpannedItem> f76890d1 = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final P0 f76891e;

    /* renamed from: e0, reason: collision with root package name */
    @Y61.l
    public final AdvertDetailsFmpProductsItem f76892e0;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f76893f;

    /* renamed from: f0, reason: collision with root package name */
    @Y61.l
    public final CarouselPhotoGalleryItem f76894f0;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final List<PersistableSpannedItem> f76895g;

    /* renamed from: g0, reason: collision with root package name */
    @Y61.l
    public final AdvertDetailsGalleryItem f76896g0;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Z0 f76897h;

    /* renamed from: h0, reason: collision with root package name */
    @Y61.l
    public final AdvertDetailsGeoMarketReportItem f76898h0;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final OffersPosition f76899i;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.l
    public final List<AdvertDetailsGeoReferenceItem> f76900i0;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28240u f76901j;

    /* renamed from: j0, reason: collision with root package name */
    @Y61.l
    public final AdvertDetailsGeoZonesItem f76902j0;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_core.short_term_rent.a f76903k;

    /* renamed from: k0, reason: collision with root package name */
    @Y61.l
    public final AdvertDetailsGroupsItem f76904k0;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f76905l;

    /* renamed from: l0, reason: collision with root package name */
    @Y61.l
    public final AdvertDetailsReviewsScoreItem f76906l0;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final I1 f76907m;

    /* renamed from: m0, reason: collision with root package name */
    @Y61.l
    public final AdvertHotelPromoWidgetItem f76908m0;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public kotlin.ranges.l f76909n;

    /* renamed from: n0, reason: collision with root package name */
    @Y61.l
    public final IceBreakersItem f76910n0;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public final AdvertDetailsAbuseItem f76911o;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.l
    public final PersistableSpannedItem f76912o0;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public final AdditionalSellerButtonItem f76913p;

    /* renamed from: p0, reason: collision with root package name */
    @Y61.l
    public final MortgageCalculatorItem f76914p0;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public final AdditionalSellerFeaturesItem f76915q;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.l
    public final MortgageSnippetItem f76916q0;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public final AdvertDetailsFlatsItem f76917r;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.l
    public final AdvertDetailsNoteItem f76918r0;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public final AdvertDetailsReviewsScoreItem f76919s;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.l
    public final OffersItem f76920s0;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public final AdditionalSellerTitleItem f76921t;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.l
    public final AdvertDetailsPpRecallPromoItem f76922t0;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public final AddressCentrityBlockItem f76923u;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.l
    public final AdvertDetailsComfortableDealPromoItem f76924u0;

    /* renamed from: v, reason: collision with root package name */
    @Y61.l
    public final AdvertDetailsAddressGeoDistanceItem f76925v;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.l
    public final PriceComparisonItem f76926v0;

    /* renamed from: w, reason: collision with root package name */
    @Y61.l
    public final AddressHint f76927w;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.l
    public final PersistableSpannedItem f76928w0;

    /* renamed from: x, reason: collision with root package name */
    @Y61.l
    public final AdvertDetailsAddressItem f76929x;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.l
    public final PersistableSpannedItem f76930x0;

    /* renamed from: y, reason: collision with root package name */
    @Y61.l
    public final AdvertDetailsAdvertNumberItem f76931y;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.l
    public final AdvertPriceListPreviewItem f76932y0;

    /* renamed from: z, reason: collision with root package name */
    @Y61.l
    public final AdvertDetailsAmenitiesItem f76933z;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.l
    public final AdvertDetailsPrivacyDisclaimerItem f76934z0;

    /* compiled from: RealtyItemListBuilder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert.item.items_list_builder.realty.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C2273a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f76935a;

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
            f76935a = iArr;
        }
    }

    /* compiled from: RealtyItemListBuilder.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ AdvertHotelPromoWidgetItem f76936l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ a f76937m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AdvertHotelPromoWidgetItem advertHotelPromoWidgetItem, a aVar) {
            super(0);
            this.f76936l = advertHotelPromoWidgetItem;
            this.f76937m = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            ParametrizedEvent parametrizedEvent = this.f76936l.f76208g;
            if (parametrizedEvent != null) {
                this.f76937m.f76888d.O(parametrizedEvent);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: RealtyItemListBuilder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ AdvertDetails f76939m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AdvertDetails advertDetails) {
            super(0);
            this.f76939m = advertDetails;
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = a.this;
            String iconType = aVar.f76878Z.f74287h.getIconType();
            aVar.f76888d.v3(this.f76939m.getId(), aVar.f76878Z.f74286g, iconType);
            return G0.f406611a;
        }
    }

    /* compiled from: RealtyItemListBuilder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ AdvertDetails f76941m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AdvertDetails advertDetails) {
            super(0);
            this.f76941m = advertDetails;
        }

        @Override // Y41.a
        public final G0 invoke() {
            a.this.f76888d.v3(this.f76941m.getId(), "Ипотека со скидкой на Авито", null);
            return G0.f406611a;
        }
    }

    /* compiled from: RealtyItemListBuilder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ AdvertDetails f76943m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(AdvertDetails advertDetails) {
            super(0);
            this.f76943m = advertDetails;
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = a.this;
            aVar.f76888d.v3(this.f76943m.getId(), aVar.f76910n0.f76445d.getContact(), null);
            return G0.f406611a;
        }
    }

    /* compiled from: RealtyItemListBuilder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ AdvertDetails f76945m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f76946n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(AdvertDetails advertDetails, String str) {
            super(0);
            this.f76945m = advertDetails;
            this.f76946n = str;
        }

        @Override // Y41.a
        public final G0 invoke() {
            a.this.f76888d.v3(this.f76945m.getId(), this.f76946n, null);
            return G0.f406611a;
        }
    }

    /* compiled from: RealtyItemListBuilder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ AdvertDetails f76948m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f76949n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(AdvertDetails advertDetails, String str) {
            super(0);
            this.f76948m = advertDetails;
            this.f76949n = str;
        }

        @Override // Y41.a
        public final G0 invoke() {
            a.this.f76888d.v3(this.f76948m.getId(), this.f76949n, null);
            return G0.f406611a;
        }
    }

    /* compiled from: RealtyItemListBuilder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ AdvertDetails f76951m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f76952n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(AdvertDetails advertDetails, String str) {
            super(0);
            this.f76951m = advertDetails;
            this.f76952n = str;
        }

        @Override // Y41.a
        public final G0 invoke() {
            a.this.f76888d.v3(this.f76951m.getId(), this.f76952n, null);
            return G0.f406611a;
        }
    }

    /* compiled from: RealtyItemListBuilder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ AdvertDetails f76954m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f76955n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(AdvertDetails advertDetails, String str) {
            super(0);
            this.f76954m = advertDetails;
            this.f76955n = str;
        }

        @Override // Y41.a
        public final G0 invoke() {
            a.this.f76888d.v3(this.f76954m.getId(), this.f76955n, null);
            return G0.f406611a;
        }
    }

    /* compiled from: RealtyItemListBuilder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ AdvertDetails f76957m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f76958n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(AdvertDetails advertDetails, String str) {
            super(0);
            this.f76957m = advertDetails;
            this.f76958n = str;
        }

        @Override // Y41.a
        public final G0 invoke() {
            a.this.f76888d.v3(this.f76957m.getId(), this.f76958n, null);
            return G0.f406611a;
        }
    }

    /* compiled from: RealtyItemListBuilder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ AdvertDetails f76960m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(AdvertDetails advertDetails) {
            super(0);
            this.f76960m = advertDetails;
        }

        @Override // Y41.a
        public final G0 invoke() {
            a.this.f76888d.v3(this.f76960m.getId(), "Блок продавца", null);
            return G0.f406611a;
        }
    }

    /* compiled from: RealtyItemListBuilder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<G0> {
        public l() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a.this.f76888d.Q4();
            return G0.f406611a;
        }
    }

    /* compiled from: RealtyItemListBuilder.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ AdvertHotelPromoWidgetItem f76962l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ a f76963m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(AdvertHotelPromoWidgetItem advertHotelPromoWidgetItem, a aVar) {
            super(0);
            this.f76962l = advertHotelPromoWidgetItem;
            this.f76963m = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            ParametrizedEvent parametrizedEvent = this.f76962l.f76208g;
            if (parametrizedEvent != null) {
                this.f76963m.f76888d.O(parametrizedEvent);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: RealtyItemListBuilder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ AdvertDetails f76965m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(AdvertDetails advertDetails) {
            super(0);
            this.f76965m = advertDetails;
        }

        @Override // Y41.a
        public final G0 invoke() {
            ItemReviewsMain main;
            a aVar = a.this;
            if (aVar.f76885c != null) {
                ItemReviews itemReviews = this.f76965m.getItemReviews();
                ItemReviewsMain.AnalyticsParams analyticsParams = (itemReviews == null || (main = itemReviews.getMain()) == null) ? null : main.getAnalyticsParams();
                aVar.f76888d.O4(aVar.f76885c, ReviewsOpenPageFrom.ItemScroll.f91259d, analyticsParams != null ? analyticsParams.getAggregationType() : null, analyticsParams != null ? analyticsParams.getFirstReviewRelevanceBy() : null);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: RealtyItemListBuilder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class o extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ AdvertDetails f76967m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ l0.f f76968n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(AdvertDetails advertDetails, l0.f fVar) {
            super(0);
            this.f76967m = advertDetails;
            this.f76968n = fVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            ItemReviewsHeader header;
            Float scoreValue;
            com.avito.android.advert_core.analytics.a aVar = a.this.f76888d;
            AdvertDetails advertDetails = this.f76967m;
            String id2 = advertDetails.getId();
            ItemReviews itemReviews = advertDetails.getItemReviews();
            float fFloatValue = (itemReviews == null || (header = itemReviews.getHeader()) == null || (scoreValue = header.getScoreValue()) == null) ? 0.0f : scoreValue.floatValue();
            String categoryId = advertDetails.getCategoryId();
            if (categoryId == null) {
                categoryId = "";
            }
            aVar.R4(id2, categoryId, this.f76968n.f406840b, fFloatValue);
            return G0.f406611a;
        }
    }

    /* compiled from: RealtyItemListBuilder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class p extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ AdvertDetails f76970m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f76971n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(AdvertDetails advertDetails, String str) {
            super(0);
            this.f76970m = advertDetails;
            this.f76971n = str;
        }

        @Override // Y41.a
        public final G0 invoke() {
            a.this.f76888d.v3(this.f76970m.getId(), this.f76971n, null);
            return G0.f406611a;
        }
    }

    /* compiled from: RealtyItemListBuilder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class q extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ AdvertDetails f76973m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f76974n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(AdvertDetails advertDetails, String str) {
            super(0);
            this.f76973m = advertDetails;
            this.f76974n = str;
        }

        @Override // Y41.a
        public final G0 invoke() {
            a.this.f76888d.v3(this.f76973m.getId(), this.f76974n, null);
            return G0.f406611a;
        }
    }

    /* compiled from: RealtyItemListBuilder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class r extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f76976m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f76977n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(String str, String str2) {
            super(0);
            this.f76976m = str;
            this.f76977n = str2;
        }

        @Override // Y41.a
        public final G0 invoke() {
            a.this.f76888d.v3(this.f76976m, this.f76977n, null);
            return G0.f406611a;
        }
    }

    public a(@Y61.l AdvertDetails advertDetails, @Y61.l String str, @Y61.k com.avito.android.advert_core.analytics.a aVar, @Y61.k P0 p02, @Y61.k LinkedHashMap linkedHashMap, @Y61.l List list, @Y61.k Z0 z02, @Y61.l OffersPosition offersPosition, @Y61.k InterfaceC28240u interfaceC28240u, @Y61.k com.avito.android.advert_core.short_term_rent.a aVar2, @Y61.k com.avito.android.advert.item.similars.j jVar, @Y61.l I1 i12, @Y61.l kotlin.ranges.l lVar, @Y61.l AdvertDetailsAbuseItem advertDetailsAbuseItem, @Y61.l AdditionalSellerButtonItem additionalSellerButtonItem, @Y61.l AdditionalSellerFeaturesItem additionalSellerFeaturesItem, @Y61.l AdvertDetailsFlatsItem advertDetailsFlatsItem, @Y61.l AdvertDetailsReviewsScoreItem advertDetailsReviewsScoreItem, @Y61.l AdditionalSellerTitleItem additionalSellerTitleItem, @Y61.l AddressCentrityBlockItem addressCentrityBlockItem, @Y61.l AdvertDetailsAddressGeoDistanceItem advertDetailsAddressGeoDistanceItem, @Y61.l AddressHint addressHint, @Y61.l AdvertDetailsAddressItem advertDetailsAddressItem, @Y61.l AdvertDetailsAdvertNumberItem advertDetailsAdvertNumberItem, @Y61.l AdvertDetailsAmenitiesItem advertDetailsAmenitiesItem, @Y61.l PersistableSpannedItem persistableSpannedItem, @Y61.l AdvertDetailsB2CBottomItem advertDetailsB2CBottomItem, @Y61.l AdvertBadgeBarItem advertBadgeBarItem, @Y61.l AdvertDetailsBadgeBarLightItem advertDetailsBadgeBarLightItem, @Y61.l PersistableSpannedItem persistableSpannedItem2, @Y61.l BuzzoolaCreditBannerItem buzzoolaCreditBannerItem, @Y61.l ChatHistoryItem chatHistoryItem, @Y61.l AdvertDetailsFlatsItem advertDetailsFlatsItem2, @Y61.l ConsultationAfterIceBreakersItem consultationAfterIceBreakersItem, @Y61.l ConsultationButtonItem consultationButtonItem, @Y61.l AdvertDetailsContactBarItem advertDetailsContactBarItem, @Y61.l InstallmentsBlockItem installmentsBlockItem, @Y61.l CreditCalculatorItem creditCalculatorItem, @Y61.l CreditBrokerLinkItem creditBrokerLinkItem, @Y61.l AdvertDetailsDescriptionItem advertDetailsDescriptionItem, @Y61.l DeveloperButtonItem developerButtonItem, @Y61.l AdvertDetailsFlatsItem advertDetailsFlatsItem3, @Y61.l DeveloperTrustItem developerTrustItem, @Y61.l DevelopmentOffersItem developmentOffersItem, @Y61.l AdvertDetailsDisclaimerItem advertDetailsDisclaimerItem, @Y61.l DisclaimerPDItem disclaimerPDItem, @Y61.l AdvertDetailsDomotekaReportTeaserItem advertDetailsDomotekaReportTeaserItem, @Y61.l AdvertDetailsDomotekaTeaserItem advertDetailsDomotekaTeaserItem, @Y61.l DynamicConsultationAfterIceBreakersItem dynamicConsultationAfterIceBreakersItem, @Y61.l EarlyAccessAdvertItem earlyAccessAdvertItem, @Y61.l ExpertBlockItem expertBlockItem, @Y61.l List list2, @Y61.l AdvertDetailsFmpBannerItem advertDetailsFmpBannerItem, @Y61.l AdvertDetailsFmpCalculatorItem advertDetailsFmpCalculatorItem, @Y61.l AdvertDetailsFmpOfferItem advertDetailsFmpOfferItem, @Y61.l AdvertDetailsFmpProductsItem advertDetailsFmpProductsItem, @Y61.l CarouselPhotoGalleryItem carouselPhotoGalleryItem, @Y61.l AdvertDetailsGalleryItem advertDetailsGalleryItem, @Y61.l AdvertDetailsGeoMarketReportItem advertDetailsGeoMarketReportItem, @Y61.l List list3, @Y61.l AdvertDetailsGeoZonesItem advertDetailsGeoZonesItem, @Y61.l AdvertDetailsGroupsItem advertDetailsGroupsItem, @Y61.l AdvertDetailsReviewsScoreItem advertDetailsReviewsScoreItem2, @Y61.l AdvertHotelPromoWidgetItem advertHotelPromoWidgetItem, @Y61.l IceBreakersItem iceBreakersItem, @Y61.l PersistableSpannedItem persistableSpannedItem3, @Y61.l MortgageCalculatorItem mortgageCalculatorItem, @Y61.l MortgageSnippetItem mortgageSnippetItem, @Y61.l AdvertDetailsNoteItem advertDetailsNoteItem, @Y61.l OffersItem offersItem, @Y61.l AdvertDetailsPpRecallPromoItem advertDetailsPpRecallPromoItem, @Y61.l AdvertDetailsComfortableDealPromoItem advertDetailsComfortableDealPromoItem, @Y61.l PriceComparisonItem priceComparisonItem, @Y61.l PersistableSpannedItem persistableSpannedItem4, @Y61.l PersistableSpannedItem persistableSpannedItem5, @Y61.l AdvertPriceListPreviewItem advertPriceListPreviewItem, @Y61.l AdvertDetailsPrivacyDisclaimerItem advertDetailsPrivacyDisclaimerItem, @Y61.l AdvertDetailsRatingPublishItem advertDetailsRatingPublishItem, @Y61.l InformationAboutItem informationAboutItem, @Y61.l RealtyImvItem realtyImvItem, @Y61.l RealtyUspItem realtyUspItem, @Y61.l RecallMeBlockItem recallMeBlockItem, @Y61.l RentAgreementItem rentAgreementItem, @Y61.l AdvertDetailsFlatsItem advertDetailsFlatsItem4, @Y61.l AdvertDetailsRepairCalculatorItem advertDetailsRepairCalculatorItem, @Y61.k List list4, @Y61.l AdvertDetailsScrollUpItem advertDetailsScrollUpItem, @Y61.l AdvertDetailsSearchSuggestsItem advertDetailsSearchSuggestsItem, @Y61.l SecondaryConsultationItem secondaryConsultationItem, @Y61.l AdvertDetailsSellerProfileItem advertDetailsSellerProfileItem, @Y61.l AdvertDetailsSellerSubscriptionItem advertDetailsSellerSubscriptionItem, @Y61.l AdvertDetailsShortTermRentItemDiscountItem advertDetailsShortTermRentItemDiscountItem, @Y61.l AdvertDetailsTravelPaymentTogglesItem advertDetailsTravelPaymentTogglesItem, @Y61.l AdvertDetailsTravelPriceItem advertDetailsTravelPriceItem, @Y61.l AdvertDetailsShortTermRentStrButtonsItem advertDetailsShortTermRentStrButtonsItem, @Y61.l AdvertDetailsShowDescriptionItem advertDetailsShowDescriptionItem, @Y61.l AdvertDetailsShowOnMapItem advertDetailsShowOnMapItem, @Y61.l AdvertDetailsSimilarsButtonItem advertDetailsSimilarsButtonItem, @Y61.l AdvertDetailsTitleItem advertDetailsTitleItem, @Y61.l AdvertVideoCallRequestItem advertVideoCallRequestItem, @Y61.l AdvertDetailsNeighboringDatesItem advertDetailsNeighboringDatesItem, @Y61.l AdvertDetailsTravelTrustItem advertDetailsTravelTrustItem, @Y61.l AdvertDetailsOptimalPriceItem advertDetailsOptimalPriceItem, @Y61.l MarketplaceSalesAdvertPromoBannerItem marketplaceSalesAdvertPromoBannerItem, @Y61.l AdvertDetailsAnchorTrustFactorsItem advertDetailsAnchorTrustFactorsItem, @Y61.k com.avito.android.util.bottom_gap.d dVar) {
        this.f76882b = advertDetails;
        this.f76885c = str;
        this.f76888d = aVar;
        this.f76891e = p02;
        this.f76893f = linkedHashMap;
        this.f76895g = list;
        this.f76897h = z02;
        this.f76899i = offersPosition;
        this.f76901j = interfaceC28240u;
        this.f76903k = aVar2;
        this.f76905l = jVar;
        this.f76907m = i12;
        this.f76909n = lVar;
        this.f76911o = advertDetailsAbuseItem;
        this.f76913p = additionalSellerButtonItem;
        this.f76915q = additionalSellerFeaturesItem;
        this.f76917r = advertDetailsFlatsItem;
        this.f76919s = advertDetailsReviewsScoreItem;
        this.f76921t = additionalSellerTitleItem;
        this.f76923u = addressCentrityBlockItem;
        this.f76925v = advertDetailsAddressGeoDistanceItem;
        this.f76927w = addressHint;
        this.f76929x = advertDetailsAddressItem;
        this.f76931y = advertDetailsAdvertNumberItem;
        this.f76933z = advertDetailsAmenitiesItem;
        this.f76828A = persistableSpannedItem;
        this.f76830B = advertDetailsB2CBottomItem;
        this.f76832C = advertBadgeBarItem;
        this.f76834D = advertDetailsBadgeBarLightItem;
        this.f76836E = persistableSpannedItem2;
        this.f76838F = buzzoolaCreditBannerItem;
        this.f76840G = chatHistoryItem;
        this.f76842H = advertDetailsFlatsItem2;
        this.f76844I = consultationAfterIceBreakersItem;
        this.f76846J = consultationButtonItem;
        this.f76848K = advertDetailsContactBarItem;
        this.f76850L = installmentsBlockItem;
        this.f76852M = creditCalculatorItem;
        this.f76854N = creditBrokerLinkItem;
        this.f76856O = advertDetailsDescriptionItem;
        this.f76858P = developerButtonItem;
        this.f76860Q = advertDetailsFlatsItem3;
        this.f76862R = developerTrustItem;
        this.f76864S = developmentOffersItem;
        this.f76866T = advertDetailsDisclaimerItem;
        this.f76868U = disclaimerPDItem;
        this.f76870V = advertDetailsDomotekaReportTeaserItem;
        this.f76872W = advertDetailsDomotekaTeaserItem;
        this.f76874X = dynamicConsultationAfterIceBreakersItem;
        this.f76876Y = earlyAccessAdvertItem;
        this.f76878Z = expertBlockItem;
        this.f76880a0 = list2;
        this.f76883b0 = advertDetailsFmpBannerItem;
        this.f76886c0 = advertDetailsFmpCalculatorItem;
        this.f76889d0 = advertDetailsFmpOfferItem;
        this.f76892e0 = advertDetailsFmpProductsItem;
        this.f76894f0 = carouselPhotoGalleryItem;
        this.f76896g0 = advertDetailsGalleryItem;
        this.f76898h0 = advertDetailsGeoMarketReportItem;
        this.f76900i0 = list3;
        this.f76902j0 = advertDetailsGeoZonesItem;
        this.f76904k0 = advertDetailsGroupsItem;
        this.f76906l0 = advertDetailsReviewsScoreItem2;
        this.f76908m0 = advertHotelPromoWidgetItem;
        this.f76910n0 = iceBreakersItem;
        this.f76912o0 = persistableSpannedItem3;
        this.f76914p0 = mortgageCalculatorItem;
        this.f76916q0 = mortgageSnippetItem;
        this.f76918r0 = advertDetailsNoteItem;
        this.f76920s0 = offersItem;
        this.f76922t0 = advertDetailsPpRecallPromoItem;
        this.f76924u0 = advertDetailsComfortableDealPromoItem;
        this.f76926v0 = priceComparisonItem;
        this.f76928w0 = persistableSpannedItem4;
        this.f76930x0 = persistableSpannedItem5;
        this.f76932y0 = advertPriceListPreviewItem;
        this.f76934z0 = advertDetailsPrivacyDisclaimerItem;
        this.f76829A0 = advertDetailsRatingPublishItem;
        this.f76831B0 = informationAboutItem;
        this.f76833C0 = realtyImvItem;
        this.f76835D0 = realtyUspItem;
        this.f76837E0 = recallMeBlockItem;
        this.f76839F0 = rentAgreementItem;
        this.f76841G0 = advertDetailsFlatsItem4;
        this.f76843H0 = advertDetailsRepairCalculatorItem;
        this.f76845I0 = list4;
        this.f76847J0 = advertDetailsScrollUpItem;
        this.f76849K0 = advertDetailsSearchSuggestsItem;
        this.f76851L0 = secondaryConsultationItem;
        this.f76853M0 = advertDetailsSellerProfileItem;
        this.f76855N0 = advertDetailsSellerSubscriptionItem;
        this.f76857O0 = advertDetailsShortTermRentItemDiscountItem;
        this.f76859P0 = advertDetailsTravelPaymentTogglesItem;
        this.f76861Q0 = advertDetailsTravelPriceItem;
        this.f76863R0 = advertDetailsShortTermRentStrButtonsItem;
        this.f76865S0 = advertDetailsShowDescriptionItem;
        this.f76867T0 = advertDetailsShowOnMapItem;
        this.f76869U0 = advertDetailsSimilarsButtonItem;
        this.f76871V0 = advertDetailsTitleItem;
        this.f76873W0 = advertVideoCallRequestItem;
        this.f76875X0 = advertDetailsNeighboringDatesItem;
        this.f76877Y0 = advertDetailsTravelTrustItem;
        this.f76879Z0 = advertDetailsOptimalPriceItem;
        this.f76881a1 = marketplaceSalesAdvertPromoBannerItem;
        this.f76884b1 = advertDetailsAnchorTrustFactorsItem;
        this.f76887c1 = dVar;
    }

    public static void b(a aVar) {
        aVar.f76890d1.add(new AdvertDetailsDividerItem(0L, null, 20, 0, aVar.f76905l.a(), null, null, null, 227, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:183:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x06e3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0183  */
    @Override // com.avito.android.advert.item.items_list_builder.c
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.advert.item.items_list_builder.e a() {
        /*
            Method dump skipped, instructions count: 3542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.items_list_builder.realty.a.a():com.avito.android.advert.item.items_list_builder.e");
    }

    public final List<PersistableSpannedItem> c(List<PersistableSpannedItem> list) {
        AdvertDetailsBadgeBarLightItem advertDetailsBadgeBarLightItem = this.f76834D;
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
                arrayList.add(h(16));
            }
            i12 = i13;
        }
        return arrayList;
    }

    public final void d(AdvertDetails advertDetails) {
        if (this.f76903k.e(advertDetails.getTravelPrice())) {
            AdvertDetailsTravelPriceItem advertDetailsTravelPriceItem = this.f76861Q0;
            if (advertDetailsTravelPriceItem != null) {
                this.f76890d1.add(advertDetailsTravelPriceItem);
                return;
            }
            return;
        }
        PersistableSpannedItem persistableSpannedItem = this.f76930x0;
        if (persistableSpannedItem != null) {
            this.f76890d1.add(persistableSpannedItem);
        }
    }

    public final void e(AdvertDetails advertDetails) {
        AdvertDetailsTitleItem advertDetailsTitleItem = this.f76871V0;
        if (advertDetailsTitleItem != null) {
            this.f76890d1.add(advertDetailsTitleItem);
            if (this.f76903k.e(advertDetails.getTravelPrice()) && this.f76912o0 == null) {
                this.f76890d1.add(h(10));
            }
        }
    }

    public final void f() {
        AdvertDetailsAnchorTrustFactorsItem advertDetailsAnchorTrustFactorsItem = this.f76884b1;
        if (advertDetailsAnchorTrustFactorsItem != null) {
            if (!(C42745f0.S(this.f76890d1) instanceof AdvertDetailsGapItem)) {
                this.f76890d1.add(h(16));
            }
            this.f76890d1.add(advertDetailsAnchorTrustFactorsItem);
            this.f76890d1.add(h(10));
        }
    }

    public final void g() {
        RealtyUspItem realtyUspItem = this.f76835D0;
        if (realtyUspItem != null) {
            this.f76890d1.add(h(12));
            this.f76890d1.add(realtyUspItem);
            this.f76890d1.add(h(6));
        }
    }

    public final AdvertDetailsGapItem h(int i12) {
        AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
        return new AdvertDetailsGapItem(52, null, i12, this.f76905l.a(), null, null, 50, null);
    }

    public final int i(PersistableSpannedItem persistableSpannedItem) {
        return this.f76890d1.indexOf(persistableSpannedItem);
    }

    public final void j(AdvertDetails advertDetails) {
        String string;
        AttributedText attributedText;
        ArrayList arrayList = new ArrayList();
        DeveloperTrustItem developerTrustItem = this.f76862R;
        if (developerTrustItem != null) {
            this.f76890d1.add(h(28));
            this.f76890d1.add(developerTrustItem);
            arrayList.add(Integer.valueOf(this.f76890d1.indexOf(developerTrustItem)));
        }
        AdvertDetailsFlatsItem advertDetailsFlatsItem = this.f76860Q;
        if (advertDetailsFlatsItem != null) {
            if (developerTrustItem == null) {
                this.f76890d1.add(h(20));
            } else {
                Developer developerV2 = advertDetails.getDeveloperV2();
                if ((developerV2 != null ? developerV2.getTrustCard() : null) == null) {
                    Developer developerV22 = advertDetails.getDeveloperV2();
                    if ((developerV22 != null ? developerV22.getFoundationCard() : null) == null) {
                        this.f76890d1.add(h(10));
                    }
                }
            }
            this.f76890d1.add(advertDetailsFlatsItem);
            arrayList.add(Integer.valueOf(this.f76890d1.indexOf(advertDetailsFlatsItem)));
        }
        DeveloperButtonItem developerButtonItem = this.f76858P;
        if (developerButtonItem != null) {
            this.f76890d1.add(h(22));
            this.f76890d1.add(developerButtonItem);
            arrayList.add(Integer.valueOf(this.f76890d1.indexOf(developerButtonItem)));
        }
        if (advertDetailsFlatsItem != null) {
            if (developerTrustItem == null || (attributedText = developerTrustItem.f75184g) == null || (string = attributedText.getText()) == null) {
                string = advertDetailsFlatsItem.toString();
            }
            I1 i12 = this.f76907m;
            if (i12 != null) {
                i12.w(arrayList, new q(advertDetails, string));
            }
        }
    }

    public final void k() {
        Object objRemove;
        String text;
        AttributedText attributedText;
        AdvertDetails advertDetails = this.f76882b;
        if (advertDetails == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        AdditionalSellerTitleItem additionalSellerTitleItem = this.f76921t;
        if (additionalSellerTitleItem != null) {
            this.f76890d1.add(h(28));
            this.f76890d1.add(additionalSellerTitleItem);
            arrayList.add(Integer.valueOf(this.f76890d1.indexOf(additionalSellerTitleItem)));
            this.f76890d1.add(h(8));
        }
        AdvertDetailsReviewsScoreItem advertDetailsReviewsScoreItem = this.f76919s;
        if (advertDetailsReviewsScoreItem != null) {
            this.f76890d1.add(advertDetailsReviewsScoreItem);
            arrayList.add(Integer.valueOf(this.f76890d1.indexOf(advertDetailsReviewsScoreItem)));
            this.f76890d1.add(h(2));
        }
        AdvertDetailsFlatsItem advertDetailsFlatsItem = this.f76917r;
        int i12 = 12;
        if (advertDetailsFlatsItem != null) {
            if (advertDetailsReviewsScoreItem == null) {
                this.f76890d1.add(h(16));
            }
            this.f76890d1.add(advertDetailsFlatsItem);
            arrayList.add(Integer.valueOf(this.f76890d1.indexOf(advertDetailsFlatsItem)));
            objRemove = this.f76893f.remove(Long.valueOf(advertDetailsFlatsItem.f84654b));
            ExpandItemsButtonItem expandItemsButtonItem = (ExpandItemsButtonItem) objRemove;
            if (expandItemsButtonItem != null) {
                this.f76890d1.add(expandItemsButtonItem);
                arrayList.add(Integer.valueOf(this.f76890d1.indexOf(expandItemsButtonItem)));
                this.f76890d1.add(h(12));
            } else if (!advertDetails.isRedesign()) {
                this.f76890d1.add(h(12));
            }
        } else {
            objRemove = null;
        }
        AdditionalSellerButtonItem additionalSellerButtonItem = this.f76913p;
        if (additionalSellerButtonItem != null) {
            this.f76890d1.add(h(objRemove != null ? 20 : 12));
            this.f76890d1.add(additionalSellerButtonItem);
            this.f76890d1.add(h(6));
            arrayList.add(Integer.valueOf(this.f76890d1.indexOf(additionalSellerButtonItem)));
        }
        AdditionalSellerFeaturesItem additionalSellerFeaturesItem = this.f76915q;
        if (additionalSellerFeaturesItem != null) {
            List<PersistableSpannedItem> list = this.f76890d1;
            if (additionalSellerButtonItem != null) {
                i12 = 24;
            } else if (objRemove != null) {
                i12 = 20;
            }
            list.add(h(i12));
            this.f76890d1.add(additionalSellerFeaturesItem);
            arrayList.add(Integer.valueOf(this.f76890d1.indexOf(additionalSellerFeaturesItem)));
        }
        if (advertDetailsFlatsItem != null) {
            if (additionalSellerTitleItem == null || (attributedText = additionalSellerTitleItem.f72620g) == null || (text = attributedText.getText()) == null) {
                AttributedText attributedText2 = advertDetailsFlatsItem.f84658f;
                text = attributedText2 != null ? attributedText2.getText() : advertDetailsFlatsItem.toString();
            }
            I1 i13 = this.f76907m;
            if (i13 != null) {
                i13.w(arrayList, new com.avito.android.advert.item.items_list_builder.realty.b(this, advertDetails, text));
            }
        }
    }

    public final void l(AdvertDetails advertDetails, boolean z12) {
        String strValueOf;
        AdvertDetailsFlatsItem advertDetailsFlatsItem;
        AttributedText attributedText;
        Object next;
        G0 g02;
        if (z12) {
            ExpandItemsButtonItem expandItemsButtonItem = null;
            List<AdvertDetailsFlatsItem> list = this.f76880a0;
            if (list != null) {
                int i12 = 0;
                ExpandItemsButtonItem expandItemsButtonItem2 = null;
                for (Object obj : list) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    AdvertDetailsFlatsItem advertDetailsFlatsItem2 = (AdvertDetailsFlatsItem) obj;
                    if (i12 == 0 && advertDetailsFlatsItem2.f84658f != null && advertDetails.isRedesign() && !(C42745f0.S(this.f76890d1) instanceof IceBreakersItem) && !(C42745f0.S(this.f76890d1) instanceof AdvertDetailsGapItem)) {
                        this.f76890d1.add(h(this.f76899i == OffersPosition.BEFORE_ALL_PARAMETERS ? 12 : 16));
                    }
                    Iterator<T> it = advertDetailsFlatsItem2.f84656d.iterator();
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
                        this.f76888d.B1(String.valueOf(((ServicesRealtySheetLink) parameter.getDeepLink()).f280421e));
                    }
                    this.f76890d1.add(advertDetailsFlatsItem2);
                    ExpandItemsButtonItem expandItemsButtonItem3 = (ExpandItemsButtonItem) this.f76893f.remove(Long.valueOf(advertDetailsFlatsItem2.f84654b));
                    if (expandItemsButtonItem3 != null) {
                        this.f76890d1.add(expandItemsButtonItem3);
                        if (!advertDetails.isRedesign()) {
                            this.f76890d1.add(h(12));
                        }
                        g02 = G0.f406611a;
                    } else {
                        expandItemsButtonItem3 = expandItemsButtonItem2;
                        g02 = null;
                    }
                    if (g02 == null && !advertDetails.isRedesign()) {
                        this.f76890d1.add(h(12));
                    }
                    expandItemsButtonItem2 = expandItemsButtonItem3;
                    i12 = i13;
                }
                expandItemsButtonItem = expandItemsButtonItem2;
            }
            if (list == null || (advertDetailsFlatsItem = (AdvertDetailsFlatsItem) C42745f0.G(list)) == null || (attributedText = advertDetailsFlatsItem.f84658f) == null || (strValueOf = attributedText.getText()) == null) {
                strValueOf = String.valueOf(list);
            }
            if (O2.a(list)) {
                ArrayList arrayList = new ArrayList();
                if (list != null) {
                    Iterator<T> it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(Integer.valueOf(this.f76890d1.indexOf((AdvertDetailsFlatsItem) it2.next())));
                    }
                }
                if (expandItemsButtonItem != null) {
                    arrayList.add(Integer.valueOf(this.f76890d1.indexOf(expandItemsButtonItem)));
                }
                I1 i14 = this.f76907m;
                if (i14 != null) {
                    i14.w(arrayList, new com.avito.android.advert.item.items_list_builder.realty.c(this, advertDetails, strValueOf));
                }
            }
            EarlyAccessAdvertItem earlyAccessAdvertItem = this.f76876Y;
            if (earlyAccessAdvertItem != null) {
                this.f76890d1.add(h(16));
                this.f76890d1.add(earlyAccessAdvertItem);
            }
        }
    }

    public final void m(String str, boolean z12, boolean z13) {
        AdvertDetailsDescriptionItem advertDetailsDescriptionItem;
        int i12;
        if (!z12 || (advertDetailsDescriptionItem = this.f76856O) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        String string = null;
        if (z13) {
            String strG = this.f76901j.g();
            PersistableSpannedItem persistableSpannedItem = (PersistableSpannedItem) C42745f0.S(this.f76890d1);
            boolean z14 = persistableSpannedItem instanceof AdvertPriceListPreviewItem;
            AdvertDetails advertDetails = this.f76882b;
            if (z14) {
                String str2 = ((AdvertPriceListPreviewItem) persistableSpannedItem).f84113h;
                i12 = (str2 == null || str2.length() == 0) ? 20 : 28;
            } else {
                i12 = (advertDetails == null || !advertDetails.isRedesign()) ? 12 : 32;
            }
            AdvertDetailsDescriptionHeaderItem advertDetailsDescriptionHeaderItemA = this.f76891e.a(Integer.valueOf(i12), Integer.valueOf(((advertDetails == null || !advertDetails.isRestyle()) && (advertDetails == null || !advertDetails.isRealtyRedesign())) ? R.attr.textHeadingLarge : R.attr.textH2), null, strG);
            this.f76890d1.add(advertDetailsDescriptionHeaderItemA);
            arrayList.add(Integer.valueOf(this.f76890d1.indexOf(advertDetailsDescriptionHeaderItemA)));
            string = strG;
        }
        this.f76890d1.add(advertDetailsDescriptionItem);
        arrayList.add(Integer.valueOf(this.f76890d1.indexOf(advertDetailsDescriptionItem)));
        if (string == null) {
            string = advertDetailsDescriptionItem.toString();
        }
        I1 i13 = this.f76907m;
        if (i13 != null) {
            i13.w(arrayList, new r(str, string));
        }
    }

    public final boolean n() {
        MortgageSnippetItem mortgageSnippetItem = this.f76916q0;
        return mortgageSnippetItem != null && mortgageSnippetItem.f77673b;
    }
}
