package com.avito.android.profile.user_profile.cards.passport;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PassportCardItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final l f225144a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f225145b;

    public g(l lVar, Provider provider) {
        this.f225144a = lVar;
        this.f225145b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f((Y41.l) this.f225144a.f393949a, this.f225145b.get());
    }
}
