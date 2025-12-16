package com.avito.android.advert_stats.di;

import com.avito.android.advert_stats.di.y;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import jb.InterfaceC42343a;
import nb.InterfaceC44368a;

/* compiled from: AdvertStatsModule_ProvideStatsPreloadable$_avito_advert_stats_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class r implements dagger.internal.h<com.avito.android.advert_stats.preloading.d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC42343a> f86597a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f86598b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f86599c;

    public r(dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f86597a = provider;
        this.f86598b = provider2;
        this.f86599c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC42343a interfaceC42343a = (InterfaceC42343a) ((y.b.a) this.f86597a).get();
        InterfaceC35745a5 interfaceC35745a5 = (InterfaceC35745a5) ((y.b.h) this.f86598b).get();
        InterfaceC44368a interfaceC44368a = (InterfaceC44368a) this.f86599c.get();
        e.f86574a.getClass();
        return new com.avito.android.advert_stats.preloading.d(interfaceC42343a, interfaceC35745a5, interfaceC44368a);
    }
}
