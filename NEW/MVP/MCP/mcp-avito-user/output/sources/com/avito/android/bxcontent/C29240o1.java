package com.avito.android.bxcontent;

import Al.C13048a;
import Aw0.InterfaceC13094a;
import Bl.C13159a;
import Dl.C13410a;
import Fl.C13814a;
import Gl.C13894a;
import HV.a;
import Hl.C14001a;
import Hr.InterfaceC14024a;
import KV.a;
import LV.c;
import Tr0.C15400a;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.app.l;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.C22771k;
import androidx.core.view.C22823h0;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.view.C22981N;
import androidx.view.InterfaceC22983P;
import as0.C24170a;
import cE.C27025b;
import cU.s;
import cU0.InterfaceC27108f;
import com.adjust.sdk.Constants;
import com.avito.android.C36135w2;
import com.avito.android.R;
import com.avito.android.ab_tests.configs.AutoFilterHintToastTestGroup;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.advertising.adapter.items.buzzoola.video.CommercialVideoStates;
import com.avito.android.advertising.loaders.BannerInfo;
import com.avito.android.advertising.loaders.avito_targeting.AvitoNetworkBanner;
import com.avito.android.advertising.loaders.beduin.container.a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.bottom_navigation.space.BottomNavigationSpace;
import com.avito.android.bxcontent.BxContentFragment;
import com.avito.android.bxcontent.beduin_v2.wrapper.cell.CellWrapper;
import com.avito.android.bxcontent.mvi.entity.C29126a;
import com.avito.android.bxcontent.mvi.entity.InterfaceC29127b;
import com.avito.android.bxcontent.mvi.entity.LoadState;
import com.avito.android.bxcontent.mvi.entity.q;
import com.avito.android.bxcontent.utils.BxContentBottomSheetBehavior;
import com.avito.android.component.snackbar.e;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.di.C29972i;
import com.avito.android.floating_views.FloatingViewsPresenter;
import com.avito.android.home.C30757a;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.inline_filters.InterfaceC30995b;
import com.avito.android.inline_filters.InterfaceC31046f;
import com.avito.android.inline_filters.dialog.InlineFilterDialogOpener;
import com.avito.android.inline_filters.dialog.InterfaceC30999b;
import com.avito.android.lib.deprecated_design.NetworkProblemView;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.header_button.HeaderButton;
import com.avito.android.lib.design.tab_bar.TabBarLayout;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.lib.design.toast_bar.state.ToastBarState;
import com.avito.android.lib.design.tooltip.r;
import com.avito.android.map_core.utils.IgnoreTopPaddingTouchScrollDirectionAwareRecyclerView;
import com.avito.android.onboarding_manager.OnboardingType;
import com.avito.android.paranja.ParanjaState;
import com.avito.android.paranja.f;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.progress_info_toast_bar.ProgressInfoToastBar;
import com.avito.android.progress_info_toast_bar.ProgressInfoToastBarData;
import com.avito.android.remote.model.BxContentBusiness360;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.NavigationBarStyle;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.additional_buttons.UniversalButton;
import com.avito.android.remote.model.metro_lines.MetroResponseBody;
import com.avito.android.remote.model.search.EntryPoint;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.HeaderSubtitle;
import com.avito.android.remote.model.search.Tab;
import com.avito.android.remote.model.search.TabsConfig;
import com.avito.android.remote.model.search.TopWidget;
import com.avito.android.remote.model.serp.Onboarding;
import com.avito.android.remote.model.serpomap_behavior.SwitchSerpMapButtonState;
import com.avito.android.remote.model.serpomap_behavior.SwitchSerpMapButtonType;
import com.avito.android.replace_main.exit_onboarding.ReplaceMainExitOnboarding;
import com.avito.android.saved_searches.analytics.SavedSearchEntryPointType;
import com.avito.android.serp.adapter.carousel_widget.C34696f;
import com.avito.android.serp.adapter.floating_promo_widget.FloatingPromoWidgetItem;
import com.avito.android.serp.adapter.skeleton.ScrollUnpredictiveGridLayoutManager;
import com.avito.android.serp.adapter.witcher.C34897p;
import com.avito.android.shortcut_navigation_bar.C34985b;
import com.avito.android.shortcut_navigation_bar.C34999p;
import com.avito.android.shortcut_navigation_bar.InlineActions;
import com.avito.android.shortcut_navigation_bar.InterfaceC34996m;
import com.avito.android.shortcut_navigation_bar.PinnedItem;
import com.avito.android.shortcut_navigation_bar.adapter.SectionTagPayload;
import com.avito.android.shortcut_navigation_bar.adapter.ShortcutNavigationItem;
import com.avito.android.shortcut_navigation_bar.analytics.InlineFiltersGeo;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.C35976x4;
import com.avito.android.util.D6;
import com.avito.android.util.N6;
import com.avito.android.util.p6;
import com.avito.android.util.q6;
import com.avito.android.util.y6;
import com.avito.beduin.v2.render.android_view.BeduinView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import com.google.android.material.appbar.AppBarLayout;
import dU0.InterfaceC39628a;
import fY.InterfaceC40372a;
import iR.C41336a;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import iw.C42120a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.AbstractC40048c;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42754k;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.d2;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;
import lD.C43617a;
import lE.C43624b;
import nI.InterfaceC44259a;
import ob.C44747k;
import ws0.C49679a;
import yl.C50262a;
import zo0.C50601c;
import zo0.InterfaceC50600b;

/* compiled from: BxContentView.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b:\u0001\t¨\u0006\n"}, d2 = {"Lcom/avito/android/bxcontent/o1;", "Lcom/avito/android/bxcontent/Y0;", "Lcom/avito/android/shortcut_navigation_bar/m;", "Lcom/avito/android/async_phone/o;", "Lcom/avito/android/favorite_apprater/k;", "Lcom/avito/android/subscriptions_settings/a;", "Lcom/avito/android/inline_filters/dialog/InlineFilterDialogOpener;", "Lzo0/b;", "Lcom/avito/android/advertising/kebab/a;", "a", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.bxcontent.o1, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29240o1 implements Y0, InterfaceC34996m, com.avito.android.async_phone.o, com.avito.android.favorite_apprater.k, com.avito.android.subscriptions_settings.a, InlineFilterDialogOpener, InterfaceC50600b, com.avito.android.advertising.kebab.a {

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22983P f112653A;

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public final String f112654A0;

    /* renamed from: B, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.floating_views.f f112655B;

    /* renamed from: B0, reason: collision with root package name */
    public final int f112656B0;

    /* renamed from: C, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.pinch_to_zoom.b f112657C;

    /* renamed from: C0, reason: collision with root package name */
    public final int f112658C0;

    /* renamed from: D, reason: collision with root package name */
    @Y61.k
    public final C36135w2 f112659D;

    /* renamed from: D0, reason: collision with root package name */
    @Y61.k
    public final ColorStateList f112660D0;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final C43617a f112661E;

    /* renamed from: E0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f112662E0;

    /* renamed from: F, reason: collision with root package name */
    public final /* synthetic */ C34999p f112663F;

    /* renamed from: F0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f112664F0;

    /* renamed from: G, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.async_phone.s f112665G;

    /* renamed from: G0, reason: collision with root package name */
    public final int f112666G0;

    /* renamed from: H, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.favorite_apprater.l f112667H;

    /* renamed from: H0, reason: collision with root package name */
    @Y61.l
    public final BxContentBottomSheetBehavior<FrameLayout> f112668H0;

    /* renamed from: I, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.subscriptions_settings.d f112669I;

    /* renamed from: I0, reason: collision with root package name */
    @Y61.l
    public a f112670I0;

    /* renamed from: J, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.inline_filters.dialog.j f112671J;

    /* renamed from: J0, reason: collision with root package name */
    @Y61.k
    public final C13894a f112672J0;

    /* renamed from: K, reason: collision with root package name */
    public final /* synthetic */ C50601c f112673K;

    /* renamed from: K0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.vertical_main.vertical_filter.s f112674K0;

    /* renamed from: L, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.advertising.kebab.d f112675L;

    /* renamed from: L0, reason: collision with root package name */
    @Y61.k
    public final C13159a f112676L0;

    /* renamed from: M, reason: collision with root package name */
    public final Context f112677M;

    /* renamed from: M0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.vertical_main.featured.header.d f112678M0;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final androidx.appcompat.view.d f112679N;

    /* renamed from: N0, reason: collision with root package name */
    @Y61.k
    public final C30757a f112680N0;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final IgnoreTopPaddingTouchScrollDirectionAwareRecyclerView f112681O;

    /* renamed from: O0, reason: collision with root package name */
    public final int f112682O0;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final BeduinView f112683P;

    /* renamed from: P0, reason: collision with root package name */
    public final int f112684P0;

    /* renamed from: Q, reason: collision with root package name */
    public final View f112685Q;

    /* renamed from: Q0, reason: collision with root package name */
    public final int f112686Q0;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final DN.b f112687R;

    /* renamed from: R0, reason: collision with root package name */
    public final int f112688R0;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final PN.b f112689S;

    /* renamed from: S0, reason: collision with root package name */
    @Y61.k
    public final AppBarLayout f112690S0;

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public final ScrollUnpredictiveGridLayoutManager f112691T;

    /* renamed from: T0, reason: collision with root package name */
    public boolean f112692T0;

    /* renamed from: U, reason: collision with root package name */
    @Y61.k
    public final e2 f112693U;

    /* renamed from: U0, reason: collision with root package name */
    public boolean f112694U0;

    /* renamed from: V, reason: collision with root package name */
    @Y61.l
    public androidx.appcompat.app.l f112695V;

    /* renamed from: V0, reason: collision with root package name */
    public boolean f112696V0;

    /* renamed from: W, reason: collision with root package name */
    @Y61.l
    public ProgressInfoToastBar f112697W;

    /* renamed from: W0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.bxcontent.beduin_v2.wrapper.c f112698W0;

    /* renamed from: X, reason: collision with root package name */
    @Y61.l
    public com.avito.android.replace_main.toast.a f112699X;

    /* renamed from: X0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.bxcontent.beduin_v2.wrapper.cell.b f112700X0;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.floating_views.h f112701Y;

    /* renamed from: Y0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.snippet.video.l f112702Y0;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final View f112703Z;

    /* renamed from: Z0, reason: collision with root package name */
    @Y61.l
    public a.C2610a f112704Z0;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f112705a0;

    /* renamed from: a1, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.bxcontent.vertical_toolbar.vertical_filter_toolbar.j f112706a1;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f112707b;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public final Button f112708b0;

    /* renamed from: b1, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.bxcontent.vertical_toolbar.vertical_mini_search_toolbar.k f112709b1;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.item_visibility_tracker.b f112710c;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.progress_overlay.l f112711c0;

    /* renamed from: c1, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.bxcontent.vertical_toolbar.category_filter_toolbar.p f112712c1;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.bx_beduin_native_items.c f112713d;

    /* renamed from: d0, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.progress_overlay.l f112714d0;

    /* renamed from: d1, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.bxcontent.search_bar_promo_widget.l f112715d1;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.scroll_tracker.d f112716e;

    /* renamed from: e0, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.progress_overlay.l f112717e0;

    /* renamed from: e1, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.hero_banner.widget.l f112718e1;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.scroll_tracker.i f112719f;

    /* renamed from: f0, reason: collision with root package name */
    @Y61.l
    public final ViewGroup f112720f0;

    /* renamed from: f1, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.bxcontent.vertical_toolbar.transportation_services_toolbar.i f112721f1;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC29247r0 f112722g;

    /* renamed from: g0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.scroll_tracker.b f112723g0;

    /* renamed from: g1, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.floating_promo_widget.l f112724g1;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Ax.e f112725h;

    /* renamed from: h0, reason: collision with root package name */
    @Y61.k
    public final N6 f112726h0;

    /* renamed from: h1, reason: collision with root package name */
    @Y61.k
    public final ViewOnLayoutChangeListenerC29246q1 f112727h1;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.saved_searches.analytics.c f112728i;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.scroll_tracker.h f112729i0;

    /* renamed from: i1, reason: collision with root package name */
    @Y61.k
    public final z1 f112730i1;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40372a f112731j;

    /* renamed from: j0, reason: collision with root package name */
    @Y61.l
    public C49679a f112732j0;

    /* renamed from: j1, reason: collision with root package name */
    @Y61.l
    public O1 f112733j1;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final PresentationType f112734k;

    /* renamed from: k0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.floating_views.h f112735k0;

    /* renamed from: k1, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f112736k1;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final ProgressInfoToastBar.a f112737l;

    /* renamed from: l0, reason: collision with root package name */
    public final int f112738l0;

    /* renamed from: l1, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.home.z f112739l1;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.onboarding_manager.e f112740m;

    /* renamed from: m0, reason: collision with root package name */
    public final int f112741m0;

    /* renamed from: m1, reason: collision with root package name */
    @Y61.k
    public final C29254t1 f112742m1;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.onboarding_manager.f f112743n;

    /* renamed from: n0, reason: collision with root package name */
    public final int f112744n0;

    /* renamed from: n1, reason: collision with root package name */
    @Y61.l
    public com.avito.android.bxcontent.scroll_listener.b f112745n1;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.bxcontent.serp.a f112746o;

    /* renamed from: o0, reason: collision with root package name */
    public final int f112747o0;

    /* renamed from: o1, reason: collision with root package name */
    @Y61.k
    public final C29243p1 f112748o1;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.bxcontent.analytics.g f112749p;

    /* renamed from: p0, reason: collision with root package name */
    public final int f112750p0;

    /* renamed from: p1, reason: collision with root package name */
    @Y61.l
    public cU.s f112751p1;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.bxcontent.beduin_v2.di.a f112752q;

    /* renamed from: q0, reason: collision with root package name */
    public final int f112753q0;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.bxcontent.utils.d f112754r;

    /* renamed from: r0, reason: collision with root package name */
    public final int f112755r0;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final u3.l<SimpleTestGroupWithNone> f112756s;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public final SwipeRefreshLayout f112757s0;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final u3.l<AutoFilterHintToastTestGroup> f112758t;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final FrameLayout f112759t0;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final aU0.b f112760u;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.bxcontent.utils.h f112761u0;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.engine.component.z f112762v;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final CoordinatorLayout f112763v0;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27108f f112764w;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final HeaderButton f112765w0;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final Y41.a<View> f112766x;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.l
    public final FrameLayout f112767x0;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.replace_main.toast.b f112768y;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.l
    public final Button f112769y0;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.ui.adapter.h<com.avito.konveyor.adapter.b> f112770z;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public final String f112771z0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BxContentView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/o1$a;", "", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.o1$a */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f112772b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f112773c;

        /* renamed from: d, reason: collision with root package name */
        public static final a f112774d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ a[] f112775e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f112776f;

        static {
            a aVar = new a("UNIVERSAL_BUTTON", 0);
            f112772b = aVar;
            a aVar2 = new a("FLOATING_PROMO_WIDGET", 1);
            f112773c = aVar2;
            a aVar3 = new a("BOTTOM_ENTRY_POINT", 2);
            f112774d = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            f112775e = aVarArr;
            f112776f = kotlin.enums.c.a(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f112775e.clone();
        }
    }

    /* compiled from: BxContentView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.o1$b */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f112777a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f112778b;

        static {
            int[] iArr = new int[PresentationType.values().length];
            try {
                iArr[PresentationType.MAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f112777a = iArr;
            int[] iArr2 = new int[SwitchSerpMapButtonType.values().length];
            try {
                iArr2[SwitchSerpMapButtonType.SERP.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[SwitchSerpMapButtonType.MAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            f112778b = iArr2;
            int[] iArr3 = new int[a.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a aVar = a.f112772b;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a aVar2 = a.f112772b;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: Views.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/util/I6", "Landroid/view/View$OnLayoutChangeListener;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.o1$c */
    public static final class c implements View.OnLayoutChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.N f112779b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f112780c;

        /* JADX WARN: Multi-variable type inference failed */
        public c(Y41.a aVar, View view) {
            this.f112779b = (kotlin.jvm.internal.N) aVar;
            this.f112780c = view;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(@Y61.l View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            this.f112779b.invoke();
            this.f112780c.removeOnLayoutChangeListener(this);
        }
    }

    /* compiled from: View.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"androidx/core/view/u0", "Landroid/view/View$OnLayoutChangeListener;", "core-ktx_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.o1$d */
    public static final class d implements View.OnLayoutChangeListener {
        public d() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            view.removeOnLayoutChangeListener(this);
            C29240o1.this.f112739l1.l();
        }
    }

    /* compiled from: BxContentView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/bxcontent/o1$e", "Landroidx/recyclerview/widget/RecyclerView$g;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.o1$e */
    public static final class e extends RecyclerView.g {
        public e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void b(int i12, int i13) {
            C29240o1 c29240o1 = C29240o1.this;
            c29240o1.f112681O.post(new RunnableC28965b1(c29240o1, 2));
            RecyclerView.Adapter adapter = c29240o1.f112681O.getAdapter();
            if (adapter != null) {
                adapter.unregisterAdapterDataObserver(this);
            }
        }
    }

    /* compiled from: BxContentView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.bxcontent.o1$f */
    public static final class f extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            C29240o1.this.f112693U.K5(InterfaceC29127b.Z.f112114a);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.bxcontent.o1$g */
    public static final class g extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ BxContentBusiness360.Toast f112785m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(BxContentBusiness360.Toast toast) {
            super(0);
            this.f112785m = toast;
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            C29240o1.this.f112693U.K5(new InterfaceC29127b.C29149l(this.f112785m));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.bxcontent.o1$h */
    public static final class h extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ BxContentBusiness360.Toast f112787m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(BxContentBusiness360.Toast toast) {
            super(0);
            this.f112787m = toast;
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            C29240o1.this.f112693U.K5(new InterfaceC29127b.C29151m(this.f112787m));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.bxcontent.o1$i */
    public static final class i extends kotlin.jvm.internal.N implements Y41.l<DeepLink, kotlin.G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ FloatingPromoWidgetItem f112789m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(FloatingPromoWidgetItem floatingPromoWidgetItem) {
            super(1);
            this.f112789m = floatingPromoWidgetItem;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(DeepLink deepLink) {
            DeepLink deepLink2 = deepLink;
            C29240o1 c29240o1 = C29240o1.this;
            c29240o1.f112693U.K5(new InterfaceC29127b.C29165y(this.f112789m.f269976b));
            c29240o1.f112693U.K5(new InterfaceC29127b.B(deepLink2, null, null, null, null, 30, null));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/paranja/ParanjaState$ClickPosition;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/paranja/ParanjaState$ClickPosition;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.bxcontent.o1$j */
    public static final class j extends kotlin.jvm.internal.N implements Y41.l<ParanjaState.ClickPosition, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<kotlin.G0> f112790l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ View f112791m;

        /* compiled from: BxContentView.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.bxcontent.o1$j$a */
        public /* synthetic */ class a {
            static {
                int[] iArr = new int[ParanjaState.ClickPosition.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    ParanjaState.ClickPosition clickPosition = ParanjaState.ClickPosition.f210848b;
                    iArr[4] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    ParanjaState.ClickPosition clickPosition2 = ParanjaState.ClickPosition.f210848b;
                    iArr[3] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    ParanjaState.ClickPosition clickPosition3 = ParanjaState.ClickPosition.f210848b;
                    iArr[1] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    ParanjaState.ClickPosition clickPosition4 = ParanjaState.ClickPosition.f210848b;
                    iArr[2] = 5;
                } catch (NoSuchFieldError unused5) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Y41.a<kotlin.G0> aVar, View view) {
            super(1);
            this.f112790l = aVar;
            this.f112791m = view;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x001d  */
        @Override // Y41.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(com.avito.android.paranja.ParanjaState.ClickPosition r3) {
            /*
                r2 = this;
                com.avito.android.paranja.ParanjaState$ClickPosition r3 = (com.avito.android.paranja.ParanjaState.ClickPosition) r3
                int r3 = r3.ordinal()
                Y41.a<kotlin.G0> r0 = r2.f112790l
                if (r3 == 0) goto L1d
                r1 = 1
                if (r3 == r1) goto L14
                r1 = 3
                if (r3 == r1) goto L1d
                r1 = 4
                if (r3 == r1) goto L1d
                goto L20
            L14:
                android.view.View r3 = r2.f112791m
                r3.performClick()
                r0.invoke()
                goto L20
            L1d:
                r0.invoke()
            L20:
                kotlin.G0 r3 = kotlin.G0.f406611a
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.bxcontent.C29240o1.j.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: BxContentView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.bxcontent.o1$k */
    public static final class k extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.paranja.h f112792l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.a<kotlin.G0> f112793m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(com.avito.android.paranja.h hVar, Y41.a<kotlin.G0> aVar) {
            super(0);
            this.f112792l = hVar;
            this.f112793m = aVar;
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            this.f112792l.setState(new ParanjaState(ParanjaState.State.f210856c, null, null, 6, null));
            this.f112793m.invoke();
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/paranja/ParanjaState$ClickPosition;", "clickPosition", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/paranja/ParanjaState$ClickPosition;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.bxcontent.o1$l */
    public static final class l extends kotlin.jvm.internal.N implements Y41.l<ParanjaState.ClickPosition, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.paranja.h f112794l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Boolean, kotlin.G0> f112795m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public l(com.avito.android.paranja.h hVar, Y41.l<? super Boolean, kotlin.G0> lVar) {
            super(1);
            this.f112794l = hVar;
            this.f112795m = lVar;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(ParanjaState.ClickPosition clickPosition) {
            ParanjaState.ClickPosition clickPosition2 = clickPosition;
            this.f112794l.setState(new ParanjaState(ParanjaState.State.f210856c, null, null, 6, null));
            this.f112795m.invoke(Boolean.valueOf(clickPosition2 == ParanjaState.ClickPosition.f210852f));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "buttonClicked", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.bxcontent.o1$m */
    public static final class m extends kotlin.jvm.internal.N implements Y41.l<Boolean, kotlin.G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ ReplaceMainExitOnboarding f112797m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f112798n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ReplaceMainExitOnboarding replaceMainExitOnboarding, String str) {
            super(1);
            this.f112797m = replaceMainExitOnboarding;
            this.f112798n = str;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Boolean bool) {
            C29240o1.this.f112693U.K5(new InterfaceC29127b.C29148k0(this.f112797m, this.f112798n, bool.booleanValue()));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.bxcontent.o1$n */
    public static final class n extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ BxContentBusiness360.ReplaceMain.ToastReplaceMain f112800m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(BxContentBusiness360.ReplaceMain.ToastReplaceMain toastReplaceMain) {
            super(0);
            this.f112800m = toastReplaceMain;
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            C29240o1.this.f112693U.K5(new InterfaceC29127b.C29152m0(this.f112800m));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.bxcontent.o1$o */
    public static final class o extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ BxContentBusiness360.ReplaceMain.ToastReplaceMain f112802m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(BxContentBusiness360.ReplaceMain.ToastReplaceMain toastReplaceMain) {
            super(0);
            this.f112802m = toastReplaceMain;
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            C29240o1.this.f112693U.K5(new InterfaceC29127b.C29154n0(this.f112802m));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.bxcontent.o1$p */
    public static final class p extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.bxcontent.mvi.entity.u f112803l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ C29240o1 f112804m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.bxcontent.analytics.a f112805n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f112806o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(com.avito.android.bxcontent.mvi.entity.u uVar, C29240o1 c29240o1, com.avito.android.bxcontent.analytics.a aVar, String str) {
            super(0);
            this.f112803l = uVar;
            this.f112804m = c29240o1;
            this.f112805n = aVar;
            this.f112806o = str;
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            com.avito.android.bxcontent.mvi.entity.u uVar = this.f112803l;
            if (uVar.f112431c) {
                C29240o1 c29240o1 = this.f112804m;
                e2 e2Var = c29240o1.f112693U;
                com.avito.android.bxcontent.analytics.a aVar = this.f112805n;
                String str = this.f112806o;
                e2Var.K5(new InterfaceC29127b.y0(uVar.f112429a, uVar.f112430b, new A1(aVar, str, c29240o1), new B1(aVar, str), new C1(aVar, str)));
                c29240o1.f112746o.b();
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.bxcontent.o1$q */
    public static final class q extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {
        public q() {
            super(0);
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            C29240o1.this.f112693U.K5(InterfaceC29127b.s0.f112171a);
            return kotlin.G0.f406611a;
        }
    }

    public C29240o1(@Y61.k View view, @Y61.k com.avito.konveyor.item_visibility_tracker.b bVar, @Y61.k com.avito.android.bx_beduin_native_items.c cVar, @Y61.k com.avito.android.scroll_tracker.d dVar, @Y61.k com.avito.android.scroll_tracker.i iVar, @Y61.k InterfaceC29247r0 interfaceC29247r0, @Y61.k Ax.e eVar, @Y61.k com.avito.android.saved_searches.analytics.c cVar2, @Y61.k FragmentManager fragmentManager, @Y61.k InterfaceC40372a interfaceC40372a, @Y61.k PresentationType presentationType, @Y61.k ProgressInfoToastBar.a aVar, @Y61.k com.avito.android.onboarding_manager.e eVar2, @Y61.k com.avito.android.onboarding_manager.f fVar, @Y61.k com.avito.android.bxcontent.serp.a aVar2, @Y61.k com.avito.android.bxcontent.analytics.g gVar, @Y61.k com.avito.android.bxcontent.beduin_v2.di.a aVar3, @Y61.k com.avito.android.bxcontent.utils.d dVar2, @Y61.k u3.l lVar, @Y61.k u3.l lVar2, @Y61.k aU0.b bVar2, @Y61.k com.avito.beduin.v2.engine.component.z zVar, @Y61.k InterfaceC27108f interfaceC27108f, @Y61.k Y41.a aVar4, @Y61.k com.avito.android.replace_main.toast.b bVar3, @Y61.k BxContentFragment bxContentFragment, @Y61.k com.avito.android.inline_filters.dialog.z zVar2, @Y61.k InterfaceC30999b interfaceC30999b, @Y61.k com.avito.android.select.i iVar2, @Y61.k com.avito.android.util.text.a aVar5, @Y61.k com.avito.android.ui.adapter.h hVar, @Y61.k InterfaceC22983P interfaceC22983P, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.onboarding_manager.a aVar6, @Y61.k GridLayoutManager.c cVar3, @Y61.k com.avito.android.floating_views.f fVar2, @Y61.k com.avito.konveyor.a aVar7, @Y61.k CommercialVideoStates commercialVideoStates, @Y61.k com.avito.android.video_snippets.g gVar2, @Y61.k com.avito.android.lib.beduin_v2.feature.item.b bVar4, @Y61.k Screen screen, @Y61.k InterfaceC13094a interfaceC13094a, @Y61.k com.avito.android.app_rater.a aVar8, @Y61.k InterfaceC44259a interfaceC44259a, @Y61.k com.avito.android.pinch_to_zoom.b bVar5, @Y61.k C36135w2 c36135w2, @Y61.k C43617a c43617a, boolean z12) throws Resources.NotFoundException {
        C34999p c34999p;
        View viewFindViewById;
        Button button;
        com.avito.android.home.z zVar3;
        C29254t1 c29254t1;
        int i12;
        C41981q0 c41981q0;
        InterfaceC43160i interfaceC43160iR;
        C29240o1 c29240o1 = this;
        c29240o1.f112707b = view;
        c29240o1.f112710c = bVar;
        c29240o1.f112713d = cVar;
        c29240o1.f112716e = dVar;
        c29240o1.f112719f = iVar;
        c29240o1.f112722g = interfaceC29247r0;
        c29240o1.f112725h = eVar;
        c29240o1.f112728i = cVar2;
        c29240o1.f112731j = interfaceC40372a;
        c29240o1.f112734k = presentationType;
        c29240o1.f112737l = aVar;
        c29240o1.f112740m = eVar2;
        c29240o1.f112743n = fVar;
        c29240o1.f112746o = aVar2;
        c29240o1.f112749p = gVar;
        c29240o1.f112752q = aVar3;
        c29240o1.f112754r = dVar2;
        c29240o1.f112756s = lVar;
        c29240o1.f112758t = lVar2;
        c29240o1.f112760u = bVar2;
        c29240o1.f112762v = zVar;
        c29240o1.f112764w = interfaceC27108f;
        c29240o1.f112766x = aVar4;
        c29240o1.f112768y = bVar3;
        c29240o1.f112770z = hVar;
        c29240o1.f112653A = interfaceC22983P;
        c29240o1.f112655B = fVar2;
        c29240o1.f112657C = bVar5;
        c29240o1.f112659D = c36135w2;
        c29240o1.f112661E = c43617a;
        if (z12) {
            View viewFindViewById2 = view.findViewById(R.id.global_shortcuts_scroll_layout);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
            c34999p = new C34985b(viewFindViewById2, aVar5, aVar6, fragmentManager, eVar2, fVar, null, bVar4, screen, gVar, interfaceC13094a, false, aVar4, view.findViewById(R.id.search_with_action_subtitle_tv), zVar, interfaceC27108f, c36135w2, 2112, null);
        } else {
            View viewFindViewById3 = view.findViewById(R.id.shortcuts_scroll_layout);
            if (viewFindViewById3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
            c34999p = new C34999p(viewFindViewById3, aVar5, aVar6, fragmentManager, eVar2, fVar, null, bVar4, screen, gVar, interfaceC13094a, false, aVar4, view.findViewById(R.id.search_with_action_subtitle_tv), zVar, interfaceC27108f, c36135w2, 2112, null);
        }
        c29240o1.f112663F = c34999p;
        c29240o1.f112665G = new com.avito.android.async_phone.s(view);
        c29240o1.f112667H = new com.avito.android.favorite_apprater.l(fragmentManager, aVar8);
        c29240o1.f112669I = new com.avito.android.subscriptions_settings.d(view.getContext(), null, 2, null);
        c29240o1.f112671J = new com.avito.android.inline_filters.dialog.j(bxContentFragment, fragmentManager, interfaceC30999b, zVar2, iVar2);
        c29240o1.f112673K = new C50601c(view);
        c29240o1.f112675L = new com.avito.android.advertising.kebab.d(view.getContext());
        Context context = c29240o1.f112707b.getContext();
        c29240o1.f112677M = context;
        androidx.appcompat.view.d dVar3 = new androidx.appcompat.view.d(c29240o1.f112707b.getContext(), R.style.Theme_DesignSystem_Re23);
        c29240o1.f112679N = dVar3;
        View viewFindViewById4 = c29240o1.f112707b.findViewById(R.id.recycler_view);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.map_core.utils.IgnoreTopPaddingTouchScrollDirectionAwareRecyclerView");
        }
        IgnoreTopPaddingTouchScrollDirectionAwareRecyclerView ignoreTopPaddingTouchScrollDirectionAwareRecyclerView = (IgnoreTopPaddingTouchScrollDirectionAwareRecyclerView) viewFindViewById4;
        if (presentationType.isMap()) {
            TabBarLayout.a.e(TabBarLayout.f180679h, ignoreTopPaddingTouchScrollDirectionAwareRecyclerView, 0, 3);
        }
        c29240o1.f112681O = ignoreTopPaddingTouchScrollDirectionAwareRecyclerView;
        View viewFindViewById5 = c29240o1.f112707b.findViewById(R.id.beduin_container);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.beduin.v2.render.android_view.BeduinView");
        }
        c29240o1.f112683P = (BeduinView) viewFindViewById5;
        c29240o1.f112685Q = z12 ? c29240o1.f112707b.findViewById(R.id.global_shortcuts_container) : c29240o1.f112707b.findViewById(R.id.shortcuts_container);
        c29240o1.f112687R = new DN.b(c29240o1.f112707b);
        c29240o1.f112689S = new PN.b(c29240o1.f112707b);
        ScrollUnpredictiveGridLayoutManager scrollUnpredictiveGridLayoutManager = new ScrollUnpredictiveGridLayoutManager(c29240o1.f112707b.getContext(), interfaceC40372a.getF395906b());
        c29240o1.f112691T = scrollUnpredictiveGridLayoutManager;
        c29240o1.f112693U = f2.b(0, 16, BufferOverflow.f410778c, 1);
        c29240o1.f112701Y = new com.avito.android.floating_views.h(fVar2, scrollUnpredictiveGridLayoutManager);
        if (z12) {
            viewFindViewById = c29240o1.f112707b.findViewById(R.id.global_shortcuts_scroll_layout);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
        } else {
            viewFindViewById = c29240o1.f112707b.findViewById(R.id.shortcuts_scroll_layout);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
        }
        c29240o1.f112703Z = viewFindViewById;
        View viewFindViewById6 = c29240o1.f112707b.findViewById(R.id.progress_overlay_container);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        c29240o1.f112705a0 = (ViewGroup) viewFindViewById6;
        View viewFindViewById7 = c29240o1.f112707b.findViewById(R.id.universal_button);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        c29240o1.f112708b0 = (Button) viewFindViewById7;
        c29240o1.f112723g0 = new com.avito.android.scroll_tracker.b(new C29248r1(c29240o1), ignoreTopPaddingTouchScrollDirectionAwareRecyclerView, scrollUnpredictiveGridLayoutManager, C22981N.a(interfaceC22983P.getLifecycle()));
        c29240o1.f112726h0 = new N6(scrollUnpredictiveGridLayoutManager);
        c29240o1.f112729i0 = new com.avito.android.scroll_tracker.h(scrollUnpredictiveGridLayoutManager, c29240o1.f112707b.getResources());
        c29240o1.f112738l0 = com.avito.android.actions_sheet.a.d(c29240o1.f112707b, R.dimen.redesign_toolbar_search_view_height);
        c29240o1.f112741m0 = com.avito.android.actions_sheet.a.d(c29240o1.f112707b, R.dimen.serp_top_padding);
        c29240o1.f112744n0 = c29240o1.f112707b.getResources().getDimensionPixelSize(R.dimen.pull_refresh_offset_start);
        c29240o1.f112747o0 = c29240o1.f112707b.getResources().getDimensionPixelSize(R.dimen.pull_refresh_offset_end);
        c29240o1.f112750p0 = com.avito.android.actions_sheet.a.d(c29240o1.f112707b, R.dimen.serp_default_bottom_padding);
        c29240o1.f112753q0 = com.avito.android.actions_sheet.a.d(c29240o1.f112707b, R.dimen.serp_bottom_entry_point_padding);
        c29240o1.f112755r0 = com.avito.android.actions_sheet.a.d(c29240o1.f112707b, R.dimen.serp_universal_button_padding);
        View viewFindViewById8 = c29240o1.f112707b.findViewById(R.id.pull_refresh_layout);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.swiperefreshlayout.widget.SwipeRefreshLayout");
        }
        c29240o1.f112757s0 = (SwipeRefreshLayout) viewFindViewById8;
        View viewFindViewById9 = c29240o1.f112707b.findViewById(R.id.bx_content_bottom_sheet);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        FrameLayout frameLayout = (FrameLayout) viewFindViewById9;
        c29240o1.f112759t0 = frameLayout;
        com.avito.android.bxcontent.utils.g.f113037a.getClass();
        c29240o1.f112761u0 = new com.avito.android.bxcontent.utils.h(frameLayout);
        View viewFindViewById10 = c29240o1.f112707b.findViewById(R.id.bx_content_feature_root);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout");
        }
        c29240o1.f112763v0 = (CoordinatorLayout) viewFindViewById10;
        View viewFindViewById11 = c29240o1.f112707b.findViewById(R.id.switch_serp_map_button);
        if (viewFindViewById11 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.header_button.HeaderButton");
        }
        HeaderButton headerButton = (HeaderButton) viewFindViewById11;
        c29240o1.f112765w0 = headerButton;
        c29240o1.f112767x0 = (FrameLayout) c29240o1.f112707b.findViewById(R.id.additional_buttons_container);
        c29240o1.f112769y0 = (Button) c29240o1.f112707b.findViewById(R.id.select_dates_button);
        c29240o1.f112771z0 = context.getString(R.string.switch_map_to_serp_button_title);
        c29240o1.f112654A0 = dVar3.getString(R.string.switch_serp_to_map_button_title);
        c29240o1.f112656B0 = C35835l0.j(R.attr.textIconList, dVar3);
        c29240o1.f112658C0 = C35835l0.j(R.attr.textIconMap, dVar3);
        c29240o1.f112660D0 = C35835l0.e(R.attr.gray4, dVar3);
        c29240o1.f112662E0 = C42727D.c(new C29257u1(c29240o1));
        c29240o1.f112664F0 = C42727D.c(new C29251s1(c29240o1));
        c29240o1.f112666G0 = context.getResources().getDimensionPixelSize(R.dimen.switch_serp_map_button_corner_radius);
        c29240o1.f112672J0 = new C13894a(c29240o1.f112707b.getResources(), aVar7);
        c29240o1.f112674K0 = new com.avito.android.serp.adapter.vertical_main.vertical_filter.s(c29240o1.f112707b.getResources(), aVar7);
        C13159a c13159a = new C13159a(c29240o1.f112707b.getResources(), aVar7);
        c29240o1.f112676L0 = c13159a;
        com.avito.android.serp.adapter.vertical_main.featured.header.d dVar4 = new com.avito.android.serp.adapter.vertical_main.featured.header.d(c29240o1.f112707b.getResources(), aVar7);
        c29240o1.f112678M0 = dVar4;
        C30757a c30757a = new C30757a(c29240o1.f112707b.getResources());
        c29240o1.f112680N0 = c30757a;
        c29240o1.f112682O0 = com.avito.android.actions_sheet.a.d(c29240o1.f112707b, R.dimen.shortcut_with_default_toolbar_top_padding);
        c29240o1.f112684P0 = com.avito.android.actions_sheet.a.d(c29240o1.f112707b, R.dimen.shortcut_with_logo_toolbar_top_padding);
        c29240o1.f112686Q0 = com.avito.android.actions_sheet.a.d(c29240o1.f112707b, R.dimen.shortcut_with_search_with_action_title_top_padding);
        c29240o1.f112688R0 = com.avito.android.actions_sheet.a.d(c29240o1.f112707b, R.dimen.redesign_toolbar_search_view_height_with_mini_menu);
        View viewFindViewById12 = c29240o1.f112707b.findViewById(R.id.bx_appbar);
        if (viewFindViewById12 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout");
        }
        c29240o1.f112690S0 = (AppBarLayout) viewFindViewById12;
        c29240o1.f112706a1 = new com.avito.android.bxcontent.vertical_toolbar.vertical_filter_toolbar.j(c29240o1.f112707b);
        c29240o1.f112709b1 = new com.avito.android.bxcontent.vertical_toolbar.vertical_mini_search_toolbar.k(c29240o1.f112707b);
        c29240o1.f112712c1 = new com.avito.android.bxcontent.vertical_toolbar.category_filter_toolbar.p(c29240o1.f112707b);
        c29240o1.f112715d1 = new com.avito.android.bxcontent.search_bar_promo_widget.l(c29240o1.f112707b);
        c29240o1.f112718e1 = interfaceC44259a.a(c29240o1.f112707b);
        c29240o1.f112721f1 = new com.avito.android.bxcontent.vertical_toolbar.transportation_services_toolbar.i(c29240o1.f112707b);
        c29240o1.f112724g1 = new com.avito.android.serp.adapter.floating_promo_widget.l(c29240o1.f112707b);
        c29240o1.f112727h1 = new ViewOnLayoutChangeListenerC29246q1(c29240o1);
        c29240o1.f112730i1 = new z1(c29240o1);
        c29240o1.f112736k1 = (ViewGroup) c29240o1.f112707b.findViewById(R.id.recs_reload_container);
        Button button2 = (Button) c29240o1.f112707b.findViewById(R.id.recs_reload_button);
        com.avito.android.home.z zVar4 = new com.avito.android.home.z(c29240o1.f112691T, c29240o1.f112756s);
        c29240o1.f112739l1 = zVar4;
        C29254t1 c29254t12 = new C29254t1(c29240o1);
        c29240o1.f112742m1 = c29254t12;
        C29243p1 c29243p1 = new C29243p1(c29240o1);
        c29240o1.f112748o1 = c29243p1;
        if (c29240o1.f112734k.isMap()) {
            BxContentBottomSheetBehavior<FrameLayout> bxContentBottomSheetBehavior = new BxContentBottomSheetBehavior<>(c29240o1.f112707b.getContext(), null);
            c29240o1.f112668H0 = bxContentBottomSheetBehavior;
            ViewGroup.LayoutParams layoutParams = c29240o1.f112759t0.getLayoutParams();
            CoordinatorLayout.g gVar3 = layoutParams instanceof CoordinatorLayout.g ? (CoordinatorLayout.g) layoutParams : null;
            if (gVar3 != null) {
                gVar3.b(bxContentBottomSheetBehavior);
            }
        }
        if (c29240o1.f112734k.isFullMap()) {
            c29240o1.f112732j0 = new C49679a(c29240o1.f112707b);
            c29240o1.f112681O.setIgnoreTopPaddingTouchEnabled(true);
            headerButton.setOnClickListener(new ViewOnClickListenerC29249s(c29240o1, 1));
            D6.H(c29240o1.f112707b.findViewById(R.id.search_map_progress_animated_overlay_container_stub));
            D6.H(c29240o1.f112707b.findViewById(R.id.search_map_progress_default_overlay_container_stub));
            ViewGroup viewGroup = (ViewGroup) c29240o1.f112707b.findViewById(R.id.animated_progress_overlay_container);
            c29240o1.f112720f0 = viewGroup;
            com.avito.android.progress_overlay.l lVar3 = new com.avito.android.progress_overlay.l((ViewGroup) c29240o1.f112707b.findViewById(R.id.search_map_progress_overlay_container), R.id.search_map_container, interfaceC28373a, 0, 0, 24, null);
            lVar3.k(null);
            c29240o1.f112714d0 = lVar3;
            c29240o1.f112717e0 = new com.avito.android.progress_overlay.l(viewGroup, 0, interfaceC28373a, R.layout.serp_animated_network_problem, 0, 18, null);
            c29240o1.f112761u0.a(c29240o1.f112681O);
        } else {
            c29240o1.f112732j0 = null;
            c29240o1.f112681O.setIgnoreTopPaddingTouchEnabled(false);
            headerButton.setOnClickListener(null);
            c29240o1.f112720f0 = null;
            c29240o1.f112714d0 = null;
            c29240o1.f112717e0 = null;
        }
        BxContentBottomSheetBehavior<FrameLayout> bxContentBottomSheetBehavior2 = c29240o1.f112668H0;
        if (bxContentBottomSheetBehavior2 != null) {
            if (c29240o1.f112734k.isMap()) {
                bxContentBottomSheetBehavior2.v(c29243p1);
                bxContentBottomSheetBehavior2.N(c29240o1.f112731j.e(C35835l0.g(c29240o1.f112707b.getContext()).y, true), false);
                bxContentBottomSheetBehavior2.M(true);
                bxContentBottomSheetBehavior2.f355974K = true;
                C22823h0.J(c29240o1.f112681O, true);
                c29240o1.f112757s0.setRefreshing(false);
                c29240o1.f112757s0.setEnabled(false);
                c29240o1.f112757s0.stopNestedScroll();
            } else {
                ViewGroup.LayoutParams layoutParams2 = c29240o1.f112759t0.getLayoutParams();
                CoordinatorLayout.g gVar4 = layoutParams2 instanceof CoordinatorLayout.g ? (CoordinatorLayout.g) layoutParams2 : null;
                if (gVar4 != null) {
                    gVar4.b(null);
                }
            }
            c29240o1.f112757s0.setNestedScrollingEnabled(false);
        }
        int iD2 = C35835l0.d(R.attr.white, c29240o1.f112707b.getContext());
        if (!c29240o1.f112734k.isMap()) {
            c29240o1.f112707b.setBackgroundColor(iD2);
        }
        c29240o1.f112663F.i(iD2);
        c29240o1.f112705a0.setBackgroundColor(iD2);
        com.avito.android.progress_overlay.l lVar4 = new com.avito.android.progress_overlay.l(c29240o1.f112705a0, R.id.recycler_view, interfaceC28373a, 0, iD2, 8, null);
        c29240o1.f112711c0 = lVar4;
        lVar4.f231600j = new C29098k1(c29240o1);
        com.avito.android.progress_overlay.l lVar5 = c29240o1.f112714d0;
        if (lVar5 != null) {
            lVar5.f231600j = new C29101l1(c29240o1);
            kotlin.G0 g02 = kotlin.G0.f406611a;
        }
        com.avito.android.progress_overlay.l lVar6 = c29240o1.f112717e0;
        if (lVar6 != null) {
            lVar6.f231600j = new C29104m1(c29240o1);
            kotlin.G0 g03 = kotlin.G0.f406611a;
        }
        if (!c29240o1.f112734k.isMap()) {
            lVar4.f231597g = true;
            View viewC = lVar4.c();
            if (viewC instanceof NetworkProblemView) {
                NetworkProblemView networkProblemView = (NetworkProblemView) viewC;
                networkProblemView.setPadding(networkProblemView.getPaddingLeft(), networkProblemView.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_default_height_material), networkProblemView.getPaddingRight(), networkProblemView.getPaddingBottom());
            }
        }
        c29240o1.f112681O.setLayoutManager(c29240o1.f112691T);
        c29240o1.f112681O.o(c29240o1.f112701Y);
        c29240o1.f112681O.o(c29240o1.f112723g0);
        c29240o1.f112681O.o(c29240o1.f112726h0);
        c29240o1.f112681O.o(c29240o1.f112729i0);
        if (c29240o1.f112734k.isMain() && c29240o1.f112756s.f439745a.f439749b.a()) {
            c29240o1.f112681O.o(zVar4);
        }
        c29240o1.f112681O.o(new C29237n1(c29240o1));
        C49679a c49679a = c29240o1.f112732j0;
        if (c49679a != null) {
            c29240o1.f112681O.o(c49679a);
            kotlin.G0 g04 = kotlin.G0.f406611a;
        }
        io.reactivex.rxjava3.subjects.e<kotlin.G0> eVar3 = c29240o1.f112729i0.f261720c;
        eVar3.getClass();
        com.avito.android.authorization.auto_recovery.phone_confirm.b.n(c29240o1.f112653A, new C43197r1(new C29080e1(c29240o1, null), new C29260v1(kotlinx.coroutines.rx3.y.a(new C41981q0(eVar3).n0(1000L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b)), c29240o1, gVar2, commercialVideoStates)));
        C49679a c49679a2 = c29240o1.f112732j0;
        if (c49679a2 != null && (c41981q0 = c49679a2.f441837f) != null && (interfaceC43160iR = C43175k.r(kotlinx.coroutines.rx3.y.a(c41981q0))) != null) {
            com.avito.android.authorization.auto_recovery.phone_confirm.b.n(c29240o1.f112653A, new C43197r1(new C29086g1(c29240o1, null), new w1(new C43197r1(new C29083f1(c29240o1, null), interfaceC43160iR))));
        }
        c29240o1.f112691T.f53667M = cVar3;
        if (c29240o1.f112734k.isMain()) {
            Resources resources = c29240o1.f112681O.getResources();
            com.avito.android.home.k kVar = new com.avito.android.home.k(resources, aVar7);
            IgnoreTopPaddingTouchScrollDirectionAwareRecyclerView ignoreTopPaddingTouchScrollDirectionAwareRecyclerView2 = c29240o1.f112681O;
            ignoreTopPaddingTouchScrollDirectionAwareRecyclerView2.l(kVar, -1);
            ignoreTopPaddingTouchScrollDirectionAwareRecyclerView2.l(new com.avito.android.serp.adapter.vertical_main.interactive_title_widget.e(resources, c29240o1.f112659D), -1);
            ignoreTopPaddingTouchScrollDirectionAwareRecyclerView2.l(new Ig.e(), -1);
            ignoreTopPaddingTouchScrollDirectionAwareRecyclerView2.l(c30757a, -1);
            ignoreTopPaddingTouchScrollDirectionAwareRecyclerView2.l(new I3.c(resources), -1);
            ignoreTopPaddingTouchScrollDirectionAwareRecyclerView2.l(new com.avito.android.serp.adapter.suggest_address.c(), -1);
            ignoreTopPaddingTouchScrollDirectionAwareRecyclerView2.l(new com.avito.android.serp.adapter.vertical_main.collectionsRecommendations.c(), -1);
            ignoreTopPaddingTouchScrollDirectionAwareRecyclerView2.l(new C24170a(), -1);
            ignoreTopPaddingTouchScrollDirectionAwareRecyclerView2.l(new com.avito.android.service_order_widget.item.e(), -1);
            ignoreTopPaddingTouchScrollDirectionAwareRecyclerView2.l(new com.avito.android.serp.adapter.vertical_main.top_sellers.c(), -1);
            ignoreTopPaddingTouchScrollDirectionAwareRecyclerView2.l(new com.avito.android.serp.adapter.top_sellers_serp.d(), -1);
            ignoreTopPaddingTouchScrollDirectionAwareRecyclerView2.l(new com.avito.android.serp.adapter.gig_shifts.c(), -1);
            ignoreTopPaddingTouchScrollDirectionAwareRecyclerView2.l(new com.avito.android.serp.adapter.model_card.f(), -1);
            ignoreTopPaddingTouchScrollDirectionAwareRecyclerView2.l(new com.avito.android.serp.adapter.mini_menu.d(), -1);
            button = button2;
            zVar3 = zVar4;
            c29254t1 = c29254t12;
            i12 = -1;
        } else {
            Resources resources2 = c29240o1.f112681O.getResources();
            button = button2;
            zVar3 = zVar4;
            c29254t1 = c29254t12;
            com.avito.android.bxcontent.utils.a aVar9 = new com.avito.android.bxcontent.utils.a(C42745f0.U(new C14001a(resources2, c29240o1.f112734k.isMap(), aVar7), new com.avito.android.serp.adapter.brandspace_widget.h(resources2, aVar7), dVar4, new com.avito.android.serp.adapter.vertical_main.featured.navigation.a(resources2, aVar7), new com.avito.android.serp.adapter.vertical_main.featured.action.e(resources2, aVar7), new com.avito.android.serp.adapter.vertical_main.usp_banner_widget.f(resources2, aVar7), new com.avito.android.serp.adapter.vertical_main.mall_shortcuts.g(resources2, aVar7), new com.avito.android.serp.adapter.filters_tabs_chips.h(resources2, aVar7), new com.avito.android.serp.adapter.sale.g(resources2, aVar7), new com.avito.android.serp.adapter.promo.g(resources2, aVar7), new com.avito.android.serp.adapter.replace_main_widget.h(resources2, aVar7), new com.avito.android.serp.adapter.vertical_main.avito_blog.h(resources2, aVar7), new C13814a(resources2, aVar7), new C13410a(resources2, aVar7), c29240o1.f112674K0, c13159a, new C34897p(resources2), new Ix0.e(resources2, aVar7), new com.avito.android.rubricator.items.category.d(resources2, aVar7), new com.avito.android.rubricator.items.service.c(resources2, aVar7), new com.avito.android.rubricator.items.linear_service.d(resources2, aVar7), new C15400a(resources2, aVar7), new com.avito.android.serp.adapter.actions_horizontal_block.d(resources2, aVar7), c29240o1.f112672J0, new C50262a(resources2, aVar7), new C34696f(resources2), new com.avito.android.serp.adapter.screen_map_banner.c(resources2, aVar7), new com.avito.android.serp.adapter.vertical_main.mini_search_widget.i(resources2, aVar7), new com.avito.android.serp.adapter.gallery.h(resources2, aVar7), new com.avito.android.serp.adapter.vertical_main.interactive_title_widget.e(resources2, c29240o1.f112659D), new Ig.e(), new com.avito.android.serp.adapter.attributed_header_widget.j(resources2, aVar7), new I3.c(resources2), new com.avito.android.serp.adapter.suggest_address.c(), new com.avito.android.serp.adapter.vertical_main.collectionsRecommendations.c(), new C24170a(), new com.avito.android.service_order_widget.item.e(), new com.avito.android.serp.adapter.vertical_main.top_sellers.c(), new com.avito.android.serp.adapter.top_sellers_serp.d(), new com.avito.android.serp.adapter.gig_shifts.c(), new com.avito.android.serp.adapter.model_card.f(), new com.avito.android.serp.adapter.mini_menu.d()));
            c29240o1 = this;
            i12 = -1;
            c29240o1.f112681O.l(aVar9, -1);
        }
        Resources resources3 = c29240o1.f112681O.getResources();
        com.avito.android.serp.adapter.constructor.D d12 = new com.avito.android.serp.adapter.constructor.D(resources3, aVar7);
        IgnoreTopPaddingTouchScrollDirectionAwareRecyclerView ignoreTopPaddingTouchScrollDirectionAwareRecyclerView3 = c29240o1.f112681O;
        ignoreTopPaddingTouchScrollDirectionAwareRecyclerView3.l(d12, i12);
        ignoreTopPaddingTouchScrollDirectionAwareRecyclerView3.l(new com.avito.android.serp.adapter.rich_snippets.i(c29240o1.f112707b.getContext(), c29240o1.f112734k.isMap()), i12);
        ignoreTopPaddingTouchScrollDirectionAwareRecyclerView3.l(new com.avito.android.serp.adapter.advert_free_form_item.c(aVar7), i12);
        ignoreTopPaddingTouchScrollDirectionAwareRecyclerView3.l(new C44747k(resources3), i12);
        ignoreTopPaddingTouchScrollDirectionAwareRecyclerView3.l(new C13048a(resources3, aVar7), i12);
        c29240o1.f112725h.e(c29240o1.f112681O);
        c29240o1.f112657C.f(c29254t1);
        SwipeRefreshLayout swipeRefreshLayout = c29240o1.f112757s0;
        swipeRefreshLayout.g(c29240o1.f112744n0, c29240o1.f112747o0, true);
        int[] iArrA = com.avito.android.lib.deprecated_design.c.a(swipeRefreshLayout.getContext(), z12);
        swipeRefreshLayout.setColorSchemeColors(Arrays.copyOf(iArrA, iArrA.length));
        swipeRefreshLayout.setOnRefreshListener(new C28962a1(c29240o1, 2));
        swipeRefreshLayout.setProgressBackgroundColorSchemeColor(C35835l0.d(R.attr.white, swipeRefreshLayout.getContext()));
        kotlin.G0 g05 = kotlin.G0.f406611a;
        c29240o1.f112681O.setItemAnimator(null);
        c29240o1.f112681O.setAdapter(c29240o1.f112770z);
        c29240o1.f112710c.a(c29240o1.f112681O, b.f112777a[c29240o1.f112734k.ordinal()] == 1 ? new Rect(0, c29240o1.f112738l0, 0, 0) : null);
        com.avito.android.authorization.auto_recovery.phone_confirm.b.n(c29240o1.f112653A, new C43197r1(new C29089h1(c29240o1, null), new x1(C43175k.r(kotlinx.coroutines.rx3.y.a(c29240o1.f112663F.f283482f0)))));
        c29240o1.f112681O.setHasFixedSize(true);
        C43175k.K(new C43197r1(new C29092i1(c29240o1, null), new y1(C43175k.r(zVar3.f162536e))), C22981N.a(c29240o1.f112653A.getLifecycle()));
        FV.a aVar10 = FV.a.f4720a;
        String string = c29240o1.f112707b.getResources().getString(R.string.reload_recommendations);
        Context context2 = button.getContext();
        int iB2 = y6.b(4);
        aVar10.getClass();
        button.setState(new UU.a(FV.a.i(string, context2, R.attr.textIconRepeat, iB2), null, false, false, false, new C29095j1(c29240o1), null, null, null, false, 990, null));
        c29240o1.f112713d.e(c29240o1);
        c29240o1.f112749p.b(c29240o1.f112681O);
    }

    public static RecyclerView u(BeduinView beduinView) {
        C42754k c42754k = new C42754k();
        c42754k.addFirst(beduinView);
        while (!c42754k.isEmpty()) {
            View view = (View) c42754k.removeFirst();
            if (view instanceof RecyclerView) {
                return (RecyclerView) view;
            }
            if (view instanceof ViewGroup) {
                Iterator<View> it = new q6((ViewGroup) view).iterator();
                while (true) {
                    p6 p6Var = (p6) it;
                    if (p6Var.hasNext()) {
                        c42754k.addLast((View) p6Var.next());
                    }
                }
            }
        }
        return null;
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    @Y61.l
    public final View Aq() {
        return this.f112663F.Aq();
    }

    @Override // com.avito.android.bxcontent.Y0
    @Y61.k
    /* renamed from: BB, reason: from getter */
    public final DN.b getF112687R() {
        return this.f112687R;
    }

    @Override // com.avito.android.bxcontent.Y0
    public final void BS(@Y61.k View view, @Y61.k Onboarding onboarding, @Y61.k Y41.a<kotlin.G0> aVar, @Y61.k Y41.a<kotlin.G0> aVar2, @Y61.k Y41.a<kotlin.G0> aVar3) {
        com.avito.android.loyalty_program.loyalty_entry_view.utils.a.a(view, onboarding, aVar, aVar2, aVar3, this.f112707b.getWidth());
    }

    @Override // com.avito.android.favorite.s, com.avito.android.advert.viewed.j, com.avito.android.serp.adapter.closable.e
    public final void C3(int i12) {
        C35976x4.c(i12, this.f112681O);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    @Y61.k
    public final io.reactivex.rxjava3.core.z<DeepLink> Ct() {
        return this.f112663F.f283504u.f283430i;
    }

    @Override // com.avito.android.bxcontent.Y0
    public final void DM() {
        View view = this.f112707b;
        int iD2 = C35835l0.d(R.attr.transparentWhite, view.getContext());
        view.setBackgroundColor(iD2);
        this.f112705a0.setBackgroundColor(iD2);
        this.f112759t0.setBackgroundColor(iD2);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void Df(@Y61.k EntryPoint.Onboarding onboarding, @Y61.k View view, @Y61.k Y41.a aVar, @Y61.k Y41.a aVar2) {
        OnboardingType onboardingType = OnboardingType.f209409b;
        this.f112663F.Df(onboarding, view, aVar, aVar2);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void E30(@Y61.k C42120a c42120a) {
        this.f112663F.E30(c42120a);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void EH(@Y61.k Filter.Onboarding onboarding, @Y61.k OnboardingType onboardingType, @Y61.k Y41.a<kotlin.G0> aVar, @Y61.k Y41.a<kotlin.G0> aVar2, @Y61.k Y41.a<kotlin.G0> aVar3) {
        this.f112663F.EH(onboarding, onboardingType, aVar, aVar2, aVar3);
    }

    @Override // com.avito.android.bxcontent.Y0
    @Y61.l
    public final SimpleDraweeView Ew(int i12) {
        View viewZ = this.f112691T.Z(i12);
        if (viewZ != null) {
            return (SimpleDraweeView) viewZ.findViewById(R.id.thumbnail_view);
        }
        return null;
    }

    @Override // com.avito.android.bxcontent.Y0
    public final void FL(boolean z12) {
        r(z12);
        SwipeRefreshLayout swipeRefreshLayout = this.f112757s0;
        com.avito.android.bxcontent.vertical_toolbar.vertical_filter_toolbar.j jVar = this.f112706a1;
        if (z12) {
            AppBarLayout appBarLayout = jVar.f113182b;
            D6.H(appBarLayout);
            D6.H(jVar.f113183c);
            D6.H(jVar.f113187g);
            appBarLayout.a(jVar.f113193m);
            swipeRefreshLayout.setOnChildScrollUpCallback(new C28962a1(this, 1));
            v(y6.b(32));
        } else {
            AppBarLayout appBarLayout2 = jVar.f113182b;
            D6.w(appBarLayout2);
            D6.w(jVar.f113183c);
            D6.w(jVar.f113187g);
            appBarLayout2.f(jVar.f113193m);
            swipeRefreshLayout.setOnChildScrollUpCallback(null);
            v(this.f112738l0);
        }
        this.f112707b.requestLayout();
    }

    @Override // com.avito.android.bxcontent.Y0
    public final void Fi(@Y61.k String str) {
        androidx.appcompat.view.d dVar = this.f112679N;
        ToastBarState toastBarState = new ToastBarState(com.avito.android.printable_text.b.f(str), this.f112707b.findViewById(R.id.map_view), ToastBarPosition.f181046d, null, null, null, null, 1500, false, false, null, null, 3704, null);
        a.C0407a c0407a = HV.a.f7100w;
        int iJ2 = C35835l0.j(R.attr.toastBarError, dVar);
        c0407a.getClass();
        IV.a.c(dVar, toastBarState, a.C0407a.b(iJ2, dVar));
    }

    @Override // com.avito.android.bxcontent.Y0
    public final void Gv() {
        D6.f(this.f112685Q, 0, this.f112684P0, 0, 0, 13);
    }

    @Override // com.avito.android.bxcontent.Y0
    public final void HK(@Y61.k ReplaceMainExitOnboarding replaceMainExitOnboarding) {
        PrintableText printableText = replaceMainExitOnboarding.f254501c;
        Context context = this.f112677M;
        String strK0 = printableText.k0(context);
        String strK02 = replaceMainExitOnboarding.f254502d.k0(context);
        m mVar = new m(replaceMainExitOnboarding, strK02);
        View view = (View) ((BxContentFragment.C28948u) this.f112766x).invoke();
        if (view == null) {
            mVar.invoke(Boolean.FALSE);
            return;
        }
        com.avito.android.paranja.h hVar = new com.avito.android.paranja.h(view);
        int iB2 = y6.b(8);
        f.a aVar = new f.a(iB2, iB2, iB2, iB2);
        float fB2 = y6.b(14);
        int color = hVar.getContext().getColor(R.color.overlayBackground);
        a.C0572a c0572a = KV.a.f9464v;
        androidx.appcompat.view.d dVar = this.f112679N;
        c0572a.getClass();
        hVar.setStyle(new com.avito.android.paranja.f(aVar, color, fB2, KV.a.a((KV.a) c.a.a(c0572a, dVar, R.attr.tooltipInverse), y6.b(272), y6.b(0), 0, 2093054)));
        hVar.setState(new ParanjaState(null, new l(hVar, mVar), new com.avito.android.paranja.g(new r.a(null, 1, null), true, null, strK0, strK02, null, null, null, false, 228, null), 1, null));
        this.f112693U.K5(new InterfaceC29127b.C29150l0(replaceMainExitOnboarding, strK02));
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void HQ(@Y61.k BxContentBusiness360.ReplaceMain.Onboarding onboarding, @Y61.k Y41.a aVar) {
        OnboardingType onboardingType = OnboardingType.f209409b;
        this.f112663F.HQ(onboarding, aVar);
    }

    @Override // com.avito.android.bxcontent.Y0
    public final void Hw(@Y61.k String str, @Y61.l Throwable th2) {
        e.b.f125239c.getClass();
        com.avito.android.component.snackbar.h.c(this.f112707b, str, 0, new e.b(th2, null, null), null, null, null, 250);
    }

    @Override // com.avito.android.bxcontent.Y0
    public final void If() {
        D6.H(this.f112687R.f3162a);
        w(a.f112774d);
        TabBarLayout.a.e(TabBarLayout.f180679h, this.f112681O, 0, 3);
    }

    @Override // com.avito.android.bxcontent.Y0
    @Y61.k
    public final cU.s Iv() {
        cU.s sVar = this.f112751p1;
        if (sVar != null) {
            return sVar;
        }
        View view = this.f112707b;
        cU.t tVarA = ((s.b) C29972i.a(C29972i.b(view.getContext()), s.b.class)).fd().a(view.getContext(), this.f112749p, this.f112760u, new cU.m(this.f112752q), this.f112762v.a());
        this.f112751p1 = tVarA;
        return tVarA;
    }

    @Override // com.avito.android.bxcontent.Y0
    public final void J20(int i12) {
        this.f112739l1.f162537f = Integer.valueOf(i12 + 40);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void J50(@Y61.l InlineActions inlineActions) {
        this.f112663F.J50(inlineActions);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void JY(@Y61.k EntryPoint.Onboarding onboarding, @Y61.k Y41.a aVar, @Y61.k Y41.a aVar2) {
        OnboardingType onboardingType = OnboardingType.f209409b;
        this.f112663F.JY(onboarding, aVar, aVar2);
    }

    @Override // com.avito.android.bxcontent.Y0
    public final void Lw() {
        D6.f(this.f112685Q, 0, this.f112686Q0, 0, 0, 13);
    }

    @Override // com.avito.android.bxcontent.Y0
    @Y61.k
    public final InterfaceC43160i<Float> M6(boolean z12) {
        O1 o12 = this.f112733j1;
        IgnoreTopPaddingTouchScrollDirectionAwareRecyclerView ignoreTopPaddingTouchScrollDirectionAwareRecyclerView = this.f112681O;
        if (o12 != null) {
            ignoreTopPaddingTouchScrollDirectionAwareRecyclerView.v0(o12);
        }
        O1 o13 = new O1(ignoreTopPaddingTouchScrollDirectionAwareRecyclerView, z12);
        ignoreTopPaddingTouchScrollDirectionAwareRecyclerView.o(o13);
        this.f112733j1 = o13;
        return o13.f109375g;
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void MR(@Y61.k List list, boolean z12) {
        this.f112663F.MR(list, z12);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void Ml(@Y61.k NavigationBarStyle.DisplayType.SearchWithActionTitle.Onboarding onboarding) {
        OnboardingType onboardingType = OnboardingType.f209409b;
        this.f112663F.Ml(onboarding);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void OM(boolean z12) {
        this.f112663F.OM(z12);
    }

    @Override // com.avito.android.bxcontent.Y0
    public final void OP(@Y61.k AbstractC40048c abstractC40048c) {
        if (abstractC40048c instanceof AbstractC40048c.C11084c) {
            return;
        }
        boolean z12 = this.f112692T0;
        BeduinView beduinView = this.f112683P;
        if (!z12) {
            this.f112692T0 = true;
            cU.s sVarIv = Iv();
            com.avito.android.bxcontent.beduin_v2.di.a aVar = this.f112752q;
            this.f112698W0 = aVar.k();
            this.f112700X0 = aVar.e();
            this.f112704Z0 = aVar.a();
            this.f112702Y0 = aVar.f();
            com.avito.beduin.v2.render.android_view.A aB2 = sVarIv.b();
            com.avito.beduin.v2.theme.k kVarA = sVarIv.a();
            beduinView.f337913c = aB2;
            beduinView.f337914d = kVarA;
            D6.G(beduinView, true);
            IgnoreTopPaddingTouchScrollDirectionAwareRecyclerView ignoreTopPaddingTouchScrollDirectionAwareRecyclerView = this.f112681O;
            ignoreTopPaddingTouchScrollDirectionAwareRecyclerView.setAdapter(null);
            D6.w(ignoreTopPaddingTouchScrollDirectionAwareRecyclerView);
            ignoreTopPaddingTouchScrollDirectionAwareRecyclerView.s();
        }
        boolean z13 = abstractC40048c instanceof AbstractC40048c.a;
        e2 e2Var = this.f112693U;
        if (z13) {
            beduinView.b(((AbstractC40048c.a) abstractC40048c).getF395211c());
            this.f112757s0.setRefreshing(false);
            beduinView.post(new RunnableC28965b1(this, 1));
            if (this.f112696V0) {
                return;
            }
            this.f112696V0 = true;
            e2Var.K5(InterfaceC29127b.C29143i.f112139a);
            return;
        }
        if (abstractC40048c instanceof AbstractC40048c.b) {
            if (this.f112696V0) {
                return;
            }
            this.f112696V0 = true;
            String message = ((AbstractC40048c.b) abstractC40048c).f395216b.getMessage();
            if (message == null) {
                message = "";
            }
            e2Var.K5(new InterfaceC29127b.InterfaceC29141h.c("parsing", message));
            return;
        }
        if (!abstractC40048c.equals(AbstractC40048c.d.f395218b)) {
            abstractC40048c.equals(AbstractC40048c.C11084c.f395217b);
            return;
        }
        this.f112696V0 = false;
        this.f112694U0 = false;
        this.f112713d.f(this);
        com.avito.android.bxcontent.beduin_v2.wrapper.c cVar = this.f112698W0;
        if (cVar != null) {
            cVar.f109567g.clear();
        }
        com.avito.android.bxcontent.beduin_v2.wrapper.cell.b bVar = this.f112700X0;
        if (bVar != null) {
            bVar.f109579e.clear();
        }
        a.C2610a c2610a = this.f112704Z0;
        if (c2610a != null) {
            c2610a.f88119d.clear();
        }
        com.avito.android.snippet.video.l lVar = this.f112702Y0;
        if (lVar != null) {
            lVar.o();
        }
    }

    @Override // com.avito.android.bxcontent.Y0
    public final void OQ(@Y61.k View view, @Y61.k Onboarding onboarding, @Y61.k Y41.a<kotlin.G0> aVar, @Y61.k Y41.a<kotlin.G0> aVar2) {
        com.avito.android.paranja.h hVar = new com.avito.android.paranja.h(view);
        k kVar = new k(hVar, aVar2);
        hVar.setStyle(new com.avito.android.paranja.f(new f.a(y6.b(6), y6.b(11), y6.b(6), y6.b(6)), hVar.getContext().getColor(R.color.overlayBackground), y6.b(10), null, 8, null));
        hVar.setState(new ParanjaState(ParanjaState.State.f210855b, new j(kVar, view), new com.avito.android.paranja.g(new r.a(null, 1, null), true, onboarding.getTitle(), onboarding.getDescription(), onboarding.getButtonTitle(), null, null, null, false, 224, null)));
        ((A0) aVar).invoke();
    }

    @Override // com.avito.android.bxcontent.Y0
    public final void OS(@Y61.k com.avito.android.bxcontent.mvi.entity.C c12) {
        UniversalButton universalButton;
        boolean z12 = c12.f112032a;
        Button button = this.f112708b0;
        if (z12 && (universalButton = c12.f112033b) != null) {
            com.avito.android.lib.design.button.b.a(button, universalButton.getTitle(), false);
            button.setOnClickListener(new com.avito.android.body_condition.h(4, this, c12));
            w(a.f112772b);
            return;
        }
        button.removeOnLayoutChangeListener(this.f112730i1);
        a aVar = a.f112772b;
        a aVar2 = this.f112670I0;
        if (aVar == aVar2 || aVar2 == null) {
            this.f112754r.c(this.f112750p0);
            this.f112670I0 = null;
        }
        D6.w(button);
    }

    @Override // com.avito.android.bxcontent.Y0
    public final float OZ(int i12) {
        View viewFindViewById;
        float f12;
        int height;
        com.avito.android.scroll_tracker.h hVar = this.f112729i0;
        View viewZ = hVar.f261719b.Z(i12);
        if (viewZ == null || (viewFindViewById = viewZ.findViewById(R.id.player_view)) == null) {
            viewFindViewById = viewZ != null ? viewZ.findViewById(R.id.image_view) : null;
            if (viewFindViewById == null) {
                return 0.0f;
            }
        }
        int[] iArr = {0, 0};
        viewFindViewById.getLocationOnScreen(iArr);
        int i13 = iArr[1];
        int height2 = viewFindViewById.getHeight() + i13;
        int[] iArr2 = {0, 0};
        IgnoreTopPaddingTouchScrollDirectionAwareRecyclerView ignoreTopPaddingTouchScrollDirectionAwareRecyclerView = this.f112681O;
        ignoreTopPaddingTouchScrollDirectionAwareRecyclerView.getLocationOnScreen(iArr2);
        int i14 = iArr2[1];
        int i15 = hVar.f261721d + i14;
        if (i15 > i13) {
            f12 = height2 - i15;
            height = viewFindViewById.getHeight();
        } else {
            int height3 = ignoreTopPaddingTouchScrollDirectionAwareRecyclerView.getHeight() + i14;
            if (height2 <= height3) {
                return 1.0f;
            }
            f12 = height3 - i13;
            height = viewFindViewById.getHeight();
        }
        return f12 / height;
    }

    @Override // com.avito.android.bxcontent.Y0
    public final void Oy(boolean z12) {
        r(z12);
        SwipeRefreshLayout swipeRefreshLayout = this.f112757s0;
        com.avito.android.bxcontent.vertical_toolbar.transportation_services_toolbar.i iVar = this.f112721f1;
        if (z12) {
            AppBarLayout appBarLayout = iVar.f113141e;
            D6.H(appBarLayout);
            D6.H(iVar.f113142f);
            D6.H(iVar.f113144h);
            appBarLayout.a(iVar.f113152p);
            swipeRefreshLayout.setOnChildScrollUpCallback(new C28962a1(this, 3));
            v(y6.b(36));
        } else {
            AppBarLayout appBarLayout2 = iVar.f113141e;
            D6.w(appBarLayout2);
            D6.w(iVar.f113142f);
            D6.w(iVar.f113144h);
            appBarLayout2.f(iVar.f113152p);
            swipeRefreshLayout.setOnChildScrollUpCallback(null);
            v(this.f112738l0);
        }
        this.f112707b.requestLayout();
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    @Y61.k
    public final d2<kotlin.Q<String, SectionTagPayload>> QZ() {
        return C43175k.a(this.f112663F.f283484g0);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void R00(@Y61.k Y41.l<? super Boolean, kotlin.G0> lVar) {
        this.f112663F.f283492k0 = lVar;
    }

    @Override // com.avito.android.bxcontent.Y0
    @SuppressLint({"UdfComponentUsage"})
    public final void R30(@Y61.k q.f fVar) {
        SwitchSerpMapButtonState switchSerpMapButtonState = fVar.f112393a;
        int i12 = b.f112778b[switchSerpMapButtonState.getButtonType().ordinal()];
        ColorStateList colorStateList = this.f112660D0;
        int i13 = this.f112666G0;
        final HeaderButton headerButton = this.f112765w0;
        if (i12 == 1) {
            headerButton.e(i13, (ColorStateList) this.f112662E0.getValue(), colorStateList);
            headerButton.setText(this.f112771z0);
            headerButton.setTextIconStyleRes(this.f112656B0);
        } else if (i12 == 2) {
            headerButton.e(i13, (ColorStateList) this.f112664F0.getValue(), colorStateList);
            headerButton.setText(this.f112654A0);
            headerButton.setTextIconStyleRes(this.f112658C0);
        }
        boolean z12 = fVar.f112394b;
        if (z12 && switchSerpMapButtonState.isVisible()) {
            if (D6.y(headerButton) && headerButton.getAlpha() == 1.0f) {
                headerButton.animate().cancel();
            } else {
                final int i14 = 1;
                headerButton.animate().alpha(1.0f).setDuration(300L).setStartDelay(0L).withStartAction(new Runnable() { // from class: com.avito.android.bxcontent.Z0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i14) {
                            case 0:
                                D6.w(headerButton);
                                break;
                            default:
                                View view = headerButton;
                                view.setAlpha(0.0f);
                                D6.H(view);
                                break;
                        }
                    }
                }).start();
            }
        } else if (!z12 || switchSerpMapButtonState.isVisible()) {
            D6.w(headerButton);
            return;
        } else if (D6.y(headerButton) && headerButton.getAlpha() == 0.0f) {
            headerButton.animate().cancel();
        } else {
            final int i15 = 0;
            headerButton.animate().alpha(0.0f).setDuration(300L).withEndAction(new Runnable() { // from class: com.avito.android.bxcontent.Z0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i15) {
                        case 0:
                            D6.w(headerButton);
                            break;
                        default:
                            View view = headerButton;
                            view.setAlpha(0.0f);
                            D6.H(view);
                            break;
                    }
                }
            }).start();
        }
        headerButton.setAlpha(switchSerpMapButtonState.getAlpha());
    }

    @Override // com.avito.android.inline_filters.dialog.InlineFilterDialogOpener
    public final void RA(@Y61.k Filter filter, @Y61.k List list, @Y61.l Parcelable parcelable, @Y61.l SearchParams searchParams, @Y61.l InterfaceC30995b interfaceC30995b, @Y61.l com.avito.android.inline_filters.W w12, @Y61.l InterfaceC31046f interfaceC31046f, @Y61.l com.avito.android.location.r rVar, @Y61.l CN.f fVar, @Y61.l com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.l PresentationType presentationType, @Y61.l Map map, @Y61.k Y41.p pVar, @Y61.l Y41.l lVar, @Y61.k Y41.p pVar2, @Y61.k Y41.p pVar3, @Y61.k Y41.a aVar2, @Y61.k Y41.l lVar2, @Y61.l Y41.l lVar3, @Y61.l InlineFilterDialogOpener.Source source, @Y61.l MetroResponseBody metroResponseBody, @Y61.l String str, @Y61.l String str2, @Y61.l Filter filter2, @Y61.l Filter filter3, @Y61.l Y41.l lVar4, @Y61.l InterfaceC14024a interfaceC14024a, @Y61.l com.avito.android.guests_selector.d dVar, @Y61.l C27025b c27025b, @Y61.l com.avito.android.C0 c02, @Y61.l C43624b c43624b) {
        this.f112671J.RA(filter, list, parcelable, searchParams, interfaceC30995b, w12, interfaceC31046f, rVar, fVar, aVar, presentationType, map, pVar, lVar, pVar2, pVar3, aVar2, lVar2, lVar3, source, metroResponseBody, str, str2, filter2, filter3, lVar4, interfaceC14024a, dVar, c27025b, c02, c43624b);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void RS(@Y61.l TopWidget topWidget, @Y61.l TabsConfig tabsConfig, @Y61.l EntryPoint entryPoint, @Y61.k Y41.a<kotlin.G0> aVar, @Y61.k Y41.a<kotlin.G0> aVar2, @Y61.l String str, @Y61.l DeepLink deepLink, @Y61.l Integer num, @Y61.l HeaderSubtitle headerSubtitle, @Y61.l Integer num2, @Y61.k List<? extends ShortcutNavigationItem> list, @Y61.k List<com.avito.android.shortcut_navigation_bar.z0> list2, @Y61.l Boolean bool, boolean z12) {
        this.f112663F.RS(topWidget, tabsConfig, entryPoint, aVar, aVar2, str, deepLink, num, headerSubtitle, num2, list, list2, bool, z12);
    }

    @Override // com.avito.android.bxcontent.Y0
    public final void RX() {
        D6.f(this.f112685Q, 0, this.f112682O0, 0, 0, 13);
    }

    @Override // com.avito.android.bxcontent.Y0
    public final void ST(boolean z12, boolean z13) {
        C34999p c34999p = this.f112663F;
        if (c34999p.f283466U) {
            return;
        }
        this.f112728i.a(SavedSearchEntryPointType.f258244d, z12);
        c34999p.a(z12, z13);
        x(z12);
    }

    @Override // com.avito.android.bxcontent.Y0
    public final void SU(@Y61.k BxContentBusiness360.ReplaceMain.ToastReplaceMain toastReplaceMain) {
        this.f112699X = this.f112768y.a(new com.avito.android.replace_main.toast.h(this.f112707b, BottomNavigationSpace.f107066c, toastReplaceMain.getText(), false, null, toastReplaceMain.getButton().getText(), new n(toastReplaceMain), new o(toastReplaceMain), 24, null));
    }

    @Override // com.avito.android.bxcontent.Y0
    public final void SZ(@Y61.k InterfaceC39628a interfaceC39628a) {
        this.f112683P.c(interfaceC39628a);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    @Y61.k
    public final io.reactivex.rxjava3.core.z<DeepLink> TJ() {
        return this.f112663F.f283503t.f283399m;
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void TP(@Y61.k ShortcutNavigationItem shortcutNavigationItem) {
        this.f112663F.TP(shortcutNavigationItem);
    }

    @Override // com.avito.android.bxcontent.Y0
    @Y61.k
    public final InterfaceC43160i<InterfaceC29127b> U5() {
        return C43175k.a(this.f112693U);
    }

    @Override // com.avito.android.bxcontent.Y0
    public final void Uh() {
        D6.w(this.f112687R.f3162a);
        a aVar = a.f112774d;
        a aVar2 = this.f112670I0;
        if (aVar == aVar2 || aVar2 == null) {
            this.f112754r.c(this.f112750p0);
            this.f112670I0 = null;
        }
        TabBarLayout.a.e(TabBarLayout.f180679h, this.f112681O, 0, 3);
    }

    @Override // com.avito.android.bxcontent.Y0
    @Y61.k
    /* renamed from: Up, reason: from getter */
    public final com.avito.android.bxcontent.search_bar_promo_widget.l getF112715d1() {
        return this.f112715d1;
    }

    @Override // com.avito.android.bxcontent.Y0
    @Y61.k
    /* renamed from: V00, reason: from getter */
    public final com.avito.android.bxcontent.vertical_toolbar.vertical_filter_toolbar.j getF112706a1() {
        return this.f112706a1;
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void VA(@Y61.k TopWidget.Onboarding onboarding, @Y61.k Y41.a aVar, @Y61.k Y41.a aVar2) {
        OnboardingType onboardingType = OnboardingType.f209409b;
        this.f112663F.VA(onboarding, aVar, aVar2);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    @Y61.k
    public final io.reactivex.rxjava3.core.z<InlineFiltersGeo> Vl() {
        return this.f112663F.f283480e0;
    }

    @Override // com.avito.android.bxcontent.Y0
    public final void Vv(@Y61.k String str) {
        boolean zEquals = str.equals("111");
        IgnoreTopPaddingTouchScrollDirectionAwareRecyclerView ignoreTopPaddingTouchScrollDirectionAwareRecyclerView = this.f112681O;
        if (zEquals) {
            com.avito.android.bxcontent.scroll_listener.b bVar = new com.avito.android.bxcontent.scroll_listener.b(this.f112691T, ignoreTopPaddingTouchScrollDirectionAwareRecyclerView, new f());
            ignoreTopPaddingTouchScrollDirectionAwareRecyclerView.o(bVar);
            this.f112745n1 = bVar;
            return;
        }
        com.avito.android.bxcontent.scroll_listener.b bVar2 = this.f112745n1;
        if (bVar2 != null) {
            ignoreTopPaddingTouchScrollDirectionAwareRecyclerView.v0(bVar2);
            this.f112745n1 = null;
        }
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void WC(boolean z12) {
        this.f112663F.f283468W = z12;
    }

    @Override // com.avito.android.bxcontent.Y0
    public final void Wt(@Y61.k FloatingPromoWidgetItem floatingPromoWidgetItem) {
        i iVar = new i(floatingPromoWidgetItem);
        com.avito.android.serp.adapter.floating_promo_widget.l lVar = this.f112724g1;
        View view = lVar.f269986a;
        Image imageDependsOnThemeOrDefault = UniversalImageKt.getImageDependsOnThemeOrDefault(floatingPromoWidgetItem.f269979e, com.avito.android.lib.util.darkTheme.c.b(view.getContext()));
        SimpleDraweeView simpleDraweeView = lVar.f269988c;
        if (imageDependsOnThemeOrDefault == null) {
            D6.w(simpleDraweeView);
        } else {
            ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
            aVarA.d(com.avito.android.image_loader.b.b(imageDependsOnThemeOrDefault));
            aVarA.c();
            D6.H(simpleDraweeView);
        }
        UniversalImage universalImage = floatingPromoWidgetItem.f269980f;
        Image imageG = universalImage != null ? com.avito.android.advert.item.delivery_suggests.l.g(view, universalImage) : null;
        SimpleDraweeView simpleDraweeView2 = lVar.f269991f;
        if (imageG == null) {
            D6.w(simpleDraweeView2);
        } else {
            ImageRequest.a aVarA2 = C35949t5.a(simpleDraweeView2);
            aVarA2.d(com.avito.android.image_loader.b.b(imageG));
            aVarA2.c();
            D6.H(simpleDraweeView2);
        }
        com.avito.android.util.text.j.c(lVar.f269989d, floatingPromoWidgetItem.f269977c, null);
        com.avito.android.util.text.j.a(lVar.f269990e, floatingPromoWidgetItem.f269978d, null);
        com.avito.android.search.filter.adapter.select.m mVar = new com.avito.android.search.filter.adapter.select.m(11, iVar, floatingPromoWidgetItem);
        View view2 = lVar.f269987b;
        view2.setOnClickListener(mVar);
        D6.H(view2);
        w(a.f112773c);
    }

    @Override // com.avito.android.bxcontent.Y0
    public final void XB(boolean z12) {
        CoordinatorLayout coordinatorLayout = this.f112763v0;
        SwipeRefreshLayout swipeRefreshLayout = this.f112757s0;
        com.avito.android.bxcontent.utils.h hVar = this.f112761u0;
        if (!z12) {
            swipeRefreshLayout.g(this.f112744n0, this.f112747o0, true);
            CoordinatorLayout.g gVar = new CoordinatorLayout.g(-1, -2);
            gVar.b(null);
            coordinatorLayout.setLayoutParams(gVar);
            v(this.f112738l0);
            yR(false);
            hVar.c(true);
            hVar.b();
            return;
        }
        hVar.c(false);
        hVar.b();
        swipeRefreshLayout.g((int) swipeRefreshLayout.getResources().getDimension(R.dimen.pull_refresh_offset_start_with_search_promo_header), (int) swipeRefreshLayout.getResources().getDimension(R.dimen.pull_refresh_offset_end_with_search_promo_header), true);
        v(this.f112705a0.getContext().getResources().getDimensionPixelSize(R.dimen.recycler_view_top_padding_with_search_promo_header));
        View viewFindViewById = this.f112703Z.findViewById(R.id.shortcuts_container);
        D6.f(viewFindViewById, 0, (int) com.avito.android.authorization.auto_recovery.phone_confirm.b.b(viewFindViewById, R.dimen.redesign_shortcuts_top_margin_with_search_promo_header), 0, 0, 13);
        CoordinatorLayout.g gVar2 = new CoordinatorLayout.g(-1, -2);
        gVar2.b(new AppBarLayout.ScrollingViewBehavior());
        coordinatorLayout.setLayoutParams(gVar2);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void Xk(@Y61.k String str, @Y61.k Filter.Onboarding onboarding, @Y61.k Y41.a aVar) {
        OnboardingType onboardingType = OnboardingType.f209409b;
        this.f112663F.Xk(str, onboarding, aVar);
    }

    @Override // com.avito.android.bxcontent.Y0
    public final void ZB(int i12) {
        this.f112691T.o2(i12);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void ZN(@Y61.l InlineActions inlineActions) {
        this.f112663F.ZN(inlineActions);
    }

    @Override // com.avito.android.component.toast.util.g
    public final void a(@Y61.k PrintableText printableText, int i12, @Y61.l String str, @Y61.l Y41.a aVar, @Y61.k ToastBarPosition toastBarPosition, @Y61.k com.avito.android.component.toast.f fVar) {
        this.f112669I.a(printableText, i12, str, aVar, toastBarPosition, fVar);
    }

    @Override // com.avito.android.bxcontent.Y0
    @Y61.k
    /* renamed from: a80, reason: from getter */
    public final com.avito.android.hero_banner.widget.l getF112718e1() {
        return this.f112718e1;
    }

    @Override // com.avito.android.bxcontent.Y0
    public final void aQ() {
        if (D6.y(this.f112690S0)) {
            return;
        }
        View view = this.f112707b;
        Integer numValueOf = Integer.valueOf(view.getWidth());
        if (numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(numValueOf != null ? numValueOf.intValue() : C35835l0.i(view.getContext()).widthPixels, BeduinInputModel.MIN_TEXT_VERSION);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        View view2 = this.f112685Q;
        view2.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int measuredHeight = view2.getMeasuredHeight();
        int i12 = this.f112738l0;
        if (measuredHeight < i12) {
            measuredHeight = i12;
        }
        v(measuredHeight);
        int i13 = measuredHeight - this.f112741m0;
        if (i13 != 0 && !this.f112734k.isMain()) {
            SwipeRefreshLayout swipeRefreshLayout = this.f112757s0;
            int progressViewStartOffset = swipeRefreshLayout.getProgressViewStartOffset();
            int i14 = this.f112744n0 + i13;
            if (progressViewStartOffset != i14) {
                swipeRefreshLayout.g(i14, this.f112747o0 + i13, true);
            }
        }
        x(true);
    }

    @Override // com.avito.android.bxcontent.Y0
    public final void aq(@Y61.k List<C29126a.b> list) {
        com.avito.android.bxcontent.beduin_v2.wrapper.b bVar;
        com.avito.android.bxcontent.beduin_v2.wrapper.c cVar = this.f112698W0;
        if (cVar != null) {
            for (C29126a.b bVar2 : list) {
                Iterator it = cVar.f109567g.iterator();
                while (it.hasNext()) {
                    com.avito.android.bxcontent.beduin_v2.wrapper.a aVar = (com.avito.android.bxcontent.beduin_v2.wrapper.a) it.next();
                    if (kotlin.jvm.internal.L.f(aVar.f109555q, bVar2.f112058a) && (bVar = aVar.f109556r) != null) {
                        bVar.b(bVar2.f112059b);
                    }
                }
            }
            this.f112713d.b();
        }
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void bM(boolean z12) {
        this.f112663F.bM(z12);
    }

    @Override // com.avito.android.async_phone.o
    public final void c() {
        this.f112665G.c();
    }

    @Override // com.avito.android.inline_filters.dialog.InlineFilterDialogOpener
    @Y61.l
    public final Parcelable d0() {
        return this.f112671J.d0();
    }

    @Override // qK0.d
    public final void destroy() {
        com.avito.android.floating_views.h hVar;
        androidx.appcompat.app.l lVar = this.f112695V;
        if (lVar != null) {
            lVar.dismiss();
        }
        ProgressInfoToastBar progressInfoToastBar = this.f112697W;
        if (progressInfoToastBar != null) {
            progressInfoToastBar.dismiss();
        }
        com.avito.android.replace_main.toast.a aVar = this.f112699X;
        if (aVar != null) {
            aVar.dismiss();
        }
        IgnoreTopPaddingTouchScrollDirectionAwareRecyclerView ignoreTopPaddingTouchScrollDirectionAwareRecyclerView = this.f112681O;
        ignoreTopPaddingTouchScrollDirectionAwareRecyclerView.s();
        ignoreTopPaddingTouchScrollDirectionAwareRecyclerView.setAdapter(null);
        RecyclerView recyclerViewU = u(this.f112683P);
        if (recyclerViewU != null && (hVar = this.f112735k0) != null) {
            recyclerViewU.v0(hVar);
        }
        this.f112713d.a(this);
        com.avito.android.bxcontent.beduin_v2.wrapper.c cVar = this.f112698W0;
        if (cVar != null) {
            cVar.f109567g.clear();
        }
        this.f112698W0 = null;
        com.avito.android.bxcontent.beduin_v2.wrapper.cell.b bVar = this.f112700X0;
        if (bVar != null) {
            bVar.f109579e.clear();
        }
        this.f112700X0 = null;
        a.C2610a c2610a = this.f112704Z0;
        if (c2610a != null) {
            c2610a.f88119d.clear();
        }
        this.f112704Z0 = null;
        com.avito.android.snippet.video.l lVar2 = this.f112702Y0;
        if (lVar2 != null) {
            lVar2.o();
        }
        this.f112702Y0 = null;
        this.f112735k0 = null;
        this.f112657C.g(this.f112742m1);
        this.f112725h.a();
        C34999p c34999p = this.f112663F;
        com.avito.android.onboarding_manager.a aVar2 = c34999p.f283477d;
        if (aVar2 != null) {
            HashSet hashSet = aVar2.f209416d;
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((io.reactivex.rxjava3.disposables.d) it.next()).dispose();
            }
            hashSet.clear();
            aVar2.f209417e.clear();
        }
        kotlinx.coroutines.U.b(c34999p.f283474b0, null);
        this.f112745n1 = null;
        this.f112732j0 = null;
    }

    @Override // com.avito.android.bxcontent.Y0
    public final void dw(@Y61.l com.avito.android.bxcontent.mvi.entity.A a12) {
        FrameLayout frameLayout = this.f112767x0;
        if (a12 == null) {
            D6.w(frameLayout);
            return;
        }
        D6.H(frameLayout);
        Button button = this.f112769y0;
        if (button != null) {
            button.setState(new UU.a(a12.f111798a, a12.f111799b, false, false, false, new q(), null, null, null, false, 988, null));
        }
    }

    @Override // com.avito.android.async_phone.o
    public final void e(@Y61.k String str) {
        this.f112665G.e(str);
    }

    @Override // com.avito.android.inline_filters.dialog.InlineFilterDialogOpener
    public final void f2() {
        this.f112671J.f2();
    }

    @Override // com.avito.android.bxcontent.Y0
    public final void fZ(@Y61.l LoadState loadState, @Y61.k LoadState loadState2) {
        com.avito.android.progress_overlay.l lVar = this.f112714d0;
        if (lVar != null) {
            lVar.j();
        }
        boolean z12 = loadState2 == LoadState.f112044c;
        com.avito.android.progress_overlay.l lVar2 = this.f112717e0;
        if (z12) {
            if (lVar2 != null) {
                lVar2.k(null);
            }
        } else if (loadState2 == LoadState.f112046e && loadState != LoadState.f112045d) {
            if (lVar2 != null) {
                lVar2.a("");
            }
        } else {
            if ((loadState2 == LoadState.f112043b && loadState == null) || lVar2 == null) {
                return;
            }
            lVar2.j();
        }
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    @Y61.k
    /* renamed from: ff */
    public final com.jakewharton.rxrelay3.c getF283478d0() {
        return this.f112663F.f283478d0;
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void fk(@Y61.l Boolean bool, @Y61.k Y41.a<kotlin.G0> aVar) {
        this.f112663F.fk(bool, aVar);
    }

    @Override // com.avito.android.component.toast.util.f
    public final boolean h() {
        return this.f112669I.h();
    }

    @Override // com.avito.android.bxcontent.Y0
    public final void hG() {
        com.avito.android.serp.adapter.floating_promo_widget.l lVar = this.f112724g1;
        lVar.f269987b.removeOnLayoutChangeListener(this.f112727h1);
        View view = lVar.f269987b;
        view.setOnClickListener(null);
        D6.w(view);
        a aVar = a.f112773c;
        a aVar2 = this.f112670I0;
        if (aVar == aVar2 || aVar2 == null) {
            this.f112754r.c(this.f112750p0);
            this.f112670I0 = null;
        }
    }

    @Override // com.avito.android.bxcontent.Y0
    @Y61.k
    /* renamed from: hS, reason: from getter */
    public final com.avito.android.bxcontent.vertical_toolbar.category_filter_toolbar.p getF112712c1() {
        return this.f112712c1;
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    @Y61.k
    public final io.reactivex.rxjava3.core.z<kotlin.G0> hY() {
        return this.f112663F.hY();
    }

    @Override // com.avito.android.floating_views.FloatingViewsPresenter.Subscriber
    public final void i(boolean z12) {
        this.f112693U.K5(new InterfaceC29127b.H0(z12));
    }

    @Override // com.avito.android.bxcontent.Y0
    public final void i80(@Y61.l Throwable th2) {
        C50601c c50601c = this.f112673K;
        c50601c.getClass();
        com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
        View view = c50601c.f444243b;
        PrintableText printableTextF = com.avito.android.printable_text.b.f(view.getContext().getString(R.string.saved_search_unknown_error_message));
        f.c.f125255c.getClass();
        com.avito.android.component.toast.c.b(cVar, view, printableTextF, null, null, null, f.c.a.a(null, th2), 0, null, null, false, false, null, null, 4078);
    }

    @Override // com.avito.android.bxcontent.Y0
    public final void ia(@Y61.k ProgressInfoToastBarData progressInfoToastBarData) {
        ProgressInfoToastBar progressInfoToastBar = this.f112697W;
        if (progressInfoToastBar != null) {
            progressInfoToastBar.dismiss();
        }
        View view = this.f112707b;
        com.avito.android.progress_info_toast_bar.d dVarA = this.f112737l.a(view.getContext(), progressInfoToastBarData, null);
        dVarA.f231502d = view;
        dVarA.a();
        this.f112697W = dVarA;
    }

    @Override // com.avito.android.bxcontent.Y0
    public final void j3(@Y61.k String str) {
        com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, this.f112707b, com.avito.android.printable_text.b.f(str), null, null, null, f.a.f125253a, 0, null, null, false, false, null, null, 4078);
    }

    @Override // com.avito.android.bxcontent.Y0
    /* renamed from: jI, reason: from getter */
    public final PN.b getF112689S() {
        return this.f112689S;
    }

    @Override // com.avito.android.async_phone.o
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.observable.P k(@Y61.k Throwable th2) {
        return this.f112665G.k(th2);
    }

    @Override // com.avito.android.bxcontent.Y0
    public final void k70(boolean z12) {
        D6.G(this.f112736k1, z12);
    }

    @Override // com.avito.android.bxcontent.Y0
    public final void kB(boolean z12) {
        D6.f(this.f112683P, 0, z12 ? 0 : this.f112688R0, 0, 0, 13);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void kF() {
        this.f112663F.kF();
    }

    @Override // com.avito.android.floating_views.FloatingViewsPresenter.Subscriber
    public final void l(@Y61.k FloatingViewsPresenter.Subscriber.b bVar) {
        this.f112693U.K5(new InterfaceC29127b.A(bVar));
    }

    @Override // com.avito.android.bxcontent.Y0
    public final void lU() {
        this.f112701Y.f158464d = -1;
    }

    @Override // com.avito.android.bxcontent.Y0
    public final void m40(@Y61.l LoadState loadState, @Y61.k LoadState loadState2) {
        com.avito.android.progress_overlay.l lVar = this.f112717e0;
        if (lVar != null) {
            lVar.j();
        }
        boolean z12 = loadState2 == LoadState.f112044c;
        com.avito.android.progress_overlay.l lVar2 = this.f112714d0;
        if (z12 && loadState != LoadState.f112045d) {
            if (lVar2 != null) {
                lVar2.k(null);
            }
        } else if (loadState2 == LoadState.f112046e && loadState != LoadState.f112045d) {
            if (lVar2 != null) {
                lVar2.a("");
            }
        } else {
            if ((loadState2 == LoadState.f112043b && loadState == null) || lVar2 == null) {
                return;
            }
            lVar2.j();
        }
    }

    @Override // com.avito.android.bxcontent.Y0
    public final void mV(int i12, @Y61.k Y41.a<kotlin.G0> aVar) {
        IgnoreTopPaddingTouchScrollDirectionAwareRecyclerView ignoreTopPaddingTouchScrollDirectionAwareRecyclerView = this.f112681O;
        RecyclerView.m layoutManager = ignoreTopPaddingTouchScrollDirectionAwareRecyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            linearLayoutManager.b2(i12, 0);
        }
        ignoreTopPaddingTouchScrollDirectionAwareRecyclerView.addOnLayoutChangeListener(new c(aVar, ignoreTopPaddingTouchScrollDirectionAwareRecyclerView));
    }

    @Override // com.avito.android.bxcontent.Y0
    public final int ml() {
        int[] iArr = new int[2];
        this.f112685Q.getLocationOnScreen(iArr);
        return iArr[1];
    }

    @Override // com.avito.android.favorite_apprater.k
    public final void n() {
        this.f112667H.n();
    }

    @Override // com.avito.android.bxcontent.Y0
    public final void n70(boolean z12) {
        r(z12);
        SwipeRefreshLayout swipeRefreshLayout = this.f112757s0;
        com.avito.android.bxcontent.vertical_toolbar.vertical_mini_search_toolbar.k kVar = this.f112709b1;
        if (z12) {
            kVar.getClass();
            kVar.f113227l = new com.avito.android.bxcontent.vertical_toolbar.category_filter_toolbar.n(kVar, 3);
            AppBarLayout appBarLayout = kVar.f113217b;
            D6.H(appBarLayout);
            D6.H(kVar.f113218c);
            D6.H(kVar.f113222g);
            appBarLayout.f(kVar.f113227l);
            appBarLayout.a(kVar.f113227l);
            swipeRefreshLayout.setOnChildScrollUpCallback(new C28962a1(this, 4));
            v(y6.b(36));
        } else {
            AppBarLayout appBarLayout2 = kVar.f113217b;
            D6.w(appBarLayout2);
            D6.w(kVar.f113218c);
            D6.w(kVar.f113222g);
            appBarLayout2.f(kVar.f113227l);
            kVar.f113227l = null;
            swipeRefreshLayout.setOnChildScrollUpCallback(null);
            v(this.f112738l0);
        }
        this.f112707b.requestLayout();
    }

    @Override // com.avito.android.bxcontent.Y0
    @Y61.k
    /* renamed from: nC, reason: from getter */
    public final com.avito.android.bxcontent.vertical_toolbar.transportation_services_toolbar.i getF112721f1() {
        return this.f112721f1;
    }

    @Override // com.avito.android.bxcontent.Y0
    @Y61.k
    /* renamed from: nO, reason: from getter */
    public final com.avito.android.bxcontent.vertical_toolbar.vertical_mini_search_toolbar.k getF112709b1() {
        return this.f112709b1;
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void nV(boolean z12) {
        this.f112663F.nV(z12);
    }

    @Override // com.avito.android.bxcontent.Y0
    public final void nr(@Y61.k BxContentBusiness360.Toast toast) {
        this.f112699X = this.f112768y.a(new com.avito.android.replace_main.toast.h(this.f112707b, BottomNavigationSpace.f107066c, toast.getTitle(), true, toast.getSubtitle(), toast.getButton().getTitle(), new g(toast), new h(toast)));
    }

    @Override // com.avito.android.serp.adapter.advert_xl.C
    public final boolean o(@Y61.k String str, @Y61.k final Y41.a<kotlin.G0> aVar, @Y61.k final Y41.a<kotlin.G0> aVar2) {
        androidx.appcompat.app.l lVar = this.f112695V;
        if (lVar != null && lVar.isShowing()) {
            return false;
        }
        androidx.appcompat.app.l lVarCreate = new l.a(this.f112707b.getContext()).setTitle(R.string.serp_phone).setMessage(str).setPositiveButton(R.string.call, new DialogInterface.OnClickListener() { // from class: com.avito.android.bxcontent.c1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i12) {
                C41336a.C11375a.a();
                aVar.invoke();
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.avito.android.bxcontent.d1
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                C41336a.C11375a.a();
                aVar2.invoke();
            }
        }).create();
        this.f112695V = lVarCreate;
        if (lVarCreate != null) {
            com.avito.android.lib.util.g.a(lVarCreate);
        }
        return true;
    }

    @Override // com.avito.android.bxcontent.Y0
    public final void onDataChanged() {
        if (this.f112692T0) {
            return;
        }
        if (this.f112681O.getAdapter() == null) {
            throw new IllegalArgumentException("init adapter b4 use");
        }
        this.f112723g0.m();
        this.f112701Y.l();
        N6 n62 = this.f112726h0;
        n62.getClass();
        N6.a aVar = new N6.a(-1, -1);
        ScrollUnpredictiveGridLayoutManager scrollUnpredictiveGridLayoutManager = n62.f318693b;
        N6.a aVar2 = new N6.a(scrollUnpredictiveGridLayoutManager.K1(), scrollUnpredictiveGridLayoutManager.M1());
        io.reactivex.rxjava3.subjects.b<N6.a> bVar = n62.f318694c;
        bVar.onNext(aVar);
        bVar.onNext(aVar2);
        e2 e2Var = n62.f318695d;
        e2Var.K5(aVar);
        e2Var.K5(aVar2);
        com.avito.android.bxcontent.scroll_listener.b bVar2 = this.f112745n1;
        if (bVar2 != null) {
            bVar2.m();
        }
    }

    @Override // com.avito.android.inline_filters.dialog.InlineFilterDialogOpener
    public final void onPause() {
        this.f112671J.getClass();
    }

    @Override // com.avito.android.inline_filters.dialog.InlineFilterDialogOpener
    public final void onResume() {
        this.f112671J.getClass();
    }

    @Override // com.avito.android.bxcontent.Y0
    public final void pZ() {
        com.avito.android.bxcontent.beduin_v2.wrapper.cell.m mVar;
        com.avito.android.bxcontent.beduin_v2.wrapper.cell.b bVar = this.f112700X0;
        if (bVar != null) {
            Iterator it = bVar.f109579e.iterator();
            while (it.hasNext()) {
                com.avito.android.bxcontent.beduin_v2.wrapper.cell.a aVar = (com.avito.android.bxcontent.beduin_v2.wrapper.cell.a) it.next();
                CellWrapper cellWrapper = aVar.f109576p;
                if (cellWrapper != null && (mVar = aVar.f109575o) != null) {
                    aVar.u(mVar, cellWrapper);
                }
            }
        }
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    @Y61.k
    public final io.reactivex.rxjava3.core.z<ShortcutNavigationItem> pu() {
        return this.f112663F.f283476c0;
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void q00(@Y61.k String str, @Y61.k Filter.Onboarding onboarding, @Y61.k OnboardingType onboardingType, boolean z12, @Y61.k Y41.a<kotlin.G0> aVar, @Y61.k Y41.a<kotlin.G0> aVar2, @Y61.k Y41.a<kotlin.G0> aVar3) {
        this.f112663F.q00(str, onboarding, onboardingType, z12, aVar, aVar2, aVar3);
    }

    public final void r(boolean z12) {
        CoordinatorLayout coordinatorLayout = this.f112763v0;
        View view = this.f112703Z;
        if (z12) {
            D6.w(view);
            ViewGroup.LayoutParams layoutParams = coordinatorLayout.getLayoutParams();
            CoordinatorLayout.g gVar = layoutParams instanceof CoordinatorLayout.g ? (CoordinatorLayout.g) layoutParams : null;
            if (gVar != null) {
                gVar.b(new AppBarLayout.ScrollingViewBehavior());
            }
            D6.c(this.f112757s0, null, Integer.valueOf(y6.b(-16)), null, null, 13);
            return;
        }
        D6.H(view);
        ViewGroup.LayoutParams layoutParams2 = coordinatorLayout.getLayoutParams();
        CoordinatorLayout.g gVar2 = layoutParams2 instanceof CoordinatorLayout.g ? (CoordinatorLayout.g) layoutParams2 : null;
        if (gVar2 != null) {
            gVar2.b(null);
        }
        D6.c(this.f112757s0, null, Integer.valueOf(y6.b(0)), null, null, 13);
    }

    @Override // com.avito.android.bxcontent.Y0
    public final void rh() {
        View view = this.f112707b;
        int iD2 = C35835l0.d(R.attr.white, view.getContext());
        view.setBackgroundColor(iD2);
        this.f112705a0.setBackgroundColor(iD2);
        this.f112759t0.setBackgroundColor(iD2);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    @Y61.k
    public final io.reactivex.rxjava3.core.z<String> s60() {
        return this.f112663F.s60();
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    @Y61.k
    public final io.reactivex.rxjava3.core.z<kotlin.G0> sA() {
        return this.f112663F.f283503t.f283400n;
    }

    @Override // com.avito.android.advertising.kebab.e
    public final void sK(int i12) {
        IgnoreTopPaddingTouchScrollDirectionAwareRecyclerView ignoreTopPaddingTouchScrollDirectionAwareRecyclerView = this.f112681O;
        if (ignoreTopPaddingTouchScrollDirectionAwareRecyclerView.getAdapter() == null) {
            throw new IllegalArgumentException("init adapter b4 use");
        }
        RecyclerView.Adapter adapter = ignoreTopPaddingTouchScrollDirectionAwareRecyclerView.getAdapter();
        if (adapter != null) {
            adapter.notifyItemChanged(i12, "animation_flag_payload");
        }
    }

    @Override // com.avito.android.bxcontent.Y0
    @Y61.l
    public final StyledPlayerView sN(int i12) {
        View viewZ = this.f112691T.Z(i12);
        if (viewZ != null) {
            return (StyledPlayerView) viewZ.findViewById(R.id.player_view);
        }
        return null;
    }

    @Override // com.avito.android.bxcontent.Y0
    public final void sw(int i12) {
        BxContentBottomSheetBehavior<FrameLayout> bxContentBottomSheetBehavior = this.f112668H0;
        if (bxContentBottomSheetBehavior == null || bxContentBottomSheetBehavior.f355975L == i12) {
            return;
        }
        C29243p1 c29243p1 = this.f112748o1;
        bxContentBottomSheetBehavior.G(c29243p1);
        if (i12 == 5) {
            com.avito.android.lib.util.b.a(bxContentBottomSheetBehavior);
        } else {
            bxContentBottomSheetBehavior.b(i12);
        }
        bxContentBottomSheetBehavior.v(c29243p1);
    }

    @Override // com.avito.android.bxcontent.Y0
    public final void t2() {
        this.f112711c0.k(null);
    }

    public final void v(int i12) {
        C22771k c22771kD;
        ViewGroup viewGroup = this.f112720f0;
        if (viewGroup != null) {
            com.avito.android.lib.util.i.f181373a.getClass();
            int i13 = 0;
            if (com.avito.android.lib.util.i.f181377e && (c22771kD = com.avito.android.lib.util.i.d(this.f112707b)) != null) {
                i13 = c22771kD.f44776b;
            }
            viewGroup.setPadding(viewGroup.getPaddingLeft(), i13 + i12, viewGroup.getPaddingRight(), viewGroup.getPaddingBottom());
        }
        this.f112754r.b(i12);
    }

    @Override // com.avito.android.bxcontent.Y0
    public final void v5(boolean z12) {
        this.f112680N0.f162196b = z12;
    }

    @Override // com.avito.android.bxcontent.Y0
    public final void vW(@Y61.l com.avito.android.bxcontent.mvi.entity.u uVar, @Y61.l String str, @Y61.k com.avito.android.bxcontent.analytics.a aVar) {
        if (uVar != null) {
            C43617a c43617a = this.f112661E;
            c43617a.getClass();
            kotlin.reflect.n<Object> nVar = C43617a.f413588V[0];
            if (((Boolean) c43617a.f413610b.a().invoke()).booleanValue()) {
                this.f112681O.o(new com.avito.android.bxcontent.scroll_listener.c(this.f112691T, this.f112770z, this.f112758t, new p(uVar, this, aVar, str)));
            }
        }
    }

    @Override // com.avito.android.advertising.kebab.a
    public final void vm(@Y61.l AvitoNetworkBanner.MarkInfo markInfo, @Y61.k List list, @Y61.k com.avito.android.advertising.kebab.g gVar, @Y61.k BannerInfo bannerInfo) {
        this.f112675L.vm(markInfo, list, gVar, bannerInfo);
    }

    @Override // com.avito.android.bxcontent.Y0
    public final void vn(boolean z12) {
        r(z12);
        SwipeRefreshLayout swipeRefreshLayout = this.f112757s0;
        com.avito.android.bxcontent.vertical_toolbar.category_filter_toolbar.p pVar = this.f112712c1;
        if (z12) {
            com.avito.android.bxcontent.vertical_toolbar.category_filter_toolbar.n nVar = pVar.f113115v;
            AppBarLayout appBarLayout = pVar.f113095b;
            if (nVar != null) {
                appBarLayout.f(nVar);
                pVar.f113115v = null;
            }
            com.avito.android.bxcontent.vertical_toolbar.category_filter_toolbar.n nVar2 = new com.avito.android.bxcontent.vertical_toolbar.category_filter_toolbar.n(pVar, 0);
            appBarLayout.a(nVar2);
            pVar.f113115v = nVar2;
            D6.H(appBarLayout);
            D6.H(pVar.f113096c);
            D6.H(pVar.f113097d);
            D6.H(pVar.f113106m);
            D6.H(pVar.f113102i);
            swipeRefreshLayout.setOnChildScrollUpCallback(new C28962a1(this, 0));
            v(y6.b(36));
        } else {
            AppBarLayout appBarLayout2 = pVar.f113095b;
            D6.w(appBarLayout2);
            D6.w(pVar.f113096c);
            D6.w(pVar.f113097d);
            D6.w(pVar.f113106m);
            D6.w(pVar.f113102i);
            com.avito.android.bxcontent.vertical_toolbar.category_filter_toolbar.n nVar3 = pVar.f113115v;
            if (nVar3 != null) {
                appBarLayout2.f(nVar3);
                pVar.f113115v = null;
            }
            ValueAnimator valueAnimator = pVar.f113118y;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            swipeRefreshLayout.setOnChildScrollUpCallback(null);
            v(this.f112738l0);
        }
        this.f112707b.requestLayout();
    }

    public final void w(a aVar) {
        if (aVar == this.f112670I0) {
            return;
        }
        int iOrdinal = aVar.ordinal();
        if (iOrdinal == 0) {
            this.f112708b0.addOnLayoutChangeListener(this.f112730i1);
        } else if (iOrdinal == 1) {
            this.f112724g1.f269987b.addOnLayoutChangeListener(this.f112727h1);
        } else if (iOrdinal == 2) {
            this.f112754r.c(this.f112753q0);
        }
        this.f112670I0 = aVar;
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void w50(@Y61.l PinnedItem pinnedItem) {
        this.f112663F.w50(pinnedItem);
    }

    public final void x(boolean z12) {
        if (this.f112734k.isMain()) {
            return;
        }
        View view = this.f112685Q;
        int iMax = Math.max((D6.y(view) && z12) ? view.getMeasuredHeight() : 0, this.f112738l0);
        com.avito.konveyor.item_visibility_tracker.b bVar = this.f112710c;
        bVar.b(bVar.getF338539c().left, iMax, bVar.getF338539c().right, bVar.getF338539c().bottom);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void xL(@Y61.k BxContentBusiness360.ReplaceMain.ToastReplaceMain toastReplaceMain, @Y61.k Y41.a aVar) {
        OnboardingType onboardingType = OnboardingType.f209409b;
        this.f112663F.xL(toastReplaceMain, aVar);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void xU(@Y61.k NavigationBarStyle.NavigationIconOnboarding navigationIconOnboarding, @Y61.k Y41.a aVar, @Y61.k Y41.a aVar2) {
        OnboardingType onboardingType = OnboardingType.f209409b;
        this.f112663F.xU(navigationIconOnboarding, aVar, aVar2);
    }

    @Override // com.avito.android.bxcontent.Y0
    public final void xZ(@Y61.k String str) {
        boolean zEquals = str.equals("personal_infinite_feed");
        com.avito.android.home.z zVar = this.f112739l1;
        IgnoreTopPaddingTouchScrollDirectionAwareRecyclerView ignoreTopPaddingTouchScrollDirectionAwareRecyclerView = this.f112681O;
        if (!zEquals) {
            ignoreTopPaddingTouchScrollDirectionAwareRecyclerView.v0(zVar);
        } else if (this.f112756s.f439745a.f439749b.a()) {
            ignoreTopPaddingTouchScrollDirectionAwareRecyclerView.v0(zVar);
            ignoreTopPaddingTouchScrollDirectionAwareRecyclerView.o(zVar);
        }
    }

    @Override // com.avito.android.bxcontent.Y0
    public final void yR(boolean z12) {
        IgnoreTopPaddingTouchScrollDirectionAwareRecyclerView ignoreTopPaddingTouchScrollDirectionAwareRecyclerView = this.f112681O;
        if (z12) {
            RecyclerView.Adapter adapter = ignoreTopPaddingTouchScrollDirectionAwareRecyclerView.getAdapter();
            if (adapter != null) {
                adapter.registerAdapterDataObserver(new e());
            }
        } else {
            ignoreTopPaddingTouchScrollDirectionAwareRecyclerView.post(new RunnableC28965b1(this, 0));
        }
        ignoreTopPaddingTouchScrollDirectionAwareRecyclerView.addOnLayoutChangeListener(new d());
    }

    @Override // com.avito.android.bxcontent.Y0
    public final void yl(@Y61.k com.avito.android.serp.adapter.G0 g02) {
        C13894a c13894a = this.f112672J0;
        c13894a.getClass();
        ArrayList arrayList = g02.f268501b;
        c13894a.f16710r = arrayList;
        com.avito.android.serp.adapter.vertical_main.vertical_filter.s sVar = this.f112674K0;
        sVar.getClass();
        sVar.f16710r = arrayList;
        C13159a c13159a = this.f112676L0;
        c13159a.getClass();
        c13159a.f16710r = arrayList;
        com.avito.android.serp.adapter.vertical_main.featured.header.d dVar = this.f112678M0;
        dVar.getClass();
        dVar.f16710r = arrayList;
    }

    @Override // com.avito.android.bxcontent.Y0
    public final void zF(boolean z12) {
        com.avito.android.bxcontent.scroll_listener.b bVar = this.f112745n1;
        if (bVar != null) {
            bVar.f112831e = false;
        }
        if (!this.f112734k.isMap()) {
            this.f112691T.f272230O = z12;
            this.f112757s0.setRefreshing(false);
        } else {
            BxContentBottomSheetBehavior<FrameLayout> bxContentBottomSheetBehavior = this.f112668H0;
            if (bxContentBottomSheetBehavior == null) {
                return;
            }
            bxContentBottomSheetBehavior.f355974K = z12;
        }
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void zw(@Y61.k Tab.Onboarding onboarding, @Y61.k Y41.a aVar, @Y61.k Y41.a aVar2, @Y61.k Y41.a aVar3, @Y61.k String str, int i12) {
        OnboardingType onboardingType = OnboardingType.f209409b;
        this.f112663F.zw(onboarding, aVar, aVar2, aVar3, str, i12);
    }
}
