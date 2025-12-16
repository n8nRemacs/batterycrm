package com.avito.android.tariff.cpx.limit.sheet.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TariffCpxLimitActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f297329a;

    public g(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider) {
        this.f297329a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f297329a.get());
    }
}
