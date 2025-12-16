package com.avito.android.search_suggest.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SearchSuggestModule_ProvideAdapterPresenter$_avito_search_suggest_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f264222a;

    public h(u uVar) {
        this.f264222a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f264222a.get();
        int i12 = g.f264221a;
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
