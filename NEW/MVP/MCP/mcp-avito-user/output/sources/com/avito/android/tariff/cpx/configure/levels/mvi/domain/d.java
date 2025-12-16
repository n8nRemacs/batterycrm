package com.avito.android.tariff.cpx.configure.levels.mvi.domain;

import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GetTariffCpxConfigureLevelsUseCaseImpl_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final l f296203a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<WB0.a> f296204b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f296205c;

    public d(l lVar, Provider provider, Provider provider2) {
        this.f296203a = lVar;
        this.f296204b = provider;
        this.f296205c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f296204b.get(), this.f296205c.get(), (String) this.f296203a.f393949a);
    }
}
