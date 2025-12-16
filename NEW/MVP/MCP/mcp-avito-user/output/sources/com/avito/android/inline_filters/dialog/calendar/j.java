package com.avito.android.inline_filters.dialog.calendar;

import com.avito.android.inline_filters.calendar.FiltersCalendarPickerConfig;
import com.avito.android.inline_filters.calendar.FiltersCalendarPickerUiConfig;
import com.avito.android.inline_filters.dialog.calendar.view.FiltersCalendarPickerFragment;
import com.avito.android.inline_filters.dialog.calendar.view.FiltersCalendarPickerOpenParams;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: FiltersCalendarPickerFragmentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/inline_filters/dialog/calendar/j;", "LEN/a;", "<init>", "()V", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class j implements EN.a {
    @Inject
    public j() {
    }

    @Override // EN.a
    @Y61.k
    public final FiltersCalendarPickerFragment a(@Y61.k FiltersCalendarPickerConfig filtersCalendarPickerConfig, @Y61.k FiltersCalendarPickerUiConfig filtersCalendarPickerUiConfig) {
        FiltersCalendarPickerFragment.f171319p0.getClass();
        FiltersCalendarPickerFragment filtersCalendarPickerFragment = new FiltersCalendarPickerFragment();
        FiltersCalendarPickerOpenParams filtersCalendarPickerOpenParams = new FiltersCalendarPickerOpenParams(filtersCalendarPickerConfig, filtersCalendarPickerUiConfig);
        filtersCalendarPickerFragment.f171321h0.setValue(filtersCalendarPickerFragment, FiltersCalendarPickerFragment.f171320q0[0], filtersCalendarPickerOpenParams);
        return filtersCalendarPickerFragment;
    }
}
