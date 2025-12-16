package com.avito.android.tariff_cpt.info.domain;

import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import uC0.InterfaceC48882a;

/* compiled from: CptInfoV2UseCaseImpl_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC48882a> f298220a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f298221b;

    public c(Provider<InterfaceC48882a> provider, Provider<R0> provider2) {
        this.f298220a = provider;
        this.f298221b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f298220a.get(), this.f298221b.get());
    }
}
