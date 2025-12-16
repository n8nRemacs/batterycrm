package com.avito.android.str_seller_orders.strsellerorders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.skeleton.shimmer.ShimmerFrameLayout;
import kotlin.Metadata;

/* compiled from: StrSellerOrdersViewHolder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerorders/j;", "", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Toolbar f289815a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f289816b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ShimmerFrameLayout f289817c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f289818d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final SwipeRefreshLayout f289819e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final View f289820f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ImageView f289821g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final TextView f289822h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final TextView f289823i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Button f289824j;

    public j(@Y61.k View view) {
        this.f289815a = (Toolbar) view.findViewById(R.id.toolbar_with_shimmer);
        this.f289816b = (TextView) view.findViewById(R.id.toolbar_header);
        this.f289817c = (ShimmerFrameLayout) view.findViewById(R.id.toolbar_stub);
        this.f289818d = (RecyclerView) view.findViewById(R.id.recycler_view);
        this.f289819e = (SwipeRefreshLayout) view.findViewById(R.id.swipe_refresh_view);
        this.f289820f = view.findViewById(R.id.error_state_group);
        this.f289821g = (ImageView) view.findViewById(R.id.error_iv);
        this.f289822h = (TextView) view.findViewById(R.id.error_title_tv);
        this.f289823i = (TextView) view.findViewById(R.id.error_subtitle_tv);
        this.f289824j = (Button) view.findViewById(R.id.retry_btn);
    }
}
