package com.avito.android.ai_assistant.screens.chat.mvi;

import Tb.j;
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
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.X;

/* compiled from: Merge.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.ai_assistant.screens.chat.mvi.AiAssistantChatActor$handleChatUpdates$lambda$6$$inlined$flatMapLatest$1", f = "AiAssistantChatActor.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.ai_assistant.screens.chat.mvi.i, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28371i extends SuspendLambda implements Y41.q<InterfaceC43172j<? super AiAssistantInternalAction>, b.C1190b, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f89304q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f89305r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f89306s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C28362a f89307t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28371i(C28362a c28362a, Continuation continuation) {
        super(3, continuation);
        this.f89307t = c28362a;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super AiAssistantInternalAction> interfaceC43172j, b.C1190b c1190b, Continuation<? super G0> continuation) {
        C28371i c28371i = new C28371i(this.f89307t, continuation);
        c28371i.f89305r = interfaceC43172j;
        c28371i.f89306s = c1190b;
        return c28371i.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f89304q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f89305r;
            b.C1190b c1190b = (b.C1190b) this.f89306s;
            C28362a c28362a = this.f89307t;
            Vb.e eVar = c28362a.f89211g;
            eVar.getClass();
            o.a aVar = eVar.f17235b.f92114c;
            c28362a.f89206b.b();
            C43137a0 c43137a0 = new C43137a0(new C28368f(2, null), new X(c28362a.f89205a.d(c1190b.f17232a, false, new j.a(((Vb.d) aVar.getValue()).f17234a.f17265b, null), aVar), new C28366e(3, null)));
            this.f89304q = 1;
            if (C43175k.u(this, c43137a0, interfaceC43172j) == coroutine_suspended) {
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
