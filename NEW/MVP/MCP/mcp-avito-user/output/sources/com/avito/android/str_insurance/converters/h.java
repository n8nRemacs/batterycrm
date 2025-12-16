package com.avito.android.str_insurance.converters;

import com.avito.android.util.InterfaceC35863o4;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrInsuranceOfferConverterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35863o4> f288550a;

    public h(Provider<InterfaceC35863o4> provider) {
        this.f288550a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f288550a.get());
    }
}
