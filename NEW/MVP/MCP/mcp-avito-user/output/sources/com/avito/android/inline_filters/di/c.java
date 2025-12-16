package com.avito.android.inline_filters.di;

import com.avito.android.di.B;
import com.avito.android.inline_filters.calendar.FiltersCalendarPickerConfig;
import com.avito.android.inline_filters.calendar.FiltersCalendarPickerUiConfig;
import com.avito.android.inline_filters.calendar.SelectedDateRange;
import com.avito.android.inline_filters.dialog.calendar.C31003c;
import com.avito.android.inline_filters.dialog.calendar.view.FiltersCalendarPickerFragment;
import h31.d;
import kotlin.Metadata;

/* compiled from: FiltersCalendarPickerComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/inline_filters/di/c;", "", "a", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes14.dex */
public interface c {

    /* compiled from: FiltersCalendarPickerComponent.kt */
    @d.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/di/c$a;", "", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        a a(@Y61.k d dVar);

        @h31.b
        @Y61.k
        a b(@Y61.l SelectedDateRange selectedDateRange);

        @Y61.k
        c build();

        @Y61.k
        a c(@h31.b @Y61.k com.avito.android.analytics.screens.r rVar);

        @h31.b
        @Y61.k
        a d(@Y61.k FiltersCalendarPickerUiConfig filtersCalendarPickerUiConfig);

        @h31.b
        @Y61.k
        a e(@t @Y61.l Integer num);

        @h31.b
        @Y61.k
        a f(@Y61.k FiltersCalendarPickerConfig filtersCalendarPickerConfig);
    }

    void a(@Y61.k C31003c c31003c);

    void b(@Y61.k FiltersCalendarPickerFragment filtersCalendarPickerFragment);
}
