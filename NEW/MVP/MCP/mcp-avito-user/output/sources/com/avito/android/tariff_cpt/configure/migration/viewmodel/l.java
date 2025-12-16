package com.avito.android.tariff_cpt.configure.migration.viewmodel;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.tariff_cpt.configure.migration.viewmodel.h;

/* compiled from: CptMigrationViewModel_Factory_Impl.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class l implements h.a {

    /* renamed from: a, reason: collision with root package name */
    public final k f298105a;

    public l(k kVar) {
        this.f298105a = kVar;
    }

    @Override // com.avito.android.tariff_cpt.configure.migration.viewmodel.h.a
    public final h a(String str) {
        k kVar = this.f298105a;
        return new h(str, kVar.f298100a.get(), kVar.f298101b.get(), kVar.f298102c.get(), kVar.f298103d.get(), (ScreenPerformanceTracker) kVar.f298104e.get());
    }
}
