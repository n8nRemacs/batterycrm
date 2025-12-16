package com.avito.android.messenger.blacklist.mvi;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C23424o;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.blacklist.mvi.G;
import com.avito.android.messenger.l0;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35971x;
import com.avito.android.util.D6;
import java.util.List;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;

/* compiled from: BlacklistView.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/blacklist/mvi/P;", "Lcom/avito/android/messenger/blacklist/mvi/O;", "Landroidx/recyclerview/widget/RecyclerView$r;", "b", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class P extends RecyclerView.r implements O {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f186379n = {m0.f406844a.f(new a0("lastRenderedState", "getLastRenderedState(Lcom/avito/android/mvi/RendererWithDiff;)Lcom/avito/android/messenger/blacklist/mvi/BlacklistPresenter$State;", P.class))};

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f186380b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.a f186381c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.progress_overlay.l f186382d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f186383e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Object f186384f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final l0 f186385g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final SwipeRefreshLayout f186386h;

    /* renamed from: i, reason: collision with root package name */
    public final View f186387i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final C35971x f186388j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f186389k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.core.z<G0> f186390l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f186391m;

    /* compiled from: BlacklistView.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            com.jakewharton.rxrelay3.c cVar = P.this.f186389k;
            G0 g02 = G0.f406611a;
            cVar.accept(g02);
            return g02;
        }
    }

    /* compiled from: BlacklistView.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/messenger/blacklist/mvi/P$b;", "Lcom/avito/android/mvi/a;", "Lcom/avito/android/messenger/blacklist/mvi/G$a;", "LEY/a;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends com.avito.android.mvi.a<G.a, EY.a> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f186393a = new b();

        @Override // com.avito.android.mvi.a
        public final boolean a(EY.a aVar, EY.a aVar2) {
            return aVar.equals(aVar2);
        }

        @Override // com.avito.android.mvi.a
        public final boolean b(EY.a aVar, EY.a aVar2) {
            return kotlin.jvm.internal.L.f(aVar.getF162850b(), aVar2.getF162850b());
        }

        /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.List<EY.a>] */
        @Override // com.avito.android.mvi.a
        public final List<EY.a> d(G.a aVar) {
            G.a aVar2 = aVar;
            if (aVar2 != null) {
                return aVar2.f186358d;
            }
            return null;
        }
    }

    /* compiled from: BlacklistView.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/konveyor/adapter/j;", "invoke", "()Lcom/avito/konveyor/adapter/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<com.avito.konveyor.adapter.j> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.konveyor.adapter.j invoke() {
            P p12 = P.this;
            com.avito.konveyor.adapter.j jVar = new com.avito.konveyor.adapter.j(p12.f186380b, p12.f186381c);
            p12.f186383e.setAdapter(jVar);
            return jVar;
        }
    }

    /* compiled from: BlacklistView.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends kotlin.jvm.internal.N implements Y41.a<G0> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            com.jakewharton.rxrelay3.c cVar = P.this.f186391m;
            G0 g02 = G0.f406611a;
            cVar.accept(g02);
            return g02;
        }
    }

    public P(@Y61.k View view, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.konveyor.a aVar, @Y61.k com.avito.konveyor.adapter.a aVar2) {
        this.f186380b = aVar2;
        this.f186381c = aVar;
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l((ViewGroup) view.findViewById(R.id.blacklist_content_holder), R.id.content, interfaceC28373a, 0, 0, 24, null);
        this.f186382d = lVar;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.blacklist_list);
        this.f186383e = recyclerView;
        view.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        this.f186384f = C42727D.b(LazyThreadSafetyMode.f406616d, new c());
        l0 l0Var = new l0(linearLayoutManager, new d());
        this.f186385g = l0Var;
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.blacklist_swipe_refresh);
        this.f186386h = swipeRefreshLayout;
        this.f186387i = view.findViewById(R.id.blacklist_empty_placeholder);
        this.f186388j = new C35971x();
        this.f186389k = new com.jakewharton.rxrelay3.c();
        this.f186390l = com.jakewharton.rxbinding4.swiperefreshlayout.b.a(swipeRefreshLayout);
        this.f186391m = new com.jakewharton.rxrelay3.c();
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.o(l0Var);
        recyclerView.setItemAnimator(null);
        swipeRefreshLayout.setColorSchemeColors(C35835l0.d(R.attr.blue, view.getContext()), C35835l0.d(R.attr.violet, view.getContext()), C35835l0.d(R.attr.green, view.getContext()), C35835l0.d(R.attr.red, view.getContext()));
        swipeRefreshLayout.setProgressBackgroundColorSchemeColor(C35835l0.d(R.attr.white, view.getContext()));
        lVar.f231600j = new a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.mvi.g
    public final Object c() {
        kotlin.reflect.n<Object> nVar = f186379n[0];
        return (G.a) this.f186388j.f319122b;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, com.avito.android.messenger.blacklist.mvi.G$a] */
    @Override // com.avito.android.mvi.g
    public final void h(G.a aVar, C23424o.e eVar) {
        G.a aVar2 = aVar;
        G.a.b.C5465b c5465b = G.a.b.C5465b.f186360a;
        G.a.b bVar = aVar2.f186355a;
        boolean zF2 = kotlin.jvm.internal.L.f(bVar, c5465b);
        com.avito.android.progress_overlay.l lVar = this.f186382d;
        if (zF2) {
            lVar.j();
        } else if (kotlin.jvm.internal.L.f(bVar, G.a.b.c.f186361a)) {
            lVar.k(null);
        } else if (kotlin.jvm.internal.L.f(bVar, G.a.b.C5464a.f186359a)) {
            lVar.a("");
        }
        ?? r02 = aVar2.f186358d;
        boolean zIsEmpty = r02.isEmpty();
        View view = this.f186387i;
        if (zIsEmpty) {
            D6.H(view);
        } else {
            D6.w(view);
        }
        this.f186380b.c(new UV0.c(r02));
        ?? r03 = this.f186384f;
        if (eVar != null) {
            eVar.b((RecyclerView.Adapter) r03.getValue());
        } else {
            ((RecyclerView.Adapter) r03.getValue()).notifyDataSetChanged();
        }
        SwipeRefreshLayout swipeRefreshLayout = this.f186386h;
        boolean z12 = swipeRefreshLayout.f54568d;
        boolean z13 = aVar2.f186356b;
        if (z12 != z13) {
            swipeRefreshLayout.setRefreshing(z13);
        }
        l0 l0Var = this.f186385g;
        boolean z14 = l0Var.f196428e;
        boolean z15 = aVar2.f186357c;
        if (z14 != z15) {
            l0Var.f196428e = z15;
            l0Var.l();
        }
        kotlin.reflect.n<Object> nVar = f186379n[0];
        this.f186388j.f319122b = aVar2;
    }
}
