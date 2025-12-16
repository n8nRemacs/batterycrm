package com.avito.android.universal_map.map.mvi.actor;

import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import gj.InterfaceC40691b;
import javax.inject.Provider;

/* compiled from: FiltersActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f305273a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC40691b> f305274b;

    /* renamed from: c, reason: collision with root package name */
    public final u f305275c;

    public b(u uVar, u uVar2, Provider provider) {
        this.f305273a = uVar;
        this.f305274b = provider;
        this.f305275c = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.universal_map.map_mvi.domain.a) this.f305273a.get(), this.f305274b.get(), (R0) this.f305275c.get());
    }
}
