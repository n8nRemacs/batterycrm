package com.avito.android.tariff.cpa.info.domain;

import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CpaInfoInteractorImpl_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<WB0.a> f294705a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f294706b;

    public c(Provider<WB0.a> provider, Provider<R0> provider2) {
        this.f294705a = provider;
        this.f294706b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f294705a.get(), this.f294706b.get());
    }
}
