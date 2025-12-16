package com.avito.android.screens.bbip_private_v2.mvi;

import Y41.p;
import androidx.compose.runtime.internal.P;
import com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2InternalAction;
import com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State;
import hh.InterfaceC40933a;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43207v;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import tp0.InterfaceC48700a;

/* compiled from: BbipPrivateV2Actor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/screens/bbip_private_v2/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "Ltp0/a;", "Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction;", "Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2State;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC48700a, BbipPrivateV2InternalAction, BbipPrivateV2State> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f260941a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.screens.bbip_private_v2.domain.a f260942b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.screens.bbip_private_v2.domain.e f260943c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.screens.bbip_private_v2.domain.c f260944d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.screens.bbip_private_v2.data.a f260945e;

    /* compiled from: BbipPrivateV2Actor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.screens.bbip_private_v2.mvi.BbipPrivateV2Actor$process$1", f = "BbipPrivateV2Actor.kt", i = {}, l = {61}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.screens.bbip_private_v2.mvi.a$a, reason: collision with other inner class name */
    public static final class C7817a extends SuspendLambda implements p<InterfaceC43172j<? super BbipPrivateV2InternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f260946q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f260947r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ BbipPrivateV2State f260948s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ a f260949t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7817a(BbipPrivateV2State bbipPrivateV2State, a aVar, Continuation<? super C7817a> continuation) {
            super(2, continuation);
            this.f260948s = bbipPrivateV2State;
            this.f260949t = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C7817a c7817a = new C7817a(this.f260948s, this.f260949t, continuation);
            c7817a.f260947r = obj;
            return c7817a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super BbipPrivateV2InternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C7817a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f260946q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f260947r;
                BbipPrivateV2State bbipPrivateV2State = this.f260948s;
                String str = bbipPrivateV2State.f261026m;
                a aVar = this.f260949t;
                InterfaceC43160i<BbipPrivateV2InternalAction> interfaceC43160iA = aVar.f260944d.a(aVar.f260945e.c(bbipPrivateV2State), str);
                this.f260946q = 1;
                if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
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

    /* compiled from: BbipPrivateV2Actor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.screens.bbip_private_v2.mvi.BbipPrivateV2Actor$process$2", f = "BbipPrivateV2Actor.kt", i = {0}, l = {72, 74}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class b extends SuspendLambda implements p<InterfaceC43172j<? super BbipPrivateV2InternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f260950q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f260951r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ BbipPrivateV2State f260952s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ InterfaceC48700a f260953t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(BbipPrivateV2State bbipPrivateV2State, Continuation continuation, InterfaceC48700a interfaceC48700a) {
            super(2, continuation);
            this.f260952s = bbipPrivateV2State;
            this.f260953t = interfaceC48700a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(this.f260952s, continuation, this.f260953t);
            bVar.f260951r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super BbipPrivateV2InternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f260950q;
            InterfaceC48700a interfaceC48700a = this.f260953t;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f260951r;
                String str = this.f260952s.f261027n;
                if (((InterfaceC48700a.e) interfaceC48700a).f439447b && str != null) {
                    BbipPrivateV2InternalAction.ShowMnzUxFeedback showMnzUxFeedback = new BbipPrivateV2InternalAction.ShowMnzUxFeedback(str);
                    this.f260951r = interfaceC43172j;
                    this.f260950q = 1;
                    if (interfaceC43172j.emit(showMnzUxFeedback, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f260951r;
                C42729a0.b(obj);
            }
            BbipPrivateV2InternalAction.HandleDeeplink handleDeeplink = new BbipPrivateV2InternalAction.HandleDeeplink(((InterfaceC48700a.e) interfaceC48700a).f439446a);
            this.f260951r = null;
            this.f260950q = 2;
            if (interfaceC43172j.emit(handleDeeplink, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: BbipPrivateV2Actor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.screens.bbip_private_v2.mvi.BbipPrivateV2Actor$process$3", f = "BbipPrivateV2Actor.kt", i = {0}, l = {86, 89}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class c extends SuspendLambda implements p<InterfaceC43172j<? super BbipPrivateV2InternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f260954q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f260955r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC48700a f260956s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ BbipPrivateV2State f260957t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(BbipPrivateV2State bbipPrivateV2State, Continuation continuation, InterfaceC48700a interfaceC48700a) {
            super(2, continuation);
            this.f260956s = interfaceC48700a;
            this.f260957t = bbipPrivateV2State;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = new c(this.f260957t, continuation, this.f260956s);
            cVar.f260955r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super BbipPrivateV2InternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            List<BbipPrivateV2State.SegmentsBlock.Segment> list;
            BbipPrivateV2State.SegmentsBlock.Segment segment;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f260954q;
            InterfaceC48700a interfaceC48700a = this.f260956s;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f260955r;
                BbipPrivateV2InternalAction.OnSegmentClicked onSegmentClicked = new BbipPrivateV2InternalAction.OnSegmentClicked(((InterfaceC48700a.j) interfaceC48700a).f439452a);
                this.f260955r = interfaceC43172j;
                this.f260954q = 1;
                if (interfaceC43172j.emit(onSegmentClicked, this) == coroutine_suspended) {
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
                interfaceC43172j = (InterfaceC43172j) this.f260955r;
                C42729a0.b(obj);
            }
            BbipPrivateV2State.SegmentsBlock segmentsBlock = this.f260957t.f261028o;
            if (((segmentsBlock == null || (list = segmentsBlock.f261032a) == null || (segment = (BbipPrivateV2State.SegmentsBlock.Segment) C42745f0.K(((InterfaceC48700a.j) interfaceC48700a).f439452a, list)) == null) ? null : segment.f261035b) == BbipPrivateV2State.SegmentsBlock.Segment.Type.f261037c) {
                BbipPrivateV2InternalAction.ForecastRequired forecastRequired = new BbipPrivateV2InternalAction.ForecastRequired(null, 1, null);
                this.f260955r = null;
                this.f260954q = 2;
                if (interfaceC43172j.emit(forecastRequired, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: BbipPrivateV2Actor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.screens.bbip_private_v2.mvi.BbipPrivateV2Actor$process$4", f = "BbipPrivateV2Actor.kt", i = {0, 1}, l = {106, 107, 108, 120}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class d extends SuspendLambda implements p<InterfaceC43172j<? super BbipPrivateV2InternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f260958q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f260959r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ BbipPrivateV2State f260960s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ InterfaceC48700a f260961t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ a f260962u;

        /* compiled from: BbipPrivateV2Actor.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction;", "internalAction", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/screens/bbip_private_v2/mvi/entity/BbipPrivateV2InternalAction;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.screens.bbip_private_v2.mvi.BbipPrivateV2Actor$process$4$1", f = "BbipPrivateV2Actor.kt", i = {0}, l = {115, 117, 118}, m = "invokeSuspend", n = {"internalAction"}, s = {"L$0"})
        /* renamed from: com.avito.android.screens.bbip_private_v2.mvi.a$d$a, reason: collision with other inner class name */
        public static final class C7818a extends SuspendLambda implements p<BbipPrivateV2InternalAction, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f260963q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ Object f260964r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<BbipPrivateV2InternalAction> f260965s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ InterfaceC48700a f260966t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C7818a(InterfaceC43172j<? super BbipPrivateV2InternalAction> interfaceC43172j, InterfaceC48700a interfaceC48700a, Continuation<? super C7818a> continuation) {
                super(2, continuation);
                this.f260965s = interfaceC43172j;
                this.f260966t = interfaceC48700a;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                C7818a c7818a = new C7818a(this.f260965s, this.f260966t, continuation);
                c7818a.f260964r = obj;
                return c7818a;
            }

            @Override // Y41.p
            public final Object invoke(BbipPrivateV2InternalAction bbipPrivateV2InternalAction, Continuation<? super G0> continuation) {
                return ((C7818a) create(bbipPrivateV2InternalAction, continuation)).invokeSuspend(G0.f406611a);
            }

            /* JADX WARN: Removed duplicated region for block: B:22:0x0067 A[RETURN] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r7) {
                /*
                    r6 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r6.f260963q
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    kotlinx.coroutines.flow.j<com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2InternalAction> r5 = r6.f260965s
                    if (r1 == 0) goto L2b
                    if (r1 == r4) goto L23
                    if (r1 == r3) goto L1f
                    if (r1 != r2) goto L17
                    kotlin.C42729a0.b(r7)
                    goto L68
                L17:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L1f:
                    kotlin.C42729a0.b(r7)
                    goto L54
                L23:
                    java.lang.Object r1 = r6.f260964r
                    com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2InternalAction r1 = (com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2InternalAction) r1
                    kotlin.C42729a0.b(r7)
                    goto L3e
                L2b:
                    kotlin.C42729a0.b(r7)
                    java.lang.Object r7 = r6.f260964r
                    r1 = r7
                    com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2InternalAction r1 = (com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2InternalAction) r1
                    r6.f260964r = r1
                    r6.f260963q = r4
                    java.lang.Object r7 = r5.emit(r1, r6)
                    if (r7 != r0) goto L3e
                    return r0
                L3e:
                    boolean r7 = r1 instanceof com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2InternalAction.ForecastContent
                    if (r7 == 0) goto L68
                    com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2InternalAction$SetDurationPickerShown r7 = new com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2InternalAction$SetDurationPickerShown
                    r1 = 0
                    r7.<init>(r1)
                    r1 = 0
                    r6.f260964r = r1
                    r6.f260963q = r3
                    java.lang.Object r7 = r5.emit(r7, r6)
                    if (r7 != r0) goto L54
                    return r0
                L54:
                    com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2InternalAction$SelectDuration r7 = new com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2InternalAction$SelectDuration
                    tp0.a r1 = r6.f260966t
                    tp0.a$d r1 = (tp0.InterfaceC48700a.d) r1
                    int r1 = r1.f439445a
                    r7.<init>(r1)
                    r6.f260963q = r2
                    java.lang.Object r7 = r5.emit(r7, r6)
                    if (r7 != r0) goto L68
                    return r0
                L68:
                    kotlin.G0 r7 = kotlin.G0.f406611a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.screens.bbip_private_v2.mvi.a.d.C7818a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(BbipPrivateV2State bbipPrivateV2State, InterfaceC48700a interfaceC48700a, a aVar, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f260960s = bbipPrivateV2State;
            this.f260961t = interfaceC48700a;
            this.f260962u = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            d dVar = new d(this.f260960s, this.f260961t, this.f260962u, continuation);
            dVar.f260959r = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super BbipPrivateV2InternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x007a A[RETURN] */
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
                int r1 = r10.f260958q
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 0
                tp0.a r6 = r10.f260961t
                r7 = 1
                if (r1 == 0) goto L35
                if (r1 == r7) goto L2d
                if (r1 == r4) goto L25
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                goto L20
            L18:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L20:
                kotlin.C42729a0.b(r11)
                goto Lb5
            L25:
                java.lang.Object r1 = r10.f260959r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r11)
                goto L7b
            L2d:
                java.lang.Object r1 = r10.f260959r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r11)
                goto L67
            L35:
                kotlin.C42729a0.b(r11)
                java.lang.Object r11 = r10.f260959r
                kotlinx.coroutines.flow.j r11 = (kotlinx.coroutines.flow.InterfaceC43172j) r11
                com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State r1 = r10.f260960s
                com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State$e r8 = r1.f261017d
                if (r8 == 0) goto L8b
                java.util.List<java.lang.Integer> r8 = r8.f261065b
                if (r8 == 0) goto L8b
                r9 = r6
                tp0.a$d r9 = (tp0.InterfaceC48700a.d) r9
                int r9 = r9.f439445a
                java.lang.Integer r9 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r9)
                boolean r8 = r8.contains(r9)
                if (r8 != r7) goto L8b
                com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2InternalAction$SetDurationPickerShown r1 = new com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2InternalAction$SetDurationPickerShown
                r2 = 0
                r1.<init>(r2)
                r10.f260959r = r11
                r10.f260958q = r7
                java.lang.Object r1 = r11.emit(r1, r10)
                if (r1 != r0) goto L66
                return r0
            L66:
                r1 = r11
            L67:
                com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2InternalAction$SelectDuration r11 = new com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2InternalAction$SelectDuration
                tp0.a$d r6 = (tp0.InterfaceC48700a.d) r6
                int r2 = r6.f439445a
                r11.<init>(r2)
                r10.f260959r = r1
                r10.f260958q = r4
                java.lang.Object r11 = r1.emit(r11, r10)
                if (r11 != r0) goto L7b
                return r0
            L7b:
                com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2InternalAction$ForecastRequired r11 = new com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2InternalAction$ForecastRequired
                r11.<init>(r5, r7, r5)
                r10.f260959r = r5
                r10.f260958q = r3
                java.lang.Object r11 = r1.emit(r11, r10)
                if (r11 != r0) goto Lb5
                return r0
            L8b:
                com.avito.android.screens.bbip_private_v2.mvi.a r3 = r10.f260962u
                com.avito.android.screens.bbip_private_v2.domain.e r4 = r3.f260943c
                r8 = r6
                tp0.a$d r8 = (tp0.InterfaceC48700a.d) r8
                int r8 = r8.f439445a
                java.lang.Integer r8 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r8)
                com.avito.android.screens.bbip_private_v2.data.a r3 = r3.f260945e
                qp0.b r1 = r3.d(r1, r8)
                kotlinx.coroutines.flow.i r1 = r4.a(r1, r7)
                com.avito.android.screens.bbip_private_v2.mvi.a$d$a r3 = new com.avito.android.screens.bbip_private_v2.mvi.a$d$a
                r3.<init>(r11, r6, r5)
                kotlinx.coroutines.flow.r1 r11 = new kotlinx.coroutines.flow.r1
                r11.<init>(r3, r1)
                r10.f260958q = r2
                java.lang.Object r11 = kotlinx.coroutines.flow.C43175k.i(r11, r10)
                if (r11 != r0) goto Lb5
                return r0
            Lb5:
                kotlin.G0 r11 = kotlin.G0.f406611a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.screens.bbip_private_v2.mvi.a.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public a(@InterfaceC40933a @Y61.k String str, @Y61.k com.avito.android.screens.bbip_private_v2.domain.a aVar, @Y61.k com.avito.android.screens.bbip_private_v2.domain.e eVar, @Y61.k com.avito.android.screens.bbip_private_v2.domain.c cVar, @Y61.k com.avito.android.screens.bbip_private_v2.data.a aVar2) {
        this.f260941a = str;
        this.f260942b = aVar;
        this.f260943c = eVar;
        this.f260944d = cVar;
        this.f260945e = aVar2;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.C(new com.avito.android.screens.bbip_private_v2.mvi.c(aVar, this, null), com.avito.android.arch.mvi.utils.h.a(c43197r1, com.avito.android.screens.bbip_private_v2.mvi.b.f260967l));
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<BbipPrivateV2InternalAction> b(@Y61.k InterfaceC48700a interfaceC48700a, @Y61.k BbipPrivateV2State bbipPrivateV2State) {
        C43210w c43210w;
        if (interfaceC48700a instanceof InterfaceC48700a.h) {
            return new C43210w(BbipPrivateV2InternalAction.CloseScreen.f260987b);
        }
        if (interfaceC48700a instanceof InterfaceC48700a.l) {
            String str = bbipPrivateV2State.f261021h;
            if (str == null) {
                str = this.f260941a;
            }
            return this.f260942b.a(str);
        }
        if (interfaceC48700a instanceof InterfaceC48700a.m) {
            return this.f260943c.a(this.f260945e.d(bbipPrivateV2State, null), false);
        }
        if (interfaceC48700a instanceof InterfaceC48700a.n) {
            BbipPrivateV2State.c cVar = bbipPrivateV2State.f261019f;
            return new C43210w(new BbipPrivateV2InternalAction.HandleDeeplink(cVar != null ? cVar.f261063b : null));
        }
        if (interfaceC48700a instanceof InterfaceC48700a.g) {
            return C43175k.G(new C7817a(bbipPrivateV2State, this, null));
        }
        if (interfaceC48700a instanceof InterfaceC48700a.e) {
            return C43175k.G(new b(bbipPrivateV2State, null, interfaceC48700a));
        }
        if (interfaceC48700a instanceof InterfaceC48700a.i) {
            c43210w = new C43210w(new BbipPrivateV2InternalAction.OnPresetClicked(((InterfaceC48700a.i) interfaceC48700a).f439451a));
        } else {
            if (!(interfaceC48700a instanceof InterfaceC48700a.b)) {
                if (interfaceC48700a instanceof InterfaceC48700a.j) {
                    return C43175k.G(new c(bbipPrivateV2State, null, interfaceC48700a));
                }
                if (!(interfaceC48700a instanceof InterfaceC48700a.f)) {
                    return interfaceC48700a instanceof InterfaceC48700a.d ? C43175k.G(new d(bbipPrivateV2State, interfaceC48700a, this, null)) : interfaceC48700a instanceof InterfaceC48700a.k ? new C43210w(new BbipPrivateV2InternalAction.SetDurationPickerShown(true)) : interfaceC48700a instanceof InterfaceC48700a.c ? new C43210w(new BbipPrivateV2InternalAction.SetDurationPickerShown(false)) : C43175k.w();
                }
                BbipPrivateV2State.e eVar = bbipPrivateV2State.f261017d;
                return (eVar == null || eVar.f261070g != ((InterfaceC48700a.f) interfaceC48700a).f439448a) ? new C43207v(new BbipPrivateV2InternalAction[]{new BbipPrivateV2InternalAction.SelectDuration(((InterfaceC48700a.f) interfaceC48700a).f439448a), new BbipPrivateV2InternalAction.ForecastRequired(null, 1, null)}) : new C43207v(new BbipPrivateV2InternalAction[0]);
            }
            c43210w = new C43210w(new BbipPrivateV2InternalAction.BudgetSliderChange(((InterfaceC48700a.b) interfaceC48700a).f439443a));
        }
        return c43210w;
    }
}
