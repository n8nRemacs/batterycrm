package leakcanary;

import android.app.Application;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import leakcanary.D;
import leakcanary.internal.RealHeapAnalysisJob;
import leakcanary.r;

/* compiled from: MinimumMemoryInterceptor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lleakcanary/x;", "Lleakcanary/q;", "leakcanary-android-release_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class x implements InterfaceC43759q {

    /* renamed from: a, reason: collision with root package name */
    public final Application f414127a;

    /* renamed from: b, reason: collision with root package name */
    public final long f414128b;

    /* renamed from: c, reason: collision with root package name */
    public final D f414129c;

    public x(Application application, long j12, D d12, int i12, C42822w c42822w) {
        j12 = (i12 & 2) != 0 ? 100000000L : j12;
        d12 = (i12 & 4) != 0 ? D.b.f413987e : d12;
        this.f414127a = application;
        this.f414128b = j12;
        this.f414129c = d12;
    }

    @Override // leakcanary.InterfaceC43759q
    @Y61.k
    public final r.a a(@Y61.k RealHeapAnalysisJob realHeapAnalysisJob) {
        D.a aVarA = this.f414129c.a(this.f414127a);
        if (kotlin.jvm.internal.L.f(aVarA, D.a.b.f413981a)) {
            realHeapAnalysisJob.b("low ram device");
        } else if (kotlin.jvm.internal.L.f(aVarA, D.a.C11793a.f413980a)) {
            realHeapAnalysisJob.b("low memory");
        } else if (aVarA instanceof D.a.c) {
            D.a.c cVar = (D.a.c) aVarA;
            long j12 = cVar.f413982a;
            long j13 = this.f414128b;
            if (j12 < j13) {
                realHeapAnalysisJob.b("not enough free memory: available " + cVar.f413982a + " < min " + j13);
            }
        }
        return realHeapAnalysisJob.e();
    }
}
