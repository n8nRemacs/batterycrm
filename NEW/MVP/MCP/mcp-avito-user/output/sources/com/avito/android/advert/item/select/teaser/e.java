package com.avito.android.advert.item.select.teaser;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AutoSelectTeaserPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f79649a;

    public e(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider) {
        this.f79649a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f79649a.get());
    }
}
