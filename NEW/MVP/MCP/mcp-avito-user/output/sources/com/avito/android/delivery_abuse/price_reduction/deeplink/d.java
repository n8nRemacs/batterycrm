package com.avito.android.delivery_abuse.price_reduction.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.delivery_abuse.price_reduction.o;
import com.avito.android.delivery_abuse.price_reduction.p;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PriceReductionLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class d implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f134804a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f134805b;

    /* renamed from: c, reason: collision with root package name */
    public final p f134806c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f134807d;

    public d(dv.b bVar, dv.b bVar2, p pVar, Provider provider) {
        this.f134804a = bVar;
        this.f134805b = bVar2;
        this.f134806c = pVar;
        this.f134807d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((a.b) this.f134804a.get(), (a.InterfaceC4053a) this.f134805b.get(), (o) this.f134806c.get(), this.f134807d.get());
    }
}
