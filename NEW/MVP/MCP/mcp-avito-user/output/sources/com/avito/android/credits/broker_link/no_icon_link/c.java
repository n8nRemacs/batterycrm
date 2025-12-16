package com.avito.android.credits.broker_link.no_icon_link;

import Ds.InterfaceC13437a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CreditBrokerNoIconLinkPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC13437a> f128618a;

    public c(Provider<InterfaceC13437a> provider) {
        this.f128618a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f128618a.get());
    }
}
