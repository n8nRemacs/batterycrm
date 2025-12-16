package com.avito.android.str_seller_orders.strsellerorders.mvi.items.inline_filters;

import Y61.k;
import Y61.l;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InlineFiltersItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerorders/mvi/items/inline_filters/b;", "Lcom/avito/conveyor_item/a;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class b implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ArrayList f289999b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final a f290000c;

    public b(@k ArrayList arrayList, @k a aVar) {
        this.f289999b = arrayList;
        this.f290000c = aVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        bVar.getClass();
        return this.f289999b.equals(bVar.f289999b) && L.f(this.f290000c, bVar.f290000c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF79005b() {
        return 1309695165;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF280528b() {
        return "inline_filters_item";
    }

    public final int hashCode() {
        return this.f290000c.hashCode() + androidx.compose.ui.graphics.colorspace.e.g(this.f289999b, 1945844451, 31);
    }

    @k
    public final String toString() {
        return "InlineFiltersItem(stringId=inline_filters_item, items=" + this.f289999b + ", selectedFilterChipable=" + this.f290000c + ')';
    }
}
