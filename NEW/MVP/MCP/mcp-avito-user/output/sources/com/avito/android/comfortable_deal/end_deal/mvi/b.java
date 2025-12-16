package com.avito.android.comfortable_deal.end_deal.mvi;

import Hp.InterfaceC14016a;
import Y41.p;
import com.avito.android.comfortable_deal.end_deal.mvi.entity.EndDealInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.channels.I0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: EndDealActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/I0;", "Lcom/avito/android/comfortable_deal/end_deal/mvi/entity/EndDealInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.comfortable_deal.end_deal.mvi.EndDealActor$process$2", f = "EndDealActor.kt", i = {0}, l = {87}, m = "invokeSuspend", n = {"$this$channelFlow"}, s = {"L$0"})
/* loaded from: classes12.dex */
final class b extends SuspendLambda implements p<I0<? super EndDealInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f122288q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f122289r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC14016a f122290s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e f122291t;

    /* compiled from: EndDealActor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.comfortable_deal.end_deal.mvi.EndDealActor$process$2$1", f = "EndDealActor.kt", i = {}, l = {92, 94}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f122292q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Integer f122293r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ e f122294s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ I0<EndDealInternalAction> f122295t;

        /* compiled from: EndDealActor.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.comfortable_deal.end_deal.mvi.b$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C3616a extends H implements p<EndDealInternalAction, Continuation<? super G0>, Object>, SuspendFunction {
            @Override // Y41.p
            public final Object invoke(EndDealInternalAction endDealInternalAction, Continuation<? super G0> continuation) {
                return ((I0) this.receiver).send(endDealInternalAction, continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Integer num, e eVar, I0<? super EndDealInternalAction> i02, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f122293r = num;
            this.f122294s = eVar;
            this.f122295t = i02;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f122293r, this.f122294s, this.f122295t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f122292q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f122292q = 1;
                if (C43131e0.b(200L, this) == coroutine_suspended) {
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
                C42729a0.b(obj);
            }
            Integer num = this.f122293r;
            if (num != null) {
                InterfaceC43160i<EndDealInternalAction> interfaceC43160iA = this.f122294s.f122308a.a(num.intValue());
                C3616a c3616a = new C3616a(2, this.f122295t, I0.class, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                this.f122292q = 2;
                if (C43175k.j(interfaceC43160iA, c3616a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InterfaceC14016a interfaceC14016a, e eVar, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f122290s = interfaceC14016a;
        this.f122291t = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f122290s, this.f122291t, continuation);
        bVar.f122289r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(I0<? super EndDealInternalAction> i02, Continuation<? super G0> continuation) {
        return ((b) create(i02, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        I0 i02;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f122288q;
        InterfaceC14016a interfaceC14016a = this.f122290s;
        if (i12 == 0) {
            C42729a0.b(obj);
            I0 i03 = (I0) this.f122289r;
            InterfaceC14016a.j jVar = (InterfaceC14016a.j) interfaceC14016a;
            EndDealInternalAction.UpdateInputValue updateInputValue = new EndDealInternalAction.UpdateInputValue(jVar.f7722a, jVar.f7723b);
            this.f122289r = i03;
            this.f122288q = 1;
            if (i03.send(updateInputValue, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            i02 = i03;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i02 = (I0) this.f122289r;
            C42729a0.b(obj);
        }
        InterfaceC14016a.j jVar2 = (InterfaceC14016a.j) interfaceC14016a;
        if (L.f(jVar2.f7722a, "agentCommission")) {
            e eVar = this.f122291t;
            N0 n02 = eVar.f122310c;
            if (n02 != null) {
                ((V0) n02).c(null);
            }
            Integer numY0 = C43066x.y0(jVar2.f7723b);
            if (numY0 == null || numY0.intValue() < 1000) {
                numY0 = null;
            }
            eVar.f122310c = C43259k.d(i02, null, null, new a(numY0, eVar, i02, null), 3);
        }
        return G0.f406611a;
    }
}
