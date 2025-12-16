package rM;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SetExecutableArgsLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class i implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f429765a;

    public i(dagger.internal.f fVar) {
        this.f429765a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((com.avito.android.deeplink_handler.handler.composite.a) this.f429765a.get());
    }
}
