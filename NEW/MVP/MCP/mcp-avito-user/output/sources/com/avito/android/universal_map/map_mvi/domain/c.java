package com.avito.android.universal_map.map_mvi.domain;

import com.avito.android.universal_map.map.InterfaceC35318f;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Map;
import javax.inject.Provider;

/* compiled from: FiltersUseCaseImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f306144a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f306145b;

    /* renamed from: c, reason: collision with root package name */
    public final u f306146c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.universal_map.map_mvi.point_filters.a> f306147d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.remote.error.f> f306148e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC35318f> f306149f;

    public c(dagger.internal.l lVar, dagger.internal.l lVar2, u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f306144a = lVar;
        this.f306145b = lVar2;
        this.f306146c = uVar;
        this.f306147d = provider;
        this.f306148e = provider2;
        this.f306149f = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b((String) this.f306144a.f393949a, (Map) this.f306145b.f393949a, (com.avito.android.universal_map.map.pin_filters.a) this.f306146c.get(), this.f306147d.get(), this.f306148e.get(), this.f306149f.get());
    }
}
