package com.avito.android.trx_promo_goods.screens.date_picker.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TrxPromoGoodsDatePickerFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final j f303739a;

    /* renamed from: b, reason: collision with root package name */
    public final h f303740b;

    /* renamed from: c, reason: collision with root package name */
    public final o f303741c;

    /* renamed from: d, reason: collision with root package name */
    public final r f303742d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f303743e;

    public m(j jVar, h hVar, o oVar, r rVar, Provider provider) {
        this.f303739a = jVar;
        this.f303740b = hVar;
        this.f303741c = oVar;
        this.f303742d = rVar;
        this.f303743e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        i iVar = (i) this.f303739a.get();
        f fVar = (f) this.f303740b.get();
        this.f303741c.getClass();
        n nVar = new n();
        p pVar = (p) this.f303742d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f303743e.get();
        OF0.c.f12107k.getClass();
        return new l("TrxPromoGoodsDatePicker", OF0.c.f12108l, new k(iVar, fVar, screenPerformanceTracker, pVar, nVar));
    }
}
