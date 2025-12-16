package com.avito.android.crm_candidates.di.full_filters;

import com.avito.android.crm_candidates.view.base.C29623a;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FiltersModule_ProvideFilterAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f129282a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f129283b;

    public f(u uVar, Provider provider) {
        this.f129282a = uVar;
        this.f129283b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f129282a.get();
        com.avito.konveyor.a aVar2 = this.f129283b.get();
        e.f129281a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, new C29623a());
    }
}
