package com.avito.android.wallet.page.topup.form.mvi.component;

import com.avito.android.InterfaceC36134w1;
import com.avito.android.util.R0;
import com.avito.android.validation.InterfaceC36020m;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TopUpFormActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class e implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.wallet.page.topup.form.di.p f328391a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC36134w1> f328392b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f328393c;

    public e(com.avito.android.wallet.page.topup.form.di.p pVar, Provider provider, Provider provider2) {
        this.f328391a = pVar;
        this.f328392b = provider;
        this.f328393c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((InterfaceC36020m) this.f328391a.get(), this.f328392b.get(), this.f328393c.get());
    }
}
