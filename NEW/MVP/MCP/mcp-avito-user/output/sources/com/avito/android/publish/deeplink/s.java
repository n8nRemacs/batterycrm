package com.avito.android.publish.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.publish.C33879l0;
import com.avito.android.publish.PublishIntentFactory;

/* compiled from: DraftRefreshDeeplinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class s implements dagger.internal.h<r> {

    /* renamed from: a, reason: collision with root package name */
    public final C33879l0 f232605a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f232606b;

    public s(C33879l0 c33879l0, dv.b bVar) {
        this.f232605a = c33879l0;
        this.f232606b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new r((PublishIntentFactory) this.f232605a.get(), (a.InterfaceC4053a) this.f232606b.get());
    }
}
