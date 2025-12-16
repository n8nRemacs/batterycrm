package ho;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UnsafeNetworkPerformanceTrackerModule_ProvideScreenTrackerFactoryFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f397409a;

    /* renamed from: b, reason: collision with root package name */
    public final l f397410b;

    public f(l lVar, Provider provider) {
        this.f397409a = provider;
        this.f397410b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = this.f397409a.get();
        C28478k c28478k = (C28478k) this.f397410b.f393949a;
        e.f397408a.getClass();
        return interfaceC28481c.a(c28478k);
    }
}
