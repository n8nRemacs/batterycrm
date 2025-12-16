package com.avito.android.verification.verification_fetch_invoice;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;
import vM0.InterfaceC49236c;

/* compiled from: VerificationFetchInvoiceLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f325172a;

    /* renamed from: b, reason: collision with root package name */
    public final vM0.d f325173b;

    public e(dv.b bVar, vM0.d dVar) {
        this.f325172a = bVar;
        this.f325173b = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((a.InterfaceC4053a) this.f325172a.get(), (InterfaceC49236c) this.f325173b.get());
    }
}
