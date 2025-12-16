package com.avito.android.service_booking_schedule_repetition_impl.mvi;

import com.avito.android.service_booking_schedule_repetition_impl.mvi.domain.RepetitionSchedule;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ScheduleRepetitionActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.service_booking_schedule_repetition_impl.mvi.domain.b> f277727a;

    /* renamed from: b, reason: collision with root package name */
    public final u f277728b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f277729c;

    public f(dagger.internal.l lVar, u uVar, Provider provider) {
        this.f277727a = provider;
        this.f277728b = uVar;
        this.f277729c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f277727a.get(), (com.avito.android.service_booking_schedule_repetition_impl.mvi.domain.f) this.f277728b.get(), (RepetitionSchedule) this.f277729c.f393949a);
    }
}
