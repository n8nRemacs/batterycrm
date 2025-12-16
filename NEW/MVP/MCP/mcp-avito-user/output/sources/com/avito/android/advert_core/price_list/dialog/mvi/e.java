package com.avito.android.advert_core.price_list.dialog.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertPriceListBottomSheetDialogFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final b f84086a;

    /* renamed from: b, reason: collision with root package name */
    public final g f84087b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f84088c;

    public e(b bVar, g gVar, Provider provider) {
        this.f84086a = bVar;
        this.f84087b = gVar;
        this.f84088c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a aVar = (a) this.f84086a.get();
        this.f84087b.getClass();
        f fVar = new f();
        ScreenPerformanceTracker screenPerformanceTracker = this.f84088c.get();
        N9.a.f11239c.getClass();
        return new d("AdvertPriceListBottomSheetDialog", N9.a.f11240d, new c(aVar, screenPerformanceTracker, fVar));
    }
}
