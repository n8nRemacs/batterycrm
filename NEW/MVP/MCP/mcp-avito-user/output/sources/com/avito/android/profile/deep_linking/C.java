package com.avito.android.profile.deep_linking;

/* compiled from: SessionsListSyncLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class C implements dagger.internal.h<B> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f221889a;

    public C(dagger.internal.f fVar) {
        this.f221889a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new B((com.avito.android.deeplink_handler.handler.composite.a) this.f221889a.get());
    }
}
