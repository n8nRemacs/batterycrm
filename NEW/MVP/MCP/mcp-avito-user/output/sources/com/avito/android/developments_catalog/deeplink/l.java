package com.avito.android.developments_catalog.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import lx.InterfaceC43844a;

/* compiled from: DevelopmentsCatalogPhoneLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class l implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f139117a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f139118b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC43844a> f139119c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f139120d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.f f139121e;

    public l(dagger.internal.f fVar, dv.b bVar, dv.b bVar2, Provider provider, Provider provider2) {
        this.f139117a = bVar;
        this.f139118b = bVar2;
        this.f139119c = provider;
        this.f139120d = provider2;
        this.f139121e = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((a.i) this.f139117a.get(), (a.g) this.f139118b.get(), this.f139119c.get(), this.f139120d.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f139121e.get());
    }
}
