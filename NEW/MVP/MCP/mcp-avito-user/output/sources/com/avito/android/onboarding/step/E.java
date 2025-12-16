package com.avito.android.onboarding.step;

import javax.inject.Provider;
import sZ.InterfaceC48136b;

/* compiled from: BxOnboardingUnreadMessagesStepInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class E implements dagger.internal.h<D> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC48136b> f209153a;

    public E(Provider<InterfaceC48136b> provider) {
        this.f209153a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new D(this.f209153a.get());
    }
}
