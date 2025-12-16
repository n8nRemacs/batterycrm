package com.avito.android.photo_list_view_group_selection.di;

import androidx.recyclerview.widget.C;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PhotoItemGroupSelectionModule_ProvideDataAwareAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class h implements dagger.internal.h<com.avito.android.recycler.data_aware.c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C> f218405a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.h> f218406b;

    /* renamed from: c, reason: collision with root package name */
    public final u f218407c;

    public h(u uVar, Provider provider, Provider provider2) {
        this.f218405a = provider;
        this.f218406b = provider2;
        this.f218407c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f218405a);
        com.avito.konveyor.adapter.h hVar = this.f218406b.get();
        com.avito.android.recycler.data_aware.e eVar = (com.avito.android.recycler.data_aware.e) this.f218407c.get();
        f.f218403a.getClass();
        return new com.avito.android.recycler.data_aware.d(eVarB, hVar, eVar);
    }
}
