package com.avito.android.beduin.common.component.button_with_loader;

import com.avito.android.AbstractC35201t;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import hZ.InterfaceC40895a;
import javax.inject.Provider;

/* compiled from: BeduinPhoneButtonComponentFactory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f100835a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC40895a> f100836b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<AbstractC35201t> f100837c;

    public b(Provider<R0> provider, Provider<InterfaceC40895a> provider2, Provider<AbstractC35201t> provider3) {
        this.f100835a = provider;
        this.f100836b = provider2;
        this.f100837c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f100835a.get(), this.f100836b.get(), this.f100837c.get());
    }
}
