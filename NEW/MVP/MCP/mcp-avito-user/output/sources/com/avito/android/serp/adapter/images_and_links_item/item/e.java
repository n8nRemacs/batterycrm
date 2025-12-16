package com.avito.android.serp.adapter.images_and_links_item.item;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ImageWithLinkItemPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f270199a;

    public e(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider) {
        this.f270199a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(dagger.internal.g.b(this.f270199a));
    }
}
