package xu;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.DealConfirmationScreen;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DealConfirmationTrackerModule_ProvideScreenTrackerFactory$_avito_deal_confirmation_implFactory.java */
@e
@y
@x
/* renamed from: xu.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C50000c implements h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f442688a;

    /* renamed from: b, reason: collision with root package name */
    public final l f442689b;

    public C50000c(l lVar, Provider provider) {
        this.f442688a = provider;
        this.f442689b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = this.f442688a.get();
        r rVar = (r) this.f442689b.f393949a;
        int i12 = C49999b.f442687a;
        return interfaceC28481c.a(new C28478k(DealConfirmationScreen.f90336d, rVar, "deal-confirmation"));
    }
}
