package com.avito.android.quic;

import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: QuicModuleInitializerImpl_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<p> f246262a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f246263b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.quic.cronet.t> f246264c;

    public j(dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f246262a = provider;
        this.f246263b = uVar;
        this.f246264c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f246262a.get(), (com.avito.android.quic.cronet.k) this.f246263b.get(), this.f246264c.get());
    }
}
