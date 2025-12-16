package com.avito.android.social_management.adapter.notification;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: NotificationItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f284535a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f284536b;

    public b(u uVar, Provider provider) {
        this.f284535a = uVar;
        this.f284536b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f284535a.get(), this.f284536b.get());
    }
}
