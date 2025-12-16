package nb;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdvertStatsTrackerImpl_Factory.java */
@e
@y
@x
/* renamed from: nb.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C44370c implements h<C44369b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f415190a;

    public C44370c(u uVar) {
        this.f415190a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C44369b((ScreenPerformanceTracker) this.f415190a.get());
    }
}
