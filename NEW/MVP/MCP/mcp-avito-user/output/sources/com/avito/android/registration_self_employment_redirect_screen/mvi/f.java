package com.avito.android.registration_self_employment_redirect_screen.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SelfEmploymentRedirectActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f252754a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.registration_self_employment_redirect_screen.domain.b f252755b;

    public f(Provider provider, com.avito.android.registration_self_employment_redirect_screen.domain.b bVar) {
        this.f252754a = provider;
        this.f252755b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f252754a.get(), (com.avito.android.registration_self_employment_redirect_screen.domain.a) this.f252755b.get());
    }
}
