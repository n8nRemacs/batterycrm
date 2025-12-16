package com.avito.android.profile.pro.impl.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ProfileProModule_ProvideAdapterPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class i implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f222609a;

    /* renamed from: b, reason: collision with root package name */
    public final u f222610b;

    public i(f fVar, u uVar) {
        this.f222609a = fVar;
        this.f222610b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f222610b.get();
        this.f222609a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
