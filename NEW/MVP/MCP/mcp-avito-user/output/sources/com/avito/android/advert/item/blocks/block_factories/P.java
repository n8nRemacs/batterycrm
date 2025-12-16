package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.C28070w1;
import com.avito.android.advert.item.blocks.items_factories.C28076x1;
import javax.inject.Provider;

/* compiled from: AdvertDetailsCheckInRulesBlockFactory_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class P implements dagger.internal.h<O> {

    /* renamed from: a, reason: collision with root package name */
    public final C28076x1 f73472a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73473b;

    public P(C28076x1 c28076x1, Provider provider) {
        this.f73472a = c28076x1;
        this.f73473b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new O((C28070w1) this.f73472a.get(), this.f73473b.get());
    }
}
