package com.avito.android.service_booking_calendar.view.month;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MonthItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_calendar/view/month/d;", "Lcom/avito/android/service_booking_calendar/a;", "_avito-discouraged_avito-libs_service-booking-calendar"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class d implements com.avito.android.service_booking_calendar.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f276220b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f276221c;

    public d(@k String str, @k String str2) {
        this.f276220b = str;
        this.f276221c = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f276220b, dVar.f276220b) && L.f(this.f276221c, dVar.f276221c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF113526b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF429454b() {
        return this.f276220b;
    }

    public final int hashCode() {
        return this.f276221c.hashCode() + (this.f276220b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MonthItem(stringId=");
        sb2.append(this.f276220b);
        sb2.append(", text=");
        return C22026a.c(sb2, this.f276221c, ')');
    }
}
