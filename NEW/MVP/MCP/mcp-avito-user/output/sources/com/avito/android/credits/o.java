package com.avito.android.credits;

import Ds.InterfaceC13437a;
import com.avito.android.V;
import javax.inject.Provider;

/* compiled from: CreditCalculatorFilter_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<V> f129024a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC13437a> f129025b;

    public o(Provider<V> provider, Provider<InterfaceC13437a> provider2) {
        this.f129024a = provider;
        this.f129025b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new n(this.f129024a.get(), this.f129025b.get());
    }
}
