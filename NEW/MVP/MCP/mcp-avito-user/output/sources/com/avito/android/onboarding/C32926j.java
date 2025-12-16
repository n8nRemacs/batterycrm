package com.avito.android.onboarding;

import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: BxOnboardingChainControllerImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.onboarding.j, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32926j implements dagger.internal.h<C32924h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f209097a;

    public C32926j(Provider<R0> provider) {
        this.f209097a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C32924h(this.f209097a.get());
    }
}
