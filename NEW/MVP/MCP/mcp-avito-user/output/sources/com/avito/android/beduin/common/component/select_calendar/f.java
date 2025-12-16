package com.avito.android.beduin.common.component.select_calendar;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CalendarActivityContract_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.calendar_select.b> f102460a;

    public f(Provider<com.avito.android.calendar_select.b> provider) {
        this.f102460a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f102460a.get());
    }
}
