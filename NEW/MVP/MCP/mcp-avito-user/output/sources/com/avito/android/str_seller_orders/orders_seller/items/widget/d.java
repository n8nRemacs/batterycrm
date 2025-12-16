package com.avito.android.str_seller_orders.orders_seller.items.widget;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WidgetContainerItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_seller/items/widget/d;", "Lcom/avito/conveyor_item/a;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class d implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f289505b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ArrayList f289506c;

    public d(@Y61.k String str, @Y61.k ArrayList arrayList) {
        this.f289505b = str;
        this.f289506c = arrayList;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f289505b, dVar.f289505b) && this.f289506c.equals(dVar.f289506c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF248508b() {
        return getF289040k().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF289040k() {
        return this.f289505b;
    }

    public final int hashCode() {
        return this.f289506c.hashCode() + (this.f289505b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WidgetContainerItem(stringId=");
        sb2.append(this.f289505b);
        sb2.append(", widgets=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f289506c, ')');
    }
}
