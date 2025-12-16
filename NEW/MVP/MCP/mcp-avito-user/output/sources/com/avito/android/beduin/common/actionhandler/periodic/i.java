package com.avito.android.beduin.common.actionhandler.periodic;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BeduinPeriodicActionHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f100359a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f100360b;

    /* renamed from: c, reason: collision with root package name */
    public final l f100361c;

    public i(dagger.internal.f fVar, l lVar, Provider provider) {
        this.f100359a = fVar;
        this.f100360b = provider;
        this.f100361c = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f100360b.get(), dagger.internal.g.b(this.f100359a), dagger.internal.g.b(this.f100361c));
    }
}
