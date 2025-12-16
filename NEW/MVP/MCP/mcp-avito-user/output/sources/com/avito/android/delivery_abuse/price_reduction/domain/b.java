package com.avito.android.delivery_abuse.price_reduction.domain;

import com.avito.android.remote.error.f;
import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import zv.InterfaceC50632a;

/* compiled from: PriceConfirmationUseCase_Factory.java */
@e
@y
@x
/* loaded from: classes12.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f134836a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC50632a> f134837b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<f> f134838c;

    public b(Provider<R0> provider, Provider<InterfaceC50632a> provider2, Provider<f> provider3) {
        this.f134836a = provider;
        this.f134837b = provider2;
        this.f134838c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f134836a.get(), g.a(w.a(this.f134837b)), this.f134838c.get());
    }
}
