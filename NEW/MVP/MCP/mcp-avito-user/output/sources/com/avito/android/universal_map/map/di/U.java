package com.avito.android.universal_map.map.di;

import com.avito.android.universal_map.UniversalMapParams;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: UniversalMapTrackerModule_ProvideScreenNameFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class U implements dagger.internal.h<String> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f305040a;

    public U(dagger.internal.l lVar) {
        this.f305040a = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        UniversalMapParams.TrackerSettings trackerSettings = (UniversalMapParams.TrackerSettings) this.f305040a.f393949a;
        int i12 = S.f305037a;
        if (trackerSettings instanceof UniversalMapParams.TrackerSettings.TrackByHost) {
            return ((UniversalMapParams.TrackerSettings.TrackByHost) trackerSettings).f304756b;
        }
        if (trackerSettings instanceof UniversalMapParams.TrackerSettings.TrackByUniversalMap) {
            return ((UniversalMapParams.TrackerSettings.TrackByUniversalMap) trackerSettings).f304757b;
        }
        throw new NoWhenBranchMatchedException();
    }
}
