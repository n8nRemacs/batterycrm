package com.avito.android.tariff_lf_constructor.configure.setting.viewmodel;

import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import pD0.InterfaceC46937a;

/* compiled from: ConstructorSettingRepositoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.tariff_lf_constructor.configure.setting.viewmodel.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35223i implements dagger.internal.h<C35221g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC46937a> f300184a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f300185b;

    public C35223i(Provider<InterfaceC46937a> provider, Provider<InterfaceC35745a5> provider2) {
        this.f300184a = provider;
        this.f300185b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C35221g(this.f300184a.get(), this.f300185b.get());
    }
}
