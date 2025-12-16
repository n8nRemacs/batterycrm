package com.avito.avcalls.android.call;

import com.avito.avcalls.android.logger.g;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.internal.C43238h;
import xQ0.f;

/* compiled from: OutgoingCallSession.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.avcalls.android.call.OutgoingCallSession$createAndStart$1", f = "OutgoingCallSession.kt", i = {0}, l = {190, 192}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
/* loaded from: classes5.dex */
final class N extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f331454q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f331455r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ L f331456s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(L l12, Continuation<? super N> continuation) {
        super(2, continuation);
        this.f331456s = l12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        N n12 = new N(this.f331456s, continuation);
        n12.f331455r = obj;
        return n12;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((N) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        T t12;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f331454q;
        L l12 = this.f331456s;
        C43238h c43238h = l12.f331579b;
        if (i12 == 0) {
            C42729a0.b(obj);
            t12 = (T) this.f331455r;
            com.avito.avcalls.android.logger.g.INSTANCE.getClass();
            g.Companion.c("OutgoingCallSession", "createAndStart()");
            if (!kotlin.jvm.internal.L.f(l12.c().f442471d, f.c.f442482b)) {
                g.Companion.a("OutgoingCallSession", "createAndStart(): Wrong state for 'createAndStart'. Excepted 'Allocating', but actual is '" + l12.c().f442471d + '\'', null);
                return G0.f406611a;
            }
            N0 n0D = C43259k.d(c43238h, null, null, new M(l12, null), 3);
            this.f331455r = t12;
            this.f331454q = 1;
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
            t12 = (T) this.f331455r;
            C42729a0.b(obj);
        }
        U.d(t12);
        N0 n0D2 = C43259k.d(c43238h, null, null, new O(l12, null), 3);
        this.f331455r = null;
        this.f331454q = 2;
        if (((V0) n0D2).A(this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
