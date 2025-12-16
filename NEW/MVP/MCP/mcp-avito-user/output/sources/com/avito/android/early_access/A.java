package com.avito.android.early_access;

import javax.inject.Provider;

/* compiled from: EarlyAccessStatusDeepLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class A implements dagger.internal.h<z> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<t> f145053a;

    public A(Provider<t> provider) {
        this.f145053a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new z(this.f145053a.get());
    }
}
