package leakcanary;

import kotlin.Metadata;
import leakcanary.internal.RealHeapAnalysisJob;
import leakcanary.r;

/* compiled from: BackgroundTrigger.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* renamed from: leakcanary.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class RunnableC43746d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C43747e f414051b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RealHeapAnalysisJob f414052c;

    public RunnableC43746d(C43747e c43747e, RealHeapAnalysisJob realHeapAnalysisJob) {
        this.f414051b = c43747e;
        this.f414052c = realHeapAnalysisJob;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r.a aVarD = this.f414052c.d();
        this.f414051b.f414053l.f414054a = null;
        this.f414051b.f414053l.f414059f.invoke(aVarD);
    }
}
