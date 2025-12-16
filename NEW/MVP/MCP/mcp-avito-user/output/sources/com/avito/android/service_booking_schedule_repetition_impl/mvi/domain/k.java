package com.avito.android.service_booking_schedule_repetition_impl.mvi.domain;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ScheduleRepetitionAnalyticsTrackerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final l f277686a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f277687b;

    public k(l lVar, Provider provider) {
        this.f277686a = lVar;
        this.f277687b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new j((RepetitionSchedule) this.f277686a.f393949a, this.f277687b.get());
    }
}
