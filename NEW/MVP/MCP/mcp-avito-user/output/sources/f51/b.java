package F51;

import Y41.p;
import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.v0;
import kotlinx.coroutines.C43077a1;
import kotlinx.coroutines.E;
import kotlinx.coroutines.internal.W;

/* compiled from: Undispatched.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class b {
    @l
    public static final Object a(@k W w12, W w13, @k p pVar) {
        Object e12;
        int i12 = 2;
        try {
            if (pVar instanceof BaseContinuationImpl) {
                v0.e(2, pVar);
                e12 = pVar.invoke(w13, w12);
            } else {
                e12 = IntrinsicsKt.wrapWithContinuationImpl(pVar, w13, w12);
            }
        } catch (Throwable th2) {
            e12 = new E(th2, false, i12, null);
        }
        if (e12 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return IntrinsicsKt.getCOROUTINE_SUSPENDED();
        }
        Object objQ0 = w12.q0(e12);
        if (objQ0 == C43077a1.f410750b) {
            return IntrinsicsKt.getCOROUTINE_SUSPENDED();
        }
        if (objQ0 instanceof E) {
            throw ((E) objQ0).f410693a;
        }
        return C43077a1.a(objQ0);
    }
}
