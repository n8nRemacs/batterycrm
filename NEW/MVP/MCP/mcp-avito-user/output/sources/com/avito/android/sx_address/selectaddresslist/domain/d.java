package com.avito.android.sx_address.selectaddresslist.domain;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SelectAddressListInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<EA0.a> f294090a;

    public d(Provider<EA0.a> provider) {
        this.f294090a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f294090a.get());
    }
}
