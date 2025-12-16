package com.avito.android.universal_map.map_mvi.pins;

import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import tG0.InterfaceC48553b;

/* compiled from: UniversalMapPinsRepositoryImpl_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC48553b> f306240a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f306241b;

    public c(Provider<InterfaceC48553b> provider, Provider<R0> provider2) {
        this.f306240a = provider;
        this.f306241b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f306241b.get(), g.b(this.f306240a));
    }
}
