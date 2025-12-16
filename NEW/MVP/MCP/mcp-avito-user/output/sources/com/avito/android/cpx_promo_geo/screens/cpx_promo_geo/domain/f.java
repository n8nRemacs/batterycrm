package com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.domain;

import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import ns.InterfaceC44470a;

/* compiled from: PostCpxPromoGeoSaveUseCase_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC44470a> f127847a;

    /* renamed from: b, reason: collision with root package name */
    public final l f127848b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f127849c;

    public f(l lVar, Provider provider, Provider provider2) {
        this.f127847a = provider;
        this.f127848b = lVar;
        this.f127849c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC44470a interfaceC44470a = this.f127847a.get();
        return new e(this.f127849c.get(), (String) this.f127848b.f393949a, interfaceC44470a);
    }
}
