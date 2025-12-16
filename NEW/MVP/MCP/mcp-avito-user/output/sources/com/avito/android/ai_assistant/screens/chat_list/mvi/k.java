package com.avito.android.ai_assistant.screens.chat_list.mvi;

import Nb.InterfaceC14555a;
import com.avito.android.ai_assistant.screens.chat_list.AssistantChatListArguments;
import com.avito.android.ai_assistant.screens.chat_list.mvi.entity.AiAssistantChatListInternalAction;
import com.avito.android.util.R0;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: AiAssistantChatListInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat_list/mvi/k;", "", "a", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AssistantChatListArguments f89625a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14555a f89626b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R0 f89627c;

    /* compiled from: AiAssistantChatListInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat_list/mvi/k$a;", "", "<init>", "()V", "", "ITEMS_LIMIT", "J", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AiAssistantChatListInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/ai_assistant/screens/chat_list/mvi/entity/AiAssistantChatListInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.ai_assistant.screens.chat_list.mvi.AiAssistantChatListInteractor$loadChatListContent$1", f = "AiAssistantChatListInteractor.kt", i = {0, 1}, l = {22, InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES, 30, 37}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super AiAssistantChatListInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f89628q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f89629r;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = k.this.new b(continuation);
            bVar.f89629r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super AiAssistantChatListInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.f89628q
                com.avito.android.ai_assistant.screens.chat_list.mvi.k r2 = com.avito.android.ai_assistant.screens.chat_list.mvi.k.this
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                r7 = 0
                if (r1 == 0) goto L35
                if (r1 == r6) goto L2d
                if (r1 == r5) goto L25
                if (r1 == r4) goto L20
                if (r1 != r3) goto L18
                goto L20
            L18:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L20:
                kotlin.C42729a0.b(r11)
                goto La4
            L25:
                java.lang.Object r1 = r10.f89629r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r11)
                goto L64
            L2d:
                java.lang.Object r1 = r10.f89629r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r11)
                goto L4d
            L35:
                kotlin.C42729a0.b(r11)
                java.lang.Object r11 = r10.f89629r
                kotlinx.coroutines.flow.j r11 = (kotlinx.coroutines.flow.InterfaceC43172j) r11
                com.avito.android.ai_assistant.screens.chat_list.mvi.entity.AiAssistantChatListInternalAction$Loading r1 = new com.avito.android.ai_assistant.screens.chat_list.mvi.entity.AiAssistantChatListInternalAction$Loading
                r1.<init>()
                r10.f89629r = r11
                r10.f89628q = r6
                java.lang.Object r1 = r11.emit(r1, r10)
                if (r1 != r0) goto L4c
                return r0
            L4c:
                r1 = r11
            L4d:
                Nb.a r11 = r2.f89626b
                com.avito.android.ai_assistant.screens.chat_list.AssistantChatListArguments r6 = r2.f89625a
                java.lang.String r6 = r6.f89582b
                r8 = 20
                java.lang.Long r8 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r8)
                r10.f89629r = r1
                r10.f89628q = r5
                java.lang.Object r11 = r11.e(r6, r7, r8, r10)
                if (r11 != r0) goto L64
                return r0
            L64:
                com.avito.android.remote.model.TypedResult r11 = (com.avito.android.remote.model.TypedResult) r11
                boolean r5 = r11 instanceof com.avito.android.remote.model.TypedResult.Success
                if (r5 == 0) goto L86
                com.avito.android.remote.model.TypedResult$Success r11 = (com.avito.android.remote.model.TypedResult.Success) r11
                java.lang.Object r11 = r11.getResult()
                Pb.b r11 = (Pb.b) r11
                com.avito.android.ai_assistant.screens.chat_list.mvi.entity.AiAssistantChatListInternalAction$Loaded r3 = new com.avito.android.ai_assistant.screens.chat_list.mvi.entity.AiAssistantChatListInternalAction$Loaded
                com.avito.android.ai_assistant.screens.chat_list.AssistantChatListArguments r2 = r2.f89625a
                java.lang.String r2 = r2.f89583c
                r3.<init>(r11, r2)
                r10.f89629r = r7
                r10.f89628q = r4
                java.lang.Object r11 = r1.emit(r3, r10)
                if (r11 != r0) goto La4
                return r0
            L86:
                boolean r2 = r11 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r2 == 0) goto La7
                com.avito.android.remote.model.TypedResult$Error r11 = (com.avito.android.remote.model.TypedResult.Error) r11
                com.avito.android.remote.error.ApiError r2 = r11.getError()
                java.lang.Throwable r11 = r11.getCause()
                com.avito.android.util.C35936s.a(r2, r11)
                com.avito.android.ai_assistant.screens.chat_list.mvi.entity.AiAssistantChatListInternalAction$c r11 = com.avito.android.ai_assistant.screens.chat_list.mvi.entity.AiAssistantChatListInternalAction.c.f89613b
                r10.f89629r = r7
                r10.f89628q = r3
                java.lang.Object r11 = r1.emit(r11, r10)
                if (r11 != r0) goto La4
                return r0
            La4:
                kotlin.G0 r11 = kotlin.G0.f406611a
                return r11
            La7:
                kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
                r11.<init>()
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.ai_assistant.screens.chat_list.mvi.k.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: AiAssistantChatListInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/ai_assistant/screens/chat_list/mvi/entity/AiAssistantChatListInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.ai_assistant.screens.chat_list.mvi.AiAssistantChatListInteractor$loadChatListContent$2", f = "AiAssistantChatListInteractor.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.q<InterfaceC43172j<? super AiAssistantChatListInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f89631q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f89632r;

        public c() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super AiAssistantChatListInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            c cVar = new c(3, continuation);
            cVar.f89632r = interfaceC43172j;
            return cVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f89631q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f89632r;
                AiAssistantChatListInternalAction.c cVar = AiAssistantChatListInternalAction.c.f89613b;
                this.f89631q = 1;
                if (interfaceC43172j.emit(cVar, this) == coroutine_suspended) {
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

    static {
        new a(null);
    }

    @Inject
    public k(@Y61.k AssistantChatListArguments assistantChatListArguments, @Y61.k InterfaceC14555a interfaceC14555a, @Y61.k R0 r02) {
        this.f89625a = assistantChatListArguments;
        this.f89626b = interfaceC14555a;
        this.f89627c = r02;
    }

    @Y61.k
    public final InterfaceC43160i<AiAssistantChatListInternalAction> a() {
        return C43175k.I(this.f89627c.a(), new C43152f0(C43175k.G(new b(null)), new c(3, null)));
    }
}
