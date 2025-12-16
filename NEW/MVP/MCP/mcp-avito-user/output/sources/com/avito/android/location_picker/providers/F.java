package com.avito.android.location_picker.providers;

import javax.inject.Provider;
import uW.InterfaceC48983a;

/* compiled from: RadiusListProviderImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class F implements dagger.internal.h<E> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC48983a> f182443a;

    public F(Provider<InterfaceC48983a> provider) {
        this.f182443a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new E(dagger.internal.g.a(dagger.internal.w.a(this.f182443a)));
    }
}
