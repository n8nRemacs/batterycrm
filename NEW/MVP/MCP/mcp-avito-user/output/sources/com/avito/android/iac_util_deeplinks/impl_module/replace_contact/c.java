package com.avito.android.iac_util_deeplinks.impl_module.replace_contact;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.permissions.u;
import com.avito.android.permissions.w;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ReplaceContactLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class c implements h<ReplaceContactLinkHandler> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f169213a;

    /* renamed from: b, reason: collision with root package name */
    public final w f169214b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f169215c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f169216d;

    public c(dagger.internal.f fVar, w wVar, dv.b bVar, dagger.internal.f fVar2) {
        this.f169213a = fVar;
        this.f169214b = wVar;
        this.f169215c = bVar;
        this.f169216d = fVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new ReplaceContactLinkHandler((com.avito.android.deeplink_handler.handler.composite.a) this.f169213a.get(), (u) this.f169214b.get(), (a.InterfaceC4053a) this.f169215c.get(), (InterfaceC28373a) this.f169216d.get());
    }
}
