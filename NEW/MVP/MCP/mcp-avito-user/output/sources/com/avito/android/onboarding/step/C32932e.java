package com.avito.android.onboarding.step;

import com.avito.android.C36135w2;
import javax.inject.Provider;

/* compiled from: BxOnboardingAuthorizationStepInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.onboarding.step.e, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32932e implements dagger.internal.h<C32931d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.account.E> f209199a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C36135w2> f209200b;

    public C32932e(Provider<com.avito.android.account.E> provider, Provider<C36135w2> provider2) {
        this.f209199a = provider;
        this.f209200b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C32931d(this.f209199a.get(), this.f209200b.get());
    }
}
