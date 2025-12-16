package com.avito.android.tariff_lf_constructor.configure.size.viewmodel;

import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import pD0.InterfaceC46937a;

/* compiled from: ConstructorConfigureSizeRepositoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC46937a> f300380a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f300381b;

    public h(Provider<InterfaceC46937a> provider, Provider<InterfaceC35745a5> provider2) {
        this.f300380a = provider;
        this.f300381b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f300380a.get(), this.f300381b.get());
    }
}
