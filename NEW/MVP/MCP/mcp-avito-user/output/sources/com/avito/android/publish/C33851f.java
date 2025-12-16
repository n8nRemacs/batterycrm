package com.avito.android.publish;

import javax.inject.Provider;

/* compiled from: ContactsDataSourceImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.publish.f, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33851f implements dagger.internal.h<C33849e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C0> f235641a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<P> f235642b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f235643c;

    public C33851f(dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f235641a = provider;
        this.f235642b = provider2;
        this.f235643c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C33849e(this.f235641a.get(), this.f235642b.get(), (Pd0.r) this.f235643c.get());
    }
}
