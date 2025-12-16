package com.avito.android.permissions;

import javax.inject.Provider;

/* compiled from: LocationPermissionProviderImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class s implements dagger.internal.h<r> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f215139a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<z> f215140b;

    public s(dagger.internal.u uVar, Provider provider) {
        this.f215139a = uVar;
        this.f215140b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new r((G) this.f215139a.get(), this.f215140b.get());
    }
}
