package rx0;

import Y61.k;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.SparePartsDetailedInfoScreen;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.h;
import dagger.internal.l;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SparePartsBottomSheetTrackerModule_ProvideScreenTrackerFactoryFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lrx0/g;", "Ldagger/internal/h;", "Lcom/avito/android/analytics/screens/tracker/ScreenPerformanceTracker;", "a", "_avito_spare-parts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rx0.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C47938g implements h<ScreenPerformanceTracker> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f437264c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<InterfaceC28481c> f437265a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l f437266b;

    /* compiled from: SparePartsBottomSheetTrackerModule_ProvideScreenTrackerFactoryFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrx0/g$a;", "", "<init>", "()V", "_avito_spare-parts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rx0.g$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C47938g(@k l lVar, @k Provider provider) {
        this.f437265a = provider;
        this.f437266b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = this.f437265a.get();
        r rVar = (r) this.f437266b.f393949a;
        f437264c.getClass();
        C47937f.f437263a.getClass();
        return interfaceC28481c.a(new C28478k(SparePartsDetailedInfoScreen.f90499d, rVar, "sparePartsDetailedInfo"));
    }
}
