package com.avito.android.developments_catalog.deeplink;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DevelopmentsCatalogLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f139102a;

    public g(dagger.internal.f fVar) {
        this.f139102a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f((com.avito.android.deeplink_handler.handler.composite.a) this.f139102a.get());
    }
}
