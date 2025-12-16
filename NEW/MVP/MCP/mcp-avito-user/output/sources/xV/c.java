package XV;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: LicenseModule_ProvideScreenPerformanceTrackerFactory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class c implements h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f18898a;

    /* renamed from: b, reason: collision with root package name */
    public final l f18899b;

    public c(l lVar, Provider provider) {
        this.f18898a = provider;
        this.f18899b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = this.f18898a.get();
        C28478k c28478k = (C28478k) this.f18899b.f393949a;
        b.f18897a.getClass();
        return interfaceC28481c.a(c28478k);
    }
}
