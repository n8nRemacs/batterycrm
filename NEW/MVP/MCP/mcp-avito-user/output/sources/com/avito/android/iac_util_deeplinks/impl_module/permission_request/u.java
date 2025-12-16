package com.avito.android.iac_util_deeplinks.impl_module.permission_request;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.permissions.G;
import com.avito.android.permissions.I;
import com.avito.android.permissions.z;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PermissionRequestSystemPopupLinkHandler_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class u implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<z> f169199a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f169200b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f169201c;

    /* renamed from: d, reason: collision with root package name */
    public final I f169202d;

    public u(Provider provider, dagger.internal.f fVar, dv.b bVar, I i12) {
        this.f169199a = provider;
        this.f169200b = fVar;
        this.f169201c = bVar;
        this.f169202d = i12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new p(this.f169199a.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f169200b.get(), (a.h) this.f169201c.get(), (G) this.f169202d.get());
    }
}
