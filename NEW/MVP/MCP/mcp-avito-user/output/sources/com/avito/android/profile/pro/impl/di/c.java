package com.avito.android.profile.pro.impl.di;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ProfileProApplicationModule_ProvideProfileProGeoBannerStorageAuthPluginFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements dagger.internal.h<A3.b> {

    /* renamed from: a, reason: collision with root package name */
    public final E90.c f222604a;

    public c(E90.c cVar) {
        this.f222604a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        E90.a aVar = (E90.a) this.f222604a.get();
        b.f222603a.getClass();
        return new E90.e(aVar);
    }
}
