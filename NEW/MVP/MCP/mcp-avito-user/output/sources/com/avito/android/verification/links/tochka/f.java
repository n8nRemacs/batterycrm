package com.avito.android.verification.links.tochka;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerificationTochkaLinkInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<BM0.a> f324676a;

    public f(Provider<BM0.a> provider) {
        this.f324676a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f324676a.get());
    }
}
