package com.avito.android.tariff_lf_constructor.configure;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import pD0.InterfaceC46937a;

/* compiled from: ConstructorPackageUpdateRepositoryImpl_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC46937a> f299336a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f299337b;

    public c(Provider<InterfaceC46937a> provider, Provider<InterfaceC35745a5> provider2) {
        this.f299336a = provider;
        this.f299337b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f299336a.get(), this.f299337b.get());
    }
}
