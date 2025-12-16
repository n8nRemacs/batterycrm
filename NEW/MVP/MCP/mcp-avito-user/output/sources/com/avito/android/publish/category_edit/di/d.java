package com.avito.android.publish.category_edit.di;

import androidx.recyclerview.widget.RecyclerView;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import kotlin.Q;

/* compiled from: CategoryEditModule_ProvideAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class d implements dagger.internal.h<Q<com.avito.konveyor.adapter.a, RecyclerView.Adapter<?>>> {

    /* renamed from: a, reason: collision with root package name */
    public final u f232351a;

    public d(u uVar) {
        this.f232351a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f232351a.get();
        c.f232350a.getClass();
        com.avito.konveyor.adapter.h hVar = new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
        com.avito.konveyor.adapter.j jVar = new com.avito.konveyor.adapter.j(hVar, aVar);
        jVar.setHasStableIds(true);
        return new Q(hVar, jVar);
    }
}
