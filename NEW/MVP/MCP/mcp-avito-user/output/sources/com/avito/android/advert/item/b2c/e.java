package com.avito.android.advert.item.b2c;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsB2CBottomPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<h> f73200a;

    public e(Provider<h> provider) {
        this.f73200a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f73200a.get());
    }
}
