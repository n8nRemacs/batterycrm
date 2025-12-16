package com.avito.android.vas_planning_calendar.di;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VasPlanCalendarModule_ProvideDayItemPresenter$_avito_vas_planning_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class i implements dagger.internal.h<com.avito.android.vas_planning_calendar.view.konveyor.items.day.d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.vas_planning_calendar.y> f322648a;

    public i(Provider<com.avito.android.vas_planning_calendar.y> provider) {
        this.f322648a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.vas_planning_calendar.y yVar = this.f322648a.get();
        int i12 = f.f322643a;
        return new com.avito.android.vas_planning_calendar.view.konveyor.items.day.d(yVar.c2());
    }
}
