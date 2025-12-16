package com.avito.android.services_onboarding.domain.cpx_onboarding;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ServicesBookingCpxOnboardingInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final b f279930a;

    /* renamed from: b, reason: collision with root package name */
    public final d f279931b;

    /* renamed from: c, reason: collision with root package name */
    public final f f279932c;

    public h(b bVar, d dVar, f fVar) {
        this.f279930a = bVar;
        this.f279931b = dVar;
        this.f279932c = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a aVar = (a) this.f279930a.get();
        this.f279931b.getClass();
        c cVar = new c();
        this.f279932c.getClass();
        return new g(aVar, cVar, new e());
    }
}
