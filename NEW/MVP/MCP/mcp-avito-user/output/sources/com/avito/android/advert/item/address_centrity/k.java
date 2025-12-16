package com.avito.android.advert.item.address_centrity;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsAddressCentrityPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.component.toast.util.c> f72661a;

    /* renamed from: b, reason: collision with root package name */
    public final u f72662b;

    public k(u uVar, Provider provider) {
        this.f72661a = provider;
        this.f72662b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j(this.f72661a.get(), (l) this.f72662b.get());
    }
}
