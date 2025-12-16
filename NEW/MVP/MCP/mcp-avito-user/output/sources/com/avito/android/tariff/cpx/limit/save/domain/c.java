package com.avito.android.tariff.cpx.limit.save.domain;

import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PostTariffCpxLimitSaveUseCaseImpl_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<WB0.a> f297223a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f297224b;

    public c(Provider<WB0.a> provider, Provider<R0> provider2) {
        this.f297223a = provider;
        this.f297224b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f297223a.get(), this.f297224b.get());
    }
}
