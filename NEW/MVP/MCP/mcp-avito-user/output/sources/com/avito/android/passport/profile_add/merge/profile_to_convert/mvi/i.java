package com.avito.android.passport.profile_add.merge.profile_to_convert.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ProfileToConvertEventProducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f213167a;

    public i(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider) {
        this.f213167a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f213167a.get());
    }
}
