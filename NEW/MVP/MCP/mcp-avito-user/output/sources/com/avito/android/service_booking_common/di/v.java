package com.avito.android.service_booking_common.di;

import java.util.Set;
import javax.inject.Provider;
import kotlin.collections.C42756l;

/* compiled from: ServiceBookingItemsModule_ProvidePresenterSetFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class v implements dagger.internal.h<Set<TV0.d<?, ?>>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.service_booking_common.blueprints.check_price_list.d> f276546a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.service_booking_common.blueprints.date.d> f276547b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f276548c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.service_booking_common.blueprints.input.d> f276549d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.service_booking_common.blueprints.contact.d> f276550e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.service_booking_common.blueprints.comment.d> f276551f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.service_booking_common.blueprints.specialist.c> f276552g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<com.avito.android.service_booking_common.blueprints.any_specialist.c> f276553h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<com.avito.android.service_booking_common.blueprints.partner_logo.c> f276554i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<com.avito.android.service_booking_common.blueprints.geo_reference.c> f276555j;

    public v(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9) {
        this.f276546a = provider;
        this.f276547b = provider2;
        this.f276548c = uVar;
        this.f276549d = provider3;
        this.f276550e = provider4;
        this.f276551f = provider5;
        this.f276552g = provider6;
        this.f276553h = provider7;
        this.f276554i = provider8;
        this.f276555j = provider9;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.service_booking_common.blueprints.check_price_list.d dVar = this.f276546a.get();
        com.avito.android.service_booking_common.blueprints.date.d dVar2 = this.f276547b.get();
        com.avito.android.service_booking_common.blueprints.offer.d dVar3 = (com.avito.android.service_booking_common.blueprints.offer.d) this.f276548c.get();
        com.avito.android.service_booking_common.blueprints.input.d dVar4 = this.f276549d.get();
        com.avito.android.service_booking_common.blueprints.contact.d dVar5 = this.f276550e.get();
        com.avito.android.service_booking_common.blueprints.comment.d dVar6 = this.f276551f.get();
        com.avito.android.service_booking_common.blueprints.specialist.c cVar = this.f276552g.get();
        com.avito.android.service_booking_common.blueprints.any_specialist.c cVar2 = this.f276553h.get();
        com.avito.android.service_booking_common.blueprints.partner_logo.c cVar3 = this.f276554i.get();
        com.avito.android.service_booking_common.blueprints.geo_reference.c cVar4 = this.f276555j.get();
        t.f276532a.getClass();
        Set setL0 = C42756l.l0(new TV0.d[]{dVar, dVar2, dVar3, dVar4, dVar5, dVar6, cVar, cVar2, cVar3, cVar4});
        dagger.internal.t.d(setL0);
        return setL0;
    }
}
