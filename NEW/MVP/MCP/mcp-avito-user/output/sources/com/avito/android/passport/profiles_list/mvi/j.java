package com.avito.android.passport.profiles_list.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PassportProfilesListOneTimeEventProducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f213848a;

    public j(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider) {
        this.f213848a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f213848a.get());
    }
}
