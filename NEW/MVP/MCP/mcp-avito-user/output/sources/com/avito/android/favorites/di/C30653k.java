package com.avito.android.favorites.di;

import com.avito.android.account.W;
import com.avito.android.favorites.di.C30612a;
import javax.inject.Provider;

/* compiled from: FavoriteAdvertsModule_ProvideBlockingAccountStorageInteractorFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.favorites.di.k, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30653k implements dagger.internal.h<W> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.account.G> f157328a;

    public C30653k(Provider<com.avito.android.account.G> provider) {
        this.f157328a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.account.G g12 = (com.avito.android.account.G) ((C30612a.c.C30614b) this.f157328a).get();
        C30647e.f157320a.getClass();
        return g12.i();
    }
}
