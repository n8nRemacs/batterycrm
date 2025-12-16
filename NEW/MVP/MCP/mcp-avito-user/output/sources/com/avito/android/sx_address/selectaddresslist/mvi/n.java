package com.avito.android.sx_address.selectaddresslist.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SelectAddressListBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f294147a;

    public n(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider) {
        this.f294147a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new m(this.f294147a.get());
    }
}
