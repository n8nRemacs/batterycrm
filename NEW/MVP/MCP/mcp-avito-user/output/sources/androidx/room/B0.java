package androidx.room;

import com.avito.android.timestamp_storage.data.database.TimestampDatabase_Impl;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: RoomDatabaseExt.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "Lkotlinx/coroutines/T;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.room.RoomDatabaseKt$withTransaction$transactionBlock$1", f = "RoomDatabaseExt.kt", i = {0}, l = {62}, m = "invokeSuspend", n = {"transactionElement"}, s = {"L$0"})
/* loaded from: classes10.dex */
final class B0 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<Object>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f54226q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f54227r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ TimestampDatabase_Impl f54228s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ M11.c f54229t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B0(TimestampDatabase_Impl timestampDatabase_Impl, M11.c cVar, Continuation continuation) {
        super(2, continuation);
        this.f54228s = timestampDatabase_Impl;
        this.f54229t = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        B0 b02 = new B0(this.f54228s, this.f54229t, continuation);
        b02.f54227r = obj;
        return b02;
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<Object> continuation) {
        return ((B0) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) throws Throwable {
        Throwable th2;
        R0 r02;
        R0 coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f54226q;
        TimestampDatabase_Impl timestampDatabase_Impl = this.f54228s;
        try {
            if (i12 == 0) {
                C42729a0.b(obj);
                R0 r03 = (R0) ((kotlinx.coroutines.T) this.f54227r).getF398924i().get(R0.f54293d);
                r03.f54295c.incrementAndGet();
                try {
                    timestampDatabase_Impl.c();
                    try {
                        M11.c cVar = this.f54229t;
                        this.f54227r = r03;
                        this.f54226q = 1;
                        Object objInvoke = cVar.invoke(this);
                        if (objInvoke == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        r02 = r03;
                        obj = objInvoke;
                    } catch (Throwable th3) {
                        th2 = th3;
                        timestampDatabase_Impl.l();
                        throw th2;
                    }
                } catch (Throwable th4) {
                    coroutine_suspended = r03;
                    th = th4;
                    if (coroutine_suspended.f54295c.decrementAndGet() >= 0) {
                        throw th;
                    }
                    throw new IllegalStateException("Transaction was never started or was already released.");
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r02 = (R0) this.f54227r;
                try {
                    C42729a0.b(obj);
                } catch (Throwable th5) {
                    th2 = th5;
                    timestampDatabase_Impl.l();
                    throw th2;
                }
            }
            timestampDatabase_Impl.s();
            timestampDatabase_Impl.l();
            if (r02.f54295c.decrementAndGet() >= 0) {
                return obj;
            }
            throw new IllegalStateException("Transaction was never started or was already released.");
        } catch (Throwable th6) {
            th = th6;
        }
    }
}
