package com.avito.android.inline_filters.di;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FiltersCalendarPickerModule_ProvideDayItemPresenter$_avito_inline_filters_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class i implements dagger.internal.h<com.avito.android.inline_filters.dialog.calendar.konveyor.items.day.d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.inline_filters.dialog.calendar.o> f171119a;

    public i(Provider<com.avito.android.inline_filters.dialog.calendar.o> provider) {
        this.f171119a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.inline_filters.dialog.calendar.o oVar = this.f171119a.get();
        e eVar = e.f171113a;
        return new com.avito.android.inline_filters.dialog.calendar.konveyor.items.day.d(oVar.c2());
    }
}
