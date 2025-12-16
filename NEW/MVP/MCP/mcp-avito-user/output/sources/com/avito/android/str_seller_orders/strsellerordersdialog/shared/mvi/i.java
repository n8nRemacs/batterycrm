package com.avito.android.str_seller_orders.strsellerordersdialog.shared.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SharedViewModelFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final b f290199a;

    /* renamed from: b, reason: collision with root package name */
    public final k f290200b;

    /* renamed from: c, reason: collision with root package name */
    public final f f290201c;

    public i(b bVar, k kVar, f fVar) {
        this.f290199a = bVar;
        this.f290200b = kVar;
        this.f290201c = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f290199a.getClass();
        a aVar = new a();
        this.f290200b.getClass();
        j jVar = new j();
        this.f290201c.getClass();
        e eVar = new e();
        Dz0.d.f3604c.getClass();
        return new h("StrSellerOrdersDialogShared", Dz0.d.f3605d, new g(aVar, jVar, eVar));
    }
}
