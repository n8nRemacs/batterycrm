package com.avito.android.user_adverts.tab_screens.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: UserAdvertsListItemsModule_ProvideUserAdvertsListAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class k implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f315913a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.user_adverts.tab_screens.advert_list.d f315914b;

    public k(u uVar, com.avito.android.user_adverts.tab_screens.advert_list.d dVar) {
        this.f315913a = uVar;
        this.f315914b = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f315913a.get();
        this.f315914b.getClass();
        com.avito.android.user_adverts.tab_screens.advert_list.c cVar = new com.avito.android.user_adverts.tab_screens.advert_list.c();
        d.f315895a.getClass();
        com.avito.konveyor.adapter.d dVar = new com.avito.konveyor.adapter.d(new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null), aVar, cVar);
        dVar.setHasStableIds(false);
        return dVar;
    }
}
