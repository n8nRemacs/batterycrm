package com.avito.android.advert.item.address_centrity;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AddressCentrityBlockPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<i> f72651a;

    public e(Provider<i> provider) {
        this.f72651a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f72651a.get());
    }
}
