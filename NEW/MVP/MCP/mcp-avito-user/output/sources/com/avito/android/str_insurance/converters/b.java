package com.avito.android.str_insurance.converters;

import com.avito.android.util.InterfaceC35863o4;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrInsuranceConfirmationConverterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35863o4> f288547a;

    public b(Provider<InterfaceC35863o4> provider) {
        this.f288547a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f288547a.get());
    }
}
