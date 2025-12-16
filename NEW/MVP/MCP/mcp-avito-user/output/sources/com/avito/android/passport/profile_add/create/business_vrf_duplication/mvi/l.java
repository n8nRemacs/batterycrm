package com.avito.android.passport.profile_add.create.business_vrf_duplication.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BusinessVrfDuplicationProfileCreationOneTimeEventProducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f211268a;

    public l(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider) {
        this.f211268a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k(this.f211268a.get());
    }
}
