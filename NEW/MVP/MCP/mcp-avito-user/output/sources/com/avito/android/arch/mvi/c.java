package com.avito.android.arch.mvi;

import androidx.camera.camera2.internal.G;
import com.avito.android.arch.mvi.log.f;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.AbstractC43136a;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.X;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;
import kotlinx.coroutines.flow.i2;

/* compiled from: Feature.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u0001*\b\b\u0002\u0010\u0004*\u00020\u0001*\b\b\u0003\u0010\u0005*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00020\u00062\b\u0012\u0004\u0012\u00028\u00000\u0007:\u0001\b¨\u0006\t"}, d2 = {"Lcom/avito/android/arch/mvi/c;", "", "Action", "InternalAction", "State", "OneTimeEvent", "Lkotlinx/coroutines/flow/a;", "Lkotlinx/coroutines/flow/j;", "a", "_common_mvi-flow_util-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c<Action, InternalAction, State, OneTimeEvent> extends AbstractC43136a<State> implements InterfaceC43172j<Action> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final State f91915d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.arch.mvi.b<InternalAction> f91916e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.arch.mvi.a<Action, InternalAction, State> f91917f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final t<InternalAction, OneTimeEvent> f91918g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final u<InternalAction, State> f91919h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.arch.mvi.log.a f91920i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final T f91921j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final String f91922k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final e2 f91923l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final e2 f91924m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final n<Action> f91925n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final n<OneTimeEvent> f91926o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final AtomicInteger f91927p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43160i<OneTimeEvent> f91928q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final AtomicReference<State> f91929r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.arch.mvi.utils.g f91930s;

    /* compiled from: Feature.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/arch/mvi/c$a;", "", "<init>", "()V", "", "ACTIONS_BUFFER", "I", "EVENTS_BUFFER", "", "TAG_PREFIX", "Ljava/lang/String;", "_common_mvi-flow_util-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Feature.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b implements InterfaceC43172j, D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<State> f91931b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(InterfaceC43172j<? super State> interfaceC43172j) {
            this.f91931b = interfaceC43172j;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        public final Object emit(@Y61.k State state, @Y61.k Continuation<? super G0> continuation) {
            Object objEmit = this.f91931b.emit(state, continuation);
            return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : G0.f406611a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return new H(2, this.f91931b, InterfaceC43172j.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* compiled from: Feature.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000\"\b\b\u0003\u0010\u0004*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00030\u0005H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "Action", "InternalAction", "State", "OneTimeEvent", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.arch.mvi.Feature$events$1", f = "Feature.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.arch.mvi.c$c, reason: collision with other inner class name */
    public static final class C2708c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super OneTimeEvent>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ c<Action, InternalAction, State, OneTimeEvent> f91932q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2708c(c<Action, InternalAction, State, OneTimeEvent> cVar, Continuation<? super C2708c> continuation) {
            super(2, continuation);
            this.f91932q = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new C2708c(this.f91932q, continuation);
        }

        @Override // Y41.p
        public final Object invoke(Object obj, Continuation<? super G0> continuation) {
            return ((C2708c) create((InterfaceC43172j) obj, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            c<Action, InternalAction, State, OneTimeEvent> cVar = this.f91932q;
            cVar.f91920i.c(cVar.f91922k, f.b.a("events started"));
            cVar.f91926o.b(cVar.f91924m, cVar.f91921j, new com.avito.android.arch.mvi.f(cVar));
            return G0.f406611a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements InterfaceC43160i<State> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C43197r1 f91933b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c f91934c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f91935b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ c f91936c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.arch.mvi.Feature$special$$inlined$map$1$2", f = "Feature.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.arch.mvi.c$d$a$a, reason: collision with other inner class name */
            public static final class C2709a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f91937q;

                /* renamed from: r, reason: collision with root package name */
                public int f91938r;

                public C2709a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f91937q = obj;
                    this.f91938r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j, c cVar) {
                this.f91935b = interfaceC43172j;
                this.f91936c = cVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r6, @Y61.k kotlin.coroutines.Continuation r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof com.avito.android.arch.mvi.c.d.a.C2709a
                    if (r0 == 0) goto L13
                    r0 = r7
                    com.avito.android.arch.mvi.c$d$a$a r0 = (com.avito.android.arch.mvi.c.d.a.C2709a) r0
                    int r1 = r0.f91938r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f91938r = r1
                    goto L18
                L13:
                    com.avito.android.arch.mvi.c$d$a$a r0 = new com.avito.android.arch.mvi.c$d$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f91937q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f91938r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r7)
                    goto L50
                L29:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L31:
                    kotlin.C42729a0.b(r7)
                    com.avito.android.arch.mvi.c r7 = r5.f91936c
                    java.util.concurrent.atomic.AtomicReference<State> r2 = r7.f91929r
                    java.lang.Object r4 = r2.get()
                    com.avito.android.arch.mvi.u<InternalAction, State> r7 = r7.f91919h
                    java.lang.Object r6 = r7.a(r6, r4)
                    r2.set(r6)
                    r0.f91938r = r3
                    kotlinx.coroutines.flow.j r7 = r5.f91935b
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L50
                    return r1
                L50:
                    kotlin.G0 r6 = kotlin.G0.f406611a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.arch.mvi.c.d.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public d(C43197r1 c43197r1, c cVar) {
            this.f91933b = c43197r1;
            this.f91934c = cVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f91933b.collect(new a(interfaceC43172j, this.f91934c), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: Feature.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000\"\b\b\u0003\u0010\u0004*\u00020\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\u008a@"}, d2 = {"", "Action", "InternalAction", "State", "OneTimeEvent", "internalAction", "Lkotlin/G0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.arch.mvi.Feature$stateFlow$1", f = "Feature.kt", i = {}, l = {132}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Y41.p<InternalAction, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f91940q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f91941r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ c<Action, InternalAction, State, OneTimeEvent> f91942s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(c<Action, InternalAction, State, OneTimeEvent> cVar, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f91942s = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            e eVar = new e(this.f91942s, continuation);
            eVar.f91941r = obj;
            return eVar;
        }

        @Override // Y41.p
        public final Object invoke(Object obj, Continuation<? super G0> continuation) {
            return ((e) create(obj, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0063 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.f91940q
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.C42729a0.b(r6)
                goto L64
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                kotlin.C42729a0.b(r6)
                java.lang.Object r6 = r5.f91941r
                r5.f91940q = r2
                com.avito.android.arch.mvi.c<Action, InternalAction, State, OneTimeEvent> r1 = r5.f91942s
                com.avito.android.arch.mvi.t<InternalAction, OneTimeEvent> r2 = r1.f91918g
                java.lang.Object r6 = r2.b(r6)
                if (r6 == 0) goto L5f
                kotlinx.coroutines.flow.e2 r2 = r1.f91924m
                kotlinx.coroutines.flow.n2 r3 = r2.ac()
                java.lang.Object r3 = r3.getValue()
                java.lang.Number r3 = (java.lang.Number) r3
                int r3 = r3.intValue()
                if (r3 <= 0) goto L55
                java.lang.String r3 = "oneTimeEvent"
                com.avito.android.arch.mvi.log.f$b r3 = com.avito.android.arch.mvi.log.f.b.a(r3)
                com.avito.android.arch.mvi.log.a r4 = r1.f91920i
                java.lang.String r1 = r1.f91922k
                r4.b(r1, r3, r6)
                java.lang.Object r6 = r2.emit(r6, r5)
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                if (r6 != r1) goto L52
                goto L61
            L52:
                kotlin.G0 r6 = kotlin.G0.f406611a
                goto L61
            L55:
                com.avito.android.arch.mvi.k r2 = new com.avito.android.arch.mvi.k
                r2.<init>(r1, r6)
                com.avito.android.arch.mvi.n<OneTimeEvent> r1 = r1.f91926o
                r1.a(r2, r6)
            L5f:
                kotlin.G0 r6 = kotlin.G0.f406611a
            L61:
                if (r6 != r0) goto L64
                return r0
            L64:
                kotlin.G0 r6 = kotlin.G0.f406611a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.arch.mvi.c.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: Feature.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000\"\b\b\u0003\u0010\u0004*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00020\u0005H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "Action", "InternalAction", "State", "OneTimeEvent", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.arch.mvi.Feature$stateFlow$3", f = "Feature.kt", i = {}, l = {138}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Y41.p<InterfaceC43172j<? super State>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f91943q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f91944r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ c<Action, InternalAction, State, OneTimeEvent> f91945s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(c<Action, InternalAction, State, OneTimeEvent> cVar, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f91945s = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            f fVar = new f(this.f91945s, continuation);
            fVar.f91944r = obj;
            return fVar;
        }

        @Override // Y41.p
        public final Object invoke(Object obj, Continuation<? super G0> continuation) {
            return ((f) create((InterfaceC43172j) obj, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f91943q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f91944r;
                State state = this.f91945s.f91929r.get();
                this.f91943q = 1;
                if (interfaceC43172j.emit(state, this) == coroutine_suspended) {
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

    /* compiled from: Feature.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000\"\b\b\u0003\u0010\u0004*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u008a@¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "Action", "InternalAction", "State", "OneTimeEvent", "Lkotlinx/coroutines/flow/j;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.arch.mvi.Feature$stateFlow$4", f = "Feature.kt", i = {}, l = {141}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Y41.q<InterfaceC43172j<? super State>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f91946q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ c<Action, InternalAction, State, OneTimeEvent> f91947r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(c<Action, InternalAction, State, OneTimeEvent> cVar, Continuation<? super g> continuation) {
            super(3, continuation);
            this.f91947r = cVar;
        }

        @Override // Y41.q
        public final Object invoke(Object obj, Throwable th2, Continuation<? super G0> continuation) {
            return new g(this.f91947r, continuation).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f91946q;
            if (i12 == 0) {
                C42729a0.b(obj);
                com.avito.android.arch.mvi.b<InternalAction> bVar = this.f91947r.f91916e;
                this.f91946q = 1;
                if (bVar.b(this) == coroutine_suspended) {
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

    /* JADX WARN: Illegal instructions before constructor call */
    public c(Object obj, com.avito.android.arch.mvi.b bVar, com.avito.android.arch.mvi.a aVar, t tVar, u uVar, String str, com.avito.android.arch.mvi.log.a aVar2, T t12, r rVar, int i12, C42822w c42822w) {
        r rVar2;
        T tA2 = (i12 & 128) != 0 ? U.a(EmptyCoroutineContext.INSTANCE) : t12;
        if ((i12 & 256) != 0) {
            r.f92017c.getClass();
            rVar2 = r.f92018d;
        } else {
            rVar2 = rVar;
        }
        this(obj, bVar, aVar, tVar, uVar, str, aVar2, tA2, rVar2);
    }

    @Override // kotlinx.coroutines.flow.AbstractC43136a
    @Y61.l
    public final Object collectSafely(@Y61.k InterfaceC43172j<? super State> interfaceC43172j, @Y61.k Continuation<? super G0> continuation) {
        Object objCollect = this.f91930s.collect(new b(interfaceC43172j), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    @Y61.l
    public final Object emit(@Y61.k Action action, @Y61.k Continuation<? super G0> continuation) {
        Object objYa = ya(action, continuation);
        return objYa == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objYa : G0.f406611a;
    }

    @Y61.l
    public final Object ya(@Y61.k Action action, @Y61.k Continuation<? super G0> continuation) {
        if (this.f91927p.get() == 0) {
            this.f91925n.a(new com.avito.android.arch.mvi.d(this, action), action);
            return G0.f406611a;
        }
        Object objEmit = this.f91923l.emit(action, continuation);
        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : G0.f406611a;
    }

    public c(@Y61.k State state, @Y61.k com.avito.android.arch.mvi.b<InternalAction> bVar, @Y61.k com.avito.android.arch.mvi.a<Action, InternalAction, State> aVar, @Y61.k t<InternalAction, OneTimeEvent> tVar, @Y61.k u<InternalAction, State> uVar, @Y61.k String str, @Y61.k com.avito.android.arch.mvi.log.a aVar2, @Y61.k T t12, @Y61.k r rVar) {
        n<Action> vVar;
        n<OneTimeEvent> sVar;
        this.f91915d = state;
        this.f91916e = bVar;
        this.f91917f = aVar;
        this.f91918g = tVar;
        this.f91919h = uVar;
        this.f91920i = aVar2;
        this.f91921j = t12;
        String strF = G.f("Mvi-", str);
        this.f91922k = strF;
        BufferOverflow bufferOverflow = BufferOverflow.f410777b;
        e2 e2VarA = f2.a(0, 16, bufferOverflow);
        this.f91923l = e2VarA;
        e2 e2VarA2 = f2.a(0, 16, bufferOverflow);
        this.f91924m = e2VarA2;
        if (rVar.f92019a) {
            vVar = new p<>();
        } else {
            vVar = new v<>();
        }
        this.f91925n = vVar;
        if (rVar.f92020b) {
            sVar = new p<>();
        } else {
            sVar = new s<>();
        }
        this.f91926o = sVar;
        this.f91927p = new AtomicInteger(0);
        this.f91928q = C43175k.P(e2VarA2, new C2708c(this, null));
        this.f91929r = new AtomicReference<>(state);
        this.f91930s = new com.avito.android.arch.mvi.utils.g(C43175k.S(com.avito.android.arch.mvi.utils.h.b(com.avito.android.arch.mvi.log.e.a(C43175k.r(new X(new C43137a0(new f(this, null), new d(new C43197r1(new e(this, null), C43175k.N(new C43197r1(new i(this, null), bVar.a()), new C43197r1(new h(this, null), aVar.a(new C43197r1(new com.avito.android.arch.mvi.g(this, null), new X(C43175k.P(e2VarA, new l(this, null)), new m(this, null))), new j(this))))), this)), new g(this, null))), strF, aVar2)), t12, i2.a.b(i2.f411430a, 0L, 1), 1));
    }
}
