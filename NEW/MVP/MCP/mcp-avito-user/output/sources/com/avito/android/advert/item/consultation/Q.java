package com.avito.android.advert.item.consultation;

import javax.inject.Provider;

/* compiled from: SuperConsultationAfterIceBreakersBlueprint_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class Q implements dagger.internal.h<P> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28111q> f74690a;

    public Q(Provider<InterfaceC28111q> provider) {
        this.f74690a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new P(this.f74690a.get());
    }
}
