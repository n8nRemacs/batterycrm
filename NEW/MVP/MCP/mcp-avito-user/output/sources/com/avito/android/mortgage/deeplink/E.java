package com.avito.android.mortgage.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import javax.inject.Provider;
import t00.InterfaceC48454a;

/* compiled from: MortgageDocumentUploadDeeplinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class E implements dagger.internal.h<D> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f198682a;

    /* renamed from: b, reason: collision with root package name */
    public final t00.c f198683b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f198684c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.mortgage.deeplink.domain.e f198685d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f198686e;

    public E(dv.b bVar, t00.c cVar, dv.b bVar2, com.avito.android.mortgage.deeplink.domain.e eVar, Provider provider) {
        this.f198682a = bVar;
        this.f198683b = cVar;
        this.f198684c = bVar2;
        this.f198685d = eVar;
        this.f198686e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new D((a.InterfaceC4053a) this.f198682a.get(), (InterfaceC48454a) this.f198683b.get(), (a.i) this.f198684c.get(), (com.avito.android.mortgage.deeplink.domain.c) this.f198685d.get(), this.f198686e.get());
    }
}
