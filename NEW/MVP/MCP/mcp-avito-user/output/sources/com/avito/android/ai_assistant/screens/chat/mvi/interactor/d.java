package com.avito.android.ai_assistant.screens.chat.mvi.interactor;

import Jb.InterfaceC14183a;
import Ob.C14667a;
import Tb.C15348a;
import Tb.j;
import Y41.p;
import Y61.k;
import com.avito.android.ai_assistant.model.AppendDirection;
import com.avito.android.ai_assistant.model.MessageSendFrom;
import com.avito.android.ai_assistant.model.OkRespDataSuccessElementsItem;
import com.avito.android.ai_assistant.screens.chat.mvi.entity.AiAssistantInternalAction;
import com.avito.android.ai_assistant.screens.chat.use_case.m;
import com.avito.android.arch.mvi.utils.l;
import com.avito.android.favorite.AbstractC30567a;
import com.avito.android.remote.model.TypedResult;
import io.reactivex.rxjava3.core.I;
import java.util.ArrayList;
import java.util.ListIterator;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43207v;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.rx3.C43292o;

/* compiled from: AssistantChatInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat/mvi/interactor/d;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/interactor/a;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d implements com.avito.android.ai_assistant.screens.chat.mvi.interactor.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f89319a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.ai_assistant.screens.chat.use_case.e f89320b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.ai_assistant.screens.chat.use_case.a f89321c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final m f89322d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC14183a f89323e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.favorite.h f89324f;

    /* compiled from: AssistantChatInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.ai_assistant.screens.chat.mvi.interactor.AssistantChatInteractorImpl$loadChatHistory$1", f = "AssistantChatInteractor.kt", i = {0}, l = {127, 129, 128}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super AiAssistantInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f89325q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f89326r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ boolean f89327s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ d f89328t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f89329u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ j f89330v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ l<Vb.d> f89331w;

        /* compiled from: AssistantChatInteractor.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "LQb/m;", "chatHistory", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction;", "<anonymous>", "(Lcom/avito/android/remote/model/TypedResult;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.ai_assistant.screens.chat.mvi.interactor.AssistantChatInteractorImpl$loadChatHistory$1$1", f = "AssistantChatInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.ai_assistant.screens.chat.mvi.interactor.d$a$a, reason: collision with other inner class name */
        public static final class C2648a extends SuspendLambda implements p<TypedResult<Qb.m>, Continuation<? super InterfaceC43160i<? extends AiAssistantInternalAction>>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f89332q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ d f89333r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ l<Vb.d> f89334s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ j f89335t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2648a(d dVar, l<Vb.d> lVar, j jVar, Continuation<? super C2648a> continuation) {
                super(2, continuation);
                this.f89333r = dVar;
                this.f89334s = lVar;
                this.f89335t = jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                C2648a c2648a = new C2648a(this.f89333r, this.f89334s, this.f89335t, continuation);
                c2648a.f89332q = obj;
                return c2648a;
            }

            @Override // Y41.p
            public final Object invoke(TypedResult<Qb.m> typedResult, Continuation<? super InterfaceC43160i<? extends AiAssistantInternalAction>> continuation) {
                return ((C2648a) create(typedResult, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                TypedResult typedResult = (TypedResult) this.f89332q;
                boolean z12 = typedResult instanceof TypedResult.Success;
                j jVar = this.f89335t;
                if (z12) {
                    return d.e(this.f89333r, (TypedResult.Success) typedResult, this.f89334s, jVar);
                }
                if (!(typedResult instanceof TypedResult.Error)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (jVar instanceof j.b) {
                    return new C43210w(new AiAssistantInternalAction.q(AppendDirection.f89103b, ((TypedResult.Error) typedResult).getError()));
                }
                if (!(jVar instanceof j.a)) {
                    return new C43210w(new AiAssistantInternalAction.e(((TypedResult.Error) typedResult).getError()));
                }
                AppendDirection appendDirection = AppendDirection.f89104c;
                AiAssistantInternalAction.q qVar = new AiAssistantInternalAction.q(appendDirection, ((TypedResult.Error) typedResult).getError());
                C42784z0 c42784z0 = C42784z0.f406748b;
                return new C43207v(new AiAssistantInternalAction[]{qVar, new AiAssistantInternalAction.UpdateChatHistory(c42784z0, null, true, appendDirection, false, null, AiAssistantInternalAction.UpdateChatHistory.AnswerLoading.f89249c, true, c42784z0)});
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z12, d dVar, String str, j jVar, l<Vb.d> lVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f89327s = z12;
            this.f89328t = dVar;
            this.f89329u = str;
            this.f89330v = jVar;
            this.f89331w = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
            a aVar = new a(this.f89327s, this.f89328t, this.f89329u, this.f89330v, this.f89331w, continuation);
            aVar.f89326r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super AiAssistantInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0071 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r8.f89325q
                Tb.j r2 = r8.f89330v
                com.avito.android.ai_assistant.screens.chat.mvi.interactor.d r3 = r8.f89328t
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L31
                if (r1 == r6) goto L29
                if (r1 == r5) goto L21
                if (r1 != r4) goto L19
                kotlin.C42729a0.b(r9)
                goto L72
            L19:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L21:
                java.lang.Object r1 = r8.f89326r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r9)
                goto L59
            L29:
                java.lang.Object r1 = r8.f89326r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r9)
                goto L4a
            L31:
                kotlin.C42729a0.b(r9)
                java.lang.Object r9 = r8.f89326r
                r1 = r9
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                boolean r9 = r8.f89327s
                if (r9 == 0) goto L4a
                com.avito.android.ai_assistant.screens.chat.mvi.entity.AiAssistantInternalAction$n r9 = com.avito.android.ai_assistant.screens.chat.mvi.entity.AiAssistantInternalAction.n.f89270a
                r8.f89326r = r1
                r8.f89325q = r6
                java.lang.Object r9 = r1.emit(r9, r8)
                if (r9 != r0) goto L4a
                return r0
            L4a:
                com.avito.android.ai_assistant.screens.chat.use_case.a r9 = r3.f89321c
                r8.f89326r = r1
                r8.f89325q = r5
                java.lang.String r5 = r8.f89329u
                java.lang.Object r9 = r9.a(r5, r2, r8)
                if (r9 != r0) goto L59
                return r0
            L59:
                kotlinx.coroutines.flow.i r9 = (kotlinx.coroutines.flow.InterfaceC43160i) r9
                com.avito.android.ai_assistant.screens.chat.mvi.interactor.d$a$a r5 = new com.avito.android.ai_assistant.screens.chat.mvi.interactor.d$a$a
                com.avito.android.arch.mvi.utils.l<Vb.d> r6 = r8.f89331w
                r7 = 0
                r5.<init>(r3, r6, r2, r7)
                kotlinx.coroutines.flow.C0 r9 = kotlinx.coroutines.flow.C43175k.B(r5, r9)
                r8.f89326r = r7
                r8.f89325q = r4
                java.lang.Object r9 = kotlinx.coroutines.flow.C43175k.u(r8, r9, r1)
                if (r9 != r0) goto L72
                return r0
            L72:
                kotlin.G0 r9 = kotlin.G0.f406611a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.ai_assistant.screens.chat.mvi.interactor.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: AssistantChatInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.ai_assistant.screens.chat.mvi.interactor.AssistantChatInteractorImpl$sendMessage$1", f = "AssistantChatInteractor.kt", i = {0}, l = {191, 193, 192}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class b extends SuspendLambda implements p<InterfaceC43172j<? super AiAssistantInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f89336q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f89337r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ MessageSendFrom f89338s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ d f89339t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f89340u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f89341v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f89342w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ l<Vb.d> f89343x;

        /* compiled from: AssistantChatInteractor.kt */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0000H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/remote/model/TypedResult;", "LRb/m;", "", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction;", "<anonymous>", "(Lkotlin/Q;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.ai_assistant.screens.chat.mvi.interactor.AssistantChatInteractorImpl$sendMessage$1$1", f = "AssistantChatInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<Q<? extends TypedResult<Rb.m>, ? extends String>, Continuation<? super InterfaceC43160i<? extends AiAssistantInternalAction>>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f89344q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ d f89345r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ l<Vb.d> f89346s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ String f89347t;

            /* compiled from: AssistantChatInteractor.kt */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/G0;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction;", "<anonymous>", "(V)Lkotlinx/coroutines/flow/Flow;"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.ai_assistant.screens.chat.mvi.interactor.AssistantChatInteractorImpl$sendMessage$1$1$1", f = "AssistantChatInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.ai_assistant.screens.chat.mvi.interactor.d$b$a$a, reason: collision with other inner class name */
            public static final class C2649a extends SuspendLambda implements p<G0, Continuation<? super InterfaceC43160i<? extends AiAssistantInternalAction>>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public final /* synthetic */ d f89348q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ String f89349r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ C15348a f89350s;

                /* renamed from: t, reason: collision with root package name */
                public final /* synthetic */ l<Vb.d> f89351t;

                /* compiled from: AssistantChatInteractor.kt */
                @s0
                @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
                @DebugMetadata(c = "com.avito.android.ai_assistant.screens.chat.mvi.interactor.AssistantChatInteractorImpl$sendMessage$1$1$1$1", f = "AssistantChatInteractor.kt", i = {}, l = {234}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: com.avito.android.ai_assistant.screens.chat.mvi.interactor.d$b$a$a$a, reason: collision with other inner class name */
                public static final class C2650a extends SuspendLambda implements p<InterfaceC43172j<? super AiAssistantInternalAction>, Continuation<? super G0>, Object> {

                    /* renamed from: q, reason: collision with root package name */
                    public int f89352q;

                    /* renamed from: r, reason: collision with root package name */
                    public /* synthetic */ Object f89353r;

                    /* renamed from: s, reason: collision with root package name */
                    public final /* synthetic */ C15348a f89354s;

                    /* renamed from: t, reason: collision with root package name */
                    public final /* synthetic */ d f89355t;

                    /* renamed from: u, reason: collision with root package name */
                    public final /* synthetic */ String f89356u;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C2650a(C15348a c15348a, d dVar, String str, Continuation<? super C2650a> continuation) {
                        super(2, continuation);
                        this.f89354s = c15348a;
                        this.f89355t = dVar;
                        this.f89356u = str;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @k
                    public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                        C2650a c2650a = new C2650a(this.f89354s, this.f89355t, this.f89356u, continuation);
                        c2650a.f89353r = obj;
                        return c2650a;
                    }

                    @Override // Y41.p
                    public final Object invoke(InterfaceC43172j<? super AiAssistantInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
                        return ((C2650a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Y61.l
                    public final Object invokeSuspend(@k Object obj) {
                        OkRespDataSuccessElementsItem okRespDataSuccessElementsItem;
                        Object objPrevious;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i12 = this.f89352q;
                        if (i12 == 0) {
                            C42729a0.b(obj);
                            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f89353r;
                            ArrayList arrayList = this.f89354s.f15734a;
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
                            this.f89355t.f89323e.d(this.f89356u, okRespDataSuccessElementsItemMessage2 != null ? okRespDataSuccessElementsItemMessage2.getId() : null);
                            AiAssistantInternalAction.l lVar = AiAssistantInternalAction.l.f89267a;
                            this.f89352q = 1;
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
                public C2649a(d dVar, String str, C15348a c15348a, l<Vb.d> lVar, Continuation<? super C2649a> continuation) {
                    super(2, continuation);
                    this.f89348q = dVar;
                    this.f89349r = str;
                    this.f89350s = c15348a;
                    this.f89351t = lVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                    return new C2649a(this.f89348q, this.f89349r, this.f89350s, this.f89351t, continuation);
                }

                @Override // Y41.p
                public final Object invoke(G0 g02, Continuation<? super InterfaceC43160i<? extends AiAssistantInternalAction>> continuation) {
                    return ((C2649a) create(g02, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@k Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    C42729a0.b(obj);
                    C15348a c15348a = this.f89350s;
                    j.a aVar = new j.a(c15348a.f15735b.f15750a, null);
                    l<Vb.d> lVar = this.f89351t;
                    d dVar = this.f89348q;
                    String str = this.f89349r;
                    return new C43137a0(new C2650a(c15348a, dVar, str, null), dVar.d(str, false, aVar, lVar));
                }
            }

            /* compiled from: AssistantChatInteractor.kt */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.ai_assistant.screens.chat.mvi.interactor.AssistantChatInteractorImpl$sendMessage$1$1$2", f = "AssistantChatInteractor.kt", i = {}, l = {236}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.ai_assistant.screens.chat.mvi.interactor.d$b$a$b, reason: collision with other inner class name */
            public static final class C2651b extends SuspendLambda implements p<InterfaceC43172j<? super AiAssistantInternalAction>, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f89357q;

                /* renamed from: r, reason: collision with root package name */
                public /* synthetic */ Object f89358r;

                public C2651b() {
                    throw null;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                    C2651b c2651b = new C2651b(2, continuation);
                    c2651b.f89358r = obj;
                    return c2651b;
                }

                @Override // Y41.p
                public final Object invoke(InterfaceC43172j<? super AiAssistantInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
                    return ((C2651b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f89357q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f89358r;
                        AiAssistantInternalAction.i iVar = AiAssistantInternalAction.i.f89262a;
                        this.f89357q = 1;
                        if (interfaceC43172j.emit(iVar, this) == coroutine_suspended) {
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
            public a(d dVar, l<Vb.d> lVar, String str, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f89345r = dVar;
                this.f89346s = lVar;
                this.f89347t = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                a aVar = new a(this.f89345r, this.f89346s, this.f89347t, continuation);
                aVar.f89344q = obj;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(Q<? extends TypedResult<Rb.m>, ? extends String> q12, Continuation<? super InterfaceC43160i<? extends AiAssistantInternalAction>> continuation) {
                return ((a) create(q12, continuation)).invokeSuspend(G0.f406611a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:119:0x0398  */
            /* JADX WARN: Removed duplicated region for block: B:149:0x039b A[SYNTHETIC] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r36) {
                /*
                    Method dump skipped, instructions count: 1220
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.ai_assistant.screens.chat.mvi.interactor.d.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(MessageSendFrom messageSendFrom, d dVar, String str, String str2, String str3, l<Vb.d> lVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f89338s = messageSendFrom;
            this.f89339t = dVar;
            this.f89340u = str;
            this.f89341v = str2;
            this.f89342w = str3;
            this.f89343x = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
            b bVar = new b(this.f89338s, this.f89339t, this.f89340u, this.f89341v, this.f89342w, this.f89343x, continuation);
            bVar.f89337r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super AiAssistantInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0074 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r8.f89336q
                java.lang.String r2 = r8.f89340u
                com.avito.android.ai_assistant.screens.chat.mvi.interactor.d r3 = r8.f89339t
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L31
                if (r1 == r6) goto L29
                if (r1 == r5) goto L21
                if (r1 != r4) goto L19
                kotlin.C42729a0.b(r9)
                goto L75
            L19:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L21:
                java.lang.Object r1 = r8.f89337r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r9)
                goto L5c
            L29:
                java.lang.Object r1 = r8.f89337r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r9)
                goto L4b
            L31:
                kotlin.C42729a0.b(r9)
                java.lang.Object r9 = r8.f89337r
                kotlinx.coroutines.flow.j r9 = (kotlinx.coroutines.flow.InterfaceC43172j) r9
                com.avito.android.ai_assistant.screens.chat.mvi.entity.AiAssistantInternalAction$t r1 = new com.avito.android.ai_assistant.screens.chat.mvi.entity.AiAssistantInternalAction$t
                com.avito.android.ai_assistant.model.MessageSendFrom r7 = r8.f89338s
                r1.<init>(r7)
                r8.f89337r = r9
                r8.f89336q = r6
                java.lang.Object r1 = r9.emit(r1, r8)
                if (r1 != r0) goto L4a
                return r0
            L4a:
                r1 = r9
            L4b:
                com.avito.android.ai_assistant.screens.chat.use_case.m r9 = r3.f89322d
                r8.f89337r = r1
                r8.f89336q = r5
                java.lang.String r5 = r8.f89341v
                java.lang.String r6 = r8.f89342w
                java.lang.Object r9 = r9.a(r2, r5, r6, r8)
                if (r9 != r0) goto L5c
                return r0
            L5c:
                kotlinx.coroutines.flow.i r9 = (kotlinx.coroutines.flow.InterfaceC43160i) r9
                com.avito.android.ai_assistant.screens.chat.mvi.interactor.d$b$a r5 = new com.avito.android.ai_assistant.screens.chat.mvi.interactor.d$b$a
                com.avito.android.arch.mvi.utils.l<Vb.d> r6 = r8.f89343x
                r7 = 0
                r5.<init>(r3, r6, r2, r7)
                kotlinx.coroutines.flow.C0 r9 = kotlinx.coroutines.flow.C43175k.B(r5, r9)
                r8.f89337r = r7
                r8.f89336q = r4
                java.lang.Object r9 = kotlinx.coroutines.flow.C43175k.u(r8, r9, r1)
                if (r9 != r0) goto L75
                return r0
            L75:
                kotlin.G0 r9 = kotlin.G0.f406611a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.ai_assistant.screens.chat.mvi.interactor.d.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: AssistantChatInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.ai_assistant.screens.chat.mvi.interactor.AssistantChatInteractorImpl$startChat$1", f = "AssistantChatInteractor.kt", i = {0}, l = {77, 79, 78}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class c extends SuspendLambda implements p<InterfaceC43172j<? super AiAssistantInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f89359q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f89360r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f89362t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f89363u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ l<Vb.d> f89364v;

        /* compiled from: AssistantChatInteractor.kt */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0000H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/remote/model/TypedResult;", "LOb/a;", "", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction;", "<anonymous>", "(Lkotlin/Q;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.ai_assistant.screens.chat.mvi.interactor.AssistantChatInteractorImpl$startChat$1$1", f = "AssistantChatInteractor.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<Q<? extends TypedResult<C14667a>, ? extends String>, Continuation<? super InterfaceC43160i<? extends AiAssistantInternalAction>>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public Object[] f89365q;

            /* renamed from: r, reason: collision with root package name */
            public int f89366r;

            /* renamed from: s, reason: collision with root package name */
            public int f89367s;

            /* renamed from: t, reason: collision with root package name */
            public /* synthetic */ Object f89368t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ d f89369u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ l<Vb.d> f89370v;

            /* compiled from: AssistantChatInteractor.kt */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "LQb/m;", "chatHistory", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction;", "<anonymous>", "(Lcom/avito/android/remote/model/TypedResult;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.ai_assistant.screens.chat.mvi.interactor.AssistantChatInteractorImpl$startChat$1$1$1", f = "AssistantChatInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.ai_assistant.screens.chat.mvi.interactor.d$c$a$a, reason: collision with other inner class name */
            public static final class C2652a extends SuspendLambda implements p<TypedResult<Qb.m>, Continuation<? super InterfaceC43160i<? extends AiAssistantInternalAction>>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f89371q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ d f89372r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ l<Vb.d> f89373s;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C2652a(d dVar, l<Vb.d> lVar, Continuation<? super C2652a> continuation) {
                    super(2, continuation);
                    this.f89372r = dVar;
                    this.f89373s = lVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                    C2652a c2652a = new C2652a(this.f89372r, this.f89373s, continuation);
                    c2652a.f89371q = obj;
                    return c2652a;
                }

                @Override // Y41.p
                public final Object invoke(TypedResult<Qb.m> typedResult, Continuation<? super InterfaceC43160i<? extends AiAssistantInternalAction>> continuation) {
                    return ((C2652a) create(typedResult, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@k Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    C42729a0.b(obj);
                    TypedResult typedResult = (TypedResult) this.f89371q;
                    if (typedResult instanceof TypedResult.Success) {
                        return d.e(this.f89372r, (TypedResult.Success) typedResult, this.f89373s, null);
                    }
                    if (typedResult instanceof TypedResult.Error) {
                        return new C43210w(new AiAssistantInternalAction.e(((TypedResult.Error) typedResult).getError()));
                    }
                    throw new NoWhenBranchMatchedException();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar, l<Vb.d> lVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f89369u = dVar;
                this.f89370v = lVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                a aVar = new a(this.f89369u, this.f89370v, continuation);
                aVar.f89368t = obj;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(Q<? extends TypedResult<C14667a>, ? extends String> q12, Continuation<? super InterfaceC43160i<? extends AiAssistantInternalAction>> continuation) {
                return ((a) create(q12, continuation)).invokeSuspend(G0.f406611a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@k Object obj) {
                InterfaceC43160i[] interfaceC43160iArr;
                InterfaceC43160i[] interfaceC43160iArr2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f89367s;
                d dVar = this.f89369u;
                int i13 = 1;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    Q q12 = (Q) this.f89368t;
                    TypedResult typedResult = (TypedResult) q12.f406619b;
                    String str = (String) q12.f406620c;
                    if (!(typedResult instanceof TypedResult.Success)) {
                        if (typedResult instanceof TypedResult.Error) {
                            return new C43210w(new AiAssistantInternalAction.j(((TypedResult.Error) typedResult).getError(), str));
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    InterfaceC43160i[] interfaceC43160iArr3 = new InterfaceC43160i[2];
                    TypedResult.Success success = (TypedResult.Success) typedResult;
                    interfaceC43160iArr3[0] = new C43210w(new AiAssistantInternalAction.k(((C14667a) success.getResult()).getId(), ((C14667a) success.getResult()).getNewChatButtonContext()));
                    com.avito.android.ai_assistant.screens.chat.use_case.a aVar = dVar.f89321c;
                    String id2 = ((C14667a) success.getResult()).getId();
                    this.f89368t = interfaceC43160iArr3;
                    this.f89365q = interfaceC43160iArr3;
                    this.f89366r = 1;
                    this.f89367s = 1;
                    Object objA = aVar.a(id2, null, this);
                    if (objA == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    interfaceC43160iArr = interfaceC43160iArr3;
                    obj = objA;
                    interfaceC43160iArr2 = interfaceC43160iArr;
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i13 = this.f89366r;
                    interfaceC43160iArr = (InterfaceC43160i[]) this.f89365q;
                    interfaceC43160iArr2 = (InterfaceC43160i[]) this.f89368t;
                    C42729a0.b(obj);
                }
                interfaceC43160iArr[i13] = C43175k.B(new C2652a(dVar, this.f89370v, null), (InterfaceC43160i) obj);
                return C43175k.N(interfaceC43160iArr2);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, l<Vb.d> lVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f89362t = str;
            this.f89363u = str2;
            this.f89364v = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
            c cVar = d.this.new c(this.f89362t, this.f89363u, this.f89364v, continuation);
            cVar.f89360r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super AiAssistantInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x006d A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.f89359q
                com.avito.android.ai_assistant.screens.chat.mvi.interactor.d r2 = com.avito.android.ai_assistant.screens.chat.mvi.interactor.d.this
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L2f
                if (r1 == r5) goto L27
                if (r1 == r4) goto L1f
                if (r1 != r3) goto L17
                kotlin.C42729a0.b(r8)
                goto L6e
            L17:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1f:
                java.lang.Object r1 = r7.f89360r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L55
            L27:
                java.lang.Object r1 = r7.f89360r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L44
            L2f:
                kotlin.C42729a0.b(r8)
                java.lang.Object r8 = r7.f89360r
                kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.InterfaceC43172j) r8
                com.avito.android.ai_assistant.screens.chat.mvi.entity.AiAssistantInternalAction$n r1 = com.avito.android.ai_assistant.screens.chat.mvi.entity.AiAssistantInternalAction.n.f89270a
                r7.f89360r = r8
                r7.f89359q = r5
                java.lang.Object r1 = r8.emit(r1, r7)
                if (r1 != r0) goto L43
                return r0
            L43:
                r1 = r8
            L44:
                com.avito.android.ai_assistant.screens.chat.use_case.e r8 = r2.f89320b
                r7.f89360r = r1
                r7.f89359q = r4
                java.lang.String r4 = r7.f89362t
                java.lang.String r5 = r7.f89363u
                java.lang.Object r8 = r8.a(r4, r5, r7)
                if (r8 != r0) goto L55
                return r0
            L55:
                kotlinx.coroutines.flow.i r8 = (kotlinx.coroutines.flow.InterfaceC43160i) r8
                com.avito.android.ai_assistant.screens.chat.mvi.interactor.d$c$a r4 = new com.avito.android.ai_assistant.screens.chat.mvi.interactor.d$c$a
                com.avito.android.arch.mvi.utils.l<Vb.d> r5 = r7.f89364v
                r6 = 0
                r4.<init>(r2, r5, r6)
                kotlinx.coroutines.flow.C0 r8 = kotlinx.coroutines.flow.C43175k.B(r4, r8)
                r7.f89360r = r6
                r7.f89359q = r3
                java.lang.Object r8 = kotlinx.coroutines.flow.C43175k.u(r7, r8, r1)
                if (r8 != r0) goto L6e
                return r0
            L6e:
                kotlin.G0 r8 = kotlin.G0.f406611a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.ai_assistant.screens.chat.mvi.interactor.d.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: AssistantChatInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.ai_assistant.screens.chat.mvi.interactor.AssistantChatInteractorImpl$toggleFavoriteStatus$1", f = "AssistantChatInteractor.kt", i = {0}, l = {264, 266}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    /* renamed from: com.avito.android.ai_assistant.screens.chat.mvi.interactor.d$d, reason: collision with other inner class name */
    public static final class C2653d extends SuspendLambda implements p<InterfaceC43172j<? super AiAssistantInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f89374q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f89375r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f89377t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f89378u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ boolean f89379v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2653d(String str, String str2, boolean z12, Continuation<? super C2653d> continuation) {
            super(2, continuation);
            this.f89377t = str;
            this.f89378u = str2;
            this.f89379v = z12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
            C2653d c2653d = d.this.new C2653d(this.f89377t, this.f89378u, this.f89379v, continuation);
            c2653d.f89375r = obj;
            return c2653d;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super AiAssistantInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C2653d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f89374q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f89375r;
                I iG2 = d.this.f89324f.g(this.f89377t, new AbstractC30567a.C4547a(this.f89378u), this.f89379v, null, null, (2016 & 32) != 0 ? null : null, (2016 & 64) != 0 ? null : null, (2016 & 128) != 0 ? null : null, (2016 & 256) != 0 ? null : null, (2016 & 512) != 0 ? null : null, (2016 & 1024) != 0);
                this.f89375r = interfaceC43172j;
                this.f89374q = 1;
                if (C43292o.b(iG2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f89375r;
                C42729a0.b(obj);
            }
            AiAssistantInternalAction.p pVar = AiAssistantInternalAction.p.f89272a;
            this.f89375r = null;
            this.f89374q = 2;
            if (interfaceC43172j.emit(pVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    @Inject
    public d(@k f fVar, @k com.avito.android.ai_assistant.screens.chat.use_case.e eVar, @k com.avito.android.ai_assistant.screens.chat.use_case.a aVar, @k m mVar, @k InterfaceC14183a interfaceC14183a, @k com.avito.android.favorite.h hVar) {
        this.f89319a = fVar;
        this.f89320b = eVar;
        this.f89321c = aVar;
        this.f89322d = mVar;
        this.f89323e = interfaceC14183a;
        this.f89324f = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0388 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v12, types: [com.avito.android.ai_assistant.model.OkRespDataSuccessElementsItem$OkRespDataSuccessElementsItemMessage] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlinx.coroutines.flow.internal.m e(com.avito.android.ai_assistant.screens.chat.mvi.interactor.d r33, com.avito.android.remote.model.TypedResult.Success r34, com.avito.android.arch.mvi.utils.l r35, Tb.j r36) {
        /*
            Method dump skipped, instructions count: 1287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.ai_assistant.screens.chat.mvi.interactor.d.e(com.avito.android.ai_assistant.screens.chat.mvi.interactor.d, com.avito.android.remote.model.TypedResult$Success, com.avito.android.arch.mvi.utils.l, Tb.j):kotlinx.coroutines.flow.internal.m");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void f(l lVar, long j12, long j13) {
        Long lValueOf = Long.valueOf(j12);
        if (j12 >= ((Vb.d) lVar.getValue()).f17234a.f17264a && ((Vb.d) lVar.getValue()).f17234a.f17264a != 0) {
            lValueOf = null;
        }
        long jLongValue = lValueOf != null ? lValueOf.longValue() : ((Vb.d) lVar.getValue()).f17234a.f17264a;
        Long lValueOf2 = (j13 > ((Vb.d) lVar.getValue()).f17234a.f17265b || ((Vb.d) lVar.getValue()).f17234a.f17265b == 0) ? Long.valueOf(j13) : null;
        long jLongValue2 = lValueOf2 != null ? lValueOf2.longValue() : ((Vb.d) lVar.getValue()).f17234a.f17265b;
        Vb.d dVar = (Vb.d) lVar.getValue();
        ((Vb.d) lVar.getValue()).f17234a.getClass();
        Vb.l lVar2 = new Vb.l(jLongValue, jLongValue2);
        dVar.getClass();
        lVar.setValue(new Vb.d(lVar2));
    }

    @Override // com.avito.android.ai_assistant.screens.chat.mvi.interactor.a
    @k
    public final InterfaceC43160i<AiAssistantInternalAction> a(@k String str, @Y61.l String str2, @k l<Vb.d> lVar) {
        return C43175k.G(new c(str, str2, lVar, null));
    }

    @Override // com.avito.android.ai_assistant.screens.chat.mvi.interactor.a
    @k
    public final InterfaceC43160i b(@k String str, @Y61.l String str2, boolean z12) {
        return C43175k.G(new C2653d(str, str2, z12, null));
    }

    @Override // com.avito.android.ai_assistant.screens.chat.mvi.interactor.a
    @k
    public final InterfaceC43160i<AiAssistantInternalAction> c(@k String str, @k String str2, @Y61.l String str3, @k MessageSendFrom messageSendFrom, @k l<Vb.d> lVar) {
        return C43175k.G(new b(messageSendFrom, this, str, str2, str3, lVar, null));
    }

    @Override // com.avito.android.ai_assistant.screens.chat.mvi.interactor.a
    @k
    public final InterfaceC43160i<AiAssistantInternalAction> d(@k String str, boolean z12, @Y61.l j jVar, @k l<Vb.d> lVar) {
        return C43175k.G(new a(z12, this, str, jVar, lVar, null));
    }
}
