package com.avito.android.user_viewed.domain.business;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UserViewedCommonInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final j f318346a;

    /* renamed from: b, reason: collision with root package name */
    public final n f318347b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.favorite.h> f318348c;

    public g(j jVar, n nVar, Provider provider) {
        this.f318346a = jVar;
        this.f318347b = nVar;
        this.f318348c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f((h) this.f318346a.get(), (k) this.f318347b.get(), this.f318348c.get());
    }
}
