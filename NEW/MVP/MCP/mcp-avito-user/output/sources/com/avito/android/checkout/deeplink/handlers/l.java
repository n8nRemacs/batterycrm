package com.avito.android.checkout.deeplink.handlers;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CheckoutSaveV2DeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f118233a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f118234b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f118235c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.checkout.domain.f f118236d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f118237e;

    public l(dagger.internal.f fVar, dv.b bVar, dv.b bVar2, com.avito.android.checkout.domain.f fVar2, Provider provider) {
        this.f118233a = fVar;
        this.f118234b = bVar;
        this.f118235c = bVar2;
        this.f118236d = fVar2;
        this.f118237e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k((com.avito.android.deeplink_handler.handler.composite.a) this.f118233a.get(), (a.g) this.f118234b.get(), (a.i) this.f118235c.get(), (com.avito.android.checkout.domain.d) this.f118236d.get(), this.f118237e.get());
    }
}
