package com.avito.android.publish.price_list.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SelectPriceListItemsModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class i implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.publish.price_list.items.selectable.c f238499a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.publish.price_list.items.selectable.k f238500b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.publish.price_list.items.selected.k f238501c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.publish.price_list.items.selected.c f238502d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.publish.price_list.items.header.d f238503e;

    /* renamed from: f, reason: collision with root package name */
    public final com.avito.android.publish.price_list.items.group.e f238504f;

    /* renamed from: g, reason: collision with root package name */
    public final com.avito.android.publish.price_list.items.spacer.b f238505g;

    public i(com.avito.android.publish.price_list.items.selectable.c cVar, com.avito.android.publish.price_list.items.selectable.k kVar, com.avito.android.publish.price_list.items.selected.k kVar2, com.avito.android.publish.price_list.items.selected.c cVar2, com.avito.android.publish.price_list.items.header.d dVar, com.avito.android.publish.price_list.items.group.e eVar, com.avito.android.publish.price_list.items.spacer.b bVar) {
        this.f238499a = cVar;
        this.f238500b = kVar;
        this.f238501c = kVar2;
        this.f238502d = cVar2;
        this.f238503e = dVar;
        this.f238504f = eVar;
        this.f238505g = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.publish.price_list.items.selectable.b bVar = (com.avito.android.publish.price_list.items.selectable.b) this.f238499a.get();
        com.avito.android.publish.price_list.items.selectable.j jVar = (com.avito.android.publish.price_list.items.selectable.j) this.f238500b.get();
        com.avito.android.publish.price_list.items.selected.j jVar2 = (com.avito.android.publish.price_list.items.selected.j) this.f238501c.get();
        com.avito.android.publish.price_list.items.selected.b bVar2 = (com.avito.android.publish.price_list.items.selected.b) this.f238502d.get();
        com.avito.android.publish.price_list.items.header.c cVar = (com.avito.android.publish.price_list.items.header.c) this.f238503e.get();
        com.avito.android.publish.price_list.items.group.d dVar = (com.avito.android.publish.price_list.items.group.d) this.f238504f.get();
        com.avito.android.publish.price_list.items.spacer.a aVar = (com.avito.android.publish.price_list.items.spacer.a) this.f238505g.get();
        e.f238492a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(bVar);
        c10493a.b(jVar);
        c10493a.b(jVar2);
        c10493a.b(bVar2);
        c10493a.b(cVar);
        c10493a.b(dVar);
        c10493a.b(aVar);
        return c10493a.a();
    }
}
