package com.avito.android.favorite;

import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Provider;

/* compiled from: FavoriteAdvertsEventInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.favorite.f, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30572f implements dagger.internal.h<C30571e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.account.E> f155185a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f155186b;

    public C30572f(dagger.internal.f fVar, Provider provider) {
        this.f155185a = provider;
        this.f155186b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C30571e(this.f155185a.get(), (InterfaceC28373a) this.f155186b.get());
    }
}
