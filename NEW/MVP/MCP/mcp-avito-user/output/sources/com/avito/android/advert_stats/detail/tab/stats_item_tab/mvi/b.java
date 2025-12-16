package com.avito.android.advert_stats.detail.tab.stats_item_tab.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StatsItemTabActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f86544a;

    public b(Provider<InterfaceC28373a> provider) {
        this.f86544a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f86544a.get());
    }
}
