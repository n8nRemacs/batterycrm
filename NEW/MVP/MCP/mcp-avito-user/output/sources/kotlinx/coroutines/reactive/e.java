package kotlinx.coroutines.reactive;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.s0;

/* compiled from: Await.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-reactive"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class e {
    @Y61.l
    public static final Object a(@Y61.k io.reactivex.rxjava3.internal.operators.mixed.h hVar, @Y61.k Continuation continuation) {
        return b(hVar, s.f412009e, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [org.reactivestreams.c] */
    public static Object b(io.reactivex.rxjava3.internal.operators.mixed.h hVar, s sVar, ContinuationImpl continuationImpl) {
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(1, IntrinsicsKt.intercepted(continuationImpl));
        rVar.p();
        h[] hVarArr = A.f411962a;
        int length = hVarArr.length;
        int i12 = 0;
        io.reactivex.rxjava3.internal.operators.mixed.h hVar2 = hVar;
        while (i12 < length) {
            ?? A12 = hVarArr[i12].a();
            i12++;
            hVar2 = A12;
        }
        hVar2.d(new C43275b(rVar, sVar));
        Object objO = rVar.o();
        if (objO == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuationImpl);
        }
        return objO;
    }
}
