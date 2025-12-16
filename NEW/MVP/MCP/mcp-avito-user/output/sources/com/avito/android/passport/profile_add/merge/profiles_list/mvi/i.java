package com.avito.android.passport.profile_add.merge.profiles_list.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ProfilesListEventProducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f213297a;

    public i(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider) {
        this.f213297a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f213297a.get());
    }
}
