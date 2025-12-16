package com.avito.android.ai_assistant.screens.chat.mvi.interactor;

import Tb.C15348a;
import Tb.j;
import Y41.p;
import Y61.k;
import com.avito.android.ai_assistant.model.OkRespDataSuccessElementsItem;
import com.avito.android.ai_assistant.screens.chat.mvi.entity.AiAssistantInternalAction;
import com.avito.android.arch.mvi.utils.l;
import java.util.ArrayList;
import java.util.ListIterator;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: AssistantChatInteractor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/G0;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction;", "<anonymous>", "(V)Lkotlinx/coroutines/flow/Flow;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.ai_assistant.screens.chat.mvi.interactor.AssistantChatInteractorImpl$handle$1", f = "AssistantChatInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class b extends SuspendLambda implements p<G0, Continuation<? super InterfaceC43160i<? extends AiAssistantInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ d f89308q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f89309r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C15348a f89310s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l<Vb.d> f89311t;

    /* compiled from: AssistantChatInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.ai_assistant.screens.chat.mvi.interactor.AssistantChatInteractorImpl$handle$1$1", f = "AssistantChatInteractor.kt", i = {}, l = {339}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super AiAssistantInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f89312q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f89313r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ C15348a f89314s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ d f89315t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f89316u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C15348a c15348a, d dVar, String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f89314s = c15348a;
            this.f89315t = dVar;
            this.f89316u = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
            a aVar = new a(this.f89314s, this.f89315t, this.f89316u, continuation);
            aVar.f89313r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super AiAssistantInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@k Object obj) {
            OkRespDataSuccessElementsItem okRespDataSuccessElementsItem;
            Object objPrevious;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f89312q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f89313r;
                ArrayList arrayList = this.f89314s.f15734a;
                if (arrayList != null) {
                    ListIterator listIterator = arrayList.listIterator(arrayList.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            objPrevious = null;
                            break;
                        }
                        objPrevious = listIterator.previous();
                        OkRespDataSuccessElementsItem okRespDataSuccessElementsItem2 = (OkRespDataSuccessElementsItem) objPrevious;
                        OkRespDataSuccessElementsItem.OkRespDataSuccessElementsItemMessage okRespDataSuccessElementsItemMessage = okRespDataSuccessElementsItem2 instanceof OkRespDataSuccessElementsItem.OkRespDataSuccessElementsItemMessage ? (OkRespDataSuccessElementsItem.OkRespDataSuccessElementsItemMessage) okRespDataSuccessElementsItem2 : null;
                        if ((okRespDataSuccessElementsItemMessage != null ? okRespDataSuccessElementsItemMessage.getAuthor() : null) == OkRespDataSuccessElementsItem.OkRespDataSuccessElementsItemMessage.Author.User) {
                            break;
                        }
                    }
                    okRespDataSuccessElementsItem = (OkRespDataSuccessElementsItem) objPrevious;
                } else {
                    okRespDataSuccessElementsItem = null;
                }
                OkRespDataSuccessElementsItem.OkRespDataSuccessElementsItemMessage okRespDataSuccessElementsItemMessage2 = okRespDataSuccessElementsItem instanceof OkRespDataSuccessElementsItem.OkRespDataSuccessElementsItemMessage ? (OkRespDataSuccessElementsItem.OkRespDataSuccessElementsItemMessage) okRespDataSuccessElementsItem : null;
                this.f89315t.f89323e.d(this.f89316u, okRespDataSuccessElementsItemMessage2 != null ? okRespDataSuccessElementsItemMessage2.getId() : null);
                AiAssistantInternalAction.l lVar = AiAssistantInternalAction.l.f89267a;
                this.f89312q = 1;
                if (interfaceC43172j.emit(lVar, this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, String str, C15348a c15348a, l<Vb.d> lVar, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f89308q = dVar;
        this.f89309r = str;
        this.f89310s = c15348a;
        this.f89311t = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
        return new b(this.f89308q, this.f89309r, this.f89310s, this.f89311t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(G0 g02, Continuation<? super InterfaceC43160i<? extends AiAssistantInternalAction>> continuation) {
        return ((b) create(g02, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        C15348a c15348a = this.f89310s;
        j.a aVar = new j.a(c15348a.f15735b.f15750a, null);
        l<Vb.d> lVar = this.f89311t;
        d dVar = this.f89308q;
        String str = this.f89309r;
        return new C43137a0(new a(c15348a, dVar, str, null), dVar.d(str, false, aVar, lVar));
    }
}
