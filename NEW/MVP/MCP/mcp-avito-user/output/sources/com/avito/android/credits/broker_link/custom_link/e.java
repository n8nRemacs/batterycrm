package com.avito.android.credits.broker_link.custom_link;

import Ds.InterfaceC13437a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CreditBrokerCustomLinkPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC13437a> f128589a;

    public e(Provider<InterfaceC13437a> provider) {
        this.f128589a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f128589a.get());
    }
}
