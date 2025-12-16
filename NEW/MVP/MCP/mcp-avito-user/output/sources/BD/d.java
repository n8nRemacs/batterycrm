package bD;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FavoritesTrackerImpl_Factory.java */
@e
@y
@x
/* loaded from: classes13.dex */
public final class d implements h<C25498c> {

    /* renamed from: a, reason: collision with root package name */
    public final l f57007a;

    public d(l lVar) {
        this.f57007a = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C25498c((ScreenPerformanceTracker) this.f57007a.f393949a);
    }
}
