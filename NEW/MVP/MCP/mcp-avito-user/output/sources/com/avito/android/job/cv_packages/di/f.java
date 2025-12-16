package com.avito.android.job.cv_packages.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CvPackagesModule_ProvideSimpleRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class f implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f174359a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f174360b;

    public f(u uVar, Provider provider) {
        this.f174359a = uVar;
        this.f174360b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f174359a.get();
        com.avito.konveyor.a aVar2 = this.f174360b.get();
        c cVar = c.f174356a;
        return new com.avito.konveyor.adapter.j(aVar, aVar2);
    }
}
