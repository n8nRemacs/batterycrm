package com.avito.android.beduin.di;

import javax.inject.Provider;

/* compiled from: BeduinParametersStorageModule_ProvideTemporaryBeduinParametersStorageFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class M implements dagger.internal.h<com.avito.android.beduin.common.storage.c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.beduin.common.storage.a> f103907a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f103908b;

    public M(dagger.internal.u uVar, Provider provider) {
        this.f103907a = provider;
        this.f103908b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.beduin.common.storage.a aVar = this.f103907a.get();
        com.avito.android.beduin.common.storage.r rVar = (com.avito.android.beduin.common.storage.r) this.f103908b.get();
        L.f103906a.getClass();
        return new com.avito.android.beduin.common.storage.q(aVar, rVar);
    }
}
