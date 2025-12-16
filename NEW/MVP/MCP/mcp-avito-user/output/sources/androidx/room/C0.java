package androidx.room;

import com.avito.android.timestamp_storage.data.database.TimestampDatabase_Impl;
import java.util.concurrent.RejectedExecutionException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlinx.coroutines.C43259k;

/* compiled from: RoomDatabaseExt.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"room-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@X41.i
/* loaded from: classes10.dex */
public final class C0 {
    @Y61.l
    public static final Object a(@Y61.k TimestampDatabase_Impl timestampDatabase_Impl, @Y61.k M11.c cVar, @Y61.k Continuation continuation) {
        S0 s02 = null;
        B0 b02 = new B0(timestampDatabase_Impl, cVar, null);
        R0 r02 = (R0) continuation.getF411447c().get(R0.f54293d);
        ContinuationInterceptor continuationInterceptor = r02 != null ? r02.f54294b : null;
        if (continuationInterceptor != null) {
            return C43259k.g(continuationInterceptor, b02, continuation);
        }
        CoroutineContext f411447c = continuation.getF411447c();
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(1, IntrinsicsKt.intercepted(continuation));
        rVar.p();
        try {
            S0 s03 = timestampDatabase_Impl.f54299c;
            if (s03 != null) {
                s02 = s03;
            }
            s02.execute(new A0(f411447c, rVar, timestampDatabase_Impl, b02));
        } catch (RejectedExecutionException e12) {
            rVar.f(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e12));
        }
        Object objO = rVar.o();
        if (objO == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objO;
    }
}
