package com.avito.android.photo_list_view_group_selection.di;

import Oi0.InterfaceC14698b;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PhotoItemGroupSelectionModule_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class l implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f218411a;

    /* renamed from: b, reason: collision with root package name */
    public final u f218412b;

    public l(dagger.internal.f fVar, u uVar) {
        this.f218411a = fVar;
        this.f218412b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.recycler.data_aware.c cVar = (com.avito.android.recycler.data_aware.c) this.f218411a.get();
        InterfaceC14698b interfaceC14698b = (InterfaceC14698b) this.f218412b.get();
        f.f218403a.getClass();
        return new com.avito.konveyor.adapter.j(cVar, interfaceC14698b);
    }
}
