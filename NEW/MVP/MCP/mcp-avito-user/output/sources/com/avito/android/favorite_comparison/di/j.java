package com.avito.android.favorite_comparison.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FavoriteComparisonModule_Companion_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class j implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.favorite_comparison.presentation.items.comparison_list_item.c f155306a;

    public j(com.avito.android.favorite_comparison.presentation.items.comparison_list_item.c cVar) {
        this.f155306a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.favorite_comparison.presentation.items.comparison_list_item.b bVar = (com.avito.android.favorite_comparison.presentation.items.comparison_list_item.b) this.f155306a.get();
        g.f155301a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(bVar);
        return c10493a.a();
    }
}
