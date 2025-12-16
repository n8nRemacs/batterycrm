package com.avito.android.comparison.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ComparisonModule_ProvideHeaderItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class n implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.comparison.items.header_item.d f123851a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.comparison.items.add_more_item.c f123852b;

    public n(com.avito.android.comparison.items.header_item.d dVar, com.avito.android.comparison.items.add_more_item.c cVar) {
        this.f123851a = dVar;
        this.f123852b = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.comparison.items.header_item.c cVar = (com.avito.android.comparison.items.header_item.c) this.f123851a.get();
        com.avito.android.comparison.items.add_more_item.b bVar = (com.avito.android.comparison.items.add_more_item.b) this.f123852b.get();
        j.f123842a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(cVar);
        c10493a.b(bVar);
        return c10493a.a();
    }
}
