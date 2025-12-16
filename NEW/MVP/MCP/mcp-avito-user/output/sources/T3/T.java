package t3;

import com.avito.android.ab_tests.configs.DegradeScrollTestGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PerfomanceAbTestsModule_ProvideDegradeScrollFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lt3/T;", "Ldagger/internal/h;", "Lcom/avito/android/ab_tests/configs/DegradeScrollTestGroup;", "a", "_avito-discouraged_avito-feature_performance"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class T implements dagger.internal.h<DegradeScrollTestGroup> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f439064b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.ab_tests.M f439065a;

    /* compiled from: PerfomanceAbTestsModule_ProvideDegradeScrollFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lt3/T$a;", "", "<init>", "()V", "_avito-discouraged_avito-feature_performance"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public T(@Y61.k com.avito.android.ab_tests.M m12) {
        this.f439065a = m12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.ab_tests.K k12 = (com.avito.android.ab_tests.K) this.f439065a.get();
        f439064b.getClass();
        Q.f439061a.getClass();
        DegradeScrollTestGroup degradeScrollTestGroupA = k12.a().a();
        dagger.internal.t.b(degradeScrollTestGroupA, "Cannot return null from a non-@Nullable @Provides method");
        return degradeScrollTestGroupA;
    }
}
