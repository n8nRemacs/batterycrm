package leakcanary.internal;

import Y61.k;
import kotlin.Metadata;
import leakcanary.internal.RealHeapAnalysisJob;
import leakcanary.u;
import shark.OnAnalysisProgressListener;
import shark.j3;

/* compiled from: RealHeapAnalysisJob.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lshark/OnAnalysisProgressListener$Step;", "step", "Lkotlin/G0;", "onAnalysisProgress", "(Lshark/OnAnalysisProgressListener$Step;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes8.dex */
final class g implements OnAnalysisProgressListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RealHeapAnalysisJob f414094a;

    public g(RealHeapAnalysisJob realHeapAnalysisJob) {
        this.f414094a = realHeapAnalysisJob;
    }

    @Override // shark.OnAnalysisProgressListener
    public final void a(@k OnAnalysisProgressListener.Step step) throws RealHeapAnalysisJob.StopAnalysis {
        RealHeapAnalysisJob realHeapAnalysisJob = this.f414094a;
        realHeapAnalysisJob.f414065f = step;
        String strName = step.name();
        if (realHeapAnalysisJob.f414061b.get() != null) {
            throw new RealHeapAnalysisJob.StopAnalysis(strName);
        }
        j3.f438639b.getClass();
        u uVar = j3.f438638a;
        if (uVar != null) {
            uVar.a("Analysis in progress, working on: " + step.name());
        }
    }
}
