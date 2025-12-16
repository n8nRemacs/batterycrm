package com.avito.android.str_insurance.screen.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StrInsuranceAdapterModule_ProvideAdapterPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final b f288696a;

    /* renamed from: b, reason: collision with root package name */
    public final u f288697b;

    public c(b bVar, u uVar) {
        this.f288696a = bVar;
        this.f288697b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f288697b.get();
        this.f288696a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
