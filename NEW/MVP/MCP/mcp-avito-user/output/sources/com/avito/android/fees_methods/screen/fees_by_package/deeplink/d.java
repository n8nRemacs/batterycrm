package com.avito.android.fees_methods.screen.fees_by_package.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FeesApplyByPackageDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<AE.a> f157973a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f157974b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f157975c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f157976d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f157977e;

    public d(dagger.internal.f fVar, dv.b bVar, dv.b bVar2, Provider provider, Provider provider2) {
        this.f157973a = provider;
        this.f157974b = bVar;
        this.f157975c = bVar2;
        this.f157976d = fVar;
        this.f157977e = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f157973a.get(), (a.i) this.f157974b.get(), (a.g) this.f157975c.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f157976d.get(), this.f157977e.get());
    }
}
