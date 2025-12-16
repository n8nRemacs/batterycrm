package com.avito.android.verification.links.redirect;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerificationRedirectLinkInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<BM0.a> f324363a;

    public h(Provider<BM0.a> provider) {
        this.f324363a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f324363a.get());
    }
}
