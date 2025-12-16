package com.avito.android.analytics.screens;

import android.app.Application;
import com.avito.android.analytics.InterfaceC28373a;

/* compiled from: ScreensDistributionTracker_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class z implements dagger.internal.h<y> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f91019a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f91020b;

    public z(dagger.internal.f fVar, dagger.internal.l lVar) {
        this.f91019a = lVar;
        this.f91020b = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new y((Application) this.f91019a.f393949a, (InterfaceC28373a) this.f91020b.get());
    }
}
