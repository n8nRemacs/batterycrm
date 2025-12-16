package com.avito.android.mortgage.deeplink;

import com.avito.android.deeplink_handler.view.a;
import t00.InterfaceC48454a;

/* compiled from: MortgageFormDeeplinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class J implements dagger.internal.h<I> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f198690a;

    /* renamed from: b, reason: collision with root package name */
    public final t00.c f198691b;

    public J(dv.b bVar, t00.c cVar) {
        this.f198690a = bVar;
        this.f198691b = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new I((a.InterfaceC4053a) this.f198690a.get(), (InterfaceC48454a) this.f198691b.get());
    }
}
