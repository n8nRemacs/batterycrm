package com.avito.android.vas_performance.deeplink.handler;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VisualVasDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.paid_services_impl.e f319899a;

    public l(com.avito.android.paid_services_impl.e eVar) {
        this.f319899a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k((com.avito.android.paid_services.a) this.f319899a.get());
    }
}
