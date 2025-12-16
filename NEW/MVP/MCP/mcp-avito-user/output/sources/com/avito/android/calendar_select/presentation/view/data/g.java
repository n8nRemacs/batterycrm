package com.avito.android.calendar_select.presentation.view.data;

import com.avito.android.calendar_select.CalendarSelectionType;
import com.avito.android.calendar_select.CalendarSettings;
import java.time.LocalDate;
import java.util.List;
import kotlin.Metadata;

/* compiled from: CalendarDataSourceProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/calendar_select/presentation/view/data/g;", "", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface g {
    @Y61.k
    m a(@Y61.k CalendarSettings calendarSettings);

    @Y61.k
    m b(@Y61.k LocalDate localDate, @Y61.k LocalDate localDate2, @Y61.k List<LocalDate> list, @Y61.k List<LocalDate> list2, @Y61.k CalendarSelectionType calendarSelectionType, boolean z12);
}
