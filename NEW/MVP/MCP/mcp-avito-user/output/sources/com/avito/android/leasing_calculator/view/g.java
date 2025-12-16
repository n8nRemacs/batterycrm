package com.avito.android.leasing_calculator.view;

import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: LeasingApplicationPresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class g implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.leasing_calculator.m> f175144a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f175145b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.leasing_calculator.e> f175146c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f175147d;

    public g(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f175144a = provider;
        this.f175145b = provider2;
        this.f175146c = provider3;
        this.f175147d = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f175144a.get(), this.f175145b.get(), this.f175146c.get(), (com.avito.android.leasing_calculator.a) this.f175147d.get());
    }
}
