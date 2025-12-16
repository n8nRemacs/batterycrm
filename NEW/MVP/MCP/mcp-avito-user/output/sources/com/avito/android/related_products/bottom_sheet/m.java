package com.avito.android.related_products.bottom_sheet;

import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import javax.inject.Provider;

/* compiled from: RelatedProductsBottomSheetTrackerImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f252910a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.analytics.screens.w> f252911b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f252912c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f252913d;

    public m(dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.l lVar3, Provider provider) {
        this.f252910a = lVar;
        this.f252911b = provider;
        this.f252912c = lVar2;
        this.f252913d = lVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new l((ScreenPerformanceTracker) this.f252910a.f393949a, this.f252911b.get(), (Screen) this.f252912c.f393949a, (com.avito.android.analytics.screens.r) this.f252913d.f393949a);
    }
}
