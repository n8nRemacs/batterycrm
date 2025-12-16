package com.avito.android.verification.links.start;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerificationStartLinkInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<BM0.a> f324526a;

    public h(Provider<BM0.a> provider) {
        this.f324526a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f324526a.get());
    }
}
