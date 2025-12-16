package com.avito.android.service_orders.mvi.domain;

import Pu0.InterfaceC14839a;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ServiceOrdersGetPhoneNumberUseCaseImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f279475a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC14839a> f279476b;

    public c(Provider<R0> provider, Provider<InterfaceC14839a> provider2) {
        this.f279475a = provider;
        this.f279476b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f279476b.get(), this.f279475a.get());
    }
}
