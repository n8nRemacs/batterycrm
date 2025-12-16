package Lw0;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SimilarAdvertsListScreenPerformanceTrackerImpl_Factory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f10281a;

    public d(u uVar) {
        this.f10281a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((ScreenPerformanceTracker) this.f10281a.get());
    }
}
