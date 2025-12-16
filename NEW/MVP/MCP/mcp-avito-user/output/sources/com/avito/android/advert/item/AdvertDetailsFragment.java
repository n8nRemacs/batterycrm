package com.avito.android.advert.item;

import Ax.InterfaceC13095a;
import Cd.C13243a;
import Dh0.InterfaceC13400a;
import Ds.InterfaceC13437a;
import Gs.InterfaceC13913b;
import Ju.InterfaceC14249c;
import Oi0.C14700d;
import Oi0.InterfaceC14698b;
import Zd.InterfaceC19542a;
import Zp0.InterfaceC19587b;
import Zp0.InterfaceC19588c;
import ak.C19902a;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.C22960s;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C19918B;
import androidx.view.InterfaceC22969B;
import androidx.view.InterfaceC22983P;
import androidx.view.P0;
import cU0.C27106d;
import com.avito.android.C29640d;
import com.avito.android.R;
import com.avito.android.adapter.analytic.GalleryFromBlock;
import com.avito.android.adapter.gallery.GalleryItem;
import com.avito.android.advert.AdvertDetailsActivity;
import com.avito.android.advert.InterfaceC27793e;
import com.avito.android.advert.InterfaceC28243x;
import com.avito.android.advert.di.InterfaceC27709s;
import com.avito.android.advert.di.r;
import com.avito.android.advert.item.AdvertDetailsFragment;
import com.avito.android.advert.item.O;
import com.avito.android.advert.item.beduin.v2.di.a;
import com.avito.android.advert.item.consultation.InterfaceC28097c;
import com.avito.android.advert.item.consultation.InterfaceC28111q;
import com.avito.android.advert.item.safedeal.InterfaceC28173a;
import com.avito.android.advert.item.select.parameters_v3.InterfaceC28200c;
import com.avito.android.advert_core.contactbar.InterfaceC28265d;
import com.avito.android.advert_details.AdvertDetailsStyle;
import com.avito.android.advert_details_items.sellerprofile.InterfaceC28280j;
import com.avito.android.advertising.analytics.events.BannerPageSource;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.event.favorite.SubscriptionSource;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import com.avito.android.analytics.screens.AdvertScreen;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.beduin.v2.page.BaseBeduinHostFragment;
import com.avito.android.beduin.v2.page.m;
import com.avito.android.bottom_navigation.ui.fragment.factory.NavigationState;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import com.avito.android.comfortable_deal.deeplink.PpRecallDeeplink;
import com.avito.android.comparison.ComparisonDeepLink;
import com.avito.android.component.toast.util.c;
import com.avito.android.confirm_documents_bottom_sheet.ConfirmDocumentsBottomSheetDeeplink;
import com.avito.android.cv_actualization.deeplink.JsxCvActualizationDeeplink;
import com.avito.android.deal_confirmation.sheet.DealConfirmationSheetActivity;
import com.avito.android.deep_linking.links.CreateChannelLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.ToastMessageLink;
import com.avito.android.deep_linking.links.UserAddressLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.deeplink_handler.view.impl.d;
import com.avito.android.delivery.DeliveryFlowPaymentStatus;
import com.avito.android.delivery_combined_buttons_public.CombinedButtonType;
import com.avito.android.di.C29972i;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.esia_redirect_screen.EsiaRedirectDeeplink;
import com.avito.android.help_center.InterfaceC30751h;
import com.avito.android.job.cv_packages.links.CvPackagesLink;
import com.avito.android.lib.beduin_v2.feature.di.C31138n0;
import com.avito.android.lib.beduin_v2.feature.di.H;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.ownership.Owners;
import com.avito.android.photo_gallery.InterfaceC33199l;
import com.avito.android.photo_gallery.PhotoGalleryIntentFactory;
import com.avito.android.progress_info_toast_bar.ProgressInfoToastBar;
import com.avito.android.rating_form.deep_link.RatingFormLink;
import com.avito.android.remote.model.AdvertNavBarStyle;
import com.avito.android.remote.model.imv_services.ImvServices;
import com.avito.android.safedeal.remote.model.SafeDealPaymentBlockResponse;
import com.avito.android.select.Arguments;
import com.avito.android.service_booking.deeplinks.create.ServiceBookingCreateLink;
import com.avito.android.ui.fragments.TabBaseFragment;
import com.avito.android.ui.status_bar.a;
import com.avito.android.util.C35838l3;
import com.avito.android.util.C35966w1;
import com.avito.android.util.C35967w2;
import com.avito.android.util.C35974x2;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.K2;
import com.avito.android.util.Kundle;
import com.avito.android.util.L4;
import com.avito.android.util.N3;
import com.avito.android.util.V2;
import com.avito.android.util.bottom_gap.e;
import com.avito.beduin.v2.avito.component.button.state.C36216a;
import com.avito.beduin.v2.interaction.detached.flow.BottomSheetContentPaddings;
import com.avito.beduin.v2.interaction.detached.flow.BottomSheetHeight;
import com.avito.beduin.v2.interaction.detached.flow.BottomSheetModalSize;
import com.avito.beduin.v2.interaction.detached.flow.modal.ModalButtonsOrientation;
import com.google.common.collect.AbstractC37412t1;
import dd0.InterfaceC39709b;
import gj.o;
import iT.C41343c;
import iT.InterfaceC41341a;
import iT.InterfaceC41342b;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import k4.InterfaceC42497a;
import kotlin.C42727D;
import kotlin.InterfaceC40047a;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kv.C43501a;
import nN.InterfaceC44295a;
import ob.C44742f;
import xv.C50005c;
import y7.InterfaceC50074a;
import z1.AbstractC50339a;

/* compiled from: AdvertDetailsFragment.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n:\u0001\rB\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/avito/android/advert/item/AdvertDetailsFragment;", "Lcom/avito/android/ui/fragments/TabBaseFragment;", "Lcom/avito/android/advert/item/j;", "Lcom/avito/android/select/p;", "Lcom/avito/android/ui/fragments/c;", "Lcom/avito/android/analytics/screens/j$b;", "LGs/b;", "Lgj/i;", "LFV0/c;", "Lcom/avito/beduin/v2/interaction/detached/flow/b;", "Lcom/avito/android/ui/status_bar/a;", "<init>", "()V", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AdvertDetailsFragment extends TabBaseFragment implements InterfaceC28138j, com.avito.android.select.p, com.avito.android.ui.fragments.c, InterfaceC28477j.b, InterfaceC13913b, gj.i, FV0.c, com.avito.beduin.v2.interaction.detached.flow.b, com.avito.android.ui.status_bar.a {

    /* renamed from: B5, reason: collision with root package name */
    @Y61.k
    public static final C27803a f71351B5 = new C27803a(null);

    /* renamed from: A0, reason: collision with root package name */
    @Inject
    public InterfaceC19542a f71352A0;

    /* renamed from: A3, reason: collision with root package name */
    @Inject
    public com.avito.android.advert.item.icebreakers_redesign.d f71353A3;

    /* renamed from: A4, reason: collision with root package name */
    @Inject
    public com.avito.android.advert_amenities.dialog.b f71354A4;

    /* renamed from: A5, reason: collision with root package name */
    @Y61.l
    public Kundle f71355A5;

    /* renamed from: B0, reason: collision with root package name */
    @Inject
    public yf.m f71356B0;

    /* renamed from: B3, reason: collision with root package name */
    @Inject
    public com.avito.android.advert.item.realty_usp.g f71357B3;

    /* renamed from: B4, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.a f71358B4;

    /* renamed from: C0, reason: collision with root package name */
    @Inject
    public com.avito.android.webview.l f71359C0;

    /* renamed from: C3, reason: collision with root package name */
    @Inject
    public com.avito.android.advert_core.pp_recall_promo.c f71360C3;

    /* renamed from: C4, reason: collision with root package name */
    @Inject
    public com.avito.android.ui.status_bar.e f71361C4;

    /* renamed from: D0, reason: collision with root package name */
    @Inject
    public com.avito.android.messenger.F f71362D0;

    /* renamed from: D3, reason: collision with root package name */
    @Inject
    public com.avito.android.advert.item.safedeal.services.c f71363D3;

    /* renamed from: D4, reason: collision with root package name */
    @Inject
    public AbstractC37412t1 f71364D4;

    /* renamed from: E0, reason: collision with root package name */
    @Inject
    public com.avito.android.deal_confirmation.sheet.j f71365E0;

    /* renamed from: E3, reason: collision with root package name */
    @Inject
    public com.avito.android.advert_core.advert_badge_bar.e f71366E3;

    /* renamed from: E4, reason: collision with root package name */
    @Inject
    public com.avito.android.advert.item.properties.f f71367E4;

    /* renamed from: F0, reason: collision with root package name */
    @Inject
    public oO.f f71368F0;

    /* renamed from: F3, reason: collision with root package name */
    @Inject
    public com.avito.android.advert.item.compatibility.v2.f f71369F3;

    /* renamed from: F4, reason: collision with root package name */
    @Inject
    public com.avito.android.advert.viewed.d f71370F4;

    /* renamed from: G0, reason: collision with root package name */
    @Inject
    public com.avito.android.credits.f f71371G0;

    /* renamed from: G3, reason: collision with root package name */
    @Inject
    public com.avito.android.advert.item.compatibility.v3.k f71372G3;

    /* renamed from: G4, reason: collision with root package name */
    @Inject
    public com.avito.android.video_snippets.g f71373G4;

    /* renamed from: H0, reason: collision with root package name */
    @Inject
    public InterfaceC30751h f71374H0;

    /* renamed from: H1, reason: collision with root package name */
    @Inject
    public com.avito.android.serp.adapter.Y0 f71375H1;

    /* renamed from: H2, reason: collision with root package name */
    @Inject
    public com.avito.android.favorite_apprater.g f71376H2;

    /* renamed from: H3, reason: collision with root package name */
    @Inject
    public com.avito.android.advert.item.compatibility.v4.f f71377H3;

    /* renamed from: H4, reason: collision with root package name */
    @Inject
    public com.avito.android.advert.item.promo_mechanics.a f71378H4;

    /* renamed from: I0, reason: collision with root package name */
    @Inject
    public PhotoGalleryIntentFactory f71379I0;

    /* renamed from: I3, reason: collision with root package name */
    @Inject
    public com.avito.android.advert.item.service_booking.m f71380I3;

    /* renamed from: I4, reason: collision with root package name */
    @Inject
    public com.avito.android.advert.item.geo_distance.f f71381I4;

    /* renamed from: J0, reason: collision with root package name */
    @Inject
    public InterfaceC33199l f71382J0;

    /* renamed from: J3, reason: collision with root package name */
    @Inject
    public InterfaceC35741a1 f71383J3;

    /* renamed from: J4, reason: collision with root package name */
    @Inject
    public com.avito.android.pinch_to_zoom.b f71384J4;

    /* renamed from: K0, reason: collision with root package name */
    @Inject
    public com.avito.android.developments_advice.l f71385K0;

    /* renamed from: K3, reason: collision with root package name */
    @Inject
    public com.avito.android.advert_core.advert.l f71386K3;

    /* renamed from: K4, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f71387K4;

    /* renamed from: L0, reason: collision with root package name */
    @Inject
    public com.avito.android.spare_parts.bottom_sheet.i f71388L0;

    /* renamed from: L3, reason: collision with root package name */
    @Inject
    public com.avito.android.advert.item.service_order_request.n f71389L3;

    /* renamed from: L4, reason: collision with root package name */
    @Inject
    public com.avito.android.app_rater.b f71390L4;

    /* renamed from: M0, reason: collision with root package name */
    @Inject
    public com.avito.android.review_gallery.i f71391M0;

    /* renamed from: M3, reason: collision with root package name */
    @Inject
    public com.avito.android.V f71392M3;

    /* renamed from: M4, reason: collision with root package name */
    @Inject
    public com.avito.android.advert.item.neighboring_dates.d f71393M4;

    /* renamed from: N0, reason: collision with root package name */
    @Inject
    public com.avito.android.util.L0 f71394N0;

    /* renamed from: N3, reason: collision with root package name */
    @Inject
    public com.avito.android.advert_core.map.d f71395N3;

    /* renamed from: N4, reason: collision with root package name */
    @Inject
    public com.avito.android.util.R0 f71396N4;

    /* renamed from: O0, reason: collision with root package name */
    @Inject
    @N3.c
    public L4 f71397O0;

    /* renamed from: O3, reason: collision with root package name */
    @Inject
    public com.avito.android.advert_core.development_offers.f f71398O3;

    /* renamed from: O4, reason: collision with root package name */
    @Inject
    public com.avito.android.util.O0 f71399O4;

    /* renamed from: P0, reason: collision with root package name */
    @Inject
    public InterfaceC28280j f71400P0;

    /* renamed from: P2, reason: collision with root package name */
    @Inject
    public com.avito.android.advert.viewed.f f71401P2;

    /* renamed from: P3, reason: collision with root package name */
    @Inject
    public com.avito.android.advert_core.offers.c f71402P3;

    /* renamed from: P4, reason: collision with root package name */
    @Inject
    public com.avito.android.util.bottom_gap.e f71403P4;

    /* renamed from: Q0, reason: collision with root package name */
    @Inject
    public z7.b f71404Q0;

    /* renamed from: Q2, reason: collision with root package name */
    @Inject
    public com.avito.android.section.action.b f71405Q2;

    /* renamed from: Q3, reason: collision with root package name */
    @Inject
    public com.avito.android.advert_core.auto_select_parameters_v2.advantage.c f71406Q3;

    /* renamed from: Q4, reason: collision with root package name */
    @Inject
    public com.avito.android.util.bottom_gap.c f71407Q4;

    /* renamed from: R0, reason: collision with root package name */
    @Inject
    public com.avito.android.advert.item.anchor_trust_factors.topbar.a f71408R0;

    /* renamed from: R2, reason: collision with root package name */
    @Inject
    public com.avito.android.section.o f71409R2;

    /* renamed from: R3, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.item_visibility_tracker.b f71410R3;

    /* renamed from: R4, reason: collision with root package name */
    @Inject
    public com.avito.android.mortgage_calculator.internal.T0 f71411R4;

    /* renamed from: S0, reason: collision with root package name */
    @Inject
    public com.avito.android.advert.item.anchor_trust_factors.l f71412S0;

    /* renamed from: S2, reason: collision with root package name */
    @Inject
    public com.avito.android.advert.item.creditinfo.buzzoola.w f71413S2;

    /* renamed from: S3, reason: collision with root package name */
    @Inject
    public com.avito.android.advert.item.beduin.v2.b f71414S3;

    /* renamed from: S4, reason: collision with root package name */
    @Y61.k
    public final androidx.view.O0 f71415S4;

    /* renamed from: T0, reason: collision with root package name */
    @Inject
    public InterfaceC28265d f71416T0;

    /* renamed from: T2, reason: collision with root package name */
    @Inject
    public com.avito.android.advertising.adapter.items.buzzoola.premium.r f71417T2;

    /* renamed from: T3, reason: collision with root package name */
    @Inject
    public com.avito.android.advertising.loaders.j f71418T3;

    /* renamed from: T4, reason: collision with root package name */
    @Inject
    public c2 f71419T4;

    /* renamed from: U0, reason: collision with root package name */
    @Inject
    public com.avito.android.deal_confirmation.d f71420U0;

    /* renamed from: U2, reason: collision with root package name */
    @Inject
    public com.avito.android.credits.q f71421U2;

    /* renamed from: U3, reason: collision with root package name */
    @Inject
    public com.avito.android.advertising.adapter.items.avito.profile_promo_gallery.h f71422U3;

    /* renamed from: U4, reason: collision with root package name */
    @Y61.k
    public final androidx.view.O0 f71423U4;

    /* renamed from: V0, reason: collision with root package name */
    @Inject
    public InterfaceC28243x f71424V0;

    /* renamed from: V2, reason: collision with root package name */
    @Inject
    public com.avito.android.credits.broker_link.default_link.d f71425V2;

    /* renamed from: V3, reason: collision with root package name */
    @Inject
    public com.avito.android.advert.item.hotel.hotel_offer.konveyor.main.c f71426V3;

    /* renamed from: V4, reason: collision with root package name */
    @Inject
    public C28144l f71427V4;

    /* renamed from: W0, reason: collision with root package name */
    @Inject
    public C29640d f71428W0;

    /* renamed from: W2, reason: collision with root package name */
    @Inject
    public InterfaceC13437a f71429W2;

    /* renamed from: W3, reason: collision with root package name */
    @Inject
    public com.avito.android.advert.item.short_term_rent.payment_toggles.h f71430W3;

    /* renamed from: W4, reason: collision with root package name */
    @Inject
    public com.avito.android.advert.item.complementary.c f71431W4;

    /* renamed from: X0, reason: collision with root package name */
    @Inject
    public InterfaceC28173a f71432X0;

    /* renamed from: X1, reason: collision with root package name */
    @Inject
    public com.avito.android.favorite.n f71433X1;

    /* renamed from: X2, reason: collision with root package name */
    @Inject
    public A7.b f71434X2;

    /* renamed from: X3, reason: collision with root package name */
    @Inject
    public com.avito.android.advert.item.hotel.hotel_offer.j f71435X3;

    /* renamed from: X4, reason: collision with root package name */
    @Inject
    public com.avito.android.advert_details_items.photogallery.c f71436X4;

    /* renamed from: Y0, reason: collision with root package name */
    @Inject
    public com.avito.android.advert.item.b2c.h f71437Y0;

    /* renamed from: Y2, reason: collision with root package name */
    @Inject
    public com.avito.android.advert_details_items.description.c f71438Y2;

    /* renamed from: Y3, reason: collision with root package name */
    @Inject
    public com.avito.android.advert.item.hotel.hotel_offer.floating_view.a f71439Y3;

    /* renamed from: Y4, reason: collision with root package name */
    @Inject
    public com.avito.android.advert_details_items.sellerprofile.a0 f71440Y4;

    /* renamed from: Z0, reason: collision with root package name */
    @Inject
    public com.avito.android.advert.item.address_centrity.i f71441Z0;

    /* renamed from: Z2, reason: collision with root package name */
    @Inject
    public com.avito.android.advert_core.body_condition.f f71442Z2;

    /* renamed from: Z3, reason: collision with root package name */
    @Inject
    public com.avito.android.lib.deprecated_design.dialog.a f71443Z3;

    /* renamed from: Z4, reason: collision with root package name */
    @Inject
    public com.avito.android.advert_favorites_toast.a f71444Z4;

    /* renamed from: a1, reason: collision with root package name */
    @Inject
    public com.avito.android.advert.item.select.controls.g f71445a1;

    /* renamed from: a3, reason: collision with root package name */
    @Inject
    public com.avito.android.advert_details_items.address.c f71446a3;

    /* renamed from: a4, reason: collision with root package name */
    @Inject
    public InterfaceC50074a f71447a4;

    /* renamed from: a5, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f71448a5;

    /* renamed from: b1, reason: collision with root package name */
    @Inject
    public com.avito.android.advert.item.select.no_click_contact.c f71449b1;

    /* renamed from: b3, reason: collision with root package name */
    @Inject
    public com.avito.android.advert_details_items.rich_geo_block.e f71450b3;

    /* renamed from: b4, reason: collision with root package name */
    @Inject
    public com.avito.android.component.toast.util.c f71451b4;

    /* renamed from: b5, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f71452b5;

    /* renamed from: c1, reason: collision with root package name */
    @Inject
    public InterfaceC28200c f71453c1;

    /* renamed from: c3, reason: collision with root package name */
    @Inject
    public com.avito.android.advert_details_items.campaigns.c f71454c3;

    /* renamed from: c4, reason: collision with root package name */
    @Inject
    public com.avito.android.serp.adapter.closable.c f71455c4;

    /* renamed from: c5, reason: collision with root package name */
    public String f71456c5;

    /* renamed from: d1, reason: collision with root package name */
    @Inject
    public com.avito.android.serp.adapter.constructor.A f71457d1;

    /* renamed from: d3, reason: collision with root package name */
    @Inject
    public com.avito.android.advert.item.show_on_map.c f71458d3;

    /* renamed from: d4, reason: collision with root package name */
    @Inject
    public com.avito.android.advert.item.cv_state.c f71459d4;

    /* renamed from: d5, reason: collision with root package name */
    @Y61.l
    public Integer f71460d5;

    /* renamed from: e1, reason: collision with root package name */
    @Inject
    public com.avito.android.advert.item.service_app_filling.a f71461e1;

    /* renamed from: e3, reason: collision with root package name */
    @Inject
    public InterfaceC28097c f71462e3;

    /* renamed from: e4, reason: collision with root package name */
    @Inject
    public com.avito.android.advert.item.leasing_calculator.c f71463e4;

    /* renamed from: e5, reason: collision with root package name */
    public com.avito.android.advert.item.creditinfo.buzzoola.v f71464e5;

    /* renamed from: f1, reason: collision with root package name */
    @Inject
    public com.avito.android.advert.item.mortgage_calculation.a f71465f1;

    /* renamed from: f3, reason: collision with root package name */
    @Inject
    public com.avito.android.advert.item.consultation.J f71466f3;

    /* renamed from: f4, reason: collision with root package name */
    @Inject
    public com.avito.android.advert_core.analytics.a f71467f4;

    /* renamed from: f5, reason: collision with root package name */
    @Y61.l
    public I1 f71468f5;

    /* renamed from: g1, reason: collision with root package name */
    @Inject
    public com.avito.android.advert.item.mortgage_snippet.c f71469g1;

    /* renamed from: g3, reason: collision with root package name */
    @Inject
    public com.avito.android.advert_details_items.portfolio.c f71470g3;

    /* renamed from: g4, reason: collision with root package name */
    @Inject
    public com.avito.android.advertising.loaders.n f71471g4;

    /* renamed from: g5, reason: collision with root package name */
    public Z0 f71472g5;

    /* renamed from: h1, reason: collision with root package name */
    @Inject
    public com.avito.android.advert.item.fmp.products.c f71473h1;

    /* renamed from: h3, reason: collision with root package name */
    @Inject
    public com.avito.android.advert.item.consultation.secondary.c f71474h3;

    /* renamed from: h4, reason: collision with root package name */
    @Inject
    public com.avito.android.advertising.loaders.event_service.c f71475h4;

    /* renamed from: h5, reason: collision with root package name */
    public boolean f71476h5;

    /* renamed from: i1, reason: collision with root package name */
    @Inject
    public com.avito.android.advert.item.autoteka.teaser.a f71477i1;

    /* renamed from: i3, reason: collision with root package name */
    @Inject
    public InterfaceC28111q f71478i3;

    /* renamed from: i4, reason: collision with root package name */
    @Inject
    public Ax.e f71479i4;

    /* renamed from: i5, reason: collision with root package name */
    @Y61.l
    public com.avito.android.advert.e0 f71480i5;

    /* renamed from: j1, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f71481j1;

    /* renamed from: j3, reason: collision with root package name */
    @Inject
    public com.avito.android.advert.item.consultation.dynamic_content.c f71482j3;

    /* renamed from: j4, reason: collision with root package name */
    @Inject
    public InterfaceC13095a f71483j4;

    /* renamed from: j5, reason: collision with root package name */
    @Y61.l
    public String f71484j5;

    /* renamed from: k1, reason: collision with root package name */
    @Inject
    public com.avito.android.advert.item.similars.j f71485k1;

    /* renamed from: k3, reason: collision with root package name */
    @Inject
    public com.avito.android.advert_details_items.georeference.c f71486k3;

    /* renamed from: k4, reason: collision with root package name */
    @Inject
    public com.avito.android.advert_core.information_about.c f71487k4;

    /* renamed from: k5, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsStyle f71488k5;

    /* renamed from: l1, reason: collision with root package name */
    @Inject
    public com.avito.android.advert.item.autoteka.teaser.i f71489l1;

    /* renamed from: l3, reason: collision with root package name */
    @Inject
    public com.avito.android.advert.item.short_term_rent.str_buttons.c f71490l3;

    /* renamed from: l4, reason: collision with root package name */
    @Inject
    public InterfaceC39709b f71491l4;

    /* renamed from: l5, reason: collision with root package name */
    @Y61.l
    public AdvertNavBarStyle f71492l5;

    /* renamed from: m1, reason: collision with root package name */
    @Inject
    public com.avito.android.advert.item.autoteka.teaser_v2.c f71493m1;

    /* renamed from: m3, reason: collision with root package name */
    @Inject
    public com.avito.android.advert.item.short_term_rent.item_discount.c f71494m3;

    /* renamed from: m4, reason: collision with root package name */
    @Inject
    public gj.n f71495m4;

    /* renamed from: m5, reason: collision with root package name */
    @Inject
    public com.avito.android.lib.beduin_v2.repository.cart_total_quantity.N f71496m5;

    /* renamed from: n1, reason: collision with root package name */
    @Inject
    public com.avito.android.advert.item.autoteka.teaser_v3.c f71497n1;

    /* renamed from: n3, reason: collision with root package name */
    @Inject
    public com.avito.android.advert.item.interiorPhotos.g f71498n3;

    /* renamed from: n4, reason: collision with root package name */
    @Inject
    public com.avito.android.advert.item.beduin.k f71499n4;

    /* renamed from: n5, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.beduin_v2.repository.cart_total_quantity.L f71500n5;

    /* renamed from: o1, reason: collision with root package name */
    @Inject
    public com.avito.android.advert.item.autoteka_select.teaser.c f71501o1;

    /* renamed from: o3, reason: collision with root package name */
    @Inject
    public S f71502o3;

    /* renamed from: o4, reason: collision with root package name */
    @Inject
    public InterfaceC27811a f71503o4;

    /* renamed from: o5, reason: collision with root package name */
    @Inject
    public com.avito.android.Z0 f71504o5;

    /* renamed from: p1, reason: collision with root package name */
    @Inject
    public com.avito.android.advert.item.note.c f71505p1;

    /* renamed from: p3, reason: collision with root package name */
    @Inject
    public com.avito.android.advert.item.sellersubscription.p f71506p3;

    /* renamed from: p4, reason: collision with root package name */
    @Inject
    public com.avito.android.advert_core.price_list.preview.f f71507p4;

    /* renamed from: p5, reason: collision with root package name */
    @Y61.k
    public final ZS.b f71508p5;

    /* renamed from: q1, reason: collision with root package name */
    @Inject
    public InterfaceC14698b f71509q1;

    /* renamed from: q3, reason: collision with root package name */
    @Inject
    public com.avito.android.advert.item.select.benefits.f f71510q3;

    /* renamed from: q4, reason: collision with root package name */
    @Inject
    public com.avito.android.advert.item.early_access_fakedoor.konveyor.c f71511q4;

    /* renamed from: q5, reason: collision with root package name */
    public boolean f71512q5;

    /* renamed from: r1, reason: collision with root package name */
    @Inject
    public C14700d f71513r1;

    /* renamed from: r3, reason: collision with root package name */
    @Inject
    public com.avito.android.advert_details_items.search_suggests.c f71514r3;

    /* renamed from: r4, reason: collision with root package name */
    @Inject
    public com.avito.android.advert.item.amenities.c f71515r4;

    /* renamed from: r5, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f71516r5;

    /* renamed from: s1, reason: collision with root package name */
    @Inject
    public com.avito.android.serp.adapter.h1 f71517s1;

    /* renamed from: s3, reason: collision with root package name */
    @Inject
    public com.avito.android.serp.adapter.images_and_links_item.i f71518s3;

    /* renamed from: s4, reason: collision with root package name */
    @Inject
    public com.avito.android.advert.item.reusable_amenities.g f71519s4;

    @Y61.l
    public io.reactivex.rxjava3.internal.observers.y s5;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f71520t0;

    /* renamed from: t1, reason: collision with root package name */
    @Inject
    public GridLayoutManager.c f71521t1;

    /* renamed from: t3, reason: collision with root package name */
    @Inject
    public com.avito.android.advert.item.creditinfo.buzzoola.k f71522t3;

    /* renamed from: t4, reason: collision with root package name */
    @Inject
    public com.avito.android.screenshot_observer.a f71523t4;

    /* renamed from: t5, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.y f71524t5;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public com.avito.android.account.E f71525u0;

    /* renamed from: u3, reason: collision with root package name */
    @Inject
    public com.avito.android.advert.item.rating_publish.c f71526u3;

    /* renamed from: u4, reason: collision with root package name */
    @Inject
    public com.avito.android.advert.item.similars.a f71527u4;

    /* renamed from: u5, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.y f71528u5;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public InterfaceC28130g0 f71529v0;

    /* renamed from: v3, reason: collision with root package name */
    @Inject
    public com.avito.android.advert.item.domoteka.a f71530v3;

    /* renamed from: v4, reason: collision with root package name */
    @Inject
    public com.avito.android.advert.item.commercials.f f71531v4;

    /* renamed from: v5, reason: collision with root package name */
    @Y61.l
    public Parcelable f71532v5;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public InterfaceC35845m2 f71533w0;

    /* renamed from: w3, reason: collision with root package name */
    @Inject
    public com.avito.android.advert.item.domoteka.conveyor.d f71534w3;

    /* renamed from: w4, reason: collision with root package name */
    @Inject
    public ProgressInfoToastBar.a f71535w4;

    /* renamed from: w5, reason: collision with root package name */
    @Y61.l
    public Integer f71536w5;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f71537x0;

    /* renamed from: x3, reason: collision with root package name */
    @Inject
    public com.avito.android.favorite_sellers.adapter.recommendation.h f71538x3;

    /* renamed from: x4, reason: collision with root package name */
    @Inject
    public com.avito.android.advert.item.services_review_volunteers.e f71539x4;

    /* renamed from: x5, reason: collision with root package name */
    @Y61.k
    public final NavigationState f71540x5;

    /* renamed from: y0, reason: collision with root package name */
    @Inject
    public com.avito.android.L f71541y0;

    /* renamed from: y3, reason: collision with root package name */
    @Inject
    public com.avito.android.advert.item.recall_me.n f71542y3;

    /* renamed from: y4, reason: collision with root package name */
    @Inject
    public InterfaceC44295a f71543y4;

    /* renamed from: y5, reason: collision with root package name */
    @Y61.k
    public final Handler f71544y5;

    /* renamed from: z0, reason: collision with root package name */
    @Inject
    public InterfaceC27793e f71545z0;

    /* renamed from: z3, reason: collision with root package name */
    @Inject
    public com.avito.android.advert.item.icebreakers.d f71546z3;

    /* renamed from: z4, reason: collision with root package name */
    @Inject
    public com.avito.android.early_access_advert.d f71547z4;

    /* renamed from: z5, reason: collision with root package name */
    @Y61.l
    public TreeClickStreamParent f71548z5;

    /* compiled from: FragmentViewModelLazy.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class A extends kotlin.jvm.internal.N implements Y41.a<androidx.view.T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ z f71549l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public A(z zVar) {
            super(0);
            this.f71549l = zVar;
        }

        @Override // Y41.a
        public final androidx.view.T0 invoke() {
            return (androidx.view.T0) this.f71549l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class B extends kotlin.jvm.internal.N implements Y41.a<androidx.view.S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f71550l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public B(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f71550l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final androidx.view.S0 invoke() {
            return ((androidx.view.T0) this.f71550l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class C extends kotlin.jvm.internal.N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f71551l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f71551l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            androidx.view.T0 t02 = (androidx.view.T0) this.f71551l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class D extends kotlin.jvm.internal.N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f71552l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public D(Y41.a aVar) {
            super(0);
            this.f71552l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f71552l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class E extends kotlin.jvm.internal.N implements Y41.a<Fragment> {
        public E() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return AdvertDetailsFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class F extends kotlin.jvm.internal.N implements Y41.a<androidx.view.T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ E f71554l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F(E e12) {
            super(0);
            this.f71554l = e12;
        }

        @Override // Y41.a
        public final androidx.view.T0 invoke() {
            return (androidx.view.T0) this.f71554l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class G extends kotlin.jvm.internal.N implements Y41.a<androidx.view.S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f71555l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public G(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f71555l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final androidx.view.S0 invoke() {
            return ((androidx.view.T0) this.f71555l.getValue()).getF42820b();
        }
    }

    /* compiled from: AdvertDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/advert/item/a2;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/advert/item/a2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class H extends kotlin.jvm.internal.N implements Y41.a<C27814a2> {
        public H() {
            super(0);
        }

        @Override // Y41.a
        public final C27814a2 invoke() {
            c2 c2Var = AdvertDetailsFragment.this.f71419T4;
            if (c2Var == null) {
                c2Var = null;
            }
            return (C27814a2) c2Var.get();
        }
    }

    /* compiled from: AdvertDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/advert/item/AdvertDetailsFragment$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert.item.AdvertDetailsFragment$a, reason: case insensitive filesystem */
    public static final class C27803a {

        /* compiled from: AdvertDetailsFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.advert.item.AdvertDetailsFragment$a$a, reason: collision with other inner class name */
        public static final class C2173a extends kotlin.jvm.internal.N implements Y41.l<Bundle, kotlin.G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ AdvertDetailsArguments f71557l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2173a(AdvertDetailsArguments advertDetailsArguments) {
                super(1);
                this.f71557l = advertDetailsArguments;
            }

            @Override // Y41.l
            public final kotlin.G0 invoke(Bundle bundle) {
                bundle.putParcelable("advert_details_arguments", this.f71557l);
                return kotlin.G0.f406611a;
            }
        }

        public /* synthetic */ C27803a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static AdvertDetailsFragment a(@Y61.k AdvertDetailsArguments advertDetailsArguments) {
            AdvertDetailsFragment advertDetailsFragment = new AdvertDetailsFragment();
            C35966w1.a(advertDetailsFragment, -1, new C2173a(advertDetailsArguments));
            return advertDetailsFragment;
        }

        public C27803a() {
        }
    }

    /* compiled from: AdvertDetailsFragment.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/content/Intent;", "intent", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert.item.AdvertDetailsFragment$b, reason: case insensitive filesystem */
    public static final class C27804b extends kotlin.jvm.internal.N implements Y41.l<Intent, Intent> {
        public C27804b() {
            super(1);
        }

        @Override // Y41.l
        public final Intent invoke(Intent intent) {
            Intent intent2 = intent;
            com.avito.android.advert_core.analytics.a aVar = AdvertDetailsFragment.this.f71467f4;
            if (aVar == null) {
                aVar = null;
            }
            C35967w2.b(intent2, aVar.Q5(false));
            return intent2;
        }
    }

    /* compiled from: AdvertDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/advert/item/AdvertDetailsFragment$c", "Lcom/avito/android/deeplink_handler/view/a$a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert.item.AdvertDetailsFragment$c, reason: case insensitive filesystem */
    public static final class C27805c implements a.InterfaceC4053a {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d.a f71559b;

        public C27805c() {
            C27803a c27803a = AdvertDetailsFragment.f71351B5;
            AdvertDetailsFragment.this.getClass();
            this.f71559b = new d.a(AdvertDetailsFragment.this);
        }

        @Override // com.avito.android.deeplink_handler.view.a.InterfaceC4053a
        public final void J(@Y61.k Intent intent, int i12, @Y61.k Y41.l<? super Exception, kotlin.G0> lVar) {
            TabFragmentFactory.Data dataA = C19902a.a(intent);
            AdvertDetailsFragment advertDetailsFragment = AdvertDetailsFragment.this;
            if (dataA == null) {
                C35966w1.e(advertDetailsFragment, intent, i12, lVar);
            } else {
                advertDetailsFragment.C5(i12, intent);
            }
        }

        @Override // com.avito.android.deeplink_handler.view.a.InterfaceC4053a
        public final void R(@Y61.k Intent intent, @Y61.k Y41.l<? super Exception, kotlin.G0> lVar) {
            this.f71559b.R(intent, lVar);
        }

        @Override // com.avito.android.deeplink_handler.view.a.InterfaceC4053a
        public final void X(int i12, @Y61.k Intent intent) {
            this.f71559b.X(i12, intent);
        }

        @Override // com.avito.android.deeplink_handler.view.a.InterfaceC4053a
        public final void g1(@Y61.k Y41.l<? super Context, kotlin.G0> lVar) {
            this.f71559b.g1(lVar);
        }

        @Override // com.avito.android.deeplink_handler.view.a.InterfaceC4053a
        public final void s1() {
            this.f71559b.s1();
        }
    }

    /* compiled from: AdvertDetailsFragment.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/advert/item/beduin/v2/di/a;", "invoke", "()Lcom/avito/android/advert/item/beduin/v2/di/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.item.AdvertDetailsFragment$d, reason: case insensitive filesystem */
    public static final class C27806d extends kotlin.jvm.internal.N implements Y41.a<com.avito.android.advert.item.beduin.v2.di.a> {
        public C27806d() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.advert.item.beduin.v2.di.a invoke() {
            AdvertDetailsFragment advertDetailsFragment = AdvertDetailsFragment.this;
            return ((a.b) C29972i.a(C29972i.b(advertDetailsFragment), a.b.class)).Bg().a(new C28212u(advertDetailsFragment), new C28215v(advertDetailsFragment), new C28218w(advertDetailsFragment), new C28221x(advertDetailsFragment), new C28224y(advertDetailsFragment), new C28227z(advertDetailsFragment), new com.avito.android.advert.item.A(advertDetailsFragment));
        }
    }

    /* compiled from: AdvertDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/S0;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/mortgage_calculator/internal/S0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.item.AdvertDetailsFragment$e, reason: case insensitive filesystem */
    public static final class C27807e extends kotlin.jvm.internal.N implements Y41.a<com.avito.android.mortgage_calculator.internal.S0> {
        public C27807e() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.mortgage_calculator.internal.S0 invoke() {
            com.avito.android.mortgage_calculator.internal.T0 t02 = AdvertDetailsFragment.this.f71411R4;
            if (t02 == null) {
                t02 = null;
            }
            return (com.avito.android.mortgage_calculator.internal.S0) t02.get();
        }
    }

    /* compiled from: AdvertDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/activity/x;", "Lkotlin/G0;", "invoke", "(Landroidx/activity/x;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.item.AdvertDetailsFragment$f, reason: case insensitive filesystem */
    public static final class C27808f extends kotlin.jvm.internal.N implements Y41.l<androidx.view.x, kotlin.G0> {
        public C27808f() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(androidx.view.x xVar) {
            C27803a c27803a = AdvertDetailsFragment.f71351B5;
            AdvertDetailsFragment.this.E5().accept(InterfaceC40047a.C11082a.f395204a);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: AdvertDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.item.AdvertDetailsFragment$g, reason: case insensitive filesystem */
    public static final class C27809g extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {
        public C27809g() {
            super(0);
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            InterfaceC28130g0 interfaceC28130g0 = AdvertDetailsFragment.this.f71529v0;
            if (interfaceC28130g0 == null) {
                interfaceC28130g0 = null;
            }
            interfaceC28130g0.Pc();
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: AdvertDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "<anonymous parameter 0>", "Landroid/os/Bundle;", "bundle", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.item.AdvertDetailsFragment$h, reason: case insensitive filesystem */
    public static final class C27810h extends kotlin.jvm.internal.N implements Y41.p<String, Bundle, kotlin.G0> {
        public C27810h() {
            super(2);
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(String str, Bundle bundle) {
            DeepLink deepLink = (DeepLink) bundle.getParcelable("offers_dialog_link");
            if (deepLink != null) {
                Z0 z02 = AdvertDetailsFragment.this.f71472g5;
                if (z02 == null) {
                    z02 = null;
                }
                z02.g(null, deepLink, null);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: AdvertDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            InterfaceC28173a interfaceC28173a = AdvertDetailsFragment.this.f71432X0;
            if (interfaceC28173a == null) {
                interfaceC28173a = null;
            }
            interfaceC28173a.q();
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: AdvertDetailsFragment.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "resultEvent", "Lkotlin/G0;", "accept", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j<T> implements l41.g {
        public j() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC14249c interfaceC14249c = ((C43501a) obj).f413261b;
            boolean z12 = interfaceC14249c instanceof CvPackagesLink.b.C5141b;
            AdvertDetailsFragment advertDetailsFragment = AdvertDetailsFragment.this;
            if (z12) {
                advertDetailsFragment.f71512q5 = true;
                if (((CvPackagesLink.b.C5141b) interfaceC14249c).f174424b) {
                    com.avito.android.deeplink_handler.handler.composite.a aVar = advertDetailsFragment.f71537x0;
                    if (aVar == null) {
                        aVar = null;
                    }
                    b.a.a(aVar, new ToastMessageLink(advertDetailsFragment.getResources().getString(R.string.advert_details_toast_single_cv_success_msg), ToastMessageLink.ToastType.f133735d, null, null, null, false, null, 124, null), null, null, 6);
                }
                InterfaceC28130g0 interfaceC28130g0 = advertDetailsFragment.f71529v0;
                (interfaceC28130g0 != null ? interfaceC28130g0 : null).Pc();
                return;
            }
            if (interfaceC14249c instanceof CreateChannelLink.b.a ? true : interfaceC14249c instanceof CreateChannelLink.b.e) {
                InterfaceC28130g0 interfaceC28130g02 = advertDetailsFragment.f71529v0;
                (interfaceC28130g02 != null ? interfaceC28130g02 : null).Pc();
                return;
            }
            if (interfaceC14249c instanceof ComparisonDeepLink.b.a) {
                InterfaceC28130g0 interfaceC28130g03 = advertDetailsFragment.f71529v0;
                (interfaceC28130g03 != null ? interfaceC28130g03 : null).W3(((ComparisonDeepLink.b.a) interfaceC14249c).f123774b);
                return;
            }
            if (interfaceC14249c instanceof C50005c) {
                if (((C50005c) interfaceC14249c).f442693b == DeliveryFlowPaymentStatus.f134746b) {
                    InterfaceC28130g0 interfaceC28130g04 = advertDetailsFragment.f71529v0;
                    (interfaceC28130g04 != null ? interfaceC28130g04 : null).p0();
                    return;
                } else {
                    InterfaceC28173a interfaceC28173a = advertDetailsFragment.f71432X0;
                    (interfaceC28173a != null ? interfaceC28173a : null).m();
                    return;
                }
            }
            if (interfaceC14249c instanceof xv.g) {
                if (((xv.g) interfaceC14249c).f442694b == DeliveryFlowPaymentStatus.f134746b) {
                    InterfaceC28130g0 interfaceC28130g05 = advertDetailsFragment.f71529v0;
                    (interfaceC28130g05 != null ? interfaceC28130g05 : null).p0();
                    return;
                } else {
                    InterfaceC28173a interfaceC28173a2 = advertDetailsFragment.f71432X0;
                    (interfaceC28173a2 != null ? interfaceC28173a2 : null).m();
                    return;
                }
            }
            if (interfaceC14249c instanceof UserAddressLink.Result) {
                InterfaceC28130g0 interfaceC28130g06 = advertDetailsFragment.f71529v0;
                if (interfaceC28130g06 == null) {
                    interfaceC28130g06 = null;
                }
                interfaceC28130g06.p0();
                com.avito.android.advert.item.address_centrity.i iVar = advertDetailsFragment.f71441Z0;
                (iVar != null ? iVar : null).b((UserAddressLink.Result) interfaceC14249c);
                return;
            }
            if (interfaceC14249c instanceof JsxCvActualizationDeeplink.b) {
                InterfaceC28130g0 interfaceC28130g07 = advertDetailsFragment.f71529v0;
                if (interfaceC28130g07 == null) {
                    interfaceC28130g07 = null;
                }
                interfaceC28130g07.B8(((JsxCvActualizationDeeplink.b) interfaceC14249c) instanceof JsxCvActualizationDeeplink.b.C3900b ? ((JsxCvActualizationDeeplink.b.C3900b) interfaceC14249c).f131090b : null, interfaceC14249c instanceof JsxCvActualizationDeeplink.b.a);
                return;
            }
            if (interfaceC14249c instanceof RatingFormLink.b.c.a) {
                View view = advertDetailsFragment.getView();
                if (view != null) {
                    view.addOnLayoutChangeListener(new com.avito.android.advert.item.G(view, advertDetailsFragment, interfaceC14249c));
                    return;
                }
                return;
            }
            if (interfaceC14249c instanceof RatingFormLink.b.C7457b) {
                View view2 = advertDetailsFragment.getView();
                if (view2 != null) {
                    view2.addOnLayoutChangeListener(new com.avito.android.advert.item.H(view2, advertDetailsFragment, interfaceC14249c));
                    return;
                }
                return;
            }
            if (interfaceC14249c instanceof ServiceBookingCreateLink.b) {
                View view3 = advertDetailsFragment.getView();
                if (view3 != null) {
                    view3.addOnLayoutChangeListener(new I(view3, advertDetailsFragment, interfaceC14249c));
                    return;
                }
                return;
            }
            if (interfaceC14249c instanceof m.c) {
                Bundle bundle = ((m.c) interfaceC14249c).f105170b;
                if (Boolean.parseBoolean(bundle != null ? bundle.getString("shouldRefresh") : null)) {
                    InterfaceC28130g0 interfaceC28130g08 = advertDetailsFragment.f71529v0;
                    (interfaceC28130g08 != null ? interfaceC28130g08 : null).p0();
                    return;
                }
                return;
            }
            if (interfaceC14249c instanceof EsiaRedirectDeeplink.b.a) {
                InterfaceC28130g0 interfaceC28130g09 = advertDetailsFragment.f71529v0;
                (interfaceC28130g09 != null ? interfaceC28130g09 : null).p0();
            } else if (interfaceC14249c instanceof ConfirmDocumentsBottomSheetDeeplink.b.a) {
                InterfaceC28130g0 interfaceC28130g010 = advertDetailsFragment.f71529v0;
                (interfaceC28130g010 != null ? interfaceC28130g010 : null).p0();
            }
        }
    }

    /* compiled from: AdvertDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "it", "", "test", "(Lkv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k<T> implements l41.r {

        /* renamed from: b, reason: collision with root package name */
        public static final k<T> f71568b = new k<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C43501a) obj).f413261b instanceof InterfaceC14249c.a;
        }
    }

    /* compiled from: AdvertDetailsFragment.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "it", "Lkotlin/G0;", "accept", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l<T> implements l41.g {
        public l() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            AdvertDetailsFragment advertDetailsFragment;
            View view;
            InterfaceC14249c interfaceC14249c = ((C43501a) obj).f413261b;
            if (!(interfaceC14249c instanceof RatingFormLink.b.c.C7458b) || (view = (advertDetailsFragment = AdvertDetailsFragment.this).getView()) == null) {
                return;
            }
            view.addOnLayoutChangeListener(new K(view, advertDetailsFragment, interfaceC14249c));
        }
    }

    /* compiled from: AdvertDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m<T> implements l41.g {
        public m() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            ((Number) obj).intValue();
            com.avito.android.favorite_sellers.adapter.recommendation.h hVar = AdvertDetailsFragment.this.f71538x3;
            if (hVar == null) {
                hVar = null;
            }
            hVar.f3();
        }
    }

    /* compiled from: AdvertDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\r\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "LFV0/h;", "LX41/o;", "invoke", "()Ljava/util/Set;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends kotlin.jvm.internal.N implements Y41.a<Set<FV0.h>> {
        public n() {
            super(0);
        }

        @Override // Y41.a
        public final Set<FV0.h> invoke() {
            C27803a c27803a = AdvertDetailsFragment.f71351B5;
            return AdvertDetailsFragment.this.E5().f72495E;
        }
    }

    /* compiled from: AdvertDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class o extends kotlin.jvm.internal.N implements Y41.l<DeepLink, kotlin.G0> {
        public o() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(DeepLink deepLink) {
            DeepLink deepLink2 = deepLink;
            InterfaceC28130g0 interfaceC28130g0 = AdvertDetailsFragment.this.f71529v0;
            if (interfaceC28130g0 == null) {
                interfaceC28130g0 = null;
            }
            interfaceC28130g0.t4(deepLink2);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: AdvertDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class p extends kotlin.jvm.internal.N implements Y41.l<DeepLink, kotlin.G0> {
        public p() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(DeepLink deepLink) {
            DeepLink deepLink2 = deepLink;
            InterfaceC28130g0 interfaceC28130g0 = AdvertDetailsFragment.this.f71529v0;
            if (interfaceC28130g0 == null) {
                interfaceC28130g0 = null;
            }
            interfaceC28130g0.gb(deepLink2);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: AdvertDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/di/H;", "invoke", "()Lcom/avito/android/lib/beduin_v2/feature/di/H;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class q extends kotlin.jvm.internal.N implements Y41.a<com.avito.android.lib.beduin_v2.feature.di.H> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ ScreenPerformanceTracker f71575m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ cv.d f71576n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(ScreenPerformanceTracker screenPerformanceTracker, cv.d dVar) {
            super(0);
            this.f71575m = screenPerformanceTracker;
            this.f71576n = dVar;
        }

        @Override // Y41.a
        public final com.avito.android.lib.beduin_v2.feature.di.H invoke() {
            ZS.b bVar = new ZS.b(AdvertScreen.f90278d, Owners.f210488g, (String) null, 4, (C42822w) null);
            C27803a c27803a = AdvertDetailsFragment.f71351B5;
            AdvertDetailsFragment advertDetailsFragment = AdvertDetailsFragment.this;
            com.avito.beduin.v2.engine.component.x xVar = advertDetailsFragment.E5().f72497K.f398526b;
            C27106d c27106d = advertDetailsFragment.E5().f72497K.f398527c;
            return advertDetailsFragment.D5(this.f71575m, bVar, this.f71576n, xVar, c27106d);
        }
    }

    /* compiled from: AdvertDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class r extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {
        public r() {
            super(0);
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            AdvertDetailsFragment advertDetailsFragment = AdvertDetailsFragment.this;
            com.avito.android.advert_core.analytics.a aVar = advertDetailsFragment.f71467f4;
            if (aVar == null) {
                aVar = null;
            }
            String str = advertDetailsFragment.f71456c5;
            aVar.d1(str != null ? str : null);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: AdvertDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/adapter/gallery/GalleryItem;", "item", "", "position", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/adapter/gallery/GalleryItem;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class s extends kotlin.jvm.internal.N implements Y41.p<GalleryItem, Integer, kotlin.G0> {
        public s() {
            super(2);
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(GalleryItem galleryItem, Integer num) {
            GalleryItem galleryItem2 = galleryItem;
            int iIntValue = num.intValue();
            AdvertDetailsFragment advertDetailsFragment = AdvertDetailsFragment.this;
            com.avito.android.advert_core.analytics.a aVar = advertDetailsFragment.f71467f4;
            if (aVar == null) {
                aVar = null;
            }
            String str = advertDetailsFragment.f71456c5;
            if (str == null) {
                str = null;
            }
            aVar.U1(str);
            com.avito.android.review_gallery.i iVar = advertDetailsFragment.f71391M0;
            if (iVar == null) {
                iVar = null;
            }
            String str2 = advertDetailsFragment.f71456c5;
            String str3 = str2 != null ? str2 : null;
            GalleryFromBlock[] galleryFromBlockArr = GalleryFromBlock.f68396b;
            advertDetailsFragment.startActivity(iVar.a(galleryItem2, iIntValue, str3, "advertisement"));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: AdvertDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class t extends kotlin.jvm.internal.N implements Y41.l<Object, kotlin.G0> {
        public t() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Object obj) {
            C27803a c27803a = AdvertDetailsFragment.f71351B5;
            AdvertDetailsFragment.this.E5().accept(obj);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: AdvertDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LDh0/a;", "it", "Lkotlin/G0;", "invoke", "(LDh0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class u extends kotlin.jvm.internal.N implements Y41.l<InterfaceC13400a, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final u f71580l = new u();

        public u() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ kotlin.G0 invoke(InterfaceC13400a interfaceC13400a) {
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: AdvertDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "link", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class v extends kotlin.jvm.internal.N implements Y41.l<DeepLink, kotlin.G0> {
        public v() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(DeepLink deepLink) {
            DeepLink deepLink2 = deepLink;
            com.avito.android.deeplink_handler.handler.composite.a aVar = AdvertDetailsFragment.this.f71537x0;
            if (aVar == null) {
                aVar = null;
            }
            b.a.a(aVar, deepLink2, null, null, 6);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: AdvertDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class w extends kotlin.jvm.internal.N implements Y41.a<String> {

        /* renamed from: l, reason: collision with root package name */
        public static final w f71582l = new w();

        public w() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "Failed to dismiss detached Modal";
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class x extends kotlin.jvm.internal.N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f71583l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f71583l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            androidx.view.T0 t02 = (androidx.view.T0) this.f71583l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class y extends kotlin.jvm.internal.N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f71584l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(Y41.a aVar) {
            super(0);
            this.f71584l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f71584l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class z extends kotlin.jvm.internal.N implements Y41.a<Fragment> {
        public z() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return AdvertDetailsFragment.this;
        }
    }

    public AdvertDetailsFragment() {
        super(0, 1, null);
        y yVar = new y(new C27807e());
        z zVar = new z();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        InterfaceC42726C interfaceC42726CB = C42727D.b(lazyThreadSafetyMode, new A(zVar));
        kotlin.jvm.internal.n0 n0Var = kotlin.jvm.internal.m0.f406844a;
        this.f71415S4 = new androidx.view.O0(n0Var.b(com.avito.android.mortgage_calculator.internal.S0.class), new B(interfaceC42726CB), yVar, new C(interfaceC42726CB));
        D d12 = new D(new H());
        InterfaceC42726C interfaceC42726CB2 = C42727D.b(lazyThreadSafetyMode, new F(new E()));
        this.f71423U4 = new androidx.view.O0(n0Var.b(C27814a2.class), new G(interfaceC42726CB2), d12, new x(interfaceC42726CB2));
        this.f71448a5 = C42727D.c(new C27806d());
        this.f71452b5 = C42727D.c(new n());
        this.f71508p5 = new ZS.b(AdvertScreen.f90278d, Owners.f210394C, (String) null, 4, (C42822w) null);
        this.f71516r5 = new io.reactivex.rxjava3.disposables.c();
        this.f71540x5 = new NavigationState(false, new NavigationState.NavbarBusiness360.Show(false, false, 3, null));
        this.f71544y5 = new Handler();
    }

    @Override // FV0.a
    @Y61.k
    public final FV0.f A1() {
        return FV0.g.f4722a;
    }

    @Override // gj.i
    @Y61.l
    public final RecyclerView B0(@Y61.k String str) {
        return null;
    }

    public final com.avito.android.lib.beduin_v2.feature.di.H D5(ScreenPerformanceTracker screenPerformanceTracker, ZS.b bVar, cv.d dVar, com.avito.beduin.v2.engine.component.x xVar, C27106d c27106d) {
        return ((H.b) C29972i.a(C29972i.b(this), H.b.class)).ed().a(screenPerformanceTracker, bVar, dVar, new com.avito.android.lib.beduin_v2.feature.di.D0((com.avito.android.advert.item.beduin.v2.di.a) this.f71448a5.getValue()), com.avito.android.lib.beduin_v2.feature.di.K.f176031b, (144 & 32) != 0 ? new C27106d() : c27106d, (144 & 64) != 0 ? new com.avito.beduin.v2.engine.component.x() : xVar, new ZS.c(false));
    }

    @Override // com.avito.android.select.p
    @Y61.l
    public final InterfaceC19588c<? super InterfaceC19587b> E4(@Y61.k Arguments arguments) {
        return null;
    }

    public final C27814a2 E5() {
        return (C27814a2) this.f71423U4.getValue();
    }

    public final void F5(int i12, int i13, Intent intent) {
        String stringExtra;
        Bundle extras;
        if (i12 == 4) {
            if (intent == null || (extras = intent.getExtras()) == null) {
                return;
            }
            Object obj = extras.get("image_position");
            int iIntValue = obj instanceof Integer ? ((Number) obj).intValue() : 0;
            Object obj2 = extras.get("photoGalleryStateId");
            long jLongValue = obj2 instanceof Long ? ((Number) obj2).longValue() : -1L;
            if (jLongValue > -1) {
                S s5 = this.f71502o3;
                (s5 != null ? s5 : null).O(iIntValue, jLongValue);
                E5().accept(new InterfaceC42497a.g(iIntValue, jLongValue));
                return;
            }
            return;
        }
        if (i12 == 1) {
            if (i13 == -1) {
                G5(intent != null ? intent.getParcelableExtra("SuccessAuthResultData") : null);
                return;
            }
            return;
        }
        if (i12 == 7) {
            if (i13 == -1) {
                InterfaceC28130g0 interfaceC28130g0 = this.f71529v0;
                (interfaceC28130g0 != null ? interfaceC28130g0 : null).j7();
                return;
            }
            return;
        }
        if (i12 == 8) {
            if (i13 == -1) {
                String stringExtra2 = intent != null ? intent.getStringExtra("advert_result_note") : null;
                com.avito.android.advert.item.note.c cVar = this.f71505p1;
                (cVar != null ? cVar : null).s6(stringExtra2);
                return;
            }
            return;
        }
        if (i12 == 10) {
            View view = getView();
            if (view != null) {
                K2.f(view, 3);
                return;
            }
            return;
        }
        if (i12 == 13) {
            if (i13 == -1) {
                com.avito.android.advert.item.domoteka.conveyor.d dVar = this.f71534w3;
                (dVar != null ? dVar : null).l6();
                return;
            }
            return;
        }
        if (i12 == 17) {
            if (i13 == -1) {
                Parcelable parcelableExtra = intent == null ? null : intent.getParcelableExtra("SuccessAuthResultData");
                if (parcelableExtra instanceof DeepLink) {
                    InterfaceC28173a interfaceC28173a = this.f71432X0;
                    (interfaceC28173a != null ? interfaceC28173a : null).j((DeepLink) parcelableExtra);
                    return;
                }
                return;
            }
            return;
        }
        if (i12 == 20) {
            DealConfirmationSheetActivity.f132774r.getClass();
            String stringExtra3 = intent != null ? intent.getStringExtra("result_key.message") : null;
            if (stringExtra3 != null) {
                com.avito.android.deal_confirmation.d dVar2 = this.f71420U0;
                (dVar2 != null ? dVar2 : null).d(stringExtra3);
                return;
            }
            return;
        }
        if (i12 == 21) {
            if (i13 != -1 || intent == null || (stringExtra = intent.getStringExtra("extra_message")) == null) {
                return;
            }
            com.avito.android.component.toast.util.c cVar2 = this.f71451b4;
            c.a.a(cVar2 != null ? cVar2 : null, com.avito.android.printable_text.b.f(stringExtra), 0, null, null, null, null, 254);
            return;
        }
        if (i12 == -2051976460) {
            InterfaceC28130g0 interfaceC28130g02 = this.f71529v0;
            (interfaceC28130g02 != null ? interfaceC28130g02 : null).p0();
            return;
        }
        if (i12 != 22) {
            if (i12 == 23 && i13 == -1) {
                ArrayList parcelableArrayListExtra = intent != null ? intent.getParcelableArrayListExtra("extra_result_icebreakers") : null;
                if (parcelableArrayListExtra != null) {
                    com.avito.android.advert.item.icebreakers_redesign.d dVar3 = this.f71353A3;
                    (dVar3 != null ? dVar3 : null).E3(parcelableArrayListExtra);
                    return;
                }
                return;
            }
            return;
        }
        if (i13 != -1 || intent == null) {
            return;
        }
        Integer numB = C35974x2.b(intent, "gallery_position_key");
        Long lC2 = C35974x2.c(intent, "state_id_key");
        if (numB == null || lC2 == null) {
            return;
        }
        S s12 = this.f71502o3;
        (s12 != null ? s12 : null).O(numB.intValue(), lC2.longValue());
        E5().accept(new InterfaceC42497a.g(numB.intValue(), lC2.longValue()));
    }

    public final void G5(@Y61.l Parcelable parcelable) {
        com.avito.android.advert.item.sellersubscription.p pVar = this.f71506p3;
        if (pVar == null) {
            pVar = null;
        }
        pVar.c();
        InterfaceC28265d interfaceC28265d = this.f71416T0;
        if (interfaceC28265d == null) {
            interfaceC28265d = null;
        }
        interfaceC28265d.k0(parcelable);
        InterfaceC28243x interfaceC28243x = this.f71424V0;
        if (interfaceC28243x == null) {
            interfaceC28243x = null;
        }
        interfaceC28243x.k0(parcelable);
        InterfaceC28130g0 interfaceC28130g0 = this.f71529v0;
        (interfaceC28130g0 != null ? interfaceC28130g0 : null).Pc();
    }

    @Override // com.avito.android.ui.status_bar.a
    public final boolean S3() {
        return false;
    }

    @Override // com.avito.beduin.v2.interaction.detached.flow.b
    @Y61.k
    public final HV0.b Y2(@Y61.l String str, @Y61.l String str2, @Y61.l C36216a[] c36216aArr, @Y61.l ModalButtonsOrientation modalButtonsOrientation, boolean z12, @Y61.l Y41.a<kotlin.G0> aVar, @Y61.l com.avito.beduin.v2.interaction.detached.flow.modal.a aVar2, boolean z13, @Y61.k Y41.a<kotlin.G0> aVar3) {
        cU.s sVarIv;
        com.avito.beduin.v2.theme.k kVarA;
        I1 i12 = this.f71468f5;
        if (i12 == null || (sVarIv = i12.Iv()) == null || (kVarA = sVarIv.a()) == null) {
            return new C28156p(0);
        }
        com.avito.android.beduin.v2.page.modal.a aVar4 = com.avito.android.beduin.v2.page.modal.a.f105171a;
        Context contextRequireContext = requireContext();
        aVar4.getClass();
        com.avito.android.lib.design.modal.a aVarA = com.avito.android.beduin.v2.page.modal.a.a(contextRequireContext, kVarA, str, str2, c36216aArr, modalButtonsOrientation, z12, aVar, aVar2, z13, aVar3);
        com.avito.android.lib.util.g.a(aVarA);
        return new C28209t(aVarA, 0);
    }

    @Override // gj.i
    @Y61.l
    public final View b3(@Y61.k String str) {
        return null;
    }

    @Override // gj.i
    @Y61.k
    public final gj.o c1() {
        return new gj.o(new o.a(requireView(), ToastBarPosition.f181047e), new o.a(requireView(), ToastBarPosition.f181046d));
    }

    @Override // FV0.d
    public final void close() {
        Z0 z02 = this.f71472g5;
        if (z02 == null) {
            z02 = null;
        }
        z02.t();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final a.InterfaceC4053a d5() {
        return new com.avito.android.ui.c(new C27805c(), new C27804b());
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final a.g e5() {
        final com.avito.android.deeplink_handler.view.impl.i iVar = (com.avito.android.deeplink_handler.view.impl.i) super.e5();
        return new a.g() { // from class: com.avito.android.advert.item.q
            @Override // com.avito.android.deeplink_handler.view.a.g
            public final void g(com.avito.android.deeplink_handler.handler.bundle.a aVar, boolean z12) {
                CombinedButtonType combinedButtonType;
                SafeDealPaymentBlockResponse safeDealPaymentBlockResponse;
                Bundle bundle;
                Bundle bundle2;
                Bundle bundle3;
                Bundle bundle4;
                AdvertDetailsFragment.C27803a c27803a = AdvertDetailsFragment.f71351B5;
                String string = (aVar == null || (bundle4 = aVar.f134522c) == null) ? null : bundle4.getString("componentId");
                if (aVar == null || (bundle3 = aVar.f134522c) == null) {
                    combinedButtonType = null;
                } else {
                    combinedButtonType = (CombinedButtonType) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle3.getParcelable("combinedButtonType", CombinedButtonType.class) : bundle3.getParcelable("combinedButtonType"));
                }
                if (aVar == null || (bundle2 = aVar.f134522c) == null) {
                    safeDealPaymentBlockResponse = null;
                } else {
                    safeDealPaymentBlockResponse = (SafeDealPaymentBlockResponse) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle2.getParcelable("payment_block_create_order_from_slider", SafeDealPaymentBlockResponse.class) : bundle2.getParcelable("payment_block_create_order_from_slider"));
                }
                String string2 = (aVar == null || (bundle = aVar.f134522c) == null) ? null : bundle.getString("ppRecallLoadingWidgetTag");
                AdvertDetailsFragment advertDetailsFragment = this.f78289b;
                if (combinedButtonType != null) {
                    InterfaceC28130g0 interfaceC28130g0 = advertDetailsFragment.f71529v0;
                    (interfaceC28130g0 != null ? interfaceC28130g0 : null).a5(combinedButtonType, z12);
                    return;
                }
                if (string != null) {
                    InterfaceC28130g0 interfaceC28130g02 = advertDetailsFragment.f71529v0;
                    (interfaceC28130g02 != null ? interfaceC28130g02 : null).y3(string, z12);
                } else {
                    if (safeDealPaymentBlockResponse != null) {
                        InterfaceC28130g0 interfaceC28130g03 = advertDetailsFragment.f71529v0;
                        (interfaceC28130g03 != null ? interfaceC28130g03 : null).d8(safeDealPaymentBlockResponse, z12);
                        return;
                    }
                    if (!((aVar != null ? aVar.f134520a : null) instanceof PpRecallDeeplink) || string2 == null) {
                        iVar.a(z12);
                    } else {
                        S s5 = advertDetailsFragment.f71502o3;
                        (s5 != null ? s5 : null).g(aVar, z12);
                    }
                }
            }
        };
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final a.i f5() {
        return new C28134h1(requireActivity(), (ViewGroup) requireView().findViewById(R.id.advert_details_container), (ViewGroup) requireView().findViewById(R.id.contact_bar_container));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    /* renamed from: h5 */
    public final boolean getF304598h0() {
        return false;
    }

    @Override // com.avito.android.ui.fragments.c
    public final boolean i0() {
        String str;
        Intent intent;
        Bundle arguments = getArguments();
        AdvertDetailsArguments advertDetailsArguments = arguments != null ? (AdvertDetailsArguments) arguments.getParcelable("advert_details_arguments") : null;
        if (advertDetailsArguments != null && (str = advertDetailsArguments.f71322l) != null) {
            Intent intent2 = new Intent();
            intent2.putExtra("selected_page_from_stories", str);
            Z0 z02 = this.f71472g5;
            if (z02 == null) {
                z02 = null;
            }
            ActivityC22955m activityC22955m = z02.f72292A;
            if (activityC22955m != null) {
                if (activityC22955m instanceof AdvertDetailsActivity) {
                    AdvertDetailsActivity advertDetailsActivity = (AdvertDetailsActivity) activityC22955m;
                    if (!advertDetailsActivity.isTaskRoot() || (intent = advertDetailsActivity.f304538c) == null) {
                        advertDetailsActivity.setResult(-1, intent2);
                    } else {
                        advertDetailsActivity.startActivity(intent);
                    }
                } else {
                    z02.f72298c.B5(-1, intent2);
                }
            }
        }
        InterfaceC28243x interfaceC28243x = this.f71424V0;
        (interfaceC28243x != null ? interfaceC28243x : null).o0(false);
        return false;
    }

    @Override // gj.i
    @Y61.k
    public final String m0() {
        return "main";
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onActivityResult(int i12, int i13, @Y61.l Intent intent) {
        C29640d c29640d = this.f71428W0;
        if (c29640d == null) {
            c29640d = null;
        }
        c29640d.getClass();
        kotlin.reflect.n<Object> nVar = C29640d.f132175X[9];
        if (!((Boolean) c29640d.f132208k.a().invoke()).booleanValue()) {
            super.onActivityResult(i12, i13, intent);
            F5(i12, i13, intent);
            return;
        }
        try {
            super.onActivityResult(i12, i13, intent);
            F5(i12, i13, intent);
        } catch (BadParcelableException e12) {
            V2 v22 = V2.f318762a;
            StringBuilder sb2 = new StringBuilder(androidx.appcompat.app.r.p("requset code is ", i12, ';'));
            sb2.append(" resultCode is " + i13 + ';');
            StringBuilder sb3 = new StringBuilder(" exception message is ");
            sb3.append(e12.getMessage());
            sb2.append(sb3.toString());
            sb2.append(" exception cause is " + e12.getCause());
            sb2.append(" intent is " + intent + ';');
            v22.d("BX-15175", sb2.toString());
        }
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment, com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        A7.b bVar = this.f71434X2;
        if (bVar == null) {
            bVar = null;
        }
        bVar.e();
        C19918B.a(requireActivity().getF21241d(), this, new C27808f(), 2);
        String str = this.f71456c5;
        String str2 = str == null ? null : str;
        C29640d c29640d = this.f71428W0;
        C29640d c29640d2 = c29640d != null ? c29640d : null;
        com.avito.android.L l12 = this.f71541y0;
        com.avito.android.L l13 = l12 != null ? l12 : null;
        InterfaceC27793e interfaceC27793e = this.f71545z0;
        InterfaceC27793e interfaceC27793e2 = interfaceC27793e != null ? interfaceC27793e : null;
        InterfaceC19542a interfaceC19542a = this.f71352A0;
        InterfaceC19542a interfaceC19542a2 = interfaceC19542a != null ? interfaceC19542a : null;
        yf.m mVar = this.f71356B0;
        yf.m mVar2 = mVar != null ? mVar : null;
        com.avito.android.webview.l lVar = this.f71359C0;
        com.avito.android.webview.l lVar2 = lVar != null ? lVar : null;
        com.avito.android.messenger.F f12 = this.f71362D0;
        com.avito.android.messenger.F f13 = f12 != null ? f12 : null;
        com.avito.android.deal_confirmation.sheet.j jVar = this.f71365E0;
        com.avito.android.deal_confirmation.sheet.j jVar2 = jVar != null ? jVar : null;
        oO.f fVar = this.f71368F0;
        oO.f fVar2 = fVar != null ? fVar : null;
        com.avito.android.credits.f fVar3 = this.f71371G0;
        com.avito.android.credits.f fVar4 = fVar3 != null ? fVar3 : null;
        InterfaceC30751h interfaceC30751h = this.f71374H0;
        InterfaceC30751h interfaceC30751h2 = interfaceC30751h != null ? interfaceC30751h : null;
        PhotoGalleryIntentFactory photoGalleryIntentFactory = this.f71379I0;
        PhotoGalleryIntentFactory photoGalleryIntentFactory2 = photoGalleryIntentFactory != null ? photoGalleryIntentFactory : null;
        InterfaceC33199l interfaceC33199l = this.f71382J0;
        InterfaceC33199l interfaceC33199l2 = interfaceC33199l != null ? interfaceC33199l : null;
        com.avito.android.developments_advice.l lVar3 = this.f71385K0;
        com.avito.android.developments_advice.l lVar4 = lVar3 != null ? lVar3 : null;
        com.avito.android.spare_parts.bottom_sheet.i iVar = this.f71388L0;
        com.avito.android.spare_parts.bottom_sheet.i iVar2 = iVar != null ? iVar : null;
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f71537x0;
        com.avito.android.deeplink_handler.handler.composite.a aVar2 = aVar != null ? aVar : null;
        InterfaceC35845m2 interfaceC35845m2 = this.f71533w0;
        InterfaceC35845m2 interfaceC35845m22 = interfaceC35845m2 != null ? interfaceC35845m2 : null;
        com.avito.android.account.E e12 = this.f71525u0;
        com.avito.android.account.E e13 = e12 != null ? e12 : null;
        InterfaceC44295a interfaceC44295a = this.f71543y4;
        InterfaceC44295a interfaceC44295a2 = interfaceC44295a != null ? interfaceC44295a : null;
        L4 l42 = this.f71397O0;
        L4 l43 = l42 != null ? l42 : null;
        com.avito.android.early_access_advert.d dVar = this.f71547z4;
        com.avito.android.early_access_advert.d dVar2 = dVar != null ? dVar : null;
        com.avito.android.advert.item.properties.f fVar5 = this.f71367E4;
        com.avito.android.advert.item.properties.f fVar6 = fVar5 != null ? fVar5 : null;
        com.avito.android.advert_amenities.dialog.b bVar2 = this.f71354A4;
        this.f71472g5 = new Z0(str2, this, c29640d2, l13, interfaceC27793e2, interfaceC19542a2, mVar2, lVar2, f13, jVar2, fVar2, fVar4, interfaceC30751h2, photoGalleryIntentFactory2, interfaceC33199l2, lVar4, iVar2, aVar2, interfaceC35845m22, e13, interfaceC44295a2, dVar2, l43, fVar6, bVar2 != null ? bVar2 : null);
        com.avito.android.advert.item.creditinfo.buzzoola.w wVar = this.f71413S2;
        if (wVar == null) {
            wVar = null;
        }
        com.avito.android.advert.item.creditinfo.buzzoola.v vVar = (com.avito.android.advert.item.creditinfo.buzzoola.v) new androidx.view.P0(this, wVar).a(com.avito.android.advert.item.creditinfo.buzzoola.v.class);
        this.f71464e5 = vVar;
        com.avito.android.advert.item.creditinfo.buzzoola.k kVar = this.f71522t3;
        if (kVar == null) {
            kVar = null;
        }
        kVar.Pd(vVar);
        InterfaceC28265d interfaceC28265d = this.f71416T0;
        if (interfaceC28265d == null) {
            interfaceC28265d = null;
        }
        Z0 z02 = this.f71472g5;
        if (z02 == null) {
            z02 = null;
        }
        interfaceC28265d.Qa(z02);
        InterfaceC28265d interfaceC28265d2 = this.f71416T0;
        if (interfaceC28265d2 == null) {
            interfaceC28265d2 = null;
        }
        interfaceC28265d2.Ra(this.f71484j5);
        InterfaceC28265d interfaceC28265d3 = this.f71416T0;
        if (interfaceC28265d3 == null) {
            interfaceC28265d3 = null;
        }
        interfaceC28265d3.ib(new C27809g());
        com.avito.android.advert_details_items.description.c cVar = this.f71438Y2;
        if (cVar == null) {
            cVar = null;
        }
        InterfaceC28130g0 interfaceC28130g0 = this.f71529v0;
        if (interfaceC28130g0 == null) {
            interfaceC28130g0 = null;
        }
        cVar.F7(interfaceC28130g0);
        com.avito.android.advert_details_items.address.c cVar2 = this.f71446a3;
        if (cVar2 == null) {
            cVar2 = null;
        }
        InterfaceC28130g0 interfaceC28130g02 = this.f71529v0;
        if (interfaceC28130g02 == null) {
            interfaceC28130g02 = null;
        }
        cVar2.Z3(interfaceC28130g02);
        com.avito.android.advert_details_items.rich_geo_block.e eVar = this.f71450b3;
        if (eVar == null) {
            eVar = null;
        }
        InterfaceC28130g0 interfaceC28130g03 = this.f71529v0;
        if (interfaceC28130g03 == null) {
            interfaceC28130g03 = null;
        }
        eVar.N6(interfaceC28130g03);
        com.avito.android.advert_details_items.campaigns.c cVar3 = this.f71454c3;
        if (cVar3 == null) {
            cVar3 = null;
        }
        InterfaceC28130g0 interfaceC28130g04 = this.f71529v0;
        if (interfaceC28130g04 == null) {
            interfaceC28130g04 = null;
        }
        cVar3.k6(interfaceC28130g04);
        com.avito.android.advert.item.show_on_map.c cVar4 = this.f71458d3;
        if (cVar4 == null) {
            cVar4 = null;
        }
        InterfaceC28130g0 interfaceC28130g05 = this.f71529v0;
        if (interfaceC28130g05 == null) {
            interfaceC28130g05 = null;
        }
        cVar4.B3(interfaceC28130g05);
        InterfaceC28097c interfaceC28097c = this.f71462e3;
        if (interfaceC28097c == null) {
            interfaceC28097c = null;
        }
        InterfaceC28130g0 interfaceC28130g06 = this.f71529v0;
        if (interfaceC28130g06 == null) {
            interfaceC28130g06 = null;
        }
        interfaceC28097c.s(interfaceC28130g06);
        com.avito.android.advert.item.consultation.J j12 = this.f71466f3;
        if (j12 == null) {
            j12 = null;
        }
        InterfaceC28130g0 interfaceC28130g07 = this.f71529v0;
        if (interfaceC28130g07 == null) {
            interfaceC28130g07 = null;
        }
        j12.s(interfaceC28130g07);
        InterfaceC28111q interfaceC28111q = this.f71478i3;
        if (interfaceC28111q == null) {
            interfaceC28111q = null;
        }
        InterfaceC28130g0 interfaceC28130g08 = this.f71529v0;
        if (interfaceC28130g08 == null) {
            interfaceC28130g08 = null;
        }
        interfaceC28111q.s(interfaceC28130g08);
        com.avito.android.advert.item.consultation.secondary.c cVar5 = this.f71474h3;
        if (cVar5 == null) {
            cVar5 = null;
        }
        InterfaceC28130g0 interfaceC28130g09 = this.f71529v0;
        if (interfaceC28130g09 == null) {
            interfaceC28130g09 = null;
        }
        cVar5.s(interfaceC28130g09);
        com.avito.android.advert.item.consultation.dynamic_content.c cVar6 = this.f71482j3;
        if (cVar6 == null) {
            cVar6 = null;
        }
        InterfaceC28130g0 interfaceC28130g010 = this.f71529v0;
        if (interfaceC28130g010 == null) {
            interfaceC28130g010 = null;
        }
        cVar6.s(interfaceC28130g010);
        com.avito.android.advert_details_items.georeference.c cVar7 = this.f71486k3;
        if (cVar7 == null) {
            cVar7 = null;
        }
        InterfaceC28130g0 interfaceC28130g011 = this.f71529v0;
        if (interfaceC28130g011 == null) {
            interfaceC28130g011 = null;
        }
        cVar7.O3(interfaceC28130g011);
        com.avito.android.advert.item.safedeal.services.c cVar8 = this.f71363D3;
        if (cVar8 == null) {
            cVar8 = null;
        }
        cVar8.B6(this);
        com.avito.android.advert.item.domoteka.conveyor.d dVar3 = this.f71534w3;
        if (dVar3 == null) {
            dVar3 = null;
        }
        Z0 z03 = this.f71472g5;
        if (z03 == null) {
            z03 = null;
        }
        dVar3.N(z03);
        com.avito.android.advert.item.service_booking.m mVar3 = this.f71380I3;
        if (mVar3 == null) {
            mVar3 = null;
        }
        Z0 z04 = this.f71472g5;
        if (z04 == null) {
            z04 = null;
        }
        mVar3.N(z04);
        com.avito.android.advert.item.service_order_request.n nVar = this.f71389L3;
        if (nVar == null) {
            nVar = null;
        }
        Z0 z05 = this.f71472g5;
        if (z05 == null) {
            z05 = null;
        }
        nVar.N(z05);
        com.avito.android.advert.item.cv_state.c cVar9 = this.f71459d4;
        if (cVar9 == null) {
            cVar9 = null;
        }
        InterfaceC28130g0 interfaceC28130g012 = this.f71529v0;
        if (interfaceC28130g012 == null) {
            interfaceC28130g012 = null;
        }
        cVar9.l3(interfaceC28130g012);
        C22960s.b(this, "offers_dialog_fragment", new C27810h());
        com.avito.android.ui.status_bar.e eVar2 = this.f71361C4;
        if (eVar2 == null) {
            eVar2 = null;
        }
        InterfaceC28130g0 interfaceC28130g013 = this.f71529v0;
        eVar2.c(this, Collections.singletonList(interfaceC28130g013 != null ? interfaceC28130g013 : null));
        getLifecycle().a(new com.avito.android.lib.beduin_v2.repository.domain.cart_items.r(new i()));
        FV0.i.a((Collection) this.f71452b5.getValue(), this);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        com.avito.android.advert.item.compatibility.v3.k kVar = this.f71372G3;
        if (kVar == null) {
            kVar = null;
        }
        kVar.q();
        AdvertDetailsStyle advertDetailsStyle = this.f71488k5;
        Integer num = advertDetailsStyle != null ? com.avito.android.advert.advert_details_style.c.a(advertDetailsStyle).f68636e : null;
        if (num != null) {
            layoutInflater = LayoutInflater.from(new androidx.appcompat.view.d(requireContext(), num.intValue()));
        }
        return layoutInflater.inflate(R.layout.ac_advert_details_main, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        FV0.i.b((Collection) this.f71452b5.getValue());
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        I1 i12 = this.f71468f5;
        this.f71532v5 = i12 != null ? i12.K() : null;
        I1 i13 = this.f71468f5;
        this.f71536w5 = i13 != null ? i13.f71701d1 : null;
        if (i13 != null) {
            i13.destroy();
        }
        this.f71468f5 = null;
        com.avito.android.advert_core.map.d dVar = this.f71395N3;
        if (dVar == null) {
            dVar = null;
        }
        dVar.onDestroyView();
        InterfaceC28265d interfaceC28265d = this.f71416T0;
        if (interfaceC28265d == null) {
            interfaceC28265d = null;
        }
        interfaceC28265d.e0();
        com.avito.android.advert.item.compatibility.v2.f fVar = this.f71369F3;
        if (fVar == null) {
            fVar = null;
        }
        fVar.f0();
        com.avito.android.advert.item.compatibility.v3.k kVar = this.f71372G3;
        if (kVar == null) {
            kVar = null;
        }
        kVar.f0();
        com.avito.android.advert.item.compatibility.v4.f fVar2 = this.f71377H3;
        if (fVar2 == null) {
            fVar2 = null;
        }
        fVar2.f0();
        com.avito.android.advert.item.short_term_rent.str_buttons.c cVar = this.f71490l3;
        if (cVar == null) {
            cVar = null;
        }
        cVar.t();
        com.avito.android.advert.item.short_term_rent.item_discount.c cVar2 = this.f71494m3;
        if (cVar2 == null) {
            cVar2 = null;
        }
        cVar2.t();
        com.avito.android.advert.item.hotel.hotel_offer.konveyor.main.c cVar3 = this.f71426V3;
        if (cVar3 == null) {
            cVar3 = null;
        }
        cVar3.onDestroyView();
        com.avito.android.advert.item.short_term_rent.payment_toggles.h hVar = this.f71430W3;
        if (hVar == null) {
            hVar = null;
        }
        hVar.onDestroyView();
        com.avito.android.advert.item.hotel.hotel_offer.j jVar = this.f71435X3;
        if (jVar == null) {
            jVar = null;
        }
        jVar.onDestroyView();
        InterfaceC28173a interfaceC28173a = this.f71432X0;
        if (interfaceC28173a == null) {
            interfaceC28173a = null;
        }
        interfaceC28173a.e0();
        com.avito.android.advert.item.select.controls.g gVar = this.f71445a1;
        if (gVar == null) {
            gVar = null;
        }
        gVar.e0();
        com.avito.android.advert.item.mortgage_calculation.a aVar = this.f71465f1;
        if (aVar == null) {
            aVar = null;
        }
        aVar.a();
        com.avito.android.advert.item.mortgage_snippet.c cVar4 = this.f71469g1;
        if (cVar4 == null) {
            cVar4 = null;
        }
        cVar4.f0();
        com.avito.android.advert.item.fmp.products.c cVar5 = this.f71473h1;
        if (cVar5 == null) {
            cVar5 = null;
        }
        cVar5.f0();
        com.avito.android.advert.item.autoteka.teaser.a aVar2 = this.f71477i1;
        if (aVar2 == null) {
            aVar2 = null;
        }
        aVar2.a();
        com.avito.android.advert.item.service_booking.m mVar = this.f71380I3;
        if (mVar == null) {
            mVar = null;
        }
        mVar.e0();
        com.avito.android.advert.item.service_order_request.n nVar = this.f71389L3;
        if (nVar == null) {
            nVar = null;
        }
        nVar.e0();
        com.avito.android.advert.e0 e0Var = this.f71480i5;
        if (e0Var != null) {
            e0Var.f71158g.e();
        }
        this.f71480i5 = null;
        com.avito.android.advert.item.sellersubscription.p pVar = this.f71506p3;
        if (pVar == null) {
            pVar = null;
        }
        pVar.a();
        com.avito.android.component.toast.util.c cVar6 = this.f71451b4;
        if (cVar6 == null) {
            cVar6 = null;
        }
        cVar6.clear();
        com.avito.android.favorite_sellers.adapter.recommendation.h hVar2 = this.f71538x3;
        if (hVar2 == null) {
            hVar2 = null;
        }
        hVar2.e0();
        com.avito.android.advert.item.recall_me.n nVar2 = this.f71542y3;
        if (nVar2 == null) {
            nVar2 = null;
        }
        nVar2.K();
        com.avito.android.advert.item.select.benefits.f fVar3 = this.f71510q3;
        if (fVar3 == null) {
            fVar3 = null;
        }
        fVar3.c0();
        com.avito.android.advert_details_items.search_suggests.c cVar7 = this.f71514r3;
        if (cVar7 == null) {
            cVar7 = null;
        }
        cVar7.c0();
        com.avito.android.serp.adapter.closable.c cVar8 = this.f71455c4;
        if (cVar8 == null) {
            cVar8 = null;
        }
        cVar8.e0();
        this.f71516r5.e();
        com.avito.android.advert_core.development_offers.f fVar4 = this.f71398O3;
        if (fVar4 == null) {
            fVar4 = null;
        }
        fVar4.c0();
        com.avito.android.advert_core.offers.c cVar9 = this.f71402P3;
        if (cVar9 == null) {
            cVar9 = null;
        }
        cVar9.c0();
        com.avito.android.advert.item.icebreakers.d dVar2 = this.f71546z3;
        if (dVar2 == null) {
            dVar2 = null;
        }
        dVar2.e0();
        com.avito.android.advert.item.icebreakers_redesign.d dVar3 = this.f71353A3;
        if (dVar3 == null) {
            dVar3 = null;
        }
        dVar3.e0();
        this.f71544y5.removeCallbacksAndMessages(null);
        io.reactivex.rxjava3.internal.observers.y yVar = this.f71528u5;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f71528u5 = null;
        C28144l c28144l = this.f71427V4;
        if (c28144l == null) {
            c28144l = null;
        }
        c28144l.f77247b.clear();
        c28144l.f77246a.a();
        com.avito.android.advert_core.information_about.c cVar10 = this.f71487k4;
        if (cVar10 == null) {
            cVar10 = null;
        }
        cVar10.c0();
        com.avito.android.serp.adapter.images_and_links_item.i iVar = this.f71518s3;
        if (iVar == null) {
            iVar = null;
        }
        iVar.f270185b.f318647b.clear();
        iVar.f270186c.e();
        C14700d c14700d = this.f71513r1;
        if (c14700d == null) {
            c14700d = null;
        }
        c14700d.f338515e = null;
        com.avito.android.advert.item.consultation.J j12 = this.f71466f3;
        if (j12 == null) {
            j12 = null;
        }
        j12.t();
        com.avito.android.advert_details_items.portfolio.c cVar11 = this.f71470g3;
        if (cVar11 == null) {
            cVar11 = null;
        }
        cVar11.t();
        com.avito.android.advert.item.similars.a aVar3 = this.f71527u4;
        if (aVar3 == null) {
            aVar3 = null;
        }
        aVar3.e0();
        com.avito.android.advert_favorites_toast.a aVar4 = this.f71444Z4;
        if (aVar4 == null) {
            aVar4 = null;
        }
        aVar4.a();
        com.avito.android.pinch_to_zoom.b bVar = this.f71384J4;
        if (bVar == null) {
            bVar = null;
        }
        bVar.e((ViewGroup) requireActivity().getWindow().getDecorView());
        com.avito.android.util.O0 o02 = this.f71399O4;
        (o02 != null ? o02 : null).e();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        com.avito.android.advert_core.map.d dVar = this.f71395N3;
        if (dVar == null) {
            dVar = null;
        }
        dVar.onLowMemory();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        InterfaceC28130g0 interfaceC28130g0 = this.f71529v0;
        if (interfaceC28130g0 == null) {
            interfaceC28130g0 = null;
        }
        interfaceC28130g0.onPause();
        com.avito.android.screenshot_observer.a aVar = this.f71523t4;
        if (aVar == null) {
            aVar = null;
        }
        aVar.a();
        com.avito.android.advert.item.properties.f fVar = this.f71367E4;
        (fVar != null ? fVar : null).onPause();
        super.onPause();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        InterfaceC28130g0 interfaceC28130g0 = this.f71529v0;
        if (interfaceC28130g0 == null) {
            interfaceC28130g0 = null;
        }
        interfaceC28130g0.onResume();
        com.avito.android.deal_confirmation.d dVar = this.f71420U0;
        if (dVar == null) {
            dVar = null;
        }
        dVar.onResume();
        com.avito.android.screenshot_observer.a aVar = this.f71523t4;
        if (aVar == null) {
            aVar = null;
        }
        aVar.b();
        Context context = getContext();
        if (context != null) {
            com.avito.android.advert.item.properties.f fVar = this.f71367E4;
            (fVar != null ? fVar : null).b(context);
        }
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        Parcelable parcelableK;
        Integer num;
        super.onSaveInstanceState(bundle);
        Bundle bundle2 = new Bundle();
        com.avito.android.section.o oVar = this.f71409R2;
        if (oVar == null) {
            oVar = null;
        }
        bundle2.putBundle("section_presenter_state", oVar.getF264849d());
        com.avito.android.advert.item.domoteka.a aVar = this.f71530v3;
        if (aVar == null) {
            aVar = null;
        }
        com.avito.android.util.G.c(bundle2, "domoteka_teaser_interactor_state", aVar.d0());
        InterfaceC28130g0 interfaceC28130g0 = this.f71529v0;
        if (interfaceC28130g0 == null) {
            interfaceC28130g0 = null;
        }
        bundle2.putBundle("presenter", interfaceC28130g0.d0());
        InterfaceC28243x interfaceC28243x = this.f71424V0;
        if (interfaceC28243x == null) {
            interfaceC28243x = null;
        }
        com.avito.android.util.G.c(bundle2, "toolbar_presenter", interfaceC28243x.d0());
        com.avito.android.favorite_sellers.adapter.recommendation.h hVar = this.f71538x3;
        if (hVar == null) {
            hVar = null;
        }
        com.avito.android.util.G.c(bundle2, "recommendation_presenter_state", hVar.d0());
        com.avito.android.V v12 = this.f71392M3;
        if (v12 == null) {
            v12 = null;
        }
        com.avito.android.util.G.c(bundle2, "broker_analytics_state", v12.d0());
        com.avito.android.advert.item.compatibility.v2.f fVar = this.f71369F3;
        if (fVar == null) {
            fVar = null;
        }
        com.avito.android.util.G.c(bundle2, "garage_compatibility_v2_saved_state", fVar.d0());
        com.avito.android.advert.item.compatibility.v3.k kVar = this.f71372G3;
        if (kVar == null) {
            kVar = null;
        }
        com.avito.android.util.G.c(bundle2, "garage_compatibility_v3_saved_state", kVar.d0());
        com.avito.android.advert.item.compatibility.v4.f fVar2 = this.f71377H3;
        if (fVar2 == null) {
            fVar2 = null;
        }
        com.avito.android.util.G.c(bundle2, "garage_compatibility_v4_saved_state", fVar2.d0());
        com.avito.android.deal_confirmation.d dVar = this.f71420U0;
        if (dVar == null) {
            dVar = null;
        }
        com.avito.android.util.G.c(bundle2, "deal_confirmation_saved_state", dVar.d0());
        com.avito.android.advert.item.icebreakers.d dVar2 = this.f71546z3;
        if (dVar2 == null) {
            dVar2 = null;
        }
        com.avito.android.util.G.c(bundle2, "icebreakers_state", dVar2.d0());
        com.avito.android.advert.item.icebreakers_redesign.d dVar3 = this.f71353A3;
        if (dVar3 == null) {
            dVar3 = null;
        }
        com.avito.android.util.G.c(bundle2, "icebreakers_redesign_state", dVar3.d0());
        com.avito.android.advert.item.realty_usp.g gVar = this.f71357B3;
        if (gVar == null) {
            gVar = null;
        }
        com.avito.android.util.G.c(bundle2, "realty_usp_state", gVar.d0());
        com.avito.android.advert_core.pp_recall_promo.c cVar = this.f71360C3;
        if (cVar == null) {
            cVar = null;
        }
        com.avito.android.util.G.c(bundle2, "pp_recall_state", cVar.d0());
        InterfaceC13095a interfaceC13095a = this.f71483j4;
        if (interfaceC13095a == null) {
            interfaceC13095a = null;
        }
        bundle2.putParcelable("disclaimer_saved_state", interfaceC13095a.getF708a());
        com.avito.konveyor.item_visibility_tracker.b bVar = this.f71410R3;
        if (bVar == null) {
            bVar = null;
        }
        bundle2.putBundle("key_item_visibility_tracker_state", bVar.d0());
        com.avito.android.advert.item.beduin.v2.b bVar2 = this.f71414S3;
        if (bVar2 == null) {
            bVar2 = null;
        }
        bundle2.putBundle("key_beduin_item_visibility_tracker_state", bVar2.d0());
        com.avito.android.advertising.adapter.items.buzzoola.premium.r rVar = this.f71417T2;
        if (rVar == null) {
            rVar = null;
        }
        bundle2.putParcelable("commercial_state", rVar.d0());
        com.avito.android.advert.item.select.controls.g gVar2 = this.f71445a1;
        if (gVar2 == null) {
            gVar2 = null;
        }
        com.avito.android.util.G.c(bundle2, "auto_select_presenter_state", gVar2.d0());
        com.avito.android.advert.item.select.no_click_contact.c cVar2 = this.f71449b1;
        if (cVar2 == null) {
            cVar2 = null;
        }
        com.avito.android.util.G.c(bundle2, "auto_select_no_click_contact_presenter_state", cVar2.d0());
        InterfaceC28200c interfaceC28200c = this.f71453c1;
        if (interfaceC28200c == null) {
            interfaceC28200c = null;
        }
        com.avito.android.util.G.c(bundle2, "auto_select_parameters_v3_presenter_state", interfaceC28200c.d0());
        com.avito.android.serp.adapter.images_and_links_item.i iVar = this.f71518s3;
        if (iVar == null) {
            iVar = null;
        }
        com.avito.android.util.G.c(bundle2, "images_with_links_state", iVar.f270185b);
        com.avito.android.serp.adapter.constructor.A a12 = this.f71457d1;
        if (a12 == null) {
            a12 = null;
        }
        com.avito.android.util.G.c(bundle2, "constructor_advert_state", a12.d0());
        com.avito.android.advert_core.auto_select_parameters_v2.advantage.c cVar3 = this.f71406Q3;
        if (cVar3 == null) {
            cVar3 = null;
        }
        com.avito.android.util.G.c(bundle2, "auto_select_advantages_v2_state", cVar3.d0());
        com.avito.android.advert.item.properties.f fVar3 = this.f71367E4;
        if (fVar3 == null) {
            fVar3 = null;
        }
        com.avito.android.util.G.c(bundle2, "properties_dialog_state", fVar3.d0());
        I1 i12 = this.f71468f5;
        if (i12 == null || (parcelableK = i12.K()) == null) {
            parcelableK = this.f71532v5;
        }
        bundle2.putParcelable("beduin_v2_column_state", parcelableK);
        I1 i13 = this.f71468f5;
        if (i13 == null || (num = i13.f71701d1) == null) {
            num = this.f71536w5;
        }
        if (num != null) {
            bundle2.putInt("sticky_item_position", num.intValue());
        }
        com.avito.android.util.O0 o02 = this.f71399O4;
        (o02 != null ? o02 : null).c(bundle2);
        z5(bundle2);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (!this.f71476h5) {
            View view = getView();
            if (view != null) {
                com.avito.android.advert.e0 e0Var = this.f71480i5;
                if (e0Var == null) {
                    com.avito.android.advert_details_items.photogallery.c cVar = this.f71436X4;
                    if (cVar == null) {
                        cVar = null;
                    }
                    com.avito.android.lib.beduin_v2.repository.cart_total_quantity.L l12 = this.f71500n5;
                    com.avito.android.util.R0 r02 = this.f71396N4;
                    if (r02 == null) {
                        r02 = null;
                    }
                    e0Var = new com.avito.android.advert.e0(cVar, view, l12, r02);
                    this.f71480i5 = e0Var;
                }
                InterfaceC28243x interfaceC28243x = this.f71424V0;
                if (interfaceC28243x == null) {
                    interfaceC28243x = null;
                }
                AdvertDetailsStyle advertDetailsStyle = this.f71488k5;
                if (advertDetailsStyle == null) {
                    advertDetailsStyle = AdvertDetailsStyle.f84409c;
                }
                interfaceC28243x.m0(e0Var, advertDetailsStyle, this.f71492l5);
            }
            com.avito.android.advert_core.map.d dVar = this.f71395N3;
            if (dVar == null) {
                dVar = null;
            }
            Z0 z02 = this.f71472g5;
            if (z02 == null) {
                z02 = null;
            }
            com.avito.android.advert_core.analytics.a aVar = this.f71467f4;
            if (aVar == null) {
                aVar = null;
            }
            dVar.m7(z02, (F9.a) aVar);
            InterfaceC28243x interfaceC28243x2 = this.f71424V0;
            if (interfaceC28243x2 == null) {
                interfaceC28243x2 = null;
            }
            Z0 z03 = this.f71472g5;
            if (z03 == null) {
                z03 = null;
            }
            interfaceC28243x2.j0(z03);
            InterfaceC28130g0 interfaceC28130g0 = this.f71529v0;
            if (interfaceC28130g0 == null) {
                interfaceC28130g0 = null;
            }
            interfaceC28130g0.k(this.f71468f5);
            InterfaceC28173a interfaceC28173a = this.f71432X0;
            if (interfaceC28173a == null) {
                interfaceC28173a = null;
            }
            Z0 z04 = this.f71472g5;
            if (z04 == null) {
                z04 = null;
            }
            interfaceC28173a.j0(z04);
            com.avito.android.advert.item.b2c.h hVar = this.f71437Y0;
            if (hVar == null) {
                hVar = null;
            }
            Z0 z05 = this.f71472g5;
            if (z05 == null) {
                z05 = null;
            }
            hVar.j0(z05);
            com.avito.android.advert.item.address_centrity.i iVar = this.f71441Z0;
            if (iVar == null) {
                iVar = null;
            }
            Z0 z06 = this.f71472g5;
            if (z06 == null) {
                z06 = null;
            }
            iVar.j0(z06);
            com.avito.android.advert.item.select.controls.g gVar = this.f71445a1;
            if (gVar == null) {
                gVar = null;
            }
            Z0 z07 = this.f71472g5;
            if (z07 == null) {
                z07 = null;
            }
            gVar.j0(z07);
            com.avito.android.advert.item.mortgage_calculation.a aVar2 = this.f71465f1;
            if (aVar2 == null) {
                aVar2 = null;
            }
            Z0 z08 = this.f71472g5;
            if (z08 == null) {
                z08 = null;
            }
            aVar2.j0(z08);
            com.avito.android.advert.item.mortgage_snippet.c cVar2 = this.f71469g1;
            if (cVar2 == null) {
                cVar2 = null;
            }
            cVar2.X(this.f71468f5);
            com.avito.android.advert.item.mortgage_snippet.c cVar3 = this.f71469g1;
            if (cVar3 == null) {
                cVar3 = null;
            }
            Z0 z09 = this.f71472g5;
            if (z09 == null) {
                z09 = null;
            }
            cVar3.m(z09);
            com.avito.android.advert.item.mortgage_snippet.c cVar4 = this.f71469g1;
            if (cVar4 == null) {
                cVar4 = null;
            }
            cVar4.S0(getViewLifecycleOwner());
            com.avito.android.advert.item.fmp.products.c cVar5 = this.f71473h1;
            if (cVar5 == null) {
                cVar5 = null;
            }
            cVar5.X(this.f71468f5);
            com.avito.android.advert.item.fmp.products.c cVar6 = this.f71473h1;
            if (cVar6 == null) {
                cVar6 = null;
            }
            Z0 z010 = this.f71472g5;
            if (z010 == null) {
                z010 = null;
            }
            cVar6.m(z010);
            com.avito.android.advert.item.fmp.products.c cVar7 = this.f71473h1;
            if (cVar7 == null) {
                cVar7 = null;
            }
            cVar7.S0(getViewLifecycleOwner());
            com.avito.android.advert.item.autoteka.teaser.a aVar3 = this.f71477i1;
            if (aVar3 == null) {
                aVar3 = null;
            }
            Z0 z011 = this.f71472g5;
            if (z011 == null) {
                z011 = null;
            }
            aVar3.j0(z011);
            com.avito.android.advert.item.rating_publish.c cVar8 = this.f71526u3;
            if (cVar8 == null) {
                cVar8 = null;
            }
            Z0 z012 = this.f71472g5;
            if (z012 == null) {
                z012 = null;
            }
            cVar8.c6(z012);
            com.avito.android.favorite_sellers.adapter.recommendation.h hVar2 = this.f71538x3;
            if (hVar2 == null) {
                hVar2 = null;
            }
            Z0 z013 = this.f71472g5;
            if (z013 == null) {
                z013 = null;
            }
            hVar2.b5(z013);
            com.avito.android.advert_core.body_condition.f fVar = this.f71442Z2;
            if (fVar == null) {
                fVar = null;
            }
            Z0 z014 = this.f71472g5;
            if (z014 == null) {
                z014 = null;
            }
            fVar.z6(z014);
            com.avito.android.credits.q qVar = this.f71421U2;
            if (qVar == null) {
                qVar = null;
            }
            Z0 z015 = this.f71472g5;
            if (z015 == null) {
                z015 = null;
            }
            qVar.A4(z015);
            com.avito.android.credits.q qVar2 = this.f71421U2;
            if (qVar2 == null) {
                qVar2 = null;
            }
            qVar2.a4(this.f71468f5);
            com.avito.android.advert.item.service_app_filling.a aVar4 = this.f71461e1;
            if (aVar4 == null) {
                aVar4 = null;
            }
            Z0 z016 = this.f71472g5;
            if (z016 == null) {
                z016 = null;
            }
            aVar4.j0(z016);
            com.avito.android.deal_confirmation.d dVar2 = this.f71420U0;
            if (dVar2 == null) {
                dVar2 = null;
            }
            Z0 z017 = this.f71472g5;
            if (z017 == null) {
                z017 = null;
            }
            dVar2.b(z017);
            com.avito.android.advert_core.development_offers.f fVar2 = this.f71398O3;
            if (fVar2 == null) {
                fVar2 = null;
            }
            Z0 z018 = this.f71472g5;
            if (z018 == null) {
                z018 = null;
            }
            fVar2.P5(z018);
            com.avito.android.advert_core.offers.c cVar9 = this.f71402P3;
            if (cVar9 == null) {
                cVar9 = null;
            }
            Z0 z019 = this.f71472g5;
            if (z019 == null) {
                z019 = null;
            }
            cVar9.I4(z019);
            com.avito.android.advert_core.advert_badge_bar.e eVar = this.f71366E3;
            if (eVar == null) {
                eVar = null;
            }
            Z0 z020 = this.f71472g5;
            if (z020 == null) {
                z020 = null;
            }
            eVar.M2(z020);
            com.avito.android.advert.item.select.benefits.f fVar3 = this.f71510q3;
            if (fVar3 == null) {
                fVar3 = null;
            }
            Z0 z021 = this.f71472g5;
            if (z021 == null) {
                z021 = null;
            }
            fVar3.m(z021);
            com.avito.android.advert_details_items.search_suggests.c cVar10 = this.f71514r3;
            if (cVar10 == null) {
                cVar10 = null;
            }
            Z0 z022 = this.f71472g5;
            if (z022 == null) {
                z022 = null;
            }
            cVar10.w4(z022);
            com.avito.android.advert_core.information_about.c cVar11 = this.f71487k4;
            if (cVar11 == null) {
                cVar11 = null;
            }
            Z0 z023 = this.f71472g5;
            if (z023 == null) {
                z023 = null;
            }
            cVar11.H5(z023);
            com.avito.android.advert.item.early_access_fakedoor.konveyor.c cVar12 = this.f71511q4;
            if (cVar12 == null) {
                cVar12 = null;
            }
            Z0 z024 = this.f71472g5;
            if (z024 == null) {
                z024 = null;
            }
            cVar12.s5(z024);
            com.avito.android.advert.item.amenities.c cVar13 = this.f71515r4;
            if (cVar13 == null) {
                cVar13 = null;
            }
            Z0 z025 = this.f71472g5;
            if (z025 == null) {
                z025 = null;
            }
            cVar13.j0(z025);
            com.avito.android.advert.item.reusable_amenities.g gVar2 = this.f71519s4;
            if (gVar2 == null) {
                gVar2 = null;
            }
            Z0 z026 = this.f71472g5;
            if (z026 == null) {
                z026 = null;
            }
            gVar2.U5(z026);
            com.avito.android.advert.item.hotel.hotel_offer.konveyor.main.c cVar14 = this.f71426V3;
            if (cVar14 == null) {
                cVar14 = null;
            }
            Z0 z027 = this.f71472g5;
            if (z027 == null) {
                z027 = null;
            }
            cVar14.r5(z027);
            com.avito.android.advert.item.hotel.hotel_offer.j jVar = this.f71435X3;
            if (jVar == null) {
                jVar = null;
            }
            Z0 z028 = this.f71472g5;
            if (z028 == null) {
                z028 = null;
            }
            jVar.j0(z028);
            com.avito.android.advert.item.hotel.hotel_offer.floating_view.a aVar5 = this.f71439Y3;
            if (aVar5 == null) {
                aVar5 = null;
            }
            Z0 z029 = this.f71472g5;
            if (z029 == null) {
                z029 = null;
            }
            aVar5.j0(z029);
            com.avito.android.advert.item.compatibility.v3.k kVar = this.f71372G3;
            if (kVar == null) {
                kVar = null;
            }
            Z0 z030 = this.f71472g5;
            if (z030 == null) {
                z030 = null;
            }
            kVar.y5(z030);
            com.avito.android.advert.item.icebreakers_redesign.d dVar3 = this.f71353A3;
            if (dVar3 == null) {
                dVar3 = null;
            }
            Z0 z031 = this.f71472g5;
            if (z031 == null) {
                z031 = null;
            }
            dVar3.m5(z031);
            InterfaceC28130g0 interfaceC28130g02 = this.f71529v0;
            if (interfaceC28130g02 == null) {
                interfaceC28130g02 = null;
            }
            interfaceC28130g02.pd(new L(this));
            InterfaceC28130g0 interfaceC28130g03 = this.f71529v0;
            if (interfaceC28130g03 == null) {
                interfaceC28130g03 = null;
            }
            interfaceC28130g03.start();
            this.f71476h5 = true;
        }
        if (this.f71512q5) {
            InterfaceC28130g0 interfaceC28130g04 = this.f71529v0;
            if (interfaceC28130g04 == null) {
                interfaceC28130g04 = null;
            }
            interfaceC28130g04.Ia();
            this.f71512q5 = false;
        }
        com.avito.android.deeplink_handler.handler.composite.a aVar6 = this.f71537x0;
        if (aVar6 == null) {
            aVar6 = null;
        }
        this.s5 = (io.reactivex.rxjava3.internal.observers.y) aVar6.d9().t0(new j());
        com.avito.android.deeplink_handler.handler.composite.a aVar7 = this.f71537x0;
        this.f71524t5 = (io.reactivex.rxjava3.internal.observers.y) (aVar7 != null ? aVar7 : null).V9().N(k.f71568b).t0(new l());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        io.reactivex.rxjava3.internal.observers.y yVar = this.s5;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.s5 = null;
        io.reactivex.rxjava3.internal.observers.y yVar2 = this.f71524t5;
        if (yVar2 != null) {
            DisposableHelper.a(yVar2);
        }
        this.f71524t5 = null;
        if (this.f71476h5) {
            com.avito.android.advert_core.map.d dVar = this.f71395N3;
            if (dVar == null) {
                dVar = null;
            }
            dVar.onStop();
            InterfaceC28243x interfaceC28243x = this.f71424V0;
            if (interfaceC28243x == null) {
                interfaceC28243x = null;
            }
            interfaceC28243x.e0();
            InterfaceC28243x interfaceC28243x2 = this.f71424V0;
            if (interfaceC28243x2 == null) {
                interfaceC28243x2 = null;
            }
            interfaceC28243x2.c0();
            InterfaceC28173a interfaceC28173a = this.f71432X0;
            if (interfaceC28173a == null) {
                interfaceC28173a = null;
            }
            interfaceC28173a.c0();
            com.avito.android.advert.item.b2c.h hVar = this.f71437Y0;
            if (hVar == null) {
                hVar = null;
            }
            hVar.c0();
            com.avito.android.advert.item.address_centrity.i iVar = this.f71441Z0;
            if (iVar == null) {
                iVar = null;
            }
            iVar.c0();
            com.avito.android.advert.item.select.controls.g gVar = this.f71445a1;
            if (gVar == null) {
                gVar = null;
            }
            gVar.c0();
            com.avito.android.advert.item.mortgage_calculation.a aVar = this.f71465f1;
            if (aVar == null) {
                aVar = null;
            }
            aVar.c0();
            com.avito.android.advert.item.autoteka.teaser.a aVar2 = this.f71477i1;
            if (aVar2 == null) {
                aVar2 = null;
            }
            aVar2.c0();
            com.avito.android.advert.item.rating_publish.c cVar = this.f71526u3;
            if (cVar == null) {
                cVar = null;
            }
            cVar.c0();
            com.avito.android.advert.item.domoteka.conveyor.d dVar2 = this.f71534w3;
            if (dVar2 == null) {
                dVar2 = null;
            }
            dVar2.e0();
            com.avito.android.favorite_sellers.adapter.recommendation.h hVar2 = this.f71538x3;
            if (hVar2 == null) {
                hVar2 = null;
            }
            hVar2.c0();
            com.avito.android.advert_core.body_condition.f fVar = this.f71442Z2;
            if (fVar == null) {
                fVar = null;
            }
            fVar.c0();
            com.avito.android.credits.q qVar = this.f71421U2;
            if (qVar == null) {
                qVar = null;
            }
            qVar.f0();
            com.avito.android.advert.item.service_app_filling.a aVar3 = this.f71461e1;
            if (aVar3 == null) {
                aVar3 = null;
            }
            aVar3.c0();
            com.avito.android.deal_confirmation.d dVar3 = this.f71420U0;
            if (dVar3 == null) {
                dVar3 = null;
            }
            dVar3.c0();
            com.avito.android.advert_core.advert_badge_bar.e eVar = this.f71366E3;
            if (eVar == null) {
                eVar = null;
            }
            eVar.c0();
            com.avito.android.advert.item.early_access_fakedoor.konveyor.c cVar2 = this.f71511q4;
            if (cVar2 == null) {
                cVar2 = null;
            }
            cVar2.c0();
            com.avito.android.advert.item.amenities.c cVar3 = this.f71515r4;
            if (cVar3 == null) {
                cVar3 = null;
            }
            cVar3.c0();
            com.avito.android.advert.item.reusable_amenities.g gVar2 = this.f71519s4;
            if (gVar2 == null) {
                gVar2 = null;
            }
            gVar2.c0();
            com.avito.android.advert.item.hotel.hotel_offer.konveyor.main.c cVar4 = this.f71426V3;
            if (cVar4 == null) {
                cVar4 = null;
            }
            cVar4.c0();
            com.avito.android.advert.item.hotel.hotel_offer.j jVar = this.f71435X3;
            if (jVar == null) {
                jVar = null;
            }
            jVar.c0();
            com.avito.android.advert.item.hotel.hotel_offer.floating_view.a aVar4 = this.f71439Y3;
            if (aVar4 == null) {
                aVar4 = null;
            }
            aVar4.c0();
            com.avito.android.advert.item.leasing_calculator.c cVar5 = this.f71463e4;
            if (cVar5 == null) {
                cVar5 = null;
            }
            cVar5.P();
            com.avito.android.advert.item.geo_distance.f fVar2 = this.f71381I4;
            if (fVar2 == null) {
                fVar2 = null;
            }
            fVar2.f0();
            com.avito.android.advert.item.compatibility.v3.k kVar = this.f71372G3;
            if (kVar == null) {
                kVar = null;
            }
            kVar.c0();
            com.avito.android.advert.item.icebreakers_redesign.d dVar4 = this.f71353A3;
            if (dVar4 == null) {
                dVar4 = null;
            }
            dVar4.c0();
            InterfaceC28130g0 interfaceC28130g0 = this.f71529v0;
            if (interfaceC28130g0 == null) {
                interfaceC28130g0 = null;
            }
            interfaceC28130g0.pd(null);
            InterfaceC28130g0 interfaceC28130g02 = this.f71529v0;
            if (interfaceC28130g02 == null) {
                interfaceC28130g02 = null;
            }
            interfaceC28130g02.e0();
            InterfaceC28130g0 interfaceC28130g03 = this.f71529v0;
            (interfaceC28130g03 != null ? interfaceC28130g03 : null).stop();
            this.f71476h5 = false;
        }
        super.onStop();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) throws Resources.NotFoundException {
        Parcelable parcelable;
        super.onViewCreated(view, bundle);
        a.b.c(this, true);
        Bundle bundleW5 = w5();
        Bundle arguments = getArguments();
        AdvertDetailsArguments advertDetailsArguments = arguments != null ? (AdvertDetailsArguments) arguments.getParcelable("advert_details_arguments") : null;
        if (advertDetailsArguments == null) {
            throw new IllegalArgumentException("AdvertDetailsArguments must be specified");
        }
        if (bundleW5 != null) {
            InterfaceC28130g0 interfaceC28130g0 = this.f71529v0;
            if (interfaceC28130g0 == null) {
                interfaceC28130g0 = null;
            }
            interfaceC28130g0.A9(bundleW5.getBundle("presenter"));
            bundleW5.getInt("SCROLL_POS_COMPLEMENTARY_ITEMS", 0);
            com.avito.android.util.O0 o02 = this.f71399O4;
            if (o02 == null) {
                o02 = null;
            }
            o02.d(bundleW5);
        }
        if (this.f71532v5 == null) {
            if (bundleW5 == null || (parcelable = bundleW5.getParcelable("beduin_v2_column_state")) == null) {
                parcelable = advertDetailsArguments.f71323m;
            }
            this.f71532v5 = parcelable;
            this.f71536w5 = bundleW5 != null ? Integer.valueOf(bundleW5.getInt("sticky_item_position")) : this.f71536w5;
        }
        InterfaceC22983P viewLifecycleOwner = getViewLifecycleOwner();
        com.avito.android.lib.beduin_v2.repository.cart_total_quantity.N n12 = this.f71496m5;
        this.f71500n5 = new com.avito.android.lib.beduin_v2.repository.cart_total_quantity.L(viewLifecycleOwner, n12 != null ? n12 : null, false, 4, null);
        com.avito.android.advert.item.complementary.c cVar = this.f71431W4;
        com.avito.android.advert.item.complementary.c cVar2 = cVar != null ? cVar : null;
        Z0 z02 = this.f71472g5;
        Z0 z03 = z02 == null ? null : z02;
        com.avito.android.advert_core.advert.l lVar = this.f71386K3;
        com.avito.android.advert_core.advert.l lVar2 = lVar != null ? lVar : null;
        InterfaceC50074a interfaceC50074a = this.f71447a4;
        InterfaceC50074a interfaceC50074a2 = interfaceC50074a != null ? interfaceC50074a : null;
        com.avito.android.util.R0 r02 = this.f71396N4;
        com.avito.android.util.R0 r03 = r02 != null ? r02 : null;
        com.avito.android.advert.item.short_term_rent.str_buttons.c cVar3 = this.f71490l3;
        com.avito.android.advert.item.short_term_rent.str_buttons.c cVar4 = cVar3 != null ? cVar3 : null;
        com.avito.android.advert.item.interiorPhotos.g gVar = this.f71498n3;
        com.avito.android.advert.item.interiorPhotos.g gVar2 = gVar != null ? gVar : null;
        com.avito.android.favorite.n nVar = this.f71433X1;
        com.avito.android.favorite.n nVar2 = nVar != null ? nVar : null;
        com.avito.android.advert.viewed.f fVar = this.f71401P2;
        com.avito.android.advert.viewed.f fVar2 = fVar != null ? fVar : null;
        com.avito.android.section.action.b bVar = this.f71405Q2;
        com.avito.android.section.action.b bVar2 = bVar != null ? bVar : null;
        S s5 = this.f71502o3;
        S s12 = s5 != null ? s5 : null;
        com.avito.android.advert.item.sellersubscription.p pVar = this.f71506p3;
        com.avito.android.advert.item.sellersubscription.p pVar2 = pVar != null ? pVar : null;
        InterfaceC28130g0 interfaceC28130g02 = this.f71529v0;
        InterfaceC28130g0 interfaceC28130g03 = interfaceC28130g02 != null ? interfaceC28130g02 : null;
        L4 l42 = this.f71397O0;
        L4 l43 = l42 != null ? l42 : null;
        z7.b bVar3 = this.f71404Q0;
        z7.b bVar4 = bVar3 != null ? bVar3 : null;
        com.avito.android.advert.item.anchor_trust_factors.topbar.a aVar = this.f71408R0;
        com.avito.android.advert.item.anchor_trust_factors.topbar.a aVar2 = aVar != null ? aVar : null;
        com.avito.android.advert.item.anchor_trust_factors.l lVar3 = this.f71412S0;
        com.avito.android.advert.item.anchor_trust_factors.l lVar4 = lVar3 != null ? lVar3 : null;
        InterfaceC28265d interfaceC28265d = this.f71416T0;
        InterfaceC28265d interfaceC28265d2 = interfaceC28265d != null ? interfaceC28265d : null;
        InterfaceC28280j interfaceC28280j = this.f71400P0;
        InterfaceC28280j interfaceC28280j2 = interfaceC28280j != null ? interfaceC28280j : null;
        InterfaceC28243x interfaceC28243x = this.f71424V0;
        InterfaceC28243x interfaceC28243x2 = interfaceC28243x != null ? interfaceC28243x : null;
        InterfaceC14698b interfaceC14698b = this.f71509q1;
        InterfaceC14698b interfaceC14698b2 = interfaceC14698b != null ? interfaceC14698b : null;
        com.avito.android.advert.item.autoteka.teaser.i iVar = this.f71489l1;
        com.avito.android.advert.item.autoteka.teaser.i iVar2 = iVar != null ? iVar : null;
        com.avito.android.advert.item.autoteka.teaser_v2.c cVar5 = this.f71493m1;
        com.avito.android.advert.item.autoteka.teaser_v2.c cVar6 = cVar5 != null ? cVar5 : null;
        com.avito.android.advert.item.autoteka.teaser_v3.c cVar7 = this.f71497n1;
        com.avito.android.advert.item.autoteka.teaser_v3.c cVar8 = cVar7 != null ? cVar7 : null;
        com.avito.android.advert.item.autoteka_select.teaser.c cVar9 = this.f71501o1;
        com.avito.android.advert.item.autoteka_select.teaser.c cVar10 = cVar9 != null ? cVar9 : null;
        com.avito.android.advert.item.note.c cVar11 = this.f71505p1;
        if (cVar11 == null) {
            cVar11 = null;
        }
        InterfaceC13437a interfaceC13437a = this.f71429W2;
        InterfaceC13437a interfaceC13437a2 = interfaceC13437a != null ? interfaceC13437a : null;
        InterfaceC22983P viewLifecycleOwner2 = getViewLifecycleOwner();
        com.avito.android.serp.adapter.h1 h1Var = this.f71517s1;
        com.avito.android.serp.adapter.h1 h1Var2 = h1Var != null ? h1Var : null;
        GridLayoutManager.c cVar12 = this.f71521t1;
        GridLayoutManager.c cVar13 = cVar12 != null ? cVar12 : null;
        com.avito.android.serp.adapter.Y0 y02 = this.f71375H1;
        com.avito.android.serp.adapter.Y0 y03 = y02 != null ? y02 : null;
        com.avito.konveyor.adapter.a aVar3 = this.f71481j1;
        com.avito.konveyor.adapter.a aVar4 = aVar3 != null ? aVar3 : null;
        C14700d c14700d = this.f71513r1;
        C14700d c14700d2 = c14700d != null ? c14700d : null;
        com.avito.android.util.L0 l02 = this.f71394N0;
        com.avito.android.util.L0 l03 = l02 != null ? l02 : null;
        com.avito.android.advert.item.similars.j jVar = this.f71485k1;
        com.avito.android.advert.item.similars.j jVar2 = jVar != null ? jVar : null;
        com.avito.konveyor.item_visibility_tracker.b bVar5 = this.f71410R3;
        com.avito.konveyor.item_visibility_tracker.b bVar6 = bVar5 != null ? bVar5 : null;
        com.avito.android.advert.item.beduin.v2.b bVar7 = this.f71414S3;
        com.avito.android.advert.item.beduin.v2.b bVar8 = bVar7 != null ? bVar7 : null;
        com.avito.android.serp.adapter.closable.c cVar14 = this.f71455c4;
        com.avito.android.serp.adapter.closable.c cVar15 = cVar14 != null ? cVar14 : null;
        com.avito.android.favorite_apprater.g gVar3 = this.f71376H2;
        com.avito.android.advert.item.note.c cVar16 = cVar11;
        if (gVar3 == null) {
            gVar3 = null;
        }
        com.avito.android.lib.beduin_v2.repository.cart_total_quantity.N n13 = this.f71496m5;
        com.avito.android.lib.beduin_v2.repository.cart_total_quantity.N n14 = n13 != null ? n13 : null;
        Ax.e eVar = this.f71479i4;
        Ax.e eVar2 = eVar != null ? eVar : null;
        A7.b bVar9 = this.f71434X2;
        A7.b bVar10 = bVar9 != null ? bVar9 : null;
        InterfaceC39709b interfaceC39709b = this.f71491l4;
        InterfaceC39709b interfaceC39709b2 = interfaceC39709b != null ? interfaceC39709b : null;
        InterfaceC27811a interfaceC27811a = this.f71503o4;
        InterfaceC27811a interfaceC27811a2 = interfaceC27811a != null ? interfaceC27811a : null;
        com.avito.android.advert_core.price_list.preview.f fVar3 = this.f71507p4;
        com.avito.android.advert_core.price_list.preview.f fVar4 = fVar3 != null ? fVar3 : null;
        com.avito.android.advert_core.map.d dVar = this.f71395N3;
        com.avito.android.advert_core.map.d dVar2 = dVar != null ? dVar : null;
        com.avito.android.advert.item.similars.a aVar5 = this.f71527u4;
        com.avito.android.advert.item.similars.a aVar6 = aVar5 != null ? aVar5 : null;
        com.avito.android.advert.item.hotel.hotel_offer.floating_view.a aVar7 = this.f71439Y3;
        com.avito.android.advert.item.hotel.hotel_offer.floating_view.a aVar8 = aVar7 != null ? aVar7 : null;
        com.avito.android.advert.item.commercials.f fVar5 = this.f71531v4;
        com.avito.android.advert.item.commercials.f fVar6 = fVar5 != null ? fVar5 : null;
        ProgressInfoToastBar.a aVar9 = this.f71535w4;
        ProgressInfoToastBar.a aVar10 = aVar9 != null ? aVar9 : null;
        com.avito.android.advert.item.services_review_volunteers.e eVar3 = this.f71539x4;
        if (eVar3 == null) {
            eVar3 = null;
        }
        C27814a2 c27814a2E5 = E5();
        com.avito.android.advert.item.services_review_volunteers.e eVar4 = eVar3;
        com.avito.android.video_snippets.g gVar4 = this.f71373G4;
        com.avito.android.video_snippets.g gVar5 = gVar4 != null ? gVar4 : null;
        com.avito.android.advert_core.analytics.a aVar11 = this.f71467f4;
        com.avito.android.advert_core.analytics.a aVar12 = aVar11 != null ? aVar11 : null;
        com.avito.android.advert.item.beduin.v2.di.a aVar13 = (com.avito.android.advert.item.beduin.v2.di.a) this.f71448a5.getValue();
        com.avito.android.util.text.a aVar14 = this.f71387K4;
        com.avito.android.util.text.a aVar15 = aVar14 != null ? aVar14 : null;
        com.avito.android.app_rater.b bVar11 = this.f71390L4;
        com.avito.android.app_rater.b bVar12 = bVar11 != null ? bVar11 : null;
        C29640d c29640d = this.f71428W0;
        C29640d c29640d2 = c29640d != null ? c29640d : null;
        boolean z12 = !v5();
        com.avito.konveyor.a aVar16 = this.f71358B4;
        com.avito.konveyor.a aVar17 = aVar16 != null ? aVar16 : null;
        com.avito.android.mortgage_calculator.internal.S0 s02 = (com.avito.android.mortgage_calculator.internal.S0) this.f71415S4.getValue();
        com.avito.android.advert.item.neighboring_dates.d dVar3 = this.f71393M4;
        com.avito.android.advert.item.neighboring_dates.d dVar4 = dVar3 != null ? dVar3 : null;
        com.avito.android.util.O0 o03 = this.f71399O4;
        com.avito.android.util.O0 o04 = o03 != null ? o03 : null;
        com.avito.android.util.bottom_gap.e eVar5 = this.f71403P4;
        com.avito.android.util.bottom_gap.e eVar6 = eVar5 != null ? eVar5 : null;
        com.avito.android.util.bottom_gap.c cVar17 = this.f71407Q4;
        com.avito.android.util.bottom_gap.c cVar18 = cVar17 != null ? cVar17 : null;
        com.avito.android.Z0 z04 = this.f71504o5;
        com.avito.android.Z0 z05 = z04 != null ? z04 : null;
        com.avito.android.advert_details_items.sellerprofile.a0 a0Var = this.f71440Y4;
        com.avito.android.favorite_apprater.g gVar6 = gVar3;
        if (a0Var == null) {
            a0Var = null;
        }
        com.avito.android.advert_details_items.sellerprofile.a0 a0Var2 = a0Var;
        com.avito.android.advert.item.neighboring_dates.d dVar5 = dVar4;
        com.avito.android.util.bottom_gap.e eVar7 = eVar6;
        com.avito.android.util.bottom_gap.c cVar19 = cVar18;
        InterfaceC28280j interfaceC28280j3 = interfaceC28280j2;
        InterfaceC28130g0 interfaceC28130g04 = interfaceC28130g03;
        com.avito.android.advert.item.sellersubscription.p pVar3 = pVar2;
        com.avito.android.advert.viewed.f fVar7 = fVar2;
        com.avito.android.section.action.b bVar13 = bVar2;
        final I1 i12 = new I1(view, cVar2, lVar2, z03, interfaceC50074a2, r03, this, cVar4, gVar2, nVar2, fVar7, bVar13, s12, pVar3, interfaceC28130g04, l43, interfaceC28280j3, interfaceC28265d2, bVar4, aVar2, lVar4, interfaceC28243x2, interfaceC14698b2, iVar2, cVar6, cVar8, cVar10, cVar16, interfaceC13437a2, viewLifecycleOwner2, h1Var2, cVar13, y03, aVar4, c14700d2, l03, jVar2, bVar6, bVar8, cVar15, gVar6, n14, eVar2, bVar10, interfaceC39709b2, interfaceC27811a2, fVar4, dVar2, aVar6, aVar8, fVar6, aVar10, eVar4, c27814a2E5, this, dVar5, gVar5, this.f71508p5, aVar12, aVar13, aVar15, bVar12, c29640d2, z12, o04, aVar17, s02, eVar7, cVar19, z05, a0Var2);
        Z0 z06 = i12.f71702e;
        interfaceC28130g04.m(z06);
        gVar2.m(z06);
        interfaceC28280j3.m(z06);
        bVar13.K2(interfaceC28130g04);
        i12.f71751y.V5(z06);
        i12.f71753z.d6(z06);
        i12.f71639A.J5(z06);
        i12.f71641B.V5(z06);
        cVar16.v6(z06);
        i12.f71743u.d(i12);
        com.avito.android.advert.item.anchor_trust_factors.l lVar5 = i12.f71745v;
        lVar5.d(i12);
        lVar5.j0(z06);
        nVar2.s4(i12);
        fVar7.d(i12);
        gVar6.a(i12);
        pVar3.k(i12);
        pVar3.m(z06);
        i12.f71729n.k(i12);
        i12.f71675S.k(i12);
        i12.f71677T.z5(z06);
        eVar4.t5(z06);
        dVar5.k(i12);
        a0Var2.k(i12);
        com.avito.android.util.bottom_gap.b bVar14 = new com.avito.android.util.bottom_gap.b(cVar19);
        eVar7.f318833a.add(bVar14);
        ArrayList arrayList = eVar7.f318834b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bVar14.a((View) it.next());
        }
        View viewFindViewById = i12.f71693b.findViewById(R.id.bottom_bar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        arrayList.add(viewFindViewById);
        Iterator it2 = eVar7.f318833a.iterator();
        while (it2.hasNext()) {
            ((e.a) it2.next()).a(viewFindViewById);
        }
        i12.f71692a1 = this.f71532v5;
        i12.f71701d1 = this.f71536w5;
        this.f71468f5 = i12;
        InterfaceC28265d interfaceC28265d3 = this.f71416T0;
        if (interfaceC28265d3 == null) {
            interfaceC28265d3 = null;
        }
        interfaceC28265d3.bb(i12);
        InterfaceC28173a interfaceC28173a = this.f71432X0;
        if (interfaceC28173a == null) {
            interfaceC28173a = null;
        }
        interfaceC28173a.k(i12);
        com.avito.android.advert.item.short_term_rent.str_buttons.c cVar20 = this.f71490l3;
        if (cVar20 == null) {
            cVar20 = null;
        }
        cVar20.q1();
        com.avito.android.advert.item.short_term_rent.item_discount.c cVar21 = this.f71494m3;
        if (cVar21 == null) {
            cVar21 = null;
        }
        cVar21.getClass();
        com.avito.android.advert.item.select.controls.g gVar7 = this.f71445a1;
        if (gVar7 == null) {
            gVar7 = null;
        }
        gVar7.b();
        com.avito.android.advert.item.mortgage_calculation.a aVar18 = this.f71465f1;
        if (aVar18 == null) {
            aVar18 = null;
        }
        aVar18.b();
        com.avito.android.advert.item.autoteka.teaser.a aVar19 = this.f71477i1;
        if (aVar19 == null) {
            aVar19 = null;
        }
        aVar19.b();
        com.avito.android.advert.item.service_booking.m mVar = this.f71380I3;
        if (mVar == null) {
            mVar = null;
        }
        mVar.i();
        com.avito.android.advert.item.service_order_request.n nVar3 = this.f71389L3;
        if (nVar3 == null) {
            nVar3 = null;
        }
        nVar3.i();
        com.avito.android.component.toast.util.c cVar22 = this.f71451b4;
        if (cVar22 == null) {
            cVar22 = null;
        }
        cVar22.b(i12);
        com.avito.android.subscriptions_settings.d dVar6 = new com.avito.android.subscriptions_settings.d(requireActivity(), null, 2, null);
        com.avito.android.advert.item.sellersubscription.p pVar4 = this.f71506p3;
        if (pVar4 == null) {
            pVar4 = null;
        }
        pVar4.e(dVar6);
        com.avito.android.component.toast.util.c cVar23 = this.f71451b4;
        if (cVar23 == null) {
            cVar23 = null;
        }
        cVar23.d(dVar6);
        com.avito.android.subscriptions_settings.d dVar7 = new com.avito.android.subscriptions_settings.d(requireActivity(), null, 2, null);
        com.avito.android.favorite_sellers.adapter.recommendation.h hVar = this.f71538x3;
        if (hVar == null) {
            hVar = null;
        }
        hVar.y7(dVar7);
        com.avito.android.serp.adapter.closable.c cVar24 = this.f71455c4;
        if (cVar24 == null) {
            cVar24 = null;
        }
        cVar24.a(i12);
        com.avito.android.component.toast.util.c cVar25 = this.f71451b4;
        if (cVar25 == null) {
            cVar25 = null;
        }
        cVar25.d(dVar7);
        this.f71516r5.b(new io.reactivex.rxjava3.internal.operators.observable.C(new io.reactivex.rxjava3.core.C() { // from class: com.avito.android.advert.item.m1
            @Override // io.reactivex.rxjava3.core.C
            public final void f(io.reactivex.rxjava3.core.B b12) {
                final G1 g12 = new G1(b12);
                final I1 i13 = i12;
                i13.f71750x0.o(g12);
                b12.f(new l41.f() { // from class: com.avito.android.advert.item.k1
                    @Override // l41.f
                    public final void cancel() {
                        i13.f71750x0.v0(g12);
                    }
                });
            }
        }).t0(new m()));
        com.avito.android.advert.item.similars.a aVar20 = this.f71527u4;
        if (aVar20 == null) {
            aVar20 = null;
        }
        aVar20.k(i12);
        com.avito.android.credits.q qVar = this.f71421U2;
        if (qVar == null) {
            qVar = null;
        }
        qVar.M();
        com.avito.android.advert.item.creditinfo.buzzoola.v vVar = this.f71464e5;
        if (vVar == null) {
            vVar = null;
        }
        vVar.f74993N.observe(getViewLifecycleOwner(), new O.a(new com.avito.android.advert.item.B(this)));
        com.avito.android.advert.item.creditinfo.buzzoola.v vVar2 = this.f71464e5;
        if (vVar2 == null) {
            vVar2 = null;
        }
        vVar2.f74994O.observe(getViewLifecycleOwner(), new O.a(new com.avito.android.advert.item.C(this)));
        int integer = getResources().getInteger(android.R.integer.config_shortAnimTime);
        io.reactivex.rxjava3.internal.observers.y yVar = this.f71528u5;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f71528u5 = (io.reactivex.rxjava3.internal.observers.y) K2.h(requireActivity()).y(integer, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b).j0(io.reactivex.rxjava3.android.schedulers.b.b()).v0(new com.avito.android.advert.item.D(this), com.avito.android.advert.item.E.f71613b, io.reactivex.rxjava3.internal.functions.a.f401993c);
        InterfaceC28111q interfaceC28111q = this.f71478i3;
        if (interfaceC28111q == null) {
            interfaceC28111q = null;
        }
        interfaceC28111q.M();
        com.avito.android.advert.item.consultation.secondary.c cVar26 = this.f71474h3;
        if (cVar26 == null) {
            cVar26 = null;
        }
        cVar26.M();
        InterfaceC28130g0 interfaceC28130g05 = this.f71529v0;
        if (interfaceC28130g05 == null) {
            interfaceC28130g05 = null;
        }
        com.avito.android.advert.item.creditinfo.buzzoola.v vVar3 = this.f71464e5;
        if (vVar3 == null) {
            vVar3 = null;
        }
        interfaceC28130g05.i3(vVar3);
        com.avito.android.advert.item.short_term_rent.str_buttons.c cVar27 = this.f71490l3;
        if (cVar27 == null) {
            cVar27 = null;
        }
        cVar27.i();
        com.avito.android.advert.item.short_term_rent.item_discount.c cVar28 = this.f71494m3;
        if (cVar28 == null) {
            cVar28 = null;
        }
        cVar28.i();
        com.avito.android.advert.item.consultation.J j12 = this.f71466f3;
        if (j12 == null) {
            j12 = null;
        }
        j12.i();
        com.avito.android.advert.item.hotel.hotel_offer.konveyor.main.c cVar29 = this.f71426V3;
        if (cVar29 == null) {
            cVar29 = null;
        }
        cVar29.i();
        com.avito.android.advert.item.short_term_rent.payment_toggles.h hVar2 = this.f71430W3;
        if (hVar2 == null) {
            hVar2 = null;
        }
        hVar2.i();
        com.avito.android.advert.item.hotel.hotel_offer.j jVar3 = this.f71435X3;
        if (jVar3 == null) {
            jVar3 = null;
        }
        jVar3.i();
        C28144l c28144l = this.f71427V4;
        if (c28144l == null) {
            c28144l = null;
        }
        c28144l.a(view, this);
        com.avito.android.advert.item.compatibility.v4.f fVar8 = this.f71377H3;
        if (fVar8 == null) {
            fVar8 = null;
        }
        fVar8.q();
        com.avito.android.advert_favorites_toast.a aVar21 = this.f71444Z4;
        if (aVar21 == null) {
            aVar21 = null;
        }
        aVar21.b(view);
        com.avito.android.pinch_to_zoom.b bVar15 = this.f71384J4;
        if (bVar15 == null) {
            bVar15 = null;
        }
        bVar15.h((ViewGroup) requireActivity().getWindow().getDecorView());
        A7.b bVar16 = this.f71434X2;
        if (bVar16 == null) {
            bVar16 = null;
        }
        bVar16.d();
        gj.n nVar4 = this.f71495m4;
        if (nVar4 == null) {
            nVar4 = null;
        }
        gj.k kVarA = gj.m.a(nVar4, this);
        com.avito.android.advert.item.beduin.k kVar = this.f71499n4;
        if (kVar == null) {
            kVar = null;
        }
        ((com.avito.android.beduin.view.c) kVarA).l(kVar.getF73241K());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [com.avito.android.advert.item.r] */
    /* JADX WARN: Type inference failed for: r0v36, types: [com.avito.android.advert.item.s] */
    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        Bundle bundleW5 = w5();
        Bundle arguments = getArguments();
        AdvertDetailsArguments advertDetailsArguments = arguments != null ? (AdvertDetailsArguments) arguments.getParcelable("advert_details_arguments") : null;
        if (advertDetailsArguments == null) {
            throw new IllegalArgumentException("AdvertDetailsArguments must be specified");
        }
        AdvertDetailsFastOpenParams advertDetailsFastOpenParams = advertDetailsArguments.f71315e;
        this.f71488k5 = advertDetailsFastOpenParams.f71332i;
        this.f71456c5 = advertDetailsArguments.f71312b;
        this.f71460d5 = advertDetailsArguments.f71313c;
        this.f71484j5 = advertDetailsArguments.f71314d;
        Bundle bundle2 = bundleW5 != null ? bundleW5.getBundle("section_presenter_state") : null;
        Kundle kundleA = bundleW5 != null ? com.avito.android.util.G.a(bundleW5, "domoteka_teaser_interactor_state") : null;
        Kundle kundleA2 = bundleW5 != null ? com.avito.android.util.G.a(bundleW5, "toolbar_presenter") : null;
        Kundle kundleA3 = bundleW5 != null ? com.avito.android.util.G.a(bundleW5, "recommendation_presenter_state") : null;
        Bundle bundle3 = bundleW5 != null ? bundleW5.getBundle("key_item_visibility_tracker_state") : null;
        Bundle bundle4 = bundleW5 != null ? bundleW5.getBundle("key_beduin_item_visibility_tracker_state") : null;
        Kundle kundle = bundleW5 != null ? (Kundle) bundleW5.getParcelable("commercial_state") : null;
        Kundle kundleA4 = bundleW5 != null ? com.avito.android.util.G.a(bundleW5, "broker_analytics_state") : null;
        Kundle kundleA5 = bundleW5 != null ? com.avito.android.util.G.a(bundleW5, "garage_compatibility_v2_saved_state") : null;
        Kundle kundleA6 = bundleW5 != null ? com.avito.android.util.G.a(bundleW5, "garage_compatibility_v3_saved_state") : null;
        Kundle kundleA7 = bundleW5 != null ? com.avito.android.util.G.a(bundleW5, "garage_compatibility_v4_saved_state") : null;
        Kundle kundleA8 = bundleW5 != null ? com.avito.android.util.G.a(bundleW5, "auto_select_advantages_v2_state") : null;
        Kundle kundle2 = kundleA4;
        Kundle kundleA9 = bundleW5 != null ? com.avito.android.util.G.a(bundleW5, "icebreakers_state") : null;
        Kundle kundleA10 = bundleW5 != null ? com.avito.android.util.G.a(bundleW5, "icebreakers_redesign_state") : null;
        Kundle kundleA11 = bundleW5 != null ? com.avito.android.util.G.a(bundleW5, "realty_usp_state") : null;
        Kundle kundleA12 = bundleW5 != null ? com.avito.android.util.G.a(bundleW5, "pp_recall_state") : null;
        Kundle kundleA13 = bundleW5 != null ? com.avito.android.util.G.a(bundleW5, "deal_confirmation_saved_state") : null;
        Kundle kundle3 = kundleA3;
        Kundle kundle4 = bundleW5 != null ? (Kundle) bundleW5.getParcelable("disclaimer_saved_state") : null;
        Kundle kundleA14 = bundleW5 != null ? com.avito.android.util.G.a(bundleW5, "auto_select_presenter_state") : null;
        Kundle kundleA15 = bundleW5 != null ? com.avito.android.util.G.a(bundleW5, "auto_select_no_click_contact_presenter_state") : null;
        Kundle kundleA16 = bundleW5 != null ? com.avito.android.util.G.a(bundleW5, "auto_select_parameters_v3_presenter_state") : null;
        Kundle kundleA17 = bundleW5 != null ? com.avito.android.util.G.a(bundleW5, "images_with_links_state") : null;
        Kundle kundle5 = kundleA8;
        Kundle kundleA18 = bundleW5 != null ? com.avito.android.util.G.a(bundleW5, "constructor_advert_state") : null;
        Kundle kundleA19 = bundleW5 != null ? com.avito.android.util.G.a(bundleW5, "properties_dialog_state") : null;
        Bundle bundle5 = bundleW5 != null ? bundleW5.getBundle("presenter") : null;
        TreeClickStreamParent treeClickStreamParent = advertDetailsArguments.f71316f;
        this.f71548z5 = treeClickStreamParent;
        this.f71355A5 = kundleA13;
        Bundle bundle6 = bundle5;
        com.avito.android.analytics.screens.r rVarC = com.avito.android.analytics.screens.s.c(this);
        Kundle kundle6 = kundleA13;
        InterfaceC28481c interfaceC28481cB = ((InterfaceC30106l7) C29972i.a(C29972i.b(this), InterfaceC30106l7.class)).b();
        Kundle kundle7 = kundleA7;
        Kundle kundle8 = kundleA6;
        AdvertScreen advertScreen = AdvertScreen.f90278d;
        com.avito.android.analytics.screens.tracker.F fA2 = interfaceC28481cB.a(new C28478k(advertScreen, rVarC, null, 4, null));
        com.avito.android.analytics.screens.D.f90335a.getClass();
        com.avito.android.analytics.screens.F fA3 = D.a.a();
        C27106d c27106d = new C27106d();
        com.avito.beduin.v2.engine.component.x xVar = new com.avito.beduin.v2.engine.component.x();
        cv.d dVarD = cv.c.d(this);
        Kundle kundle9 = kundleA5;
        r.a aVarA = com.avito.android.advert.di.t0.a();
        Kundle kundle10 = kundleA2;
        aVarA.g0((InterfaceC27709s) C29972i.a(C29972i.b(this), InterfaceC27709s.class));
        aVarA.l((InterfaceC30106l7) C29972i.a(C29972i.b(this), InterfaceC30106l7.class));
        aVarA.v(dVarD);
        aVarA.z(advertScreen);
        aVarA.d(requireActivity());
        aVarA.e(rVarC);
        String str = this.f71456c5;
        if (str == null) {
            str = null;
        }
        aVarA.r(str);
        aVarA.O(this.f71460d5);
        aVarA.n(this.f71484j5);
        aVarA.o0(advertDetailsFastOpenParams);
        aVarA.Z(advertDetailsArguments.f71321k);
        aVarA.E(advertDetailsArguments.f71324n);
        aVarA.H(advertDetailsArguments.f71319i);
        aVarA.J(advertDetailsArguments.f71322l);
        aVarA.D(advertDetailsArguments.f71317g);
        aVarA.K(advertDetailsArguments.f71318h);
        aVarA.b(getResources());
        aVarA.k0(this);
        aVarA.P(this);
        aVarA.G(bundle2);
        aVarA.a0(kundleA17);
        aVarA.d0(kundleA);
        aVarA.k(bundle3);
        aVarA.X(bundle4);
        aVarA.p(kundle);
        aVarA.j(new C44742f(true, null, new q(fA2, dVarD), 2, null));
        aVarA.n0(kundle10);
        aVarA.j0(kundle9);
        aVarA.F(kundle8);
        aVarA.W(kundle7);
        aVarA.I(kundle5);
        aVarA.i(kundle6);
        aVarA.C(treeClickStreamParent);
        aVarA.l0(kundle3);
        aVarA.Y(kundle2);
        aVarA.m0(kundleA9);
        aVarA.A(kundleA10);
        aVarA.h0(kundleA11);
        aVarA.T(kundleA12);
        aVarA.x(kundle4);
        aVarA.R(kundleA14);
        aVarA.Q(kundleA15);
        aVarA.b0(kundleA16);
        aVarA.i0(kundleA19);
        SubscriptionSource subscriptionSource = SubscriptionSource.f90035c;
        aVarA.e0();
        BannerPageSource bannerPageSource = BannerPageSource.f87777c;
        aVarA.s();
        aVarA.g(getF42820b());
        aVarA.V(advertDetailsArguments.f71320j);
        aVarA.m(kundleA18);
        aVarA.h(fA2);
        aVarA.S(new r());
        aVarA.q(bundle6);
        aVarA.U(new s());
        aVarA.t(new C31138n0(D5(fA2, this.f71508p5, dVarD, xVar, c27106d)));
        aVarA.L(new com.avito.android.advert_core.price_list.dialog.f() { // from class: com.avito.android.advert.item.r
            @Override // com.avito.android.advert_core.price_list.dialog.f
            public final void a(String str2, ImvServices imvServices) {
                Z0 z02 = this.f78294a.f71472g5;
                if (z02 == null) {
                    z02 = null;
                }
                z02.n(str2, imvServices);
            }
        });
        aVarA.w(new t());
        aVarA.M(u.f71580l);
        aVarA.N(new v());
        aVarA.u(new C41343c(xVar, c27106d));
        aVarA.B(new InterfaceC41342b() { // from class: com.avito.android.advert.item.s
            @Override // iT.InterfaceC41342b
            public final InterfaceC41341a invoke() {
                AdvertDetailsFragment.C27803a c27803a = AdvertDetailsFragment.f71351B5;
                return this.f78719a.E5();
            }
        });
        aVarA.y(new C35838l3(v5()));
        aVarA.c0(new o());
        aVarA.f0(new p());
        aVarA.build().a(this);
        A7.b bVar = this.f71434X2;
        if (bVar == null) {
            bVar = null;
        }
        bVar.a(fA3.b());
        A7.b bVar2 = this.f71434X2;
        if (bVar2 == null) {
            bVar2 = null;
        }
        bVar2.c(this, g5());
        this.f71492l5 = !v5() ? com.avito.android.advert.advert_details_style.c.a(advertDetailsFastOpenParams.f71332i).f68640i ? advertDetailsFastOpenParams.f71337n : null : null;
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment
    @Y61.k
    /* renamed from: s5, reason: from getter */
    public final NavigationState getF229006I0() {
        return this.f71540x5;
    }

    @Override // gj.i
    public final void t0() {
        i0();
    }

    @Override // com.avito.beduin.v2.interaction.detached.flow.b
    @Y61.k
    public final HV0.b y2(@Y61.k Y41.a aVar, @Y61.k com.avito.beduin.v2.engine.D d12, @Y61.k BottomSheetContentPaddings bottomSheetContentPaddings, @Y61.k BottomSheetHeight bottomSheetHeight, @Y61.k BottomSheetModalSize bottomSheetModalSize, @Y61.l LinkedHashMap linkedHashMap) {
        cU.s sVarIv;
        I1 i12 = this.f71468f5;
        if (i12 == null || (sVarIv = i12.Iv()) == null) {
            return new C28156p(0);
        }
        BaseBeduinHostFragment.DetachedBottomSheet.f104752l0.getClass();
        BaseBeduinHostFragment.DetachedBottomSheet detachedBottomSheetA = BaseBeduinHostFragment.DetachedBottomSheet.a.a(sVarIv, d12, bottomSheetHeight, bottomSheetContentPaddings, linkedHashMap, aVar);
        detachedBottomSheetA.show(getParentFragmentManager(), "bottom-sheet");
        return new C28209t(detachedBottomSheetA, 1);
    }

    @Override // FV0.c
    public final Fragment j1() {
        return this;
    }

    @Override // com.avito.android.select.p
    public final void q(@Y61.k String str) {
    }

    @Override // com.avito.android.select.p
    public final void s3(@Y61.k String str) {
    }

    @Override // com.avito.android.select.p
    public final void j(@Y61.k String str, @Y61.l String str2, @Y61.k List list) {
    }
}
