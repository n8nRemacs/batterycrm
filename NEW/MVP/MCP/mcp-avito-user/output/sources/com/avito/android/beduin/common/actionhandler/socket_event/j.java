package com.avito.android.beduin.common.actionhandler.socket_event;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BeduinUnsubscribeSocketEventActionHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final u f100405a;

    public j(u uVar) {
        this.f100405a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new i((a) this.f100405a.get());
    }
}
