package com.avito.android.iac_dialer.impl_module.telecom.impl;

import Y41.p;
import android.telecom.DisconnectCause;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state.TerminateReason;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state.TerminateReasonBundle;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.T;

/* compiled from: IacConnection.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.iac_dialer.impl_module.telecom.impl.IacConnection$moveConnectionStateToDisconnected$2", f = "IacConnection.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class f extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ b f166461q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ TerminateReasonBundle f166462r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(b bVar, TerminateReasonBundle terminateReasonBundle, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f166461q = bVar;
        this.f166462r = terminateReasonBundle;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new f(this.f166461q, this.f166462r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((f) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        b bVar = this.f166461q;
        bVar.b("moveConnectionStateToDisconnected() callTerminationScope.launch - started");
        int i12 = 2;
        TerminateReasonBundle terminateReasonBundle = this.f166462r;
        if (terminateReasonBundle != null && terminateReasonBundle.isLocal()) {
            TerminateReason reason = terminateReasonBundle.getReason();
            if (L.f(reason, TerminateReason.Busy.INSTANCE)) {
                i12 = 7;
            } else if (L.f(reason, TerminateReason.Reject.INSTANCE)) {
                i12 = 6;
            } else {
                if (!(L.f(reason, TerminateReason.AnswerTimeout.INSTANCE) ? true : L.f(reason, TerminateReason.ConnectTimeout.INSTANCE) ? true : L.f(reason, TerminateReason.Hangup.INSTANCE) ? true : L.f(reason, TerminateReason.InternalError.INSTANCE) ? true : L.f(reason, TerminateReason.NoMicAccess.INSTANCE) ? true : L.f(reason, TerminateReason.ServerError.INSTANCE) ? true : reason instanceof TerminateReason.Unknown)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        Y41.l<TerminateReasonBundle, G0> onDisconnected = bVar.f166438a.getCallbacks().getOnDisconnected();
        if (terminateReasonBundle == null) {
            terminateReasonBundle = new TerminateReasonBundle(TerminateReason.InternalError.INSTANCE, true);
        }
        onDisconnected.invoke(terminateReasonBundle);
        bVar.b("moveConnectionStateToDisconnected() callTerminationScope.launch - onDisconnected callback sent");
        bVar.setDisconnected(new DisconnectCause(i12));
        bVar.destroy();
        bVar.b("moveConnectionStateToDisconnected() callTerminationScope.launch - done");
        return G0.f406611a;
    }
}
