package com.avito.android.service_booking_calendar.flexible.data.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CalendarDataBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f275713a;

    public e(u uVar) {
        this.f275713a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((com.avito.android.service_booking_calendar.flexible.data.domain.d) this.f275713a.get());
    }
}
