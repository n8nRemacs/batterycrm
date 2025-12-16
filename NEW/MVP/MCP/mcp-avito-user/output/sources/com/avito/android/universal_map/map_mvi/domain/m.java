package com.avito.android.universal_map.map_mvi.domain;

import com.avito.android.universal_map.map.InterfaceC35318f;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Map;
import javax.inject.Provider;

/* compiled from: PointInfoUseCaseImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f306193a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f306194b;

    /* renamed from: c, reason: collision with root package name */
    public final u f306195c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.universal_map.map_mvi.point_info.a> f306196d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.remote.error.f> f306197e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC35318f> f306198f;

    public m(dagger.internal.l lVar, dagger.internal.l lVar2, u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f306193a = lVar;
        this.f306194b = lVar2;
        this.f306195c = uVar;
        this.f306196d = provider;
        this.f306197e = provider2;
        this.f306198f = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new l((String) this.f306193a.f393949a, (Map) this.f306194b.f393949a, (com.avito.android.universal_map.map.point_info.a) this.f306195c.get(), this.f306196d.get(), this.f306197e.get(), this.f306198f.get());
    }
}
