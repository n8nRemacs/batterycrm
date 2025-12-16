package com.avito.android.iac_util_deeplinks.impl_module;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.C35868p2;
import com.avito.android.util.InterfaceC35845m2;
import javax.inject.Provider;

/* compiled from: PermissionSystemSettingsLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class I implements dagger.internal.h<E> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.permissions.z> f169118a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.permissions.w f169119b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f169120c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f169121d;

    /* renamed from: e, reason: collision with root package name */
    public final C35868p2 f169122e;

    /* renamed from: f, reason: collision with root package name */
    public final dv.b f169123f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.app_foreground_provider.util_module.a> f169124g;

    public I(Provider provider, com.avito.android.permissions.w wVar, dagger.internal.f fVar, dagger.internal.f fVar2, C35868p2 c35868p2, dv.b bVar, Provider provider2) {
        this.f169118a = provider;
        this.f169119b = wVar;
        this.f169120c = fVar;
        this.f169121d = fVar2;
        this.f169122e = c35868p2;
        this.f169123f = bVar;
        this.f169124g = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new E(this.f169118a.get(), (com.avito.android.permissions.u) this.f169119b.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f169120c.get(), (InterfaceC28373a) this.f169121d.get(), (InterfaceC35845m2) this.f169122e.get(), (a.InterfaceC4053a) this.f169123f.get(), this.f169124g.get());
    }
}
