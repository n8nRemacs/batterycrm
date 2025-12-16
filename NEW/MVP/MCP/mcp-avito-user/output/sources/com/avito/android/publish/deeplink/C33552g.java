package com.avito.android.publish.deeplink;

import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.publish.C33879l0;
import com.avito.android.publish.PublishIntentFactory;
import nI0.InterfaceC44261b;

/* compiled from: AdvertPublicationDeeplinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.publish.deeplink.g, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33552g implements dagger.internal.h<C33551f> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f232563a;

    /* renamed from: b, reason: collision with root package name */
    public final nI0.d f232564b;

    /* renamed from: c, reason: collision with root package name */
    public final C33879l0 f232565c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f232566d;

    /* renamed from: e, reason: collision with root package name */
    public final C25721c f232567e;

    public C33552g(dv.b bVar, nI0.d dVar, C33879l0 c33879l0, dv.b bVar2, C25721c c25721c) {
        this.f232563a = bVar;
        this.f232564b = dVar;
        this.f232565c = c33879l0;
        this.f232566d = bVar2;
        this.f232567e = c25721c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C33551f((a.b) this.f232563a.get(), (InterfaceC44261b) this.f232564b.get(), (PublishIntentFactory) this.f232565c.get(), (a.InterfaceC4053a) this.f232566d.get(), (C25719a) this.f232567e.get());
    }
}
