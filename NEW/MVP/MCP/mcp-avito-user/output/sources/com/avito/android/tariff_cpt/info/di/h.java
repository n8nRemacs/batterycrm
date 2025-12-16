package com.avito.android.tariff_cpt.info.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CptInfoV2ListModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.tariff_cpt.info.ui.items.header.c f298168a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.tariff_cpt.info.ui.items.card.c f298169b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.tariff_cpt.info.ui.items.feature.c f298170c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.tariff_cpt.info.ui.items.features_header.c f298171d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.tariff_cpt.info.ui.items.filters_tabs.d f298172e;

    /* renamed from: f, reason: collision with root package name */
    public final com.avito.android.tariff_cpt.info.ui.items.level_header.c f298173f;

    /* renamed from: g, reason: collision with root package name */
    public final com.avito.android.tariff_cpt.info.ui.items.level_banner.c f298174g;

    public h(com.avito.android.tariff_cpt.info.ui.items.header.c cVar, com.avito.android.tariff_cpt.info.ui.items.card.c cVar2, com.avito.android.tariff_cpt.info.ui.items.feature.c cVar3, com.avito.android.tariff_cpt.info.ui.items.features_header.c cVar4, com.avito.android.tariff_cpt.info.ui.items.filters_tabs.d dVar, com.avito.android.tariff_cpt.info.ui.items.level_header.c cVar5, com.avito.android.tariff_cpt.info.ui.items.level_banner.c cVar6) {
        this.f298168a = cVar;
        this.f298169b = cVar2;
        this.f298170c = cVar3;
        this.f298171d = cVar4;
        this.f298172e = dVar;
        this.f298173f = cVar5;
        this.f298174g = cVar6;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.tariff_cpt.info.ui.items.header.b bVar = (com.avito.android.tariff_cpt.info.ui.items.header.b) this.f298168a.get();
        com.avito.android.tariff_cpt.info.ui.items.card.b bVar2 = (com.avito.android.tariff_cpt.info.ui.items.card.b) this.f298169b.get();
        com.avito.android.tariff_cpt.info.ui.items.feature.b bVar3 = (com.avito.android.tariff_cpt.info.ui.items.feature.b) this.f298170c.get();
        com.avito.android.tariff_cpt.info.ui.items.features_header.b bVar4 = (com.avito.android.tariff_cpt.info.ui.items.features_header.b) this.f298171d.get();
        com.avito.android.tariff_cpt.info.ui.items.filters_tabs.c cVar = (com.avito.android.tariff_cpt.info.ui.items.filters_tabs.c) this.f298172e.get();
        com.avito.android.tariff_cpt.info.ui.items.level_header.b bVar5 = (com.avito.android.tariff_cpt.info.ui.items.level_header.b) this.f298173f.get();
        com.avito.android.tariff_cpt.info.ui.items.level_banner.b bVar6 = (com.avito.android.tariff_cpt.info.ui.items.level_banner.b) this.f298174g.get();
        f.f298166a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(bVar);
        c10493a.b(bVar2);
        c10493a.b(bVar3);
        c10493a.b(bVar4);
        c10493a.b(cVar);
        c10493a.b(bVar5);
        c10493a.b(bVar6);
        return c10493a.a();
    }
}
