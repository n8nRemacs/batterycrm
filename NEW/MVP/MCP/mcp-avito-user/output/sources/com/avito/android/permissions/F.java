package com.avito.android.permissions;

import Yb.InterfaceC18250a;
import javax.inject.Provider;

/* compiled from: PermissionStateProviderImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class F implements dagger.internal.h<B> {

    /* renamed from: a, reason: collision with root package name */
    public final w f215098a;

    /* renamed from: b, reason: collision with root package name */
    public final I f215099b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Yb.e> f215100c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f215101d;

    public F(w wVar, I i12, Provider provider, dagger.internal.u uVar) {
        this.f215098a = wVar;
        this.f215099b = i12;
        this.f215100c = provider;
        this.f215101d = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new B((u) this.f215098a.get(), (G) this.f215099b.get(), this.f215100c.get(), (InterfaceC18250a) this.f215101d.get());
    }
}
