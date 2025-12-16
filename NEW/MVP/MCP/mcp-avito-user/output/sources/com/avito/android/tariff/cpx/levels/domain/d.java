package com.avito.android.tariff.cpx.levels.domain;

import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CpxLevelsUseCaseImpl_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final l f297097a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<WB0.a> f297098b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f297099c;

    public d(l lVar, Provider provider, Provider provider2) {
        this.f297097a = lVar;
        this.f297098b = provider;
        this.f297099c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f297098b.get(), this.f297099c.get(), (String) this.f297097a.f393949a);
    }
}
