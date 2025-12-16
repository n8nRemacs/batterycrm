package com.avito.android.confirm_documents_bottom_sheet.di;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ConfirmDocumentsModule_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class i implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f125528a;

    /* renamed from: b, reason: collision with root package name */
    public final f f125529b;

    public i(dagger.internal.f fVar, f fVar2) {
        this.f125528a = fVar;
        this.f125529b = fVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f125528a.get();
        com.avito.konveyor.a aVar2 = (com.avito.konveyor.a) this.f125529b.get();
        d.f125521a.getClass();
        com.avito.konveyor.adapter.j jVar = new com.avito.konveyor.adapter.j(aVar, aVar2);
        jVar.setHasStableIds(true);
        return jVar;
    }
}
