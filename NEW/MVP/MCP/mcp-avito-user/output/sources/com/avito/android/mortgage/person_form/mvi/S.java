package com.avito.android.mortgage.person_form.mvi;

import javax.inject.Provider;

/* compiled from: PersonFormReducer_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class S implements dagger.internal.h<P> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<D00.a> f200893a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f200894b;

    public S(dagger.internal.u uVar, Provider provider) {
        this.f200893a = provider;
        this.f200894b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new P(this.f200893a.get(), (com.avito.android.mortgage.person_form.analytics.c) this.f200894b.get());
    }
}
