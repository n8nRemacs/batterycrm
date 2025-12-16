package com.avito.android.str_calendar.seller.calendar.konveyor;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.akita.compose.component.accordion.s;
import j.InterfaceC42150f;
import kotlin.Metadata;

/* compiled from: StrSellerCalendarColorsProvider.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/calendar/konveyor/i;", "", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f287613a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Integer f287614b;

    public i(@InterfaceC42150f int i12, @InterfaceC42150f @l Integer num) {
        this.f287613a = i12;
        this.f287614b = num;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f287613a == iVar.f287613a && this.f287614b.equals(iVar.f287614b);
    }

    public final int hashCode() {
        return this.f287614b.hashCode() + (Integer.hashCode(this.f287613a) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StrSellerDayColor(dayColor=");
        sb2.append(this.f287613a);
        sb2.append(", priceColor=");
        return s.j(sb2, this.f287614b, ')');
    }
}
