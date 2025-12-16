package com.avito.avcalls.call;

import com.avito.avcalls.call.models.InvitingState;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: OutgoingCallSession.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.avcalls.call.OutgoingCallSession$createAndStart$1", f = "OutgoingCallSession.kt", i = {0}, l = {200, 202}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
/* loaded from: classes5.dex */
final class T extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f332629q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f332630r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Q f332631s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(Q q12, Continuation<? super T> continuation) {
        super(2, continuation);
        this.f332631s = q12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        T t12 = new T(this.f332631s, continuation);
        t12.f332630r = obj;
        return t12;
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((T) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        kotlinx.coroutines.T t12;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f332629q;
        Q q12 = this.f332631s;
        C43238h c43238h = q12.f332792b;
        if (i12 == 0) {
            C42729a0.b(obj);
            t12 = (kotlinx.coroutines.T) this.f332630r;
            com.avito.avcalls.utils.logs.a aVar = Q.f332611r;
            aVar.b("createAndStart", new Object[0]);
            if (!kotlin.jvm.internal.L.f(q12.b(), InvitingState.Allocating.INSTANCE)) {
                aVar.a("createAndStart", "Wrong state for 'createAndStart'. Excepted 'Allocated', but actual is '" + q12.b() + '\'', null);
                return G0.f406611a;
            }
            N0 n0D = C43259k.d(c43238h, null, null, new S(q12, null), 3);
            this.f332630r = t12;
            this.f332629q = 1;
            if (((V0) n0D).A(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            t12 = (kotlinx.coroutines.T) this.f332630r;
            C42729a0.b(obj);
        }
        kotlinx.coroutines.U.d(t12);
        N0 n0D2 = C43259k.d(c43238h, null, null, new U(q12, null), 3);
        this.f332630r = null;
        this.f332629q = 2;
        if (((V0) n0D2).A(this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
