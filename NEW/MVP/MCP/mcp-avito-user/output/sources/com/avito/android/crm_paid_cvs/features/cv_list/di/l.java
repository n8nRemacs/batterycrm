package com.avito.android.crm_paid_cvs.features.cv_list.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CvListModule_ProvideFilterAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class l implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f130391a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f130392b;

    public l(u uVar, Provider provider) {
        this.f130391a = uVar;
        this.f130392b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f130391a.get();
        com.avito.konveyor.a aVar2 = this.f130392b.get();
        d.f130382a.getClass();
        return new com.avito.konveyor.adapter.j(aVar, aVar2);
    }
}
