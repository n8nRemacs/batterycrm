package com.avito.android.ai_assistant.screens.chat.mvi;

import com.avito.android.ai_assistant.screens.chat.mvi.entity.AiAssistantInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: AiAssistantChatActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.ai_assistant.screens.chat.mvi.AiAssistantChatActor$process$6", f = "AiAssistantChatActor.kt", i = {}, l = {194, 197}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class n extends SuspendLambda implements Y41.p<InterfaceC43172j<? super AiAssistantInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f89414q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f89415r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Vb.i f89416s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C28362a f89417t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Vb.i iVar, C28362a c28362a, Continuation<? super n> continuation) {
        super(2, continuation);
        this.f89416s = iVar;
        this.f89417t = c28362a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        n nVar = new n(this.f89416s, this.f89417t, continuation);
        nVar.f89415r = obj;
        return nVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super AiAssistantInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((n) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0060 A[EDGE_INSN: B:32:0x0060->B:23:0x0060 BREAK  A[LOOP:0: B:16:0x0043->B:33:?]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.f89414q
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L17
            if (r1 != r2) goto Lf
            goto L17
        Lf:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L17:
            kotlin.C42729a0.b(r10)
            goto L8e
        L1c:
            kotlin.C42729a0.b(r10)
            java.lang.Object r10 = r9.f89415r
            kotlinx.coroutines.flow.j r10 = (kotlinx.coroutines.flow.InterfaceC43172j) r10
            Vb.i r1 = r9.f89416s
            Vb.m r4 = r1.f17249b
            java.util.List<com.avito.android.ai_assistant.adapter.a> r4 = r4.f17272g
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            boolean r5 = r4 instanceof java.util.Collection
            java.lang.String r6 = "new_chat"
            java.lang.String r7 = "chat"
            com.avito.android.ai_assistant.screens.chat.mvi.a r8 = r9.f89417t
            if (r5 == 0) goto L3f
            r5 = r4
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L3f
            goto L54
        L3f:
            java.util.Iterator r4 = r4.iterator()
        L43:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L54
            java.lang.Object r5 = r4.next()
            com.avito.android.ai_assistant.adapter.a r5 = (com.avito.android.ai_assistant.adapter.a) r5
            boolean r5 = r5 instanceof com.avito.android.ai_assistant.adapter.user_message.b
            if (r5 == 0) goto L43
            goto L60
        L54:
            Vb.m r4 = r1.f17249b
            Vb.j r4 = r4.f17266a
            Vb.j$a r5 = Vb.j.a.f17256a
            boolean r4 = kotlin.jvm.internal.L.f(r4, r5)
            if (r4 != 0) goto L79
        L60:
            Jb.a r2 = r8.f89210f
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            r2.b(r4, r7, r6)
            com.avito.android.ai_assistant.screens.chat.mvi.entity.AiAssistantInternalAction$o r2 = new com.avito.android.ai_assistant.screens.chat.mvi.entity.AiAssistantInternalAction$o
            java.lang.String r1 = r1.f17251d
            r2.<init>(r1)
            r9.f89414q = r3
            java.lang.Object r10 = r10.emit(r2, r9)
            if (r10 != r0) goto L8e
            return r0
        L79:
            Jb.a r1 = r8.f89210f
            r3 = 0
            java.lang.Boolean r3 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            r1.b(r3, r7, r6)
            com.avito.android.ai_assistant.screens.chat.mvi.entity.AiAssistantInternalAction$d r1 = com.avito.android.ai_assistant.screens.chat.mvi.entity.AiAssistantInternalAction.d.f89256a
            r9.f89414q = r2
            java.lang.Object r10 = r10.emit(r1, r9)
            if (r10 != r0) goto L8e
            return r0
        L8e:
            kotlin.G0 r10 = kotlin.G0.f406611a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.ai_assistant.screens.chat.mvi.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
