package vL0;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VasPerformanceAnalyticsModule_ProvidesScreenTrackerFactory$_avito_vas_performance_implFactory.java */
@e
@y
@x
/* loaded from: classes5.dex */
public final class d implements h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final u f440698a;

    /* renamed from: b, reason: collision with root package name */
    public final l f440699b;

    /* renamed from: c, reason: collision with root package name */
    public final l f440700c;

    /* renamed from: d, reason: collision with root package name */
    public final l f440701d;

    public d(l lVar, l lVar2, l lVar3, u uVar) {
        this.f440698a = uVar;
        this.f440699b = lVar;
        this.f440700c = lVar2;
        this.f440701d = lVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) this.f440698a.get();
        Screen screen = (Screen) this.f440699b.f393949a;
        r rVar = (r) this.f440700c.f393949a;
        String str = (String) this.f440701d.f393949a;
        int i12 = c.f440697a;
        return interfaceC28481c.a(new C28478k(screen, rVar, str));
    }
}
