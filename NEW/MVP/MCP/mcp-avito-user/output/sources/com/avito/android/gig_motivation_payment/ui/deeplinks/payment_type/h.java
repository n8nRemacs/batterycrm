package com.avito.android.gig_motivation_payment.ui.deeplinks.payment_type;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import rH.InterfaceC47543a;

/* compiled from: GigMotivationPaymentTypeDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class h implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f160211a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f160212b;

    /* renamed from: c, reason: collision with root package name */
    public final g f160213c;

    public h(Provider provider, dv.b bVar, g gVar) {
        this.f160211a = provider;
        this.f160212b = bVar;
        this.f160213c = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f160211a.get(), (a.g) this.f160212b.get(), (InterfaceC47543a) this.f160213c.get());
    }
}
