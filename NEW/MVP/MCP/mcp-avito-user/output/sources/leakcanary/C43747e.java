package leakcanary;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.m0;
import leakcanary.internal.RealHeapAnalysisJob;

/* compiled from: BackgroundTrigger.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "appInBackgroundNow", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* renamed from: leakcanary.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43747e extends kotlin.jvm.internal.N implements Y41.l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C43748f f414053l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43747e(C43748f c43748f) {
        super(1);
        this.f414053l = c43748f;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        if (!bool.booleanValue()) {
            RealHeapAnalysisJob realHeapAnalysisJob = this.f414053l.f414054a;
            if (realHeapAnalysisJob != null) {
                realHeapAnalysisJob.b("app left background");
            }
            this.f414053l.f414054a = null;
        } else {
            if (this.f414053l.f414054a != null) {
                throw new IllegalStateException("Current job set to null when leaving background");
            }
            C43756n c43756n = this.f414053l.f414057d;
            new C43761t((kotlin.reflect.d<?>) m0.f406844a.b(C43748f.class));
            c43756n.getClass();
            RealHeapAnalysisJob realHeapAnalysisJob2 = new RealHeapAnalysisJob(c43756n.f414106a, c43756n.f414107b, c43756n.f414108c);
            this.f414053l.f414054a = realHeapAnalysisJob2;
            this.f414053l.f414058e.execute(new RunnableC43746d(this, realHeapAnalysisJob2));
        }
        return G0.f406611a;
    }
}
