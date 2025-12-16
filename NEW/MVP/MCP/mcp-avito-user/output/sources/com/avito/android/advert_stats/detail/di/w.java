package com.avito.android.advert_stats.detail.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;

/* compiled from: AdvertDetailStatsTabModule_ProvideItemBinder$_avito_advert_stats_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class w implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.advert_stats.detail.tab.items.funnel.b f86164a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.advert_stats.detail.tab.items.chart.q f86165b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.advert_stats.detail.tab.items.button.b f86166c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.advert_stats.detail.tab.items.titile.b f86167d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.advert_stats.detail.tab.items.cost.b f86168e;

    /* renamed from: f, reason: collision with root package name */
    public final com.avito.android.advert_stats.detail.tab.items.cost_extended.b f86169f;

    /* renamed from: g, reason: collision with root package name */
    public final com.avito.android.advert_stats.detail.tab.items.common_stats.b f86170g;

    /* renamed from: h, reason: collision with root package name */
    public final com.avito.android.advert_stats.detail.tab.items.cost_title.b f86171h;

    /* renamed from: i, reason: collision with root package name */
    public final com.avito.android.advert_stats.detail.tab.items.contact.b f86172i;

    public w(com.avito.android.advert_stats.detail.tab.items.funnel.b bVar, com.avito.android.advert_stats.detail.tab.items.chart.q qVar, com.avito.android.advert_stats.detail.tab.items.button.b bVar2, com.avito.android.advert_stats.detail.tab.items.titile.b bVar3, com.avito.android.advert_stats.detail.tab.items.cost.b bVar4, com.avito.android.advert_stats.detail.tab.items.cost_extended.b bVar5, com.avito.android.advert_stats.detail.tab.items.common_stats.b bVar6, com.avito.android.advert_stats.detail.tab.items.cost_title.b bVar7, com.avito.android.advert_stats.detail.tab.items.contact.b bVar8) {
        this.f86164a = bVar;
        this.f86165b = qVar;
        this.f86166c = bVar2;
        this.f86167d = bVar3;
        this.f86168e = bVar4;
        this.f86169f = bVar5;
        this.f86170g = bVar6;
        this.f86171h = bVar7;
        this.f86172i = bVar8;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.advert_stats.detail.tab.items.funnel.a aVar = (com.avito.android.advert_stats.detail.tab.items.funnel.a) this.f86164a.get();
        com.avito.android.advert_stats.detail.tab.items.chart.p pVar = (com.avito.android.advert_stats.detail.tab.items.chart.p) this.f86165b.get();
        com.avito.android.advert_stats.detail.tab.items.button.a aVar2 = (com.avito.android.advert_stats.detail.tab.items.button.a) this.f86166c.get();
        com.avito.android.advert_stats.detail.tab.items.titile.a aVar3 = (com.avito.android.advert_stats.detail.tab.items.titile.a) this.f86167d.get();
        com.avito.android.advert_stats.detail.tab.items.cost.a aVar4 = (com.avito.android.advert_stats.detail.tab.items.cost.a) this.f86168e.get();
        com.avito.android.advert_stats.detail.tab.items.cost_extended.a aVar5 = (com.avito.android.advert_stats.detail.tab.items.cost_extended.a) this.f86169f.get();
        com.avito.android.advert_stats.detail.tab.items.common_stats.a aVar6 = (com.avito.android.advert_stats.detail.tab.items.common_stats.a) this.f86170g.get();
        com.avito.android.advert_stats.detail.tab.items.cost_title.a aVar7 = (com.avito.android.advert_stats.detail.tab.items.cost_title.a) this.f86171h.get();
        com.avito.android.advert_stats.detail.tab.items.contact.a aVar8 = (com.avito.android.advert_stats.detail.tab.items.contact.a) this.f86172i.get();
        s.f86157a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        c10493a.b(pVar);
        c10493a.b(aVar2);
        c10493a.b(aVar3);
        c10493a.b(aVar4);
        c10493a.b(aVar5);
        c10493a.b(aVar6);
        c10493a.b(aVar7);
        c10493a.b(aVar8);
        return c10493a.a();
    }
}
