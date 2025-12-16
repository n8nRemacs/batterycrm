package com.avito.android.calendar_select.presentation.view.data;

import com.avito.android.calendar_select.presentation.view.data.items.CalendarItemState;
import com.avito.android.calendar_select.utils.DateRange;
import java.time.LocalDate;
import java.util.List;
import kotlin.Metadata;
import kotlin.ranges.g;

/* compiled from: SingleDayStateProviderImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/calendar_select/presentation/view/data/w;", "Lcom/avito/android/calendar_select/presentation/view/data/j;", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class w extends j {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Object f113502b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final DateRange f113503c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f113504d;

    public w(@Y61.k n nVar, @Y61.k List<LocalDate> list, @Y61.k DateRange dateRange, boolean z12) {
        super(nVar);
        this.f113502b = list;
        this.f113503c = dateRange;
        this.f113504d = z12;
    }

    @Override // com.avito.android.calendar_select.presentation.view.data.j
    @Y61.k
    public final CalendarItemState a(@Y61.k LocalDate localDate, @Y61.l LocalDate localDate2, @Y61.l List<LocalDate> list, @Y61.l DateRange dateRange) {
        boolean z12 = this.f113504d;
        n nVar = this.f113471a;
        return (z12 || !nVar.a().isAfter(localDate)) ? localDate2 != null ? localDate2.equals(localDate) ? CalendarItemState.f113464e : nVar.a().isEqual(localDate) ? c(localDate) ? CalendarItemState.f113463d : CalendarItemState.f113462c : c(localDate) ? CalendarItemState.f113468i : CalendarItemState.f113461b : nVar.a().isEqual(localDate) ? c(localDate) ? CalendarItemState.f113463d : CalendarItemState.f113462c : c(localDate) ? CalendarItemState.f113468i : CalendarItemState.f113461b : CalendarItemState.f113468i;
    }

    @Override // com.avito.android.calendar_select.presentation.view.data.j
    @Y61.k
    public final CalendarItemState b(@Y61.k LocalDate localDate, @Y61.l DateRange dateRange) {
        return CalendarItemState.f113461b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final boolean c(LocalDate localDate) {
        return this.f113502b.contains(localDate) || !g.a.a(this.f113503c, localDate);
    }
}
