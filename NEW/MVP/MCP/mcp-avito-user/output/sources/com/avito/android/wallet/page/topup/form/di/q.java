package com.avito.android.wallet.page.topup.form.di;

import com.avito.android.validation.d1;
import com.avito.android.validation.e1;
import com.avito.android.validation.g1;
import com.avito.android.wallet.page.topup.form.di.b;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TopUpFormModule_ProvideParametersValidatorFactory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class q implements dagger.internal.h<d1> {

    /* renamed from: a, reason: collision with root package name */
    public final r f328289a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<hJ.i> f328290b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<hJ.e> f328291c;

    public q(r rVar, Provider provider, Provider provider2) {
        this.f328289a = rVar;
        this.f328290b = provider;
        this.f328291c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        g1 g1Var = (g1) this.f328289a.get();
        hJ.i iVar = (hJ.i) ((b.c.C10181c) this.f328290b).get();
        hJ.e eVar = (hJ.e) ((b.c.C10180b) this.f328291c).get();
        g.f328273a.getClass();
        return new e1(g1Var, iVar, eVar);
    }
}
