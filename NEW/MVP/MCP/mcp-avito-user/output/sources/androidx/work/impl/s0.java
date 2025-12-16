package androidx.work.impl;

import androidx.annotation.RestrictTo;
import androidx.work.DirectExecutor;
import com.google.common.util.concurrent.D0;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: WorkerWrapper.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f55932a = 0;

    static {
        androidx.work.G.b("WorkerWrapper");
    }

    @Y61.l
    @RestrictTo
    public static final Object a(@Y61.k D0 d02, @Y61.k androidx.work.F f12, @Y61.k SuspendLambda suspendLambda) {
        try {
            if (d02.isDone()) {
                return b(d02);
            }
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(1, IntrinsicsKt.intercepted(suspendLambda));
            rVar.p();
            d02.N(new B(d02, rVar), DirectExecutor.f55372b);
            rVar.r(new r0(f12, d02));
            Object objO = rVar.o();
            if (objO == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(suspendLambda);
            }
            return objO;
        } catch (ExecutionException e12) {
            throw e12.getCause();
        }
    }

    public static final <V> V b(Future<V> future) {
        V v12;
        boolean z12 = false;
        while (true) {
            try {
                v12 = future.get();
                break;
            } catch (InterruptedException unused) {
                z12 = true;
            } catch (Throwable th2) {
                if (z12) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z12) {
            Thread.currentThread().interrupt();
        }
        return v12;
    }
}
