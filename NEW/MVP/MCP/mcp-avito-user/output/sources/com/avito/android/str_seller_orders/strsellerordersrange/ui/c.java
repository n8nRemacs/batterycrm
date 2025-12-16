package com.avito.android.str_seller_orders.strsellerordersrange.ui;

import Y61.k;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.skeleton.shimmer.ShimmerFrameLayout;
import kotlin.Metadata;

/* compiled from: StrSellerOrdersRangeViewHolder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerordersrange/ui/c;", "", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Toolbar f290341a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f290342b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ShimmerFrameLayout f290343c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final RecyclerView f290344d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final View f290345e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ImageView f290346f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final TextView f290347g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final TextView f290348h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final Button f290349i;

    public c(@k View view) {
        this.f290341a = (Toolbar) view.findViewById(R.id.toolbar_with_shimmer);
        this.f290342b = (TextView) view.findViewById(R.id.toolbar_header);
        this.f290343c = (ShimmerFrameLayout) view.findViewById(R.id.toolbar_stub);
        this.f290344d = (RecyclerView) view.findViewById(R.id.recycler_view);
        this.f290345e = view.findViewById(R.id.error_state_group);
        this.f290346f = (ImageView) view.findViewById(R.id.error_iv);
        this.f290347g = (TextView) view.findViewById(R.id.error_title_tv);
        this.f290348h = (TextView) view.findViewById(R.id.error_subtitle_tv);
        this.f290349i = (Button) view.findViewById(R.id.retry_btn);
    }
}
