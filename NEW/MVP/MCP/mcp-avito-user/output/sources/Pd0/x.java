package Pd0;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import javax.inject.Provider;

/* compiled from: PublishDetailsTrackerImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class x implements dagger.internal.h<w> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f13184a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f13185b;

    public x(dagger.internal.u uVar, Provider provider) {
        this.f13184a = provider;
        this.f13185b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new w((com.avito.android.analytics.screens.w) this.f13185b.get(), this.f13184a.get());
    }
}
