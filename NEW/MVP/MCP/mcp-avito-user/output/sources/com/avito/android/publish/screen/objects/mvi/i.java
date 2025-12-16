package com.avito.android.publish.screen.objects.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ObjectFillFormBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.publish.screen.objects.domain.a> f240230a;

    /* renamed from: b, reason: collision with root package name */
    public final u f240231b;

    public i(u uVar, Provider provider) {
        this.f240230a = provider;
        this.f240231b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f240230a.get(), (com.avito.android.publish.screen.objects.domain.d) this.f240231b.get());
    }
}
