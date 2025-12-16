package com.avito.android.profile.user_profile.cards.promoBanner;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PromoBannerPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f225250a;

    /* renamed from: b, reason: collision with root package name */
    public final l f225251b;

    public f(l lVar, Provider provider) {
        this.f225250a = provider;
        this.f225251b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((Y41.l) this.f225251b.f393949a, this.f225250a.get());
    }
}
