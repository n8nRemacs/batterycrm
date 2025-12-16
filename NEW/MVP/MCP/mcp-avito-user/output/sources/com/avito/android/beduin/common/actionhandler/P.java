package com.avito.android.beduin.common.actionhandler;

import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: BeduinDelayActionHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class P implements dagger.internal.h<O> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f100109a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f100110b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f100111c;

    public P(dagger.internal.f fVar, dagger.internal.l lVar, Provider provider) {
        this.f100109a = fVar;
        this.f100110b = lVar;
        this.f100111c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new O(this.f100111c.get(), dagger.internal.g.b(this.f100109a), dagger.internal.g.a(dagger.internal.w.a(this.f100110b)));
    }
}
