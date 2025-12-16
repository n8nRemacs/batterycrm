package com.avito.android.mortgage.deeplink;

import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import t00.InterfaceC48454a;

/* compiled from: PreApprovalFormDeeplinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class g0 implements dagger.internal.h<e0> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f198852a;

    /* renamed from: b, reason: collision with root package name */
    public final t00.c f198853b;

    /* renamed from: c, reason: collision with root package name */
    public final C25721c f198854c;

    public g0(dv.b bVar, t00.c cVar, C25721c c25721c) {
        this.f198852a = bVar;
        this.f198853b = cVar;
        this.f198854c = c25721c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e0((a.InterfaceC4053a) this.f198852a.get(), (InterfaceC48454a) this.f198853b.get(), (C25719a) this.f198854c.get());
    }
}
