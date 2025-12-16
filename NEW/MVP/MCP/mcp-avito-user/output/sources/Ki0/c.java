package kI0;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MyAdvertDetailsTrackerImpl_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class c implements h<C42586b> {

    /* renamed from: a, reason: collision with root package name */
    public final l f406226a;

    public c(l lVar) {
        this.f406226a = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C42586b((ScreenPerformanceTracker) this.f406226a.f393949a);
    }
}
