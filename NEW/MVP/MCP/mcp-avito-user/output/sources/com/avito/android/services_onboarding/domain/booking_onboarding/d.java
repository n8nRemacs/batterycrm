package com.avito.android.services_onboarding.domain.booking_onboarding;

import com.avito.android.services_onboarding.ServicesOnboardingTarget;
import com.avito.android.util.R0;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MoveToNextStepUseCaseImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.service_booking_persistence.f> f279887a;

    /* renamed from: b, reason: collision with root package name */
    public final l f279888b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f279889c;

    public d(l lVar, Provider provider, Provider provider2) {
        this.f279887a = provider;
        this.f279888b = lVar;
        this.f279889c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f279887a.get(), (ServicesOnboardingTarget) this.f279888b.f393949a, this.f279889c.get());
    }
}
