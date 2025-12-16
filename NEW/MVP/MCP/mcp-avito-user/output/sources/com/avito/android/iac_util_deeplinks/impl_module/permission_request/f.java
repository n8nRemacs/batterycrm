package com.avito.android.iac_util_deeplinks.impl_module.permission_request;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.permissions.z;
import com.avito.android.util.C35868p2;
import com.avito.android.util.InterfaceC35845m2;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PermissionRequestAppSettingsWithReturnLinkHandler_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class f implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<z> f169173a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.permissions.w f169174b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f169175c;

    /* renamed from: d, reason: collision with root package name */
    public final C35868p2 f169176d;

    /* renamed from: e, reason: collision with root package name */
    public final dv.b f169177e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.app_foreground_provider.util_module.a> f169178f;

    public f(Provider provider, com.avito.android.permissions.w wVar, dagger.internal.f fVar, C35868p2 c35868p2, dv.b bVar, Provider provider2) {
        this.f169173a = provider;
        this.f169174b = wVar;
        this.f169175c = fVar;
        this.f169176d = c35868p2;
        this.f169177e = bVar;
        this.f169178f = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f169173a.get(), (com.avito.android.permissions.u) this.f169174b.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f169175c.get(), (InterfaceC35845m2) this.f169176d.get(), (a.InterfaceC4053a) this.f169177e.get(), this.f169178f.get());
    }
}
