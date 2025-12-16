package androidx.work.impl;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: UnfinishedWorkListener.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "", "throwable", "", "attempt", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;J)Z"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1", f = "UnfinishedWorkListener.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class C extends SuspendLambda implements Y41.r<InterfaceC43172j<? super Boolean>, Throwable, Long, Continuation<? super Boolean>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f55517q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ long f55518r;

    public C() {
        throw null;
    }

    @Override // Y41.r
    public final Object invoke(InterfaceC43172j<? super Boolean> interfaceC43172j, Throwable th2, Long l12, Continuation<? super Boolean> continuation) {
        long jLongValue = l12.longValue();
        C c12 = new C(4, continuation);
        c12.f55518r = jLongValue;
        return c12.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f55517q;
        if (i12 == 0) {
            C42729a0.b(obj);
            long j12 = this.f55518r;
            androidx.work.G gA2 = androidx.work.G.a();
            int i13 = E.f55522b;
            gA2.getClass();
            long jMin = Math.min(j12 * 30000, E.f55521a);
            this.f55517q = 1;
            if (C43131e0.b(jMin, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return Boxing.boxBoolean(true);
    }
}
