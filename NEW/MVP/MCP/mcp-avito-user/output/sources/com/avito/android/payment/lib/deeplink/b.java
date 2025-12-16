package com.avito.android.payment.lib.deeplink;

import com.avito.android.C36167y1;
import com.avito.android.InterfaceC36134w1;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: LegacyPaymentSessionDeepLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f214572a;

    /* renamed from: b, reason: collision with root package name */
    public final C36167y1 f214573b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f214574c;

    public b(dv.b bVar, C36167y1 c36167y1, dv.b bVar2) {
        this.f214572a = bVar;
        this.f214573b = c36167y1;
        this.f214574c = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((a.InterfaceC4053a) this.f214572a.get(), (InterfaceC36134w1) this.f214573b.get(), (a.b) this.f214574c.get());
    }
}
