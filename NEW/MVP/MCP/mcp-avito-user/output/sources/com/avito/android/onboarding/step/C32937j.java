package com.avito.android.onboarding.step;

import javax.inject.Provider;

/* compiled from: BxOnboardingLocationStepInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.onboarding.step.j, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32937j implements dagger.internal.h<C32936i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.permissions.z> f209219a;

    public C32937j(Provider<com.avito.android.permissions.z> provider) {
        this.f209219a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C32936i(this.f209219a.get());
    }
}
