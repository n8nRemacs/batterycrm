package com.avito.android.tariff.cpx.configure.landing.mvi;

import com.avito.android.util.InterfaceC35863o4;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CpxConfigureLandingReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class n implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35863o4> f296047a;

    public n(Provider<InterfaceC35863o4> provider) {
        this.f296047a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l(this.f296047a.get());
    }
}
