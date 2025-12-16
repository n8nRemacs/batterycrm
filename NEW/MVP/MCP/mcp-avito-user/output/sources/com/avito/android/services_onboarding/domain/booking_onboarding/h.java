package com.avito.android.services_onboarding.domain.booking_onboarding;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ServicesBookingOnboardingInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final b f279904a;

    /* renamed from: b, reason: collision with root package name */
    public final d f279905b;

    /* renamed from: c, reason: collision with root package name */
    public final f f279906c;

    public h(b bVar, d dVar, f fVar) {
        this.f279904a = bVar;
        this.f279905b = dVar;
        this.f279906c = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((a) this.f279904a.get(), (c) this.f279905b.get(), (e) this.f279906c.get());
    }
}
