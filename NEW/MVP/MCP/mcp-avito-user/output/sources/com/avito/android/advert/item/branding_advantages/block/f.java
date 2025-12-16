package com.avito.android.advert.item.branding_advantages.block;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BrandingAdvantagesBlockItemPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert_core.analytics.a> f74187a;

    public f(Provider<com.avito.android.advert_core.analytics.a> provider) {
        this.f74187a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f74187a.get());
    }
}
