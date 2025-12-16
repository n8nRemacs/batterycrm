package com.avito.android.remote.interceptor;

import javax.inject.Provider;

/* compiled from: SessionCookieProviderImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes17.dex */
public final class D0 implements dagger.internal.h<C0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.account.G> f253486a;

    public D0(Provider<com.avito.android.account.G> provider) {
        this.f253486a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C0(this.f253486a.get());
    }
}
