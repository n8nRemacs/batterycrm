package com.avito.android.payment.deeplink;

import com.avito.android.C36167y1;
import com.avito.android.InterfaceC36134w1;
import com.avito.android.deeplink_handler.view.a;

/* compiled from: PaymentSessionCpaDeepLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class t implements dagger.internal.h<s> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f214042a;

    /* renamed from: b, reason: collision with root package name */
    public final C36167y1 f214043b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f214044c;

    public t(dv.b bVar, C36167y1 c36167y1, dv.b bVar2) {
        this.f214042a = bVar;
        this.f214043b = c36167y1;
        this.f214044c = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new s((a.InterfaceC4053a) this.f214042a.get(), (InterfaceC36134w1) this.f214043b.get(), (a.b) this.f214044c.get());
    }
}
