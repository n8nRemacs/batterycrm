package com.avito.android.str_seller_orders.orders_buyer.items.button_pagination;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import nz0.C44494a;

/* compiled from: ButtonPaginationItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_buyer/items/button_pagination/c;", "Lcom/avito/conveyor_item/a;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PrintableText f289005b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C44494a f289006c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f289007d;

    public c(@k PrintableText printableText, @k C44494a c44494a, @k String str) {
        this.f289005b = printableText;
        this.f289006c = c44494a;
        this.f289007d = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f289005b, cVar.f289005b) && L.f(this.f289006c, cVar.f289006c) && L.f(this.f289007d, cVar.f289007d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF284485b() {
        return getF289505b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF289505b() {
        return this.f289007d;
    }

    public final int hashCode() {
        return this.f289007d.hashCode() + ((this.f289006c.hashCode() + (this.f289005b.hashCode() * 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ButtonPaginationItem(text=");
        sb2.append(this.f289005b);
        sb2.append(", paginationInfo=");
        sb2.append(this.f289006c);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f289007d, ')');
    }
}
