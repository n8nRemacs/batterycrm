package com.avito.android.seller_coach.all_advices.view;

import Y61.k;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.progress_overlay.l;
import com.avito.android.review_gallery.g;
import com.avito.android.util.C35835l0;
import com.avito.konveyor.adapter.j;
import com.google.android.material.appbar.MaterialToolbar;
import io.reactivex.rxjava3.internal.operators.observable.C;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AllAdvicesView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/seller_coach/all_advices/view/e;", "", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.a f267422a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final f f267423b;

    /* renamed from: c, reason: collision with root package name */
    public final SwipeRefreshLayout f267424c;

    /* renamed from: d, reason: collision with root package name */
    public final MaterialToolbar f267425d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final l f267426e;

    /* renamed from: f, reason: collision with root package name */
    public int f267427f;

    /* renamed from: g, reason: collision with root package name */
    public int f267428g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final LinearLayoutManager f267429h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<G0> f267430i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<G0> f267431j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c f267432k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final C f267433l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c f267434m;

    /* compiled from: AllAdvicesView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/seller_coach/all_advices/view/e$a", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends RecyclerView.r {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void k(@k RecyclerView recyclerView, int i12, int i13) {
            e eVar = e.this;
            LinearLayoutManager linearLayoutManager = eVar.f267429h;
            int iH1 = linearLayoutManager.H1();
            int iL1 = linearLayoutManager.L1();
            if (iH1 == eVar.f267427f && iL1 == eVar.f267428g) {
                return;
            }
            eVar.f267427f = iH1;
            eVar.f267428g = iL1;
            eVar.f267423b.a(iH1, iL1);
        }
    }

    public e(@k View view, @k j jVar, @k InterfaceC28373a interfaceC28373a, @k com.avito.konveyor.adapter.a aVar, @k f fVar) {
        this.f267422a = aVar;
        this.f267423b = fVar;
        Context context = view.getContext();
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.srl_all_advices);
        this.f267424c = swipeRefreshLayout;
        MaterialToolbar materialToolbar = (MaterialToolbar) view.findViewById(R.id.tl_all_advices);
        this.f267425d = materialToolbar;
        View viewFindViewById = view.findViewById(R.id.fl_all_advices);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        l lVar = new l((ViewGroup) viewFindViewById, R.id.rv_all_advices, interfaceC28373a, 0, 0, 24, null);
        this.f267426e = lVar;
        this.f267427f = -1;
        this.f267428g = -1;
        com.jakewharton.rxrelay3.c<G0> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f267430i = cVar;
        com.jakewharton.rxrelay3.c<G0> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f267431j = cVar2;
        this.f267432k = cVar;
        this.f267433l = lVar.e();
        this.f267434m = cVar2;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_all_advices);
        this.f267429h = (LinearLayoutManager) recyclerView.getLayoutManager();
        recyclerView.setAdapter(jVar);
        recyclerView.o(new a());
        materialToolbar.setNavigationIcon(C35835l0.h(R.attr.ic_arrowBack24, context));
        materialToolbar.setNavigationOnClickListener(new g(this, 17));
        swipeRefreshLayout.setOnRefreshListener(new com.avito.android.offlinization.ui.a(this, 19));
    }
}
