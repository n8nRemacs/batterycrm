package com.avito.android.async_phone;

import Gd.InterfaceC13866a;
import javax.inject.Provider;

/* compiled from: LegacyAsyncPhoneInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class y implements dagger.internal.h<x> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC13866a> f92297a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<WL.a> f92298b;

    public y(Provider<InterfaceC13866a> provider, Provider<WL.a> provider2) {
        this.f92297a = provider;
        this.f92298b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new x(this.f92297a.get(), this.f92298b.get());
    }
}
