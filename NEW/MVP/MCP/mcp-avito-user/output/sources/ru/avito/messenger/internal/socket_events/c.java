package ru.avito.messenger.internal.socket_events;

import dagger.internal.x;
import dagger.internal.y;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: SocketEventApiImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes9.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f431768a;

    public c(dagger.internal.f fVar) {
        this.f431768a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((InterfaceC47842z) this.f431768a.get());
    }
}
