package com.avito.android.sx_address.list.domain;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SxAddressListInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<EA0.a> f293191a;

    public g(Provider<EA0.a> provider) {
        this.f293191a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f293191a.get());
    }
}
