package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.C29640d;
import javax.inject.Provider;

/* compiled from: AdvertDetailsExpertBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.items_factories.r1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28040r1 implements dagger.internal.h<C28035q1> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f74017a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C29640d> f74018b;

    public C28040r1(Provider<com.avito.android.advert.item.similars.j> provider, Provider<C29640d> provider2) {
        this.f74017a = provider;
        this.f74018b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C28035q1(this.f74018b.get(), this.f74017a.get());
    }
}
