package com.avito.android.iac_util_deeplinks.impl_module;

import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Provider;

/* compiled from: PermissionCheckLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.iac_util_deeplinks.impl_module.u, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C30969u implements dagger.internal.h<C30968t> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.permissions.z> f169230a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f169231b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f169232c;

    public C30969u(dagger.internal.f fVar, dagger.internal.f fVar2, Provider provider) {
        this.f169230a = provider;
        this.f169231b = fVar;
        this.f169232c = fVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C30968t(this.f169230a.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f169231b.get(), (InterfaceC28373a) this.f169232c.get());
    }
}
