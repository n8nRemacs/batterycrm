package com.avito.android.beduin.common.actionhandler.socket_event;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import lj.InterfaceC43780b;

/* compiled from: BeduinSocketEventsHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class f implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.clientEventBus.a> f100399a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f100400b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC43780b> f100401c;

    public f(dagger.internal.f fVar, Provider provider, Provider provider2) {
        this.f100399a = provider;
        this.f100400b = fVar;
        this.f100401c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f100399a.get(), dagger.internal.g.b(this.f100400b), this.f100401c.get());
    }
}
