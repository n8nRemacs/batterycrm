package com.avito.android.universal_map.map.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.universal_map.map.tracker.UniversalMapScreen;

/* compiled from: UniversalMapTrackerModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class T implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f305038a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f305039b;

    public T(dagger.internal.l lVar, dagger.internal.u uVar) {
        this.f305038a = lVar;
        this.f305039b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.analytics.screens.r rVar = (com.avito.android.analytics.screens.r) this.f305038a.f393949a;
        String str = (String) this.f305039b.get();
        int i12 = S.f305037a;
        return new C28478k(new UniversalMapScreen(str), rVar, "map-points");
    }
}
