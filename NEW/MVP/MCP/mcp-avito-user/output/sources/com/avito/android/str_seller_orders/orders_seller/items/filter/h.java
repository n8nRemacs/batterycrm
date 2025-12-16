package com.avito.android.str_seller_orders.orders_seller.items.filter;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: FilterView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_seller/items/filter/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/str_seller_orders/orders_seller/items/filter/g;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f289444b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f289445c;

    /* renamed from: d, reason: collision with root package name */
    public final int f289446d;

    public h(@k View view) {
        super(view);
        this.f289444b = view;
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f289445c = (TextView) viewFindViewById;
        this.f289446d = y6.b(4);
    }

    @Override // com.avito.android.str_seller_orders.orders_seller.items.filter.g
    public final void X(@k Y41.a<G0> aVar) {
        D6.a(aVar, this.f289444b);
    }

    @Override // com.avito.android.str_seller_orders.orders_seller.items.filter.g
    public final void Yi(boolean z12) {
        TextView textView = this.f289445c;
        if (z12) {
            FV.a.f4720a.f(textView, R.attr.textIconExpandMore, this.f289446d);
        } else {
            FV.a.f4720a.getClass();
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
    }

    @Override // com.avito.android.str_seller_orders.orders_seller.items.filter.g
    public final void setSelected(boolean z12) {
        this.f289444b.setSelected(z12);
    }

    @Override // com.avito.android.str_seller_orders.orders_seller.items.filter.g
    public final void setText(@l String str) {
        this.f289445c.setText(str);
    }
}
