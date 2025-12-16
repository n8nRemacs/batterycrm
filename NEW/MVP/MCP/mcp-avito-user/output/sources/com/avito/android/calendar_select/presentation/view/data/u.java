package com.avito.android.calendar_select.presentation.view.data;

import com.avito.android.calendar_select.presentation.view.data.items.CalendarItemState;
import com.avito.android.calendar_select.utils.DateRange;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.ranges.g;

/* compiled from: RangeDayStateProviderImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/calendar_select/presentation/view/data/u;", "Lcom/avito/android/calendar_select/presentation/view/data/j;", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class u extends j {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Object f113495b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final DateRange f113496c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final l f113497d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f113498e;

    public u(@Y61.k n nVar, @Y61.k List list, @Y61.k DateRange dateRange, @Y61.k l lVar, boolean z12) {
        super(nVar);
        this.f113495b = list;
        this.f113496c = dateRange;
        this.f113497d = lVar;
        this.f113498e = z12;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    @Override // com.avito.android.calendar_select.presentation.view.data.j
    @Y61.k
    public final CalendarItemState a(@Y61.k LocalDate localDate, @Y61.l LocalDate localDate2, @Y61.l List<LocalDate> list, @Y61.l DateRange dateRange) {
        Boolean bool;
        n nVar = this.f113471a;
        if ((nVar.a().isAfter(localDate) && !this.f113498e) || this.f113495b.contains(localDate) || !g.a.a(this.f113496c, localDate)) {
            return CalendarItemState.f113468i;
        }
        if (dateRange != null && g.a.a(dateRange, localDate)) {
            LocalDate localDate3 = dateRange.f113540b;
            boolean zIsEqual = localDate.isEqual(localDate3);
            LocalDate localDate4 = dateRange.f113541c;
            return (zIsEqual && localDate.isEqual(localDate4)) ? CalendarItemState.f113464e : localDate.isEqual(localDate3) ? CalendarItemState.f113465f : localDate.isEqual(localDate4) ? CalendarItemState.f113466g : CalendarItemState.f113467h;
        }
        l lVar = this.f113497d;
        if (localDate2 != null) {
            if (localDate2.isEqual(localDate)) {
                return CalendarItemState.f113464e;
            }
            if (localDate2.isBefore(localDate)) {
                Map<LocalDate, Boolean> map = lVar.f113475d.get(localDate2);
                if (map == null || (bool = map.get(localDate)) == null) {
                    throw new IllegalArgumentException("Illegal date " + localDate);
                }
                if (bool.booleanValue()) {
                    return CalendarItemState.f113461b;
                }
                if (dateRange == null) {
                    return CalendarItemState.f113468i;
                }
            }
        }
        boolean zIsEqual2 = nVar.a().isEqual(localDate);
        HashSet<LocalDate> hashSet = lVar.f113474c;
        return zIsEqual2 ? hashSet.contains(localDate) ? CalendarItemState.f113462c : CalendarItemState.f113463d : hashSet.contains(localDate) ? CalendarItemState.f113461b : CalendarItemState.f113468i;
    }

    @Override // com.avito.android.calendar_select.presentation.view.data.j
    @Y61.k
    public final CalendarItemState b(@Y61.k LocalDate localDate, @Y61.l DateRange dateRange) {
        return (dateRange == null || !g.a.a(dateRange, localDate) || L.f(dateRange.f113540b, localDate)) ? CalendarItemState.f113461b : CalendarItemState.f113467h;
    }
}
