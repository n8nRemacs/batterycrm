package com.avito.android.favorites.adapter.interactive_title;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FavoriteInteractiveTitlePresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f156600a;

    public g(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider) {
        this.f156600a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f156600a.get());
    }
}
