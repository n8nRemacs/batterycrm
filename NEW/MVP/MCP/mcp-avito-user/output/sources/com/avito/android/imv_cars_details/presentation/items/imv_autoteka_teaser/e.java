package com.avito.android.imv_cars_details.presentation.items.imv_autoteka_teaser;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ImvCarsDetailsAutotekaTeaserItemPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f170089a;

    public e(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider) {
        this.f170089a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f170089a.get());
    }
}
