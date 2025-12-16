package com.avito.android.di.module;

import com.avito.android.quic.p;

/* compiled from: QuicBindingsModule_ProvideUserRegionProviderFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class Y6 implements dagger.internal.h<p.e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f144211a;

    public Y6(dagger.internal.u uVar) {
        this.f144211a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.location.perf_location.g gVar = (com.avito.android.location.perf_location.g) this.f144211a.get();
        V6.f144160a.getClass();
        return new U6(gVar);
    }
}
