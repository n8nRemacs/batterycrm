package xI;

import androidx.fragment.app.Fragment;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: HomeTrackerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class g implements h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final l f442326a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.analytics.screens.tracker.degrade.a> f442327b;

    /* renamed from: c, reason: collision with root package name */
    public final l f442328c;

    public g(l lVar, l lVar2, Provider provider) {
        this.f442326a = lVar;
        this.f442327b = provider;
        this.f442328c = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        ScreenPerformanceTracker screenPerformanceTracker = (ScreenPerformanceTracker) this.f442326a.f393949a;
        this.f442327b.get();
        return new f(screenPerformanceTracker, (Fragment) this.f442328c.f393949a);
    }
}
