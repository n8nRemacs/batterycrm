package com.avito.android.credits;

import com.avito.android.Y;
import javax.inject.Provider;
import nd.InterfaceC44378a;

/* compiled from: CreditCalculatorDataConverterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<x> f128948a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Y> f128949b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC44378a> f128950c;

    public m(Provider<x> provider, Provider<Y> provider2, Provider<InterfaceC44378a> provider3) {
        this.f128948a = provider;
        this.f128949b = provider2;
        this.f128950c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l(this.f128948a.get(), this.f128949b.get(), this.f128950c.get());
    }
}
