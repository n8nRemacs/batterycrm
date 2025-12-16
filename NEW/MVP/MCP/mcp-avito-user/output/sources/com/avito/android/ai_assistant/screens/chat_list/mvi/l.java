package com.avito.android.ai_assistant.screens.chat_list.mvi;

import Nb.InterfaceC14555a;
import Pb.c;
import com.avito.android.ai_assistant.screens.chat_list.mvi.entity.AiAssistantChatListInternalAction;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.C35936s;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: AiAssistantChatListInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/ai_assistant/screens/chat_list/mvi/entity/AiAssistantChatListInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.ai_assistant.screens.chat_list.mvi.AiAssistantChatListInteractor$loadNextPortionOfContent$1", f = "AiAssistantChatListInteractor.kt", i = {0}, l = {45, 53, 62, 66}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes11.dex */
final class l extends SuspendLambda implements Y41.p<InterfaceC43172j<? super AiAssistantChatListInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f89633q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f89634r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ k f89635s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f89636t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(k kVar, long j12, Continuation<? super l> continuation) {
        super(2, continuation);
        this.f89635s = kVar;
        this.f89636t = j12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        l lVar = new l(this.f89635s, this.f89636t, continuation);
        lVar.f89634r = obj;
        return lVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super AiAssistantChatListInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((l) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f89633q;
        k kVar = this.f89635s;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f89634r;
            InterfaceC14555a interfaceC14555a = kVar.f89626b;
            String str = kVar.f89625a.f89582b;
            Long lBoxLong = Boxing.boxLong(this.f89636t);
            Long lBoxLong2 = Boxing.boxLong(20L);
            this.f89634r = interfaceC43172j;
            this.f89633q = 1;
            obj = interfaceC14555a.e(str, lBoxLong, lBoxLong2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2 && i12 != 3 && i12 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f89634r;
            C42729a0.b(obj);
        }
        TypedResult typedResult = (TypedResult) obj;
        if (typedResult instanceof TypedResult.Success) {
            Pb.b bVar = (Pb.b) ((TypedResult.Success) typedResult).getResult();
            Pb.c content = bVar.getContent();
            if (content instanceof c.b) {
                AiAssistantChatListInternalAction.Loaded loaded = new AiAssistantChatListInternalAction.Loaded(bVar, kVar.f89625a.f89583c);
                this.f89634r = null;
                this.f89633q = 2;
                if (interfaceC43172j.emit(loaded, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (content instanceof c.a) {
                AiAssistantChatListInternalAction.d dVar = new AiAssistantChatListInternalAction.d((c.a) bVar.getContent());
                this.f89634r = null;
                this.f89633q = 3;
                if (interfaceC43172j.emit(dVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (!(typedResult instanceof TypedResult.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            TypedResult.Error error = (TypedResult.Error) typedResult;
            C35936s.a(error.getError(), error.getCause());
            AiAssistantChatListInternalAction.d dVar2 = new AiAssistantChatListInternalAction.d(null, 1, null);
            this.f89634r = null;
            this.f89633q = 4;
            if (interfaceC43172j.emit(dVar2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return G0.f406611a;
    }
}
