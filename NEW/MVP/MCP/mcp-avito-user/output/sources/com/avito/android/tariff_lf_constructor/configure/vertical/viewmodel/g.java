package com.avito.android.tariff_lf_constructor.configure.vertical.viewmodel;

import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import pD0.InterfaceC46937a;

/* compiled from: ConstructorConfigureVerticalRepositoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC46937a> f300666a;

    /* renamed from: b, reason: collision with root package name */
    public final u f300667b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f300668c;

    public g(u uVar, Provider provider, Provider provider2) {
        this.f300666a = provider;
        this.f300667b = uVar;
        this.f300668c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f300666a.get(), (a) this.f300667b.get(), this.f300668c.get());
    }
}
