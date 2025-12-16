package com.avito.android.extended_profile_selection_create.select.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.extended_profile_selection_create.ExtendedProfileSelectionCreateConfig;
import com.avito.android.extended_profile_selection_create.select.mvi.entity.ExtendedProfileSelectionCreateState;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SerpDisplayType;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ExtendedProfileSelectionCreateFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final i f152395a;

    /* renamed from: b, reason: collision with root package name */
    public final g f152396b;

    /* renamed from: c, reason: collision with root package name */
    public final n f152397c;

    /* renamed from: d, reason: collision with root package name */
    public final p f152398d;

    /* renamed from: e, reason: collision with root package name */
    public final u f152399e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f152400f;

    public l(i iVar, g gVar, n nVar, p pVar, u uVar, dagger.internal.l lVar) {
        this.f152395a = iVar;
        this.f152396b = gVar;
        this.f152397c = nVar;
        this.f152398d = pVar;
        this.f152399e = uVar;
        this.f152400f = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        h hVar = (h) this.f152395a.get();
        f fVar = (f) this.f152396b.get();
        m mVar = (m) this.f152397c.get();
        o oVar = (o) this.f152398d.get();
        ScreenPerformanceTracker screenPerformanceTracker = (ScreenPerformanceTracker) this.f152399e.get();
        ExtendedProfileSelectionCreateConfig extendedProfileSelectionCreateConfig = (ExtendedProfileSelectionCreateConfig) this.f152400f.f393949a;
        return new k("ExtendedProfileSelectionCreate", new ExtendedProfileSelectionCreateState(null, 0, new SearchParams(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, extendedProfileSelectionCreateConfig.f151611b, null, SerpDisplayType.Grid, null, null, null, null, null, null, -83886081, 1, null), 0, 0, null, false, false, false, 0, null, extendedProfileSelectionCreateConfig.f151619j, extendedProfileSelectionCreateConfig.f151618i, null, null, false, null, null, false, null, false, false, null, false, 16771067, null), new j(hVar, fVar, screenPerformanceTracker, oVar, mVar));
    }
}
