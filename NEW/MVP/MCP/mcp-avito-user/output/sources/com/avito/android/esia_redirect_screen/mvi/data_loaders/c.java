package com.avito.android.esia_redirect_screen.mvi.data_loaders;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EsiaRedirectContentLoader_Factory.java */
@e
@y
@x
/* loaded from: classes13.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f148071a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.esia_redirect_screen.domain.b f148072b;

    public c(Provider provider, com.avito.android.esia_redirect_screen.domain.b bVar) {
        this.f148071a = provider;
        this.f148072b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f148071a.get(), (com.avito.android.esia_redirect_screen.domain.a) this.f148072b.get());
    }
}
