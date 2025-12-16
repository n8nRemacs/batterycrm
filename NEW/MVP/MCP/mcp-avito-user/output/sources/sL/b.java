package SL;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: IacMakeCallLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f14908a;

    public b(dagger.internal.f fVar) {
        this.f14908a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.deeplink_handler.handler.composite.a) this.f14908a.get());
    }
}
