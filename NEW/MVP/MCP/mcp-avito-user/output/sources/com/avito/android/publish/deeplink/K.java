package com.avito.android.publish.deeplink;

import Of0.C14683c;
import Of0.InterfaceC14681a;
import com.avito.android.deeplink_handler.view.a;

/* compiled from: PublishLimitsHistoryDeeplinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class K implements dagger.internal.h<J> {

    /* renamed from: a, reason: collision with root package name */
    public final C14683c f232537a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f232538b;

    public K(C14683c c14683c, dv.b bVar) {
        this.f232537a = c14683c;
        this.f232538b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new J((InterfaceC14681a) this.f232537a.get(), (a.InterfaceC4053a) this.f232538b.get());
    }
}
