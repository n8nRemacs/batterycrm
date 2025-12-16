package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.collections.C42754k;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlinx.coroutines.internal.C43242l;

/* compiled from: Yield.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class J1 {
    @Y61.l
    public static final Object a(@Y61.k ContinuationImpl continuationImpl) {
        Object coroutine_suspended;
        CoroutineContext coroutineContext = continuationImpl.getF411447c();
        Q0.e(coroutineContext);
        Continuation continuationIntercepted = IntrinsicsKt.intercepted(continuationImpl);
        C43242l c43242l = continuationIntercepted instanceof C43242l ? (C43242l) continuationIntercepted : null;
        if (c43242l == null) {
            coroutine_suspended = kotlin.G0.f406611a;
        } else {
            M m12 = c43242l.f411914e;
            if (m12.p(coroutineContext)) {
                c43242l.f411916g = kotlin.G0.f406611a;
                c43242l.f411859d = 1;
                m12.j(coroutineContext, c43242l);
            } else {
                I1 i12 = new I1();
                CoroutineContext coroutineContextPlus = coroutineContext.plus(i12);
                kotlin.G0 g02 = kotlin.G0.f406611a;
                c43242l.f411916g = g02;
                c43242l.f411859d = 1;
                m12.j(coroutineContextPlus, c43242l);
                if (i12.f410701b) {
                    w1.f412301a.getClass();
                    AbstractC43300s0 abstractC43300s0A = w1.a();
                    C42754k<AbstractC43229i0<?>> c42754k = abstractC43300s0A.f412139e;
                    if (c42754k != null ? c42754k.isEmpty() : true) {
                        coroutine_suspended = kotlin.G0.f406611a;
                    } else if (abstractC43300s0A.G()) {
                        c43242l.f411916g = g02;
                        c43242l.f411859d = 1;
                        abstractC43300s0A.B(c43242l);
                        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    } else {
                        abstractC43300s0A.D(true);
                        try {
                            c43242l.run();
                            do {
                            } while (abstractC43300s0A.I());
                        } finally {
                            try {
                            } finally {
                            }
                        }
                        coroutine_suspended = kotlin.G0.f406611a;
                    }
                }
            }
            coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        }
        if (coroutine_suspended == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuationImpl);
        }
        return coroutine_suspended == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutine_suspended : kotlin.G0.f406611a;
    }
}
