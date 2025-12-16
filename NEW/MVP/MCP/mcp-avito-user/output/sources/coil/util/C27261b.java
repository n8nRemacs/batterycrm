package coil.util;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.s0;
import okhttp3.Call;
import okhttp3.Response;

/* compiled from: Calls.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"coil-base_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@X41.i
/* renamed from: coil.util.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27261b {
    @Y61.l
    public static final Object a(@Y61.k Call call, @Y61.k Continuation<? super Response> continuation) {
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(1, IntrinsicsKt.intercepted(continuation));
        rVar.p();
        n nVar = new n(call, rVar);
        call.enqueue(nVar);
        rVar.r(nVar);
        Object objO = rVar.o();
        if (objO == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objO;
    }
}
