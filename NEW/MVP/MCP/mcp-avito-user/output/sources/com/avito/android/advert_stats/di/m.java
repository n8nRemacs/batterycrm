package com.avito.android.advert_stats.di;

import com.avito.android.advert_stats.item.InterfaceC28331j;
import com.avito.android.advert_stats.item.InterfaceC28337p;
import javax.inject.Provider;

/* compiled from: AdvertStatsModule_ProvideOnBarItemClickListener$_avito_advert_stats_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class m implements dagger.internal.h<InterfaceC28331j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28337p> f86581a;

    public m(Provider<InterfaceC28337p> provider) {
        this.f86581a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28337p interfaceC28337p = this.f86581a.get();
        e.f86574a.getClass();
        return interfaceC28337p;
    }
}
