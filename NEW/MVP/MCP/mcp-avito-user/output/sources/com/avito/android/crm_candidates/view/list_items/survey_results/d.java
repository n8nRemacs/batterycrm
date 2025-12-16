package com.avito.android.crm_candidates.view.list_items.survey_results;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: JobCrmPropertyModule_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class d implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f130258a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f130259b;

    public d(u uVar, Provider provider) {
        this.f130258a = uVar;
        this.f130259b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f130258a.get();
        com.avito.konveyor.a aVar2 = this.f130259b.get();
        a.f130255a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}
