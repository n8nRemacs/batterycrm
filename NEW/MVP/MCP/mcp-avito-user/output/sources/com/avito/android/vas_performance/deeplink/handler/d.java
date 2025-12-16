package com.avito.android.vas_performance.deeplink.handler;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CompetitiveVasDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.paid_services_impl.e f319885a;

    public d(com.avito.android.paid_services_impl.e eVar) {
        this.f319885a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.paid_services.a) this.f319885a.get());
    }
}
