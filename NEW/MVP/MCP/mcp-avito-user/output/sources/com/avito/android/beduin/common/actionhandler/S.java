package com.avito.android.beduin.common.actionhandler;

/* compiled from: BeduinExecuteRequestActionHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class S implements dagger.internal.h<Q> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f100124a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f100125b;

    public S(dagger.internal.f fVar, dagger.internal.u uVar) {
        this.f100124a = uVar;
        this.f100125b = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new Q((com.avito.android.beduin.common.a) this.f100124a.get(), dagger.internal.g.b(this.f100125b));
    }
}
