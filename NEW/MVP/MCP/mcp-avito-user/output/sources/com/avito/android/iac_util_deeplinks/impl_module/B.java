package com.avito.android.iac_util_deeplinks.impl_module;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deeplink_handler.view.a;
import javax.inject.Provider;

/* compiled from: PermissionSystemRequestLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class B implements dagger.internal.h<x> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.permissions.z> f169100a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f169101b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f169102c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f169103d;

    public B(dagger.internal.f fVar, dagger.internal.f fVar2, dv.b bVar, Provider provider) {
        this.f169100a = provider;
        this.f169101b = fVar;
        this.f169102c = bVar;
        this.f169103d = fVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new x(this.f169100a.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f169101b.get(), (a.h) this.f169102c.get(), (InterfaceC28373a) this.f169103d.get());
    }
}
