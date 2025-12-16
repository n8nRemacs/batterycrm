package com.avito.android.advert.item.consultation;

import javax.inject.Provider;

/* compiled from: SuperConsultationAfterIceBreakersV4Blueprint_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class Z implements dagger.internal.h<Y> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28111q> f74730a;

    public Z(Provider<InterfaceC28111q> provider) {
        this.f74730a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new Y(this.f74730a.get());
    }
}
