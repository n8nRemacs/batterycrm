package com.avito.android.fees_methods.screen.fees_by_package.deeplink;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FeesByPackageDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.paid_services_impl.e f157979a;

    public g(com.avito.android.paid_services_impl.e eVar) {
        this.f157979a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f((com.avito.android.paid_services.a) this.f157979a.get());
    }
}
