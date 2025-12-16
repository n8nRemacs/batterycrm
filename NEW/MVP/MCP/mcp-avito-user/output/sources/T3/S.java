package t3;

import com.avito.android.ab_tests.configs.DegradeApplicationColdStartTestGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PerfomanceAbTestsModule_ProvideDegradeColdStartFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lt3/S;", "Ldagger/internal/h;", "Lcom/avito/android/ab_tests/configs/DegradeApplicationColdStartTestGroup;", "a", "_avito-discouraged_avito-feature_performance"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class S implements dagger.internal.h<DegradeApplicationColdStartTestGroup> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f439062b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.ab_tests.M f439063a;

    /* compiled from: PerfomanceAbTestsModule_ProvideDegradeColdStartFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lt3/S$a;", "", "<init>", "()V", "_avito-discouraged_avito-feature_performance"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public S(@Y61.k com.avito.android.ab_tests.M m12) {
        this.f439063a = m12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.ab_tests.K k12 = (com.avito.android.ab_tests.K) this.f439063a.get();
        f439062b.getClass();
        Q.f439061a.getClass();
        DegradeApplicationColdStartTestGroup degradeApplicationColdStartTestGroupA = k12.j().a();
        dagger.internal.t.b(degradeApplicationColdStartTestGroupA, "Cannot return null from a non-@Nullable @Provides method");
        return degradeApplicationColdStartTestGroupA;
    }
}
