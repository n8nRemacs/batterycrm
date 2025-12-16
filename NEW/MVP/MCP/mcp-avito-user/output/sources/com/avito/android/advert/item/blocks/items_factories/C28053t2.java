package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.C29640d;
import javax.inject.Provider;

/* compiled from: AdvertDetailsIceBreakersItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.items_factories.t2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28053t2 implements dagger.internal.h<C28047s2> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f74029a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C29640d> f74030b;

    public C28053t2(Provider<com.avito.android.advert.item.similars.j> provider, Provider<C29640d> provider2) {
        this.f74029a = provider;
        this.f74030b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.advert.item.similars.j jVar = this.f74029a.get();
        this.f74030b.get();
        return new C28047s2(jVar);
    }
}
