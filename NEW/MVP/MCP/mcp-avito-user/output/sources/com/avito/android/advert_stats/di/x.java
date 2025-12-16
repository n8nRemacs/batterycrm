package com.avito.android.advert_stats.di;

import com.avito.android.advert_stats.di.y;
import javax.inject.Provider;
import jb.InterfaceC42343a;

/* compiled from: AdvertStatsModule_ProviderInteractorFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class x implements dagger.internal.h<com.avito.android.advert_stats.p> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC42343a> f86606a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f86607b;

    public x(dagger.internal.u uVar, Provider provider) {
        this.f86606a = provider;
        this.f86607b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC42343a interfaceC42343a = (InterfaceC42343a) ((y.b.a) this.f86606a).get();
        com.avito.android.preloading.j jVar = (com.avito.android.preloading.j) this.f86607b.get();
        e.f86574a.getClass();
        return new com.avito.android.advert_stats.q(interfaceC42343a, jVar);
    }
}
