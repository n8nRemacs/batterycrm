package com.avito.android.checkout.deeplink.handlers;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CheckoutRefreshDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.checkout.domain.i f118221a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f118222b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f118223c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f118224d;

    public i(com.avito.android.checkout.domain.i iVar, dv.b bVar, dv.b bVar2, Provider provider) {
        this.f118221a = iVar;
        this.f118222b = bVar;
        this.f118223c = bVar2;
        this.f118224d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h((com.avito.android.checkout.domain.h) this.f118221a.get(), (a.i) this.f118222b.get(), (a.g) this.f118223c.get(), this.f118224d.get());
    }
}
