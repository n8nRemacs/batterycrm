package com.avito.android.beduin.common.component.button_buy_delivery;

import com.avito.android.AbstractC35201t;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import hZ.InterfaceC40895a;
import javax.inject.Provider;

/* compiled from: BeduinBuyWithDeliveryButtonComponentFactory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f100828a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC40895a> f100829b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<AbstractC35201t> f100830c;

    public d(Provider<R0> provider, Provider<InterfaceC40895a> provider2, Provider<AbstractC35201t> provider3) {
        this.f100828a = provider;
        this.f100829b = provider2;
        this.f100830c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f100828a.get(), this.f100829b.get(), this.f100830c.get());
    }
}
