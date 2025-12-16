package ZX;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MapTrackerImpl_Factory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final l f20200a;

    public d(l lVar) {
        this.f20200a = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((ScreenPerformanceTracker) this.f20200a.f393949a);
    }
}
