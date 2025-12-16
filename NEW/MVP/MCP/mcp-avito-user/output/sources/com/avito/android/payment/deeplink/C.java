package com.avito.android.payment.deeplink;

import com.avito.android.deeplink_handler.view.a;

/* compiled from: SbpPaymentAppLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class C implements dagger.internal.h<A> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f214007a;

    public C(dv.b bVar) {
        this.f214007a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new A((a.InterfaceC4053a) this.f214007a.get());
    }
}
