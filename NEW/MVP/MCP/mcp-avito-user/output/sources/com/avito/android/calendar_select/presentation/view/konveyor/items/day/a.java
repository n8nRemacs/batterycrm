package com.avito.android.calendar_select.presentation.view.konveyor.items.day;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.calendar_select.presentation.view.data.items.CalendarItemState;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DayItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/calendar_select/presentation/view/konveyor/items/day/a;", "LTV0/a;", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class a implements TV0.a {

    /* renamed from: b, reason: collision with root package name */
    public final long f113512b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f113513c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final CalendarItemState f113514d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final LocalDate f113515e;

    public a(long j12, @k String str, @k CalendarItemState calendarItemState, @k LocalDate localDate) {
        this.f113512b = j12;
        this.f113513c = str;
        this.f113514d = calendarItemState;
        this.f113515e = localDate;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f113512b == aVar.f113512b && L.f(this.f113513c, aVar.f113513c) && this.f113514d == aVar.f113514d && L.f(this.f113515e, aVar.f113515e);
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF80342e() {
        return this.f113512b;
    }

    public final int hashCode() {
        return this.f113515e.hashCode() + ((this.f113514d.hashCode() + H.d(Long.hashCode(this.f113512b) * 31, 31, this.f113513c)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DayItem(id=");
        sb2.append(this.f113512b);
        sb2.append(", text=");
        sb2.append(this.f113513c);
        sb2.append(", state=");
        sb2.append(this.f113514d);
        sb2.append(", date=");
        return AK.c.t(sb2, this.f113515e, ')');
    }

    public /* synthetic */ a(long j12, String str, CalendarItemState calendarItemState, LocalDate localDate, int i12, C42822w c42822w) {
        this(j12, str, (i12 & 4) != 0 ? CalendarItemState.f113461b : calendarItemState, localDate);
    }
}
