package com.avito.android.profile.deep_linking;

import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;

/* compiled from: IacProfilePhonesSettingsLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f221905a;

    /* renamed from: b, reason: collision with root package name */
    public final l90.e f221906b;

    /* renamed from: c, reason: collision with root package name */
    public final C25721c f221907c;

    public h(dv.b bVar, l90.e eVar, C25721c c25721c) {
        this.f221905a = bVar;
        this.f221906b = eVar;
        this.f221907c = c25721c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((a.InterfaceC4053a) this.f221905a.get(), (l90.c) this.f221906b.get(), (C25719a) this.f221907c.get());
    }
}
