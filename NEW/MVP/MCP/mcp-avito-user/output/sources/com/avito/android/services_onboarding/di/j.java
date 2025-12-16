package com.avito.android.services_onboarding.di;

import com.avito.android.services_onboarding.ServicesOnboardingTarget;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ServicesOnboardingModule_ProvideInteractorFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class j implements dagger.internal.h<Yu0.g> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f279858a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.services_onboarding.domain.cpx_onboarding.h f279859b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.services_onboarding.domain.booking_onboarding.h f279860c;

    public j(dagger.internal.l lVar, com.avito.android.services_onboarding.domain.cpx_onboarding.h hVar, com.avito.android.services_onboarding.domain.booking_onboarding.h hVar2) {
        this.f279858a = lVar;
        this.f279859b = hVar;
        this.f279860c = hVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        ServicesOnboardingTarget servicesOnboardingTarget = (ServicesOnboardingTarget) this.f279858a.f393949a;
        h31.e eVarA = dagger.internal.g.a(w.a(this.f279859b));
        h31.e eVarA2 = dagger.internal.g.a(w.a(this.f279860c));
        f.f279852a.getClass();
        if (servicesOnboardingTarget instanceof ServicesOnboardingTarget.Cpx) {
            return (Yu0.g) eVarA.get();
        }
        if (servicesOnboardingTarget instanceof ServicesOnboardingTarget.Stepped) {
            return (Yu0.g) eVarA2.get();
        }
        throw new NoWhenBranchMatchedException();
    }
}
