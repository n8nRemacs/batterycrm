package com.avito.android.messenger.deeplink;

import com.avito.android.deeplink_handler.view.a;
import javax.inject.Provider;

/* compiled from: FlowerRedirectDeepLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class U implements dagger.internal.h<Q> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f195431a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f195432b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.messenger.flower.domain.d f195433c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.util.R0> f195434d;

    public U(dv.b bVar, dagger.internal.f fVar, com.avito.android.messenger.flower.domain.d dVar, Provider provider) {
        this.f195431a = bVar;
        this.f195432b = fVar;
        this.f195433c = dVar;
        this.f195434d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new Q((a.g) this.f195431a.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f195432b.get(), (com.avito.android.messenger.flower.domain.a) this.f195433c.get(), this.f195434d.get());
    }
}
