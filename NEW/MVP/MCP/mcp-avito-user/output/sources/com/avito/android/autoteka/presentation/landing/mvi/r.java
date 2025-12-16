package com.avito.android.autoteka.presentation.landing.mvi;

import dagger.internal.x;
import dagger.internal.y;
import gj.InterfaceC40691b;
import javax.inject.Provider;

/* compiled from: AutotekaLandingViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class r implements dagger.internal.h<q> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC40691b> f97384a;

    /* renamed from: b, reason: collision with root package name */
    public final l f97385b;

    public r(Provider provider, l lVar) {
        this.f97384a = provider;
        this.f97385b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new q(this.f97384a.get(), (k) this.f97385b.get());
    }
}
