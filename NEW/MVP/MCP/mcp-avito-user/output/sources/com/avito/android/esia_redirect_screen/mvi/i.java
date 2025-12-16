package com.avito.android.esia_redirect_screen.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EsiaRedirectBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.esia_redirect_screen.mvi.data_loaders.c f148081a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f148082b;

    public i(com.avito.android.esia_redirect_screen.mvi.data_loaders.c cVar, Provider provider) {
        this.f148081a = cVar;
        this.f148082b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f148082b.get(), (com.avito.android.esia_redirect_screen.mvi.data_loaders.b) this.f148081a.get());
    }
}
