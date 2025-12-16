package com.avito.android.beduin.common.component.button;

import com.avito.android.AbstractC35201t;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import hZ.InterfaceC40895a;
import javax.inject.Provider;

/* compiled from: BeduinButtonComponentFactory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f100805a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f100806b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC40895a> f100807c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<AbstractC35201t> f100808d;

    public e(Provider<com.avito.android.util.text.a> provider, Provider<R0> provider2, Provider<InterfaceC40895a> provider3, Provider<AbstractC35201t> provider4) {
        this.f100805a = provider;
        this.f100806b = provider2;
        this.f100807c = provider3;
        this.f100808d = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f100805a.get(), this.f100806b.get(), this.f100807c.get(), this.f100808d.get());
    }
}
