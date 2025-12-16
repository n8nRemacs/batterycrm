package com.avito.android.messenger.channels.mvi.view;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.view.InterfaceC23042i0;
import androidx.view.Lifecycle;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.tab_bar.TabBarLayout;
import com.avito.android.messenger.channels.adapter.ChannelsListItem;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35971x;
import com.jakewharton.rxbinding4.view.C37722i;
import java.util.concurrent.TimeUnit;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;

/* compiled from: ChannelsListView.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/view/H;", "Lcom/avito/android/messenger/channels/mvi/view/G;", "Lkotlin/G0;", "onPause", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class H implements G {

    /* renamed from: K, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f188652K = {m0.f406844a.f(new kotlin.jvm.internal.a0("lastRenderedState", "getLastRenderedState(Lcom/avito/android/mvi/Renderer;)Lcom/avito/android/messenger/channels/mvi/list_feature/entity/ChannelsListState;", H.class))};

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f188653A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.core.z<G0> f188654B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f188655C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<HY.c> f188656D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f188657E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super ChannelsListItem.b, G0> f188658F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.l
    public Y41.p<? super ChannelsListItem.b, ? super Boolean, G0> f188659G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.l
    public Y41.p<? super ChannelsListItem.b, ? super Boolean, G0> f188660H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f188661I;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final C35971x f188662J;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f188663b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.channels.analytics.d f188664c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.d f188665d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f188666e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Object f188667f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Object f188668g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f188669h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final LinearLayoutManager f188670i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final SwipeRefreshLayout f188671j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final View f188672k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final TextView f188673l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final TextView f188674m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final Button f188675n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.progress_overlay.l f188676o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final View f188677p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.toast_bar.b f188678q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.toast_bar.k f188679r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.bottom_sheet.o f188680s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.confirmation_dialog.a f188681t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f188682u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f188683v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final j0 f188684w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.core.z<G0> f188685x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final Object f188686y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final Object f188687z;

    /* compiled from: ChannelsListView.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            com.jakewharton.rxrelay3.c<G0> cVar = H.this.f188653A;
            G0 g02 = G0.f406611a;
            cVar.accept(g02);
            return g02;
        }
    }

    /* compiled from: ChannelsListView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<Context> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final Context invoke() {
            return H.this.f188663b.getContext();
        }
    }

    /* compiled from: ChannelsListView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/reactivex/rxjava3/core/z;", "Lkotlin/G0;", "invoke", "()Lio/reactivex/rxjava3/core/z;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<io.reactivex.rxjava3.core.z<G0>> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final io.reactivex.rxjava3.core.z<G0> invoke() {
            H h12 = H.this;
            return com.jakewharton.rxbinding4.recyclerview.n.a(h12.f188669h).d0(M.f188699b).i0(h12.f188683v).j0(io.reactivex.rxjava3.android.schedulers.b.b()).N(new N(h12)).D0(500L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b).j0(io.reactivex.rxjava3.android.schedulers.b.b());
        }
    }

    /* compiled from: ChannelsListView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/content/res/Resources;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends kotlin.jvm.internal.N implements Y41.a<Resources> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final Resources invoke() {
            return H.this.f188663b.getResources();
        }
    }

    /* compiled from: ChannelsListView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/reactivex/rxjava3/core/z;", "Lkotlin/G0;", "invoke", "()Lio/reactivex/rxjava3/core/z;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends kotlin.jvm.internal.N implements Y41.a<io.reactivex.rxjava3.core.z<G0>> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final io.reactivex.rxjava3.core.z<G0> invoke() {
            return com.jakewharton.rxbinding4.recyclerview.n.a(H.this.f188669h).n0(500L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b).d0(O.f188701b).j0(io.reactivex.rxjava3.android.schedulers.b.b());
        }
    }

    public H(@Y61.k View view, @Y61.k k0 k0Var, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.messenger.channels.analytics.d dVar, @Y61.k com.avito.konveyor.adapter.d dVar2, boolean z12) {
        this.f188663b = view;
        this.f188664c = dVar;
        this.f188665d = dVar2;
        this.f188666e = z12;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        this.f188667f = C42727D.b(lazyThreadSafetyMode, new b());
        this.f188668g = C42727D.b(lazyThreadSafetyMode, new d());
        View viewFindViewById = view.findViewById(R.id.list);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        TabBarLayout.a.e(TabBarLayout.f180679h, recyclerView, 0, 3);
        this.f188669h = recyclerView;
        view.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        this.f188670i = linearLayoutManager;
        View viewFindViewById2 = view.findViewById(com.avito.android.R.id.swipe_refresh_layout);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.swiperefreshlayout.widget.SwipeRefreshLayout");
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) viewFindViewById2;
        this.f188671j = swipeRefreshLayout;
        View viewFindViewById3 = view.findViewById(R.id.empty);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f188672k = viewFindViewById3;
        View viewFindViewById4 = view.findViewById(com.avito.android.R.id.empty_title);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f188673l = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(com.avito.android.R.id.empty_subtitle);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f188674m = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(com.avito.android.R.id.empty_unread_btn);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById6;
        this.f188675n = button;
        View viewFindViewById7 = view.findViewById(com.avito.android.R.id.bottom_guideline);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f188677p = viewFindViewById7;
        this.f188681t = new com.avito.android.messenger.conversation.confirmation_dialog.a(c());
        this.f188683v = new com.jakewharton.rxrelay3.c<>();
        this.f188684w = k0Var.a(recyclerView, linearLayoutManager, view.findViewById(com.avito.android.R.id.tooltip_anchor_view));
        this.f188685x = C37722i.a(button);
        this.f188686y = C42727D.b(lazyThreadSafetyMode, new c());
        this.f188687z = C42727D.b(lazyThreadSafetyMode, new e());
        this.f188653A = new com.jakewharton.rxrelay3.c<>();
        this.f188654B = com.jakewharton.rxbinding4.swiperefreshlayout.b.a(swipeRefreshLayout);
        this.f188655C = new com.jakewharton.rxrelay3.c<>();
        this.f188656D = new com.jakewharton.rxrelay3.c<>();
        this.f188662J = new C35971x();
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(false);
        Context context = view.getContext();
        dVar.b(recyclerView);
        swipeRefreshLayout.setColorSchemeColors(C35835l0.d(com.avito.android.R.attr.blue, context), C35835l0.d(com.avito.android.R.attr.violet, context), C35835l0.d(com.avito.android.R.attr.green, context), C35835l0.d(com.avito.android.R.attr.red, context));
        swipeRefreshLayout.setProgressBackgroundColorSchemeColor(C35835l0.d(com.avito.android.R.attr.white, context));
        View viewFindViewById8 = view.findViewById(com.avito.android.R.id.content_holder);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l((ViewGroup) viewFindViewById8, com.avito.android.R.id.content, interfaceC28373a, 0, 0, 24, null);
        lVar.f231600j = new a();
        this.f188676o = lVar;
    }

    @InterfaceC23042i0(Lifecycle.Event.ON_PAUSE)
    private final void onPause() {
        this.f188663b.post(new L(this));
        this.f188684w.c();
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.g
    public final void K3() {
        this.f188669h.A0(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.mvi.e
    public final HY.h a(com.avito.android.mvi.e<HY.h> eVar) {
        kotlin.reflect.n<Object> nVar = f188652K[0];
        return (HY.h) this.f188662J.f319122b;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [HY.h, T] */
    @Override // com.avito.android.mvi.e
    public final void b(Object obj) {
        kotlin.reflect.n<Object> nVar = f188652K[0];
        this.f188662J.f319122b = (HY.h) obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    public final Context c() {
        return (Context) this.f188667f.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x01d3  */
    @Override // com.avito.android.mvi.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(com.avito.android.mvi.e<HY.h> r10, HY.h r11, HY.h r12) {
        /*
            Method dump skipped, instructions count: 698
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.channels.mvi.view.H.d(com.avito.android.mvi.e, java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    public final Resources e() {
        return (Resources) this.f188668g.getValue();
    }
}
