package com.avito.android.publish.select.di;

import androidx.recyclerview.widget.RecyclerView;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SelectModule_ProvideAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class d implements dagger.internal.h<RecyclerView.Adapter<?>> {

    /* renamed from: a, reason: collision with root package name */
    public final c f242676a;

    /* renamed from: b, reason: collision with root package name */
    public final u f242677b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f242678c;

    public d(c cVar, u uVar, Provider provider) {
        this.f242676a = cVar;
        this.f242677b = uVar;
        this.f242678c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f242677b.get();
        com.avito.konveyor.a aVar2 = this.f242678c.get();
        this.f242676a.getClass();
        return new com.avito.konveyor.adapter.j(aVar, aVar2);
    }
}
