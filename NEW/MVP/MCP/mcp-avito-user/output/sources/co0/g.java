package Co0;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SavedSearchSettingsModule_ProvideScreenPerformanceTrackerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class g implements h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f2685a;

    /* renamed from: b, reason: collision with root package name */
    public final l f2686b;

    public g(l lVar, Provider provider) {
        this.f2685a = provider;
        this.f2686b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = this.f2685a.get();
        C28478k c28478k = (C28478k) this.f2686b.f393949a;
        c.f2679a.getClass();
        return interfaceC28481c.a(c28478k);
    }
}
