package com.avito.android.user_adverts.expired_count.di;

import dagger.internal.x;
import dagger.internal.y;
import f90.C40247A;
import f90.K;

/* compiled from: UserAdvertsInfoPluginModule_ProvideAuthorizationPluginFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class g implements dagger.internal.h<A3.b> {

    /* renamed from: a, reason: collision with root package name */
    public final i f312136a;

    /* renamed from: b, reason: collision with root package name */
    public final C40247A f312137b;

    public g(i iVar, C40247A c40247a) {
        this.f312136a = iVar;
        this.f312137b = c40247a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        eH0.k kVar = (eH0.k) this.f312136a.get();
        K k12 = (K) this.f312137b.get();
        f.f312135a.getClass();
        return new e(k12, kVar);
    }
}
