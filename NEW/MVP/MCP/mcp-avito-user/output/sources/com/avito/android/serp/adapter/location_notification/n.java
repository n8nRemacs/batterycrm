package com.avito.android.serp.adapter.location_notification;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: LocationNotificationItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f270267a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f270268b;

    public n(dagger.internal.l lVar, dagger.internal.l lVar2) {
        this.f270267a = lVar;
        this.f270268b = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new m((com.jakewharton.rxrelay3.d) this.f270267a.f393949a, (com.jakewharton.rxrelay3.d) this.f270268b.f393949a);
    }
}
