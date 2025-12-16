package com.avito.android.universal_map.map.mvi.actor;

import com.avito.android.universal_map.UniversalMapParams;
import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import gj.InterfaceC40691b;
import javax.inject.Provider;

/* compiled from: MapViewActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.universal_map.map_mvi.domain.k> f305345a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.universal_map.map_mvi.domain.f> f305346b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f305347c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC40691b> f305348d;

    /* renamed from: e, reason: collision with root package name */
    public final u f305349e;

    public f(dagger.internal.l lVar, u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f305345a = provider;
        this.f305346b = provider2;
        this.f305347c = lVar;
        this.f305348d = provider3;
        this.f305349e = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f305345a.get(), this.f305346b.get(), (UniversalMapParams.MapSettings) this.f305347c.f393949a, this.f305348d.get(), (R0) this.f305349e.get());
    }
}
