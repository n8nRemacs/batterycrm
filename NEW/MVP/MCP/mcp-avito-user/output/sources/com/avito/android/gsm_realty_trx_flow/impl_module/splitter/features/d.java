package com.avito.android.gsm_realty_trx_flow.impl_module.splitter.features;

import com.avito.android.C34161r;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GsmRealtyTrxFlowFeaturesModule_ProvideGsmRealtyTrxFlowFeaturesFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class d implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C34161r> f161279a;

    public d(Provider<C34161r> provider) {
        this.f161279a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C34161r c34161r = this.f161279a.get();
        c.f161278a.getClass();
        return (a) c34161r.f246393a.b(a.class);
    }
}
