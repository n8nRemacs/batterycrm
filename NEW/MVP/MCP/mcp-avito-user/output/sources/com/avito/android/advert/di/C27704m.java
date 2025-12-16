package com.avito.android.advert.di;

import Qa.InterfaceC14873a;
import com.avito.android.advert.di.t0;
import javax.inject.Provider;

/* compiled from: AdvertDetailsMultiItemsModule_ProvideMultiItemsBlueprintFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.di.m, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27704m implements dagger.internal.h<com.avito.android.advert.item.multi_item.a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f69415a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.multi_item.b> f69416b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.advert_multi_items.param_chips.b> f69417c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.advert_multi_items.param_images.b> f69418d;

    public C27704m(dagger.internal.f fVar, Provider provider, Provider provider2, Provider provider3) {
        this.f69415a = fVar;
        this.f69416b = provider;
        this.f69417c = provider2;
        this.f69418d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC14873a interfaceC14873a = (InterfaceC14873a) this.f69415a.get();
        com.avito.android.advert.item.multi_item.b bVar = this.f69416b.get();
        com.avito.android.advert_multi_items.param_chips.b bVar2 = (com.avito.android.advert_multi_items.param_chips.b) ((t0.b.C27713a1) this.f69417c).get();
        com.avito.android.advert_multi_items.param_images.b bVar3 = (com.avito.android.advert_multi_items.param_images.b) ((t0.b.C27715b1) this.f69418d).get();
        C27703l.f69413a.getClass();
        return new com.avito.android.advert.item.multi_item.a(bVar, bVar2.a(interfaceC14873a, null), bVar3.a(interfaceC14873a, null));
    }
}
