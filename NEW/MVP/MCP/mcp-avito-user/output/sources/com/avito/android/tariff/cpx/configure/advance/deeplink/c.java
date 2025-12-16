package com.avito.android.tariff.cpx.configure.advance.deeplink;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CpxConfigureAdvanceDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.paid_services_impl.e f295566a;

    public c(com.avito.android.paid_services_impl.e eVar) {
        this.f295566a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((com.avito.android.paid_services.a) this.f295566a.get());
    }
}
