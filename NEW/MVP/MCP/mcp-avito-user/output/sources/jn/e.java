package Jn;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.compose.a;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.h;
import dagger.internal.u;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CategoriesModule_ProvideComposeTrackerFactory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LJn/e;", "Ldagger/internal/h;", "Lcom/avito/android/analytics/screens/compose/a;", "a", "_avito-global_categories-global_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e implements h<com.avito.android.analytics.screens.compose.a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f9134b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final u f9135a;

    /* compiled from: CategoriesModule_ProvideComposeTrackerFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJn/e$a;", "", "<init>", "()V", "_avito-global_categories-global_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public e(@k u uVar) {
        this.f9135a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        ScreenPerformanceTracker screenPerformanceTracker = (ScreenPerformanceTracker) this.f9135a.get();
        f9134b.getClass();
        int i12 = d.f9133a;
        com.avito.android.analytics.screens.compose.a.f90568a.getClass();
        return a.C2677a.a(screenPerformanceTracker);
    }
}
