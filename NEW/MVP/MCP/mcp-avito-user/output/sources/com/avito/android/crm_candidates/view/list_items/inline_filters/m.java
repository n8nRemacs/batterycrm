package com.avito.android.crm_candidates.view.list_items.inline_filters;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: JobCrmInlineFiltersModule_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class m implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f130134a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f130135b;

    public m(u uVar, Provider provider) {
        this.f130134a = uVar;
        this.f130135b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f130134a.get();
        com.avito.konveyor.a aVar2 = this.f130135b.get();
        i.f130131a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}
