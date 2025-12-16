package com.avito.android.vas_union.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VasUnionV2Module_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class s implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.vas_union.ui.items.title.b f323185a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.vas_union.ui.items.tabs.b f323186b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.vas_union.ui.items.vas_performance_chips.b f323187c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.vas_union.ui.items.vas_bundle.e f323188d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.vas_union.ui.items.vas_performance_click.c f323189e;

    /* renamed from: f, reason: collision with root package name */
    public final com.avito.android.vas_union.ui.items.vas_performance_select.e f323190f;

    public s(com.avito.android.vas_union.ui.items.title.b bVar, com.avito.android.vas_union.ui.items.tabs.b bVar2, com.avito.android.vas_union.ui.items.vas_performance_chips.b bVar3, com.avito.android.vas_union.ui.items.vas_bundle.e eVar, com.avito.android.vas_union.ui.items.vas_performance_click.c cVar, com.avito.android.vas_union.ui.items.vas_performance_select.e eVar2) {
        this.f323185a = bVar;
        this.f323186b = bVar2;
        this.f323187c = bVar3;
        this.f323188d = eVar;
        this.f323189e = cVar;
        this.f323190f = eVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.vas_union.ui.items.title.a aVar = (com.avito.android.vas_union.ui.items.title.a) this.f323185a.get();
        com.avito.android.vas_union.ui.items.tabs.a aVar2 = (com.avito.android.vas_union.ui.items.tabs.a) this.f323186b.get();
        com.avito.android.vas_union.ui.items.vas_performance_chips.a aVar3 = (com.avito.android.vas_union.ui.items.vas_performance_chips.a) this.f323187c.get();
        com.avito.android.vas_union.ui.items.vas_bundle.d dVar = (com.avito.android.vas_union.ui.items.vas_bundle.d) this.f323188d.get();
        com.avito.android.vas_union.ui.items.vas_performance_click.b bVar = (com.avito.android.vas_union.ui.items.vas_performance_click.b) this.f323189e.get();
        com.avito.android.vas_union.ui.items.vas_performance_select.d dVar2 = (com.avito.android.vas_union.ui.items.vas_performance_select.d) this.f323190f.get();
        q.f323183a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        c10493a.b(aVar2);
        c10493a.b(aVar3);
        c10493a.b(dVar);
        c10493a.b(bVar);
        c10493a.b(dVar2);
        return c10493a.a();
    }
}
