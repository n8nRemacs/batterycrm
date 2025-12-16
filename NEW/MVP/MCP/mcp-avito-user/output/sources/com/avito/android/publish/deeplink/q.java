package com.avito.android.publish.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.publish.C33879l0;
import com.avito.android.publish.PublishIntentFactory;

/* compiled from: DraftPublicationDeeplinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f232600a;

    /* renamed from: b, reason: collision with root package name */
    public final C33879l0 f232601b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f232602c;

    public q(dv.b bVar, C33879l0 c33879l0, dv.b bVar2) {
        this.f232600a = bVar;
        this.f232601b = c33879l0;
        this.f232602c = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new p((a.b) this.f232600a.get(), (PublishIntentFactory) this.f232601b.get(), (a.InterfaceC4053a) this.f232602c.get());
    }
}
