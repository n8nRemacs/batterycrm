package ru.avito.messenger.internal.socket_events;

import dagger.internal.x;
import dagger.internal.y;
import ru.avito.messenger.W;

/* compiled from: SocketEventObserverImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes9.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f431773a;

    public h(dagger.internal.f fVar) {
        this.f431773a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((W) this.f431773a.get());
    }
}
