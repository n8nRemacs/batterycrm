package com.avito.android.advert_stats.detail.di;

import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import jb.InterfaceC42343a;

/* compiled from: AdvertDetailStatsModule_ProvideStatsPreloadable$_avito_advert_stats_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert_stats.detail.di.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28302c implements dagger.internal.h<com.avito.android.advert_stats.preloading.d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC42343a> f86138a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f86139b;

    public C28302c(Provider<InterfaceC42343a> provider, Provider<InterfaceC35745a5> provider2) {
        this.f86138a = provider;
        this.f86139b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC42343a interfaceC42343a = this.f86138a.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f86139b.get();
        C28300a.f86135a.getClass();
        return new com.avito.android.advert_stats.preloading.d(interfaceC42343a, interfaceC35745a5, null);
    }
}
