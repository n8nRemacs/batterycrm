package com.avito.android.important_addresses_selection.presentation.mvi;

import com.avito.android.analytics.screens.ImportantAddressesSelectionScreen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.important_addresses_selection.domain.model.ImportantAddressesSelectionData;
import com.avito.android.important_addresses_selection.presentation.mvi.entity.ImportantAddressesSelectionInternalAction;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ImportantAddressesSelectionFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final d f169888a;

    /* renamed from: b, reason: collision with root package name */
    public final i f169889b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f169890c;

    /* renamed from: d, reason: collision with root package name */
    public final k f169891d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f169892e;

    public g(d dVar, i iVar, dagger.internal.l lVar, k kVar, Provider provider) {
        this.f169888a = dVar;
        this.f169889b = iVar;
        this.f169890c = lVar;
        this.f169891d = kVar;
        this.f169892e = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        b bVar = (b) this.f169888a.get();
        this.f169889b.getClass();
        h hVar = new h();
        ImportantAddressesSelectionData importantAddressesSelectionData = (ImportantAddressesSelectionData) this.f169890c.f393949a;
        j jVar = (j) this.f169891d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f169892e.get();
        ImportantAddressesSelectionInternalAction.InitState initState = new ImportantAddressesSelectionInternalAction.InitState(importantAddressesSelectionData);
        SM.c.f14928d.getClass();
        return new f(ImportantAddressesSelectionScreen.f90378d.f90471b, jVar.a(initState, SM.c.f14929e), new e(bVar, screenPerformanceTracker, jVar, hVar));
    }
}
