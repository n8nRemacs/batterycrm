package com.avito.android.tariff.cpx.configure.advance.domain;

import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CpxConfigureAdvanceUseCaseImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<WB0.a> f295644a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f295645b;

    /* renamed from: c, reason: collision with root package name */
    public final l f295646c;

    public f(l lVar, Provider provider, Provider provider2) {
        this.f295644a = provider;
        this.f295645b = provider2;
        this.f295646c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f295644a.get(), this.f295645b.get(), (String) this.f295646c.f393949a);
    }
}
