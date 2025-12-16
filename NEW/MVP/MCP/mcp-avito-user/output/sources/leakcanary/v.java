package leakcanary;

import android.app.Application;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import leakcanary.D;
import leakcanary.internal.RealHeapAnalysisJob;
import leakcanary.r;

/* compiled from: MinimumDiskSpaceInterceptor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lleakcanary/v;", "Lleakcanary/q;", "leakcanary-android-release_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class v implements InterfaceC43759q {

    /* renamed from: a, reason: collision with root package name */
    public final Application f414122a;

    /* renamed from: b, reason: collision with root package name */
    public final long f414123b;

    /* renamed from: c, reason: collision with root package name */
    public final D f414124c;

    public v(Application application, long j12, D d12, int i12, C42822w c42822w) {
        j12 = (i12 & 2) != 0 ? 200000000L : j12;
        d12 = (i12 & 4) != 0 ? D.b.f413987e : d12;
        this.f414122a = application;
        this.f414123b = j12;
        this.f414124c = d12;
    }

    @Override // leakcanary.InterfaceC43759q
    @Y61.k
    public final r.a a(@Y61.k RealHeapAnalysisJob realHeapAnalysisJob) {
        File filesDir = this.f414122a.getFilesDir();
        if (filesDir == null) {
            kotlin.jvm.internal.L.k();
            throw null;
        }
        long jD2 = this.f414124c.d(filesDir);
        long j12 = this.f414123b;
        if (jD2 < j12) {
            StringBuilder sbQ = androidx.compose.foundation.H.q(jD2, "availableDiskSpace ", " < minimumDiskSpaceBytes ");
            sbQ.append(j12);
            realHeapAnalysisJob.b(sbQ.toString());
        }
        return realHeapAnalysisJob.e();
    }
}
