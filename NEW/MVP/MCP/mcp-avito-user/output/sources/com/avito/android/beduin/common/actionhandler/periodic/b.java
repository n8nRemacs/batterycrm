package com.avito.android.beduin.common.actionhandler.periodic;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BeduinCancelPeriodicActionHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f100348a;

    public b(u uVar) {
        this.f100348a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((h) this.f100348a.get());
    }
}
