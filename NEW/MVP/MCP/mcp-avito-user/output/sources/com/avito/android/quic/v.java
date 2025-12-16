package com.avito.android.quic;

import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: QuicURLsModifierInterceptor_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class v implements dagger.internal.h<u> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<p> f246392a;

    public v(Provider<p> provider) {
        this.f246392a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new u(this.f246392a.get());
    }
}
