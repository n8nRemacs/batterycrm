package com.avito.android.di.module;

import com.avito.android.serp.adapter.C34741k;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import javax.inject.Provider;

/* compiled from: CarouselItemModule_ProvidesCarouselItemsBinderFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.v2, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30210v2 implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C34741k> f144647a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.serp.adapter.sale_advert_item.b f144648b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.serp.adapter.promotion_advert_item.b f144649c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.serp.adapter.carousel_vacancy_viewed.b f144650d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.serp.adapter.carousel_vacancy_viewed.k f144651e;

    /* renamed from: f, reason: collision with root package name */
    public final com.avito.android.serp.adapter.carousel_show_more.e f144652f;

    /* renamed from: g, reason: collision with root package name */
    public final com.avito.android.serp.adapter.carousel_image.b f144653g;

    /* renamed from: h, reason: collision with root package name */
    public final com.avito.android.serp.adapter.carousel_gig.b f144654h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.constructor.v> f144655i;

    /* renamed from: j, reason: collision with root package name */
    public final com.avito.android.serp.adapter.constructor.s f144656j;

    /* renamed from: k, reason: collision with root package name */
    public final com.avito.android.serp.adapter.constructor.u f144657k;

    /* renamed from: l, reason: collision with root package name */
    public final com.avito.android.serp.adapter.constructor.y f144658l;

    /* renamed from: m, reason: collision with root package name */
    public final com.avito.android.serp.adapter.service_trust_grid.b f144659m;

    public C30210v2(Provider provider, com.avito.android.serp.adapter.sale_advert_item.b bVar, com.avito.android.serp.adapter.promotion_advert_item.b bVar2, com.avito.android.serp.adapter.carousel_vacancy_viewed.b bVar3, com.avito.android.serp.adapter.carousel_vacancy_viewed.k kVar, com.avito.android.serp.adapter.carousel_show_more.e eVar, com.avito.android.serp.adapter.carousel_image.b bVar4, com.avito.android.serp.adapter.carousel_gig.b bVar5, Provider provider2, com.avito.android.serp.adapter.constructor.s sVar, com.avito.android.serp.adapter.constructor.u uVar, com.avito.android.serp.adapter.constructor.y yVar, com.avito.android.serp.adapter.service_trust_grid.b bVar6) {
        this.f144647a = provider;
        this.f144648b = bVar;
        this.f144649c = bVar2;
        this.f144650d = bVar3;
        this.f144651e = kVar;
        this.f144652f = eVar;
        this.f144653g = bVar4;
        this.f144654h = bVar5;
        this.f144655i = provider2;
        this.f144656j = sVar;
        this.f144657k = uVar;
        this.f144658l = yVar;
        this.f144659m = bVar6;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        C34741k c34741k = this.f144647a.get();
        com.avito.android.serp.adapter.sale_advert_item.a aVar = (com.avito.android.serp.adapter.sale_advert_item.a) this.f144648b.get();
        com.avito.android.serp.adapter.promotion_advert_item.a aVar2 = (com.avito.android.serp.adapter.promotion_advert_item.a) this.f144649c.get();
        com.avito.android.serp.adapter.carousel_vacancy_viewed.a aVar3 = (com.avito.android.serp.adapter.carousel_vacancy_viewed.a) this.f144650d.get();
        com.avito.android.serp.adapter.carousel_vacancy_viewed.j jVar = (com.avito.android.serp.adapter.carousel_vacancy_viewed.j) this.f144651e.get();
        com.avito.android.serp.adapter.carousel_show_more.d dVar = (com.avito.android.serp.adapter.carousel_show_more.d) this.f144652f.get();
        com.avito.android.serp.adapter.carousel_image.a aVar4 = (com.avito.android.serp.adapter.carousel_image.a) this.f144653g.get();
        com.avito.android.serp.adapter.carousel_gig.a aVar5 = (com.avito.android.serp.adapter.carousel_gig.a) this.f144654h.get();
        com.avito.android.serp.adapter.constructor.v vVar = this.f144655i.get();
        com.avito.android.serp.adapter.constructor.r rVar = (com.avito.android.serp.adapter.constructor.r) this.f144656j.get();
        com.avito.android.serp.adapter.constructor.t tVar = (com.avito.android.serp.adapter.constructor.t) this.f144657k.get();
        com.avito.android.serp.adapter.constructor.x xVar = (com.avito.android.serp.adapter.constructor.x) this.f144658l.get();
        com.avito.android.serp.adapter.service_trust_grid.a aVar6 = (com.avito.android.serp.adapter.service_trust_grid.a) this.f144659m.get();
        C30188t2.f144587a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(c34741k);
        c10493a.b(aVar);
        c10493a.b(aVar2);
        c10493a.b(aVar3);
        c10493a.b(jVar);
        c10493a.b(dVar);
        c10493a.b(aVar4);
        c10493a.b(aVar5);
        c10493a.b(vVar);
        c10493a.b(rVar);
        c10493a.b(tVar);
        c10493a.b(xVar);
        c10493a.b(aVar6);
        return c10493a.a();
    }
}
