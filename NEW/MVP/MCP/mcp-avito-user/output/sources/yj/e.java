package YJ;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.iac_calls_history.impl_module.screen.di.CallsHistoryScreenActivityPerformanceTrackerScreen;
import dagger.internal.h;
import dagger.internal.l;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CallsHistoryScreenActivityModule_ProvideScreenTrackerFactoryFactory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LYJ/e;", "Ldagger/internal/h;", "Lcom/avito/android/analytics/screens/tracker/ScreenPerformanceTracker;", "a", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e implements h<ScreenPerformanceTracker> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f19436c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<InterfaceC28481c> f19437a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l f19438b;

    /* compiled from: CallsHistoryScreenActivityModule_ProvideScreenTrackerFactoryFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LYJ/e$a;", "", "<init>", "()V", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public e(@k l lVar, @k Provider provider) {
        this.f19437a = provider;
        this.f19438b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = this.f19437a.get();
        r rVar = (r) this.f19438b.f393949a;
        f19436c.getClass();
        int i12 = b.f19433a;
        return interfaceC28481c.a(new C28478k(CallsHistoryScreenActivityPerformanceTrackerScreen.f164780d, rVar, null, 4, null));
    }
}
