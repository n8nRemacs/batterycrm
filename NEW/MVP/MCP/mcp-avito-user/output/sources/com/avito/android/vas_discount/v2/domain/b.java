package com.avito.android.vas_discount.v2.domain;

import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import mL0.InterfaceC43978a;

/* compiled from: GetDiscountInfoUseCase_Factory.java */
@e
@y
@x
/* loaded from: classes5.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC43978a> f319797a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f319798b;

    public b(Provider<InterfaceC43978a> provider, Provider<R0> provider2) {
        this.f319797a = provider;
        this.f319798b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f319797a.get(), this.f319798b.get());
    }
}
