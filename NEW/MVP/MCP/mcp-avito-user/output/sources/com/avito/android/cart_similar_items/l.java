package com.avito.android.cart_similar_items;

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
import j.InterfaceC42150f;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import mn.InterfaceC44101a;
import mn.InterfaceC44107g;

/* compiled from: CartSimilarItemsView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cart_similar_items/l;", "", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC44101a, G0> f115907a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.a<InterfaceC44107g> f115908b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final L f115909c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final AbstractC25658a<? extends RecyclerView.C> f115910d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.d f115911e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.cart_similar_items.konveyor.e f115912f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final MaterialToolbar f115913g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f115914h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final SwipeRefreshLayout f115915i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f115916j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f115917k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final View f115918l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.beduin_shared.model.progress_overlay.a f115919m;

    /* compiled from: CartSimilarItemsView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/cart_similar_items/l$a", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
            l lVar = l.this;
            InterfaceC44107g interfaceC44107gInvoke = lVar.f115908b.invoke();
            if (!(interfaceC44107gInvoke instanceof InterfaceC44107g.b) || ((InterfaceC44107g.b) interfaceC44107gInvoke).f414723a) {
                return;
            }
            lVar.f115907a.invoke(InterfaceC44101a.g.f414683a);
        }
    }

    /* compiled from: CartSimilarItemsView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<View> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final View invoke() {
            return l.this.f115918l;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(@Y61.k ViewGroup viewGroup, @InterfaceC42150f int i12, @Y61.k Y41.l<? super InterfaceC44101a, G0> lVar, @Y61.k Y41.a<? extends InterfaceC44107g> aVar, @Y61.k L l12, @Y61.k AbstractC25658a<? extends RecyclerView.C> abstractC25658a, @Y61.k com.avito.konveyor.adapter.d dVar, @Y61.k com.avito.android.cart_similar_items.konveyor.e eVar, int i13, @Y61.k ScreenPerformanceTracker screenPerformanceTracker) {
        this.f115907a = lVar;
        this.f115908b = aVar;
        this.f115909c = l12;
        this.f115910d = abstractC25658a;
        this.f115911e = dVar;
        this.f115912f = eVar;
        Context context = viewGroup.getContext();
        View viewFindViewById = viewGroup.findViewById(R.id.toolbar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.appbar.MaterialToolbar");
        }
        MaterialToolbar materialToolbar = (MaterialToolbar) viewFindViewById;
        materialToolbar.setNavigationIcon(C35835l0.h(i12, materialToolbar.getContext()));
        this.f115913g = materialToolbar;
        View viewFindViewById2 = viewGroup.findViewById(R.id.cart_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById2;
        this.f115914h = viewGroup2;
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
        this.f115915i = swipeRefreshLayout;
        View viewFindViewById5 = viewGroup.findViewById(R.id.top_list);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById5;
        this.f115916j = recyclerView;
        View viewFindViewById6 = viewGroup.findViewById(R.id.main_list);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView2 = (RecyclerView) viewFindViewById6;
        this.f115917k = recyclerView2;
        View viewFindViewById7 = viewGroup.findViewById(R.id.content_container);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f115918l = viewFindViewById7;
        View viewFindViewById8 = viewGroup.findViewById(R.id.overlay_container);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f115919m = new com.avito.android.beduin_shared.model.progress_overlay.a((ViewGroup) viewFindViewById8, new b());
        imageView.setImageTintList(C35835l0.e(R.attr.black, context));
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(abstractC25658a);
        screenPerformanceTracker.b(recyclerView2);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(i13);
        gridLayoutManager.f53667M = eVar;
        recyclerView2.setLayoutManager(gridLayoutManager);
        recyclerView2.setAdapter(dVar);
        recyclerView2.setHasFixedSize(true);
        recyclerView2.l(new com.avito.android.cart_similar_items.konveyor.d(C35835l0.f(R.attr.horizontalOffset, context), y6.b(12), y6.b(24), y6.b(16), y6.b(16)), -1);
        recyclerView2.o(new a());
        swipeRefreshLayout.setOnRefreshListener(new com.avito.android.beduin.ui.screen.fragment.bottom_sheet.c(this, 2));
    }
}
