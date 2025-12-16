package com.avito.android.str_seller_orders.orders_filters.items.toggle;

import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrOrdersFiltersTogglePayload.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_filters/items/toggle/f;", "", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class f {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final kV.b f289178a;

    public f(@l kV.b bVar) {
        this.f289178a = bVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && L.f(this.f289178a, ((f) obj).f289178a);
    }

    public final int hashCode() {
        kV.b bVar = this.f289178a;
        if (bVar == null) {
            return 0;
        }
        return bVar.hashCode();
    }

    @Y61.k
    public final String toString() {
        return "StrOrdersFiltersTogglePayload(toggleState=" + this.f289178a + ')';
    }
}
