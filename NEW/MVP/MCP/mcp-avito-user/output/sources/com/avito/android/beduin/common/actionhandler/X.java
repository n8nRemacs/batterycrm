package com.avito.android.beduin.common.actionhandler;

import com.avito.android.analytics.InterfaceC28373a;
import di.C39730b;
import javax.inject.Provider;

/* compiled from: BeduinLogEventActionHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class X implements dagger.internal.h<V> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f100144a;

    /* renamed from: b, reason: collision with root package name */
    public final C39730b f100145b;

    public X(C39730b c39730b, Provider provider) {
        this.f100144a = provider;
        this.f100145b = c39730b;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new V(this.f100144a.get(), (lj.c) this.f100145b.get());
    }
}
