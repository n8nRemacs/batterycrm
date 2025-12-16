package com.avito.android.tariff_lf_constructor.configure.subcategories.viewmodel;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import pD0.InterfaceC46937a;

/* compiled from: ConstructorConfigureSubCategoriesRepositoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC46937a> f300488a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f300489b;

    public g(Provider<InterfaceC46937a> provider, Provider<InterfaceC35745a5> provider2) {
        this.f300488a = provider;
        this.f300489b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f300488a.get(), this.f300489b.get());
    }
}
