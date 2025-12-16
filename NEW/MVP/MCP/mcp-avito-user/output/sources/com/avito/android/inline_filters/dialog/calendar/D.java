package com.avito.android.inline_filters.dialog.calendar;

import androidx.view.M0;
import androidx.view.P0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.inline_filters.calendar.FiltersCalendarPickerConfig;
import com.avito.android.inline_filters.calendar.FiltersCalendarPickerUiConfig;
import com.avito.android.inline_filters.dialog.calendar.models.CalendarPickerConstraints;
import com.avito.android.util.InterfaceC35745a5;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: FiltersCalendarPickerViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/dialog/calendar/D;", "Landroidx/lifecycle/P0$c;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class D implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final KN.f f171167a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final KN.c f171168b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f171169c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.inline_filters.dialog.calendar.view.h f171170d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f171171e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final CalendarPickerConstraints f171172f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final HN.a<List<? extends MN.c>> f171173g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final FiltersCalendarPickerConfig f171174h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final FiltersCalendarPickerUiConfig f171175i;

    @Inject
    public D(@Y61.k KN.f fVar, @Y61.k KN.c cVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.inline_filters.dialog.calendar.view.h hVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.l CalendarPickerConstraints calendarPickerConstraints, @Y61.k HN.a<List<? extends MN.c>> aVar, @Y61.k FiltersCalendarPickerConfig filtersCalendarPickerConfig, @Y61.k FiltersCalendarPickerUiConfig filtersCalendarPickerUiConfig) {
        this.f171167a = fVar;
        this.f171168b = cVar;
        this.f171169c = interfaceC35745a5;
        this.f171170d = hVar;
        this.f171171e = interfaceC28373a;
        this.f171172f = calendarPickerConstraints;
        this.f171173g = aVar;
        this.f171174h = filtersCalendarPickerConfig;
        this.f171175i = filtersCalendarPickerUiConfig;
    }

    @Override // androidx.lifecycle.P0.c
    @Y61.k
    public final <T extends M0> T create(@Y61.k Class<T> cls) {
        if (!cls.isAssignableFrom(p.class)) {
            throw new IllegalArgumentException("Unknown ViewModel class");
        }
        return new p(this.f171167a, this.f171168b, this.f171169c, this.f171170d, this.f171171e, this.f171172f, this.f171173g, this.f171174h, this.f171175i);
    }
}
