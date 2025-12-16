package com.avito.android.str_seller_orders.orders_filters.items.toggle;

import Y61.l;
import com.avito.android.str_seller_orders.orders_filters.domain.models.StrOrdersFiltersItemStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrOrdersFiltersToggleItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_filters/items/toggle/e;", "Lcom/avito/conveyor_item/a;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class e implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f289175b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final kV.b f289176c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final StrOrdersFiltersItemStyle f289177d;

    public e(@Y61.k String str, @Y61.k kV.b bVar, @Y61.k StrOrdersFiltersItemStyle strOrdersFiltersItemStyle) {
        this.f289175b = str;
        this.f289176c = bVar;
        this.f289177d = strOrdersFiltersItemStyle;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f289175b, eVar.f289175b) && L.f(this.f289176c, eVar.f289176c) && this.f289177d == eVar.f289177d;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207369c() {
        return getF288604b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF288604b() {
        return this.f289175b;
    }

    public final int hashCode() {
        return this.f289177d.hashCode() + ((this.f289176c.hashCode() + (this.f289175b.hashCode() * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        return "StrOrdersFiltersToggleItem(stringId=" + this.f289175b + ", toggleState=" + this.f289176c + ", style=" + this.f289177d + ')';
    }
}
