package com.avito.android.favorites;

import com.avito.android.remote.model.AdvertPrice;
import com.avito.android.util.InterfaceC35945t1;
import javax.inject.Provider;

/* compiled from: FavoriteAdvertItemConverterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.favorites.d, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30609d implements dagger.internal.h<C30606c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35945t1<AdvertPrice>> f156924a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC30657f> f156925b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f156926c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f156927d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC30669j0> f156928e;

    /* renamed from: f, reason: collision with root package name */
    public final com.avito.android.favorites.adapter.disclaimer.d f156929f;

    public C30609d(Provider provider, Provider provider2, dagger.internal.u uVar, dagger.internal.u uVar2, Provider provider3, com.avito.android.favorites.adapter.disclaimer.d dVar) {
        this.f156924a = provider;
        this.f156925b = provider2;
        this.f156926c = uVar;
        this.f156927d = uVar2;
        this.f156928e = provider3;
        this.f156929f = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC35945t1<AdvertPrice> interfaceC35945t1 = this.f156924a.get();
        InterfaceC30657f interfaceC30657f = this.f156925b.get();
        YC.a aVar = (YC.a) this.f156926c.get();
        Yo.p pVar = (Yo.p) this.f156927d.get();
        InterfaceC30669j0 interfaceC30669j0 = this.f156928e.get();
        this.f156929f.getClass();
        return new C30606c(interfaceC35945t1, interfaceC30657f, aVar, pVar, interfaceC30669j0, new com.avito.android.favorites.adapter.disclaimer.c());
    }
}
