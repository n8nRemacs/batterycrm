package com.avito.android.advert.item.consultation;

import javax.inject.Provider;

/* compiled from: SuperConsultationAfterIceBreakersV3Blueprint_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class X implements dagger.internal.h<W> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28111q> f74726a;

    public X(Provider<InterfaceC28111q> provider) {
        this.f74726a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new W(this.f74726a.get());
    }
}
