package com.avito.android.travel_onboarding.domain.interactors;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TravelOnboardingInteractor_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<WE0.a> f302277a;

    public d(Provider<WE0.a> provider) {
        this.f302277a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f302277a.get());
    }
}
