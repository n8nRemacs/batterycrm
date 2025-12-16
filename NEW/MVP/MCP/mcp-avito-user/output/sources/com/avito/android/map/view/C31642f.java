package com.avito.android.map.view;

import HV.a;
import a90.ViewOnLayoutChangeListenerC19701a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.U;
import androidx.fragment.app.FragmentManager;
import bY.InterfaceC25585b;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.avito_map.AvitoMapView;
import com.avito.android.avito_map.marker.MarkerItem;
import com.avito.android.component.snackbar.d;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.design.animation.AnimationView;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.floating_container.FloatingContainer;
import com.avito.android.lib.design.spinner.Spinner;
import com.avito.android.lib.design.tab_bar.TabBarLayout;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.lib.design.toast_bar.state.ToastBarState;
import com.avito.android.map.mvi.entity.a;
import com.avito.android.map.mvi.entity.b;
import com.avito.android.map_core.view.draw_button.DrawButton;
import com.avito.android.map_core.view.draw_button.DrawButtonRedesign;
import com.avito.android.map_core.view.draw_button.DrawingState;
import com.avito.android.map_core.view.find_me.FindMeButton;
import com.avito.android.map_core.view.zoom.ZoomButton;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.shortcut_navigation_bar.C34991h;
import com.avito.android.shortcut_navigation_bar.InlineAction;
import com.avito.android.shortcut_navigation_bar.InlineActions;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.K6;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import gY.C40635a;
import hY.C40893a;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: MapView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map/view/f;", "Lcom/avito/android/map/view/a;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.map.view.f, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C31642f implements InterfaceC31637a {

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public final DrawButton f185470A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.k
    public final FloatingActionButton f185471B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.k
    public final View f185472C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.k
    public final View f185473D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final View f185474E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    public final TextView f185475F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.k
    public final TextView f185476G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.k
    public final Spinner f185477H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.k
    public final View f185478I;

    /* renamed from: J, reason: collision with root package name */
    public final int f185479J;

    /* renamed from: K, reason: collision with root package name */
    public final int f185480K;

    /* renamed from: L, reason: collision with root package name */
    public final int f185481L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final ViewStub f185482M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.l
    public final ViewStub f185483N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.l
    public final ViewStub f185484O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.l
    public DrawButtonRedesign f185485P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.l
    public FindMeButton f185486Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.l
    public ZoomButton f185487R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.l
    public Button f185488S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.l
    public View f185489T;

    /* renamed from: U, reason: collision with root package name */
    @Y61.l
    public View f185490U;

    /* renamed from: V, reason: collision with root package name */
    public final int f185491V;

    /* renamed from: W, reason: collision with root package name */
    public final int f185492W;

    /* renamed from: X, reason: collision with root package name */
    public final float f185493X;

    /* renamed from: Y, reason: collision with root package name */
    public final float f185494Y;

    /* renamed from: Z, reason: collision with root package name */
    public final int f185495Z;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final MapCoordinatorLayout f185496a;

    /* renamed from: a0, reason: collision with root package name */
    public final int f185497a0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f185498b;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.l
    public View f185499b0;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final FloatingContainer f185500c;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C<com.avito.android.component.snackbar.d> f185501c0;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final u f185502d;

    /* renamed from: d0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.toast_bar.k f185503d0;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC25585b, G0> f185504e;

    /* renamed from: e0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.toast_bar.k f185505e0;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.map.view.adverts_in_pin.a f185506f;

    /* renamed from: f0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.toast_bar.k f185507f0;

    /* renamed from: g, reason: collision with root package name */
    public final Context f185508g;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f185509g0;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final androidx.appcompat.view.d f185510h;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f185511h0;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final AvitoMapView f185512i;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f185513i0;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.progress_overlay.l f185514j;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f185515j0;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final View f185516k;

    /* renamed from: k0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.map_core.utils.i f185517k0;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final View f185518l;

    /* renamed from: l0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.component.snackbar.d f185519l0;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final View f185520m;

    /* renamed from: m0, reason: collision with root package name */
    @Y61.l
    public final TextView f185521m0;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final View f185522n;

    /* renamed from: n0, reason: collision with root package name */
    @Y61.l
    public final Button f185523n0;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public final View f185524o;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.map_core.utils.h f185525o0;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final FloatingActionButton f185526p;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f185527p0;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final ZoomButton f185528q;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.toast_bar.k f185529q0;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final FrameLayout f185530r;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public final ViewOnLayoutChangeListenerC19701a f185531r0;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final FrameLayout f185532s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f185533t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final AnimationView f185534u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f185535v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final ImageView f185536w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final Spinner f185537x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final TextView f185538y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.l
    public final FrameLayout f185539z;

    /* compiled from: MapView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.map.view.f$a */
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[InlineAction.Predefined.State.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                InlineAction.Predefined.State state = InlineAction.Predefined.State.f283118b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                InlineAction.Predefined.State state2 = InlineAction.Predefined.State.f283118b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[DrawingState.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                DrawingState drawingState = DrawingState.f185715b;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                DrawingState drawingState2 = DrawingState.f185715b;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                DrawingState drawingState3 = DrawingState.f185715b;
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: MapView.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/component/snackbar/d;", "invoke", "()Lcom/avito/android/component/snackbar/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.map.view.f$b */
    public static final class b extends N implements Y41.a<com.avito.android.component.snackbar.d> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.component.snackbar.d invoke() {
            d.a aVar = com.avito.android.component.snackbar.d.f125235c;
            C31642f c31642f = C31642f.this;
            com.avito.android.component.snackbar.d dVarA = d.a.a(aVar, c31642f.f185496a, R.string.empty_map_message, -2, null, 0, 1016);
            BaseTransientBottomBar.j jVar = dVarA.f125236a.f357285i;
            K6 k62 = new K6(new g(dVarA), jVar);
            if (jVar.getViewTreeObserver().isAlive()) {
                jVar.getViewTreeObserver().addOnPreDrawListener(k62);
            }
            TextView textViewA = com.avito.android.component.snackbar.h.a(dVarA);
            textViewA.setHeight(c31642f.f185508g.getResources().getDimensionPixelSize(R.dimen.search_map_bottom_panel_height));
            textViewA.setGravity(16);
            return dVarA;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C31642f(@Y61.k MapCoordinatorLayout mapCoordinatorLayout, @Y61.k View view, @Y61.k FloatingContainer floatingContainer, @Y61.k u uVar, @Y61.k FragmentManager fragmentManager, @Y61.k Y41.l<? super InterfaceC25585b, G0> lVar, @Y61.k com.avito.android.map.view.adverts_in_pin.a aVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        int i12;
        this.f185496a = mapCoordinatorLayout;
        this.f185498b = view;
        this.f185500c = floatingContainer;
        this.f185502d = uVar;
        this.f185504e = lVar;
        this.f185506f = aVar;
        Context context = mapCoordinatorLayout.getContext();
        this.f185508g = context;
        this.f185510h = new androidx.appcompat.view.d(mapCoordinatorLayout.getContext(), R.style.Theme_DesignSystem_Re23);
        this.f185512i = (AvitoMapView) mapCoordinatorLayout.findViewById(R.id.map_view);
        this.f185514j = new com.avito.android.progress_overlay.l((ViewGroup) mapCoordinatorLayout.findViewById(R.id.progress_overlay_container), R.id.map_view, interfaceC28373a, 0, 0, 24, null);
        this.f185516k = mapCoordinatorLayout.findViewById(R.id.map_control_buttons_container);
        this.f185518l = mapCoordinatorLayout.findViewById(R.id.buttons_container);
        this.f185520m = mapCoordinatorLayout.findViewById(R.id.search_map_view_landscape_control_buttons);
        this.f185522n = mapCoordinatorLayout.findViewById(R.id.map_onboarding_button_container);
        this.f185524o = mapCoordinatorLayout.findViewById(R.id.map_onboarding_landscape_button_container);
        View viewFindViewById = mapCoordinatorLayout.findViewById(R.id.find_me_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.floatingactionbutton.FloatingActionButton");
        }
        this.f185526p = (FloatingActionButton) viewFindViewById;
        View viewFindViewById2 = mapCoordinatorLayout.findViewById(R.id.zoom_map);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.map_core.view.zoom.ZoomButton");
        }
        ZoomButton zoomButton = (ZoomButton) viewFindViewById2;
        this.f185528q = zoomButton;
        View viewFindViewById3 = zoomButton.findViewById(R.id.zoomIn);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        this.f185530r = (FrameLayout) viewFindViewById3;
        View viewFindViewById4 = zoomButton.findViewById(R.id.zoomOut);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        this.f185532s = (FrameLayout) viewFindViewById4;
        View viewFindViewById5 = mapCoordinatorLayout.findViewById(R.id.static_map_onboarding_button);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f185533t = (SimpleDraweeView) viewFindViewById5;
        View viewFindViewById6 = mapCoordinatorLayout.findViewById(R.id.animated_map_onboarding_button);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.animation.AnimationView");
        }
        this.f185534u = (AnimationView) viewFindViewById6;
        View viewFindViewById7 = mapCoordinatorLayout.findViewById(R.id.subscribe_search_container);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f185535v = (LinearLayout) viewFindViewById7;
        View viewFindViewById8 = mapCoordinatorLayout.findViewById(R.id.subscribe_search_icon);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f185536w = (ImageView) viewFindViewById8;
        View viewFindViewById9 = mapCoordinatorLayout.findViewById(R.id.subscribe_search_spinner);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.spinner.Spinner");
        }
        this.f185537x = (Spinner) viewFindViewById9;
        View viewFindViewById10 = mapCoordinatorLayout.findViewById(R.id.subscribe_search_title);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f185538y = (TextView) viewFindViewById10;
        this.f185539z = (FrameLayout) mapCoordinatorLayout.findViewById(R.id.subscribe_search_elevation_stub_container);
        View viewFindViewById11 = mapCoordinatorLayout.findViewById(R.id.draw_map);
        if (viewFindViewById11 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.map_core.view.draw_button.DrawButton");
        }
        this.f185470A = (DrawButton) viewFindViewById11;
        View viewFindViewById12 = mapCoordinatorLayout.findViewById(R.id.close_map_button);
        if (viewFindViewById12 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.floatingactionbutton.FloatingActionButton");
        }
        this.f185471B = (FloatingActionButton) viewFindViewById12;
        View viewFindViewById13 = mapCoordinatorLayout.findViewById(R.id.search_map_bottom_panel);
        if (viewFindViewById13 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f185472C = viewFindViewById13;
        View viewFindViewById14 = viewFindViewById13.findViewById(R.id.bottom_panel_load_progress);
        if (viewFindViewById14 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f185473D = viewFindViewById14;
        View viewFindViewById15 = viewFindViewById13.findViewById(R.id.bottom_panel_error);
        if (viewFindViewById15 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f185474E = viewFindViewById15;
        View viewFindViewById16 = viewFindViewById13.findViewById(R.id.bottom_panel_error_retry);
        if (viewFindViewById16 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f185475F = (TextView) viewFindViewById16;
        View viewFindViewById17 = viewFindViewById13.findViewById(R.id.bottom_panel_show_list_button);
        if (viewFindViewById17 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f185476G = (TextView) viewFindViewById17;
        View viewFindViewById18 = mapCoordinatorLayout.findViewById(R.id.search_map_loader);
        if (viewFindViewById18 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.spinner.Spinner");
        }
        this.f185477H = (Spinner) viewFindViewById18;
        View viewFindViewById19 = mapCoordinatorLayout.findViewById(R.id.map_loader_overlay);
        if (viewFindViewById19 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f185478I = viewFindViewById19;
        TabBarLayout.a aVar2 = TabBarLayout.f180679h;
        aVar2.getClass();
        this.f185479J = TabBarLayout.a.c() ? TabBarLayout.a.b(mapCoordinatorLayout.getContext()) : 0;
        this.f185480K = mapCoordinatorLayout.getResources().getDimensionPixelSize(R.dimen.search_map_shortcuts_height);
        this.f185481L = mapCoordinatorLayout.getContext().getResources().getDimensionPixelSize(R.dimen.search_map_bottom_panel_height);
        View viewFindViewById20 = mapCoordinatorLayout.findViewById(R.id.subscribe_search_container_redesign_stub);
        if (viewFindViewById20 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewStub");
        }
        this.f185482M = (ViewStub) viewFindViewById20;
        this.f185483N = (ViewStub) mapCoordinatorLayout.findViewById(R.id.map_control_buttons_redesign_stub);
        this.f185484O = (ViewStub) mapCoordinatorLayout.findViewById(R.id.map_landscape_control_buttons_redesign_stub);
        this.f185491V = context.getResources().getDimensionPixelSize(R.dimen.search_map_controls_margin_redesign);
        this.f185492W = mapCoordinatorLayout.getResources().getDimensionPixelSize(R.dimen.search_map_buttons_padding);
        this.f185493X = 1000.0f;
        this.f185494Y = 2.0f;
        this.f185495Z = androidx.core.content.d.getColor(mapCoordinatorLayout.getContext(), R.color.common_blue);
        this.f185497a0 = androidx.core.content.d.getColor(mapCoordinatorLayout.getContext(), R.color.common_blue_alpha_8);
        this.f185501c0 = C42727D.c(new b());
        this.f185517k0 = new com.avito.android.map_core.utils.i();
        View viewFindViewById21 = mapCoordinatorLayout.findViewById(R.id.bottom_sheet);
        if (viewFindViewById21 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        FrameLayout frameLayout = (FrameLayout) viewFindViewById21;
        com.avito.android.map_core.utils.h hVar = new com.avito.android.map_core.utils.h(frameLayout);
        View viewInflate = hVar.f185691c.inflate(R.layout.search_map_dialog_empty_map, (ViewGroup) frameLayout, false);
        ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
        View view2 = hVar.f185692d;
        if (view2 != null) {
            frameLayout.removeView(view2);
        }
        if (layoutParams != null && ((i12 = layoutParams.height) == -2 || i12 == -1)) {
            ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
            layoutParams2.height = layoutParams.height;
            frameLayout.setLayoutParams(layoutParams2);
        }
        if (layoutParams != null) {
            frameLayout.addView(viewInflate, 0, layoutParams);
        } else {
            frameLayout.addView(viewInflate, 0);
        }
        hVar.f185692d = viewInflate;
        int iJ2 = D6.j(frameLayout, 154);
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = hVar.f185690b;
        bottomSheetBehavior.N(iJ2, false);
        hVar.a();
        hVar.f185693e = false;
        bottomSheetBehavior.M(false);
        View view3 = hVar.f185692d;
        this.f185521m0 = view3 != null ? (TextView) view3.findViewById(R.id.dialog_empty_map_title) : null;
        View view4 = hVar.f185692d;
        this.f185523n0 = view4 != null ? (Button) view4.findViewById(R.id.dialog_empty_map_action_button) : null;
        D6.g(frameLayout);
        TabBarLayout.a.e(aVar2, frameLayout, 0, 1);
        this.f185525o0 = hVar;
        this.f185531r0 = new ViewOnLayoutChangeListenerC19701a(this, 15);
    }

    public static void a(View view, long j12, long j13) {
        if (D6.y(view) && view.getAlpha() == 1.0f) {
            view.animate().cancel();
        } else {
            view.animate().alpha(1.0f).setDuration(j12).setStartDelay(j13).withStartAction(new U(view, 4)).start();
        }
    }

    public static /* synthetic */ void b(C31642f c31642f, View view, long j12, int i12) {
        if ((i12 & 1) != 0) {
            j12 = 75;
        }
        c31642f.getClass();
        a(view, j12, 0L);
    }

    public static void c(View view, long j12) {
        if (D6.y(view) && view.getAlpha() == 0.0f) {
            view.animate().cancel();
        } else if (j12 != 0) {
            view.animate().alpha(0.0f).setDuration(j12).withEndAction(new U(view, 5)).start();
        } else {
            view.animate().cancel();
            D6.w(view);
        }
    }

    public final Q<View, ToastBarPosition> d() {
        View view = this.f185472C;
        if (D6.y(view)) {
            return new Q<>(view, ToastBarPosition.f181044b);
        }
        Object obj = this.f185512i;
        if (obj == null) {
            obj = this.f185496a;
        }
        return new Q<>(obj, ToastBarPosition.f181047e);
    }

    public final void e(boolean z12) {
        View view = this.f185518l;
        if (view != null) {
            view.setVisibility(!z12 ? 0 : 8);
        }
        View view2 = this.f185516k;
        if (view2 != null) {
            view2.setVisibility(!z12 ? 0 : 8);
        }
        View view3 = this.f185520m;
        if (view3 != null) {
            view3.setVisibility(!z12 ? 0 : 8);
        }
        View view4 = this.f185489T;
        if (view4 != null) {
            view4.setVisibility(z12 ? 0 : 8);
        }
        View view5 = this.f185490U;
        if (view5 == null) {
            return;
        }
        view5.setVisibility(z12 ? 0 : 8);
    }

    public final void f(@Y61.l b.C5439b c5439b, @Y61.k b.C5439b c5439b2, @Y61.k b.j jVar, @Y61.l InlineActions inlineActions) {
        final InlineAction.Predefined predefinedA;
        Integer numA;
        Integer numA2;
        DrawButtonRedesign drawButtonRedesign;
        final InlineAction.Predefined predefinedA2;
        Integer numA3;
        Integer numA4;
        DrawButtonRedesign drawButtonRedesign2;
        DrawButtonRedesign drawButtonRedesign3;
        boolean z12 = c5439b2.f185218c;
        if ((c5439b == null || !c5439b.f185218c) && z12) {
            this.f185482M.inflate();
            ViewStub viewStub = this.f185483N;
            if (viewStub != null) {
                viewStub.inflate();
            }
            ViewStub viewStub2 = this.f185484O;
            if (viewStub2 != null) {
                viewStub2.inflate();
            }
            MapCoordinatorLayout mapCoordinatorLayout = this.f185496a;
            this.f185490U = mapCoordinatorLayout.findViewById(R.id.map_landscape_control_buttons_container_redesign);
            this.f185489T = mapCoordinatorLayout.findViewById(R.id.map_control_buttons_container_redesign);
            View viewFindViewById = mapCoordinatorLayout.findViewById(R.id.subscribe_search_button_redesign);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
            }
            this.f185488S = (Button) viewFindViewById;
            View viewFindViewById2 = mapCoordinatorLayout.findViewById(R.id.draw_map_redesign);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.map_core.view.draw_button.DrawButtonRedesign");
            }
            this.f185485P = (DrawButtonRedesign) viewFindViewById2;
            View viewFindViewById3 = mapCoordinatorLayout.findViewById(R.id.find_me_redesign);
            if (viewFindViewById3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.map_core.view.find_me.FindMeButton");
            }
            this.f185486Q = (FindMeButton) viewFindViewById3;
            View viewFindViewById4 = mapCoordinatorLayout.findViewById(R.id.zoom_map_redesign);
            if (viewFindViewById4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.map_core.view.zoom.ZoomButton");
            }
            this.f185487R = (ZoomButton) viewFindViewById4;
        }
        LinearLayout linearLayout = this.f185535v;
        DrawingState drawingState = c5439b2.f185219d;
        boolean z13 = c5439b2.f185216a;
        PresentationType presentationType = jVar.f185250a;
        SearchParams searchParams = jVar.f185252c;
        if (!z12) {
            e(false);
            boolean zF2 = L.f(searchParams.getCategoryId(), "111");
            DrawButton drawButton = this.f185470A;
            if (zF2) {
                D6.w(drawButton);
            }
            FloatingActionButton floatingActionButton = this.f185526p;
            ZoomButton zoomButton = this.f185528q;
            if (z13) {
                b(this, zoomButton, 75L, 2);
                b(this, floatingActionButton, 75L, 2);
                if (presentationType.isFullMap() && !zF2) {
                    b(this, drawButton, 75L, 2);
                }
            } else {
                c(zoomButton, 75L);
                c(floatingActionButton, 75L);
                if (!zF2) {
                    c(drawButton, 75L);
                }
            }
            drawButton.setState(drawingState);
            View view = this.f185520m;
            if (view != null) {
                CoordinatorLayout.g gVar = (CoordinatorLayout.g) view.getLayoutParams();
                if (presentationType.isRegularMap()) {
                    ((ViewGroup.MarginLayoutParams) gVar).topMargin = this.f185480K;
                } else {
                    ((ViewGroup.MarginLayoutParams) gVar).topMargin = this.f185498b.getHeight();
                }
                view.setLayoutParams(gVar);
            }
            Button button = this.f185488S;
            if (button != null) {
                D6.w(button);
            }
            if (inlineActions == null || (predefinedA = C34991h.a(inlineActions)) == null) {
                D6.w(linearLayout);
                return;
            }
            if (!z13) {
                c(linearLayout, 75L);
                return;
            }
            b(this, linearLayout, 75L, 2);
            boolean z14 = c5439b2.f185217b;
            Spinner spinner = this.f185537x;
            ImageView imageView = this.f185536w;
            InlineAction.Predefined.State state = predefinedA.f283117h;
            if (z14 || state == InlineAction.Predefined.State.f283120d) {
                D6.w(imageView);
                D6.H(spinner);
            } else {
                D6.H(imageView);
                D6.w(spinner);
            }
            int iOrdinal = state.ordinal();
            TextView textView = this.f185538y;
            if (iOrdinal == 0) {
                String str = predefinedA.f283112c;
                if (str != null && (numA = com.avito.android.lib.util.q.a(str)) != null) {
                    imageView.setImageDrawable(C35835l0.h(numA.intValue(), imageView.getContext()));
                }
                textView.setText(predefinedA.f283114e);
                D6.H(textView);
            } else if (iOrdinal == 1) {
                String str2 = predefinedA.f283111b;
                if (str2 != null && (numA2 = com.avito.android.lib.util.q.a(str2)) != null) {
                    imageView.setImageDrawable(C35835l0.h(numA2.intValue(), imageView.getContext()));
                }
                textView.setText(predefinedA.f283113d);
                D6.H(textView);
            }
            final int i12 = 0;
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.map.view.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i12) {
                        case 0:
                            Y41.l<InterfaceC25585b, G0> lVar = this.f185504e;
                            DeepLink deepLink = predefinedA.f283115f;
                            if (deepLink == null) {
                                lVar.invoke(InterfaceC25585b.G.f57125a);
                                break;
                            } else {
                                lVar.invoke(new InterfaceC25585b.C25595k(deepLink));
                                break;
                            }
                        default:
                            Y41.l<InterfaceC25585b, G0> lVar2 = this.f185504e;
                            DeepLink deepLink2 = predefinedA.f283115f;
                            if (deepLink2 == null) {
                                lVar2.invoke(InterfaceC25585b.G.f57125a);
                                break;
                            } else {
                                lVar2.invoke(new InterfaceC25585b.C25595k(deepLink2));
                                break;
                            }
                    }
                }
            });
            return;
        }
        e(true);
        boolean zF3 = L.f(searchParams.getCategoryId(), "111");
        if (zF3 && (drawButtonRedesign3 = this.f185485P) != null) {
            D6.w(drawButtonRedesign3);
        }
        if (z13) {
            ZoomButton zoomButton2 = this.f185487R;
            if (zoomButton2 != null) {
                b(this, zoomButton2, 75L, 2);
            }
            FindMeButton findMeButton = this.f185486Q;
            if (findMeButton != null) {
                b(this, findMeButton, 75L, 2);
            }
            if (presentationType.isFullMap() && !zF3 && (drawButtonRedesign2 = this.f185485P) != null) {
                b(this, drawButtonRedesign2, 75L, 2);
            }
        } else {
            ZoomButton zoomButton3 = this.f185487R;
            if (zoomButton3 != null) {
                c(zoomButton3, 75L);
            }
            FindMeButton findMeButton2 = this.f185486Q;
            if (findMeButton2 != null) {
                c(findMeButton2, 75L);
            }
            if (!zF3 && (drawButtonRedesign = this.f185485P) != null) {
                c(drawButtonRedesign, 75L);
            }
        }
        DrawButtonRedesign drawButtonRedesign4 = this.f185485P;
        if (drawButtonRedesign4 != null) {
            drawButtonRedesign4.setState(new C40635a(drawingState, new h(this)));
        }
        ZoomButton zoomButton4 = this.f185487R;
        if (zoomButton4 != null) {
            zoomButton4.setState(new com.avito.android.map_core.view.zoom.a(new i(this), new j(this)));
        }
        FindMeButton findMeButton3 = this.f185486Q;
        if (findMeButton3 != null) {
            findMeButton3.setState(new C40893a(new k(this)));
        }
        View view2 = this.f185490U;
        if (view2 != null) {
            CoordinatorLayout.g gVar2 = (CoordinatorLayout.g) view2.getLayoutParams();
            if (D6.y(this.f185472C)) {
                ((ViewGroup.MarginLayoutParams) gVar2).bottomMargin = this.f185481L;
            } else {
                ((ViewGroup.MarginLayoutParams) gVar2).bottomMargin = 0;
            }
            view2.setLayoutParams(gVar2);
        }
        D6.w(linearLayout);
        if (inlineActions == null || (predefinedA2 = C34991h.a(inlineActions)) == null) {
            Button button2 = this.f185488S;
            if (button2 != null) {
                D6.w(button2);
                return;
            }
            return;
        }
        if (!z13) {
            Button button3 = this.f185488S;
            if (button3 != null) {
                c(button3, 75L);
                return;
            }
            return;
        }
        Button button4 = this.f185488S;
        if (button4 != null) {
            b(this, button4, 75L, 2);
        }
        Button button5 = this.f185488S;
        if (button5 != null) {
            D6.c(button5, null, Integer.valueOf(F.a(button5) + c5439b2.f185220e + this.f185491V), null, null, 13);
        }
        int iOrdinal2 = predefinedA2.f283117h.ordinal();
        Context context = this.f185508g;
        if (iOrdinal2 == 0) {
            String str3 = predefinedA2.f283112c;
            if (str3 != null && (numA3 = com.avito.android.lib.util.q.a(str3)) != null) {
                int iIntValue = numA3.intValue();
                Button button6 = this.f185488S;
                if (button6 != null) {
                    Button.g(button6, C35835l0.h(iIntValue, context), null, false, null, 14);
                }
            }
            Button button7 = this.f185488S;
            if (button7 != null) {
                button7.setText(predefinedA2.f283114e);
            }
        } else if (iOrdinal2 == 1) {
            String str4 = predefinedA2.f283111b;
            if (str4 != null && (numA4 = com.avito.android.lib.util.q.a(str4)) != null) {
                int iIntValue2 = numA4.intValue();
                Button button8 = this.f185488S;
                if (button8 != null) {
                    Button.g(button8, C35835l0.h(iIntValue2, context), null, false, null, 14);
                }
            }
            Button button9 = this.f185488S;
            if (button9 != null) {
                button9.setText(predefinedA2.f283113d);
            }
        }
        Button button10 = this.f185488S;
        if (button10 != null) {
            final int i13 = 1;
            button10.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.map.view.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view22) {
                    switch (i13) {
                        case 0:
                            Y41.l<InterfaceC25585b, G0> lVar = this.f185504e;
                            DeepLink deepLink = predefinedA2.f283115f;
                            if (deepLink == null) {
                                lVar.invoke(InterfaceC25585b.G.f57125a);
                                break;
                            } else {
                                lVar.invoke(new InterfaceC25585b.C25595k(deepLink));
                                break;
                            }
                        default:
                            Y41.l<InterfaceC25585b, G0> lVar2 = this.f185504e;
                            DeepLink deepLink2 = predefinedA2.f283115f;
                            if (deepLink2 == null) {
                                lVar2.invoke(InterfaceC25585b.G.f57125a);
                                break;
                            } else {
                                lVar2.invoke(new InterfaceC25585b.C25595k(deepLink2));
                                break;
                            }
                    }
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0666  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x066e  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x067a  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0682  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x068e  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x06ca  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x06d5  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x06e3  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x06ef  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0709  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x070b  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0710  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0715  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0719  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x071d  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0738  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x074b  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0755  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x075e  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0770  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0783  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x079d  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x07a0  */
    /* JADX WARN: Type inference failed for: r11v4, types: [android.view.View, com.avito.android.avito_map.AvitoMapView] */
    /* JADX WARN: Type inference failed for: r5v102 */
    /* JADX WARN: Type inference failed for: r5v103, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v104 */
    /* JADX WARN: Type inference failed for: r5v99, types: [android.view.View, android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(@Y61.l com.avito.android.map.mvi.entity.b.d r52, @Y61.k com.avito.android.map.mvi.entity.b.d r53, @Y61.k com.avito.android.map.mvi.entity.b.j r54) {
        /*
            Method dump skipped, instructions count: 1962
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.map.view.C31642f.g(com.avito.android.map.mvi.entity.b$d, com.avito.android.map.mvi.entity.b$d, com.avito.android.map.mvi.entity.b$j):void");
    }

    public final void h(@Y61.l b.g gVar, @Y61.k b.g gVar2) {
        com.avito.android.component.snackbar.d dVar;
        com.avito.android.component.snackbar.d dVar2;
        a.d dVar3 = gVar != null ? gVar.f185241a : null;
        a.d dVar4 = gVar2.f185241a;
        MarkerItem.MyLocation myLocation = dVar4.f185198a;
        if (myLocation != null) {
            this.f185502d.b(myLocation);
        }
        boolean z12 = false;
        boolean z13 = (dVar3 == null || dVar3.f185200c) && !dVar4.f185200c;
        if ((dVar3 == null || dVar3.f185199b) && !dVar4.f185199b) {
            z12 = true;
        }
        if (gVar2.f185242b) {
            androidx.appcompat.view.d dVar5 = this.f185510h;
            Context context = this.f185508g;
            if (z13) {
                if (this.f185513i0) {
                    return;
                }
                this.f185513i0 = true;
                Q<View, ToastBarPosition> qD2 = d();
                View view = qD2.f406619b;
                ToastBarPosition toastBarPosition = qD2.f406620c;
                a.C0407a c0407a = HV.a.f7100w;
                int iJ2 = C35835l0.j(R.attr.toastBarDefault, dVar5);
                c0407a.getClass();
                HV.a aVarB = a.C0407a.b(iJ2, dVar5);
                this.f185505e0 = IV.a.c(dVar5, new ToastBarState(com.avito.android.printable_text.b.f(context.getString(R.string.location_permission_required)), view, toastBarPosition, null, Collections.singletonList(IV.a.b(aVarB, context.getString(R.string.permission_settings), dVar5, new s(this))), null, null, 2750, false, false, new q(this), null, 2664, null), aVarB);
                return;
            }
            if (!z12) {
                com.avito.android.lib.design.toast_bar.k kVar = this.f185505e0;
                if (kVar != null) {
                    IV.a.a(kVar);
                    return;
                }
                return;
            }
            if (this.f185513i0) {
                return;
            }
            this.f185513i0 = true;
            Q<View, ToastBarPosition> qD3 = d();
            View view2 = qD3.f406619b;
            ToastBarPosition toastBarPosition2 = qD3.f406620c;
            a.C0407a c0407a2 = HV.a.f7100w;
            int iJ3 = C35835l0.j(R.attr.toastBarDefault, dVar5);
            c0407a2.getClass();
            this.f185505e0 = IV.a.c(dVar5, new ToastBarState(com.avito.android.printable_text.b.f(context.getString(R.string.loc_providers_unavailable_message)), view2, toastBarPosition2, null, null, null, null, 2750, false, false, new r(this), null, 2680, null), a.C0407a.b(iJ3, dVar5));
            return;
        }
        MapCoordinatorLayout mapCoordinatorLayout = this.f185496a;
        if (z13) {
            com.avito.android.component.snackbar.d dVarA = d.a.a(com.avito.android.component.snackbar.d.f125235c, mapCoordinatorLayout, R.string.location_permission_required, 0, null, 0, 1016);
            Snackbar snackbar = dVarA.f125236a;
            CharSequence text = snackbar.f357284h.getText(R.string.permission_settings);
            com.avito.android.map_core.utils.i iVar = this.f185517k0;
            snackbar.k(text, iVar);
            com.avito.android.component.snackbar.h.b(dVarA);
            if (snackbar.f357297u == null) {
                snackbar.f357297u = new ArrayList();
            }
            snackbar.f357297u.add(iVar);
            com.avito.android.component.snackbar.h.a(dVarA).setMaxLines(3);
            this.f185519l0 = dVarA;
            if (snackbar.i() || (dVar2 = this.f185519l0) == null) {
                return;
            }
            dVar2.b();
            return;
        }
        if (!z12) {
            com.avito.android.component.snackbar.d dVar6 = this.f185519l0;
            if (dVar6 != null) {
                dVar6.a();
                return;
            }
            return;
        }
        com.avito.android.component.snackbar.d dVarA2 = d.a.a(com.avito.android.component.snackbar.d.f125235c, mapCoordinatorLayout, R.string.loc_providers_unavailable_message, 0, null, 0, 1016);
        Snackbar snackbar2 = dVarA2.f125236a;
        snackbar2.k(null, null);
        com.avito.android.component.snackbar.h.a(dVarA2).setMaxLines(3);
        this.f185519l0 = dVarA2;
        if (snackbar2.i() || (dVar = this.f185519l0) == null) {
            return;
        }
        dVar.b();
    }
}
