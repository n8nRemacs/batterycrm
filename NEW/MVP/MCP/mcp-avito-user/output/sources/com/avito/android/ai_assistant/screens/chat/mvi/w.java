package com.avito.android.ai_assistant.screens.chat.mvi;

import Vb.b;
import com.avito.android.ai_assistant.screens.chat.mvi.entity.AiAssistantInternalAction;
import com.avito.android.arch.mvi.utils.o;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: Merge.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.ai_assistant.screens.chat.mvi.AiAssistantChatBootstrap$produceScreenContent$$inlined$flatMapLatest$2", f = "AiAssistantChatBootstrap.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
public final class w extends SuspendLambda implements Y41.q<InterfaceC43172j<? super AiAssistantInternalAction>, b.a, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f89446q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f89447r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f89448s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ y f89449t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Continuation continuation, y yVar) {
        super(3, continuation);
        this.f89449t = yVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super AiAssistantInternalAction> interfaceC43172j, b.a aVar, Continuation<? super G0> continuation) {
        w wVar = new w(continuation, this.f89449t);
        wVar.f89447r = interfaceC43172j;
        wVar.f89448s = aVar;
        return wVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f89446q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f89447r;
            y yVar = this.f89449t;
            Vb.e eVar = yVar.f89457c;
            eVar.getClass();
            o.a aVar = eVar.f17235b.f92114c;
            String str = yVar.f89455a.f88717c;
            if (str == null) {
                str = "";
            }
            InterfaceC43160i<AiAssistantInternalAction> interfaceC43160iD = yVar.f89456b.d(str, true, null, aVar);
            this.f89446q = 1;
            if (C43175k.u(this, interfaceC43160iD, interfaceC43172j) == coroutine_suspended) {
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
