package com.avito.android.advert_details_items.imv_v4_cars;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ImvCarsV4ItemPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final c f84855a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f84856b;

    public i(c cVar, Provider provider) {
        this.f84855a = cVar;
        this.f84856b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h((a) this.f84855a.get(), this.f84856b.get());
    }
}
