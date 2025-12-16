package com.avito.android.tariff.cpx.info.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffCpxInfoListModule_ProvideItemBinder$_avito_tariff_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class j implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.tariff.cpx.info.items.header.e f296406a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.tariff.cpx.info.items.card.c f296407b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.tariff.cpx.info.items.level_header.e f296408c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.tariff.cpx.info.items.filters_tabs.d f296409d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.tariff.cpx.info.items.features_header.c f296410e;

    /* renamed from: f, reason: collision with root package name */
    public final com.avito.android.tariff.cpx.info.items.feature.c f296411f;

    public j(com.avito.android.tariff.cpx.info.items.header.e eVar, com.avito.android.tariff.cpx.info.items.card.c cVar, com.avito.android.tariff.cpx.info.items.level_header.e eVar2, com.avito.android.tariff.cpx.info.items.filters_tabs.d dVar, com.avito.android.tariff.cpx.info.items.features_header.c cVar2, com.avito.android.tariff.cpx.info.items.feature.c cVar3) {
        this.f296406a = eVar;
        this.f296407b = cVar;
        this.f296408c = eVar2;
        this.f296409d = dVar;
        this.f296410e = cVar2;
        this.f296411f = cVar3;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.tariff.cpx.info.items.header.d dVar = (com.avito.android.tariff.cpx.info.items.header.d) this.f296406a.get();
        com.avito.android.tariff.cpx.info.items.card.b bVar = (com.avito.android.tariff.cpx.info.items.card.b) this.f296407b.get();
        com.avito.android.tariff.cpx.info.items.level_header.d dVar2 = (com.avito.android.tariff.cpx.info.items.level_header.d) this.f296408c.get();
        com.avito.android.tariff.cpx.info.items.filters_tabs.c cVar = (com.avito.android.tariff.cpx.info.items.filters_tabs.c) this.f296409d.get();
        com.avito.android.tariff.cpx.info.items.features_header.b bVar2 = (com.avito.android.tariff.cpx.info.items.features_header.b) this.f296410e.get();
        com.avito.android.tariff.cpx.info.items.feature.b bVar3 = (com.avito.android.tariff.cpx.info.items.feature.b) this.f296411f.get();
        h.f296404a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(dVar);
        c10493a.b(bVar);
        c10493a.b(dVar2);
        c10493a.b(cVar);
        c10493a.b(bVar2);
        c10493a.b(bVar3);
        return c10493a.a();
    }
}
