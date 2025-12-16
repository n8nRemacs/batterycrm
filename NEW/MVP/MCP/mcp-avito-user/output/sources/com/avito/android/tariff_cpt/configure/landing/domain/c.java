package com.avito.android.tariff_cpt.configure.landing.domain;

import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TariffCptConfigureLandingUseCaseImpl_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final l f297764a;

    /* renamed from: b, reason: collision with root package name */
    public final l f297765b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<JC0.a> f297766c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f297767d;

    public c(l lVar, l lVar2, Provider provider, Provider provider2) {
        this.f297764a = lVar;
        this.f297765b = lVar2;
        this.f297766c = provider;
        this.f297767d = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b((String) this.f297764a.f393949a, (String) this.f297765b.f393949a, this.f297766c.get(), this.f297767d.get());
    }
}
