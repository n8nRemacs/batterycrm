package xG0;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TransactionPerformanceModule_ProvideScreenTrackerFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: xG0.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C49835d implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final C49834c f442311a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f442312b;

    /* renamed from: c, reason: collision with root package name */
    public final l f442313c;

    public C49835d(C49834c c49834c, Provider provider, l lVar) {
        this.f442311a = c49834c;
        this.f442312b = provider;
        this.f442313c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = this.f442312b.get();
        C28478k c28478k = (C28478k) this.f442313c.f393949a;
        this.f442311a.getClass();
        return interfaceC28481c.a(c28478k);
    }
}
