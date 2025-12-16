package com.avito.android.ai_assistant.screens.chat.mvi;

import com.avito.android.ai_assistant.screens.chat.mvi.entity.AiAssistantInternalAction;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: AiAssistantChatActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction;", "", "error", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.ai_assistant.screens.chat.mvi.AiAssistantChatActor$handleChatUpdates$1$4", f = "AiAssistantChatActor.kt", i = {}, l = {267}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.ai_assistant.screens.chat.mvi.g, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28369g extends SuspendLambda implements Y41.q<InterfaceC43172j<? super AiAssistantInternalAction>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f89293q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f89294r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Throwable f89295s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C28362a f89296t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28369g(C28362a c28362a, Continuation<? super C28369g> continuation) {
        super(3, continuation);
        this.f89296t = c28362a;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super AiAssistantInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        C28369g c28369g = new C28369g(this.f89296t, continuation);
        c28369g.f89294r = interfaceC43172j;
        c28369g.f89295s = th2;
        return c28369g.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f89293q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f89294r;
            this.f89296t.f89210f.c(new NonFatalErrorEvent("AiAssistant chat update events observation failed", this.f89295s, null, null, 12, null));
            InterfaceC43160i interfaceC43160iW = C43175k.w();
            this.f89294r = null;
            this.f89293q = 1;
            if (C43175k.u(this, interfaceC43160iW, interfaceC43172j) == coroutine_suspended) {
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
