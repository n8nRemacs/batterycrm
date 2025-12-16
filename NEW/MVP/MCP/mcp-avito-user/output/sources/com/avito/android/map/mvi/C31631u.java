package com.avito.android.map.mvi;

import com.avito.android.map.MapArguments;
import javax.inject.Provider;

/* compiled from: MapBootstrap_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.map.mvi.u, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C31631u implements dagger.internal.h<C31630t> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC31635y> f185308a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<T> f185309b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f185310c;

    public C31631u(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f185308a = provider;
        this.f185309b = provider2;
        this.f185310c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C31630t(this.f185308a.get(), this.f185309b.get(), (MapArguments) this.f185310c.f393949a);
    }
}
