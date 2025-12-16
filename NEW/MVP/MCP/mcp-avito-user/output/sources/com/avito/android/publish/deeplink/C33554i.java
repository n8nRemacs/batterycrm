package com.avito.android.publish.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.publish.C33879l0;
import com.avito.android.publish.PublishIntentFactory;
import nI0.InterfaceC44261b;

/* compiled from: AdvertPublicationLocalDeeplinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.publish.deeplink.i, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33554i implements dagger.internal.h<C33553h> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f232575a;

    /* renamed from: b, reason: collision with root package name */
    public final nI0.d f232576b;

    /* renamed from: c, reason: collision with root package name */
    public final C33879l0 f232577c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f232578d;

    public C33554i(dv.b bVar, nI0.d dVar, C33879l0 c33879l0, dv.b bVar2) {
        this.f232575a = bVar;
        this.f232576b = dVar;
        this.f232577c = c33879l0;
        this.f232578d = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C33553h((a.b) this.f232575a.get(), (InterfaceC44261b) this.f232576b.get(), (PublishIntentFactory) this.f232577c.get(), (a.InterfaceC4053a) this.f232578d.get());
    }
}
