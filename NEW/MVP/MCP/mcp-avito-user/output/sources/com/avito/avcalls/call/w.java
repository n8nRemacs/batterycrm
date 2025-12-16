package com.avito.avcalls.call;

import com.avito.avcalls.call.models.InvitingState;
import com.avito.avcalls.call.models.TerminateReason;
import com.avito.avcalls.signaling.x;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;

/* compiled from: CallSession.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.avcalls.call.CallSession$terminate$2", f = "CallSession.kt", i = {}, l = {254}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class w extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f332837q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f332838r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InvitingState f332839s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ r f332840t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ TerminateReason f332841u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(boolean z12, InvitingState invitingState, r rVar, TerminateReason terminateReason, Continuation<? super w> continuation) {
        super(2, continuation);
        this.f332838r = z12;
        this.f332839s = invitingState;
        this.f332840t = rVar;
        this.f332841u = terminateReason;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new w(this.f332838r, this.f332839s, this.f332840t, this.f332841u, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((w) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f332837q;
        r rVar = this.f332840t;
        boolean z12 = this.f332838r;
        if (i12 == 0) {
            C42729a0.b(obj);
            if (z12 && this.f332839s.compareTo(InvitingState.Allocating.INSTANCE) > 0) {
                r.f332790n.c("send BYE message", "terminate", new Object[0]);
                A a12 = rVar.f332794d;
                String localUserId = rVar.a().getLocalUserId();
                String userId = rVar.a().getPeerStatus().getUserId();
                this.f332837q = 1;
                TerminateReason terminateReason = this.f332841u;
                String str = rVar.f332791a;
                a12.f332549d.b();
                obj = a12.f332548c.j(str, localUserId, userId, terminateReason, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            rVar.f(new InvitingState.Terminated(this.f332841u, z12));
            kotlinx.coroutines.U.b(rVar.f332793c, null);
            return G0.f406611a;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C42729a0.b(obj);
        com.avito.avcalls.signaling.x xVar = (com.avito.avcalls.signaling.x) obj;
        if (!(xVar instanceof x.c)) {
            if (!(xVar instanceof x.b)) {
                throw new NoWhenBranchMatchedException();
            }
            r.f332790n.a("terminate", "can't send bye, api error=" + ((x.b) xVar), null);
        }
        rVar.f(new InvitingState.Terminated(this.f332841u, z12));
        kotlinx.coroutines.U.b(rVar.f332793c, null);
        return G0.f406611a;
    }
}
