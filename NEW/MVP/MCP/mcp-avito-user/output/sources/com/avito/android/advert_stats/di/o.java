package com.avito.android.advert_stats.di;

import com.avito.android.advert_stats.item.C28332k;
import com.avito.android.advert_stats.item.InterfaceC28333l;
import com.avito.android.advert_stats.item.InterfaceC28337p;
import javax.inject.Provider;

/* compiled from: AdvertStatsModule_ProvidePlotItemBlueprint$_avito_advert_stats_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class o implements dagger.internal.h<C28332k> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28337p> f86584a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f86585b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f86586c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC28333l> f86587d;

    public o(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f86584a = provider;
        this.f86585b = uVar;
        this.f86586c = provider2;
        this.f86587d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28337p interfaceC28337p = this.f86584a.get();
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f86585b.get();
        com.avito.konveyor.a aVar2 = this.f86586c.get();
        InterfaceC28333l interfaceC28333l = this.f86587d.get();
        e.f86574a.getClass();
        return new C28332k(interfaceC28337p, aVar, aVar2, interfaceC28333l);
    }
}
