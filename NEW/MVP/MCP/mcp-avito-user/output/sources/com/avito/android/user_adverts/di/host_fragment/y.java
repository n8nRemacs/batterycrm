package com.avito.android.user_adverts.di.host_fragment;

import Cd.C13243a;
import androidx.view.P0;
import androidx.view.T0;
import com.avito.android.user_adverts.di.host_fragment.C35553a;
import javax.inject.Provider;
import zq0.AbstractC50612a;
import zq0.C50613b;

/* compiled from: UserAdvertsHintModule_ProvideUserAdvertsHintViewModelFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class y implements dagger.internal.h<AbstractC50612a> {

    /* renamed from: a, reason: collision with root package name */
    public final x f312107a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f312108b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<AbstractC50612a.InterfaceC12979a> f312109c;

    public y(x xVar, dagger.internal.l lVar, Provider provider) {
        this.f312107a = xVar;
        this.f312108b = lVar;
        this.f312109c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        T0 t02 = (T0) this.f312108b.f393949a;
        C50613b c50613bB = ((C35553a.c.r) this.f312109c).f312058a.b();
        this.f312107a.getClass();
        return (AbstractC50612a) new P0(t02, new C13243a(new w(c50613bB))).a(AbstractC50612a.class);
    }
}
