package com.avito.android.publish.cpa_tariff.mvi.domain;

import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import dl0.InterfaceC39749a;
import javax.inject.Provider;

/* compiled from: CpaTariffGetTariffInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f232475a;

    /* renamed from: b, reason: collision with root package name */
    public final l f232476b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC39749a> f232477c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC33535v> f232478d;

    public g(l lVar, Provider provider, Provider provider2, Provider provider3) {
        this.f232475a = provider;
        this.f232476b = lVar;
        this.f232477c = provider2;
        this.f232478d = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f232475a.get(), ((Integer) this.f232476b.f393949a).intValue(), this.f232477c.get(), this.f232478d.get());
    }
}
