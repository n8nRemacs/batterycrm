package com.avito.android.advert_stats.di;

import com.avito.android.advert_stats.item.P;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;

/* compiled from: AdvertStatsModule_ProvideWeekItemBinder$_avito_advert_stats_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class u implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f86601a;

    public u(dagger.internal.u uVar) {
        this.f86601a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        P p12 = (P) this.f86601a.get();
        e.f86574a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(p12);
        return c10493a.a();
    }
}
