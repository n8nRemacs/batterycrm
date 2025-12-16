package com.avito.android.work_profile.profile.gig.ui;

import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.avito.android.R;
import com.avito.konveyor.adapter.d;
import kd0.C42670a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: GigRenderer.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/work_profile/profile/gig/ui/b;", "", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f331167a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Y41.a<G0> f331168b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final d f331169c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final C42670a f331170d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final SwipeRefreshLayout f331171e;

    /* renamed from: f, reason: collision with root package name */
    public final RecyclerView f331172f;

    /* compiled from: GigRenderer.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<View> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final View invoke() {
            View viewFindViewById = b.this.f331167a.findViewById(R.id.gig_fragment_list);
            if (viewFindViewById != null) {
                return viewFindViewById;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
    }

    public b(@k View view, @k Y41.a<G0> aVar, @k d dVar, @k RecyclerView.l lVar) {
        this.f331167a = view;
        this.f331168b = aVar;
        this.f331169c = dVar;
        View viewFindViewById = view.findViewById(R.id.gig_progress_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f331170d = new C42670a((ViewGroup) viewFindViewById, new a(), 0, 4, null);
        View viewFindViewById2 = view.findViewById(R.id.swipe_refresh_layout);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.swiperefreshlayout.widget.SwipeRefreshLayout");
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) viewFindViewById2;
        swipeRefreshLayout.setOnRefreshListener(new com.avito.android.str_seller_orders.orders_seller.d(this, 16));
        this.f331171e = swipeRefreshLayout;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.gig_fragment_list);
        this.f331172f = recyclerView;
        recyclerView.setAdapter(dVar);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.l(lVar, -1);
    }
}
