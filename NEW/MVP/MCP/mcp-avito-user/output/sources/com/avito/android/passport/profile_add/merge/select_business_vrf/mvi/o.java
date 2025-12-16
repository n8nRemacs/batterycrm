package com.avito.android.passport.profile_add.merge.select_business_vrf.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SelectBusinessVrfOneTimeEventProducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f213479a;

    public o(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider) {
        this.f213479a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new n(this.f213479a.get());
    }
}
