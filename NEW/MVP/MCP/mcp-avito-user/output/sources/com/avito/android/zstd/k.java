package com.avito.android.zstd;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ZstdInterceptorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final g f331389a;

    /* renamed from: b, reason: collision with root package name */
    public final m f331390b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f331391c;

    public k(g gVar, m mVar, dagger.internal.f fVar) {
        this.f331389a = gVar;
        this.f331390b = mVar;
        this.f331391c = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f331389a.getClass();
        return new j(new f(), (l) this.f331390b.get(), (InterfaceC28373a) this.f331391c.get());
    }
}
