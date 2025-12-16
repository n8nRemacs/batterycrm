package com.avito.android.crm_candidates.view.list_items.inline_filters;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: JobCrmInlineFiltersModule_ProvideAdapterPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class k implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f130132a;

    public k(u uVar) {
        this.f130132a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f130132a.get();
        i.f130131a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
