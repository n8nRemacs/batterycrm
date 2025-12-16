package com.avito.android.bxcontent.di.module;

import com.avito.android.bxcontent.InterfaceC29247r0;
import com.avito.android.serp.adapter.h1;
import javax.inject.Provider;

/* compiled from: BxContentModule_ProvideGridAppendingAdapterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class D implements dagger.internal.h<com.avito.android.ui.adapter.h<com.avito.konveyor.adapter.b>> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f110881a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<h1> f110882b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f110883c;

    public D(dagger.internal.f fVar, dagger.internal.u uVar, Provider provider) {
        this.f110881a = uVar;
        this.f110882b = provider;
        this.f110883c = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.d dVar = (com.avito.konveyor.adapter.d) this.f110881a.get();
        h1 h1Var = this.f110882b.get();
        InterfaceC29247r0 interfaceC29247r0 = (InterfaceC29247r0) this.f110883c.get();
        C29070s.f111022a.getClass();
        com.avito.android.ui.adapter.l lVar = new com.avito.android.ui.adapter.l(h1Var, true);
        lVar.f304571d = interfaceC29247r0;
        return new com.avito.android.ui.adapter.h(dVar, lVar);
    }
}
