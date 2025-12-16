package com.avito.android.advert_stats.detail.di;

import javax.inject.Provider;
import jb.InterfaceC42343a;

/* compiled from: AdvertDetailStatsModule_ProviderInteractorFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert_stats.detail.di.d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28303d implements dagger.internal.h<com.avito.android.advert_stats.p> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC42343a> f86140a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f86141b;

    public C28303d(dagger.internal.u uVar, Provider provider) {
        this.f86140a = provider;
        this.f86141b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC42343a interfaceC42343a = this.f86140a.get();
        com.avito.android.preloading.j jVar = (com.avito.android.preloading.j) this.f86141b.get();
        C28300a.f86135a.getClass();
        return new com.avito.android.advert_stats.q(interfaceC42343a, jVar);
    }
}
