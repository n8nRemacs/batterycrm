package com.avito.android.wallet.page.topup.form.di;

import com.avito.android.validation.C36022n;
import com.avito.android.validation.InterfaceC36020m;
import com.avito.android.validation.d1;
import dagger.internal.y;

/* compiled from: TopUpFormModule_ProvideLocalPretendInteractorFactory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class p implements dagger.internal.h<InterfaceC36020m> {

    /* renamed from: a, reason: collision with root package name */
    public final q f328288a;

    public p(q qVar) {
        this.f328288a = qVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d1 d1Var = (d1) this.f328288a.get();
        g.f328273a.getClass();
        return new C36022n(d1Var);
    }
}
