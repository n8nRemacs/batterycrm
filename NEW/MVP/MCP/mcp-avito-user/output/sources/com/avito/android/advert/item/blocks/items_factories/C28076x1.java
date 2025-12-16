package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert.InterfaceC28240u;
import javax.inject.Provider;
import lD.C43617a;

/* compiled from: AdvertDetailsFlatsItemFactory_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.blocks.items_factories.x1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28076x1 implements dagger.internal.h<C28070w1> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28240u> f74068a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.J0> f74069b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C43617a> f74070c;

    public C28076x1(Provider<InterfaceC28240u> provider, Provider<com.avito.android.J0> provider2, Provider<C43617a> provider3) {
        this.f74068a = provider;
        this.f74069b = provider2;
        this.f74070c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C28070w1(this.f74068a.get(), this.f74069b.get(), this.f74070c.get());
    }
}
