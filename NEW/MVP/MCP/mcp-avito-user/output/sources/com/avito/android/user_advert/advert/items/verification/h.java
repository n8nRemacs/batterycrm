package com.avito.android.user_advert.advert.items.verification;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerificationBlockOfferItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<b> f310393a;

    public h(Provider<b> provider) {
        this.f310393a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f310393a.get());
    }
}
