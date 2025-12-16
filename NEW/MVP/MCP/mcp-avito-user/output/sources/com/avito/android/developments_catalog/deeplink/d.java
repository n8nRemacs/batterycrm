package com.avito.android.developments_catalog.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import lx.InterfaceC43844a;

/* compiled from: DevelopersCatalogPhoneLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class d implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f139094a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f139095b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC43844a> f139096c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f139097d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.f f139098e;

    public d(dagger.internal.f fVar, dv.b bVar, dv.b bVar2, Provider provider, Provider provider2) {
        this.f139094a = bVar;
        this.f139095b = bVar2;
        this.f139096c = provider;
        this.f139097d = provider2;
        this.f139098e = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((a.i) this.f139094a.get(), (a.g) this.f139095b.get(), this.f139096c.get(), this.f139097d.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f139098e.get());
    }
}
