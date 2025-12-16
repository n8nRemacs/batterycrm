package com.avito.android.calendar_select.presentation.view.data;

import com.avito.android.calendar_select.presentation.view.data.items.CalendarItemState;
import com.avito.android.calendar_select.utils.DateRange;
import java.time.LocalDate;
import java.util.List;
import kotlin.Metadata;

/* compiled from: CalendarDayStateProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b \u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/calendar_select/presentation/view/data/j;", "", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final n f113471a;

    public j(@Y61.k n nVar) {
        this.f113471a = nVar;
    }

    @Y61.k
    public abstract CalendarItemState a(@Y61.k LocalDate localDate, @Y61.l LocalDate localDate2, @Y61.l List<LocalDate> list, @Y61.l DateRange dateRange);

    @Y61.k
    public abstract CalendarItemState b(@Y61.k LocalDate localDate, @Y61.l DateRange dateRange);
}
