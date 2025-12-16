package com.avito.android.str_seller_orders.common.items.order_stub;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OrderStubItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/common/items/order_stub/a;", "Lcom/avito/conveyor_item/a;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f288792b;

    public a(@k String str) {
        this.f288792b = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && L.f(this.f288792b, ((a) obj).f288792b);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF287660b() {
        return getF286142f().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF286142f() {
        return this.f288792b;
    }

    public final int hashCode() {
        return this.f288792b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("OrderStubItem(stringId="), this.f288792b, ')');
    }
}
