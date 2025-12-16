package com.avito.android.service_booking_schedule_repetition_impl.mvi.domain;

import Kt0.InterfaceC14349a;
import Lt0.InterfaceC14438a;
import com.avito.android.util.R0;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GetScheduleRepetitionUseCaseImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC14349a> f277657a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f277658b;

    /* renamed from: c, reason: collision with root package name */
    public final l f277659c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<Lt0.e> f277660d;

    /* renamed from: e, reason: collision with root package name */
    public final u f277661e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.service_booking_day_settings.breaks.a> f277662f;

    public d(l lVar, u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f277657a = provider;
        this.f277658b = provider2;
        this.f277659c = lVar;
        this.f277660d = provider3;
        this.f277661e = uVar;
        this.f277662f = provider4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f277657a.get(), this.f277658b.get(), (RepetitionSchedule) this.f277659c.f393949a, this.f277660d.get(), (InterfaceC14438a) this.f277661e.get(), this.f277662f.get());
    }
}
