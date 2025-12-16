package com.avito.android.photo_list_view_group_selection.mvi;

import com.avito.android.analytics.screens.PhotoItemGroupSelectionScreen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.photo_list_view_group_selection.PhotoItemGroupSelectionParams;
import com.avito.android.photo_list_view_group_selection.mvi.entity.PhotoItemGroupSelectionInternalAction;
import dagger.internal.x;
import dagger.internal.y;
import e80.C39966c;
import javax.inject.Provider;

/* compiled from: PhotoItemGroupSelectionFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final c f218458a;

    /* renamed from: b, reason: collision with root package name */
    public final h f218459b;

    /* renamed from: c, reason: collision with root package name */
    public final k f218460c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f218461d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f218462e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f218463f;

    public f(c cVar, h hVar, k kVar, Provider provider, dagger.internal.l lVar, dagger.internal.l lVar2) {
        this.f218458a = cVar;
        this.f218459b = hVar;
        this.f218460c = kVar;
        this.f218461d = provider;
        this.f218462e = lVar;
        this.f218463f = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        b bVar = (b) this.f218458a.get();
        this.f218459b.getClass();
        g gVar = new g();
        this.f218460c.getClass();
        i iVar = new i();
        ScreenPerformanceTracker screenPerformanceTracker = this.f218461d.get();
        String str = (String) this.f218462e.f393949a;
        PhotoItemGroupSelectionParams photoItemGroupSelectionParams = (PhotoItemGroupSelectionParams) this.f218463f.f393949a;
        PhotoItemGroupSelectionInternalAction.InitState initState = new PhotoItemGroupSelectionInternalAction.InitState(str, photoItemGroupSelectionParams.f218376c, photoItemGroupSelectionParams.f218377d);
        C39966c.f394982f.getClass();
        return new e(PhotoItemGroupSelectionScreen.f90450d.f90471b, i.c(initState, C39966c.f394983g), new d(bVar, screenPerformanceTracker, iVar, gVar));
    }
}
