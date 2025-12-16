package com.avito.android.phone_reverification_info.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PhoneReverificationItemsModule_ProvideSimpleRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class g implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f216094a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f216095b;

    public g(u uVar, Provider provider) {
        this.f216094a = uVar;
        this.f216095b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.h hVar = (com.avito.konveyor.adapter.h) this.f216094a.get();
        com.avito.konveyor.a aVar = this.f216095b.get();
        d.f216088a.getClass();
        com.avito.konveyor.adapter.j jVar = new com.avito.konveyor.adapter.j(hVar, aVar);
        jVar.setHasStableIds(true);
        return jVar;
    }
}
