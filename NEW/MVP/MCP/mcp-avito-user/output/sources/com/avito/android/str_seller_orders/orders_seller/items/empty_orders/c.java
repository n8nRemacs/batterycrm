package com.avito.android.str_seller_orders.orders_seller.items.empty_orders;

import Y61.k;
import Y61.l;
import kotlin.Metadata;

/* compiled from: EmptyOrdersItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_seller/items/empty_orders/c;", "Lcom/avito/conveyor_item/a;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {
    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        ((c) obj).getClass();
        return true;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF322725b() {
        return -1273483205;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF276272b() {
        return "empty_orders_item";
    }

    public final int hashCode() {
        return -1273483205;
    }

    @k
    public final String toString() {
        return "EmptyOrdersItem(stringId=empty_orders_item)";
    }
}
