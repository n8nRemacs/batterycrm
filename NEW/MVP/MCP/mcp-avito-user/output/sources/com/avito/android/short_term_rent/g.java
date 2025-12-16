package com.avito.android.short_term_rent;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StrBookingPaymentFailureLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f282350a;

    public g(dv.b bVar) {
        this.f282350a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f((a.i) this.f282350a.get());
    }
}
