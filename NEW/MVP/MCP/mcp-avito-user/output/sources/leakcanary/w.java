package leakcanary;

import android.annotation.SuppressLint;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import leakcanary.D;
import leakcanary.internal.RealHeapAnalysisJob;
import leakcanary.r;

/* compiled from: MinimumElapsedSinceStartInterceptor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lleakcanary/w;", "Lleakcanary/q;", "leakcanary-android-release_release"}, k = 1, mv = {1, 4, 1})
@SuppressLint({"NewApi"})
/* loaded from: classes8.dex */
public final class w implements InterfaceC43759q {

    /* renamed from: a, reason: collision with root package name */
    public final long f414125a;

    /* renamed from: b, reason: collision with root package name */
    public final D f414126b;

    public w() {
        this(0L, null, 3, null);
    }

    @Override // leakcanary.InterfaceC43759q
    @Y61.k
    public final r.a a(@Y61.k RealHeapAnalysisJob realHeapAnalysisJob) {
        long jC2 = this.f414126b.c();
        long j12 = this.f414125a;
        if (jC2 < j12) {
            realHeapAnalysisJob.b("app started less than " + j12 + " ms ago.");
        }
        return realHeapAnalysisJob.e();
    }

    public w(long j12, D d12, int i12, C42822w c42822w) {
        j12 = (i12 & 1) != 0 ? TimeUnit.SECONDS.toMillis(30L) : j12;
        d12 = (i12 & 2) != 0 ? D.b.f413987e : d12;
        this.f414125a = j12;
        this.f414126b = d12;
    }
}
