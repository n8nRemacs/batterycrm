package com.avito.android.tariff_lf_constructor.configure.locations.viewmodel;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import pD0.InterfaceC46937a;

/* compiled from: ConstructorConfigureLocationsRepositoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC46937a> f299960a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f299961b;

    public h(Provider<InterfaceC46937a> provider, Provider<InterfaceC35745a5> provider2) {
        this.f299960a = provider;
        this.f299961b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f299960a.get(), this.f299961b.get());
    }
}
