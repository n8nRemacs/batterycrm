package com.avito.android.service_booking_schedule_repetition_impl.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ScheduleRepetitionBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final u f277731a;

    public h(u uVar) {
        this.f277731a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((com.avito.android.service_booking_schedule_repetition_impl.mvi.domain.b) this.f277731a.get());
    }
}
