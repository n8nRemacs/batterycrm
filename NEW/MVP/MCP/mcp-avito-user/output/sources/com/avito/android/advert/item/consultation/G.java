package com.avito.android.advert.item.consultation;

import javax.inject.Provider;

/* compiled from: ConsultationAfterIceBreakersRedesignBlueprint_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class G implements dagger.internal.h<F> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28111q> f74671a;

    public G(Provider<InterfaceC28111q> provider) {
        this.f74671a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new F(this.f74671a.get());
    }
}
