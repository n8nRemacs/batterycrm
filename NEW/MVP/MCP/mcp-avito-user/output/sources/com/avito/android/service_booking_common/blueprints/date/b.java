package com.avito.android.service_booking_common.blueprints.date;

import com.avito.android.util.InterfaceC35945t1;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SbDateBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f276323a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f276324b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.a> f276325c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f276326d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.a> f276327e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC35945t1<Long>> f276328f;

    /* renamed from: g, reason: collision with root package name */
    public final com.avito.android.service_booking_common.blueprints.date.date_list.d f276329g;

    public b(Provider provider, dagger.internal.f fVar, Provider provider2, dagger.internal.f fVar2, Provider provider3, Provider provider4, com.avito.android.service_booking_common.blueprints.date.date_list.d dVar) {
        this.f276323a = provider;
        this.f276324b = fVar;
        this.f276325c = provider2;
        this.f276326d = fVar2;
        this.f276327e = provider3;
        this.f276328f = provider4;
        this.f276329g = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f276323a.get(), (com.avito.konveyor.adapter.j) this.f276324b.get(), this.f276325c.get(), (com.avito.konveyor.adapter.j) this.f276326d.get(), this.f276327e.get(), this.f276328f.get(), (com.avito.android.service_booking_common.blueprints.date.date_list.c) this.f276329g.get());
    }
}
