package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.v0;
import kotlinx.coroutines.internal.g0;

/* compiled from: ChannelFlow.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.flow.internal.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43169g {
    @Y61.l
    public static final <T, V> Object a(@Y61.k CoroutineContext coroutineContext, V v12, @Y61.k Object obj, @Y61.k Y41.p<? super V, ? super Continuation<? super T>, ? extends Object> pVar, @Y61.k Continuation<? super T> continuation) {
        Object objInvoke;
        Object objB = g0.b(coroutineContext, obj);
        try {
            G g12 = new G(continuation, coroutineContext);
            if (pVar instanceof BaseContinuationImpl) {
                v0.e(2, pVar);
                objInvoke = pVar.invoke(v12, g12);
            } else {
                objInvoke = IntrinsicsKt.wrapWithContinuationImpl(pVar, v12, g12);
            }
            g0.a(coroutineContext, objB);
            if (objInvoke == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return objInvoke;
        } catch (Throwable th2) {
            g0.a(coroutineContext, objB);
            throw th2;
        }
    }
}
