package com.avito.android.service_booking_schedule_repetition_impl.mvi.domain;

import com.avito.android.util.R0;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import ut0.InterfaceC49110a;

/* compiled from: SaveScheduleRepetitionUseCaseImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC49110a> f277680a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f277681b;

    /* renamed from: c, reason: collision with root package name */
    public final l f277682c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.service_booking_day_settings.breaks.a> f277683d;

    public h(l lVar, Provider provider, Provider provider2, Provider provider3) {
        this.f277680a = provider;
        this.f277681b = provider2;
        this.f277682c = lVar;
        this.f277683d = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f277680a.get(), this.f277681b.get(), (RepetitionSchedule) this.f277682c.f393949a, this.f277683d.get());
    }
}
