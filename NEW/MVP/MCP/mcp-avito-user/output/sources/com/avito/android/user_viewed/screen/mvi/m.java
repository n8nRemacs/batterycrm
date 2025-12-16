package com.avito.android.user_viewed.screen.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.user_viewed.screen.mvi.entity.UserViewedState;
import dagger.internal.y;

/* compiled from: UserViewedFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final j f318448a;

    /* renamed from: b, reason: collision with root package name */
    public final f f318449b;

    /* renamed from: c, reason: collision with root package name */
    public final o f318450c;

    /* renamed from: d, reason: collision with root package name */
    public final x f318451d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.user_viewed.di.module.internal.h f318452e;

    public m(j jVar, f fVar, o oVar, x xVar, com.avito.android.user_viewed.di.module.internal.h hVar) {
        this.f318448a = jVar;
        this.f318449b = fVar;
        this.f318450c = oVar;
        this.f318451d = xVar;
        this.f318452e = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        i iVar = (i) this.f318448a.get();
        e eVar = (e) this.f318449b.get();
        this.f318450c.getClass();
        n nVar = new n();
        this.f318451d.getClass();
        w wVar = new w();
        return new l("UserViewed", UserViewedState.Loading.f318425b, new k(iVar, eVar, (ScreenPerformanceTracker) this.f318452e.get(), wVar, nVar));
    }
}
