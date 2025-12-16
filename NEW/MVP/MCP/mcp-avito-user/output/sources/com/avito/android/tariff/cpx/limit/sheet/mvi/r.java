package com.avito.android.tariff.cpx.limit.sheet.mvi;

import dagger.internal.x;
import dagger.internal.y;
import java.util.Locale;
import javax.inject.Provider;

/* compiled from: TariffCpxLimitReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class r implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Locale> f297344a;

    public r(Provider<Locale> provider) {
        this.f297344a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new p(this.f297344a.get());
    }
}
