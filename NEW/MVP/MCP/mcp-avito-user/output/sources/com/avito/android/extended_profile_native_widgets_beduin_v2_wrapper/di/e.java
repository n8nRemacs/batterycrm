package com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.di;

import androidx.recyclerview.widget.C23424o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.i;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ExtendedProfileBeduinViewComponentsModule_ExtendedProfileLazyColumnComponentFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class e implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final l f151345a;

    /* renamed from: b, reason: collision with root package name */
    public final l f151346b;

    /* renamed from: c, reason: collision with root package name */
    public final l f151347c;

    /* renamed from: d, reason: collision with root package name */
    public final l f151348d;

    /* renamed from: e, reason: collision with root package name */
    public final l f151349e;

    public e(l lVar, l lVar2, l lVar3, l lVar4, l lVar5) {
        this.f151345a = lVar;
        this.f151346b = lVar2;
        this.f151347c = lVar3;
        this.f151348d = lVar4;
        this.f151349e = lVar5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Y41.a aVar = (Y41.a) this.f151345a.f393949a;
        com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.f fVar = (com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.f) this.f151346b.f393949a;
        C23424o.f fVar2 = (C23424o.f) this.f151347c.f393949a;
        Y41.a aVar2 = (Y41.a) this.f151348d.f393949a;
        ScreenPerformanceTracker screenPerformanceTracker = (ScreenPerformanceTracker) this.f151349e.f393949a;
        d.f151344a.getClass();
        return new i(aVar, fVar, fVar2, aVar2, screenPerformanceTracker);
    }
}
