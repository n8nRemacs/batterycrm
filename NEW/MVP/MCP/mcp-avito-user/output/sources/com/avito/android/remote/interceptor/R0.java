package com.avito.android.remote.interceptor;

import javax.inject.Provider;

/* compiled from: TestSessionCookieProviderImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes17.dex */
public final class R0 implements dagger.internal.h<Q0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.account.G> f253505a;

    public R0(Provider<com.avito.android.account.G> provider) {
        this.f253505a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new Q0(this.f253505a.get());
    }
}
