package com.avito.android.remote.notification;

/* compiled from: ActiveNotificationProviderImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.remote.notification.c, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C34336c implements dagger.internal.h<C34335b> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f254046a;

    public C34336c(dagger.internal.f fVar) {
        this.f254046a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C34335b((com.avito.android.notification.m) this.f254046a.get());
    }
}
