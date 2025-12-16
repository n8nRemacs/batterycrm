package com.avito.android.profile_settings_extended;

import android.os.Parcelable;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.avito.android.R;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.beduin_shared.model.action.custom.BeduinScrollPosition;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.profile_settings_extended.adapter.link_edit.LinkEditItem;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import com.avito.beduin.v2.render.android_view.BeduinView;
import java.util.Arrays;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import wc0.C49597b;
import wc0.C49600e;
import wc0.C49602g;
import wc0.C49605j;
import wc0.C49607l;
import yc0.k;
import yc0.s;

/* compiled from: ExtendedProfileSettingsMviView.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/B;", "", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f228958a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final J f228959b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.a f228960c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f228961d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final aU0.b f228962e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.di.c f228963f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final h31.e<com.avito.android.profile_settings_extended.adapter.gallery.image.j> f228964g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.engine.component.B f228965h;

    /* renamed from: i, reason: collision with root package name */
    public final int f228966i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final SwipeRefreshLayout f228967j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final C49600e f228968k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final C49597b f228969l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final C49607l f228970m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final C49602g f228971n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final C49605j f228972o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.extended_profile_ui_components.d f228973p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.extended_profile_ui_components.l f228974q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public BeduinView f228975r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final FrameLayout f228976s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public View f228977t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f228978u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.l
    public Parcelable f228979v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.l
    public com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.i f228980w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.beduin.view.recyclerview.g f228981x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final h f228982y;

    /* compiled from: ExtendedProfileSettingsMviView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lyc0/k;", "action", "Lkotlin/G0;", "invoke", "(Lyc0/k;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<yc0.k, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(yc0.k kVar) {
            B.this.f228959b.accept(kVar);
            return G0.f406611a;
        }
    }

    /* compiled from: ExtendedProfileSettingsMviView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            B.this.f228959b.accept(yc0.f.f443251a);
            return G0.f406611a;
        }
    }

    /* compiled from: ExtendedProfileSettingsMviView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lyc0/k;", "it", "Lkotlin/G0;", "invoke", "(Lyc0/k;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<yc0.k, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(yc0.k kVar) {
            B.this.f228959b.accept(kVar);
            return G0.f406611a;
        }
    }

    /* compiled from: ExtendedProfileSettingsMviView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends kotlin.jvm.internal.N implements Y41.a<G0> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            B.this.f228959b.accept(new k.b(false, null, 2, null));
            return G0.f406611a;
        }
    }

    /* compiled from: ExtendedProfileSettingsMviView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lyc0/k;", "it", "Lkotlin/G0;", "invoke", "(Lyc0/k;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends kotlin.jvm.internal.N implements Y41.l<yc0.k, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(yc0.k kVar) {
            B.this.f228959b.accept(kVar);
            return G0.f406611a;
        }
    }

    /* compiled from: ExtendedProfileSettingsMviView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends kotlin.jvm.internal.N implements Y41.l<DeepLink, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            B.this.f228959b.accept(new k.a(deepLink));
            return G0.f406611a;
        }
    }

    /* compiled from: ExtendedProfileSettingsMviView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/link_edit/LinkEditItem$Action;", "action", "Lcom/avito/android/profile_settings_extended/adapter/link_edit/LinkEditItem;", "item", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/profile_settings_extended/adapter/link_edit/LinkEditItem$Action;Lcom/avito/android/profile_settings_extended/adapter/link_edit/LinkEditItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends kotlin.jvm.internal.N implements Y41.p<LinkEditItem.Action, LinkEditItem, G0> {
        public g() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(LinkEditItem.Action action, LinkEditItem linkEditItem) {
            B.this.f228959b.accept(new s.a(action, linkEditItem));
            return G0.f406611a;
        }
    }

    /* compiled from: ExtendedProfileSettingsMviView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lyc0/z;", "action", "Lkotlin/G0;", "invoke", "(Lyc0/z;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends kotlin.jvm.internal.N implements Y41.l<yc0.z, G0> {
        public i() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(yc0.z zVar) {
            B.this.f228959b.accept(zVar);
            return G0.f406611a;
        }
    }

    /* compiled from: ExtendedProfileSettingsMviView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends kotlin.jvm.internal.N implements Y41.l<DeepLink, G0> {
        public j() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            B.this.f228959b.accept(new k.a(deepLink));
            return G0.f406611a;
        }
    }

    public B(@Y61.k View view, @Y61.k J j12, @Y61.k com.avito.konveyor.a aVar, @Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k aU0.b bVar, @Y61.k com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.di.c cVar, @Y61.k h31.e<com.avito.android.profile_settings_extended.adapter.gallery.image.j> eVar, @Y61.k com.avito.beduin.v2.engine.component.B b12, @Y61.k com.avito.android.util.text.a aVar2) {
        this.f228958a = view;
        this.f228959b = j12;
        this.f228960c = aVar;
        this.f228961d = screenPerformanceTracker;
        this.f228962e = bVar;
        this.f228963f = cVar;
        this.f228964g = eVar;
        this.f228965h = b12;
        int iD2 = com.avito.android.actions_sheet.a.d(view, R.dimen.extended_profile_settings_horizontal_margin);
        this.f228966i = iD2;
        View viewFindViewById = view.findViewById(R.id.swipe_refresh_layout);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.swiperefreshlayout.widget.SwipeRefreshLayout");
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) viewFindViewById;
        this.f228967j = swipeRefreshLayout;
        this.f228968k = new C49600e(view.getContext(), new e(), new f());
        this.f228969l = new C49597b(view.getContext(), new c());
        this.f228970m = new C49607l(view.getContext(), iD2, new j());
        this.f228971n = new C49602g(view.getContext(), iD2, new g());
        this.f228972o = new C49605j(view.getContext(), new i());
        this.f228973p = new com.avito.android.extended_profile_ui_components.d(view.getContext(), iD2, aVar2, new a(), new b());
        com.avito.android.extended_profile_ui_components.l lVar = new com.avito.android.extended_profile_ui_components.l(new d(), view);
        D6.c(lVar.f153356d, null, null, null, Integer.valueOf(y6.b(46)), 7);
        this.f228974q = lVar;
        View viewFindViewById2 = view.findViewById(R.id.extended_profile_settings_content_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        this.f228976s = (FrameLayout) viewFindViewById2;
        this.f228981x = new com.avito.android.beduin.view.recyclerview.g(view.getContext(), BeduinScrollPosition.f105279b, null, 4, null);
        this.f228982y = new h();
        int[] iArrA = com.avito.android.lib.deprecated_design.c.a(swipeRefreshLayout.getContext(), false);
        swipeRefreshLayout.setColorSchemeColors(Arrays.copyOf(iArrA, iArrA.length));
        swipeRefreshLayout.setProgressBackgroundColorSchemeColor(C35835l0.d(R.attr.white, swipeRefreshLayout.getContext()));
        swipeRefreshLayout.setOnRefreshListener(new com.avito.android.offlinization.ui.a(this, 9));
    }

    public final void a() {
        com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.i iVar = this.f228980w;
        if (iVar != null) {
            com.avito.android.profile_settings_extended.entity.u uVar = this.f228959b.getState().getValue().f443264a.f230661b;
            List<com.avito.android.profile_settings_extended.entity.v> list = uVar != null ? uVar.f230357b : null;
            if (list == null) {
                list = C42784z0.f406748b;
            }
            A a12 = new A(this, 1);
            com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.g gVar = iVar.f151395h;
            if (gVar != null) {
                gVar.f151384v = list;
                gVar.u(a12);
                gVar.f151386x = true;
            }
        }
    }

    /* compiled from: ExtendedProfileSettingsMviView.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/profile_settings_extended/B$h", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class h extends RecyclerView.r {
        public h() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void k(@Y61.k RecyclerView recyclerView, int i12, int i13) {
            View view = B.this.f228977t;
            if (view != null) {
                view.setTranslationY(view.getTranslationY() - i13);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void i(int i12, @Y61.k RecyclerView recyclerView) {
        }
    }
}
