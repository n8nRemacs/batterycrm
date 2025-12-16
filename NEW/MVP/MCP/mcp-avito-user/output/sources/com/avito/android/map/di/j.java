package com.avito.android.map.di;

import com.avito.android.serp.adapter.C34820s;
import com.avito.android.serp.adapter.constructor.rich.D;
import com.avito.android.serp.adapter.constructor.rich.E;
import com.avito.android.serp.adapter.rich_snippets.regular.A;
import com.avito.android.serp.adapter.rich_snippets.regular.B;
import com.avito.android.serp.adapter.rich_snippets.regular.C;
import com.avito.android.serp.adapter.rich_snippets.regular.C34802z;
import com.avito.android.serp.adapter.rich_snippets.regular.J;
import com.avito.android.serp.adapter.rich_snippets.regular.K;
import com.avito.android.serp.adapter.rich_snippets.regular.c0;
import com.avito.android.serp.adapter.rich_snippets.regular.d0;
import com.avito.android.serp.adapter.rich_snippets.service.C34803a;
import com.avito.android.serp.adapter.rich_snippets.service.C34804b;
import com.avito.android.serp.adapter.rich_snippets.service.z;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Iterator;
import java.util.Set;
import javax.inject.Provider;

/* compiled from: AdvertsInPinModule_ProvidePinAdvertsItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class j implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final K f184847a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f184848b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C34820s> f184849c;

    /* renamed from: d, reason: collision with root package name */
    public final A f184850d;

    /* renamed from: e, reason: collision with root package name */
    public final C f184851e;

    /* renamed from: f, reason: collision with root package name */
    public final com.avito.android.serp.adapter.seller_element.seller_pin.b f184852f;

    /* renamed from: g, reason: collision with root package name */
    public final com.avito.android.serp.adapter.header.b f184853g;

    /* renamed from: h, reason: collision with root package name */
    public final E f184854h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.retry.d> f184855i;

    /* renamed from: j, reason: collision with root package name */
    public final com.avito.android.serp.adapter.rich_snippets.travel.b f184856j;

    /* renamed from: k, reason: collision with root package name */
    public final com.avito.android.serp.adapter.rich_snippets.travel.d f184857k;

    /* renamed from: l, reason: collision with root package name */
    public final com.avito.android.serp.adapter.rich_snippets.travel.f f184858l;

    /* renamed from: m, reason: collision with root package name */
    public final com.avito.android.serp.adapter.rich_snippets.travel.h f184859m;

    /* renamed from: n, reason: collision with root package name */
    public final com.avito.android.serp.adapter.rich_snippets.travel.j f184860n;

    /* renamed from: o, reason: collision with root package name */
    public final com.avito.android.serp.adapter.rich_snippets.travel.l f184861o;

    /* renamed from: p, reason: collision with root package name */
    public final com.avito.android.serp.adapter.rich_snippets.job.b f184862p;

    /* renamed from: q, reason: collision with root package name */
    public final C34804b f184863q;

    /* renamed from: r, reason: collision with root package name */
    public final com.avito.android.serp.adapter.rich_snippets.job.p f184864r;

    /* renamed from: s, reason: collision with root package name */
    public final com.avito.android.serp.adapter.rich_snippets.service.A f184865s;

    /* renamed from: t, reason: collision with root package name */
    public final dagger.internal.A f184866t;

    public j(K k12, d0 d0Var, Provider provider, A a12, C c12, com.avito.android.serp.adapter.seller_element.seller_pin.b bVar, com.avito.android.serp.adapter.header.b bVar2, E e12, Provider provider2, com.avito.android.serp.adapter.rich_snippets.travel.b bVar3, com.avito.android.serp.adapter.rich_snippets.travel.d dVar, com.avito.android.serp.adapter.rich_snippets.travel.f fVar, com.avito.android.serp.adapter.rich_snippets.travel.h hVar, com.avito.android.serp.adapter.rich_snippets.travel.j jVar, com.avito.android.serp.adapter.rich_snippets.travel.l lVar, com.avito.android.serp.adapter.rich_snippets.job.b bVar4, C34804b c34804b, com.avito.android.serp.adapter.rich_snippets.job.p pVar, com.avito.android.serp.adapter.rich_snippets.service.A a13, dagger.internal.A a14) {
        this.f184847a = k12;
        this.f184848b = d0Var;
        this.f184849c = provider;
        this.f184850d = a12;
        this.f184851e = c12;
        this.f184852f = bVar;
        this.f184853g = bVar2;
        this.f184854h = e12;
        this.f184855i = provider2;
        this.f184856j = bVar3;
        this.f184857k = dVar;
        this.f184858l = fVar;
        this.f184859m = hVar;
        this.f184860n = jVar;
        this.f184861o = lVar;
        this.f184862p = bVar4;
        this.f184863q = c34804b;
        this.f184864r = pVar;
        this.f184865s = a13;
        this.f184866t = a14;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        J j12 = (J) this.f184847a.get();
        c0 c0Var = (c0) this.f184848b.get();
        C34820s c34820s = this.f184849c.get();
        C34802z c34802z = (C34802z) this.f184850d.get();
        B b12 = (B) this.f184851e.get();
        com.avito.android.serp.adapter.seller_element.seller_pin.a aVar = (com.avito.android.serp.adapter.seller_element.seller_pin.a) this.f184852f.get();
        com.avito.android.serp.adapter.header.a aVar2 = (com.avito.android.serp.adapter.header.a) this.f184853g.get();
        D d12 = (D) this.f184854h.get();
        com.avito.android.serp.adapter.retry.d dVar = this.f184855i.get();
        com.avito.android.serp.adapter.rich_snippets.travel.a aVar3 = (com.avito.android.serp.adapter.rich_snippets.travel.a) this.f184856j.get();
        com.avito.android.serp.adapter.rich_snippets.travel.c cVar = (com.avito.android.serp.adapter.rich_snippets.travel.c) this.f184857k.get();
        com.avito.android.serp.adapter.rich_snippets.travel.e eVar = (com.avito.android.serp.adapter.rich_snippets.travel.e) this.f184858l.get();
        com.avito.android.serp.adapter.rich_snippets.travel.g gVar = (com.avito.android.serp.adapter.rich_snippets.travel.g) this.f184859m.get();
        com.avito.android.serp.adapter.rich_snippets.travel.i iVar = (com.avito.android.serp.adapter.rich_snippets.travel.i) this.f184860n.get();
        com.avito.android.serp.adapter.rich_snippets.travel.k kVar = (com.avito.android.serp.adapter.rich_snippets.travel.k) this.f184861o.get();
        com.avito.android.serp.adapter.rich_snippets.job.a aVar4 = (com.avito.android.serp.adapter.rich_snippets.job.a) this.f184862p.get();
        C34803a c34803a = (C34803a) this.f184863q.get();
        com.avito.android.serp.adapter.rich_snippets.job.o oVar = (com.avito.android.serp.adapter.rich_snippets.job.o) this.f184864r.get();
        z zVar = (z) this.f184865s.get();
        Set set = (Set) this.f184866t.get();
        d dVar2 = d.f184841a;
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(j12);
        c10493a.b(c0Var);
        c10493a.b(c34820s);
        c10493a.b(c34802z);
        c10493a.b(b12);
        c10493a.b(aVar);
        c10493a.b(dVar);
        c10493a.b(aVar2);
        c10493a.b(d12);
        c10493a.b(aVar3);
        c10493a.b(c34803a);
        c10493a.b(cVar);
        c10493a.b(eVar);
        c10493a.b(gVar);
        c10493a.b(iVar);
        c10493a.b(kVar);
        c10493a.b(aVar4);
        c10493a.b(oVar);
        c10493a.b(zVar);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            c10493a.b((TV0.b) it.next());
        }
        return c10493a.a();
    }
}
