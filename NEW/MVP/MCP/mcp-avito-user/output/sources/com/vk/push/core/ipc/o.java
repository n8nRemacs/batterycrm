package com.vk.push.core.ipc;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;

/* compiled from: DelayedAction.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"ACTION", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 0})
@DebugMetadata(c = "com.vk.push.core.ipc.DelayedAction$actionWithDelay$1", f = "DelayedAction.kt", i = {0}, l = {17}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
/* loaded from: classes7.dex */
final class o extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f367077q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f367078r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f367079s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p<Object> f367080t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(long j12, p pVar, Continuation continuation) {
        super(2, continuation);
        this.f367079s = j12;
        this.f367080t = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        o oVar = new o(this.f367079s, this.f367080t, continuation);
        oVar.f367078r = obj;
        return oVar;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((o) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        T t12;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f367077q;
        if (i12 == 0) {
            C42729a0.b(obj);
            T t13 = (T) this.f367078r;
            this.f367078r = t13;
            this.f367077q = 1;
            if (C43131e0.b(this.f367079s, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            t12 = t13;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t12 = (T) this.f367078r;
            C42729a0.b(obj);
        }
        U.d(t12);
        if (U.e(t12)) {
            p<Object> pVar = this.f367080t;
            if (pVar.f367082b.invoke(null).booleanValue()) {
                pVar.f367083c.invoke(null);
            }
        }
        return G0.f406611a;
    }
}
