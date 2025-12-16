package com.avito.android.str_calendar.seller.calendar.konveyor.items.month;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrSellerCalendarMonthItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/calendar/konveyor/items/month/a;", "LTV0/a;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements TV0.a {

    /* renamed from: b, reason: collision with root package name */
    public final long f287660b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f287661c;

    public a(long j12, @k String str) {
        this.f287660b = j12;
        this.f287661c = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f287660b == aVar.f287660b && L.f(this.f287661c, aVar.f287661c);
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF287615b() {
        return this.f287660b;
    }

    public final int hashCode() {
        return this.f287661c.hashCode() + (Long.hashCode(this.f287660b) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StrSellerCalendarMonthItem(id=");
        sb2.append(this.f287660b);
        sb2.append(", text=");
        return C22026a.c(sb2, this.f287661c, ')');
    }
}
