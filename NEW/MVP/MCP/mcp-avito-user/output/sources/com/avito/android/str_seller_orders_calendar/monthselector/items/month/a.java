package com.avito.android.str_seller_orders_calendar.monthselector.items.month;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MonthItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/monthselector/items/month/a;", "Lcom/avito/conveyor_item/a;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f290416b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f290417c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f290418d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f290419e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f290420f;

    public a(@k String str, @k String str2, boolean z12, @k String str3) {
        this.f290416b = str;
        this.f290417c = str2;
        this.f290418d = z12;
        this.f290419e = str3;
        this.f290420f = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f290416b, aVar.f290416b) && L.f(this.f290417c, aVar.f290417c) && this.f290418d == aVar.f290418d && L.f(this.f290419e, aVar.f290419e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85686c() {
        return getF272880b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF272880b() {
        return this.f290420f;
    }

    public final int hashCode() {
        return this.f290419e.hashCode() + r.i(H.d(this.f290416b.hashCode() * 31, 31, this.f290417c), 31, this.f290418d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MonthItem(monthId=");
        sb2.append(this.f290416b);
        sb2.append(", title=");
        sb2.append(this.f290417c);
        sb2.append(", isSelected=");
        sb2.append(this.f290418d);
        sb2.append(", year=");
        return C22026a.c(sb2, this.f290419e, ')');
    }
}
