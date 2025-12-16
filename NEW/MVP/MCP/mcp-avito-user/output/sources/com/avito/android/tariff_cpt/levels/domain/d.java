package com.avito.android.tariff_cpt.levels.domain;

import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import uC0.InterfaceC48882a;

/* compiled from: TariffCptLevelsUseCaseImpl_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final l f298612a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC48882a> f298613b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f298614c;

    public d(l lVar, Provider provider, Provider provider2) {
        this.f298612a = lVar;
        this.f298613b = provider;
        this.f298614c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((String) this.f298612a.f393949a, this.f298613b.get(), this.f298614c.get());
    }
}
