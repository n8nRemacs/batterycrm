package com.avito.android.onboarding;

import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: BxOnboardingChainFetcherImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f209114a;

    public m(Provider<R0> provider) {
        this.f209114a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l(this.f209114a.get());
    }
}
