package com.avito.android.tariff.cpx.configure.landing.items.accordions_card;

import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CpxConfigureLandingAccordionsCardItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f295956a;

    /* renamed from: b, reason: collision with root package name */
    public final l f295957b;

    /* renamed from: c, reason: collision with root package name */
    public final l f295958c;

    public g(l lVar, l lVar2, Provider provider) {
        this.f295956a = provider;
        this.f295957b = lVar;
        this.f295958c = lVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f((Y41.l) this.f295957b.f393949a, (Y41.l) this.f295958c.f393949a, this.f295956a.get());
    }
}
