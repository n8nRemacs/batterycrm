package com.avito.android.comparison.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ComparisonModule_ProvideNestedItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class p implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.comparison.items.option_text_value_item.c f123854a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.comparison.items.option_icon_value_item.c f123855b;

    public p(com.avito.android.comparison.items.option_text_value_item.c cVar, com.avito.android.comparison.items.option_icon_value_item.c cVar2) {
        this.f123854a = cVar;
        this.f123855b = cVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.comparison.items.option_text_value_item.b bVar = (com.avito.android.comparison.items.option_text_value_item.b) this.f123854a.get();
        com.avito.android.comparison.items.option_icon_value_item.b bVar2 = (com.avito.android.comparison.items.option_icon_value_item.b) this.f123855b.get();
        j.f123842a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(bVar);
        c10493a.b(bVar2);
        return c10493a.a();
    }
}
