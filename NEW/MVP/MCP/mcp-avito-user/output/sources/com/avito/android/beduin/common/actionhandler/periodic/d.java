package com.avito.android.beduin.common.actionhandler.periodic;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BeduinExecutePeriodicActionHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f100350a;

    public d(u uVar) {
        this.f100350a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((h) this.f100350a.get());
    }
}
