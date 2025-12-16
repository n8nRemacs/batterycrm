package com.avito.android.user_viewed.domain.business;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UserViewedLocalInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.viewed.persistance.b> f318350a;

    public j(Provider<com.avito.android.advert.viewed.persistance.b> provider) {
        this.f318350a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f318350a.get());
    }
}
