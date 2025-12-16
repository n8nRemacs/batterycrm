package com.avito.android.calendar_select.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.calendar_select.CalendarSettings;
import com.avito.android.calendar_select.presentation.mvicalendarselect.CalendarSelectFragment;
import com.avito.android.di.B;
import h31.d;
import java.time.LocalDate;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CalendarSelectComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/calendar_select/di/b;", "", "a", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes12.dex */
public interface b {

    /* compiled from: CalendarSelectComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/calendar_select/di/b$a;", "", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        b a(@h31.b @Y61.k CalendarSettings calendarSettings, @h31.b @Y61.k C28478k c28478k, @h31.b @Y61.k Y41.l<? super LocalDate, G0> lVar, @Y61.k com.avito.android.calendar_select.di.a aVar);
    }

    void a(@Y61.k CalendarSelectFragment calendarSelectFragment);
}
