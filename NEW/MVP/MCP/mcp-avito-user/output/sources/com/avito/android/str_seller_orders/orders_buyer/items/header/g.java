package com.avito.android.str_seller_orders.orders_buyer.items.header;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.util.I5;
import kotlin.Metadata;

/* compiled from: HeaderView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_buyer/items/header/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/str_seller_orders/orders_buyer/items/header/f;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final TextView f289022b;

    public g(@k View view) {
        super(view);
        this.f289022b = view instanceof TextView ? (TextView) view : null;
    }

    @Override // com.avito.android.str_seller_orders.orders_buyer.items.header.f
    public final void v0(@l String str) {
        TextView textView = this.f289022b;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }
}
