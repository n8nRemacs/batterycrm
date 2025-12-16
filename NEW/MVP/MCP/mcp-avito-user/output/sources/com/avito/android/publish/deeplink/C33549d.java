package com.avito.android.publish.deeplink;

/* compiled from: AdvertEditV1DeeplinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.publish.deeplink.d, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33549d implements dagger.internal.h<C33548c> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f232550a;

    public C33549d(dagger.internal.f fVar) {
        this.f232550a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C33548c((com.avito.android.deeplink_handler.handler.composite.a) this.f232550a.get());
    }
}
