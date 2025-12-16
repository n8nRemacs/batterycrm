package is0;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SerpTrackerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: is0.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C42105g implements dagger.internal.h<C42104f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f405335a;

    public C42105g(Provider<ScreenPerformanceTracker> provider) {
        this.f405335a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C42104f(this.f405335a.get());
    }
}
