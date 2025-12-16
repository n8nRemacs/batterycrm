package com.avito.android.tariff.cpa.close.domain;

import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PostCpaCloseUseCaseImpl_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<WB0.a> f294239a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f294240b;

    public d(Provider<WB0.a> provider, Provider<R0> provider2) {
        this.f294239a = provider;
        this.f294240b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f294239a.get(), this.f294240b.get());
    }
}
