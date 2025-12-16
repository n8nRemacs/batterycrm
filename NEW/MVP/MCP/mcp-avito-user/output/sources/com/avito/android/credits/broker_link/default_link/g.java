package com.avito.android.credits.broker_link.default_link;

import Ds.InterfaceC13437a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CreditBrokerDefaultLinkPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC13437a> f128607a;

    public g(Provider<InterfaceC13437a> provider) {
        this.f128607a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f128607a.get());
    }
}
