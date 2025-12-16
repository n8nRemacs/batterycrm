package com.avito.android.imv_cars_details.domain;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import qk0.InterfaceC47409a;

/* compiled from: ImvCarsDetailsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC47409a> f169961a;

    public c(Provider<InterfaceC47409a> provider) {
        this.f169961a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f169961a.get());
    }
}
