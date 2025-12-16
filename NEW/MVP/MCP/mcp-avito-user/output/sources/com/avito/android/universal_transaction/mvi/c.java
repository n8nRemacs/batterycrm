package com.avito.android.universal_transaction.mvi;

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
import wG0.C49504b;

/* compiled from: TransactionActor.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LwG0/b;", "", "<anonymous parameter 0>", "", "attempt", "", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;J)Z"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.universal_transaction.mvi.TransactionActor$handleTransactionUpdates$1$2", f = "TransactionActor.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class c extends SuspendLambda implements Y41.r<InterfaceC43172j<? super C49504b>, Throwable, Long, Continuation<? super Boolean>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f306389q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ long f306390r;

    public c() {
        throw null;
    }

    @Override // Y41.r
    public final Object invoke(InterfaceC43172j<? super C49504b> interfaceC43172j, Throwable th2, Long l12, Continuation<? super Boolean> continuation) {
        long jLongValue = l12.longValue();
        c cVar = new c(4, continuation);
        cVar.f306390r = jLongValue;
        return cVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f306389q;
        boolean z12 = true;
        if (i12 == 0) {
            C42729a0.b(obj);
            if (this.f306390r < 3) {
                a.f306379c.getClass();
                long j12 = a.f306380d;
                this.f306389q = 1;
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
