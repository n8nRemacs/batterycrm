package SL;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: IacMakeRecallLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f14915a;

    public h(dagger.internal.f fVar) {
        this.f14915a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((com.avito.android.deeplink_handler.handler.composite.a) this.f14915a.get());
    }
}
