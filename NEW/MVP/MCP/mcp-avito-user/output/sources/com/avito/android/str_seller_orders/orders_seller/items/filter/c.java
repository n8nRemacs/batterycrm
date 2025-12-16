package com.avito.android.str_seller_orders.orders_seller.items.filter;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FilterItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_seller/items/filter/c;", "Lcom/avito/conveyor_item/a;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f289436b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f289437c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f289438d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f289439e;

    public c(@k String str, @k String str2, boolean z12, boolean z13) {
        this.f289436b = str;
        this.f289437c = str2;
        this.f289438d = z12;
        this.f289439e = z13;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f289436b, cVar.f289436b) && L.f(this.f289437c, cVar.f289437c) && this.f289438d == cVar.f289438d && this.f289439e == cVar.f289439e;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF248508b() {
        return getF289040k().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF289040k() {
        return this.f289436b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f289439e) + r.i(H.d(this.f289436b.hashCode() * 31, 31, this.f289437c), 31, this.f289438d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FilterItem(stringId=");
        sb2.append(this.f289436b);
        sb2.append(", chipTitle=");
        sb2.append(this.f289437c);
        sb2.append(", isExpandIconVisible=");
        sb2.append(this.f289438d);
        sb2.append(", isSelected=");
        return r.x(sb2, this.f289439e, ')');
    }
}
