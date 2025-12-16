package com.avito.android.vas_union.deeplink;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VasUnionV2DeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.paid_services_impl.e f323145a;

    public f(com.avito.android.paid_services_impl.e eVar) {
        this.f323145a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((com.avito.android.paid_services.a) this.f323145a.get());
    }
}
