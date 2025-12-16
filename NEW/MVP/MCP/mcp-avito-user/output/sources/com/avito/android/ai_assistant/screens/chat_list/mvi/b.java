package com.avito.android.ai_assistant.screens.chat_list.mvi;

import Wb.InterfaceC15738a;
import com.avito.android.ai_assistant.screens.chat_list.mvi.entity.AiAssistantChatListInternalAction;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: AiAssistantChatListActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/ai_assistant/screens/chat_list/mvi/entity/AiAssistantChatListInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.ai_assistant.screens.chat_list.mvi.AiAssistantChatListActor$process$1", f = "AiAssistantChatListActor.kt", i = {}, l = {AvailableCode.ERROR_NO_ACTIVITY, AvailableCode.USER_IGNORE_PREVIOUS_POPUP}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super AiAssistantChatListInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f89601q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f89602r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC15738a f89603s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InterfaceC15738a interfaceC15738a, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f89603s = interfaceC15738a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f89603s, continuation);
        bVar.f89602r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super AiAssistantChatListInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f89601q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f89602r;
            com.avito.android.ai_assistant.adapter.chat_list_item.a aVar = ((InterfaceC15738a.c) this.f89603s).f17963a;
            if (aVar.f88790e) {
                AiAssistantChatListInternalAction.a aVar2 = AiAssistantChatListInternalAction.a.f89610b;
                this.f89601q = 1;
                if (interfaceC43172j.emit(aVar2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                AiAssistantChatListInternalAction.b bVar = new AiAssistantChatListInternalAction.b(null, aVar.f88787b, 1, null);
                this.f89601q = 2;
                if (interfaceC43172j.emit(bVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
