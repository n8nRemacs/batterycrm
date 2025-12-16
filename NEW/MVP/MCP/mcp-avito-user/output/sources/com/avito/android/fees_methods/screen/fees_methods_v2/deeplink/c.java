package com.avito.android.fees_methods.screen.fees_methods_v2.deeplink;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FeesMethodsV3DeeplinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes13.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.paid_services_impl.e f158199a;

    public c(com.avito.android.paid_services_impl.e eVar) {
        this.f158199a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((com.avito.android.paid_services.a) this.f158199a.get());
    }
}
