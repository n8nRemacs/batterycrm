package com.avito.android.advert_stats.detail.tab.stats_item_tab.mvi;

import com.avito.android.util.InterfaceC35863o4;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StatsItemTabReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35863o4> f86570a;

    public i(Provider<InterfaceC35863o4> provider) {
        this.f86570a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f86570a.get());
    }
}
