package com.avito.android.ai_assistant.screens.chat.mvi;

import Vb.c;
import com.avito.android.ai_assistant.screens.chat.mvi.entity.AiAssistantInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: Merge.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.ai_assistant.screens.chat.mvi.AiAssistantChatActor$process$$inlined$flatMapLatest$1", f = "AiAssistantChatActor.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
public final class l extends SuspendLambda implements Y41.q<InterfaceC43172j<? super AiAssistantInternalAction.z>, Vb.c, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f89408q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f89409r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f89410s;

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super AiAssistantInternalAction.z> interfaceC43172j, Vb.c cVar, Continuation<? super G0> continuation) {
        l lVar = new l(3, continuation);
        lVar.f89409r = interfaceC43172j;
        lVar.f89410s = cVar;
        return lVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f89408q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f89409r;
            Vb.c cVar = (Vb.c) this.f89410s;
            if (!(cVar instanceof c.a)) {
                throw new NoWhenBranchMatchedException();
            }
            C43210w c43210w = new C43210w(new AiAssistantInternalAction.z(((c.a) cVar).f17233a));
            this.f89408q = 1;
            if (C43175k.u(this, c43210w, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
