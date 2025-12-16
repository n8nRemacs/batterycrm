package com.avito.android.services_onboarding.domain.booking_onboarding;

import com.avito.android.services_onboarding.ServicesOnboardingTarget;
import com.avito.android.util.R0;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ProcessStepChangeUseCaseImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.service_booking_persistence.f> f279898a;

    /* renamed from: b, reason: collision with root package name */
    public final l f279899b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f279900c;

    public f(l lVar, Provider provider, Provider provider2) {
        this.f279898a = provider;
        this.f279899b = lVar;
        this.f279900c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f279898a.get(), (ServicesOnboardingTarget) this.f279899b.f393949a, this.f279900c.get());
    }
}
