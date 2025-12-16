package com.avito.android.beduin.common.component.favorite_button;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BeduinFavoriteButtonScreenConnector_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert_collection_toast.a> f101201a;

    public h(Provider<com.avito.android.advert_collection_toast.a> provider) {
        this.f101201a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f101201a.get());
    }
}
