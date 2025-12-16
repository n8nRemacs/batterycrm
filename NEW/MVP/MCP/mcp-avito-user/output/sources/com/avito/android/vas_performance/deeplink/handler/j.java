package com.avito.android.vas_performance.deeplink.handler;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StickersEditVasDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.paid_services_impl.e f319897a;

    public j(com.avito.android.paid_services_impl.e eVar) {
        this.f319897a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((com.avito.android.paid_services.a) this.f319897a.get());
    }
}
