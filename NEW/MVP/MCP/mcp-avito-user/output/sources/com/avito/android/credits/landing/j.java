package com.avito.android.credits.landing;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CreditProductsLandingLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.credits.i f128945a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f128946b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.navigation.c f128947c;

    public j(com.avito.android.credits.i iVar, dv.b bVar, com.avito.android.navigation.c cVar) {
        this.f128945a = iVar;
        this.f128946b = bVar;
        this.f128947c = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((com.avito.android.credits.f) this.f128945a.get(), (a.InterfaceC4053a) this.f128946b.get(), (com.avito.android.navigation.a) this.f128947c.get());
    }
}
