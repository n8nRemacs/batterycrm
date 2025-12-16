package com.avito.android.status_doc.deeplink;

import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import zx0.InterfaceC50641a;

/* compiled from: GigStatusDocDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.status_doc.lifecycle.c f284844a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f284845b;

    /* renamed from: c, reason: collision with root package name */
    public final C25721c f284846c;

    public c(com.avito.android.status_doc.lifecycle.c cVar, dv.b bVar, C25721c c25721c) {
        this.f284844a = cVar;
        this.f284845b = bVar;
        this.f284846c = c25721c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((InterfaceC50641a) this.f284844a.get(), (a.InterfaceC4053a) this.f284845b.get(), (C25719a) this.f284846c.get());
    }
}
