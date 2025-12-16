package com.avito.android.str_seller_orders.orders_seller;

import Y41.l;
import Y61.k;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.skeleton.shimmer.ShimmerFrameLayout;
import dz0.InterfaceC39834b;
import i31.InterfaceC41220a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import tz0.InterfaceC48745a;

/* compiled from: StrSellerOrdersViewHolder.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_seller/e;", "", "a", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l<InterfaceC48745a, G0> f289363a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.d f289364b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.str_seller_orders.orders_seller.items.c f289365c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Toolbar f289366d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f289367e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ShimmerFrameLayout f289368f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final RecyclerView f289369g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final SwipeRefreshLayout f289370h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final View f289371i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final ImageView f289372j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final TextView f289373k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final TextView f289374l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final Button f289375m;

    /* compiled from: StrSellerOrdersViewHolder.kt */
    @i31.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_seller/e$a;", "", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        e a(@k View view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @i31.c
    public e(@InterfaceC41220a @k View view, @k l<? super InterfaceC48745a, G0> lVar, @InterfaceC39834b @k com.avito.konveyor.adapter.d dVar, @k com.avito.android.str_seller_orders.orders_seller.items.c cVar) {
        this.f289363a = lVar;
        this.f289364b = dVar;
        this.f289365c = cVar;
        View viewFindViewById = view.findViewById(R.id.toolbar_with_shimmer);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        }
        this.f289366d = (Toolbar) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.toolbar_header);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f289367e = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.toolbar_stub);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.skeleton.shimmer.ShimmerFrameLayout");
        }
        this.f289368f = (ShimmerFrameLayout) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.items);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        this.f289369g = (RecyclerView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.swipe_refresh_view);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.swiperefreshlayout.widget.SwipeRefreshLayout");
        }
        this.f289370h = (SwipeRefreshLayout) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.error_state_group);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f289371i = viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.error_iv);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f289372j = (ImageView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.error_title_tv);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f289373k = (TextView) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.error_subtitle_tv);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f289374l = (TextView) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R.id.retry_btn);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f289375m = (Button) viewFindViewById10;
    }
}
