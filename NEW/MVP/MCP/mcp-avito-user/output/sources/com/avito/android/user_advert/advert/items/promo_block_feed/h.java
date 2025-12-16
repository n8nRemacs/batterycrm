package com.avito.android.user_advert.advert.items.promo_block_feed;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PromoBlockItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.lib.util.groupable_item.b> f309871a;

    /* renamed from: b, reason: collision with root package name */
    public final u f309872b;

    public h(u uVar, Provider provider) {
        this.f309871a = provider;
        this.f309872b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f309871a.get(), (com.avito.android.deep_linking.x) this.f309872b.get());
    }
}
