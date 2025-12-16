package com.avito.android.quic;

import dagger.internal.y;

/* compiled from: QuicModule_ProvideCronetEngineParametersProvider$_common_quic_implFactory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class k implements dagger.internal.h<com.avito.android.quic.cronet.d> {

    /* renamed from: a, reason: collision with root package name */
    public final f f246265a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f246266b;

    public k(f fVar, dagger.internal.u uVar) {
        this.f246265a = fVar;
        this.f246266b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        a aVar = (a) this.f246266b.get();
        this.f246265a.getClass();
        return new com.avito.android.quic.cronet.d(aVar);
    }
}
