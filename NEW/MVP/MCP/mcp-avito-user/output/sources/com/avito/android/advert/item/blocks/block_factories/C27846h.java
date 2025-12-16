package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.B3;
import com.avito.android.advert.item.blocks.items_factories.C28070w1;
import com.avito.android.advert.item.blocks.items_factories.C28076x1;
import com.avito.android.advert.item.blocks.items_factories.InterfaceC27963g;
import com.avito.android.advert.item.blocks.items_factories.InterfaceC27984j;
import com.avito.android.advert.item.blocks.items_factories.InterfaceC28005m;
import javax.inject.Provider;

/* compiled from: AdvertDetailsAboutHouseBlockFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.block_factories.h, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27846h implements dagger.internal.h<C27842g> {

    /* renamed from: a, reason: collision with root package name */
    public final C28076x1 f73571a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC27984j> f73572b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC27963g> f73573c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.advert_core.blocks.h> f73574d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC28005m> f73575e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<B3> f73576f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73577g;

    public C27846h(C28076x1 c28076x1, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.f73571a = c28076x1;
        this.f73572b = provider;
        this.f73573c = provider2;
        this.f73574d = provider3;
        this.f73575e = provider4;
        this.f73576f = provider5;
        this.f73577g = provider6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27842g((C28070w1) this.f73571a.get(), this.f73572b.get(), this.f73573c.get(), this.f73574d.get(), this.f73575e.get(), this.f73576f.get(), this.f73577g.get());
    }
}
