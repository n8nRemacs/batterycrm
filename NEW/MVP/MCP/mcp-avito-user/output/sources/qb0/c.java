package QB0;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TariffPerformanceAnalyticsModule_ProvideScreenPerformanceTracker$_avito_tariff_implFactory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class c implements h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f13593a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Screen> f13594b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<r> f13595c;

    /* renamed from: d, reason: collision with root package name */
    public final l f13596d;

    public c(l lVar, Provider provider, Provider provider2, Provider provider3) {
        this.f13593a = provider;
        this.f13594b = provider2;
        this.f13595c = provider3;
        this.f13596d = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = this.f13593a.get();
        Screen screen = this.f13594b.get();
        r rVar = this.f13595c.get();
        String str = (String) this.f13596d.f393949a;
        b.f13592a.getClass();
        return interfaceC28481c.a(new C28478k(screen, rVar, str));
    }
}
