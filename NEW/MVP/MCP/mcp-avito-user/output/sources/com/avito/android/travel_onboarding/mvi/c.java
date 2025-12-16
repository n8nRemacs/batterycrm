package com.avito.android.travel_onboarding.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TravelOnboardingActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.travel_onboarding.domain.interactors.d f302294a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.travel_onboarding.domain.interactors.b f302295b;

    public c(com.avito.android.travel_onboarding.domain.interactors.d dVar, com.avito.android.travel_onboarding.domain.interactors.b bVar) {
        this.f302294a = dVar;
        this.f302295b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((com.avito.android.travel_onboarding.domain.interactors.c) this.f302294a.get(), (com.avito.android.travel_onboarding.domain.interactors.a) this.f302295b.get());
    }
}
