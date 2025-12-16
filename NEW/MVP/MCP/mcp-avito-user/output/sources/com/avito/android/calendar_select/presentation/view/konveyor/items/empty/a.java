package com.avito.android.calendar_select.presentation.view.konveyor.items.empty;

import Y61.k;
import Y61.l;
import com.avito.android.calendar_select.presentation.view.data.items.CalendarItemState;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: EmptyItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/calendar_select/presentation/view/konveyor/items/empty/a;", "LTV0/a;", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class a implements TV0.a {

    /* renamed from: b, reason: collision with root package name */
    public final long f113526b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final LocalDate f113527c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final CalendarItemState f113528d;

    public a(long j12, @k LocalDate localDate, @k CalendarItemState calendarItemState) {
        this.f113526b = j12;
        this.f113527c = localDate;
        this.f113528d = calendarItemState;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f113526b == aVar.f113526b && L.f(this.f113527c, aVar.f113527c) && this.f113528d == aVar.f113528d;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF84603b() {
        return this.f113526b;
    }

    public final int hashCode() {
        return this.f113528d.hashCode() + ((this.f113527c.hashCode() + (Long.hashCode(this.f113526b) * 31)) * 31);
    }

    @k
    public final String toString() {
        return "EmptyItem(id=" + this.f113526b + ", nextDate=" + this.f113527c + ", state=" + this.f113528d + ')';
    }

    public /* synthetic */ a(long j12, LocalDate localDate, CalendarItemState calendarItemState, int i12, C42822w c42822w) {
        this(j12, localDate, (i12 & 4) != 0 ? CalendarItemState.f113461b : calendarItemState);
    }
}
