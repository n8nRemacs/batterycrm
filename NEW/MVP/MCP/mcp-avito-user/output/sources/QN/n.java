package qN;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.GoodsImvSimilarAdvertsScreen;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ImvSimilarAdvertsTrackerModule_ProvideScreenTrackerFactoryFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LqN/n;", "Ldagger/internal/h;", "Lcom/avito/android/analytics/screens/tracker/ScreenPerformanceTracker;", "a", "_avito_imv-similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class n implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f429261c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC28481c> f429262a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.l f429263b;

    /* compiled from: ImvSimilarAdvertsTrackerModule_ProvideScreenTrackerFactoryFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LqN/n$a;", "", "<init>", "()V", "_avito_imv-similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public n(@Y61.k dagger.internal.l lVar, @Y61.k Provider provider) {
        this.f429262a = provider;
        this.f429263b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = this.f429262a.get();
        r rVar = (r) this.f429263b.f393949a;
        f429261c.getClass();
        m.f429260a.getClass();
        return interfaceC28481c.a(new C28478k(GoodsImvSimilarAdvertsScreen.f90366d, rVar, "goodsIMVSimilarItems"));
    }
}
