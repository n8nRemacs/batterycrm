package com.avito.android.onboarding.steps;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: OnboardingStepsViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class t implements dagger.internal.h<s> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.onboarding.steps.mvi.l f209383a;

    public t(com.avito.android.onboarding.steps.mvi.l lVar) {
        this.f209383a = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new s((com.avito.android.onboarding.steps.mvi.k) this.f209383a.get(), null, 2, null);
    }
}
