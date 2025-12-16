package com.avito.android.esia_redirect_screen.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EsiaRedirectActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f148075a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.esia_redirect_screen.mvi.data_loaders.c f148076b;

    public f(com.avito.android.esia_redirect_screen.mvi.data_loaders.c cVar, Provider provider) {
        this.f148075a = provider;
        this.f148076b = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f148075a.get(), (com.avito.android.esia_redirect_screen.mvi.data_loaders.b) this.f148076b.get());
    }
}
