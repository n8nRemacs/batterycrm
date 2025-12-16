package t3;

import com.avito.android.ab_tests.configs.QuicApiRequestsTestGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PerfomanceAbTestsModule_ProvideQuicApiRequestsABFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lt3/Z;", "Ldagger/internal/h;", "Lcom/avito/android/ab_tests/Q;", "a", "_avito-discouraged_avito-feature_performance"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class Z implements dagger.internal.h<com.avito.android.ab_tests.Q> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f439076b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f439077a;

    /* compiled from: PerfomanceAbTestsModule_ProvideQuicApiRequestsABFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lt3/Z$a;", "", "<init>", "()V", "_avito-discouraged_avito-feature_performance"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public Z(@Y61.k dagger.internal.u uVar) {
        this.f439077a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        QuicApiRequestsTestGroup quicApiRequestsTestGroup = (QuicApiRequestsTestGroup) this.f439077a.get();
        f439076b.getClass();
        Q.f439061a.getClass();
        return quicApiRequestsTestGroup;
    }
}
