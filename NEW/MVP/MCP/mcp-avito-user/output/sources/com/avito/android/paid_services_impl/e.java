package com.avito.android.paid_services_impl;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PaidServicesDeeplinkHandlerDelegateImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f210645a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f210646b;

    /* renamed from: c, reason: collision with root package name */
    public final g f210647c;

    public e(dv.b bVar, dv.b bVar2, g gVar) {
        this.f210645a = bVar;
        this.f210646b = bVar2;
        this.f210647c = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((a.InterfaceC4053a) this.f210645a.get(), (a.b) this.f210646b.get(), (v50.c) this.f210647c.get());
    }
}
