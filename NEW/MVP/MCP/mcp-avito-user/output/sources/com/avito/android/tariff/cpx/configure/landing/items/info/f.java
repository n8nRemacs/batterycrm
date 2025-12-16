package com.avito.android.tariff.cpx.configure.landing.items.info;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CpxConfigureLandingInfoItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f296007a;

    public f(Provider<com.avito.android.util.text.a> provider) {
        this.f296007a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f296007a.get());
    }
}
