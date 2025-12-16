package com.avito.android.advert.item.consultation;

import javax.inject.Provider;

/* compiled from: SuperConsultationAfterIceBreakersV2Blueprint_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class V implements dagger.internal.h<U> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28111q> f74722a;

    public V(Provider<InterfaceC28111q> provider) {
        this.f74722a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new U(this.f74722a.get());
    }
}
