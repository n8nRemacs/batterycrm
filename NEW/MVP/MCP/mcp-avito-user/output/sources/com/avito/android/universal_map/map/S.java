package com.avito.android.universal_map.map;

import gj.InterfaceC40691b;
import java.util.Set;
import javax.inject.Provider;

/* compiled from: UniversalMapMviViewModel_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class S implements dagger.internal.h<Q> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC40691b> f304813a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.h f304814b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.universal_map.map.mvi.q f304815c;

    public S(Provider provider, dagger.internal.h hVar, com.avito.android.universal_map.map.mvi.q qVar) {
        this.f304813a = provider;
        this.f304814b = hVar;
        this.f304815c = qVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new Q(this.f304813a.get(), (Set) this.f304814b.get(), (com.avito.android.universal_map.map.mvi.p) this.f304815c.get());
    }
}
