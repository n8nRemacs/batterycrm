package com.avito.android.advert.item.services_title;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ServicesTitleItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f80022a;

    public e(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider) {
        this.f80022a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f80022a.get());
    }
}
