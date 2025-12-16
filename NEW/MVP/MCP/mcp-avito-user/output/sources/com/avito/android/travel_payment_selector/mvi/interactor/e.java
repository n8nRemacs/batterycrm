package com.avito.android.travel_payment_selector.mvi.interactor;

import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import iF0.InterfaceC41280a;
import javax.inject.Provider;

/* compiled from: PaymentSelectorApiInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC41280a> f302689a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f302690b;

    public e(Provider<InterfaceC41280a> provider, Provider<R0> provider2) {
        this.f302689a = provider;
        this.f302690b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f302689a.get(), this.f302690b.get());
    }
}
