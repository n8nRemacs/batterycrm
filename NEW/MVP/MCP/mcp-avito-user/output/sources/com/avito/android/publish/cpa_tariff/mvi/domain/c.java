package com.avito.android.publish.cpa_tariff.mvi.domain;

import com.avito.android.remote.H0;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CpaTariffGetContactsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f232464a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<H0> f232465b;

    public c(Provider<R0> provider, Provider<H0> provider2) {
        this.f232464a = provider;
        this.f232465b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f232464a.get(), this.f232465b.get());
    }
}
