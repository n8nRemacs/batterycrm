package com.avito.android.tariff_lf_constructor.configure.landing.domain;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import pD0.InterfaceC46937a;

/* compiled from: ConstructorLandingUseCase_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC46937a> f299685a;

    public b(Provider<InterfaceC46937a> provider) {
        this.f299685a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f299685a.get());
    }
}
