package com.avito.android.passport.profile_add.onboarding.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PassportOnboardingBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f213582a;

    public e(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider) {
        this.f213582a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f213582a.get());
    }
}
