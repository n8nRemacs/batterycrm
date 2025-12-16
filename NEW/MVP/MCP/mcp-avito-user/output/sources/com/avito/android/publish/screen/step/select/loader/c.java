package com.avito.android.publish.screen.step.select.loader;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SelectLoaderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.details.a> f242180a;

    /* renamed from: b, reason: collision with root package name */
    public final u f242181b;

    public c(u uVar, Provider provider) {
        this.f242180a = provider;
        this.f242181b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f242180a.get(), (d) this.f242181b.get());
    }
}
