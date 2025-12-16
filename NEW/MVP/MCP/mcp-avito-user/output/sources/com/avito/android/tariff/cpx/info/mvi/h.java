package com.avito.android.tariff.cpx.info.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TariffCpxInfoActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.tariff.cpx.info.mvi.domain.a> f296723a;

    /* renamed from: b, reason: collision with root package name */
    public final u f296724b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f296725c;

    public h(u uVar, Provider provider, Provider provider2) {
        this.f296723a = provider;
        this.f296724b = uVar;
        this.f296725c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f296723a.get(), (v50.g) this.f296724b.get(), this.f296725c.get());
    }
}
