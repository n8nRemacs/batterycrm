package com.avito.android.order.feature.mvi;

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

/* compiled from: OrderActor.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LM40/a;", "", "<anonymous parameter 0>", "", "attempt", "", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;J)Z"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.order.feature.mvi.OrderActor$handleOrderUpdates$1$2", f = "OrderActor.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.order.feature.mvi.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32943c extends SuspendLambda implements Y41.r<InterfaceC43172j<? super M40.a>, Throwable, Long, Continuation<? super Boolean>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f209609q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ long f209610r;

    public C32943c() {
        throw null;
    }

    @Override // Y41.r
    public final Object invoke(InterfaceC43172j<? super M40.a> interfaceC43172j, Throwable th2, Long l12, Continuation<? super Boolean> continuation) {
        long jLongValue = l12.longValue();
        C32943c c32943c = new C32943c(4, continuation);
        c32943c.f209610r = jLongValue;
        return c32943c.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f209609q;
        boolean z12 = true;
        if (i12 == 0) {
            C42729a0.b(obj);
            if (this.f209610r < 3) {
                C32941a.f209594g.getClass();
                long j12 = C32941a.f209595h;
                this.f209609q = 1;
                if (C43131e0.c(j12, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                z12 = false;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return Boxing.boxBoolean(z12);
    }
}
