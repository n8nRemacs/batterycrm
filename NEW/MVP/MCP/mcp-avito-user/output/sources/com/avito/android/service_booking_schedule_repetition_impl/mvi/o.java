package com.avito.android.service_booking_schedule_repetition_impl.mvi;

import com.avito.android.service_booking_schedule_repetition_impl.mvi.domain.RepetitionSchedule;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ScheduleRepetitionReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f277746a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.service_booking.data.preferences.a> f277747b;

    /* renamed from: c, reason: collision with root package name */
    public final u f277748c;

    public o(dagger.internal.l lVar, u uVar, Provider provider) {
        this.f277746a = lVar;
        this.f277747b = provider;
        this.f277748c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new n((RepetitionSchedule) this.f277746a.f393949a, this.f277747b.get(), (com.avito.android.service_booking_schedule_repetition_impl.mvi.domain.i) this.f277748c.get());
    }
}
