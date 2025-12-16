package com.avito.android.registration_self_employment_redirect_screen.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SelfEmploymentRedirectBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.registration_self_employment_redirect_screen.domain.b f252757a;

    public h(com.avito.android.registration_self_employment_redirect_screen.domain.b bVar) {
        this.f252757a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((com.avito.android.registration_self_employment_redirect_screen.domain.a) this.f252757a.get());
    }
}
