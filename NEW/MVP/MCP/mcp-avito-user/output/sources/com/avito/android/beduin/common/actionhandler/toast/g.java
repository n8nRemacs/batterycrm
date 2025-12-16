package com.avito.android.beduin.common.actionhandler.toast;

import Ui.InterfaceC15523b;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BeduinToastObserverImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f100435a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<a> f100436b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f100437c;

    public g(dagger.internal.f fVar, Provider provider, Provider provider2) {
        this.f100435a = fVar;
        this.f100436b = provider;
        this.f100437c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f((InterfaceC15523b) this.f100435a.get(), this.f100436b.get(), this.f100437c.get());
    }
}
