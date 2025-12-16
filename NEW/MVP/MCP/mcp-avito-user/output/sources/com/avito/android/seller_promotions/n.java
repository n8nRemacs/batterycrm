package com.avito.android.seller_promotions;

import Oq0.c;
import Oq0.d;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import bj.AbstractC25658a;
import com.avito.android.R;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.L;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import com.google.android.material.appbar.MaterialToolbar;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SellerPromotionsView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/seller_promotions/n;", "", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Y41.l<Oq0.d, G0> f268073a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.a<Oq0.c> f268074b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final L f268075c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final AbstractC25658a<? extends RecyclerView.C> f268076d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.d f268077e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.seller_promotions.konveyor.e f268078f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final AbstractC25658a<? extends RecyclerView.C> f268079g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final MaterialToolbar f268080h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f268081i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final SwipeRefreshLayout f268082j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f268083k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f268084l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f268085m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final View f268086n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.beduin_shared.model.progress_overlay.a f268087o;

    /* compiled from: SellerPromotionsView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/seller_promotions/n$a", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends RecyclerView.r {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void k(@Y61.k RecyclerView recyclerView, int i12, int i13) {
            RecyclerView.Adapter adapter;
            RecyclerView.m layoutManager = recyclerView.getLayoutManager();
            GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
            if (gridLayoutManager == null || (adapter = recyclerView.getAdapter()) == null || adapter.getItemCount() - gridLayoutManager.M1() > 15) {
                return;
            }
            n nVar = n.this;
            Oq0.c cVarInvoke = nVar.f268074b.invoke();
            if (!(cVarInvoke instanceof c.b) || ((c.b) cVarInvoke).f12568a) {
                return;
            }
            nVar.f268073a.invoke(d.g.f12585a);
        }
    }

    /* compiled from: SellerPromotionsView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<View> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final View invoke() {
            return n.this.f268086n;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n(@Y61.k ViewGroup viewGroup, @Y61.k Y41.l<? super Oq0.d, G0> lVar, @Y61.k Y41.a<? extends Oq0.c> aVar, @Y61.k L l12, @Y61.k AbstractC25658a<? extends RecyclerView.C> abstractC25658a, @Y61.k com.avito.konveyor.adapter.d dVar, @Y61.k com.avito.android.seller_promotions.konveyor.e eVar, int i12, @Y61.k AbstractC25658a<? extends RecyclerView.C> abstractC25658a2, @Y61.k ScreenPerformanceTracker screenPerformanceTracker) {
        this.f268073a = lVar;
        this.f268074b = aVar;
        this.f268075c = l12;
        this.f268076d = abstractC25658a;
        this.f268077e = dVar;
        this.f268078f = eVar;
        this.f268079g = abstractC25658a2;
        Context context = viewGroup.getContext();
        View viewFindViewById = viewGroup.findViewById(R.id.toolbar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.appbar.MaterialToolbar");
        }
        this.f268080h = (MaterialToolbar) viewFindViewById;
        View viewFindViewById2 = viewGroup.findViewById(R.id.cart_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById2;
        this.f268081i = viewGroup2;
        View viewFindViewById3 = viewGroup2.findViewById(R.id.cart_button);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        ImageView imageView = (ImageView) viewFindViewById3;
        View viewFindViewById4 = viewGroup.findViewById(R.id.pull_to_refresh);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.swiperefreshlayout.widget.SwipeRefreshLayout");
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) viewFindViewById4;
        this.f268082j = swipeRefreshLayout;
        View viewFindViewById5 = viewGroup.findViewById(R.id.top_list);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById5;
        this.f268083k = recyclerView;
        View viewFindViewById6 = viewGroup.findViewById(R.id.main_list);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView2 = (RecyclerView) viewFindViewById6;
        this.f268084l = recyclerView2;
        View viewFindViewById7 = viewGroup.findViewById(R.id.bottom_list);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView3 = (RecyclerView) viewFindViewById7;
        this.f268085m = recyclerView3;
        View viewFindViewById8 = viewGroup.findViewById(R.id.content_container);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f268086n = viewFindViewById8;
        View viewFindViewById9 = viewGroup.findViewById(R.id.overlay_container);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f268087o = new com.avito.android.beduin_shared.model.progress_overlay.a((ViewGroup) viewFindViewById9, new b());
        imageView.setImageTintList(C35835l0.e(R.attr.black, context));
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(abstractC25658a);
        screenPerformanceTracker.b(recyclerView2);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(i12);
        gridLayoutManager.f53667M = eVar;
        recyclerView2.setLayoutManager(gridLayoutManager);
        recyclerView2.setAdapter(dVar);
        recyclerView2.setHasFixedSize(true);
        recyclerView2.l(new com.avito.android.seller_promotions.konveyor.d(C35835l0.f(R.attr.horizontalOffset, context), y6.b(12), y6.b(24), y6.b(16), y6.b(16)), -1);
        recyclerView2.o(new a());
        recyclerView3.setLayoutManager(new LinearLayoutManager());
        recyclerView3.setAdapter(abstractC25658a2);
        swipeRefreshLayout.setOnRefreshListener(new com.avito.android.offlinization.ui.a(this, 20));
    }
}
