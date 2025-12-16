package com.avito.android.ai_assistant.screens.chat.mvi;

import com.avito.android.ai_assistant.screens.chat.mvi.C28362a;
import com.avito.android.ai_assistant.screens.chat.mvi.entity.AiAssistantInternalAction;
import com.avito.android.clientEventBus.ConnectionState;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: Merge.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.ai_assistant.screens.chat.mvi.AiAssistantChatActor$handleChatUpdates$$inlined$flatMapLatest$1", f = "AiAssistantChatActor.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.ai_assistant.screens.chat.mvi.d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28365d extends SuspendLambda implements Y41.q<InterfaceC43172j<? super AiAssistantInternalAction>, ConnectionState, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f89231q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f89232r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f89233s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C28362a f89234t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Y41.a f89235u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28365d(Y41.a aVar, C28362a c28362a, Continuation continuation) {
        super(3, continuation);
        this.f89234t = c28362a;
        this.f89235u = aVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super AiAssistantInternalAction> interfaceC43172j, ConnectionState connectionState, Continuation<? super G0> continuation) {
        C28365d c28365d = new C28365d(this.f89235u, this.f89234t, continuation);
        c28365d.f89232r = interfaceC43172j;
        c28365d.f89233s = connectionState;
        return c28365d.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43160i interfaceC43160iW;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f89231q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f89232r;
            int i13 = C28362a.C2646a.f89212a[((ConnectionState) this.f89233s).ordinal()];
            C28362a c28362a = this.f89234t;
            if (i13 == 1) {
                interfaceC43160iW = new C43152f0(C43175k.Y(new C28372j(new C28370h(this.f89235u, kotlinx.coroutines.rx3.y.a(c28362a.f89208d.c(Tb.b.class)))), new C28371i(c28362a, null)), new C28369g(c28362a, null));
            } else {
                c28362a.f89210f.c(new NonFatalErrorEvent("AiAssistant socket connection failed", null, null, null, 14, null));
                interfaceC43160iW = C43175k.w();
            }
            this.f89231q = 1;
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
