package com.avito.android.str_seller_orders.orders_seller.items.filters;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FiltersItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_seller/items/filters/c;", "Lcom/avito/conveyor_item/a;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<com.avito.conveyor_item.a> f289453b;

    public c(@k List list) {
        this.f289453b = list;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        cVar.getClass();
        return L.f(this.f289453b, cVar.f289453b);
    }

    @Override // TV0.a
    public final long getId() {
        return -1264986921;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF286342b() {
        return "filters_item";
    }

    public final int hashCode() {
        return this.f289453b.hashCode() - 559888887;
    }

    @k
    public final String toString() {
        return H.p(new StringBuilder("FiltersItem(stringId=filters_item, filters="), this.f289453b, ')');
    }
}
