package com.avito.android.recall_me.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RecallMeItemsModule_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class i implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f251823a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f251824b;

    public i(u uVar, Provider provider) {
        this.f251823a = uVar;
        this.f251824b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f251823a.get();
        com.avito.konveyor.a aVar2 = this.f251824b.get();
        f.f251817a.getClass();
        return new com.avito.konveyor.adapter.j(aVar, aVar2);
    }
}
