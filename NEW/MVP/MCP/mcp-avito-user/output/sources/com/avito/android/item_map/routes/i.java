package com.avito.android.item_map.routes;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import vO.InterfaceC49241a;

/* compiled from: RoutesInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC49241a> f173388a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.remote.error.i f173389b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f173390c;

    public i(com.avito.android.remote.error.i iVar, Provider provider, Provider provider2) {
        this.f173388a = provider;
        this.f173389b = iVar;
        this.f173390c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f173388a.get(), (com.avito.android.remote.error.f) this.f173389b.get(), this.f173390c.get());
    }
}
