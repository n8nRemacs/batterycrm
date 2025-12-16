package NE;

import Y61.k;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.h;
import dagger.internal.l;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ForceUpdateRootActivityModule_ProvideScreenPerformanceTrackerFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LNE/c;", "Ldagger/internal/h;", "Lcom/avito/android/analytics/screens/tracker/ScreenPerformanceTracker;", "a", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c implements h<ScreenPerformanceTracker> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f11337c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<InterfaceC28481c> f11338a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l f11339b;

    /* compiled from: ForceUpdateRootActivityModule_ProvideScreenPerformanceTrackerFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNE/c$a;", "", "<init>", "()V", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k l lVar, @k Provider provider) {
        this.f11338a = provider;
        this.f11339b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = this.f11338a.get();
        C28478k c28478k = (C28478k) this.f11339b.f393949a;
        f11337c.getClass();
        b.f11336a.getClass();
        return interfaceC28481c.a(c28478k);
    }
}
