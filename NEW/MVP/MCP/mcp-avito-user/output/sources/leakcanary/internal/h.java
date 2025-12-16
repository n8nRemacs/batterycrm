package leakcanary.internal;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RealHeapAnalysisJob.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes8.dex */
final class h extends N implements Y41.a<File> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ RealHeapAnalysisJob f414095l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(RealHeapAnalysisJob realHeapAnalysisJob) {
        super(0);
        this.f414095l = realHeapAnalysisJob;
    }

    @Override // Y41.a
    public final File invoke() {
        return this.f414095l.f414066g.invoke();
    }
}
