package com.avito.android.publish.screen.objects.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ObjectFillFormActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.publish.screen.objects.domain.a> f240223a;

    /* renamed from: b, reason: collision with root package name */
    public final u f240224b;

    public g(u uVar, Provider provider) {
        this.f240223a = provider;
        this.f240224b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f240223a.get(), (com.avito.android.publish.screen.objects.domain.d) this.f240224b.get());
    }
}
