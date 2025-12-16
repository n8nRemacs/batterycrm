package ru.avito.messenger.internal.socket_events;

import dagger.internal.x;
import dagger.internal.y;
import ru.avito.messenger.V;

/* compiled from: SocketEventConnectionStateObserverImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes9.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f431771a;

    public f(dagger.internal.f fVar) {
        this.f431771a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((V) this.f431771a.get());
    }
}
