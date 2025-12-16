package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.C29640d;
import com.avito.android.advert.item.blocks.items_factories.C28070w1;
import com.avito.android.advert.item.blocks.items_factories.C28076x1;
import javax.inject.Provider;

/* compiled from: AdvertDetailsAboutDeveloperBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.block_factories.f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27838f implements dagger.internal.h<C27834e> {

    /* renamed from: a, reason: collision with root package name */
    public final C28076x1 f73551a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.blocks.items_factories.U0> f73552b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.blocks.items_factories.R0> f73553c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.advert_core.blocks.h> f73554d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73555e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<C29640d> f73556f;

    public C27838f(C28076x1 c28076x1, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f73551a = c28076x1;
        this.f73552b = provider;
        this.f73553c = provider2;
        this.f73554d = provider3;
        this.f73555e = provider4;
        this.f73556f = provider5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C28070w1 c28070w1 = (C28070w1) this.f73551a.get();
        com.avito.android.advert.item.blocks.items_factories.U0 u02 = this.f73552b.get();
        com.avito.android.advert.item.blocks.items_factories.R0 r02 = this.f73553c.get();
        com.avito.android.advert_core.blocks.h hVar = this.f73554d.get();
        com.avito.android.advert.item.similars.j jVar = this.f73555e.get();
        this.f73556f.get();
        return new C27834e(c28070w1, u02, r02, hVar, jVar);
    }
}
