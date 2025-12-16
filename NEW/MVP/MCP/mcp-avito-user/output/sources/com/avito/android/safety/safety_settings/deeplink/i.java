package com.avito.android.safety.safety_settings.deeplink;

import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import po0.InterfaceC47119a;

/* compiled from: SafetySettingsAsyncLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final fo0.g f257579a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f257580b;

    /* renamed from: c, reason: collision with root package name */
    public final C25721c f257581c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f257582d;

    public i(fo0.g gVar, dv.b bVar, C25721c c25721c, dv.b bVar2) {
        this.f257579a = gVar;
        this.f257580b = bVar;
        this.f257581c = c25721c;
        this.f257582d = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h((InterfaceC47119a) this.f257579a.get(), (a.InterfaceC4053a) this.f257580b.get(), (C25719a) this.f257581c.get(), (a.b) this.f257582d.get());
    }
}
