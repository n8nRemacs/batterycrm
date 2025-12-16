package com.avito.android.vas_planning.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VasPlanningModule_ProvideSimpleRecyclerPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class n implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f322303a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f322304b;

    public n(u uVar, Provider provider) {
        this.f322303a = uVar;
        this.f322304b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.h hVar = (com.avito.konveyor.adapter.h) this.f322303a.get();
        com.avito.konveyor.a aVar = this.f322304b.get();
        h.f322295a.getClass();
        com.avito.konveyor.adapter.j jVar = new com.avito.konveyor.adapter.j(hVar, aVar);
        jVar.setHasStableIds(true);
        return jVar;
    }
}
