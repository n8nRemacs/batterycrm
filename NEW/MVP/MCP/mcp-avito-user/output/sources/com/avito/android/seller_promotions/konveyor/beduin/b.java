package com.avito.android.seller_promotions.konveyor.beduin;

import bj.InterfaceC25659b;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BeduinBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f267780a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC25659b> f267781b;

    public b(u uVar, Provider provider) {
        this.f267780a = uVar;
        this.f267781b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((d) this.f267780a.get(), this.f267781b.get());
    }
}
