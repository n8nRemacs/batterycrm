package leakcanary;

import android.app.Application;
import android.content.SharedPreferences;
import java.util.concurrent.TimeUnit;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import leakcanary.internal.RealHeapAnalysisJob;
import leakcanary.r;

/* compiled from: OncePerPeriodInterceptor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lleakcanary/B;", "Lleakcanary/q;", "a", "leakcanary-android-release_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class B implements InterfaceC43759q {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC42726C f413977a;

    /* renamed from: b, reason: collision with root package name */
    public final long f413978b;

    /* compiled from: OncePerPeriodInterceptor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lleakcanary/B$a;", "", "<init>", "()V", "", "LAST_START_TIMESTAMP_KEY", "Ljava/lang/String;", "leakcanary-android-release_release"}, k = 1, mv = {1, 4, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }
    }

    static {
        new a(null);
    }

    public B(Application application, long j12, int i12, C42822w c42822w) {
        this.f413978b = (i12 & 2) != 0 ? TimeUnit.DAYS.toMillis(1L) : j12;
        this.f413977a = C42727D.c(new C(application));
    }

    @Override // leakcanary.InterfaceC43759q
    @Y61.k
    public final r.a a(@Y61.k RealHeapAnalysisJob realHeapAnalysisJob) {
        InterfaceC42726C interfaceC42726C = this.f413977a;
        long j12 = ((SharedPreferences) interfaceC42726C.getValue()).getLong("last_start_timestamp", 0L);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j13 = jCurrentTimeMillis - j12;
        long j14 = this.f413978b;
        if (j13 < j14) {
            StringBuilder sbQ = androidx.compose.foundation.H.q(j13, "not enough time elapsed since last analysis: elapsed ", " ms < period ");
            sbQ.append(j14);
            sbQ.append(" ms");
            realHeapAnalysisJob.b(sbQ.toString());
        }
        r.a aVarE = realHeapAnalysisJob.e();
        if (aVarE instanceof r.a.b) {
            ((SharedPreferences) interfaceC42726C.getValue()).edit().putLong("last_start_timestamp", jCurrentTimeMillis).apply();
        }
        return aVarE;
    }
}
