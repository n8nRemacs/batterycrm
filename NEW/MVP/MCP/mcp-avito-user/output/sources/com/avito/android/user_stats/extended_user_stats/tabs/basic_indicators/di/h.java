package com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BasicIndicatorsTabModule_ProvideItemBinder$_avito_user_stats_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class h implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.funnel.c f317365a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.indicator.b f317366b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.common_indicator.b f317367c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.title_indicator.b f317368d;

    public h(com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.funnel.c cVar, com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.indicator.b bVar, com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.common_indicator.b bVar2, com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.title_indicator.b bVar3) {
        this.f317365a = cVar;
        this.f317366b = bVar;
        this.f317367c = bVar2;
        this.f317368d = bVar3;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.funnel.b bVar = (com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.funnel.b) this.f317365a.get();
        com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.indicator.a aVar = (com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.indicator.a) this.f317366b.get();
        com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.common_indicator.a aVar2 = (com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.common_indicator.a) this.f317367c.get();
        com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.title_indicator.a aVar3 = (com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.title_indicator.a) this.f317368d.get();
        c.f317356a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(bVar);
        c10493a.b(aVar);
        c10493a.b(aVar2);
        c10493a.b(aVar3);
        return c10493a.a();
    }
}
