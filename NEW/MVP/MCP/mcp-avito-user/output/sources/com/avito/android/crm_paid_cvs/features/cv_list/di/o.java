package com.avito.android.crm_paid_cvs.features.cv_list.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CvListModule_ProvideSearchesAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class o implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f130395a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f130396b;

    public o(u uVar, Provider provider) {
        this.f130395a = uVar;
        this.f130396b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f130395a.get();
        com.avito.konveyor.a aVar2 = this.f130396b.get();
        d.f130382a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}
