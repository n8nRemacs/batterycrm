package com.avito.android.inline_filters.di;

import com.avito.android.inline_filters.calendar.FiltersCalendarPickerConfig;
import com.avito.android.inline_filters.calendar.FiltersCalendarPickerType;
import com.avito.android.inline_filters.di.a;
import com.avito.android.inline_filters.dialog.calendar.models.CalendarPickerConstraints;
import com.avito.android.util.K;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Calendar;
import java.util.Date;
import javax.inject.Provider;
import wy0.C49704a;

/* compiled from: FiltersCalendarPickerModule_ProvideCalendarConstraints$_avito_inline_filters_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class g implements dagger.internal.h<CalendarPickerConstraints> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.f> f171116a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f171117b;

    public g(dagger.internal.l lVar, Provider provider) {
        this.f171116a = provider;
        this.f171117b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.server_time.f fVar = (com.avito.android.server_time.f) ((a.c.d) this.f171116a).get();
        FiltersCalendarPickerConfig filtersCalendarPickerConfig = (FiltersCalendarPickerConfig) this.f171117b.f393949a;
        e.f171113a.getClass();
        IN.b bVar = IN.b.f8158a;
        long jNow = fVar.now();
        bVar.getClass();
        Integer num = filtersCalendarPickerConfig.f171046d;
        if (num == null) {
            return null;
        }
        IN.a.f8157a.getClass();
        Calendar calendarA = C49704a.a();
        calendarA.setTimeInMillis(jNow);
        K.a(calendarA);
        Date time = calendarA.getTime();
        int iIntValue = num.intValue() - 1;
        Calendar calendarA2 = C49704a.a();
        calendarA2.setTimeInMillis(jNow);
        calendarA2.add(2, iIntValue);
        calendarA2.set(5, calendarA2.getActualMaximum(5));
        K.a(calendarA2);
        return new CalendarPickerConstraints(time, calendarA2.getTime(), filtersCalendarPickerConfig.f171045c == FiltersCalendarPickerType.f171050b);
    }
}
