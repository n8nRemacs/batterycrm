package com.avito.android.category.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.category.CategoryArguments;
import com.avito.android.category.mvi.entity.CategoryState;
import com.avito.android.category.mvi.entity.OverlayState;
import com.avito.android.remote.model.CaseText;
import com.avito.android.remote.model.Location;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import kotlin.collections.C42784z0;

/* compiled from: CategoryFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class m implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final i f116713a;

    /* renamed from: b, reason: collision with root package name */
    public final g f116714b;

    /* renamed from: c, reason: collision with root package name */
    public final p f116715c;

    /* renamed from: d, reason: collision with root package name */
    public final s f116716d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f116717e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f116718f;

    public m(i iVar, g gVar, p pVar, s sVar, Provider provider, dagger.internal.l lVar) {
        this.f116713a = iVar;
        this.f116714b = gVar;
        this.f116715c = pVar;
        this.f116716d = sVar;
        this.f116717e = provider;
        this.f116718f = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        h hVar = (h) this.f116713a.get();
        f fVar = (f) this.f116714b.get();
        this.f116715c.getClass();
        n nVar = new n();
        this.f116716d.getClass();
        q qVar = new q();
        ScreenPerformanceTracker screenPerformanceTracker = this.f116717e.get();
        CategoryArguments categoryArguments = (CategoryArguments) this.f116718f.f393949a;
        CategoryState.f116676g.getClass();
        return new k("Category", new CategoryState(OverlayState.f116682b, C42784z0.f406748b, new Location("", new CaseText(), false, false, false, false, null, null, false, null, null, null, 4092, null), null, categoryArguments), new j(hVar, fVar, screenPerformanceTracker, qVar, nVar));
    }
}
