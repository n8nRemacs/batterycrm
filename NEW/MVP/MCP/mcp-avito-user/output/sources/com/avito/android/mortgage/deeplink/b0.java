package com.avito.android.mortgage.deeplink;

import com.avito.android.deeplink_handler.view.a;
import t00.InterfaceC48454a;

/* compiled from: MortgageSignDeeplinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class b0 implements dagger.internal.h<a0> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f198790a;

    /* renamed from: b, reason: collision with root package name */
    public final t00.c f198791b;

    public b0(dv.b bVar, t00.c cVar) {
        this.f198790a = bVar;
        this.f198791b = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a0((a.InterfaceC4053a) this.f198790a.get(), (InterfaceC48454a) this.f198791b.get());
    }
}
