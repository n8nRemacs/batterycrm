package kotlinx.coroutines.flow;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlinx.coroutines.flow.internal.AbstractC43163a;
import kotlinx.coroutines.flow.internal.AbstractC43165c;
import kotlinx.coroutines.flow.internal.C43164b;

/* compiled from: StateFlow.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/flow/q2;", "Lkotlinx/coroutines/flow/internal/c;", "Lkotlinx/coroutines/flow/o2;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class q2 extends AbstractC43165c<o2<?>> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AtomicReference<Object> f411698a = new AtomicReference<>(null);

    @Override // kotlinx.coroutines.flow.internal.AbstractC43165c
    public final boolean a(AbstractC43163a abstractC43163a) {
        AtomicReference<Object> atomicReference = this.f411698a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(p2.f411685a);
        return true;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC43165c
    public final Continuation[] b(AbstractC43163a abstractC43163a) {
        this.f411698a.set(null);
        return C43164b.f411458a;
    }

    @Y61.l
    public final Object c(@Y61.k Continuation<? super kotlin.G0> continuation) {
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(1, IntrinsicsKt.intercepted(continuation));
        rVar.p();
        AtomicReference<Object> atomicReference = this.f411698a;
        kotlinx.coroutines.internal.a0 a0Var = p2.f411685a;
        while (true) {
            if (atomicReference.compareAndSet(a0Var, rVar)) {
                break;
            }
            if (atomicReference.get() != a0Var) {
                int i12 = kotlin.Z.f406624c;
                rVar.resumeWith(kotlin.G0.f406611a);
                break;
            }
        }
        Object objO = rVar.o();
        if (objO == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objO == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objO : kotlin.G0.f406611a;
    }
}
