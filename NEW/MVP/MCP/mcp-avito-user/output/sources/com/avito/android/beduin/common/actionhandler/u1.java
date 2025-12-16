package com.avito.android.beduin.common.actionhandler;

import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: BeduinThrottleActionHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class u1 implements dagger.internal.h<t1> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f100478a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f100479b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f100480c;

    public u1(dagger.internal.f fVar, dagger.internal.l lVar, Provider provider) {
        this.f100478a = fVar;
        this.f100479b = lVar;
        this.f100480c = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new t1(dagger.internal.g.b(this.f100478a), (io.reactivex.rxjava3.disposables.c) this.f100479b.f393949a, this.f100480c.get());
    }
}
