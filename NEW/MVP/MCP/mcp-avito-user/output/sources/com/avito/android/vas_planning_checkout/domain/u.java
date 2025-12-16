package com.avito.android.vas_planning_checkout.domain;

import aM0.InterfaceC19791a;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VasPlanResultInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class u implements dagger.internal.h<s> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f322898a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC19791a> f322899b;

    public u(Provider<InterfaceC35745a5> provider, Provider<InterfaceC19791a> provider2) {
        this.f322898a = provider;
        this.f322899b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new s(this.f322898a.get(), this.f322899b.get());
    }
}
