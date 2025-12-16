package com.avito.android.calendar_select.di;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CalendarSelectRecyclerModule_ProvideDayItemPresenter$_avito_calendar_select_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements dagger.internal.h<com.avito.android.calendar_select.presentation.view.konveyor.items.day.d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f113327a;

    public f(dagger.internal.l lVar) {
        this.f113327a = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Y41.l lVar = (Y41.l) this.f113327a.f393949a;
        int i12 = d.f113324a;
        return new com.avito.android.calendar_select.presentation.view.konveyor.items.day.d(lVar);
    }
}
