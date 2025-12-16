package com.avito.android.vas_performance.deeplink.handler;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StickersBuyVasDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.paid_services_impl.e f319895a;

    public h(com.avito.android.paid_services_impl.e eVar) {
        this.f319895a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((com.avito.android.paid_services.a) this.f319895a.get());
    }
}
