package com.avito.android.category.mvi;

import Nn.InterfaceC14592a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CategoryActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final u f116689a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC14592a> f116690b;

    public g(u uVar, Provider provider) {
        this.f116689a = uVar;
        this.f116690b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f((com.avito.android.category.d) this.f116689a.get(), this.f116690b.get());
    }
}
