package com.avito.android.universal_map.map_mvi.domain;

import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import gj.InterfaceC40691b;
import javax.inject.Provider;
import tG0.InterfaceC48553b;

/* compiled from: MapViewportUseCaseImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC48553b> f306174a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f306175b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC40691b> f306176c;

    public h(Provider<InterfaceC48553b> provider, Provider<R0> provider2, Provider<InterfaceC40691b> provider3) {
        this.f306174a = provider;
        this.f306175b = provider2;
        this.f306176c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(dagger.internal.g.b(this.f306174a), this.f306175b.get(), this.f306176c.get());
    }
}
