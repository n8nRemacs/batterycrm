package com.avito.android.str_seller_orders.orders_seller.items.header;

import Y61.k;
import Y61.l;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HeaderItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_seller/items/header/c;", "Lcom/avito/conveyor_item/a;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PrintableText f289467b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f289468c;

    public c(@k PrintableText printableText) {
        this.f289467b = printableText;
        this.f289468c = printableText.toString();
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && L.f(this.f289467b, ((c) obj).f289467b);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF269950b() {
        return getF270673d().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF289505b() {
        return this.f289468c;
    }

    public final int hashCode() {
        return this.f289467b.hashCode();
    }

    @k
    public final String toString() {
        return AK.c.m(new StringBuilder("HeaderItem(title="), this.f289467b, ')');
    }
}
