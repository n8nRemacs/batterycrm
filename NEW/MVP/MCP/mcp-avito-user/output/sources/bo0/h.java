package Bo0;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SavedSearchMainModule_ProvideScreenPerformanceTrackerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f1710a;

    /* renamed from: b, reason: collision with root package name */
    public final l f1711b;

    public h(l lVar, Provider provider) {
        this.f1710a = provider;
        this.f1711b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = this.f1710a.get();
        C28478k c28478k = (C28478k) this.f1711b.f393949a;
        c.f1696a.getClass();
        return interfaceC28481c.a(c28478k);
    }
}
