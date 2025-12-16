package com.avito.android.return_checkout.domain;

import com.avito.android.return_checkout.l;
import com.avito.android.return_checkout.model.DeliveryReturnCheckoutData;
import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DeliveryReturnCheckoutUseCase_Factory.java */
@e
@y
@x
/* loaded from: classes12.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<l> f255300a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.return_checkout.a> f255301b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f255302c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f255303d;

    public b(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3) {
        this.f255300a = provider;
        this.f255301b = provider2;
        this.f255302c = lVar;
        this.f255303d = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f255300a.get(), this.f255301b.get(), (DeliveryReturnCheckoutData) this.f255302c.f393949a, this.f255303d.get());
    }
}
