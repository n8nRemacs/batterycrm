package com.avito.android.publish.slots.salary_range;

import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import dl0.InterfaceC39749a;
import javax.inject.Provider;

/* compiled from: MarketSalaryInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f244759a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC39749a> f244760b;

    public c(Provider<R0> provider, Provider<InterfaceC39749a> provider2) {
        this.f244759a = provider;
        this.f244760b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f244759a.get(), dagger.internal.g.b(this.f244760b));
    }
}
