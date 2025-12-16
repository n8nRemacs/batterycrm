package com.avito.android.di.module;

import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: FavoriteAdvertsPresenterModule_ProvideFavoriteAdvertsPresenter$_avito_discouraged_avito_libs_favorite_core_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class S4 implements dagger.internal.h<com.avito.android.favorite.n> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.favorite.h> f144127a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f144128b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.h f144129c;

    public S4(Provider provider, Provider provider2, dagger.internal.h hVar) {
        this.f144127a = provider;
        this.f144128b = provider2;
        this.f144129c = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.favorite.h hVar = this.f144127a.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f144128b.get();
        String str = (String) this.f144129c.get();
        int i12 = R4.f144115a;
        return new com.avito.android.favorite.p(hVar, interfaceC35745a5, str);
    }
}
