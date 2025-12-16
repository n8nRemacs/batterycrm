package com.avito.android.tariff_cpt.configure.levels.domain;

import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import uC0.InterfaceC48882a;

/* compiled from: TariffCptConfigureLevelsUseCaseImpl_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final l f297867a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC48882a> f297868b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f297869c;

    public d(l lVar, Provider provider, Provider provider2) {
        this.f297867a = lVar;
        this.f297868b = provider;
        this.f297869c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((String) this.f297867a.f393949a, this.f297868b.get(), this.f297869c.get());
    }
}
