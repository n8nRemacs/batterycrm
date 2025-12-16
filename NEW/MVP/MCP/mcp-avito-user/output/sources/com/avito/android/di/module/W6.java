package com.avito.android.di.module;

import com.avito.android.quic.p;
import javax.inject.Provider;

/* compiled from: QuicBindingsModule_ProvideNetworkDataProviderFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class W6 implements dagger.internal.h<p.b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.analytics.H> f144177a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f144178b;

    public W6(dagger.internal.u uVar, Provider provider) {
        this.f144177a = provider;
        this.f144178b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.analytics.H h12 = this.f144177a.get();
        com.avito.android.analytics.C c12 = (com.avito.android.analytics.C) this.f144178b.get();
        V6.f144160a.getClass();
        return new S6(c12, h12);
    }
}
