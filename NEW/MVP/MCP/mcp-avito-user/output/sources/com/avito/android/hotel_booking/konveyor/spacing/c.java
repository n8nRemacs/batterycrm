package com.avito.android.hotel_booking.konveyor.spacing;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BookingFormSpacingItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_booking/konveyor/spacing/c;", "Lcom/avito/conveyor_item/a;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f163779b;

    /* renamed from: c, reason: collision with root package name */
    public final int f163780c;

    public c(@k String str, int i12) {
        this.f163779b = str;
        this.f163780c = i12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f163779b, cVar.f163779b) && this.f163780c == cVar.f163780c;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF123929b() {
        return getF154824b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF154824b() {
        return this.f163779b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f163780c) + (this.f163779b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BookingFormSpacingItem(stringId=");
        sb2.append(this.f163779b);
        sb2.append(", height=");
        return r.t(sb2, this.f163780c, ')');
    }
}
