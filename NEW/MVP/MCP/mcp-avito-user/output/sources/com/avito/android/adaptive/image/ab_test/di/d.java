package com.avito.android.adaptive.image.ab_test.di;

import com.avito.android.C34161r;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ImageLoaderFeaturesModule_ProvideImageLoaderFeaturesFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class d implements h<P3.e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C34161r> f68493a;

    public d(Provider<C34161r> provider) {
        this.f68493a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C34161r c34161r = this.f68493a.get();
        c.f68492a.getClass();
        return (P3.e) c34161r.f246393a.b(P3.e.class);
    }
}
