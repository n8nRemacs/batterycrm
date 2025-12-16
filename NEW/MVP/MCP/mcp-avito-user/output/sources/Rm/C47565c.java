package rM;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RunExecutableArgsLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: rM.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C47565c implements dagger.internal.h<C47563a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f429761a;

    public C47565c(dagger.internal.f fVar) {
        this.f429761a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C47563a((com.avito.android.deeplink_handler.handler.composite.a) this.f429761a.get());
    }
}
