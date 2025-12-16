package com.avito.android.ai_assistant.screens.chat.mvi;

import Jb.InterfaceC14183a;
import Tb.j;
import Vb.InterfaceC15661a;
import com.avito.android.ai_assistant.adapter.segment_buttons.a;
import com.avito.android.ai_assistant.model.MessageSendFrom;
import com.avito.android.ai_assistant.screens.chat.mvi.entity.AiAssistantInternalAction;
import com.avito.android.arch.mvi.utils.o;
import com.avito.android.clientEventBus.ConnectionState;
import com.avito.android.deep_linking.links.AdvertDetailsLink;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: AiAssistantChatActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LVb/a;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction;", "LVb/i;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.ai_assistant.screens.chat.mvi.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28362a implements com.avito.android.arch.mvi.a<InterfaceC15661a, AiAssistantInternalAction, Vb.i> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.ai_assistant.screens.chat.mvi.interactor.a f89205a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.ai_assistant.screens.chat.mvi.interactor.f f89206b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.ai_assistant.screens.chat.use_case.j f89207c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.clientEventBus.a f89208d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final s f89209e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14183a f89210f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Vb.e f89211g;

    /* compiled from: AiAssistantChatActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.ai_assistant.screens.chat.mvi.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C2646a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f89212a;

        static {
            int[] iArr = new int[ConnectionState.values().length];
            try {
                ConnectionState connectionState = ConnectionState.f118528b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f89212a = iArr;
        }
    }

    /* compiled from: AiAssistantChatActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.ai_assistant.screens.chat.mvi.AiAssistantChatActor$process$3", f = "AiAssistantChatActor.kt", i = {}, l = {89}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.ai_assistant.screens.chat.mvi.a$b */
    public static final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super AiAssistantInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f89213q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f89214r;

        public b() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(2, continuation);
            bVar.f89214r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super AiAssistantInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f89213q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f89214r;
                AiAssistantInternalAction.b bVar = AiAssistantInternalAction.b.f89253a;
                this.f89213q = 1;
                if (interfaceC43172j.emit(bVar, this) == coroutine_suspended) {
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

    /* compiled from: AiAssistantChatActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.ai_assistant.screens.chat.mvi.AiAssistantChatActor$process$4", f = "AiAssistantChatActor.kt", i = {0, 0}, l = {135, 136}, m = "invokeSuspend", n = {"$this$flow", "mutableState"}, s = {"L$0", "L$1"})
    /* renamed from: com.avito.android.ai_assistant.screens.chat.mvi.a$c */
    public static final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super AiAssistantInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public com.avito.android.arch.mvi.utils.l f89215q;

        /* renamed from: r, reason: collision with root package name */
        public int f89216r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f89217s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ InterfaceC15661a f89218t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ C28362a f89219u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Vb.i f89220v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC15661a interfaceC15661a, C28362a c28362a, Vb.i iVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f89218t = interfaceC15661a;
            this.f89219u = c28362a;
            this.f89220v = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = new c(this.f89218t, this.f89219u, this.f89220v, continuation);
            cVar.f89217s = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super AiAssistantInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            com.avito.android.arch.mvi.utils.l<Vb.d> lVarA;
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f89216r;
            C28362a c28362a = this.f89219u;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j2 = (InterfaceC43172j) this.f89217s;
                lVarA = c28362a.f89211g.a(this.f89218t);
                AiAssistantInternalAction.v vVar = AiAssistantInternalAction.v.f89281a;
                this.f89217s = interfaceC43172j2;
                this.f89215q = lVarA;
                this.f89216r = 1;
                if (interfaceC43172j2.emit(vVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                interfaceC43172j = interfaceC43172j2;
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                lVarA = this.f89215q;
                interfaceC43172j = (InterfaceC43172j) this.f89217s;
                C42729a0.b(obj);
            }
            com.avito.android.ai_assistant.screens.chat.mvi.interactor.a aVar = c28362a.f89205a;
            String str = this.f89220v.f17250c;
            if (str == null) {
                str = "";
            }
            InterfaceC43160i<AiAssistantInternalAction> interfaceC43160iD = aVar.d(str, false, new j.a(lVarA.getValue().f17234a.f17265b, null), lVarA);
            this.f89217s = null;
            this.f89215q = null;
            this.f89216r = 2;
            if (C43175k.u(this, interfaceC43160iD, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    @Inject
    public C28362a(@Y61.k com.avito.android.ai_assistant.screens.chat.mvi.interactor.a aVar, @Y61.k com.avito.android.ai_assistant.screens.chat.mvi.interactor.f fVar, @Y61.k com.avito.android.ai_assistant.screens.chat.use_case.j jVar, @Y61.k com.avito.android.clientEventBus.a aVar2, @Y61.k s sVar, @Y61.k InterfaceC14183a interfaceC14183a, @Y61.k Vb.e eVar) {
        this.f89205a = aVar;
        this.f89206b = fVar;
        this.f89207c = jVar;
        this.f89208d = aVar2;
        this.f89209e = sVar;
        this.f89210f = interfaceC14183a;
        this.f89211g = eVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        this.f89209e.getClass();
        Vb.e eVar = this.f89211g;
        eVar.getClass();
        return C43175k.N(C43175k.Y(new r(eVar.f17235b.f92113b), new l(3, null)), C43175k.Y(C43175k.r(kotlinx.coroutines.rx3.y.a(this.f89208d.a())), new C28365d(aVar, this, null)), C43175k.C(new m(aVar, this, null), c43197r1), C43175k.h(new p(new k(c43197r1), this, aVar, null)));
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<AiAssistantInternalAction> b(@Y61.k InterfaceC15661a interfaceC15661a, @Y61.k Vb.i iVar) {
        C43210w c43210w;
        InterfaceC43160i<AiAssistantInternalAction> interfaceC43160iC;
        if (interfaceC15661a instanceof InterfaceC15661a.o) {
            return new C43210w(new AiAssistantInternalAction.A(((InterfaceC15661a.o) interfaceC15661a).f17230a));
        }
        if (interfaceC15661a instanceof InterfaceC15661a.e) {
            return C43175k.G(new b(2, null));
        }
        boolean z12 = interfaceC15661a instanceof InterfaceC15661a.d;
        InterfaceC14183a interfaceC14183a = this.f89210f;
        if (z12) {
            interfaceC14183a.b(null, "chat", "back");
            c43210w = new C43210w(new AiAssistantInternalAction.h(iVar.f17255h));
        } else {
            boolean z13 = interfaceC15661a instanceof InterfaceC15661a.b;
            String str = iVar.f17250c;
            if (z13) {
                InterfaceC15661a.b bVar = (InterfaceC15661a.b) interfaceC15661a;
                if (str == null) {
                    str = "";
                }
                return new C43210w(new AiAssistantInternalAction.c(bVar.f17214a, str));
            }
            if (interfaceC15661a instanceof InterfaceC15661a.C1189a) {
                return new C43210w(new AiAssistantInternalAction.C28367a(((InterfaceC15661a.C1189a) interfaceC15661a).f17213a));
            }
            boolean z14 = interfaceC15661a instanceof InterfaceC15661a.j;
            Vb.k kVar = iVar.f17253f;
            com.avito.android.ai_assistant.screens.chat.mvi.interactor.a aVar = this.f89205a;
            Vb.e eVar = this.f89211g;
            if (z14) {
                o.a aVarA = eVar.a(interfaceC15661a);
                if (str == null) {
                    return aVar.a(iVar.f17252e, kVar.f17262a, aVarA);
                }
                return aVar.d(str, true, null, aVarA);
            }
            if (interfaceC15661a instanceof InterfaceC15661a.i) {
                return C43175k.G(new c(interfaceC15661a, this, iVar, null));
            }
            if (interfaceC15661a instanceof InterfaceC15661a.f) {
                o.a aVarA2 = eVar.a(interfaceC15661a);
                if (!((InterfaceC15661a.f) interfaceC15661a).f17218a) {
                    if (str == null) {
                        str = "";
                    }
                    return aVar.d(str, false, new j.b(((Vb.d) aVarA2.getValue()).f17234a.f17264a, null), eVar.a(interfaceC15661a));
                }
                c43210w = new C43210w(AiAssistantInternalAction.r.f89275a);
            } else if (interfaceC15661a instanceof InterfaceC15661a.c) {
                interfaceC14183a.b(null, "chat", "history");
                if (str == null) {
                    str = "";
                }
                c43210w = new C43210w(new AiAssistantInternalAction.f(str, iVar.f17251d));
            } else {
                if (interfaceC15661a instanceof InterfaceC15661a.g) {
                    return C43175k.G(new n(iVar, this, null));
                }
                boolean z15 = interfaceC15661a instanceof InterfaceC15661a.n;
                String str2 = iVar.f17250c;
                if (z15) {
                    if (str == null) {
                        str = "";
                    }
                    interfaceC14183a.a(str);
                    Vb.m mVar = iVar.f17249b;
                    String str3 = mVar.f17267b;
                    if (str3 != null && !C43066x.K(str3)) {
                        eVar.getClass();
                        o.a aVar2 = eVar.f17235b.f92114c;
                        MessageSendFrom messageSendFrom = MessageSendFrom.f89113b;
                        String str4 = str2 == null ? "" : str2;
                        String str5 = mVar.f17267b;
                        return this.f89205a.c(str4, C43066x.A0(str5 != null ? str5 : "").toString(), kVar.f17263b, messageSendFrom, aVar2);
                    }
                    c43210w = new C43210w(AiAssistantInternalAction.p.f89272a);
                } else {
                    if (interfaceC15661a instanceof InterfaceC15661a.l) {
                        ArrayList<a.b> arrayList = ((InterfaceC15661a.l) interfaceC15661a).f17226a.f88855c;
                        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
                        for (a.b bVar2 : arrayList) {
                            if (bVar2 instanceof a.b.C2620a) {
                                interfaceC43160iC = new C43210w(new AiAssistantInternalAction.w((a.b.C2620a) bVar2));
                            } else {
                                if (!(bVar2 instanceof a.b.C2621b)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                eVar.getClass();
                                o.a aVar3 = eVar.f17235b.f92114c;
                                MessageSendFrom messageSendFrom2 = MessageSendFrom.f89114c;
                                String str6 = ((a.b.C2621b) bVar2).f88857a;
                                String str7 = str2 == null ? "" : str2;
                                if (str6 == null) {
                                    str6 = "";
                                }
                                interfaceC43160iC = this.f89205a.c(str7, C43066x.A0(str6).toString(), kVar.f17263b, messageSendFrom2, aVar3);
                            }
                            arrayList2.add(interfaceC43160iC);
                        }
                        return C43175k.M(arrayList2);
                    }
                    if (!(interfaceC15661a instanceof InterfaceC15661a.m)) {
                        if (!(interfaceC15661a instanceof InterfaceC15661a.k)) {
                            return C43175k.w();
                        }
                        com.avito.android.ai_assistant.adapter.simple_snippet.c cVar = ((InterfaceC15661a.k) interfaceC15661a).f17225a;
                        DeepLink deepLink = cVar.f88887k;
                        AdvertDetailsLink advertDetailsLink = deepLink instanceof AdvertDetailsLink ? (AdvertDetailsLink) deepLink : null;
                        return aVar.b(cVar.f88888l, advertDetailsLink != null ? advertDetailsLink.f132948c : null, cVar.f88886j);
                    }
                    DeepLink deepLink2 = ((InterfaceC15661a.m) interfaceC15661a).f17228a.f88851e;
                    if (deepLink2 != null) {
                        return new C43210w(new AiAssistantInternalAction.x(deepLink2));
                    }
                    c43210w = new C43210w(AiAssistantInternalAction.p.f89272a);
                }
            }
        }
        return c43210w;
    }
}
