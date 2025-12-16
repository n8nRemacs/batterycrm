package com.avito.android.serp.adapter.sale;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SaleHeaderBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<h> f271487a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.h> f271488b;

    /* renamed from: c, reason: collision with root package name */
    public final u f271489c;

    public c(u uVar, Provider provider, Provider provider2) {
        this.f271487a = provider;
        this.f271488b = provider2;
        this.f271489c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f271487a.get(), this.f271488b.get(), (com.avito.konveyor.adapter.j) this.f271489c.get());
    }
}
