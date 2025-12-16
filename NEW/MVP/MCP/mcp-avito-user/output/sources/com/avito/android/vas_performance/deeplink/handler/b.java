package com.avito.android.vas_performance.deeplink.handler;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.vas_performance.E;
import com.avito.android.vas_performance.G;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AppliedServicesDeepLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f319882a;

    /* renamed from: b, reason: collision with root package name */
    public final G f319883b;

    public b(dv.b bVar, G g12) {
        this.f319882a = bVar;
        this.f319883b = g12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((a.InterfaceC4053a) this.f319882a.get(), (E) this.f319883b.get());
    }
}
