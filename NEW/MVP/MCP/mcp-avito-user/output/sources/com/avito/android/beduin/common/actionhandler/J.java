package com.avito.android.beduin.common.actionhandler;

import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: BeduinDebounceActionHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class J implements dagger.internal.h<I> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f100093a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f100094b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f100095c;

    public J(dagger.internal.f fVar, dagger.internal.l lVar, Provider provider) {
        this.f100093a = lVar;
        this.f100094b = fVar;
        this.f100095c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new I(this.f100095c.get(), dagger.internal.g.a(dagger.internal.w.a(this.f100093a)), dagger.internal.g.b(this.f100094b));
    }
}
