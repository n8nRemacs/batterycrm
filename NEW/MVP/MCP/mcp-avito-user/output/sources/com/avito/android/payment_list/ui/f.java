package com.avito.android.payment_list.ui;

import Y61.k;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.lib.design.skeleton.shimmer.ShimmerLayout;
import com.avito.android.mortgage.root.list.items.legacy_status.i;
import com.avito.android.util.C35835l0;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: PaymentListRenderer.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/payment_list/ui/f;", "", "_avito_gig_payment-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f215027a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.d f215028b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Y41.a<G0> f215029c;

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f215030d;

    /* renamed from: e, reason: collision with root package name */
    public final ShimmerLayout f215031e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f215032f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final SwipeRefreshLayout f215033g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final List<View> f215034h;

    /* compiled from: PaymentListRenderer.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/payment_list/ui/f$a", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_gig_payment-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends RecyclerView.r {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void k(@k RecyclerView recyclerView, int i12, int i13) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) LinearLayoutManager.class.cast(recyclerView.getLayoutManager());
            int iO02 = linearLayoutManager != null ? linearLayoutManager.o0() : 0;
            boolean z12 = (linearLayoutManager != null ? linearLayoutManager.M1() : 0) >= iO02 + (-4);
            if (iO02 <= 0 || !z12) {
                return;
            }
            f fVar = f.this;
            if (!fVar.f215032f || i13 <= 0) {
                return;
            }
            fVar.f215032f = false;
            fVar.f215029c.invoke();
        }
    }

    public f(@k View view, @k com.avito.konveyor.adapter.d dVar, @k Y41.a<G0> aVar, @k Y41.a<G0> aVar2, @k Y41.a<G0> aVar3, @k RecyclerView.l lVar) {
        this.f215027a = view;
        this.f215028b = dVar;
        this.f215029c = aVar3;
        NavBar navBar = (NavBar) view.findViewById(R.id.navbar);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.content_list);
        this.f215030d = recyclerView;
        this.f215031e = (ShimmerLayout) view.findViewById(R.id.loading);
        ImageView imageView = (ImageView) view.findViewById(R.id.error_logo);
        TextView textView = (TextView) view.findViewById(R.id.error_title);
        TextView textView2 = (TextView) view.findViewById(R.id.error_subtitle);
        Button button = (Button) view.findViewById(R.id.refresh_button);
        this.f215032f = true;
        View viewFindViewById = view.findViewById(R.id.swipe_refresh_layout);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.swiperefreshlayout.widget.SwipeRefreshLayout");
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) viewFindViewById;
        swipeRefreshLayout.setOnRefreshListener(new com.avito.android.advert.item.beduin.v2.di.b(3, aVar2));
        this.f215033g = swipeRefreshLayout;
        this.f215034h = C42745f0.U(imageView, textView, textView2, button);
        navBar.setState(new com.avito.android.lib.design.nav_bar.a(C35835l0.h(R.attr.ic_arrowBack24, view.getContext()), aVar, false, view.getResources().getString(R.string.payment_list_title), null, null, null, 116, null));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(dVar);
        recyclerView.l(lVar, -1);
        imageView.setImageResource(R.drawable.placeholders_img_general_error);
        textView.setText(view.getResources().getString(R.string.payment_list_error_title));
        textView2.setText(view.getResources().getString(R.string.payment_list_error_subtitle));
        com.avito.android.lib.design.button.b.a(button, view.getResources().getString(R.string.payment_list_error_button_text), false);
        button.setOnClickListener(new i(17, aVar2));
        recyclerView.o(new a());
    }
}
