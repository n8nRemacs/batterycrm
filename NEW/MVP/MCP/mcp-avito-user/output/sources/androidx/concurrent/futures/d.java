package androidx.concurrent.futures;

import Y61.k;
import Y61.l;
import com.google.common.util.concurrent.D0;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.r;

/* compiled from: ListenableFuture.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"concurrent-futures-ktx"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d {
    @l
    public static final Object a(@k D0 d02, @k ContinuationImpl continuationImpl) throws Throwable {
        try {
            if (d02.isDone()) {
                return a.f(d02);
            }
            r rVar = new r(1, IntrinsicsKt.intercepted(continuationImpl));
            rVar.p();
            d02.N(new g(d02, rVar), DirectExecutor.f43133b);
            rVar.r(new c(d02));
            Object objO = rVar.o();
            if (objO == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuationImpl);
            }
            return objO;
        } catch (ExecutionException e12) {
            throw e12.getCause();
        }
    }
}
