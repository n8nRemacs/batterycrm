package com.avito.android.mortgage.deeplink.domain;

import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CheckApplicationIdRepository_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<IZ.a> f198812a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f198813b;

    public b(Provider<IZ.a> provider, Provider<R0> provider2) {
        this.f198812a = provider;
        this.f198813b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f198813b.get(), dagger.internal.g.b(this.f198812a));
    }
}
