package com.avito.android.cart_similar_items.konveyor.beduin;

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
/* loaded from: classes12.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f115819a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC25659b> f115820b;

    public b(u uVar, Provider provider) {
        this.f115819a = uVar;
        this.f115820b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((d) this.f115819a.get(), this.f115820b.get());
    }
}
