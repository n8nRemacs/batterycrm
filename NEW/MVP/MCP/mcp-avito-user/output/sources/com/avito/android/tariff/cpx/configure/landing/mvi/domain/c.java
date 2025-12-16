package com.avito.android.tariff.cpx.configure.landing.mvi.domain;

import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GetCpxConfigureLandingUseCaseImpl_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final l f296022a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<WB0.a> f296023b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f296024c;

    public c(l lVar, Provider provider, Provider provider2) {
        this.f296022a = lVar;
        this.f296023b = provider;
        this.f296024c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f296023b.get(), this.f296024c.get(), (String) this.f296022a.f393949a);
    }
}
