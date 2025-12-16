package com.avito.android.di.module;

import com.avito.android.quic.p;
import javax.inject.Provider;

/* compiled from: QuicBindingsModule_ProvideUserLocationProviderFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class X6 implements dagger.internal.h<p.d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.geo.j> f144191a;

    public X6(Provider<com.avito.android.geo.j> provider) {
        this.f144191a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.geo.j jVar = this.f144191a.get();
        V6.f144160a.getClass();
        return new T6(jVar);
    }
}
