package com.avito.android.search_suggest.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SearchSuggestModule_ProvideListAdapter$_avito_search_suggest_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class j implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f264231a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f264232b;

    public j(u uVar, Provider provider) {
        this.f264231a = uVar;
        this.f264232b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f264231a.get();
        com.avito.konveyor.a aVar2 = this.f264232b.get();
        int i12 = g.f264221a;
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}
