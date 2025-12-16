package com.avito.android.tariff_cpt.info.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CptInfoV2Actor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.tariff_cpt.info.domain.a> f298249a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f298250b;

    public g(Provider<com.avito.android.tariff_cpt.info.domain.a> provider, Provider<com.avito.android.deeplink_handler.handler.composite.a> provider2) {
        this.f298249a = provider;
        this.f298250b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f298249a.get(), this.f298250b.get());
    }
}
