package com.avito.android.guests_selector.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GuestsSelectorKonveyorModule_ProvideListRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class h implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f161431a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f161432b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.guests_selector.items.b f161433c;

    public h(u uVar, Provider provider, com.avito.android.guests_selector.items.b bVar) {
        this.f161431a = uVar;
        this.f161432b = provider;
        this.f161433c = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f161431a.get();
        com.avito.konveyor.a aVar2 = this.f161432b.get();
        this.f161433c.getClass();
        com.avito.android.guests_selector.items.a aVar3 = new com.avito.android.guests_selector.items.a();
        e.f161428a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, aVar3);
    }
}
