package com.avito.android.di.module;

import javax.inject.Provider;
import qu.C47448d;
import qu.InterfaceC47447c;

/* compiled from: FavoriteModule_ProvideFavoritesSyncDaoFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class U4 implements dagger.internal.h<InterfaceC47447c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.db.f> f144146a;

    public U4(Provider<com.avito.android.db.f> provider) {
        this.f144146a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.db.f fVar = this.f144146a.get();
        com.avito.android.db.h hVar = T4.f144139a;
        return new C47448d(fVar, T4.f144139a);
    }
}
