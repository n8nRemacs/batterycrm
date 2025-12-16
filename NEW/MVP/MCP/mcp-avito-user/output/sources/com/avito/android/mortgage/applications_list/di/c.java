package com.avito.android.mortgage.applications_list.di;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ApplicationsListModule_ProvideAdapterPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class c implements h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final b f198365a;

    /* renamed from: b, reason: collision with root package name */
    public final u f198366b;

    public c(b bVar, u uVar) {
        this.f198365a = bVar;
        this.f198366b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f198366b.get();
        this.f198365a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
