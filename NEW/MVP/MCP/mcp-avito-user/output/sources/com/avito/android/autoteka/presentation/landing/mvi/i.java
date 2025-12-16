package com.avito.android.autoteka.presentation.landing.mvi;

import Mf.C14480a;
import dagger.internal.x;
import dagger.internal.y;
import gj.InterfaceC40691b;
import javax.inject.Provider;

/* compiled from: AutotekaLandingBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C14480a> f97366a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC40691b> f97367b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.autoteka.data.landing.b f97368c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f97369d;

    public i(Provider provider, Provider provider2, com.avito.android.autoteka.data.landing.b bVar, Provider provider3) {
        this.f97366a = provider;
        this.f97367b = provider2;
        this.f97368c = bVar;
        this.f97369d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f97366a.get(), this.f97367b.get(), (com.avito.android.autoteka.data.landing.a) this.f97368c.get(), this.f97369d.get());
    }
}
