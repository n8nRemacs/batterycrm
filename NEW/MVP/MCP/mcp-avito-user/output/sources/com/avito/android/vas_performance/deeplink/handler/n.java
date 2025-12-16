package com.avito.android.vas_performance.deeplink.handler;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VisualVasV2DeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.paid_services_impl.e f319901a;

    public n(com.avito.android.paid_services_impl.e eVar) {
        this.f319901a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new m((com.avito.android.paid_services.a) this.f319901a.get());
    }
}
