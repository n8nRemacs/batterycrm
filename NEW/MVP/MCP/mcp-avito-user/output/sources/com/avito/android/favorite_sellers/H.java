package com.avito.android.favorite_sellers;

import FC.a;
import Oi0.InterfaceC14698b;
import Pz.C14860a;
import android.view.View;
import androidx.recyclerview.widget.C23418i;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.view.C22981N;
import androidx.view.InterfaceC22983P;
import com.avito.android.R;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.component.toast.c;
import com.avito.android.dialog.InterfaceC30274a;
import com.avito.android.lib.design.tab_bar.TabBarLayout;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.R0;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.d2;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.t1;

/* compiled from: FavoriteSellersView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite_sellers/H;", "Lcom/avito/android/favorite_sellers/O;", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class H implements O {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f155428b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final FavoriteSellersFragment f155429c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final J f155430d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22983P f155431e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.recycler.responsive.e f155432f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.component.toast.util.c f155433g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43160i<C14860a> f155434h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.favorite.n f155435i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_collection_toast.b f155436j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.common.a f155437k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30274a f155438l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f155439m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final SwipeRefreshLayout f155440n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final View f155441o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f155442p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.toast_bar.k f155443q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final View f155444r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.recycler.responsive.j f155445s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.extended_profile_ui_components.l f155446t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public com.avito.android.subscriptions_settings.d f155447u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final C43238h f155448v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final I f155449w;

    /* compiled from: FavoriteSellersView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.N f155450l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.a<G0> aVar) {
            super(0);
            this.f155450l = (kotlin.jvm.internal.N) aVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.a
        public final G0 invoke() {
            this.f155450l.invoke();
            return G0.f406611a;
        }
    }

    public H(@Y61.k View view, @Y61.k FavoriteSellersFragment favoriteSellersFragment, @Y61.k J j12, @Y61.k InterfaceC22983P interfaceC22983P, @Y61.k d2 d2Var, @Y61.k d2 d2Var2, @Y61.k InterfaceC14698b interfaceC14698b, @Y61.k com.avito.android.recycler.responsive.e eVar, @Y61.k com.avito.android.component.toast.util.c cVar, @Y61.k InterfaceC43160i interfaceC43160i, @Y61.k com.avito.android.favorite.n nVar, @Y61.k com.avito.android.advert_collection_toast.b bVar, @Y61.k com.avito.android.common.a aVar, @Y61.k InterfaceC30274a interfaceC30274a, @Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k R0 r02) {
        this.f155428b = view;
        this.f155429c = favoriteSellersFragment;
        this.f155430d = j12;
        this.f155431e = interfaceC22983P;
        this.f155432f = eVar;
        this.f155433g = cVar;
        this.f155434h = interfaceC43160i;
        this.f155435i = nVar;
        this.f155436j = bVar;
        this.f155437k = aVar;
        this.f155438l = interfaceC30274a;
        this.f155439m = screenPerformanceTracker;
        View viewFindViewById = view.findViewById(R.id.swipe_refresh_layout);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.swiperefreshlayout.widget.SwipeRefreshLayout");
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) viewFindViewById;
        this.f155440n = swipeRefreshLayout;
        View viewFindViewById2 = view.findViewById(R.id.empty);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f155441o = viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.recycler);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById3;
        TabBarLayout.a.e(TabBarLayout.f180679h, recyclerView, 0, 3);
        this.f155442p = recyclerView;
        View viewFindViewById4 = view.findViewById(R.id.undo_progress);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f155444r = viewFindViewById4;
        com.avito.android.recycler.responsive.j jVar = new com.avito.android.recycler.responsive.j(eVar, interfaceC14698b);
        this.f155445s = jVar;
        this.f155446t = new com.avito.android.extended_profile_ui_components.l(new y(this), view);
        this.f155448v = kotlinx.coroutines.U.a(CoroutineContext.Element.DefaultImpls.plus((V0) t1.b(), r02.b()));
        this.f155449w = new I(this);
        int[] iArrA = com.avito.android.lib.deprecated_design.c.a(swipeRefreshLayout.getContext(), false);
        swipeRefreshLayout.setColorSchemeColors(Arrays.copyOf(iArrA, iArrA.length));
        swipeRefreshLayout.setProgressBackgroundColorSchemeColor(C35835l0.d(R.attr.white, swipeRefreshLayout.getContext()));
        swipeRefreshLayout.setOnRefreshListener(new com.avito.android.beduin.ui.screen.fragment.bottom_sheet.c(this, 19));
        jVar.setHasStableIds(true);
        recyclerView.setAdapter(jVar);
        view.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setItemAnimator(new C23418i());
        cVar.b(this);
        C43259k.d(C22981N.a(interfaceC22983P.getLifecycle()), null, null, new C30598w(interfaceC22983P, this, d2Var, null), 3);
        C43259k.d(C22981N.a(interfaceC22983P.getLifecycle()), null, null, new C30599x(interfaceC22983P, this, d2Var2, null), 3);
    }

    @Override // com.avito.android.component.toast.util.g
    public final void a(@Y61.k PrintableText printableText, int i12, @Y61.l String str, @Y61.l Y41.a aVar, @Y61.k ToastBarPosition toastBarPosition, @Y61.k com.avito.android.component.toast.f fVar) {
        com.avito.android.component.toast.c.e(com.avito.android.component.toast.c.f125244a, this.f155428b, i12 != 0 ? com.avito.android.printable_text.b.c(i12, new Serializable[0]) : printableText, null, (str == null || aVar == null) ? C42784z0.f406748b : Collections.singletonList(new c.a.C3719a(str, true, null, new G(aVar), 4, null)), null, fVar, 2750, toastBarPosition, false, false, null, null, this.f155439m, 3978);
    }

    public final void b(boolean z12) {
        a.g gVar = new a.g(z12);
        J j12 = this.f155430d;
        j12.accept(gVar);
        I i12 = this.f155449w;
        RecyclerView recyclerView = this.f155442p;
        if (z12) {
            recyclerView.o(i12);
            return;
        }
        recyclerView.v0(i12);
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        j12.accept(new a.n(new X(linearLayoutManager.K1(), linearLayoutManager.M1(), linearLayoutManager.L1())));
    }

    public final void c(Y41.a<G0> aVar) {
        View view = this.f155428b;
        this.f155443q = com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, view, com.avito.android.printable_text.b.c(R.string.undo_hint, new Serializable[0]), null, Collections.singletonList(new c.a.C3719a(view.getContext().getString(R.string.undo_button), true, null, new a(aVar), 4, null)), null, null, 0, null, null, false, false, new C30597v(this, 0), null, 3066);
    }
}
