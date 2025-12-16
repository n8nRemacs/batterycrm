package com.avito.android.sbc.create;

import Xo0.InterfaceC17032a;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CreateDiscountDispatchInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC17032a> f259184a;

    public g(Provider<InterfaceC17032a> provider) {
        this.f259184a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(dagger.internal.g.a(w.a(this.f259184a)));
    }
}
