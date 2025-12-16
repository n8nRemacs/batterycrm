package com.avito.android.beduin.common.actionhandler.socket_event;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BeduinSubscribeSocketEventActionHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final u f100403a;

    public h(u uVar) {
        this.f100403a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new g((a) this.f100403a.get());
    }
}
