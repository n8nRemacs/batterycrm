package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;

/* compiled from: Supervisor.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class t1 {
    @Y61.k
    public static final C a(@Y61.l N0 n02) {
        return new s1(n02);
    }

    public static C b() {
        return new s1(null);
    }

    @Y61.l
    public static final Object c(@Y61.k Y41.p pVar, @Y61.k ContinuationImpl continuationImpl) {
        r1 r1Var = new r1(continuationImpl, continuationImpl.getF401105b());
        Object objA = F51.b.a(r1Var, r1Var, pVar);
        if (objA == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuationImpl);
        }
        return objA;
    }
}
