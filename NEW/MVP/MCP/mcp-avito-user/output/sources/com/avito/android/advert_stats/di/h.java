package com.avito.android.advert_stats.di;

import com.avito.android.advert_stats.item.C28323b;
import com.avito.android.advert_stats.item.C28325d;

/* compiled from: AdvertStatsModule_ProvideBarItemBlueprint$_avito_advert_stats_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class h implements dagger.internal.h<C28323b> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f86576a;

    public h(dagger.internal.u uVar) {
        this.f86576a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        C28325d c28325d = (C28325d) this.f86576a.get();
        e.f86574a.getClass();
        return new C28323b(c28325d);
    }
}
