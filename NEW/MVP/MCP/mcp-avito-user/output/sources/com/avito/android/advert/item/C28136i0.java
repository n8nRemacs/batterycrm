package com.avito.android.advert.item;

import Ax.InterfaceC13095a;
import HV.a;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Property;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.l;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.os.C22777e;
import androidx.fragment.app.ActivityC22955m;
import androidx.recyclerview.widget.RecyclerView;
import b7.InterfaceC25420a;
import com.avito.android.B2;
import com.avito.android.C29640d;
import com.avito.android.C36135w2;
import com.avito.android.InterfaceC32897n0;
import com.avito.android.InterfaceC34162r0;
import com.avito.android.R;
import com.avito.android.ab_tests.configs.CrossFadeOpenAbTestGroup;
import com.avito.android.ab_tests.configs.MultiItemOutlinedChipsTestGroup;
import com.avito.android.ab_tests.configs.PreloadingPromiseTestGroup;
import com.avito.android.ab_tests.groups.StandardizeButtonWidthTestGroup;
import com.avito.android.advert.AdvertDetailsActivity;
import com.avito.android.advert.C27689b;
import com.avito.android.advert.InterfaceC27797i;
import com.avito.android.advert.InterfaceC28243x;
import com.avito.android.advert.auto_flats_bottom_sheet.autoflatstwocolumndialog.AutoFlatsTwoColumnDialogFragment;
import com.avito.android.advert.di.C27710t;
import com.avito.android.advert.item.AdvertDetailsFastOpenParams;
import com.avito.android.advert.item.AdvertDetailsFragment;
import com.avito.android.advert.item.V0;
import com.avito.android.advert.item.auto_credits.AdvertDetailsAutoLoansItem;
import com.avito.android.advert.item.autoteka.common.AdvertDetailsAutotekaTeaserItemCommon;
import com.avito.android.advert.item.blocks.items_factories.N5;
import com.avito.android.advert.item.comfortable_deal.ExpertBlockBottomSheetDialog;
import com.avito.android.advert.item.comfortable_deal.ExpertBlockBottomSheetOpenParams;
import com.avito.android.advert.item.consultation.expert_reviews.ExpertReviewsBottomSheetDialog;
import com.avito.android.advert.item.cv_phone_actualization.AdvertCvPhoneActualizationAction;
import com.avito.android.advert.item.cv_phone_actualization.AdvertCvPhoneActualizationActionType;
import com.avito.android.advert.item.d2;
import com.avito.android.advert.item.leasing_calculator.AdvertDetailsLeasingCalculatorItem;
import com.avito.android.advert.item.modelSpecs.ModelSpecsItem;
import com.avito.android.advert.item.modelSpecs.link.ModelSpecsLinkItem;
import com.avito.android.advert.item.neighboring_dates.d;
import com.avito.android.advert.item.ownership_discrepancy.AdvertDetailsOwnershipDiscrepancyBottomSheet;
import com.avito.android.advert.item.ownership_discrepancy.OwnershipDiscrepancyOpenParams;
import com.avito.android.advert.item.parking.ParkingAddressShowOnMapParams;
import com.avito.android.advert.item.realty_quiz_banner.RealtyQuizBannerItem;
import com.avito.android.advert.item.recall_me.InterfaceC28164a;
import com.avito.android.advert.item.safedeal.InterfaceC28173a;
import com.avito.android.advert.item.safedeal.real_one_click_payment_block.PaymentBlockItemState;
import com.avito.android.advert.item.show_on_map.AdvertDetailsShowOnMapItem;
import com.avito.android.advert_core.advert.AdvertDetailsFlatViewType;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.AdvertDetailsWithMeta;
import com.avito.android.advert_core.advert.b;
import com.avito.android.advert_core.analytics.AdvertDetailsStyleAnalytics;
import com.avito.android.advert_core.analytics.address.GeoFromBlock;
import com.avito.android.advert_core.analytics.modelspecs.ModelCardFrom;
import com.avito.android.advert_core.analytics.similars.ClickSimilarItemFavoritesAction;
import com.avito.android.advert_core.contactbar.InterfaceC28265d;
import com.avito.android.advert_core.expand_items_button.ExpandItemsButtonItem;
import com.avito.android.advert_core.expand_items_button.ExpandSource;
import com.avito.android.advert_core.pp_recall_promo.AdvertDetailsPpRecallPromoItem;
import com.avito.android.advert_core.safedeal.trust_factors.TrustFactorsComponent;
import com.avito.android.advert_core.ux_feedback.gallery.GalleryAction;
import com.avito.android.advert_details.AdvertDetailsStyle;
import com.avito.android.advert_details_items.neighboring_dates.AdvertDetailsNeighboringDatesItem;
import com.avito.android.advert_details_items.sellerprofile.InterfaceC28280j;
import com.avito.android.advert_multi_items.AdvertDetailsMultiItemState;
import com.avito.android.advert_multi_items.model.ModificationItem;
import com.avito.android.advertising.loaders.BannerInfo;
import com.avito.android.advertising.loaders.j;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.event.ContactSource;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.analytics.provider.clickstream.ScreenIdField;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import com.avito.android.anonymous_number_dialog.AnonymousNumberDialogLink;
import com.avito.android.authorization.AuthSource;
import com.avito.android.auto_loans_composite_broker.v1.AdvertDetailsCompositeBrokerV1Item;
import com.avito.android.auto_loans_composite_broker.v2.AdvertDetailsCompositeBrokerV2Item;
import com.avito.android.autoteka.analytics.event.FromBlock;
import com.avito.android.beduin.common.component.select_calendar.BeduinSelectCalendarModel;
import com.avito.android.bottom_navigation.C28885g;
import com.avito.android.bottom_navigation.NavigationTab;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.bottom_navigation.space.BottomNavigationSpace;
import com.avito.android.component.snackbar.d;
import com.avito.android.component.snackbar.e;
import com.avito.android.component.toast.f;
import com.avito.android.component.toast.util.c;
import com.avito.android.component.toast.util.g;
import com.avito.android.credits.t;
import com.avito.android.deep_linking.links.AdvertDetailsScrollToPositionEmptyLink;
import com.avito.android.deep_linking.links.ClickStreamLink;
import com.avito.android.deep_linking.links.ConsultationStartLink;
import com.avito.android.deep_linking.links.CreateChannelLink;
import com.avito.android.deep_linking.links.CustomChromeTabExternalLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.DetailsSheetButton;
import com.avito.android.deep_linking.links.DetailsSheetLink;
import com.avito.android.deep_linking.links.DetailsSheetLinkBody;
import com.avito.android.deep_linking.links.ModelCardLink;
import com.avito.android.deep_linking.links.PhoneLink;
import com.avito.android.deep_linking.links.auth.AuthenticateLink;
import com.avito.android.deeplink.JobApplyCreateLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.delivery_combined_buttons_public.CombinedButtonType;
import com.avito.android.developments_advice.remote.model.ConsultationFormLink;
import com.avito.android.di.module.InterfaceC30098l;
import com.avito.android.di.module.InterfaceC30174s;
import com.avito.android.favorite.AbstractC30567a;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.home.bottom_navigation.BottomNavigationFragment;
import com.avito.android.iac_outgoing_call_ability.public_module.deep_link.IacLaunchCallAfterCanCallLink;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.design.animation.AnimationView;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.lib.design.toast_bar.state.ToastBarState;
import com.avito.android.lib.util.darkTheme.ThemeAppearance;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.rating_form.deep_link.RatingFormLink;
import com.avito.android.rec.ScreenSource;
import com.avito.android.remote.cv_state.CvState;
import com.avito.android.remote.cv_state.CvStateType;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.AdditionalSeller;
import com.avito.android.remote.model.AdjustParameters;
import com.avito.android.remote.model.AdvertAction;
import com.avito.android.remote.model.AdvertActions;
import com.avito.android.remote.model.AdvertComparison;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.AdvertDetailsAbuse;
import com.avito.android.remote.model.AdvertDetailsBusiness360;
import com.avito.android.remote.model.AdvertNavBarStyle;
import com.avito.android.remote.model.AdvertNavBarStyleKt;
import com.avito.android.remote.model.AdvertParameters;
import com.avito.android.remote.model.AdvertSharing;
import com.avito.android.remote.model.AdvertShortTermRent;
import com.avito.android.remote.model.CampaignOptionCopy;
import com.avito.android.remote.model.CategoryIds;
import com.avito.android.remote.model.CloseBannerPayload;
import com.avito.android.remote.model.ConsultationFormData;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.Developer;
import com.avito.android.remote.model.DevelopmentFeature;
import com.avito.android.remote.model.DimmedImage;
import com.avito.android.remote.model.ExpertBlock;
import com.avito.android.remote.model.GeoReference;
import com.avito.android.remote.model.GeoZones;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.LocationMap;
import com.avito.android.remote.model.MultiAddressesInfo;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.remote.model.RealtyInfrastructure;
import com.avito.android.remote.model.RouteButtons;
import com.avito.android.remote.model.SerpResultCategoryDetails;
import com.avito.android.remote.model.SimpleAction;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.advert_details.ContactBarData;
import com.avito.android.remote.model.advert_details.realty.Review;
import com.avito.android.remote.model.advert_details.reviews.ItemReviewsHeader;
import com.avito.android.remote.model.advert_poll.AdvertPoll;
import com.avito.android.remote.model.autoteka_teaser_select.AutotekaTeaserSelectItemResponse;
import com.avito.android.remote.model.autotekateaser.AutotekaTeaserItemResponse;
import com.avito.android.remote.model.autotekateaser.AutotekaTeaserResult;
import com.avito.android.remote.model.category_parameters.DateTimeParameterKt;
import com.avito.android.remote.model.developments_catalog.AmenityButton;
import com.avito.android.remote.model.early_access_banner.EarlyAccessBanner;
import com.avito.android.remote.model.item_popularity.ItemPopularity;
import com.avito.android.remote.model.model_card.CatalogInfo;
import com.avito.android.remote.model.model_card.LinkInfo;
import com.avito.android.remote.model.model_card.ModelCardInfo;
import com.avito.android.remote.model.model_card.PriceInfo;
import com.avito.android.remote.model.multi_item.MultiItemParamUnited;
import com.avito.android.remote.model.seller_addresses.SellerAddressesInfo;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.safedeal.SafeDeal;
import com.avito.android.safedeal.remote.model.SafeDealPaymentBlockResponse;
import com.avito.android.serp.adapter.AdvertItem;
import com.avito.android.service_booking.deeplinks.create.ServiceBookingCreateLink;
import com.avito.android.services_realty_sheet.link.ServicesRealtySheetLink;
import com.avito.android.ui.status_bar.d;
import com.avito.android.user_address_public.api.MultiAddressesItem;
import com.avito.android.util.ApiException;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35838l3;
import com.avito.android.util.C35936s;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.K5;
import com.avito.android.util.O2;
import com.avito.android.util.P2;
import com.avito.android.util.V2;
import com.avito.android.util.rx3.AbstractC35899h;
import com.avito.android.util.rx3.C35901i;
import com.avito.android.util.y6;
import com.google.android.material.snackbar.Snackbar;
import iR.C41336a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.operators.observable.C41962k;
import java.io.Serializable;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import javax.inject.Inject;
import k4.InterfaceC42497a;
import kf.InterfaceC42678a;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.l0;
import kotlin.text.C43066x;
import kotlinx.coroutines.AbstractC43129d1;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.internal.C43238h;
import kv.C43501a;
import l41.InterfaceC43543a;
import lE.C43624b;
import x7.InterfaceC49780b;
import z5.InterfaceC50374a;

/* compiled from: AdvertDetailsPresenter.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/i0;", "Lcom/avito/android/advert/item/g0;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.i0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28136i0 implements InterfaceC28130g0 {

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_core.analytics.a f76272A;

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.compatibility.v4.f f76273A0;

    /* renamed from: B, reason: collision with root package name */
    @Y61.k
    public final G5.a f76274B;

    /* renamed from: B0, reason: collision with root package name */
    @Y61.k
    public final Y41.l<Object, kotlin.G0> f76275B0;

    /* renamed from: C, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42678a f76276C;

    /* renamed from: C0, reason: collision with root package name */
    @Y61.k
    public final PreloadingPromiseTestGroup f76277C0;

    /* renamed from: D, reason: collision with root package name */
    @Y61.k
    public final A7.b f76278D;

    /* renamed from: D0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.business360.b f76279D0;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.screens.tracker.Q f76280E;

    /* renamed from: E0, reason: collision with root package name */
    @Y61.k
    public final N5 f76281E0;

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f76282F;

    /* renamed from: F0, reason: collision with root package name */
    @Y61.k
    public final u3.l<StandardizeButtonWidthTestGroup> f76283F0;

    /* renamed from: G, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.autoteka.data.a f76284G;

    /* renamed from: G0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.rating_persistence.llm_summary.h f76285G0;

    /* renamed from: H, reason: collision with root package name */
    @Y61.k
    public final AK0.l f76286H;

    /* renamed from: H0, reason: collision with root package name */
    @Y61.k
    public final u3.f<MultiItemOutlinedChipsTestGroup> f76287H0;

    /* renamed from: H1, reason: collision with root package name */
    @Y61.l
    public kotlinx.coroutines.N0 f76288H1;

    /* renamed from: H2, reason: collision with root package name */
    public boolean f76289H2;

    /* renamed from: I, reason: collision with root package name */
    @Y61.k
    public final X9.b f76290I;

    /* renamed from: I0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_core.pp_recall_promo.close_banners.a f76291I0;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final kotlinx.coroutines.flow.d2<vC.b> f76292J;

    /* renamed from: J0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.neighboring_dates.d f76293J0;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.core.z<com.avito.android.rating_ui.button.a> f76294K;

    /* renamed from: K0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.gallery.a f76295K0;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.core.z<com.avito.android.rating_ui.badge_score.b> f76296L;

    /* renamed from: L0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.bxcontent.N1 f76297L0;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.core.z<com.avito.android.rating_ui.badge_score.k> f76298M;

    /* renamed from: M0, reason: collision with root package name */
    @Y61.k
    public final C36135w2 f76299M0;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.core.z<com.avito.android.rating_ui.attributed_text.b> f76300N;

    /* renamed from: N0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.onboarding_manager.f f76301N0;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34162r0 f76302O;

    /* renamed from: O0, reason: collision with root package name */
    @Y61.k
    public final C35838l3 f76303O0;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.component.toast.util.c f76304P;

    /* renamed from: P0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_details_items.toast_item_popularity.a f76305P0;

    /* renamed from: P2, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super AdvertDetailsStyle, kotlin.G0> f76306P2;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.credits.q f76307Q;

    /* renamed from: Q0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC50374a f76308Q0;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.credits.k f76309R;

    /* renamed from: R0, reason: collision with root package name */
    @Y61.k
    public final ZL.a f76310R0;

    /* renamed from: S, reason: collision with root package name */
    public final boolean f76311S;

    /* renamed from: S0, reason: collision with root package name */
    @Y61.k
    public final u3.f<CrossFadeOpenAbTestGroup> f76312S0;

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public final C29640d f76313T;

    /* renamed from: T0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f76314T0;

    /* renamed from: U, reason: collision with root package name */
    @Y61.k
    public final UN.a f76315U;

    /* renamed from: U0, reason: collision with root package name */
    @Y61.l
    public AtomicReference f76316U0;

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final C43624b f76317V;

    /* renamed from: V0, reason: collision with root package name */
    @Y61.l
    public C41962k f76318V0;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final InterfaceC25420a f76319W;

    /* renamed from: W0, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.y f76320W0;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_core.short_term_rent.a f76321X;

    /* renamed from: X0, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.y f76322X0;

    /* renamed from: X1, reason: collision with root package name */
    public boolean f76323X1;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advertising.kebab.n f76324Y;

    /* renamed from: Y0, reason: collision with root package name */
    @Y61.l
    public kotlinx.coroutines.N0 f76325Y0;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.favorite_apprater.g f76326Z;

    /* renamed from: Z0, reason: collision with root package name */
    @Y61.l
    public Z0 f76327Z0;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_collection_toast.b f76328a0;

    /* renamed from: a1, reason: collision with root package name */
    public boolean f76329a1;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.preloading.j<com.avito.android.advert.item.preload.f, AdvertDetailsWithMeta> f76330b;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.services_repair.a f76331b0;

    /* renamed from: b1, reason: collision with root package name */
    public boolean f76332b1;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27797i f76333c;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f76334c0;

    /* renamed from: c1, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f76335c1;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C27689b f76336d;

    /* renamed from: d0, reason: collision with root package name */
    @Y61.k
    public final W9.c f76337d0;

    /* renamed from: d1, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.y f76338d1;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final z7.b f76339e;

    /* renamed from: e0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.leasing_calculator.m f76340e0;

    /* renamed from: e1, reason: collision with root package name */
    @Y61.l
    public com.avito.android.advert.item.creditinfo.buzzoola.v f76341e1;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28265d f76342f;

    /* renamed from: f0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.icebreakers.d f76343f0;

    /* renamed from: f1, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsWithMeta f76344f1;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28173a f76345g;

    /* renamed from: g0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.icebreakers_redesign.d f76346g0;

    /* renamed from: g1, reason: collision with root package name */
    public boolean f76347g1;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_core.safedeal.trust_factors.a f76348h;

    /* renamed from: h0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.service_order_request.n f76349h0;

    /* renamed from: h1, reason: collision with root package name */
    @Y61.l
    public I1 f76350h1;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28280j f76351i;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final C28124e0 f76352i0;

    /* renamed from: i1, reason: collision with root package name */
    @Y61.k
    public String f76353i1;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28243x f76354j;

    /* renamed from: j0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.ownership_cost.f f76355j0;

    /* renamed from: j1, reason: collision with root package name */
    @Y61.k
    public final kotlinx.coroutines.flow.Z1<com.avito.android.ui.status_bar.d> f76356j1;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.a f76357k;

    /* renamed from: k0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.delayed_ux_feedback.d f76358k0;

    /* renamed from: k1, reason: collision with root package name */
    @Y61.k
    public final kotlinx.coroutines.flow.n2<com.avito.android.ui.status_bar.d> f76359k1;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.commercials.f f76360l;

    /* renamed from: l0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.R0 f76361l0;

    /* renamed from: l1, reason: collision with root package name */
    @Y61.k
    public final C43238h f76362l1;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final S f76363m;

    /* renamed from: m0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27811a f76364m0;

    /* renamed from: m1, reason: collision with root package name */
    @Y61.l
    public kotlinx.coroutines.N0 f76365m1;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.account.E f76366n;

    /* renamed from: n0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.consultation.J f76367n0;

    /* renamed from: n1, reason: collision with root package name */
    public boolean f76368n1;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final String f76369o;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28164a f76370o0;

    /* renamed from: o1, reason: collision with root package name */
    @Y61.k
    public final C43238h f76371o1;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public final Integer f76372p;

    /* renamed from: p0, reason: collision with root package name */
    @Y61.l
    public final String f76373p0;

    /* renamed from: p1, reason: collision with root package name */
    @Y61.k
    public final C43238h f76374p1;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public final String f76375q;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.k
    public final ScreenSource f76376q0;

    /* renamed from: q1, reason: collision with root package name */
    @Y61.l
    public kotlinx.coroutines.N0 f76377q1;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final AdvertDetailsFastOpenParams f76378r;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13095a f76379r0;

    /* renamed from: r1, reason: collision with root package name */
    @Y61.l
    public kotlinx.coroutines.N0 f76380r1;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public final AdvertDetailsMultiItemState f76381s;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.properties.f f76382s0;

    /* renamed from: s1, reason: collision with root package name */
    @Y61.k
    public final C43238h f76383s1;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public final PreloadCacheKey f76384t;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49780b f76385t0;

    /* renamed from: t1, reason: collision with root package name */
    @Y61.l
    public kotlinx.coroutines.N0 f76386t1;

    /* renamed from: u, reason: collision with root package name */
    public final long f76387u;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final w7.b f76388u0;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.U f76389v;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.safedeal.trust_factors.a f76390v0;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f76391w;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final B2 f76392w0;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_details_items.sellerprofile.U f76393x;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.hotel.hotel_offer.m f76394x0;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.favorite.n f76395y;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.compatibility.v2.f f76396y0;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.note.c f76397z;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.compatibility.v3.k f76398z0;

    /* compiled from: AdvertDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/advert_core/advert/AdvertDetailsWithMeta;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/advert_core/advert/AdvertDetailsWithMeta;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.item.i0$a */
    public static final class a<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T> f76399b = new a<>();

        @Override // l41.g
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* compiled from: AdvertDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.item.i0$b */
    public static final class b<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T> f76400b = new b<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("AdvertDetailsPresenter", "Error advertObservable", (Throwable) obj);
        }
    }

    /* compiled from: AdvertDetailsPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert.item.i0$c */
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f76401a;

        static {
            int[] iArr = new int[AdvertCvPhoneActualizationActionType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AdvertCvPhoneActualizationActionType advertCvPhoneActualizationActionType = AdvertCvPhoneActualizationActionType.f75029b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[ExpandSource.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            f76401a = iArr2;
        }
    }

    /* compiled from: AdvertDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/remote/model/OwnershipCostResponse;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.item.i0$d */
    public static final class d<T> implements l41.g {
        public d() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            S sO2;
            P2 p22 = (P2) obj;
            boolean z12 = p22 instanceof P2.b;
            C28136i0 c28136i0 = C28136i0.this;
            if (z12) {
                c28136i0.b1();
            } else {
                if (!(p22 instanceof P2.a) || (sO2 = c28136i0.o2(c28136i0.n2())) == null) {
                    return;
                }
                sO2.x();
            }
        }
    }

    /* compiled from: AdvertDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.item.i0$e */
    public static final class e<T> implements l41.g {
        public e() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            C28136i0 c28136i0 = C28136i0.this;
            io.reactivex.rxjava3.core.I<Set<InterfaceC32897n0>> iH2 = c28136i0.f76302O.h();
            P0 p02 = new P0(c28136i0);
            iH2.getClass();
            c28136i0.f76335c1.b(iH2.x(p02, io.reactivex.rxjava3.internal.functions.a.f401996f));
        }
    }

    /* compiled from: AdvertDetailsPresenter.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert.item.AdvertDetailsPresenterImpl$closePpRecallBanner$1", f = "AdvertDetailsPresenter.kt", i = {}, l = {1014}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.advert.item.i0$f */
    public static final class f extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f76404q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ AdvertDetailsPpRecallPromoItem f76405r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ C28136i0 f76406s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(AdvertDetailsPpRecallPromoItem advertDetailsPpRecallPromoItem, C28136i0 c28136i0, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f76405r = advertDetailsPpRecallPromoItem;
            this.f76406s = c28136i0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new f(this.f76405r, this.f76406s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((f) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f76404q;
            if (i12 == 0) {
                C42729a0.b(obj);
                CloseBannerPayload closeBannerPayload = this.f76405r.f83925m;
                com.avito.android.advert_core.pp_recall_promo.close_banners.a aVar = this.f76406s.f76291I0;
                String id2 = closeBannerPayload.getId();
                String position = closeBannerPayload.getPosition();
                String page = closeBannerPayload.getPage();
                this.f76404q = 1;
                if (aVar.a(id2, position, page, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: AdvertDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert.item.AdvertDetailsPresenterImpl$handleRatingLLMSummaryButtonClick$1", f = "AdvertDetailsPresenter.kt", i = {}, l = {2618}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.advert.item.i0$g */
    public static final class g extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f76407q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ long f76409s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(long j12, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f76409s = j12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return C28136i0.this.new g(this.f76409s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((g) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f76407q;
            if (i12 == 0) {
                C42729a0.b(obj);
                com.avito.android.rating_persistence.llm_summary.h hVar = C28136i0.this.f76285G0;
                this.f76407q = 1;
                if (hVar.c(this.f76409s, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: AdvertDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert.item.AdvertDetailsPresenterImpl$onCvPhoneActualizationButtonClicked$1", f = "AdvertDetailsPresenter.kt", i = {}, l = {2543, 2544}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.advert.item.i0$h */
    public static final class h extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f76410q;

        /* compiled from: AdvertDetailsPresenter.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.advert.item.AdvertDetailsPresenterImpl$onCvPhoneActualizationButtonClicked$1$1", f = "AdvertDetailsPresenter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.advert.item.i0$h$a */
        public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ TypedResult<FP.a> f76412q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ C28136i0 f76413r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(TypedResult<FP.a> typedResult, C28136i0 c28136i0, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f76412q = typedResult;
                this.f76413r = c28136i0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new a(this.f76412q, this.f76413r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                TypedResult<FP.a> typedResult = this.f76412q;
                boolean z12 = typedResult instanceof TypedResult.Success;
                C28136i0 c28136i0 = this.f76413r;
                if (z12) {
                    S sO2 = c28136i0.o2(c28136i0.n2());
                    if (sO2 != null) {
                        sO2.w();
                    }
                    c28136i0.j(((FP.a) ((TypedResult.Success) typedResult).getResult()).getText());
                } else if (typedResult instanceof TypedResult.Error) {
                    ApiException apiExceptionA = C35936s.a(((TypedResult.Error) typedResult).getError(), null);
                    if (K5.b(apiExceptionA)) {
                        com.avito.android.component.toast.util.c cVar = c28136i0.f76304P;
                        PrintableText printableTextF = com.avito.android.printable_text.b.f(apiExceptionA.getMessage());
                        f.c.f125255c.getClass();
                        c.a.a(cVar, printableTextF, 0, null, null, ToastBarPosition.f181046d, f.c.a.b(), 62);
                    } else {
                        com.avito.android.component.toast.util.c cVar2 = c28136i0.f76304P;
                        f.c.f125255c.getClass();
                        c.a.a(cVar2, null, R.string.advert_details_cv_actualization_error, null, null, ToastBarPosition.f181046d, f.c.a.b(), 61);
                        V2.f318762a.a("AdvertDetailsPresenter", "Unknown error when executing \"keepCurrentCvPhone\" request.", apiExceptionA);
                    }
                }
                return kotlin.G0.f406611a;
            }
        }

        public h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return C28136i0.this.new h(continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((h) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f76410q;
            C28136i0 c28136i0 = C28136i0.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC27797i interfaceC27797i = c28136i0.f76333c;
                this.f76410q = 1;
                obj = interfaceC27797i.d(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return kotlin.G0.f406611a;
                }
                C42729a0.b(obj);
            }
            AbstractC43129d1 abstractC43129d1B = c28136i0.f76361l0.b();
            a aVar = new a((TypedResult) obj, c28136i0, null);
            this.f76410q = 2;
            if (C43259k.g(abstractC43129d1B, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: AdvertDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/cv_state/CvState;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/cv_state/CvState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.item.i0$i */
    public static final class i<T> implements l41.g {
        public i() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            CvState cvState = (CvState) obj;
            C28136i0 c28136i0 = C28136i0.this;
            S sO2 = c28136i0.o2(c28136i0.n2());
            if (sO2 != null) {
                sO2.n(cvState, false);
            }
        }
    }

    /* compiled from: AdvertDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.item.i0$j */
    public static final class j<T> implements l41.g {
        public j() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            Throwable th2 = (Throwable) obj;
            C28136i0.k2(C28136i0.this, th2);
            V2.f318762a.f(th2);
        }
    }

    /* compiled from: AdvertDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.item.i0$k */
    public static final class k extends kotlin.jvm.internal.N implements Y41.l<Throwable, kotlin.G0> {
        public k() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Throwable th2) {
            Throwable th3 = th2;
            C28136i0 c28136i0 = C28136i0.this;
            I1 i12 = c28136i0.f76350h1;
            if (i12 != null) {
                i12.R(false, false);
            }
            I1 i13 = c28136i0.f76350h1;
            if (i13 != null) {
                i13.W(com.avito.android.error.z.n(th3));
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: AdvertDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/rx3/h;", "Lcom/avito/android/advert_core/advert/AdvertDetailsWithMeta;", "progress", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/util/rx3/h;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.item.i0$l */
    public static final class l extends kotlin.jvm.internal.N implements Y41.l<AbstractC35899h<? extends AdvertDetailsWithMeta>, kotlin.G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f76418m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ ModificationItem f76419n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f76420o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ AdvertDetailsStyle f76421p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ AdvertNavBarStyle f76422q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, ModificationItem modificationItem, String str2, AdvertDetailsStyle advertDetailsStyle, AdvertNavBarStyle advertNavBarStyle) {
            super(1);
            this.f76418m = str;
            this.f76419n = modificationItem;
            this.f76420o = str2;
            this.f76421p = advertDetailsStyle;
            this.f76422q = advertNavBarStyle;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
        @Override // Y41.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(com.avito.android.util.rx3.AbstractC35899h<? extends com.avito.android.advert_core.advert.AdvertDetailsWithMeta> r21) {
            /*
                Method dump skipped, instructions count: 245
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.C28136i0.l.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: AdvertDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/advert_details_items/neighboring_dates/AdvertDetailsNeighboringDatesItem;", "item", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/advert_details_items/neighboring_dates/AdvertDetailsNeighboringDatesItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.item.i0$m */
    public static final class m extends kotlin.jvm.internal.N implements Y41.l<AdvertDetailsNeighboringDatesItem, kotlin.G0> {
        public m() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(AdvertDetailsNeighboringDatesItem advertDetailsNeighboringDatesItem) {
            C28136i0.this.f76363m.e(advertDetailsNeighboringDatesItem);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: AdvertDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/advert_core/safedeal/trust_factors/TrustFactorsComponent$CombinedButtons;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert.item.i0$n */
    public static final class n extends kotlin.jvm.internal.N implements Y41.l<TrustFactorsComponent.CombinedButtons, TrustFactorsComponent.CombinedButtons> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ CombinedButtonType f76424l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ boolean f76425m;

        /* compiled from: AdvertDetailsPresenter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.advert.item.i0$n$a */
        public /* synthetic */ class a {
            static {
                int[] iArr = new int[CombinedButtonType.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    Parcelable.Creator<CombinedButtonType> creator = CombinedButtonType.CREATOR;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    Parcelable.Creator<CombinedButtonType> creator2 = CombinedButtonType.CREATOR;
                    iArr[2] = 3;
                } catch (NoSuchFieldError unused3) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(CombinedButtonType combinedButtonType, boolean z12) {
            super(1);
            this.f76424l = combinedButtonType;
            this.f76425m = z12;
        }

        @Override // Y41.l
        public final TrustFactorsComponent.CombinedButtons invoke(TrustFactorsComponent.CombinedButtons combinedButtons) {
            TrustFactorsComponent.CombinedButtons combinedButtons2 = combinedButtons;
            int iOrdinal = this.f76424l.ordinal();
            boolean z12 = this.f76425m;
            if (iOrdinal == 0) {
                SafeDeal.Component.CombinedButtons combinedButtons3 = combinedButtons2.f84259b;
                return TrustFactorsComponent.CombinedButtons.a(combinedButtons2, SafeDeal.Component.CombinedButtons.a(combinedButtons3, SafeDeal.Component.CombinedButtons.BuyButton.a(combinedButtons3.getBuyButton(), Boolean.valueOf(z12)), null, null, 59));
            }
            SafeDeal.Component.CombinedButtons combinedButtons4 = combinedButtons2.f84259b;
            if (iOrdinal == 1) {
                return TrustFactorsComponent.CombinedButtons.a(combinedButtons2, SafeDeal.Component.CombinedButtons.a(combinedButtons4, null, SafeDeal.Component.CombinedButtons.CartButton.a(combinedButtons4.getCartButton(), SafeDeal.Component.CombinedButtons.CartButton.AddToCartButton.a(combinedButtons4.getCartButton().getAddToCartButton(), Boolean.valueOf(z12)), null, 0, 0, 30), null, 55));
            }
            if (iOrdinal == 2) {
                return TrustFactorsComponent.CombinedButtons.a(combinedButtons2, SafeDeal.Component.CombinedButtons.a(combinedButtons4, null, SafeDeal.Component.CombinedButtons.CartButton.a(combinedButtons4.getCartButton(), null, SafeDeal.Component.CombinedButtons.CartButton.GoToCartButton.a(combinedButtons4.getCartButton().getGoToCartButton(), Boolean.valueOf(z12)), 0, 0, 29), null, 55));
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: AdvertDetailsPresenter.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/avito/android/advert_core/safedeal/trust_factors/TrustFactorsComponent;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert.item.i0$o */
    public static final class o extends kotlin.jvm.internal.N implements Y41.l<List<? extends TrustFactorsComponent>, List<? extends TrustFactorsComponent>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f76426l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ boolean f76427m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str, boolean z12) {
            super(1);
            this.f76426l = str;
            this.f76427m = z12;
        }

        @Override // Y41.l
        public final List<? extends TrustFactorsComponent> invoke(List<? extends TrustFactorsComponent> list) {
            List<? extends TrustFactorsComponent> list2 = list;
            ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
            for (TrustFactorsComponent button : list2) {
                if (kotlin.jvm.internal.L.f(button.getF84275c(), this.f76426l) && (button instanceof TrustFactorsComponent.Button)) {
                    TrustFactorsComponent.Button button2 = (TrustFactorsComponent.Button) button;
                    button = new TrustFactorsComponent.Button(SafeDeal.Component.Button.a(button2.f84257b, Boolean.valueOf(this.f76427m)), button2.f84258c);
                }
                arrayList.add(button);
            }
            return arrayList;
        }
    }

    /* compiled from: AdvertDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.item.i0$p */
    public static final class p extends kotlin.jvm.internal.N implements Y41.l<Throwable, kotlin.G0> {
        public p() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Throwable th2) {
            C28136i0.k2(C28136i0.this, th2);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: AdvertDetailsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/advert_core/advert/AdvertDetailsWithMeta;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/advert_core/advert/AdvertDetailsWithMeta;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.item.i0$q */
    public static final class q extends kotlin.jvm.internal.N implements Y41.l<AdvertDetailsWithMeta, kotlin.G0> {
        public q() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v19, types: [T, android.widget.LinearLayout] */
        @Override // Y41.l
        public final kotlin.G0 invoke(AdvertDetailsWithMeta advertDetailsWithMeta) {
            AdvertDetailsStyle advertDetailsStyleB;
            I1 i12;
            AdvertDetailsFastOpenParams advertDetailsFastOpenParams;
            io.reactivex.rxjava3.disposables.c cVar;
            InterfaceC35745a5 interfaceC35745a5;
            C28136i0 c28136i0;
            AdvertDetails advertDetails;
            String str;
            C28136i0 c28136i02;
            ItemReviewsHeader ratingPreview;
            ItemPopularity itemPopularity;
            AdvertShortTermRent.NeighboringDates neighboringDates;
            String title;
            AdvertShortTermRent shortTermRent;
            AdvertShortTermRent.NeighboringDates neighboringDates2;
            String context;
            AdvertShortTermRent.Actions actions;
            SimpleAction changedDates;
            DeepLink deeplink;
            I1 i13;
            AdvertDetailsWithMeta advertDetailsWithMeta2 = advertDetailsWithMeta;
            AdvertDetails advertDetails2 = advertDetailsWithMeta2.f82645b;
            AdvertDetails.AdvertisementStyle advertisementStyle = advertDetails2.getAdvertisementStyle();
            if (advertisementStyle != null) {
                C28131g1.f75660a.getClass();
                advertDetailsStyleB = C28131g1.b(advertisementStyle);
            } else {
                advertDetailsStyleB = null;
            }
            if (advertDetailsStyleB == null) {
                advertDetailsStyleB = AdvertDetailsStyle.f84409c;
            }
            AdvertDetailsStyle advertDetailsStyle = advertDetailsStyleB;
            com.avito.android.advert.advert_details_style.b bVarA = com.avito.android.advert.advert_details_style.c.a(advertDetailsStyle);
            C28136i0 c28136i03 = C28136i0.this;
            com.avito.android.advert.advert_details_style.b bVarA2 = com.avito.android.advert.advert_details_style.c.a(c28136i03.f76378r.f71332i);
            BottomNavigationSpace bottomNavigationSpace = bVarA.f68643l;
            BottomNavigationSpace bottomNavigationSpace2 = bVarA2.f68643l;
            AdvertDetailsFastOpenParams advertDetailsFastOpenParams2 = c28136i03.f76378r;
            if (bottomNavigationSpace != bottomNavigationSpace2) {
                Z0 z02 = c28136i03.f76327Z0;
                if (z02 != null) {
                    AdvertDetailsFastOpenParams advertDetailsFastOpenParams3 = new AdvertDetailsFastOpenParams(advertDetailsFastOpenParams2.f71325b, advertDetailsFastOpenParams2.f71326c, advertDetailsFastOpenParams2.f71327d, advertDetailsFastOpenParams2.f71328e, advertDetailsFastOpenParams2.f71329f, advertDetailsFastOpenParams2.f71330g, advertDetailsFastOpenParams2.f71331h, advertDetailsStyle, advertDetailsFastOpenParams2.f71333j, advertDetailsFastOpenParams2.f71334k, advertDetailsFastOpenParams2.f71335l, advertDetailsFastOpenParams2.f71336m, advertDetailsFastOpenParams2.f71337n);
                    TreeClickStreamParent treeClickStreamParentQ5 = c28136i03.f76272A.Q5(false);
                    I1 i14 = c28136i03.f76350h1;
                    Parcelable parcelableK = i14 != null ? i14.K() : null;
                    PreloadCacheKey preloadCacheKeyB = c28136i03.f76352i0.b(advertDetailsWithMeta2);
                    ActivityC22955m activityC22955m = z02.f72292A;
                    if (activityC22955m != null) {
                        AdvertDetailsArguments advertDetailsArguments = new AdvertDetailsArguments(c28136i03.f76369o, c28136i03.f76372p, c28136i03.f76375q, advertDetailsFastOpenParams3, treeClickStreamParentQ5, SystemClock.elapsedRealtime(), null, ScreenSource.ADVERT.f251774d, null, null, null, parcelableK, preloadCacheKeyB, 1536, null);
                        if (activityC22955m instanceof AdvertDetailsActivity) {
                            AdvertDetailsFragment.f71351B5.getClass();
                            AdvertDetailsFragment advertDetailsFragmentA = AdvertDetailsFragment.C27803a.a(advertDetailsArguments);
                            androidx.fragment.app.H hE2 = ((AdvertDetailsActivity) activityC22955m).getSupportFragmentManager().e();
                            hE2.n(R.id.fragment_container, advertDetailsFragmentA, "AdvertDetailsFragment");
                            hE2.f();
                        } else {
                            AdvertDetailsFragment advertDetailsFragment = z02.f72298c;
                            NavigationTabSetItem navigationTabSetItemQ5 = advertDetailsFragment.q5();
                            if (navigationTabSetItemQ5 == null) {
                                navigationTabSetItemQ5 = NavigationTab.f106970f;
                            }
                            com.avito.android.bottom_navigation.N n12 = new com.avito.android.bottom_navigation.N(new AdvertDetailsFragmentData(advertDetailsArguments, navigationTabSetItemQ5, null, 4, null));
                            C28885g c28885g = ((BottomNavigationFragment) advertDetailsFragment.y5()).f162252H0;
                            if (c28885g != null) {
                                ((com.avito.android.home.bottom_navigation.n) BottomNavigationFragment.this.requireActivity()).s0(n12);
                            }
                        }
                    }
                }
            } else {
                c28136i03.l2(advertDetailsWithMeta2);
                if (c28136i03.f76381s == null && !c28136i03.f76323X1 && !c28136i03.f76289H2 && (i13 = c28136i03.f76350h1) != null) {
                    d2.a.b(0, 0, 14, i13);
                }
                AdvertDetailsBusiness360 business360 = advertDetails2.getBusiness360();
                AdvertDetailsBusiness360.Toast toast = business360 != null ? business360.getToast() : null;
                if (toast != null) {
                    c28136i03.f76288H1 = C43259k.d(kotlinx.coroutines.U.a(c28136i03.f76361l0.b()), null, null, new C28219w0(c28136i03, toast, null), 3);
                }
                AdvertPoll poll = advertDetails2.getPoll();
                io.reactivex.rxjava3.disposables.c cVar2 = c28136i03.f76314T0;
                InterfaceC35745a5 interfaceC35745a52 = c28136i03.f76391w;
                if (poll != null) {
                    cVar2.b(io.reactivex.rxjava3.core.z.F0(poll.getDelay(), TimeUnit.MILLISECONDS, interfaceC35745a52.c()).j0(interfaceC35745a52.e()).t0(new C28228z0(c28136i03, poll)));
                }
                EarlyAccessBanner earlyAccessBanner = advertDetails2.getEarlyAccessBanner();
                if (earlyAccessBanner == null || (i12 = c28136i03.f76350h1) == null) {
                    advertDetails = advertDetails2;
                    cVar = cVar2;
                    c28136i0 = c28136i03;
                    interfaceC35745a5 = interfaceC35745a52;
                    advertDetailsFastOpenParams = advertDetailsFastOpenParams2;
                    str = "null cannot be cast to non-null type android.widget.TextView";
                } else {
                    String title2 = earlyAccessBanner.getTitle();
                    String subtitle = earlyAccessBanner.getSubtitle();
                    Image bannerImage = earlyAccessBanner.getBannerImage();
                    Boolean hasAction = earlyAccessBanner.getHasAction();
                    boolean zBooleanValue = hasAction != null ? hasAction.booleanValue() : false;
                    com.avito.android.lib.design.toast_bar.k kVar = i12.f71682V0;
                    if (kVar != null) {
                        kVar.f();
                    }
                    H1 h12 = new H1(i12);
                    RecyclerView recyclerView = i12.f71750x0;
                    ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(recyclerView.getContext(), R.style.Theme_DesignSystem_Re23);
                    int iB2 = y6.b(40);
                    int iB3 = y6.b(12);
                    int iB4 = y6.b(20);
                    a.C0407a c0407a = HV.a.f7100w;
                    advertDetailsFastOpenParams = advertDetailsFastOpenParams2;
                    int iJ2 = C35835l0.j(R.attr.toastBarDefaultInverse, contextThemeWrapper);
                    c0407a.getClass();
                    HV.a aVarA = HV.a.a(a.C0407a.b(iJ2, contextThemeWrapper), iB3, iB3, 0, 0, 4178047);
                    cVar = cVar2;
                    int iB5 = y6.b(8);
                    interfaceC35745a5 = interfaceC35745a52;
                    int iB6 = y6.b(12);
                    c28136i0 = c28136i03;
                    advertDetails = advertDetails2;
                    SimpleDraweeView simpleDraweeView = new SimpleDraweeView(recyclerView.getContext());
                    simpleDraweeView.setLayoutParams(new ViewGroup.LayoutParams(iB2, iB2));
                    ImageRequest.a aVarA2 = C35949t5.a(simpleDraweeView);
                    aVarA2.d(com.avito.android.image_loader.b.b(bannerImage));
                    aVarA2.c();
                    int i15 = ((((recyclerView.getResources().getDisplayMetrics().widthPixels - aVarA.f7117q) - aVarA.f7118r) - (iB3 * 2)) - iB2) - iB4;
                    View viewInflate = LayoutInflater.from(contextThemeWrapper).inflate(R.layout.early_access_toast_content, (ViewGroup) null, false);
                    View viewFindViewById = viewInflate.findViewById(R.id.title);
                    if (viewFindViewById == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                    }
                    ((TextView) viewFindViewById).setText(title2);
                    View viewFindViewById2 = viewInflate.findViewById(R.id.subtitle);
                    if (viewFindViewById2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                    }
                    I5.a((TextView) viewFindViewById2, subtitle, false);
                    viewInflate.setOnTouchListener(null);
                    viewInflate.setLayoutParams(new LinearLayout.LayoutParams(i15, -2));
                    viewInflate.setPadding(iB5, viewInflate.getPaddingTop(), iB6, viewInflate.getPaddingBottom());
                    kotlin.collections.builders.b bVarT = C42745f0.t();
                    bVarT.add(simpleDraweeView);
                    bVarT.add(viewInflate);
                    if (zBooleanValue) {
                        AppCompatImageView appCompatImageView = new AppCompatImageView(contextThemeWrapper);
                        appCompatImageView.setImageDrawable(C35835l0.m(contextThemeWrapper, R.attr.ic_arrowRight20, R.attr.black));
                        bVarT.add(appCompatImageView);
                    }
                    com.avito.android.lib.design.toast_bar.k kVarD = IV.a.d(recyclerView, new ToastBarState(com.avito.android.printable_text.b.a(), null, ToastBarPosition.f181046d, C42745f0.p(bVarT), null, null, null, 5000, false, false, null, null, 3954, null), aVarA);
                    if (zBooleanValue) {
                        kVarD.setOnClickListener(new com.avito.android.verification.verification_input_inn.o(22, h12, kVarD));
                        kVarD.setOnTouchListener(null);
                    }
                    i12.f71682V0 = kVarD;
                    str = "null cannot be cast to non-null type android.widget.TextView";
                }
                AdditionalSeller additionalSeller = advertDetails.getAdditionalSeller();
                if (additionalSeller != null) {
                    ratingPreview = additionalSeller.getRatingPreview();
                    c28136i02 = c28136i0;
                } else {
                    c28136i02 = c28136i0;
                    ratingPreview = null;
                }
                C29640d c29640d = c28136i02.f76313T;
                c29640d.getClass();
                kotlin.reflect.n<Object> nVar = C29640d.f132175X[23];
                if (((Boolean) c29640d.f132220w.a().invoke()).booleanValue()) {
                    if ((ratingPreview != null ? ratingPreview.getOnboarding() : null) != null && !c28136i02.f76301N0.b("key_house_reviews_onboarding_shown") && (deeplink = ratingPreview.getDeeplink()) != null) {
                        cVar.b(io.reactivex.rxjava3.core.z.F0(1L, TimeUnit.SECONDS, interfaceC35745a5.c()).j0(interfaceC35745a5.e()).t0(new C28225y0(c28136i02, deeplink, ratingPreview)));
                    }
                }
                DeepLink onAdvertLoadedDeepLink = advertDetails.getOnAdvertLoadedDeepLink();
                if (onAdvertLoadedDeepLink != null) {
                    b.a.a(c28136i02.f76334c0, onAdvertLoadedDeepLink, null, null, 6);
                }
                if (c28136i02.f76323X1) {
                    I1 i16 = c28136i02.f76350h1;
                    if (i16 != null) {
                        AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
                        i16.d((14 & 2) != 0 ? 0 : 200, String.valueOf(46));
                    }
                    c28136i02.f76323X1 = false;
                }
                if (c28136i02.f76289H2) {
                    I1 i17 = c28136i02.f76350h1;
                    if (i17 != null) {
                        AdvertDetailsItem advertDetailsItem2 = AdvertDetailsItem.f82525b;
                        i17.d((14 & 2) != 0 ? 0 : 200, String.valueOf(210));
                    }
                    c28136i02.f76289H2 = false;
                }
                c28136i02.f76308Q0.a(advertDetailsFastOpenParams.f71336m);
                Long lZ02 = C43066x.z0(c28136i02.f76369o);
                if (lZ02 != null) {
                    long jLongValue = lZ02.longValue();
                    AdvertShortTermRent shortTermRent2 = advertDetails.getShortTermRent();
                    if (shortTermRent2 != null && (neighboringDates = shortTermRent2.getNeighboringDates()) != null && (title = neighboringDates.getTitle()) != null && (shortTermRent = advertDetails.getShortTermRent()) != null && (neighboringDates2 = shortTermRent.getNeighboringDates()) != null && (context = neighboringDates2.getContext()) != null) {
                        AdvertShortTermRent shortTermRent3 = advertDetails.getShortTermRent();
                        c28136i02.f76293J0.a(jLongValue, title, (shortTermRent3 == null || (actions = shortTermRent3.getActions()) == null || (changedDates = actions.getChangedDates()) == null) ? null : new d.a(changedDates.getTitle(), changedDates.getUri()), new C28213u0(c28136i02));
                        c28136i02.f76293J0.c(context);
                    }
                }
                AdvertShortTermRent shortTermRent4 = advertDetails.getShortTermRent();
                if (shortTermRent4 != null && (itemPopularity = shortTermRent4.getItemPopularity()) != null) {
                    com.avito.android.advert_details_items.toast_item_popularity.a aVar = c28136i02.f76305P0;
                    if (aVar.b()) {
                        I1 i18 = c28136i02.f76350h1;
                        if (i18 != null) {
                            l0.h hVar = new l0.h();
                            if (i18.f71644C0 == null) {
                                ?? r52 = (LinearLayout) i18.f71752y0.inflate();
                                hVar.f406842b = r52;
                                i18.f71644C0 = r52;
                            }
                            LinearLayout linearLayout = (LinearLayout) hVar.f406842b;
                            if (linearLayout != null) {
                                if (!linearLayout.isLaidOut() || linearLayout.isLayoutRequested()) {
                                    linearLayout.addOnLayoutChangeListener(new K1(hVar, i18, itemPopularity));
                                } else {
                                    View viewFindViewById3 = ((View) hVar.f406842b).findViewById(R.id.toast_item_popularity_text);
                                    if (viewFindViewById3 == null) {
                                        throw new NullPointerException(str);
                                    }
                                    TextView textView = (TextView) viewFindViewById3;
                                    View viewFindViewById4 = ((View) hVar.f406842b).findViewById(R.id.toast_item_popularity_icon);
                                    if (viewFindViewById4 == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.animation.AnimationView");
                                    }
                                    AnimationView animationView = (AnimationView) viewFindViewById4;
                                    String lottieLightUrl = com.avito.android.lib.util.darkTheme.c.b(i18.f71740s0) ? itemPopularity.getImage().getLottieLightUrl() : itemPopularity.getImage().getLottieDarkUrl();
                                    animationView.setRepeatMode(AnimationView.RepeatMode.f178282c);
                                    animationView.setAnimationData(new AnimationView.a.e(lottieLightUrl, null, null, 6, null));
                                    com.avito.android.util.text.j.a(textView, itemPopularity.getToastText(), null);
                                    long toastTimeDelay = itemPopularity.getToastTimeDelay();
                                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(i18.f71644C0, (Property<LinearLayout, Float>) View.TRANSLATION_Y, 0.0f, (-((LinearLayout) hVar.f406842b).getHeight()) - y6.b(12));
                                    objectAnimatorOfFloat.setDuration(400L);
                                    objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                                    View view = (View) hVar.f406842b;
                                    com.avito.android.util.R0 r02 = i18.f71708g;
                                    Z1.a(view, 1000L, r02.b(), new L1(hVar, objectAnimatorOfFloat));
                                    Z1.a((View) hVar.f406842b, 1400 + toastTimeDelay, r02.b(), new M1(objectAnimatorOfFloat));
                                    Z1.a((View) hVar.f406842b, toastTimeDelay + 1800, r02.b(), new N1(hVar));
                                }
                            }
                        }
                        aVar.a();
                    }
                }
            }
            return kotlin.G0.f406611a;
        }
    }

    @Inject
    public C28136i0(@Y61.k com.avito.android.preloading.j<com.avito.android.advert.item.preload.f, AdvertDetailsWithMeta> jVar, @Y61.k InterfaceC27797i interfaceC27797i, @Y61.k C27689b c27689b, @Y61.k z7.b bVar, @Y61.k InterfaceC28265d interfaceC28265d, @Y61.k InterfaceC28173a interfaceC28173a, @Y61.k com.avito.android.advert_core.safedeal.trust_factors.a aVar, @Y61.k InterfaceC28280j interfaceC28280j, @Y61.k InterfaceC28243x interfaceC28243x, @Y61.k com.avito.android.advert.item.similars.a aVar2, @Y61.k com.avito.android.advert.item.commercials.f fVar, @Y61.k S s5, @Y61.k com.avito.android.account.E e12, @Y61.k @InterfaceC30174s String str, @Y61.l @InterfaceC30098l Integer num, @C27710t.InterfaceC2166t @Y61.l String str2, @Y61.k AdvertDetailsFastOpenParams advertDetailsFastOpenParams, @Y61.l AdvertDetailsMultiItemState advertDetailsMultiItemState, @Y61.l PreloadCacheKey preloadCacheKey, long j12, @Y61.k com.avito.android.util.U u12, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.advert_details_items.sellerprofile.U u13, @Y61.k com.avito.android.favorite.n nVar, @Y61.k com.avito.android.advert.item.note.c cVar, @Y61.k com.avito.android.advert_core.analytics.a aVar3, @Y61.k G5.a aVar4, @Y61.k InterfaceC42678a interfaceC42678a, @Y61.k A7.b bVar2, @Y61.k com.avito.android.analytics.screens.tracker.Q q12, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.autoteka.data.a aVar5, @Y61.k AK0.l lVar, @Y61.k X9.b bVar3, @Y61.k kotlinx.coroutines.flow.d2<vC.b> d2Var, @Y61.k io.reactivex.rxjava3.core.z<com.avito.android.rating_ui.button.a> zVar, @Y61.k io.reactivex.rxjava3.core.z<com.avito.android.rating_ui.badge_score.b> zVar2, @Y61.k io.reactivex.rxjava3.core.z<com.avito.android.rating_ui.badge_score.k> zVar3, @Y61.k io.reactivex.rxjava3.core.z<com.avito.android.rating_ui.attributed_text.b> zVar4, @Y61.k InterfaceC34162r0 interfaceC34162r0, @Y61.k com.avito.android.component.toast.util.c cVar2, @Y61.k com.avito.android.credits.q qVar, @Y61.k com.avito.android.credits.k kVar, @C27710t.q boolean z12, @Y61.k C29640d c29640d, @Y61.k UN.a aVar6, @Y61.k C43624b c43624b, @Y61.k InterfaceC25420a interfaceC25420a, @Y61.k com.avito.android.advert_core.short_term_rent.a aVar7, @Y61.k com.avito.android.advertising.kebab.n nVar2, @Y61.k com.avito.android.favorite_apprater.g gVar, @Y61.k com.avito.android.advert_collection_toast.b bVar4, @Y61.k com.avito.android.advert.item.services_repair.a aVar8, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar9, @Y61.k W9.c cVar3, @Y61.k com.avito.android.leasing_calculator.m mVar, @Y61.k com.avito.android.advert.item.icebreakers.d dVar, @Y61.k com.avito.android.advert.item.icebreakers_redesign.d dVar2, @Y61.k com.avito.android.advert.item.service_order_request.n nVar3, @Y61.k C28124e0 c28124e0, @Y61.k com.avito.android.advert.item.ownership_cost.f fVar2, @Y61.k com.avito.android.delayed_ux_feedback.d dVar3, @Y61.k com.avito.android.util.R0 r02, @Y61.k InterfaceC27811a interfaceC27811a, @Y61.k com.avito.android.advert.item.consultation.J j13, @Y61.k InterfaceC28164a interfaceC28164a, @C27710t.h @Y61.l String str3, @Y61.k ScreenSource screenSource, @Y61.k InterfaceC13095a interfaceC13095a, @Y61.k com.avito.android.advert.item.properties.f fVar3, @Y61.k InterfaceC49780b interfaceC49780b, @Y61.k w7.b bVar5, @Y61.k com.avito.android.advert.item.safedeal.trust_factors.a aVar10, @Y61.k B2 b22, @Y61.k com.avito.android.advert.item.hotel.hotel_offer.m mVar2, @Y61.k com.avito.android.advert.item.compatibility.v2.f fVar4, @Y61.k com.avito.android.advert.item.compatibility.v3.k kVar2, @Y61.k com.avito.android.advert.item.compatibility.v4.f fVar5, @C27710t.a @Y61.k Y41.l<Object, kotlin.G0> lVar2, @Y61.k PreloadingPromiseTestGroup preloadingPromiseTestGroup, @Y61.k com.avito.android.advert.business360.b bVar6, @Y61.k N5 n52, @Y61.k u3.l<StandardizeButtonWidthTestGroup> lVar3, @Y61.k com.avito.android.rating_persistence.llm_summary.h hVar, @Y61.k u3.f<MultiItemOutlinedChipsTestGroup> fVar6, @Y61.k com.avito.android.advert_core.pp_recall_promo.close_banners.a aVar11, @Y61.k com.avito.android.advert.item.neighboring_dates.d dVar4, @Y61.k com.avito.android.advert.item.gallery.a aVar12, @Y61.k com.avito.android.bxcontent.N1 n12, @Y61.k C36135w2 c36135w2, @Y61.k com.avito.android.onboarding_manager.f fVar7, @Y61.k C35838l3 c35838l3, @Y61.k com.avito.android.advert_details_items.toast_item_popularity.a aVar13, @Y61.k InterfaceC50374a interfaceC50374a, @Y61.k ZL.a aVar14, @Y61.k u3.f<CrossFadeOpenAbTestGroup> fVar8) {
        this.f76330b = jVar;
        this.f76333c = interfaceC27797i;
        this.f76336d = c27689b;
        this.f76339e = bVar;
        this.f76342f = interfaceC28265d;
        this.f76345g = interfaceC28173a;
        this.f76348h = aVar;
        this.f76351i = interfaceC28280j;
        this.f76354j = interfaceC28243x;
        this.f76357k = aVar2;
        this.f76360l = fVar;
        this.f76363m = s5;
        this.f76366n = e12;
        this.f76369o = str;
        this.f76372p = num;
        this.f76375q = str2;
        this.f76378r = advertDetailsFastOpenParams;
        this.f76381s = advertDetailsMultiItemState;
        this.f76384t = preloadCacheKey;
        this.f76387u = j12;
        this.f76389v = u12;
        this.f76391w = interfaceC35745a5;
        this.f76393x = u13;
        this.f76395y = nVar;
        this.f76397z = cVar;
        this.f76272A = aVar3;
        this.f76274B = aVar4;
        this.f76276C = interfaceC42678a;
        this.f76278D = bVar2;
        this.f76280E = q12;
        this.f76282F = interfaceC28373a;
        this.f76284G = aVar5;
        this.f76286H = lVar;
        this.f76290I = bVar3;
        this.f76292J = d2Var;
        this.f76294K = zVar;
        this.f76296L = zVar2;
        this.f76298M = zVar3;
        this.f76300N = zVar4;
        this.f76302O = interfaceC34162r0;
        this.f76304P = cVar2;
        this.f76307Q = qVar;
        this.f76309R = kVar;
        this.f76311S = z12;
        this.f76313T = c29640d;
        this.f76315U = aVar6;
        this.f76317V = c43624b;
        this.f76319W = interfaceC25420a;
        this.f76321X = aVar7;
        this.f76324Y = nVar2;
        this.f76326Z = gVar;
        this.f76328a0 = bVar4;
        this.f76331b0 = aVar8;
        this.f76334c0 = aVar9;
        this.f76337d0 = cVar3;
        this.f76340e0 = mVar;
        this.f76343f0 = dVar;
        this.f76346g0 = dVar2;
        this.f76349h0 = nVar3;
        this.f76352i0 = c28124e0;
        this.f76355j0 = fVar2;
        this.f76358k0 = dVar3;
        this.f76361l0 = r02;
        this.f76364m0 = interfaceC27811a;
        this.f76367n0 = j13;
        this.f76370o0 = interfaceC28164a;
        this.f76373p0 = str3;
        this.f76376q0 = screenSource;
        this.f76379r0 = interfaceC13095a;
        this.f76382s0 = fVar3;
        this.f76385t0 = interfaceC49780b;
        this.f76388u0 = bVar5;
        this.f76390v0 = aVar10;
        this.f76392w0 = b22;
        this.f76394x0 = mVar2;
        this.f76396y0 = fVar4;
        this.f76398z0 = kVar2;
        this.f76273A0 = fVar5;
        this.f76275B0 = lVar2;
        this.f76277C0 = preloadingPromiseTestGroup;
        this.f76279D0 = bVar6;
        this.f76281E0 = n52;
        this.f76283F0 = lVar3;
        this.f76285G0 = hVar;
        this.f76287H0 = fVar6;
        this.f76291I0 = aVar11;
        this.f76293J0 = dVar4;
        this.f76295K0 = aVar12;
        this.f76297L0 = n12;
        this.f76299M0 = c36135w2;
        this.f76301N0 = fVar7;
        this.f76303O0 = c35838l3;
        this.f76305P0 = aVar13;
        this.f76308Q0 = interfaceC50374a;
        this.f76310R0 = aVar14;
        this.f76312S0 = fVar8;
        io.reactivex.rxjava3.disposables.c cVar4 = new io.reactivex.rxjava3.disposables.c();
        this.f76314T0 = cVar4;
        this.f76335c1 = new io.reactivex.rxjava3.disposables.c();
        this.f76353i1 = UUID.randomUUID().toString();
        C41962k c41962kM0 = null;
        kotlinx.coroutines.flow.Z1<com.avito.android.ui.status_bar.d> z1A = kotlinx.coroutines.flow.p2.a(null);
        this.f76356j1 = z1A;
        this.f76359k1 = z1A;
        this.f76362l1 = kotlinx.coroutines.U.a(r02.c());
        this.f76371o1 = kotlinx.coroutines.U.a(r02.b());
        this.f76374p1 = kotlinx.coroutines.U.a(r02.a());
        this.f76383s1 = kotlinx.coroutines.U.a(r02.a());
        u2(advertDetailsFastOpenParams.f71332i, c35838l3.f318922a ? null : com.avito.android.advert.advert_details_style.c.a(advertDetailsFastOpenParams.f71332i).f68640i ? advertDetailsFastOpenParams.f71337n : null);
        if (!preloadingPromiseTestGroup.a()) {
            io.reactivex.rxjava3.internal.operators.observable.I0 i0J0 = q2(null).j0(interfaceC35745a5.e());
            io.reactivex.rxjava3.internal.functions.b.a(1, "bufferSize");
            c41962kM0 = io.reactivex.rxjava3.internal.operators.observable.X0.Q0(i0J0).M0();
        }
        this.f76318V0 = c41962kM0;
        if (c41962kM0 != null) {
            cVar4.b(c41962kM0.v0(a.f76399b, b.f76400b, io.reactivex.rxjava3.internal.functions.a.f401993c));
            kotlin.G0 g02 = kotlin.G0.f406611a;
        }
    }

    public static final void k2(C28136i0 c28136i0, Throwable th2) {
        I1 i12;
        AdvertDetailsFragment advertDetailsFragment;
        ActivityC22955m activityC22955mL1;
        c28136i0.f76318V0 = null;
        boolean zA2 = c28136i0.f76277C0.a();
        A7.b bVar = c28136i0.f76278D;
        if (!zA2) {
            bVar.n(th2);
        }
        boolean zF2 = K5.f(th2);
        com.avito.android.advert_core.analytics.a aVar = c28136i0.f76272A;
        String str = c28136i0.f76369o;
        if (zF2) {
            AdvertDetailsFastOpenParams advertDetailsFastOpenParams = c28136i0.f76378r;
            AdvertDetailsStyle advertDetailsStyle = advertDetailsFastOpenParams != null ? advertDetailsFastOpenParams.f71332i : null;
            if (advertDetailsStyle == null) {
                advertDetailsStyle = AdvertDetailsStyle.f84409c;
            }
            com.avito.android.advert.advert_details_style.b bVarA = com.avito.android.advert.advert_details_style.c.a(advertDetailsStyle);
            I1 i13 = c28136i0.f76350h1;
            if (i13 != null) {
                ApiError apiErrorM = com.avito.android.error.z.m(th2);
                String f244063c = apiErrorM != null ? apiErrorM.getF244063c() : null;
                Z0 z02 = i13.f71702e;
                z02.f72298c.startActivity(z02.f72301f.a(f244063c, bVarA.f68643l));
            }
            I1 i14 = c28136i0.f76350h1;
            if (i14 != null && (activityC22955mL1 = (advertDetailsFragment = i14.f71711h).l1()) != null) {
                if (activityC22955mL1 instanceof AdvertDetailsActivity) {
                    activityC22955mL1.overridePendingTransition(0, 0);
                    activityC22955mL1.finish();
                } else {
                    advertDetailsFragment.r5();
                }
            }
            aVar.c3(str, true);
        } else {
            C29640d c29640d = c28136i0.f76313T;
            c29640d.getClass();
            kotlin.reflect.n<Object> nVar = C29640d.f132175X[42];
            if (((Boolean) c29640d.f132191P.a().invoke()).booleanValue() && (i12 = c28136i0.f76350h1) != null) {
                i12.ka(th2);
            }
            I1 i15 = c28136i0.f76350h1;
            if (i15 != null) {
                i15.la();
                View view = i15.f71693b;
                String string = view.getResources().getString(R.string.advert_core_network_retry);
                e.b bVar2 = new e.b(th2);
                F1 f12 = new F1(i15);
                com.avito.android.component.snackbar.d dVarB = d.a.b(com.avito.android.component.snackbar.d.f125235c, view, string, -2, bVar2, null, 0, null, null, 0, 0, 2032);
                Snackbar.SnackbarLayout snackbarLayout = (Snackbar.SnackbarLayout) dVarB.f125236a.f357285i;
                ((TextView) snackbarLayout.findViewById(com.google.android.material.R.id.snackbar_text)).setVisibility(4);
                View viewInflate = LayoutInflater.from(view.getContext()).inflate(R.layout.network_retry, (ViewGroup) null);
                View viewFindViewById = viewInflate.findViewById(R.id.advert_network_error_text);
                TextView textView = viewFindViewById instanceof TextView ? (TextView) viewFindViewById : null;
                if (textView != null) {
                    I5.a(textView, string, false);
                }
                View viewFindViewById2 = viewInflate.findViewById(R.id.advert_network_error_retry);
                if (viewFindViewById2 != null) {
                    viewFindViewById2.setOnClickListener(new com.avito.android.body_condition.h(25, f12, dVarB));
                }
                snackbarLayout.setPadding(0, 0, 0, 0);
                snackbarLayout.addView(viewInflate, 0);
                dVarB.b();
                i15.f71680U0 = dVarB;
            }
            aVar.c3(str, false);
        }
        bVar.u(th2);
        c28136i0.f76280E.a();
    }

    public static void v2(C28136i0 c28136i0) {
        c28136i0.f76332b1 = true;
        c28136i0.w2(false);
        c28136i0.y2(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:96:0x01e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void x2(com.avito.android.advert.item.C28136i0 r34, int r35, java.lang.Long r36, java.lang.Boolean r37, java.lang.Boolean r38, int r39) {
        /*
            Method dump skipped, instructions count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.C28136i0.x2(com.avito.android.advert.item.i0, int, java.lang.Long, java.lang.Boolean, java.lang.Boolean, int):void");
    }

    @Override // ob.InterfaceC44746j
    public final void A(@Y61.k String str) {
        this.f76324Y.d(str);
    }

    @Override // com.avito.android.advert.item.auto_credits.c.a
    public final void A0(@Y61.k AdvertDetailsAutoLoansItem advertDetailsAutoLoansItem, @Y61.k DeepLink deepLink) {
        if (!advertDetailsAutoLoansItem.f72885f) {
            if (advertDetailsAutoLoansItem.f72886g && !this.f76366n.b()) {
                deepLink = new AuthenticateLink(AuthSource.f92719o0, false, deepLink, 2, (C42822w) null);
            }
            b.a.a(this.f76334c0, deepLink, null, null, 6);
            return;
        }
        if (advertDetailsAutoLoansItem.f72884e) {
            I1 i12 = this.f76350h1;
            if (i12 != null) {
                t.a.a(i12, AdvertDetailsCompositeBrokerV2Item.class, 0, 6);
                return;
            }
            return;
        }
        I1 i13 = this.f76350h1;
        if (i13 != null) {
            t.a.a(i13, AdvertDetailsCompositeBrokerV1Item.class, 0, 6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007f  */
    @Override // com.avito.android.advert.item.InterfaceC28130g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A9(@Y61.l android.os.Bundle r5) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.C28136i0.A9(android.os.Bundle):void");
    }

    @Override // com.avito.android.advert.item.consultation.InterfaceC28106l.b
    public final void B0(@Y61.l String str, @Y61.l String str2, @Y61.l String str3) {
        this.f76272A.A6(str, str2, str3);
    }

    @Override // com.avito.android.advert.item.InterfaceC28130g0
    public final void B8(@Y61.l String str, boolean z12) {
        S sO2;
        if (!z12 && (sO2 = o2(n2())) != null) {
            sO2.w();
        }
        if (str != null) {
            j(str);
        }
    }

    @Override // com.avito.android.advert_details_items.photogallery.c
    public final void C(int i12, @Y61.l Long l12, @Y61.l Boolean bool, @Y61.l Boolean bool2) {
        x2(this, i12, l12, bool, bool2, 16);
    }

    @Override // com.avito.android.advert.item.comfortable_deal.l
    public final void C0(@Y61.k DeepLink deepLink) {
        W(this.f76369o, deepLink, ContactSource.f89919d, null, null);
    }

    @Override // ob.InterfaceC44739c
    public final void C1(@Y61.k BannerInfo bannerInfo, int i12) {
        com.avito.android.advert.item.commercials.f fVar = this.f76360l;
        if (fVar.c(bannerInfo)) {
            fVar.e(bannerInfo);
            AdvertDetails advertDetailsN2 = n2();
            j.a.c(this.f76272A, bannerInfo, i12, advertDetailsN2 != null ? advertDetailsN2.getId() : null, 8);
        }
    }

    @Override // com.avito.android.advert_details_items.photogallery.c
    public final void D1(@Y61.k DeepLink deepLink) {
        b.a.a(this.f76334c0, deepLink, null, null, 6);
    }

    @Override // com.avito.android.advert.item.InterfaceC28130g0
    public final void D8() {
        this.f76341e1 = null;
    }

    @Override // com.avito.android.advert_core.advert.k
    public final void E(@Y61.k AdvertParameters.Button button, @Y61.k AdvertDetailsFlatViewType advertDetailsFlatViewType, @Y61.l String str) {
        Z0 z02;
        AutotekaTeaserResult autotekaTeaserResult;
        AutotekaTeaserSelectItemResponse autotekaTeaserSelect;
        AutotekaTeaserItemResponse autotekaTeaser;
        AutotekaTeaserResult autotekaData;
        String id2;
        String developmentId;
        Developer developerV2;
        DeepLink deepLink = button.getDeepLink();
        AdvertParameters.Button.Description description = button.getDescription();
        AdvertParameters.Button.OwnershipDiscrepancy ownershipDiscrepancy = button.getOwnershipDiscrepancy();
        AdvertDetailsFlatViewType advertDetailsFlatViewType2 = AdvertDetailsFlatViewType.f82421c;
        AutotekaTeaserResult autotekaData2 = null;
        String str2 = this.f76369o;
        com.avito.android.advert_core.analytics.a aVar = this.f76272A;
        if (advertDetailsFlatViewType == advertDetailsFlatViewType2) {
            AdvertDetails advertDetailsN2 = n2();
            String str3 = "";
            if (advertDetailsN2 == null || (developerV2 = advertDetailsN2.getDeveloperV2()) == null || (id2 = developerV2.getId()) == null) {
                id2 = "";
            }
            AdvertDetails advertDetailsN22 = n2();
            if (advertDetailsN22 != null && (developmentId = advertDetailsN22.getDevelopmentId()) != null) {
                str3 = developmentId;
            }
            aVar.O6(str2, id2, str3, null);
        } else {
            aVar.i5(str2, str);
        }
        if (ownershipDiscrepancy == null) {
            if (deepLink != null) {
                Z0 z03 = this.f76327Z0;
                if (z03 != null) {
                    z03.g(null, deepLink, null);
                    return;
                }
                return;
            }
            if (description == null || (z02 = this.f76327Z0) == null) {
                return;
            }
            b.a.a(z02.f72314s, new DetailsSheetLink(new DetailsSheetLinkBody(description.getHeader(), null, null, null, new AttributedText(description.getText(), C42784z0.f406748b, 0, 4, null), null, new DetailsSheetButton(z02.f72298c.getString(R.string.close), "secondaryLarge", null, null, null, null, 60, null), null, null, null, null, null, null, null, null, null, null, false, null, 524206, null), null, 2, null), null, null, 6);
            return;
        }
        this.f76382s0.a();
        aVar.B5();
        AdvertDetails advertDetailsN23 = n2();
        if (advertDetailsN23 == null || (autotekaTeaser = advertDetailsN23.getAutotekaTeaser()) == null || (autotekaData = autotekaTeaser.getAutotekaData()) == null) {
            AdvertDetails advertDetailsN24 = n2();
            if (advertDetailsN24 != null && (autotekaTeaserSelect = advertDetailsN24.getAutotekaTeaserSelect()) != null) {
                autotekaData2 = autotekaTeaserSelect.getAutotekaData();
            }
            autotekaTeaserResult = autotekaData2;
        } else {
            autotekaTeaserResult = autotekaData;
        }
        Z0 z04 = this.f76327Z0;
        if (z04 != null) {
            AdvertDetailsFragment advertDetailsFragment = z04.f72298c;
            if (advertDetailsFragment.getChildFragmentManager().H("OWNERSHIP_DISCREPANCY_BOTTOM_SHEET") != null) {
                return;
            }
            AdvertDetailsOwnershipDiscrepancyBottomSheet.a aVar2 = AdvertDetailsOwnershipDiscrepancyBottomSheet.f78072s0;
            OwnershipDiscrepancyOpenParams ownershipDiscrepancyOpenParams = new OwnershipDiscrepancyOpenParams(ownershipDiscrepancy.getDescription(), ownershipDiscrepancy.getTitle(), ownershipDiscrepancy.getReportLink().getTitle(), ownershipDiscrepancy.getValues(), ownershipDiscrepancy.getReportLink().getUrl(), autotekaTeaserResult, this.f76375q);
            aVar2.getClass();
            AdvertDetailsOwnershipDiscrepancyBottomSheet advertDetailsOwnershipDiscrepancyBottomSheet = new AdvertDetailsOwnershipDiscrepancyBottomSheet();
            advertDetailsOwnershipDiscrepancyBottomSheet.f78079m0.setValue(advertDetailsOwnershipDiscrepancyBottomSheet, AdvertDetailsOwnershipDiscrepancyBottomSheet.f78073t0[0], ownershipDiscrepancyOpenParams);
            advertDetailsOwnershipDiscrepancyBottomSheet.f78080n0 = z04;
            com.avito.android.lib.util.g.b(advertDetailsOwnershipDiscrepancyBottomSheet, advertDetailsFragment.requireContext(), advertDetailsFragment.getChildFragmentManager(), "OWNERSHIP_DISCREPANCY_BOTTOM_SHEET");
        }
    }

    @Override // com.avito.android.advert.item.short_term_rent.str_buttons.c.a
    public final void E0(@Y61.l Date date, @Y61.l Date date2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(BeduinSelectCalendarModel.DEFAULT_DATE_FORMAT, Locale.getDefault());
        String str = simpleDateFormat.format(date);
        C27689b c27689b = this.f76336d;
        c27689b.f68759a.put("checkIn", str);
        c27689b.f68759a.put("checkOut", simpleDateFormat.format(date2));
        v2(this);
    }

    @Override // Qa.InterfaceC14873a
    public final void E1(@Y61.k ModificationItem modificationItem) {
        Parcelable parcelable;
        String context;
        MultiItemParamUnited.MultiItemParam.AnalyticsInfo analyticsInfo;
        Object next;
        AdvertDetails advertDetailsN2 = n2();
        if (advertDetailsN2 == null) {
            return;
        }
        AdvertNavBarStyle navigationBarStyle = !this.f76303O0.f318922a ? advertDetailsN2.getNavigationBarStyle() : null;
        List<MultiItemParamUnited> multiItemParams = advertDetailsN2.getMultiItemParams();
        if (multiItemParams != null) {
            Iterator<T> it = multiItemParams.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((MultiItemParamUnited) next) instanceof MultiItemParamUnited.MultiItemParam.Parameters) {
                        break;
                    }
                }
            }
            parcelable = (MultiItemParamUnited) next;
        } else {
            parcelable = null;
        }
        MultiItemParamUnited.MultiItemParam.Parameters parameters = parcelable instanceof MultiItemParamUnited.MultiItemParam.Parameters ? (MultiItemParamUnited.MultiItemParam.Parameters) parcelable : null;
        if (parameters == null || (analyticsInfo = parameters.getAnalyticsInfo()) == null || (context = analyticsInfo.getContext()) == null) {
            context = this.f76375q;
        }
        String str = context;
        String f85952b = modificationItem.getF85952b();
        com.avito.android.advert_core.analytics.a aVar = this.f76272A;
        aVar.x5(f85952b);
        C28131g1.f75660a.getClass();
        AdvertDetailsFastOpenParams advertDetailsFastOpenParams = this.f76378r;
        AdvertDetailsStyle advertDetailsStyleA = C28131g1.a(advertDetailsFastOpenParams, advertDetailsN2);
        C29640d c29640d = this.f76313T;
        c29640d.getClass();
        kotlin.reflect.n<Object> nVar = C29640d.f132175X[28];
        long j12 = ((Boolean) c29640d.f132177B.a().invoke()).booleanValue() ? 300L : 0L;
        io.reactivex.rxjava3.core.z<R> zVarO = this.f76333c.e(modificationItem.getF85953c(), this.f76372p, str, aVar.getF82761o(), null, advertDetailsFastOpenParams.f71334k, advertDetailsFastOpenParams.f71335l, null).o(this.f76278D.w());
        InterfaceC35745a5 interfaceC35745a5 = this.f76391w;
        this.f76314T0.b(io.reactivex.rxjava3.kotlin.A1.h(C35901i.a(zVarO, interfaceC35745a5.c(), j12, 500L).j0(interfaceC35745a5.e()), new k(), new l(f85952b, modificationItem, str, advertDetailsStyleA, navigationBarStyle), 2));
    }

    @Override // com.avito.android.advert.item.gig.similar_shifts.e
    public final void F(@Y61.k String str) {
        this.f76363m.B(str);
    }

    @Override // com.avito.android.advert.item.consultation.InterfaceC28106l.b
    public final void F0(@Y61.l List<Review> list) {
        if (list != null) {
            this.f76272A.J3();
            Z0 z02 = this.f76327Z0;
            if (z02 != null) {
                AdvertDetailsFragment advertDetailsFragment = z02.f72298c;
                if (advertDetailsFragment.getContext() != null) {
                    new ExpertReviewsBottomSheetDialog(list).show(advertDetailsFragment.getChildFragmentManager(), "ExpertReviewsBottomSheetDialog");
                }
            }
        }
    }

    @Override // com.avito.android.advert_details_items.rich_geo_block.l.b
    public final void F1() {
        AdvertDetails advertDetailsN2 = n2();
        if (advertDetailsN2 == null) {
            return;
        }
        r2(advertDetailsN2.getAddress(), advertDetailsN2.getCoordinates(), advertDetailsN2.getTitle(), GeoFromBlock.f82789c, advertDetailsN2.getRouteButtons());
    }

    @Override // com.avito.android.advert_details_items.georeference.c.a
    public final void G0(@Y61.k String str, @Y61.l MultiAddressesInfo multiAddressesInfo, @Y61.k Coordinates coordinates, @Y61.k String str2, @Y61.l RouteButtons routeButtons) {
        GeoFromBlock geoFromBlock = GeoFromBlock.f82789c;
        s2(str, multiAddressesInfo, coordinates, str2, routeButtons);
    }

    @Override // com.avito.android.advert.item.ownership_cost.dialogs.e.a
    public final void H(@Y61.k String str) {
        Z0 z02 = this.f76327Z0;
        if (z02 != null) {
            z02.x(Uri.parse(str));
        }
    }

    @Override // com.avito.android.advert_details_items.show_description_button.i
    public final void H0() {
        S sO2 = o2(n2());
        if (sO2 != null) {
            sO2.u();
        }
        this.f76357k.e();
        this.f76272A.v1(this.f76369o);
    }

    @Override // com.avito.android.advert_core.advert.o
    public final void H1() {
        AdvertDetails advertDetailsN2 = n2();
        if (advertDetailsN2 == null) {
            return;
        }
        this.f76272A.Z2(advertDetailsN2);
    }

    @Override // com.avito.android.advert.item.verification.c.a
    public final void I0() {
        Z0 z02 = this.f76327Z0;
        if (z02 != null) {
            z02.f72298c.startActivity(z02.f72309n.a(new URL("https://support.avito.ru/articles/1547").getPath().substring(1)));
        }
    }

    @Override // com.avito.android.advert_details_items.neighboring_dates.tools.d
    public final void I1(@Y61.k String str) {
        Z0 z02;
        AdvertDetails advertDetailsN2 = n2();
        if (advertDetailsN2 == null || (z02 = this.f76327Z0) == null) {
            return;
        }
        C28131g1.f75660a.getClass();
        z02.C(this.f76369o, this.f76372p, str, null, C28131g1.a(this.f76378r, advertDetailsN2), this.f76381s, null, null, AdvertDetailsFastOpenParams.FromSpace.f71338d, null, null, null, null);
    }

    @Override // com.avito.android.advert.item.short_term_rent.item_discount.c.a
    public final void J0(boolean z12) {
        boolean z13 = !z12;
        this.f76319W.b(z13);
        this.f76336d.f68759a.put("noRefund", String.valueOf(z13));
        this.f76323X1 = true;
        v2(this);
    }

    @Override // ob.InterfaceC44739c
    public final void J4(@Y61.k BannerInfo bannerInfo, int i12) {
        com.avito.android.advert.item.commercials.f fVar = this.f76360l;
        if (fVar.b(bannerInfo)) {
            fVar.f(bannerInfo);
            j.a.b(this.f76272A, bannerInfo, i12);
        }
    }

    @Override // com.avito.android.advert.item.leasing_calculator.link_item.c.a
    public final void K() {
        I1 i12 = this.f76350h1;
        if (i12 != null) {
            t.a.a(i12, AdvertDetailsLeasingCalculatorItem.class, 0, 14);
        }
    }

    @Override // h5.InterfaceC40772a
    public final void K1(@Y61.k DeepLink deepLink) {
        Z0 z02 = this.f76327Z0;
        if (z02 != null) {
            z02.g(null, deepLink, null);
        }
    }

    @Override // com.avito.android.advert_details_items.neighboring_dates.tools.d
    public final void L(@Y61.k String str) {
        this.f76293J0.d(str);
    }

    @Override // com.avito.android.advert.item.parking.c.a
    public final void L0(@Y61.k String str, @Y61.l MultiAddressesInfo multiAddressesInfo, @Y61.k Coordinates coordinates, @Y61.k String str2, @Y61.l RouteButtons routeButtons) {
        GeoFromBlock geoFromBlock = GeoFromBlock.f82789c;
        s2(str, multiAddressesInfo, coordinates, str2, routeButtons);
    }

    @Override // com.avito.android.advert.item.InterfaceC28130g0
    public final void L9(@Y61.k ServiceBookingCreateLink.b bVar) {
        boolean z12 = bVar instanceof ServiceBookingCreateLink.b.d;
        InterfaceC49780b interfaceC49780b = this.f76385t0;
        if (z12) {
            interfaceC49780b.a(false);
        } else if (bVar instanceof ServiceBookingCreateLink.b.a) {
            interfaceC49780b.a(true);
        }
    }

    @Override // com.avito.android.favorite.u
    public final void Ld(@Y61.k com.avito.android.serp.adapter.S s5, @Y61.l AbstractC30567a abstractC30567a) {
        AdvertDetails advertDetailsN2 = n2();
        if (advertDetailsN2 != null) {
            this.f76272A.j5(advertDetailsN2, s5.getF107475k() ? ClickSimilarItemFavoritesAction.f82879c : ClickSimilarItemFavoritesAction.f82878b, s5.getF95610c());
        }
        this.f76275B0.invoke(new InterfaceC42497a.e(s5.getF95610c(), !s5.getF107475k()));
        this.f76395y.Ld(s5, abstractC30567a);
        this.f76328a0.c(s5);
        this.f76326Z.b(s5.getF95610c(), s5.getF107475k());
    }

    @Override // com.avito.android.advert_details_items.neighboring_dates.tools.d
    public final void M(@Y61.k DeepLink deepLink) {
        b.a.a(this.f76334c0, deepLink, "NEIGHBORING_DATES_CHANGE_DATES_REQUEST_KEY", null, 4);
    }

    @Override // com.avito.android.advert.item.comfortable_deal.l
    public final void M0(@Y61.k DeepLink deepLink) {
        Z0 z02 = this.f76327Z0;
        if (z02 != null) {
            z02.g(null, deepLink, null);
        }
    }

    @Override // com.avito.android.advert.item.InterfaceC28153o
    public final void M1(@Y61.k DeepLink deepLink, @Y61.l String str) {
        this.f76334c0.r6(null, deepLink, str);
    }

    @Override // Me.p
    public final void N(@Y61.k Uri uri) {
        Z0 z02 = this.f76327Z0;
        if (z02 != null) {
            z02.x(uri);
        }
    }

    @Override // Me.q
    public final void N0(@Y61.k DeepLink deepLink) {
        Z0 z02 = this.f76327Z0;
        if (z02 != null) {
            z02.g(null, deepLink, null);
        }
    }

    @Override // R70.b
    public final void O(int i12, long j12) {
        InterfaceC27816b0 interfaceC27816b0P2 = p2(n2());
        if (interfaceC27816b0P2 != null) {
            interfaceC27816b0P2.O(i12, j12);
        }
    }

    @Override // com.avito.android.advert_core.advert.k
    public final void O0(@Y61.l DeepLink deepLink, @Y61.k String str) {
        I1 i12;
        AdvertDetails advertDetailsN2 = n2();
        if (advertDetailsN2 == null) {
            return;
        }
        this.f76272A.X4(advertDetailsN2, str);
        boolean z12 = deepLink instanceof AdvertDetailsScrollToPositionEmptyLink;
        com.avito.android.advert.item.properties.f fVar = this.f76382s0;
        String str2 = this.f76369o;
        com.avito.android.autoteka.data.a aVar = this.f76284G;
        if (!z12) {
            if (deepLink != null) {
                if (deepLink instanceof CustomChromeTabExternalLink) {
                    aVar.l(str2, ((CustomChromeTabExternalLink) deepLink).f133167b.toString(), FromBlock.f96083c);
                } else if (deepLink instanceof ServicesRealtySheetLink) {
                    fVar.a();
                }
                Z0 z02 = this.f76327Z0;
                if (z02 != null) {
                    z02.g(null, deepLink, null);
                    return;
                }
                return;
            }
            return;
        }
        FromBlock fromBlock = FromBlock.f96083c;
        aVar.h(str2);
        fVar.a();
        AdvertDetailsScrollToPositionEmptyLink advertDetailsScrollToPositionEmptyLink = (AdvertDetailsScrollToPositionEmptyLink) deepLink;
        Integer num = advertDetailsScrollToPositionEmptyLink.f132971b;
        if (num != null) {
            I1 i13 = this.f76350h1;
            if (i13 != null) {
                d2.a.b(num.intValue(), 0, 6, i13);
                return;
            }
            return;
        }
        String str3 = advertDetailsScrollToPositionEmptyLink.f132972c;
        if (str3 == null || (i12 = this.f76350h1) == null) {
            return;
        }
        Class cls = kotlin.jvm.internal.L.f(str3, "autoteka-teaser") ? AdvertDetailsAutotekaTeaserItemCommon.class : null;
        if (cls != null) {
            i12.Y(cls, 0, true);
        }
    }

    @Override // com.avito.android.advert.item.consultation.InterfaceC28106l.b
    public final void P(@Y61.k DeepLink deepLink) {
        Z0 z02 = this.f76327Z0;
        if (z02 != null) {
            z02.g(null, deepLink, null);
        }
    }

    @Override // com.avito.android.section.z
    public final void Pa(@Y61.k DeepLink deepLink) {
        Z0 z02 = this.f76327Z0;
        if (z02 != null) {
            z02.g(null, deepLink, null);
        }
    }

    @Override // com.avito.android.advert.item.InterfaceC28130g0
    public final void Pc() {
        v2(this);
    }

    @Override // m5.InterfaceC43882a
    public final void Q0() {
        List<AdvertAction> actions;
        Object next;
        DeepLink deepLink;
        String eventName;
        AdvertDetails advertDetailsN2 = n2();
        if (advertDetailsN2 != null) {
            EarlyAccessBanner earlyAccessBanner = advertDetailsN2.getEarlyAccessBanner();
            if (earlyAccessBanner != null && (eventName = earlyAccessBanner.getEventName()) != null) {
                this.f76272A.O1(advertDetailsN2.getId(), eventName);
            }
            AdvertActions contacts = advertDetailsN2.getContacts();
            if (contacts == null || (actions = contacts.getActions()) == null) {
                return;
            }
            Iterator<T> it = actions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                AdvertAction advertAction = (AdvertAction) next;
                if ((advertAction instanceof AdvertAction.Phone) || (advertAction instanceof AdvertAction.Messenger)) {
                    break;
                }
            }
            AdvertAction advertAction2 = (AdvertAction) next;
            if (advertAction2 == null || (deepLink = advertAction2.getDeepLink()) == null) {
                return;
            }
            d(deepLink);
        }
    }

    @Override // com.avito.android.advert.item.leasing_calculator.c.a
    public final void Q1(@Y61.k String str) {
        Z0 z02 = this.f76327Z0;
        if (z02 != null) {
            z02.x(Uri.parse(str));
        }
    }

    @Override // lf.InterfaceC43762a
    public final void R0(@Y61.k String str) {
        this.f76276C.a(this.f76369o, str);
    }

    @Override // com.avito.android.screenshot_observer.a.InterfaceC7827a
    public final void R1(@Y61.k Uri uri) {
        String url;
        AdvertSharing sharing;
        Z0 z02;
        AdvertSharing sharing2;
        S sO2 = o2(n2());
        if (sO2 != null) {
            sO2.p();
        }
        AdvertDetails advertDetailsN2 = n2();
        if (advertDetailsN2 == null || (sharing2 = advertDetailsN2.getSharing()) == null || (url = sharing2.getNative()) == null) {
            AdvertDetails advertDetailsN22 = n2();
            url = (advertDetailsN22 == null || (sharing = advertDetailsN22.getSharing()) == null) ? null : sharing.getUrl();
        }
        AdvertDetails advertDetailsN23 = n2();
        if (advertDetailsN23 == null || advertDetailsN23.getShortTermRent() == null || (z02 = this.f76327Z0) == null) {
            return;
        }
        AdvertDetails advertDetailsN24 = n2();
        String title = advertDetailsN24 != null ? advertDetailsN24.getTitle() : null;
        if (url == null) {
            url = "";
        }
        Intent intentP = z02.f72315t.p(uri, title, url);
        AdvertDetailsFragment advertDetailsFragment = z02.f72298c;
        advertDetailsFragment.startActivity(Intent.createChooser(intentP, advertDetailsFragment.getResources().getString(R.string.share)));
    }

    @Override // com.avito.android.advert_details_items.rich_geo_block.l.b
    public final void S0() {
        AdvertDetails advertDetailsN2 = n2();
        if (advertDetailsN2 == null) {
            return;
        }
        r2(advertDetailsN2.getAddress(), advertDetailsN2.getCoordinates(), advertDetailsN2.getTitle(), GeoFromBlock.f82790d, advertDetailsN2.getRouteButtons());
    }

    @Override // h5.InterfaceC40772a
    public final void T0(@Y61.k DeepLink deepLink) {
        String id2;
        Developer developerV2;
        Map<String, String> analyticsParams;
        String developmentId;
        Developer developerV22;
        AdvertDetails advertDetailsN2 = n2();
        String str = "";
        if (advertDetailsN2 == null || (developerV22 = advertDetailsN2.getDeveloperV2()) == null || (id2 = developerV22.getId()) == null) {
            id2 = "";
        }
        AdvertDetails advertDetailsN22 = n2();
        if (advertDetailsN22 != null && (developmentId = advertDetailsN22.getDevelopmentId()) != null) {
            str = developmentId;
        }
        AdvertDetails advertDetailsN23 = n2();
        this.f76272A.O6(this.f76369o, id2, str, (advertDetailsN23 == null || (developerV2 = advertDetailsN23.getDeveloperV2()) == null || (analyticsParams = developerV2.getAnalyticsParams()) == null) ? null : analyticsParams.get("trustCardAction"));
        Z0 z02 = this.f76327Z0;
        if (z02 != null) {
            z02.g(null, deepLink, null);
        }
    }

    @Override // com.avito.android.advert.item.cv_phone_actualization.d.a
    public final void U(@Y61.k AdvertCvPhoneActualizationAction advertCvPhoneActualizationAction) {
        int iOrdinal = advertCvPhoneActualizationAction.f75027c.ordinal();
        if (iOrdinal == 0) {
            this.f76325Y0 = C43259k.d(kotlinx.coroutines.U.a(this.f76361l0.a()), null, null, new h(null), 3);
            kotlin.G0 g02 = kotlin.G0.f406611a;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            DeepLink deepLink = advertCvPhoneActualizationAction.f75028d;
            if (deepLink != null) {
                b.a.a(this.f76334c0, deepLink, null, null, 6);
                kotlin.G0 g03 = kotlin.G0.f406611a;
            }
        }
    }

    @Override // com.avito.android.advert_core.advert.p
    public final void V() {
        AdvertDetails advertDetailsN2 = n2();
        if (advertDetailsN2 != null) {
            this.f76272A.W3(advertDetailsN2);
        }
    }

    @Override // rn0.e
    public final void W(@Y61.k String str, @Y61.k DeepLink deepLink, @Y61.k ContactSource contactSource, @Y61.l ScreenIdField screenIdField, @Y61.l String str2) {
        boolean z12;
        boolean z13 = deepLink instanceof ClickStreamLink;
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f76334c0;
        String str3 = null;
        Boolean boolValueOf = null;
        str3 = null;
        if (z13) {
            ClickStreamLink clickStreamLink = (ClickStreamLink) deepLink;
            clickStreamLink.getClass();
            b.a.a(aVar, ClickStreamLink.a(clickStreamLink, null), null, null, 6);
            DeepLink deepLink2 = clickStreamLink.f133110e;
            if (deepLink2 != null) {
                W(str, deepLink2, contactSource, null, null);
                return;
            }
            return;
        }
        boolean z14 = deepLink instanceof PhoneLink;
        boolean z15 = contactSource.f89925b;
        com.avito.android.advert_core.analytics.a aVar2 = this.f76272A;
        if (z14) {
            PhoneLink phoneLink = (PhoneLink) deepLink;
            PhoneLink.Call call = phoneLink instanceof PhoneLink.Call ? (PhoneLink.Call) phoneLink : null;
            aVar2.Y(str, call != null ? call.f133575d : null, z15);
            Z0 z02 = this.f76327Z0;
            if (z02 != null) {
                final C28222x0 c28222x0 = new C28222x0(this, phoneLink, str);
                com.avito.android.lib.deprecated_design.dialog.p pVar = com.avito.android.lib.deprecated_design.dialog.p.f177947a;
                androidx.appcompat.app.l lVar = z02.f72295D;
                pVar.getClass();
                if (lVar == null || !lVar.isShowing()) {
                    androidx.appcompat.app.l lVarCreate = new l.a(new androidx.appcompat.view.d(z02.f72298c.requireContext(), R.style.Theme_DesignSystem_Re23)).setTitle(R.string.advert_core_phone).setMessage(z02.f72319x.a(phoneLink.getF133573b())).setPositiveButton(R.string.advert_core_call, new DialogInterface.OnClickListener() { // from class: com.avito.android.advert.item.X0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i12) {
                            C41336a.C11375a.a();
                            c28222x0.invoke();
                        }
                    }).setOnCancelListener(new Y0(0)).create();
                    z02.f72295D = lVarCreate;
                    if (lVarCreate != null) {
                        com.avito.android.lib.util.g.a(lVarCreate);
                    }
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolValueOf = Boolean.valueOf(z12);
            }
            if (kotlin.jvm.internal.L.f(boolValueOf, Boolean.TRUE)) {
                aVar2.k(str);
                return;
            }
            return;
        }
        if (deepLink instanceof AnonymousNumberDialogLink) {
            AnonymousNumberDialogLink anonymousNumberDialogLink = (AnonymousNumberDialogLink) deepLink;
            DeepLink deepLink3 = anonymousNumberDialogLink.f91273f;
            if (deepLink3 instanceof PhoneLink.Call) {
                str3 = ((PhoneLink.Call) deepLink3).f133575d;
            } else if (deepLink3 instanceof ClickStreamLink) {
                DeepLink deepLink4 = ((ClickStreamLink) deepLink3).f133110e;
                PhoneLink.Call call2 = deepLink4 instanceof PhoneLink.Call ? (PhoneLink.Call) deepLink4 : null;
                if (call2 != null) {
                    str3 = call2.f133575d;
                }
            }
            aVar2.Y(str, str3, z15);
            Bundle bundle = new Bundle();
            bundle.putString("key_advert_id", str);
            bundle.putString("key_source_name", "button");
            Z0 z03 = this.f76327Z0;
            if (z03 != null) {
                b.a.a(z03, anonymousNumberDialogLink, bundle, 2);
                return;
            }
            return;
        }
        if (deepLink instanceof IacLaunchCallAfterCanCallLink) {
            b.a.a(aVar, deepLink, null, null, 6);
            return;
        }
        if (deepLink instanceof JobApplyCreateLink) {
            boolean zA2 = this.f76379r0.a();
            JobApplyCreateLink jobApplyCreateLink = (JobApplyCreateLink) deepLink;
            this.f76272A.h0(jobApplyCreateLink.f134079b, contactSource, jobApplyCreateLink.f134080c.f133132d, screenIdField, str2);
            b.a.a(aVar, deepLink, null, C22777e.b(new kotlin.Q("key_disclaimer_pd", Boolean.valueOf(zA2))), 2);
            return;
        }
        if (!(deepLink instanceof CreateChannelLink)) {
            Z0 z04 = this.f76327Z0;
            if (z04 != null) {
                z04.g(null, deepLink, null);
                return;
            }
            return;
        }
        Z0 z05 = this.f76327Z0;
        if (z05 != null) {
            z05.g(null, deepLink, null);
        }
        CreateChannelLink createChannelLink = (CreateChannelLink) deepLink;
        this.f76272A.h0(createChannelLink.f133130b, contactSource, createChannelLink.f133132d, screenIdField, null);
    }

    @Override // com.avito.android.advert.item.InterfaceC28130g0
    public final void W3(@Y61.l List<String> list) {
        AdvertDetails advertDetailsN2;
        AdvertComparison comparison;
        Boolean boolIsAdded;
        if (list == null || (advertDetailsN2 = n2()) == null || (comparison = advertDetailsN2.getComparison()) == null || (boolIsAdded = comparison.isAdded()) == null) {
            return;
        }
        boolean zBooleanValue = boolIsAdded.booleanValue();
        List<String> list2 = list;
        AdvertDetails advertDetailsN22 = n2();
        if (zBooleanValue != C42745f0.r(list2, advertDetailsN22 != null ? advertDetailsN22.getId() : null)) {
            v2(this);
        }
    }

    @Override // com.avito.android.advert.item.InterfaceC28130g0
    public final void Wd(@Y61.k RatingFormLink.b bVar, @Y61.l Y41.a<kotlin.G0> aVar) {
        AdvertDetails advertDetailsN2 = n2();
        this.f76388u0.a(bVar, advertDetailsN2 != null ? advertDetailsN2.getAdjustParameters() : null, aVar);
    }

    @Override // com.avito.android.advert_core.advert.p
    public final void Y() {
        AdvertDetails advertDetailsN2 = n2();
        if (advertDetailsN2 != null) {
            this.f76272A.i3(advertDetailsN2);
        }
    }

    @Override // com.avito.android.advert_core.expand_items_button.f
    public final void Y0(@Y61.k ExpandItemsButtonItem expandItemsButtonItem) {
        AdvertDetails advertDetailsN2 = n2();
        this.f76272A.h(this.f76369o, expandItemsButtonItem.f83563g, advertDetailsN2 != null ? advertDetailsN2.getCategoryId() : null);
    }

    @Override // com.avito.android.advert_details_items.campaigns.f.b
    public final void Z(@Y61.k DeepLink deepLink) {
        b.a.a(this.f76334c0, deepLink, null, null, 6);
    }

    @Override // com.avito.android.advert.item.gig.similar_shifts.e
    public final void Z0(@Y61.k String str) {
        this.f76363m.s(str);
    }

    @Override // com.avito.android.advert_details_items.address.f.b, com.avito.android.advert.item.parking.c.a
    public final void a(@Y61.k String str, boolean z12) throws Resources.NotFoundException {
        I1 i12;
        this.f76389v.a(str);
        if (z12 && (i12 = this.f76350h1) != null) {
            i12.S();
        }
        AdvertDetails advertDetailsN2 = n2();
        if (advertDetailsN2 != null) {
            this.f76272A.O2(advertDetailsN2.getId(), advertDetailsN2.getCategoryId(), null);
        }
    }

    @Override // com.avito.android.advert_details_items.photogallery.c
    public final void a0() {
        AdvertDetails advertDetailsN2 = n2();
        if (advertDetailsN2 == null) {
            return;
        }
        this.f76290I.a(GalleryAction.f84405d, advertDetailsN2.getUxFeedbackConfig());
        this.f76272A.J2(advertDetailsN2);
    }

    @Override // com.avito.android.advert.item.InterfaceC28130g0
    public final void a5(@Y61.k CombinedButtonType combinedButtonType, boolean z12) {
        n nVar = new n(combinedButtonType, z12);
        Q0 q02 = new Q0(nVar);
        com.avito.android.advert_core.safedeal.trust_factors.a aVar = this.f76348h;
        List<? extends TrustFactorsComponent> listInvoke = q02.invoke(aVar.f84276a);
        aVar.f84276a = listInvoke;
        this.f76275B0.invoke(new InterfaceC42497a.n(listInvoke));
        InterfaceC27816b0 interfaceC27816b0P2 = p2(n2());
        if (interfaceC27816b0P2 != null) {
            interfaceC27816b0P2.d(listInvoke, true);
        }
        List<? extends TrustFactorsComponent> list = listInvoke;
        boolean z13 = list instanceof Collection;
        InterfaceC28280j interfaceC28280j = this.f76351i;
        if (!z13 || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((TrustFactorsComponent) it.next()) instanceof TrustFactorsComponent.CombinedButtons) {
                    interfaceC28280j.K();
                    break;
                }
            }
        }
        List<? extends TrustFactorsComponent> listInvoke2 = new T0(nVar).invoke(aVar.f84277b);
        aVar.f84277b = listInvoke2;
        List<? extends TrustFactorsComponent> list2 = listInvoke2;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return;
        }
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            if (((TrustFactorsComponent) it2.next()) instanceof TrustFactorsComponent.CombinedButtons) {
                interfaceC28280j.K();
                return;
            }
        }
    }

    @Override // com.avito.android.advert.item.ownership_cost.items.input_form.a.InterfaceC2309a
    public final void b1() {
        S sO2 = o2(n2());
        if (sO2 != null) {
            sO2.y();
        }
    }

    @Override // com.avito.android.advert.item.InterfaceC28130g0
    public final void c0() {
        this.f76335c1.e();
        this.f76327Z0 = null;
    }

    @Override // lf.InterfaceC43762a
    public final void c1(@Y61.k String str) {
        this.f76276C.b(this.f76369o, str);
    }

    @Override // com.avito.android.advert.item.scroll_up.c.a
    public final void c2() {
        AdvertDetails advertDetailsN2 = n2();
        if (advertDetailsN2 == null) {
            return;
        }
        this.f76272A.I5(advertDetailsN2.getId());
        I1 i12 = this.f76350h1;
        if (i12 != null) {
            d2.a.b(0, 0, 6, i12);
        }
    }

    @Override // Qa.InterfaceC14873a, Me.p
    public final void d(@Y61.k DeepLink deepLink) {
        b.a.a(this.f76334c0, deepLink, null, null, 6);
    }

    @Override // com.avito.android.advert.item.InterfaceC28130g0
    @Y61.k
    public final Bundle d0() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("advertItem", this.f76344f1);
        bundle2.putBoolean("key_opened", this.f76329a1);
        bundle2.putBoolean("key_click_time_loggged", this.f76347g1);
        bundle2.putBoolean("contacts_updated", this.f76332b1);
        bundle2.putBoolean("key_salary_range_loaded", this.f76368n1);
        LinkedHashMap linkedHashMap = this.f76336d.f68759a;
        if (linkedHashMap.isEmpty()) {
            bundle = null;
        } else {
            bundle = new Bundle();
            com.avito.android.util.G.d(bundle, "extra_params_key", linkedHashMap);
        }
        bundle2.putBundle("extraReqParams", bundle);
        bundle2.putBundle("contactsState", this.f76342f.H());
        com.avito.android.advert_core.safedeal.trust_factors.a aVar = this.f76348h;
        aVar.getClass();
        Bundle bundle3 = new Bundle();
        com.avito.android.util.G.e("safedeal_storage_components_key", bundle3, aVar.f84276a);
        com.avito.android.util.G.e("safedeal_storage_sticky_block_components_key", bundle3, aVar.f84277b);
        com.avito.android.util.G.e("safedeal_storage_info_sticky_block_key", bundle3, aVar.f84278c);
        bundle3.putParcelable("safedeal_storage_sticky_custom_button_key", aVar.f84279d);
        bundle2.putBundle("safeDealComponentsState", bundle3);
        bundle2.putBundle("safeDealState", this.f76345g.H());
        bundle2.putBundle("hotelOfferState", this.f76394x0.H());
        bundle2.putString("itemAppearanceUuid", this.f76353i1);
        bundle2.putParcelable("ownership_cost", this.f76355j0.getF77945b());
        bundle2.putBoolean("key_toast_item_popularity_shown", this.f76305P0.getF85758a());
        AdvertDetails advertDetailsN2 = n2();
        if (advertDetailsN2 != null) {
            InterfaceC27816b0 interfaceC27816b0P2 = p2(advertDetailsN2);
            if (interfaceC27816b0P2 != null) {
                bundle2.putBundle("advertItemsState", interfaceC27816b0P2.H());
            } else {
                com.avito.android.util.G.c(bundle2, "commetcialsState", this.f76360l.d0());
            }
        }
        return bundle2;
    }

    @Override // com.avito.android.advert.item.abuse.c.a
    public final void d2() {
        AdvertDetails advertDetailsN2 = n2();
        if (advertDetailsN2 == null) {
            return;
        }
        this.f76272A.A3(advertDetailsN2);
        Z0 z02 = this.f76327Z0;
        if (z02 != null) {
            AdvertDetailsAbuse abuseInfo = advertDetailsN2.getAbuseInfo();
            if (abuseInfo != null) {
                b.a.a(z02.f72314s, abuseInfo.getDeeplink(), null, null, 6);
                return;
            }
            com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
            PrintableText printableTextC = com.avito.android.printable_text.b.c(R.string.advert_details_send_abuse_error, new Serializable[0]);
            f.c.f125255c.getClass();
            com.avito.android.component.toast.c.c(cVar, z02.f72298c, printableTextC, null, null, f.c.a.b(), 0, ToastBarPosition.f181046d, 942);
        }
    }

    @Override // com.avito.android.advert.item.InterfaceC28130g0
    public final void d8(@Y61.k SafeDealPaymentBlockResponse safeDealPaymentBlockResponse, boolean z12) {
        InterfaceC27816b0 interfaceC27816b0P2 = p2(n2());
        if (interfaceC27816b0P2 != null) {
            interfaceC27816b0P2.c(new PaymentBlockItemState.ShowPaymentBlock(safeDealPaymentBlockResponse, Boolean.valueOf(z12)));
        }
    }

    @Override // com.avito.android.advert.item.InterfaceC28130g0
    public final void e0() {
        this.f76314T0.e();
        this.f76331b0.a();
        this.f76350h1 = null;
    }

    @Override // com.avito.android.ui.status_bar.k
    @Y61.k
    public final kotlinx.coroutines.flow.n2<com.avito.android.ui.status_bar.d> e2() {
        return this.f76359k1;
    }

    @Override // com.avito.android.advert.item.consultation.InterfaceC28106l.b
    public final void f(@Y61.k DeepLink deepLink) {
        Z0 z02 = this.f76327Z0;
        if (z02 != null) {
            z02.g(null, deepLink, null);
        }
    }

    @Override // com.avito.android.advert.item.price_comparison.c.a
    public final void f2(@Y61.k ModelCardInfo modelCardInfo) {
        LinkInfo linkInfo;
        DeepLink deeplink;
        PriceInfo priceInfo = modelCardInfo.getPriceInfo();
        if (priceInfo == null || (linkInfo = priceInfo.getLinkInfo()) == null || (deeplink = linkInfo.getDeeplink()) == null) {
            throw new IllegalStateException("No price deeplink");
        }
        CatalogInfo catalogInfo = modelCardInfo.getCatalogInfo();
        if (catalogInfo != null) {
            Integer vendorId = catalogInfo.getVendorId();
            Integer id2 = catalogInfo.getId();
            Integer modelId = catalogInfo.getModelId();
            if (vendorId != null && id2 != null && modelId != null) {
                ModelCardFrom modelCardFrom = ModelCardFrom.f82829d;
                this.f76272A.F3(this.f76369o, vendorId.intValue(), id2.intValue(), modelId.intValue(), this.f76375q, modelCardFrom, modelCardFrom);
            }
        }
        Z0 z02 = this.f76327Z0;
        if (z02 != null) {
            z02.g(null, deeplink, null);
        }
    }

    @Override // com.avito.android.deeplink_handler.view.a.g
    public final void g(@Y61.l com.avito.android.deeplink_handler.handler.bundle.a aVar, boolean z12) {
        this.f76275B0.invoke(new InterfaceC42497a.i(aVar, z12));
        S sO2 = o2(n2());
        if (sO2 != null) {
            sO2.g(aVar, z12);
        }
    }

    @Override // com.avito.android.advert_core.advert.k
    public final void g0() {
        AdvertDetails advertDetailsN2 = n2();
        if (kotlin.jvm.internal.L.f(advertDetailsN2 != null ? advertDetailsN2.getCategoryId() : null, CategoryIds.AUTO.CARS.getId())) {
            this.f76272A.X5();
        }
    }

    @Override // Qa.InterfaceC14873a
    public final boolean g2() {
        MultiItemOutlinedChipsTestGroup multiItemOutlinedChipsTestGroupA = this.f76287H0.a();
        multiItemOutlinedChipsTestGroupA.getClass();
        if (multiItemOutlinedChipsTestGroupA == MultiItemOutlinedChipsTestGroup.f67883d) {
            C29640d c29640d = this.f76313T;
            c29640d.getClass();
            kotlin.reflect.n<Object> nVar = C29640d.f132175X[32];
            if (((Boolean) c29640d.f132181F.a().invoke()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.avito.android.advert.item.InterfaceC28130g0
    public final void gb(@Y61.k DeepLink deepLink) {
        b.a.a(this.f76334c0, deepLink, null, null, 6);
        Long lZ02 = C43066x.z0(this.f76369o);
        if (lZ02 != null) {
            this.f76380r1 = C43259k.d(this.f76374p1, null, null, new g(lZ02.longValue(), null), 3);
        }
    }

    @Override // com.avito.android.advert_details_items.campaigns.f.b
    public final void h0(@Y61.k CampaignOptionCopy campaignOptionCopy) {
        this.f76389v.a(campaignOptionCopy.getText());
        I1 i12 = this.f76350h1;
        if (i12 != null) {
            g.a.a(i12, com.avito.android.printable_text.b.f(campaignOptionCopy.getToastText()), null, null, 254);
        }
        ParametrizedEvent event = campaignOptionCopy.getEvent();
        if (event != null) {
            this.f76282F.c(com.avito.android.analytics.a0.a(event));
        }
    }

    @Override // com.avito.android.advert.item.realty_quiz_banner.c
    public final void h1(@Y61.k RealtyQuizBannerItem realtyQuizBannerItem) {
        this.f76275B0.invoke(new InterfaceC42497a.j(realtyQuizBannerItem));
        S sO2 = o2(n2());
        if (sO2 != null) {
            sO2.v();
        }
    }

    @Override // com.avito.android.advert_core.advert.k
    public final void h2() {
        AdvertDetails advertDetailsN2 = n2();
        if (kotlin.jvm.internal.L.f(advertDetailsN2 != null ? advertDetailsN2.getCategoryId() : null, CategoryIds.AUTO.CARS.getId())) {
            this.f76272A.R3();
        }
    }

    @Override // com.avito.android.advert_core.pp_recall_promo.o
    public final void i2(@Y61.k AdvertDetailsPpRecallPromoItem advertDetailsPpRecallPromoItem) {
        kotlinx.coroutines.N0 n02 = this.f76386t1;
        if (n02 != null) {
            ((kotlinx.coroutines.V0) n02).c(null);
        }
        this.f76386t1 = C43259k.d(this.f76383s1, null, null, new f(advertDetailsPpRecallPromoItem, this, null), 3);
        this.f76275B0.invoke(new InterfaceC42497a.h(advertDetailsPpRecallPromoItem));
        S sO2 = o2(n2());
        if (sO2 != null) {
            sO2.C();
        }
    }

    @Override // com.avito.android.advert.item.InterfaceC28130g0
    public final void i3(@Y61.k com.avito.android.advert.item.creditinfo.buzzoola.v vVar) {
        this.f76341e1 = vVar;
    }

    @Override // t7.InterfaceC48510a
    public final void j(@Y61.k String str) {
        c.a.a(this.f76304P, com.avito.android.printable_text.b.f(str), 0, null, null, null, null, 254);
    }

    @Override // com.avito.android.advert_details_items.address.f.b
    public final void j0(@Y61.k String str, @Y61.k Coordinates coordinates, @Y61.k String str2, @Y61.l RouteButtons routeButtons) {
        r2(str, coordinates, str2, GeoFromBlock.f82789c, routeButtons);
    }

    @Override // com.avito.android.advert.item.additionalSeller.l.b
    public final void j2(@Y61.k DeepLink deepLink) {
        if (deepLink instanceof PhoneLink) {
            this.f76272A.p0();
        }
        Z0 z02 = this.f76327Z0;
        if (z02 != null) {
            z02.g(null, deepLink, null);
        }
    }

    @Override // com.avito.android.advert.item.InterfaceC28130g0
    public final void j6(@Y61.k com.avito.android.advert.item.creditinfo.buzzoola.a aVar) {
        this.f76275B0.invoke(new InterfaceC42497a.c(aVar));
    }

    @Override // com.avito.android.advert.item.InterfaceC28130g0
    public final void j7() {
        Z0 z02;
        AdvertDetails advertDetailsN2 = n2();
        if (advertDetailsN2 == null || (z02 = this.f76327Z0) == null) {
            return;
        }
        z02.B(advertDetailsN2, this.f76375q);
    }

    @Override // com.avito.android.advert.item.InterfaceC28130g0
    public final void k(@Y61.l I1 i12) {
        this.f76350h1 = i12;
        InterfaceC28265d interfaceC28265d = this.f76342f;
        interfaceC28265d.pb();
        io.reactivex.rxjava3.disposables.d dVarT0 = kotlinx.coroutines.rx3.y.b(this.f76292J).t0(new C28145l0(this));
        io.reactivex.rxjava3.disposables.c cVar = this.f76314T0;
        cVar.b(dVarT0);
        cVar.b(this.f76294K.t0(new C28148m0(this)));
        cVar.b(this.f76296L.t0(new C28151n0(this)));
        cVar.b(this.f76298M.t0(new C28154o0(this)));
        cVar.b(this.f76300N.t0(new C28157p0(this)));
        cVar.b(io.reactivex.rxjava3.core.z.f0(this.f76345g.getF78812A(), this.f76343f0.getF76482l(), this.f76346g0.getF76547o(), this.f76349h0.getF79928h()).t0(new C28160q0(this)));
        this.f76331b0.b(i12);
        C28162r0 c28162r0 = new C28162r0(this);
        io.reactivex.rxjava3.core.z<C43501a> zVarV9 = this.f76334c0.V9();
        zVarV9.getClass();
        io.reactivex.rxjava3.internal.operators.observable.M0 m02 = new io.reactivex.rxjava3.internal.operators.observable.M0(zVarV9);
        c28162r0.invoke(m02);
        m02.N0();
        cVar.b(io.reactivex.rxjava3.kotlin.A1.h(interfaceC28265d.getF83157A().N(C28171s0.f78720b), new C28210t0(1, V2.f318762a, V2.class, "error", "error(Ljava/lang/Throwable;)V", 0), new C28139j0(this), 2));
        C43175k.K(new C43197r1(new C28142k0(i12, null), this.f76310R0.a()), this.f76371o1);
    }

    @Override // com.avito.android.serp.adapter.InterfaceC34863v
    public final void k5(@Y61.k AdvertItem advertItem, @Y61.l Image image) {
        AdvertDetails advertDetailsN2 = n2();
        if (advertDetailsN2 == null) {
            return;
        }
        C28131g1.f75660a.getClass();
        com.avito.android.advert.advert_details_style.b bVarA = com.avito.android.advert.advert_details_style.c.a(C28131g1.a(this.f76378r, advertDetailsN2));
        String str = advertItem.f268425c;
        AdvertDetailsStyleAnalytics advertDetailsStyleAnalytics = bVarA.f68641j;
        com.avito.android.advert_core.analytics.a aVar = this.f76272A;
        aVar.N5(advertDetailsN2, str, advertDetailsStyleAnalytics);
        Bundle bundle = new Bundle();
        bundle.putString("title", advertItem.f268428d);
        bundle.putParcelable("tree_parent", aVar.Q5(false));
        bundle.putString("key_category_id", advertItem.f268420a0);
        bundle.putLong("click_time", SystemClock.elapsedRealtime());
        bundle.putParcelable("screen_source", ScreenSource.ADVERT.f251774d);
        String str2 = advertItem.f268444k;
        if (str2 != null) {
            bundle.putString("normalized_price", str2);
        }
        String str3 = advertItem.f268440i;
        if (str3 != null) {
            bundle.putString("price", str3);
        }
        String str4 = advertItem.f268446l;
        if (str4 != null) {
            bundle.putString("old_price", str4);
        }
        if (image != null) {
            bundle.putParcelable("image", new DimmedImage(image, null, 2, null));
        }
        Z0 z02 = this.f76327Z0;
        if (z02 != null) {
            z02.g(null, advertItem.f268396O, null);
        }
    }

    @Override // com.avito.android.advert_core.expand_items_button.f
    public final void l(@Y61.k ExpandItemsButtonItem expandItemsButtonItem) {
        AdvertDetails advertDetailsN2;
        AttributedText flatTitle;
        AdvertDetails advertDetails;
        ModelCardInfo modelCardInfo;
        AdvertDetails advertDetailsN22 = n2();
        String text = null;
        this.f76272A.y(this.f76369o, expandItemsButtonItem.f83563g, advertDetailsN22 != null ? advertDetailsN22.getCategoryId() : null);
        AdvertDetails advertDetailsN23 = n2();
        ModelSpecsItem modelSpecsItemA = advertDetailsN23 != null ? this.f76281E0.a(advertDetailsN23) : null;
        ModelSpecsLinkItem modelSpecsLinkItem = modelSpecsItemA instanceof ModelSpecsLinkItem ? (ModelSpecsLinkItem) modelSpecsItemA : null;
        kotlin.collections.builders.b bVarT = C42745f0.t();
        bVarT.addAll(expandItemsButtonItem.f83565i);
        if (modelSpecsLinkItem != null) {
            bVarT.add(modelSpecsLinkItem);
        }
        kotlin.collections.builders.b bVarP = C42745f0.p(bVarT);
        if (expandItemsButtonItem.f83568l) {
            Z0 z02 = this.f76327Z0;
            if (z02 != null) {
                AdvertDetailsFragment advertDetailsFragment = z02.f72298c;
                if (advertDetailsFragment.getChildFragmentManager().H("AUTO_FLATS_TWO_COLUMN_DIALOG") != null || (advertDetails = z02.f72294C) == null || (modelCardInfo = advertDetails.getModelCardInfo()) == null) {
                    return;
                }
                AutoFlatsTwoColumnDialogFragment.f68667l0.getClass();
                com.avito.android.lib.util.g.b(AutoFlatsTwoColumnDialogFragment.a.a(modelCardInfo), advertDetailsFragment.requireContext(), advertDetailsFragment.getChildFragmentManager(), "AUTO_FLATS_TWO_COLUMN_DIALOG");
                return;
            }
            return;
        }
        ExpandSource expandSource = expandItemsButtonItem.f83566j;
        int i12 = expandSource == null ? -1 : c.f76401a[expandSource.ordinal()];
        if (i12 == -1) {
            this.f76275B0.invoke(new InterfaceC42497a.d(expandItemsButtonItem));
            S sO2 = o2(n2());
            if (sO2 != null) {
                sO2.l(expandItemsButtonItem);
                return;
            }
            return;
        }
        if (i12 == 1 && (advertDetailsN2 = n2()) != null) {
            String str = expandItemsButtonItem.f83567k;
            if (str == null) {
                AdvertParameters parameters = advertDetailsN2.getParameters();
                if (parameters != null && (flatTitle = parameters.getFlatTitle()) != null) {
                    text = flatTitle.getText();
                }
            } else {
                text = str;
            }
            Z0 z03 = this.f76327Z0;
            if (z03 != null) {
                if (text == null) {
                    text = "";
                }
                Context context = z03.f72298c.getContext();
                if (context != null) {
                    z03.f72320y.c(context, text, bVarP);
                }
            }
        }
    }

    @Override // com.avito.android.advert.item.consultation.InterfaceC28106l.b
    public final void l0(@Y61.k DeepLink deepLink, @Y61.l Bundle bundle) {
        DeepLink deepLinkM2 = m2(deepLink);
        Z0 z02 = this.f76327Z0;
        if (z02 != null) {
            b.a.a(z02, deepLinkM2, bundle, 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x07df  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x07f8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012a  */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l2(com.avito.android.advert_core.advert.AdvertDetailsWithMeta r53) {
        /*
            Method dump skipped, instructions count: 2360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.C28136i0.l2(com.avito.android.advert_core.advert.AdvertDetailsWithMeta):void");
    }

    @Override // com.avito.android.advert.item.InterfaceC28130g0
    public final void m(@Y61.k W0 w02) {
        this.f76327Z0 = (Z0) w02;
        this.f76335c1.b(this.f76302O.k().t0(new e()));
    }

    @Override // com.avito.android.advert.item.additionalSeller.l.b
    public final void m1(@Y61.k DetailsSheetLinkBody detailsSheetLinkBody) {
        com.avito.android.advert_core.analytics.a aVar = this.f76272A;
        String str = this.f76369o;
        aVar.a1(str);
        Z0 z02 = this.f76327Z0;
        if (z02 != null) {
            z02.A(detailsSheetLinkBody, new ParametrizedClickStreamEvent(4600, 0, Collections.singletonMap("iid", str), null, 8, null));
        }
    }

    public final DeepLink m2(DeepLink deepLink) {
        SerpResultCategoryDetails categoryDetails;
        String microCategoryId;
        AdvertDetails advertDetailsN2 = n2();
        if (advertDetailsN2 == null || (categoryDetails = advertDetailsN2.getCategoryDetails()) == null || (microCategoryId = categoryDetails.getMicroCategoryId()) == null) {
            return deepLink;
        }
        if (!(deepLink instanceof ClickStreamLink)) {
            if (!(deepLink instanceof ConsultationStartLink)) {
                return deepLink;
            }
            ConsultationStartLink consultationStartLink = (ConsultationStartLink) deepLink;
            return new ConsultationStartLink(consultationStartLink.f133115b, consultationStartLink.f133116c, consultationStartLink.f133117d, consultationStartLink.f133118e, consultationStartLink.f133119f, consultationStartLink.f133120g, consultationStartLink.f133121h, consultationStartLink.f133122i, consultationStartLink.f133123j, consultationStartLink.f133124k, consultationStartLink.f133125l, consultationStartLink.f133126m, microCategoryId);
        }
        ClickStreamLink clickStreamLink = (ClickStreamLink) deepLink;
        DeepLink deepLink2 = clickStreamLink.f133110e;
        if (!(deepLink2 instanceof ConsultationFormLink)) {
            return clickStreamLink;
        }
        ConsultationFormLink consultationFormLink = (ConsultationFormLink) deepLink2;
        return ClickStreamLink.a(clickStreamLink, new ConsultationFormLink(consultationFormLink.f136194b, consultationFormLink.f136200h, consultationFormLink.f136195c, consultationFormLink.f136196d, consultationFormLink.f136197e, consultationFormLink.f136198f, consultationFormLink.f136199g, consultationFormLink.f136201i, microCategoryId));
    }

    @Override // com.avito.android.advert.item.cv_state.c.b
    public final void n0(@Y61.k CvStateType cvStateType) {
        if (this.f76322X0 != null) {
            return;
        }
        S sO2 = o2(n2());
        if (sO2 != null) {
            sO2.m();
        }
        if (!kotlin.jvm.internal.L.f(cvStateType.getId(), DateTimeParameterKt.DATE_TIME_PARAMETER_PRESENT_TIME)) {
            this.f76322X0 = (io.reactivex.rxjava3.internal.observers.y) new io.reactivex.rxjava3.internal.operators.observable.N(this.f76333c.c(this.f76369o, cvStateType).j0(this.f76391w.e()), new InterfaceC43543a() { // from class: com.avito.android.advert.item.h0
                @Override // l41.InterfaceC43543a
                public final void run() {
                    C28136i0 c28136i0 = this.f75819b;
                    io.reactivex.rxjava3.internal.observers.y yVar = c28136i0.f76322X0;
                    if (yVar != null) {
                        DisposableHelper.a(yVar);
                    }
                    c28136i0.f76322X0 = null;
                }
            }).v0(new i(), new j(), io.reactivex.rxjava3.internal.functions.a.f401993c);
            return;
        }
        S sO22 = o2(n2());
        if (sO22 != null) {
            sO22.n(null, true);
        }
    }

    @Override // com.avito.android.advert.item.modelSpecs.a.InterfaceC2289a
    public final void n1(@Y61.k ModelCardInfo modelCardInfo) {
        DeepLink deeplink;
        Bundle bundle;
        LinkInfo linkInfo = modelCardInfo.getLinkInfo();
        if (linkInfo == null || (deeplink = linkInfo.getDeeplink()) == null) {
            throw new IllegalStateException("No specs deeplink");
        }
        CatalogInfo catalogInfo = modelCardInfo.getCatalogInfo();
        if (catalogInfo != null) {
            Integer vendorId = catalogInfo.getVendorId();
            Integer id2 = catalogInfo.getId();
            Integer modelId = catalogInfo.getModelId();
            if (vendorId != null && id2 != null && modelId != null) {
                ModelCardFrom modelCardFrom = ModelCardFrom.f82828c;
                this.f76272A.F3(this.f76369o, vendorId.intValue(), id2.intValue(), modelId.intValue(), this.f76375q, modelCardFrom, modelCardFrom);
            }
        }
        if (t2()) {
            bundle = new Bundle(1);
            bundle.putParcelable("from_tab", ModelCardLink.FromTab.ParametersTab.f133444b);
        } else {
            bundle = null;
        }
        Z0 z02 = this.f76327Z0;
        if (z02 != null) {
            b.a.a(z02, deeplink, bundle, 2);
        }
    }

    public final AdvertDetails n2() {
        AdvertDetailsWithMeta advertDetailsWithMeta = this.f76344f1;
        if (advertDetailsWithMeta != null) {
            return advertDetailsWithMeta.f82645b;
        }
        return null;
    }

    @Override // com.avito.android.advert.item.show_on_map.i.b
    public final void o(@Y61.k AdvertDetailsShowOnMapItem advertDetailsShowOnMapItem, @Y61.k String str) {
        MultiAddressesInfo multiAddressesInfo;
        List<MultiAddressesItem> addresses;
        MultiAddressesItem multiAddressesItem;
        r2(advertDetailsShowOnMapItem.f80184e, advertDetailsShowOnMapItem.f80183d, advertDetailsShowOnMapItem.f80182c, C43066x.h0(str, "Есть еще", false) ? GeoFromBlock.f82794h : GeoFromBlock.f82791e, advertDetailsShowOnMapItem.f80185f);
        AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
        if (kotlin.jvm.internal.L.f(advertDetailsShowOnMapItem.f80181b, String.valueOf(12))) {
            AdvertDetails advertDetailsN2 = n2();
            String categoryId = advertDetailsN2 != null ? advertDetailsN2.getCategoryId() : null;
            AdvertDetails advertDetailsN22 = n2();
            if (advertDetailsN22 == null || (multiAddressesInfo = advertDetailsN22.getMultiAddressesInfo()) == null || (addresses = multiAddressesInfo.getAddresses()) == null || (multiAddressesItem = (MultiAddressesItem) C42745f0.E(addresses)) == null) {
                return;
            }
            this.f76272A.h7(multiAddressesItem.getId(), this.f76375q, categoryId);
        }
    }

    @Override // t7.InterfaceC48510a
    public final void o1(@Y61.k String str) {
        PrintableText printableTextF = com.avito.android.printable_text.b.f(str);
        f.c.f125255c.getClass();
        f.c cVarB = f.c.a.b();
        c.a.a(this.f76304P, printableTextF, 0, null, null, ToastBarPosition.f181046d, cVarB, 62);
    }

    public final S o2(AdvertDetails advertDetails) {
        if (advertDetails == null || !advertDetails.getRenderByBeduin()) {
            return this.f76363m;
        }
        return null;
    }

    @Override // com.avito.android.advert.item.InterfaceC28130g0
    public final void onPause() {
        this.f76342f.onPause();
    }

    @Override // com.avito.android.advert.item.InterfaceC28130g0
    public final void onResume() {
        this.f76272A.i7(this.f76369o, this.f76353i1);
        this.f76358k0.Tb();
        C29640d c29640d = this.f76313T;
        c29640d.getClass();
        kotlin.reflect.n<Object> nVar = C29640d.f132175X[46];
        boolean zBooleanValue = ((Boolean) c29640d.f132195T.a().invoke()).booleanValue();
        InterfaceC28265d interfaceC28265d = this.f76342f;
        if (zBooleanValue) {
            AdvertDetails advertDetailsN2 = n2();
            if (kotlin.jvm.internal.L.f(advertDetailsN2 != null ? advertDetailsN2.getCategoryId() : null, "111") && interfaceC28265d.Pa()) {
                v2(this);
            }
        }
        interfaceC28265d.onResume();
    }

    @Override // com.avito.android.advert.item.InterfaceC28130g0
    public final void p0() {
        w2(true);
        start();
    }

    @Override // com.avito.android.advert_details_items.rich_geo_block.l.b
    public final void p1() {
        AdvertDetails advertDetailsN2 = n2();
        if (advertDetailsN2 == null) {
            return;
        }
        r2(advertDetailsN2.getAddress(), advertDetailsN2.getCoordinates(), advertDetailsN2.getTitle(), GeoFromBlock.f82793g, advertDetailsN2.getRouteButtons());
    }

    public final InterfaceC27816b0 p2(AdvertDetails advertDetails) {
        if (advertDetails == null || !advertDetails.getRenderByBeduin()) {
            return O2.a(advertDetails != null ? advertDetails.getBlocks() : null) ? this.f76364m0 : this.f76363m;
        }
        return null;
    }

    @Override // com.avito.android.advert.item.InterfaceC28130g0
    public final void pd(@Y61.l Y41.l<? super AdvertDetailsStyle, kotlin.G0> lVar) {
        this.f76306P2 = lVar;
        AdvertDetails advertDetailsN2 = n2();
        if (lVar == null || advertDetailsN2 == null) {
            return;
        }
        C28131g1.f75660a.getClass();
        ((L) lVar).invoke(C28131g1.a(this.f76378r, advertDetailsN2));
    }

    @Override // com.avito.android.advert.item.short_term_rent.str_buttons.c.a
    public final void q() {
        Object objV0;
        S0 s02 = new S0(this);
        R0 r02 = new R0(this);
        if (this.f76277C0.a()) {
            LinkedHashMap linkedHashMap = this.f76336d.f68759a;
            if (linkedHashMap.isEmpty()) {
                linkedHashMap = null;
            }
            objV0 = this.f76330b.c(new com.avito.android.advert.item.preload.f(linkedHashMap, null, 2, null), s02, r02, com.avito.android.preloading.m.f221865l);
        } else {
            objV0 = q2(null).v0(new V0.a(s02), new V0.a(r02), io.reactivex.rxjava3.internal.functions.a.f401993c);
        }
        this.f76316U0 = (AtomicReference) objV0;
    }

    @Override // com.avito.android.advert.item.parking.c.a
    public final void q0(@Y61.k ParkingAddressShowOnMapParams parkingAddressShowOnMapParams) {
        r2(parkingAddressShowOnMapParams.f78146d, parkingAddressShowOnMapParams.f78145c, parkingAddressShowOnMapParams.f78144b, GeoFromBlock.f82791e, parkingAddressShowOnMapParams.f78147e);
    }

    @Override // com.avito.android.advert.item.consultation.InterfaceC28106l.b
    public final void q1(@Y61.l ConsultationFormData consultationFormData, @Y61.l String str, @Y61.k String str2) {
        I1 i12 = this.f76350h1;
        String str3 = this.f76369o;
        if (i12 != null) {
            i12.f71702e.D(str3, null, consultationFormData, str);
        }
        this.f76272A.I6(str3, str2);
    }

    public final io.reactivex.rxjava3.core.z<AdvertDetailsWithMeta> q2(Integer num) {
        AdvertDetailsWithMeta advertDetailsWithMetaA;
        PreloadCacheKey preloadCacheKey = this.f76384t;
        if (preloadCacheKey != null && (advertDetailsWithMetaA = this.f76352i0.a(preloadCacheKey)) != null) {
            return io.reactivex.rxjava3.core.z.c0(advertDetailsWithMetaA);
        }
        String f82761o = this.f76272A.getF82761o();
        LinkedHashMap linkedHashMap = this.f76336d.f68759a;
        if (linkedHashMap.isEmpty()) {
            linkedHashMap = null;
        }
        LinkedHashMap linkedHashMap2 = linkedHashMap;
        AdvertDetailsFastOpenParams advertDetailsFastOpenParams = this.f76378r;
        return this.f76333c.e(this.f76369o, this.f76372p, this.f76375q, f82761o, linkedHashMap2, advertDetailsFastOpenParams.f71334k, advertDetailsFastOpenParams.f71335l, num).o(this.f76278D.w()).j0(this.f76391w.e());
    }

    @Override // Me.q
    public final void r(int i12) {
        I1 i13 = this.f76350h1;
        if (i13 != null) {
            t.a.a(i13, AdvertDetailsCompositeBrokerV2Item.class, i12, 4);
        }
    }

    @Override // com.avito.android.advert.item.similars_button.i
    public final void r0(@Y61.l DeepLink deepLink) {
        if (deepLink == null) {
            return;
        }
        Z0 z02 = this.f76327Z0;
        if (z02 != null) {
            z02.g(null, deepLink, null);
        }
        this.f76272A.q7(this.f76369o);
    }

    @Override // com.avito.android.advert_details_items.photogallery.c
    public final void r1() {
        AdvertDetails advertDetailsN2 = n2();
        if (advertDetailsN2 == null) {
            return;
        }
        this.f76290I.a(GalleryAction.f84404c, advertDetailsN2.getUxFeedbackConfig());
        this.f76272A.W0(advertDetailsN2);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r2(java.lang.String r33, com.avito.android.remote.model.Coordinates r34, java.lang.String r35, com.avito.android.advert_core.analytics.address.GeoFromBlock r36, com.avito.android.remote.model.RouteButtons r37) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.C28136i0.r2(java.lang.String, com.avito.android.remote.model.Coordinates, java.lang.String, com.avito.android.advert_core.analytics.address.GeoFromBlock, com.avito.android.remote.model.RouteButtons):void");
    }

    @Override // Up0.InterfaceC15557a
    public final void s(@Y61.k DeepLink deepLink) {
        DeepLink deepLinkM2 = m2(deepLink);
        Z0 z02 = this.f76327Z0;
        if (z02 != null) {
            z02.g(null, deepLinkM2, null);
        }
    }

    public final void s2(String str, MultiAddressesInfo multiAddressesInfo, Coordinates coordinates, String str2, RouteButtons routeButtons) {
        List<GeoReference> geoReferences;
        GeoFromBlock geoFromBlock = GeoFromBlock.f82790d;
        AdvertDetails advertDetailsN2 = n2();
        if (advertDetailsN2 == null) {
            return;
        }
        I1 i12 = this.f76350h1;
        if (i12 != null) {
            String id2 = advertDetailsN2.getId();
            SellerAddressesInfo sellerAddressesInfo = advertDetailsN2.getSellerAddressesInfo();
            if (sellerAddressesInfo == null || (geoReferences = sellerAddressesInfo.getGeoReference()) == null) {
                geoReferences = advertDetailsN2.getGeoReferences();
            }
            List<GeoReference> list = geoReferences;
            SellerAddressesInfo sellerAddressesInfo2 = advertDetailsN2.getSellerAddressesInfo();
            RouteButtons routeButtons2 = advertDetailsN2.getInfrastructure() == null ? routeButtons : null;
            RealtyInfrastructure infrastructure = advertDetailsN2.getInfrastructure();
            List<AmenityButton> amenityButtons = infrastructure != null ? infrastructure.getAmenityButtons() : null;
            boolean z12 = advertDetailsN2.getInfrastructure() == null;
            Boolean hideMapButtons = advertDetailsN2.getHideMapButtons();
            Boolean bool = Boolean.TRUE;
            ContactBarData contactBarDataC = kotlin.jvm.internal.L.f(hideMapButtons, bool) ? null : V9.a.c(advertDetailsN2, null, false, false, false, false, false, 255);
            AdvertActions contacts = kotlin.jvm.internal.L.f(advertDetailsN2.getHideMapButtons(), bool) ? null : advertDetailsN2.getContacts();
            String str3 = kotlin.jvm.internal.L.f(advertDetailsN2.getHideMapButtons(), bool) ? null : this.f76375q;
            LocationMap locationMapConfig = advertDetailsN2.getLocationMapConfig();
            String categoryId = advertDetailsN2.getCategoryId();
            AdjustParameters adjustParameters = advertDetailsN2.getAdjustParameters();
            String microCategoryId = adjustParameters != null ? adjustParameters.getMicroCategoryId() : null;
            Boolean shouldShowImportantAddresses = advertDetailsN2.getShouldShowImportantAddresses();
            GeoZones geoZones = this.f76392w0.v().invoke().booleanValue() ? advertDetailsN2.getGeoZones() : null;
            SellerAddressesInfo sellerAddressesInfo3 = advertDetailsN2.getSellerAddressesInfo();
            i12.T(id2, str, multiAddressesInfo, coordinates, str2, list, sellerAddressesInfo2, routeButtons2, amenityButtons, z12, contactBarDataC, contacts, str3, locationMapConfig, categoryId, microCategoryId, shouldShowImportantAddresses, geoZones, sellerAddressesInfo3 != null ? kotlin.jvm.internal.L.f(sellerAddressesInfo3.isWithDelivery(), bool) : false, advertDetailsN2.getRichGeoBlock() != null);
        }
        AdvertDetails advertDetailsN22 = n2();
        if (advertDetailsN22 == null) {
            return;
        }
        String id3 = advertDetailsN22.getId();
        String categoryId2 = advertDetailsN22.getCategoryId();
        AdjustParameters adjustParameters2 = advertDetailsN22.getAdjustParameters();
        this.f76272A.V(id3, categoryId2, adjustParameters2 != null ? adjustParameters2.getMicroCategoryId() : null, geoFromBlock);
    }

    @Override // com.avito.android.advert.item.InterfaceC28130g0
    public final void start() {
        y2(null);
        this.f76360l.d();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    @Override // com.avito.android.advert.item.InterfaceC28130g0
    public final void stop() {
        this.f76342f.onStop();
        io.reactivex.rxjava3.internal.observers.y yVar = this.f76320W0;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        ?? r02 = this.f76316U0;
        if (r02 != 0) {
            r02.dispose();
        }
        io.reactivex.rxjava3.internal.observers.y yVar2 = this.f76322X0;
        if (yVar2 != null) {
            DisposableHelper.a(yVar2);
        }
        io.reactivex.rxjava3.internal.observers.y yVar3 = this.f76338d1;
        if (yVar3 != null) {
            DisposableHelper.a(yVar3);
        }
        kotlinx.coroutines.N0 n02 = this.f76325Y0;
        if (n02 != null) {
            ((kotlinx.coroutines.V0) n02).c(null);
        }
        kotlinx.coroutines.N0 n03 = this.f76377q1;
        if (n03 != null) {
            ((kotlinx.coroutines.V0) n03).c(null);
        }
        kotlinx.coroutines.N0 n04 = this.f76380r1;
        if (n04 != null) {
            ((kotlinx.coroutines.V0) n04).c(null);
        }
        kotlinx.coroutines.N0 n05 = this.f76288H1;
        if (n05 != null) {
            ((kotlinx.coroutines.V0) n05).c(null);
        }
        kotlinx.coroutines.U.b(this.f76371o1, null);
    }

    @Override // com.avito.android.advert.item.consultation.InterfaceC28106l.b
    public final void t(@Y61.k DeepLink deepLink) {
        Z0 z02 = this.f76327Z0;
        if (z02 != null) {
            z02.g(null, deepLink, null);
        }
    }

    @Override // com.avito.android.advert.item.realty_imv.g.c
    public final void t0(@Y61.k DetailsSheetLinkBody detailsSheetLinkBody) {
        Z0 z02 = this.f76327Z0;
        if (z02 != null) {
            z02.A(detailsSheetLinkBody, null);
        }
    }

    @Override // com.avito.android.advert_details_items.rich_geo_block.l.b
    public final void t1() throws Resources.NotFoundException {
        AdvertDetails advertDetailsN2 = n2();
        if (advertDetailsN2 == null) {
            return;
        }
        this.f76389v.a(advertDetailsN2.getAddress());
        I1 i12 = this.f76350h1;
        if (i12 != null) {
            i12.S();
        }
        String id2 = advertDetailsN2.getId();
        String categoryId = advertDetailsN2.getCategoryId();
        ScreenIdField screenIdField = ScreenIdField.f90251c;
        this.f76272A.O2(id2, categoryId, "item");
    }

    public final boolean t2() {
        String id2 = CategoryIds.AUTO.CARS.getId();
        AdvertDetails advertDetailsN2 = n2();
        return kotlin.jvm.internal.L.f(id2, advertDetailsN2 != null ? advertDetailsN2.getCategoryId() : null);
    }

    @Override // com.avito.android.advert.item.InterfaceC28130g0
    public final void t4(@Y61.k DeepLink deepLink) {
        b.a.a(this.f76334c0, deepLink, null, null, 6);
    }

    @Override // com.avito.android.advert.item.trust_factors.i
    public final void u(@Y61.l DeepLink deepLink) {
        Z0 z02;
        if (deepLink == null || (z02 = this.f76327Z0) == null) {
            return;
        }
        z02.g(null, deepLink, null);
    }

    @Override // com.avito.android.advert.item.comfortable_deal.l
    public final void u0(@Y61.k ExpertBlock expertBlock, @Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.k List list) {
        Z0 z02 = this.f76327Z0;
        if (z02 != null) {
            AdvertDetailsFragment advertDetailsFragment = z02.f72298c;
            if (advertDetailsFragment.getChildFragmentManager().H("EXPERT_BLOCK_BOTTOM_SHEET") != null) {
                return;
            }
            ExpertBlockBottomSheetDialog.f74273i0.getClass();
            ExpertBlockBottomSheetDialog expertBlockBottomSheetDialog = new ExpertBlockBottomSheetDialog();
            ExpertBlockBottomSheetOpenParams expertBlockBottomSheetOpenParams = new ExpertBlockBottomSheetOpenParams(expertBlock, str, str2, str3, list);
            expertBlockBottomSheetDialog.f74275h0.setValue(expertBlockBottomSheetDialog, ExpertBlockBottomSheetDialog.f74274j0[0], expertBlockBottomSheetOpenParams);
            com.avito.android.lib.util.g.b(expertBlockBottomSheetDialog, advertDetailsFragment.requireContext(), advertDetailsFragment.getChildFragmentManager(), "EXPERT_BLOCK_BOTTOM_SHEET");
        }
    }

    public final void u2(AdvertDetailsStyle advertDetailsStyle, AdvertNavBarStyle advertNavBarStyle) {
        Y41.l<? super AdvertDetailsStyle, kotlin.G0> lVar = this.f76306P2;
        if (lVar != null) {
            ((L) lVar).invoke(advertDetailsStyle);
        }
        this.f76356j1.setValue(advertNavBarStyle != null ? new com.avito.android.ui.status_bar.d(AdvertNavBarStyleKt.toSearchViewThemeAppearance(advertNavBarStyle.getThemeAppearance()), new d.a.e(advertNavBarStyle.getBackgroundColor())) : com.avito.android.advert.advert_details_style.c.a(advertDetailsStyle).f68632a ? new com.avito.android.ui.status_bar.d(ThemeAppearance.f181337e, new d.a.C9356a(R.attr.constantBlack)) : null);
        Bundle bundle = new Bundle();
        AdvertNavBarStyleKt.putAdvertNavBarStyle(bundle, advertNavBarStyle);
        this.f76334c0.Qb(bundle);
    }

    @Override // Me.q
    public final void v(@Y61.k DeepLink deepLink) {
        Z0 z02 = this.f76327Z0;
        if (z02 != null) {
            z02.g(null, deepLink, null);
        }
    }

    @Override // com.avito.android.advert_core.advert.k
    public final void w0(@Y61.k AdvertDetailsFlatViewType advertDetailsFlatViewType) {
        String id2;
        Developer developerV2;
        Map<String, String> analyticsParams;
        String developmentId;
        Developer developerV22;
        if (advertDetailsFlatViewType == AdvertDetailsFlatViewType.f82421c) {
            AdvertDetails advertDetailsN2 = n2();
            String str = "";
            if (advertDetailsN2 == null || (developerV22 = advertDetailsN2.getDeveloperV2()) == null || (id2 = developerV22.getId()) == null) {
                id2 = "";
            }
            AdvertDetails advertDetailsN22 = n2();
            if (advertDetailsN22 != null && (developmentId = advertDetailsN22.getDevelopmentId()) != null) {
                str = developmentId;
            }
            AdvertDetails advertDetailsN23 = n2();
            this.f76272A.V2(this.f76369o, id2, str, (advertDetailsN23 == null || (developerV2 = advertDetailsN23.getDeveloperV2()) == null || (analyticsParams = developerV2.getAnalyticsParams()) == null) ? null : analyticsParams.get("appearAction"));
        }
    }

    public final void w2(boolean z12) {
        this.f76382s0.a();
        AdvertDetailsWithMeta advertDetailsWithMeta = this.f76344f1;
        InterfaceC27816b0 interfaceC27816b0P2 = p2(advertDetailsWithMeta != null ? advertDetailsWithMeta.f82645b : null);
        if (interfaceC27816b0P2 != null) {
            interfaceC27816b0P2.clearItems();
        }
        this.f76275B0.invoke(InterfaceC42497a.k.f406053a);
        this.f76344f1 = null;
        this.f76396y0.m0();
        this.f76398z0.m0();
        this.f76273A0.m0();
        if (z12) {
            this.f76357k.clearItems();
            this.f76360l.onCleared();
        }
    }

    @Override // com.avito.android.advert.item.short_term_rent.payment_toggles.h.a
    public final void x(@Y61.k LinkedHashMap linkedHashMap, @Y61.l ParametrizedEvent parametrizedEvent) {
        if (parametrizedEvent != null) {
            this.f76319W.q(parametrizedEvent);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            this.f76336d.f68759a.put((String) entry.getKey(), (String) entry.getValue());
        }
        this.f76289H2 = true;
        v2(this);
    }

    @Override // com.avito.android.advert_core.advert.p
    public final void x1() {
        AdvertDetails advertDetailsN2 = n2();
        if (advertDetailsN2 != null) {
            this.f76272A.R5(advertDetailsN2);
        }
    }

    @Override // com.avito.android.advert.item.additionalSeller.t.b
    public final void y(@Y61.k DevelopmentFeature developmentFeature) {
        Context context;
        Z0 z02 = this.f76327Z0;
        if (z02 == null || (context = z02.f72298c.getContext()) == null) {
            return;
        }
        com.avito.android.advert_core.analytics.a aVar = z02.f72293B;
        if (aVar != null) {
            aVar.S2(this.f76369o, developmentFeature.getName());
        }
        com.avito.android.lib.util.g.a(new com.avito.android.advert.item.additionalSeller.dialog.a(context, developmentFeature));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    public final void y2(Integer num) {
        io.reactivex.rxjava3.core.z<AdvertDetailsWithMeta> zVarQ2;
        Object objV0;
        AdvertDetailsWithMeta advertDetailsWithMeta = this.f76344f1;
        if (advertDetailsWithMeta != null) {
            l2(advertDetailsWithMeta);
            return;
        }
        ?? r02 = this.f76316U0;
        if (r02 == 0 || r02.getF318621e()) {
            CrossFadeOpenAbTestGroup crossFadeOpenAbTestGroupA = this.f76312S0.a();
            crossFadeOpenAbTestGroupA.getClass();
            CrossFadeOpenAbTestGroup crossFadeOpenAbTestGroup = CrossFadeOpenAbTestGroup.f67795c;
            boolean z12 = crossFadeOpenAbTestGroupA == crossFadeOpenAbTestGroup || crossFadeOpenAbTestGroupA == CrossFadeOpenAbTestGroup.f67796d;
            AdvertDetailsFastOpenParams advertDetailsFastOpenParams = this.f76378r;
            if (z12) {
                boolean z13 = crossFadeOpenAbTestGroupA == crossFadeOpenAbTestGroup;
                I1 i12 = this.f76350h1;
                if (i12 != null) {
                    String str = advertDetailsFastOpenParams.f71325b;
                    if (!z13) {
                        str = null;
                    }
                    String str2 = z13 ? advertDetailsFastOpenParams.f71326c : null;
                    D6.H(i12.f71754z0);
                    D6.w(i12.f71750x0);
                    boolean z14 = str == null || str.length() == 0;
                    TextView textView = i12.f71640A0;
                    D6.G(textView, !z14);
                    boolean z15 = str2 == null || str2.length() == 0;
                    TextView textView2 = i12.f71642B0;
                    D6.G(textView2, true ^ z15);
                    textView.setText(str);
                    textView2.setText(str2);
                }
            } else {
                S sO2 = o2(n2());
                if (sO2 != null) {
                    sO2.q(advertDetailsFastOpenParams);
                }
            }
            String str3 = advertDetailsFastOpenParams.f71334k.f71345c;
            com.avito.android.advert_core.analytics.a aVar = this.f76272A;
            aVar.g0(str3);
            this.f76342f.g0(str3);
            PreloadingPromiseTestGroup preloadingPromiseTestGroup = this.f76277C0;
            if (!preloadingPromiseTestGroup.a()) {
                this.f76278D.q();
            }
            aVar.s0();
            if (num != null) {
                zVarQ2 = q2(num);
            } else {
                zVarQ2 = this.f76318V0;
                if (zVarQ2 == null) {
                    zVarQ2 = q2(null);
                }
            }
            q qVar = new q();
            p pVar = new p();
            if (preloadingPromiseTestGroup.a()) {
                LinkedHashMap linkedHashMap = this.f76336d.f68759a;
                objV0 = this.f76330b.c(new com.avito.android.advert.item.preload.f(linkedHashMap.isEmpty() ? null : linkedHashMap, num), qVar, pVar, com.avito.android.preloading.m.f221865l);
            } else {
                objV0 = zVarQ2.v0(new V0.a(qVar), new V0.a(pVar), io.reactivex.rxjava3.internal.functions.a.f401993c);
            }
            this.f76316U0 = (AtomicReference) objV0;
        }
    }

    @Override // com.avito.android.advert.item.InterfaceC28130g0
    public final void y3(@Y61.k String str, boolean z12) {
        o oVar = new o(str, z12);
        com.avito.android.advert_core.safedeal.trust_factors.a aVar = this.f76348h;
        List<? extends TrustFactorsComponent> listInvoke = oVar.invoke(aVar.f84276a);
        aVar.f84276a = listInvoke;
        InterfaceC27816b0 interfaceC27816b0P2 = p2(n2());
        if (interfaceC27816b0P2 != null) {
            interfaceC27816b0P2.d(listInvoke, true);
        }
        this.f76275B0.invoke(new InterfaceC42497a.n(listInvoke));
        this.f76351i.K();
    }

    @Override // com.avito.android.advert_details_items.photogallery.c
    public final void z(int i12, long j12) {
        x2(this, i12, Long.valueOf(j12), Boolean.FALSE, null, 8);
    }

    @Override // com.avito.android.advert.item.InterfaceC28130g0
    public final void Ia() {
    }

    @Override // La.g
    public final void ic(@Y61.k String str) {
    }

    @Override // com.avito.android.serp.adapter.K
    public final void p9(@Y61.k DeepLink deepLink) {
    }

    public /* synthetic */ C28136i0(com.avito.android.preloading.j jVar, InterfaceC27797i interfaceC27797i, C27689b c27689b, z7.b bVar, InterfaceC28265d interfaceC28265d, InterfaceC28173a interfaceC28173a, com.avito.android.advert_core.safedeal.trust_factors.a aVar, InterfaceC28280j interfaceC28280j, InterfaceC28243x interfaceC28243x, com.avito.android.advert.item.similars.a aVar2, com.avito.android.advert.item.commercials.f fVar, S s5, com.avito.android.account.E e12, String str, Integer num, String str2, AdvertDetailsFastOpenParams advertDetailsFastOpenParams, AdvertDetailsMultiItemState advertDetailsMultiItemState, PreloadCacheKey preloadCacheKey, long j12, com.avito.android.util.U u12, InterfaceC35745a5 interfaceC35745a5, com.avito.android.advert_details_items.sellerprofile.U u13, com.avito.android.favorite.n nVar, com.avito.android.advert.item.note.c cVar, com.avito.android.advert_core.analytics.a aVar3, G5.a aVar4, InterfaceC42678a interfaceC42678a, A7.b bVar2, com.avito.android.analytics.screens.tracker.Q q12, InterfaceC28373a interfaceC28373a, com.avito.android.autoteka.data.a aVar5, AK0.l lVar, X9.b bVar3, kotlinx.coroutines.flow.d2 d2Var, io.reactivex.rxjava3.core.z zVar, io.reactivex.rxjava3.core.z zVar2, io.reactivex.rxjava3.core.z zVar3, io.reactivex.rxjava3.core.z zVar4, InterfaceC34162r0 interfaceC34162r0, com.avito.android.component.toast.util.c cVar2, com.avito.android.credits.q qVar, com.avito.android.credits.k kVar, boolean z12, C29640d c29640d, UN.a aVar6, C43624b c43624b, InterfaceC25420a interfaceC25420a, com.avito.android.advert_core.short_term_rent.a aVar7, com.avito.android.advertising.kebab.n nVar2, com.avito.android.favorite_apprater.g gVar, com.avito.android.advert_collection_toast.b bVar4, com.avito.android.advert.item.services_repair.a aVar8, com.avito.android.deeplink_handler.handler.composite.a aVar9, W9.c cVar3, com.avito.android.leasing_calculator.m mVar, com.avito.android.advert.item.icebreakers.d dVar, com.avito.android.advert.item.icebreakers_redesign.d dVar2, com.avito.android.advert.item.service_order_request.n nVar3, C28124e0 c28124e0, com.avito.android.advert.item.ownership_cost.f fVar2, com.avito.android.delayed_ux_feedback.d dVar3, com.avito.android.util.R0 r02, InterfaceC27811a interfaceC27811a, com.avito.android.advert.item.consultation.J j13, InterfaceC28164a interfaceC28164a, String str3, ScreenSource screenSource, InterfaceC13095a interfaceC13095a, com.avito.android.advert.item.properties.f fVar3, InterfaceC49780b interfaceC49780b, w7.b bVar5, com.avito.android.advert.item.safedeal.trust_factors.a aVar10, B2 b22, com.avito.android.advert.item.hotel.hotel_offer.m mVar2, com.avito.android.advert.item.compatibility.v2.f fVar4, com.avito.android.advert.item.compatibility.v3.k kVar2, com.avito.android.advert.item.compatibility.v4.f fVar5, Y41.l lVar2, PreloadingPromiseTestGroup preloadingPromiseTestGroup, com.avito.android.advert.business360.b bVar6, N5 n52, u3.l lVar3, com.avito.android.rating_persistence.llm_summary.h hVar, u3.f fVar6, com.avito.android.advert_core.pp_recall_promo.close_banners.a aVar11, com.avito.android.advert.item.neighboring_dates.d dVar4, com.avito.android.advert.item.gallery.a aVar12, com.avito.android.bxcontent.N1 n12, C36135w2 c36135w2, com.avito.android.onboarding_manager.f fVar7, C35838l3 c35838l3, com.avito.android.advert_details_items.toast_item_popularity.a aVar13, InterfaceC50374a interfaceC50374a, ZL.a aVar14, u3.f fVar8, int i12, int i13, int i14, C42822w c42822w) {
        this(jVar, interfaceC27797i, c27689b, bVar, interfaceC28265d, interfaceC28173a, aVar, interfaceC28280j, interfaceC28243x, aVar2, fVar, s5, e12, str, num, str2, advertDetailsFastOpenParams, advertDetailsMultiItemState, preloadCacheKey, (i12 & 524288) != 0 ? 0L : j12, u12, interfaceC35745a5, u13, nVar, cVar, aVar3, aVar4, interfaceC42678a, bVar2, q12, interfaceC28373a, aVar5, lVar, bVar3, d2Var, zVar, zVar2, zVar3, zVar4, interfaceC34162r0, cVar2, qVar, kVar, z12, c29640d, aVar6, c43624b, interfaceC25420a, aVar7, nVar2, gVar, bVar4, aVar8, aVar9, cVar3, mVar, dVar, dVar2, nVar3, c28124e0, fVar2, dVar3, r02, interfaceC27811a, j13, interfaceC28164a, str3, screenSource, interfaceC13095a, fVar3, interfaceC49780b, bVar5, aVar10, b22, mVar2, fVar4, kVar2, fVar5, lVar2, preloadingPromiseTestGroup, bVar6, n52, lVar3, hVar, fVar6, aVar11, dVar4, aVar12, n12, c36135w2, fVar7, c35838l3, aVar13, interfaceC50374a, aVar14, fVar8);
    }
}
