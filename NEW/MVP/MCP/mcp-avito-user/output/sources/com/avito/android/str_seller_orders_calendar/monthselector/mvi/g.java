package com.avito.android.str_seller_orders_calendar.monthselector.mvi;

import Mz0.C14551c;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MonthSelectorFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final d f290459a;

    /* renamed from: b, reason: collision with root package name */
    public final b f290460b;

    /* renamed from: c, reason: collision with root package name */
    public final i f290461c;

    /* renamed from: d, reason: collision with root package name */
    public final k f290462d;

    public g(d dVar, b bVar, i iVar, k kVar) {
        this.f290459a = dVar;
        this.f290460b = bVar;
        this.f290461c = iVar;
        this.f290462d = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f290459a.get();
        this.f290460b.getClass();
        a aVar = new a();
        this.f290461c.getClass();
        h hVar = new h();
        this.f290462d.getClass();
        j jVar = new j();
        C14551c.f11157f.getClass();
        return new f("MonthSelector", C14551c.f11158g, new e(cVar, aVar, jVar, hVar));
    }
}
