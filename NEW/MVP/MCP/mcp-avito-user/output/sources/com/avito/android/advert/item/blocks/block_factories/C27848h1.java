package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.InterfaceC28059u2;
import javax.inject.Provider;

/* compiled from: AdvertDetailsIcebreakersRedesignBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.block_factories.h1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27848h1 implements dagger.internal.h<C27844g1> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28059u2> f73579a;

    public C27848h1(Provider<InterfaceC28059u2> provider) {
        this.f73579a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27844g1(this.f73579a.get());
    }
}
