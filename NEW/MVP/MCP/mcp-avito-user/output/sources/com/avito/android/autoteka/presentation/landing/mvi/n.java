package com.avito.android.autoteka.presentation.landing.mvi;

import dagger.internal.x;
import dagger.internal.y;
import gj.InterfaceC40691b;
import javax.inject.Provider;

/* compiled from: AutotekaLandingOneTimeEventProducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC40691b> f97381a;

    public n(Provider<InterfaceC40691b> provider) {
        this.f97381a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new m(this.f97381a.get());
    }
}
