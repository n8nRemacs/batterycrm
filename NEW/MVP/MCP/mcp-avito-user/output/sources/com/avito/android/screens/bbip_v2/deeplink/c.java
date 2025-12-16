package com.avito.android.screens.bbip_v2.deeplink;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BbipV2DeeplinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.paid_services_impl.e f261435a;

    public c(com.avito.android.paid_services_impl.e eVar) {
        this.f261435a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((com.avito.android.paid_services.a) this.f261435a.get());
    }
}
