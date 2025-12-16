package com.avito.android.freemium.screens.contact_history.deeplink;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FreemiumContactHistoryDeeplinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes13.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.paid_services_impl.e f158954a;

    public b(com.avito.android.paid_services_impl.e eVar) {
        this.f158954a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.paid_services.a) this.f158954a.get());
    }
}
