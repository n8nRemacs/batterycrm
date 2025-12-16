package com.avito.android.tariff_lf.package_info.viewmodel;

import bD0.InterfaceC25499a;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TariffPackageInfoRepositoryImpl_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC25499a> f299284a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f299285b;

    public h(Provider<InterfaceC25499a> provider, Provider<InterfaceC35745a5> provider2) {
        this.f299284a = provider;
        this.f299285b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f299284a.get(), this.f299285b.get());
    }
}
