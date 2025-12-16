package com.avito.android.vas_planning_checkout.domain;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import kM0.InterfaceC42602a;

/* compiled from: VasPlanCheckoutInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC42602a> f322891a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f322892b;

    public m(Provider<InterfaceC42602a> provider, Provider<InterfaceC35745a5> provider2) {
        this.f322891a = provider;
        this.f322892b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l(this.f322891a.get(), this.f322892b.get());
    }
}
