package com.avito.android.str_seller_orders.strsellerorders.mvi.items.header_stub;

import Y61.k;
import Y61.l;
import kotlin.Metadata;

/* compiled from: HeaderStubItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerorders/mvi/items/header_stub/a;", "Lcom/avito/conveyor_item/a;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {
    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        ((a) obj).getClass();
        return true;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF322725b() {
        return 539419085;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF276272b() {
        return "header_stub_item_";
    }

    public final int hashCode() {
        return 539419085;
    }

    @k
    public final String toString() {
        return "HeaderStubItem(stringId=header_stub_item_)";
    }
}
