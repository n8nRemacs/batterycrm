package com.avito.android.advert_stats.di;

import com.avito.android.advert_stats.item.C28325d;
import com.avito.android.advert_stats.item.InterfaceC28331j;
import com.avito.android.advert_stats.item.InterfaceC28333l;
import javax.inject.Provider;

/* compiled from: AdvertStatsModule_ProvideBarItemPresenter$_avito_advert_stats_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class i implements dagger.internal.h<C28325d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28333l> f86577a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f86578b;

    public i(dagger.internal.u uVar, Provider provider) {
        this.f86577a = provider;
        this.f86578b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28333l interfaceC28333l = this.f86577a.get();
        InterfaceC28331j interfaceC28331j = (InterfaceC28331j) this.f86578b.get();
        e.f86574a.getClass();
        return new C28325d(interfaceC28333l, interfaceC28331j);
    }
}
