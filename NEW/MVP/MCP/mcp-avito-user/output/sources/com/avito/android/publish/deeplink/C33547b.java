package com.avito.android.publish.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.publish.C33879l0;
import com.avito.android.publish.PublishIntentFactory;

/* compiled from: AdvertEditDeeplinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.publish.deeplink.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33547b implements dagger.internal.h<C33546a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f232546a;

    /* renamed from: b, reason: collision with root package name */
    public final C33879l0 f232547b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f232548c;

    public C33547b(dv.b bVar, C33879l0 c33879l0, dv.b bVar2) {
        this.f232546a = bVar;
        this.f232547b = c33879l0;
        this.f232548c = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C33546a((a.b) this.f232546a.get(), (PublishIntentFactory) this.f232547b.get(), (a.InterfaceC4053a) this.f232548c.get());
    }
}
