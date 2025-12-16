package com.avito.android.comparison.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ComparisonModule_ProvideBodyItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class l implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.comparison.items.diff_switch_item.c f123844a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.comparison.items.specification_header_item.b f123845b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.comparison.items.option_header_item.b f123846c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.comparison.items.nested_scrolling_item.d f123847d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.comparison.items.no_diff_stub_item.c f123848e;

    /* renamed from: f, reason: collision with root package name */
    public final com.avito.android.comparison.items.disclaimer.c f123849f;

    public l(com.avito.android.comparison.items.diff_switch_item.c cVar, com.avito.android.comparison.items.specification_header_item.b bVar, com.avito.android.comparison.items.option_header_item.b bVar2, com.avito.android.comparison.items.nested_scrolling_item.d dVar, com.avito.android.comparison.items.no_diff_stub_item.c cVar2, com.avito.android.comparison.items.disclaimer.c cVar3) {
        this.f123844a = cVar;
        this.f123845b = bVar;
        this.f123846c = bVar2;
        this.f123847d = dVar;
        this.f123848e = cVar2;
        this.f123849f = cVar3;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.comparison.items.diff_switch_item.b bVar = (com.avito.android.comparison.items.diff_switch_item.b) this.f123844a.get();
        com.avito.android.comparison.items.specification_header_item.a aVar = (com.avito.android.comparison.items.specification_header_item.a) this.f123845b.get();
        com.avito.android.comparison.items.option_header_item.a aVar2 = (com.avito.android.comparison.items.option_header_item.a) this.f123846c.get();
        com.avito.android.comparison.items.nested_scrolling_item.c cVar = (com.avito.android.comparison.items.nested_scrolling_item.c) this.f123847d.get();
        com.avito.android.comparison.items.no_diff_stub_item.b bVar2 = (com.avito.android.comparison.items.no_diff_stub_item.b) this.f123848e.get();
        com.avito.android.comparison.items.disclaimer.b bVar3 = (com.avito.android.comparison.items.disclaimer.b) this.f123849f.get();
        j.f123842a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(bVar);
        c10493a.b(aVar);
        c10493a.b(aVar2);
        c10493a.b(cVar);
        c10493a.b(bVar2);
        c10493a.b(bVar3);
        return c10493a.a();
    }
}
