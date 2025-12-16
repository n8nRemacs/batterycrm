package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert_core.contactbar.InterfaceC28265d;
import javax.inject.Provider;

/* compiled from: AdvertDetailsSimpleContactBarItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class X4 implements dagger.internal.h<W4> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73888a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28265d> f73889b;

    public X4(Provider<com.avito.android.advert.item.similars.j> provider, Provider<InterfaceC28265d> provider2) {
        this.f73888a = provider;
        this.f73889b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new W4(this.f73888a.get(), this.f73889b.get());
    }
}
