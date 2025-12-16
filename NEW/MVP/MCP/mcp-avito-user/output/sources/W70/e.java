package W70;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: GalleryTrackerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f17754a;

    public e(u uVar) {
        this.f17754a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((ScreenPerformanceTracker) this.f17754a.get());
    }
}
