package com.avito.android.advert.item.consultation;

import javax.inject.Provider;

/* compiled from: ConsultationButtonBlueprint_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class I implements dagger.internal.h<H> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<J> f74675a;

    public I(Provider<J> provider) {
        this.f74675a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new H(this.f74675a.get());
    }
}
