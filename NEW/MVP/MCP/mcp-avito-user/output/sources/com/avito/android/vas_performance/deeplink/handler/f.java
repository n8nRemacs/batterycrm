package com.avito.android.vas_performance.deeplink.handler;

import dagger.internal.x;
import dagger.internal.y;
import nI0.InterfaceC44261b;

/* compiled from: PerformanceVasDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.paid_services_impl.e f319890a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.paid_services_impl.g f319891b;

    /* renamed from: c, reason: collision with root package name */
    public final eH0.e f319892c;

    /* renamed from: d, reason: collision with root package name */
    public final nI0.d f319893d;

    public f(com.avito.android.paid_services_impl.e eVar, com.avito.android.paid_services_impl.g gVar, eH0.e eVar2, nI0.d dVar) {
        this.f319890a = eVar;
        this.f319891b = gVar;
        this.f319892c = eVar2;
        this.f319893d = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((com.avito.android.paid_services.a) this.f319890a.get(), (v50.c) this.f319891b.get(), (eH0.c) this.f319892c.get(), (InterfaceC44261b) this.f319893d.get());
    }
}
