package com.avito.android.service_booking.mvi.step.mvi;

import com.avito.android.service_booking.BookingFlow;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Map;
import javax.inject.Provider;

/* compiled from: ServiceBookingMviStepActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.service_booking.mvi.domain.interactors.a> f274756a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f274757b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f274758c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f274759d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f274760e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<BookingFlow> f274761f;

    public h(dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.l lVar3, dagger.internal.l lVar4, Provider provider, Provider provider2) {
        this.f274756a = provider;
        this.f274757b = lVar;
        this.f274758c = lVar2;
        this.f274759d = lVar3;
        this.f274760e = lVar4;
        this.f274761f = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f274756a.get(), (Map) this.f274757b.f393949a, (String) this.f274758c.f393949a, (String) this.f274759d.f393949a, (String) this.f274760e.f393949a, this.f274761f.get());
    }
}
