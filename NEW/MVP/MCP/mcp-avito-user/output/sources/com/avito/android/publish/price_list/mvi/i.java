package com.avito.android.publish.price_list.mvi;

import com.avito.android.Q1;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SelectPriceListActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Boolean> f238883a;

    /* renamed from: b, reason: collision with root package name */
    public final u f238884b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.publish.price_list.domain.c> f238885c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.publish.price_list.domain.b f238886d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.publish.price_list.domain.use_case.p f238887e;

    /* renamed from: f, reason: collision with root package name */
    public final com.avito.android.publish.price_list.domain.use_case.l f238888f;

    /* renamed from: g, reason: collision with root package name */
    public final com.avito.android.publish.price_list.domain.use_case.j f238889g;

    /* renamed from: h, reason: collision with root package name */
    public final com.avito.android.publish.price_list.domain.use_case.d f238890h;

    /* renamed from: i, reason: collision with root package name */
    public final com.avito.android.publish.price_list.domain.use_case.r f238891i;

    /* renamed from: j, reason: collision with root package name */
    public final com.avito.android.publish.price_list.domain.use_case.f f238892j;

    /* renamed from: k, reason: collision with root package name */
    public final com.avito.android.publish.price_list.domain.use_case.b f238893k;

    /* renamed from: l, reason: collision with root package name */
    public final Provider<Q1> f238894l;

    public i(Provider provider, u uVar, Provider provider2, com.avito.android.publish.price_list.domain.b bVar, com.avito.android.publish.price_list.domain.use_case.p pVar, com.avito.android.publish.price_list.domain.use_case.l lVar, com.avito.android.publish.price_list.domain.use_case.j jVar, com.avito.android.publish.price_list.domain.use_case.d dVar, com.avito.android.publish.price_list.domain.use_case.r rVar, com.avito.android.publish.price_list.domain.use_case.f fVar, com.avito.android.publish.price_list.domain.use_case.b bVar2, Provider provider3) {
        this.f238883a = provider;
        this.f238884b = uVar;
        this.f238885c = provider2;
        this.f238886d = bVar;
        this.f238887e = pVar;
        this.f238888f = lVar;
        this.f238889g = jVar;
        this.f238890h = dVar;
        this.f238891i = rVar;
        this.f238892j = fVar;
        this.f238893k = bVar2;
        this.f238894l = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        boolean zBooleanValue = this.f238883a.get().booleanValue();
        com.avito.android.publish.price_list.domain.g gVar = (com.avito.android.publish.price_list.domain.g) this.f238884b.get();
        com.avito.android.publish.price_list.domain.c cVar = this.f238885c.get();
        com.avito.android.publish.price_list.domain.a aVar = (com.avito.android.publish.price_list.domain.a) this.f238886d.get();
        com.avito.android.publish.price_list.domain.use_case.o oVar = (com.avito.android.publish.price_list.domain.use_case.o) this.f238887e.get();
        com.avito.android.publish.price_list.domain.use_case.k kVar = (com.avito.android.publish.price_list.domain.use_case.k) this.f238888f.get();
        this.f238889g.getClass();
        return new h(zBooleanValue, gVar, cVar, aVar, oVar, kVar, new com.avito.android.publish.price_list.domain.use_case.i(), (com.avito.android.publish.price_list.domain.use_case.c) this.f238890h.get(), (com.avito.android.publish.price_list.domain.use_case.q) this.f238891i.get(), (com.avito.android.publish.price_list.domain.use_case.e) this.f238892j.get(), (com.avito.android.publish.price_list.domain.use_case.a) this.f238893k.get(), this.f238894l.get());
    }
}
