package com.avito.android.str_booking.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.str_booking.ui.ScreenType;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import lE.C43624b;

/* compiled from: StrBookingActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f285825a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.str_booking.domain.f> f285826b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.str_booking.domain.e f285827c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<C43624b> f285828d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.clientEventBus.a> f285829e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f285830f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.l f285831g;

    /* renamed from: h, reason: collision with root package name */
    public final dagger.internal.l f285832h;

    public h(Provider provider, Provider provider2, com.avito.android.str_booking.domain.e eVar, Provider provider3, Provider provider4, dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.l lVar3) {
        this.f285825a = provider;
        this.f285826b = provider2;
        this.f285827c = eVar;
        this.f285828d = provider3;
        this.f285829e = provider4;
        this.f285830f = lVar;
        this.f285831g = lVar2;
        this.f285832h = lVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f285825a.get(), this.f285826b.get(), (com.avito.android.str_booking.domain.d) this.f285827c.get(), this.f285828d.get(), this.f285829e.get(), (String) this.f285830f.f393949a, (ScreenType) this.f285831g.f393949a, (String) this.f285832h.f393949a);
    }
}
