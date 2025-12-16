package com.avito.android.ai_assistant.screens.chat.mvi;

import Tb.f;
import Vb.InterfaceC15661a;
import com.avito.android.ai_assistant.model.ReactionState;
import com.avito.android.ai_assistant.screens.chat.mvi.entity.AiAssistantInternalAction;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.channels.I0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: AiAssistantChatActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/I0;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.ai_assistant.screens.chat.mvi.AiAssistantChatActor$processOnMessageAction$1", f = "AiAssistantChatActor.kt", i = {0}, l = {288}, m = "invokeSuspend", n = {"reactionsJobsMap"}, s = {"L$0"})
/* loaded from: classes11.dex */
final class p extends SuspendLambda implements Y41.p<I0<? super AiAssistantInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f89420q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f89421r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ k f89422s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C28362a f89423t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Y41.a<Vb.i> f89424u;

    /* compiled from: AiAssistantChatActor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LVb/a$h;", "action", "Lkotlin/G0;", "emit", "(LVb/a$h;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ConcurrentHashMap<String, N0> f89425b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C28362a f89426c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ I0<AiAssistantInternalAction> f89427d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Y41.a<Vb.i> f89428e;

        /* JADX WARN: Multi-variable type inference failed */
        public a(ConcurrentHashMap<String, N0> concurrentHashMap, C28362a c28362a, I0<? super AiAssistantInternalAction> i02, Y41.a<Vb.i> aVar) {
            this.f89425b = concurrentHashMap;
            this.f89426c = c28362a;
            this.f89427d = i02;
            this.f89428e = aVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            InterfaceC15661a.h hVar = (InterfaceC15661a.h) obj;
            boolean z12 = hVar.f17222c instanceof f.c;
            C28362a c28362a = this.f89426c;
            if (z12) {
                ConcurrentHashMap<String, N0> concurrentHashMap = this.f89425b;
                String str = hVar.f17220a;
                N0 n02 = concurrentHashMap.get(str);
                if (n02 != null) {
                    n02.c(null);
                }
                f.c cVar = (f.c) hVar.f17222c;
                String str2 = this.f89428e.invoke().f17250c;
                if (str2 == null) {
                    str2 = "";
                }
                c28362a.getClass();
                ReactionState reactionState = hVar.f17221b;
                I0<AiAssistantInternalAction> i02 = this.f89427d;
                String str3 = hVar.f17220a;
                concurrentHashMap.put(str3, C43259k.d(i02, null, null, new C28364c(cVar, reactionState, i02, str3, c28362a, str2, null), 3));
                N0 n03 = concurrentHashMap.get(str);
                if (n03 != null) {
                    n03.k(new o(concurrentHashMap, hVar));
                }
            } else {
                c28362a.getClass();
                I0<AiAssistantInternalAction> i03 = this.f89427d;
                C43259k.d(i03, null, null, new C28363b(i03, null), 3);
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(k kVar, C28362a c28362a, Y41.a aVar, Continuation continuation) {
        super(2, continuation);
        this.f89422s = kVar;
        this.f89423t = c28362a;
        this.f89424u = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        p pVar = new p(this.f89422s, this.f89423t, this.f89424u, continuation);
        pVar.f89421r = obj;
        return pVar;
    }

    @Override // Y41.p
    public final Object invoke(I0<? super AiAssistantInternalAction> i02, Continuation<? super G0> continuation) {
        return ((p) create(i02, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) throws Throwable {
        ConcurrentHashMap concurrentHashMap;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f89420q;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            concurrentHashMap = (ConcurrentHashMap) this.f89421r;
            try {
                C42729a0.b(obj);
                concurrentHashMap.clear();
                return G0.f406611a;
            } catch (Throwable th2) {
                th = th2;
                concurrentHashMap.clear();
                throw th;
            }
        }
        C42729a0.b(obj);
        I0 i02 = (I0) this.f89421r;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        try {
            k kVar = this.f89422s;
            a aVar = new a(concurrentHashMap2, this.f89423t, i02, this.f89424u);
            this.f89421r = concurrentHashMap2;
            this.f89420q = 1;
            if (kVar.collect(aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            concurrentHashMap = concurrentHashMap2;
            concurrentHashMap.clear();
            return G0.f406611a;
        } catch (Throwable th3) {
            th = th3;
            concurrentHashMap = concurrentHashMap2;
            concurrentHashMap.clear();
            throw th;
        }
    }
}
