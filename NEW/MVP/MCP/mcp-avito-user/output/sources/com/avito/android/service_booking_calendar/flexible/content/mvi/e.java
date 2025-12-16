package com.avito.android.service_booking_calendar.flexible.content.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CalendarContentActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f275665a;

    public e(u uVar) {
        this.f275665a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((com.avito.android.service_booking_utils.ux_feedback.h) this.f275665a.get());
    }
}
