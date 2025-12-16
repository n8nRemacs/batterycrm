package com.avito.android.advertising.adapter.items.buzzoola.premium;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BuzzoolaPremiumRichBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<f> f87440a;

    public n(Provider<f> provider) {
        this.f87440a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new m(this.f87440a.get());
    }
}
