package com.avito.android.advert_stats.di;

import com.avito.android.advert_stats.item.C28323b;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;

/* compiled from: AdvertStatsModule_ProvideChartSectionItemBinder$_avito_advert_stats_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class k implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f86580a;

    public k(dagger.internal.u uVar) {
        this.f86580a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        C28323b c28323b = (C28323b) this.f86580a.get();
        e.f86574a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(c28323b);
        return c10493a.a();
    }
}
