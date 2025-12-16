package com.avito.android.crm_candidates.view.list_items.notes_list;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: JobCrmNotesListModule_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class j implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f130183a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f130184b;

    public j(u uVar, Provider provider) {
        this.f130183a = uVar;
        this.f130184b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f130183a.get();
        com.avito.konveyor.a aVar2 = this.f130184b.get();
        i.f130182a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}
