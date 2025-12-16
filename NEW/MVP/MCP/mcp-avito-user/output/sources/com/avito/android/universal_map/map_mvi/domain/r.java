package com.avito.android.universal_map.map_mvi.domain;

import com.avito.android.universal_map.map.InterfaceC35318f;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Map;
import javax.inject.Provider;

/* compiled from: PointListUseCaseImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class r implements dagger.internal.h<q> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f306223a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f306224b;

    /* renamed from: c, reason: collision with root package name */
    public final u f306225c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35318f> f306226d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.remote.error.f> f306227e;

    public r(dagger.internal.l lVar, dagger.internal.l lVar2, u uVar, Provider provider, Provider provider2) {
        this.f306223a = lVar;
        this.f306224b = lVar2;
        this.f306225c = uVar;
        this.f306226d = provider;
        this.f306227e = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new q((String) this.f306223a.f393949a, (Map) this.f306224b.f393949a, (com.avito.android.universal_map.map_mvi.pins.a) this.f306225c.get(), this.f306226d.get(), this.f306227e.get());
    }
}
