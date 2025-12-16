package com.avito.android.crm_paid_cvs.deeplink;

import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import gt.C40732d;
import gt.InterfaceC40729a;

/* compiled from: CrmPaidCvsDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final C40732d f130286a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f130287b;

    /* renamed from: c, reason: collision with root package name */
    public final C25721c f130288c;

    public c(C40732d c40732d, dv.b bVar, C25721c c25721c) {
        this.f130286a = c40732d;
        this.f130287b = bVar;
        this.f130288c = c25721c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((InterfaceC40729a) this.f130286a.get(), (a.InterfaceC4053a) this.f130287b.get(), (C25719a) this.f130288c.get());
    }
}
