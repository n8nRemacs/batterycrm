package com.avito.android.hotel_booking.konveyor.analytics_show;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.ParametrizedEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BookingFormAnalyticsShowItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_booking/konveyor/analytics_show/c;", "Lcom/avito/conveyor_item/a;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f163623b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ParametrizedEvent f163624c;

    public c(@k String str, @k ParametrizedEvent parametrizedEvent) {
        this.f163623b = str;
        this.f163624c = parametrizedEvent;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f163623b, cVar.f163623b) && L.f(this.f163624c, cVar.f163624c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF84833b() {
        return getF130049b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF130049b() {
        return this.f163623b;
    }

    public final int hashCode() {
        return this.f163624c.hashCode() + (this.f163623b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BookingFormAnalyticsShowItem(stringId=");
        sb2.append(this.f163623b);
        sb2.append(", onShowEvent=");
        return com.avito.android.advert.item.delivery_suggests.l.q(sb2, this.f163624c, ')');
    }
}
