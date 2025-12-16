package com.avito.android.crm_candidates.view.list_items.survey_results;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: JobCrmPropertyModule_ProvideAdapterPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class b implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f130256a;

    public b(u uVar) {
        this.f130256a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f130256a.get();
        a.f130255a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
