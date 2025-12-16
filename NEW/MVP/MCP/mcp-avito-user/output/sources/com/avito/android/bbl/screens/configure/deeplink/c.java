package com.avito.android.bbl.screens.configure.deeplink;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BblConfigureHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.paid_services_impl.e f99131a;

    public c(com.avito.android.paid_services_impl.e eVar) {
        this.f99131a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((com.avito.android.paid_services.a) this.f99131a.get());
    }
}
