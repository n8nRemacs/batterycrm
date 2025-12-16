package com.avito.android.advert.badge_details;

import dagger.internal.x;
import dagger.internal.y;
import fa.InterfaceC40383a;
import javax.inject.Provider;

/* compiled from: BadgeDetailsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC40383a> f68779a;

    public g(Provider<InterfaceC40383a> provider) {
        this.f68779a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f68779a.get());
    }
}
