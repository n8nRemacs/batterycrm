package com.avito.android.reputation.ui;

import Rm0.InterfaceC15059a;
import Rm0.c;
import Y41.p;
import Y61.l;
import androidx.view.M0;
import androidx.view.N0;
import com.avito.android.arch.mvi.android.k;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import com.avito.android.lib.beduin_v2.feature.mvi.n;
import com.avito.android.lib.beduin_v2.feature.mvi.x;
import com.avito.android.reputation.ui.mvi.entity.ReputationInternalAction;
import com.avito.android.util.R0;
import com.avito.beduin.v2.engine.component.B;
import java.util.Set;
import javax.inject.Inject;
import kotlin.AbstractC40048c;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC40047a;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43188o0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.i2;
import kotlinx.coroutines.flow.internal.m;
import kotlinx.coroutines.flow.n2;

/* compiled from: ReputationViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002¨\u0006\u0006"}, d2 = {"Lcom/avito/android/reputation/ui/g;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/arch/mvi/android/k;", "LRm0/a;", "LRm0/c;", "LRm0/b;", "_avito_reputation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g extends M0 implements k<InterfaceC15059a, Rm0.c, Rm0.b> {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final B f254813E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final Set<FV0.h> f254814J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final aU0.b f254815K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final ZS.b f254816L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final R0 f254817M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f254818N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f254819O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final n2<Rm0.c> f254820P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final d f254821Q;

    /* compiled from: ReputationViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.reputation.ui.ReputationViewModel$accept$1", f = "ReputationViewModel.kt", i = {}, l = {44, 46}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f254822q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC15059a f254823r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ g f254824s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC15059a interfaceC15059a, g gVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f254823r = interfaceC15059a;
            this.f254824s = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f254823r, this.f254824s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f254822q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC15059a interfaceC15059a = this.f254823r;
                boolean z12 = interfaceC15059a instanceof InterfaceC15059a.C0975a;
                g gVar = this.f254824s;
                if (z12) {
                    x xVar = (x) gVar.f254819O.getValue();
                    InterfaceC40047a.C11082a c11082a = InterfaceC40047a.C11082a.f395204a;
                    this.f254822q = 1;
                    if (xVar.ya(c11082a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    com.avito.android.arch.mvi.c<InterfaceC15059a, ReputationInternalAction, Rm0.c, Rm0.b> cVarLe = gVar.le();
                    this.f254822q = 2;
                    if (cVarLe.ya(interfaceC15059a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i12 != 1 && i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ReputationViewModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/mvi/x;", "LeT/a;", "LeT/c;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinOneTimeEvent;", "invoke", "()Lcom/avito/android/lib/beduin_v2/feature/mvi/x;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<x<? super InterfaceC40047a, ? extends AbstractC40048c, ? extends BeduinOneTimeEvent>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ n.a f254825l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ g f254826m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(n.a aVar, g gVar) {
            super(0);
            this.f254825l = aVar;
            this.f254826m = gVar;
        }

        @Override // Y41.a
        public final x<? super InterfaceC40047a, ? extends AbstractC40048c, ? extends BeduinOneTimeEvent> invoke() {
            return this.f254825l.a(N0.a(this.f254826m));
        }
    }

    /* compiled from: ReputationViewModel.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/arch/mvi/c;", "LRm0/a;", "Lcom/avito/android/reputation/ui/mvi/entity/ReputationInternalAction;", "LRm0/c;", "LRm0/b;", "invoke", "()Lcom/avito/android/arch/mvi/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<com.avito.android.arch.mvi.c<InterfaceC15059a, ReputationInternalAction, Rm0.c, Rm0.b>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.reputation.ui.mvi.g f254827l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ g f254828m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.avito.android.reputation.ui.mvi.g gVar, g gVar2) {
            super(0);
            this.f254827l = gVar;
            this.f254828m = gVar2;
        }

        @Override // Y41.a
        public final com.avito.android.arch.mvi.c<InterfaceC15059a, ReputationInternalAction, Rm0.c, Rm0.b> invoke() {
            return this.f254827l.a(null, N0.a(this.f254828m));
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/l1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements InterfaceC43160i<Object> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m f254829b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/l1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f254830b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.reputation.ui.ReputationViewModel$special$$inlined$filterIsInstance$1$2", f = "ReputationViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.reputation.ui.g$d$a$a, reason: collision with other inner class name */
            public static final class C7624a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f254831q;

                /* renamed from: r, reason: collision with root package name */
                public int f254832r;

                public C7624a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f254831q = obj;
                    this.f254832r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f254830b = interfaceC43172j;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.avito.android.reputation.ui.g.d.a.C7624a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.reputation.ui.g$d$a$a r0 = (com.avito.android.reputation.ui.g.d.a.C7624a) r0
                    int r1 = r0.f254832r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f254832r = r1
                    goto L18
                L13:
                    com.avito.android.reputation.ui.g$d$a$a r0 = new com.avito.android.reputation.ui.g$d$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f254831q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f254832r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L43
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    boolean r6 = r5 instanceof Rm0.b
                    if (r6 == 0) goto L43
                    r0.f254832r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f254830b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.reputation.ui.g.d.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public d(m mVar) {
            this.f254829b = mVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @l
        public final Object collect(@Y61.k InterfaceC43172j<? super Object> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f254829b.collect(new a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "kotlinx/coroutines/flow/b0"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.reputation.ui.ReputationViewModel$special$$inlined$transform$1", f = "ReputationViewModel.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements p<InterfaceC43172j<? super Rm0.c>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f254834q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f254835r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ C43188o0 f254836s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ g f254837t;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<Rm0.c> f254838b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ g f254839c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.reputation.ui.ReputationViewModel$special$$inlined$transform$1$1", f = "ReputationViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.reputation.ui.g$e$a$a, reason: collision with other inner class name */
            public static final class C7625a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f254840q;

                /* renamed from: r, reason: collision with root package name */
                public int f254841r;

                public C7625a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f254840q = obj;
                    this.f254841r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j, g gVar) {
                this.f254839c = gVar;
                this.f254838b = interfaceC43172j;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r5, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.avito.android.reputation.ui.g.e.a.C7625a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.reputation.ui.g$e$a$a r0 = (com.avito.android.reputation.ui.g.e.a.C7625a) r0
                    int r1 = r0.f254841r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f254841r = r1
                    goto L18
                L13:
                    com.avito.android.reputation.ui.g$e$a$a r0 = new com.avito.android.reputation.ui.g$e$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f254840q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f254841r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L4a
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    eT.c r5 = (kotlin.AbstractC40048c) r5
                    com.avito.android.reputation.ui.g r6 = r4.f254839c
                    com.avito.android.arch.mvi.c r6 = r6.le()
                    Rm0.a$d r2 = new Rm0.a$d
                    r2.<init>(r5)
                    r0.f254841r = r3
                    java.lang.Object r5 = r6.ya(r2, r0)
                    if (r5 != r1) goto L4a
                    return r1
                L4a:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.reputation.ui.g.e.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C43188o0 c43188o0, Continuation continuation, g gVar) {
            super(2, continuation);
            this.f254836s = c43188o0;
            this.f254837t = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            e eVar = new e(this.f254836s, continuation, this.f254837t);
            eVar.f254835r = obj;
            return eVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super Rm0.c> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f254834q;
            if (i12 == 0) {
                C42729a0.b(obj);
                a aVar = new a((InterfaceC43172j) this.f254835r, this.f254837t);
                this.f254834q = 1;
                if (this.f254836s.collect(aVar, this) == coroutine_suspended) {
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

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "kotlinx/coroutines/flow/b0"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.reputation.ui.ReputationViewModel$special$$inlined$transform$2", f = "ReputationViewModel.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements p<InterfaceC43172j<? super Rm0.b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f254843q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f254844r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f254845s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ g f254846t;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<Rm0.b> f254847b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ g f254848c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.reputation.ui.ReputationViewModel$special$$inlined$transform$2$1", f = "ReputationViewModel.kt", i = {}, l = {221}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.reputation.ui.g$f$a$a, reason: collision with other inner class name */
            public static final class C7626a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f254849q;

                /* renamed from: r, reason: collision with root package name */
                public int f254850r;

                public C7626a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f254849q = obj;
                    this.f254850r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j, g gVar) {
                this.f254848c = gVar;
                this.f254847b = interfaceC43172j;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r6, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof com.avito.android.reputation.ui.g.f.a.C7626a
                    if (r0 == 0) goto L13
                    r0 = r7
                    com.avito.android.reputation.ui.g$f$a$a r0 = (com.avito.android.reputation.ui.g.f.a.C7626a) r0
                    int r1 = r0.f254850r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f254850r = r1
                    goto L18
                L13:
                    com.avito.android.reputation.ui.g$f$a$a r0 = new com.avito.android.reputation.ui.g$f$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f254849q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f254850r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r7)
                    goto L58
                L29:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L31:
                    kotlin.C42729a0.b(r7)
                    Rm0.b r6 = (Rm0.b) r6
                    boolean r7 = r6 instanceof Rm0.b.C0976b
                    if (r7 == 0) goto L58
                    com.avito.android.reputation.ui.g r7 = r5.f254848c
                    kotlin.C r2 = r7.f254819O
                    java.lang.Object r2 = r2.getValue()
                    com.avito.android.lib.beduin_v2.feature.mvi.x r2 = (com.avito.android.lib.beduin_v2.feature.mvi.x) r2
                    eT.a$e r4 = new eT.a$e
                    Rm0.b$b r6 = (Rm0.b.C0976b) r6
                    java.lang.String r6 = r6.f14610a
                    ZS.b r7 = r7.f254816L
                    r4.<init>(r6, r7)
                    r0.f254850r = r3
                    java.lang.Object r6 = r2.ya(r4, r0)
                    if (r6 != r1) goto L58
                    return r1
                L58:
                    kotlin.G0 r6 = kotlin.G0.f406611a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.reputation.ui.g.f.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC43160i interfaceC43160i, Continuation continuation, g gVar) {
            super(2, continuation);
            this.f254845s = interfaceC43160i;
            this.f254846t = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            f fVar = new f(this.f254845s, continuation, this.f254846t);
            fVar.f254844r = obj;
            return fVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super Rm0.b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f254843q;
            if (i12 == 0) {
                C42729a0.b(obj);
                a aVar = new a((InterfaceC43172j) this.f254844r, this.f254846t);
                this.f254843q = 1;
                if (this.f254845s.collect(aVar, this) == coroutine_suspended) {
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

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "kotlinx/coroutines/flow/b0"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.reputation.ui.ReputationViewModel$special$$inlined$transform$3", f = "ReputationViewModel.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.reputation.ui.g$g, reason: collision with other inner class name */
    public static final class C7627g extends SuspendLambda implements p<InterfaceC43172j<? super Rm0.b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f254852q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f254853r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f254854s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ g f254855t;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.reputation.ui.g$g$a */
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<Rm0.b> f254856b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ g f254857c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.reputation.ui.ReputationViewModel$special$$inlined$transform$3$1", f = "ReputationViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.reputation.ui.g$g$a$a, reason: collision with other inner class name */
            public static final class C7628a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f254858q;

                /* renamed from: r, reason: collision with root package name */
                public int f254859r;

                public C7628a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f254858q = obj;
                    this.f254859r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j, g gVar) {
                this.f254857c = gVar;
                this.f254856b = interfaceC43172j;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r5, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.avito.android.reputation.ui.g.C7627g.a.C7628a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.reputation.ui.g$g$a$a r0 = (com.avito.android.reputation.ui.g.C7627g.a.C7628a) r0
                    int r1 = r0.f254859r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f254859r = r1
                    goto L18
                L13:
                    com.avito.android.reputation.ui.g$g$a$a r0 = new com.avito.android.reputation.ui.g$g$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f254858q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f254859r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L4a
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent r5 = (com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent) r5
                    com.avito.android.reputation.ui.g r6 = r4.f254857c
                    com.avito.android.arch.mvi.c r6 = r6.le()
                    Rm0.a$b r2 = new Rm0.a$b
                    r2.<init>(r5)
                    r0.f254859r = r3
                    java.lang.Object r5 = r6.ya(r2, r0)
                    if (r5 != r1) goto L4a
                    return r1
                L4a:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.reputation.ui.g.C7627g.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7627g(InterfaceC43160i interfaceC43160i, Continuation continuation, g gVar) {
            super(2, continuation);
            this.f254854s = interfaceC43160i;
            this.f254855t = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            C7627g c7627g = new C7627g(this.f254854s, continuation, this.f254855t);
            c7627g.f254853r = obj;
            return c7627g;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super Rm0.b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C7627g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f254852q;
            if (i12 == 0) {
                C42729a0.b(obj);
                a aVar = new a((InterfaceC43172j) this.f254853r, this.f254855t);
                this.f254852q = 1;
                if (this.f254854s.collect(aVar, this) == coroutine_suspended) {
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

    @Inject
    public g(@Y61.k com.avito.android.reputation.ui.mvi.g gVar, @Y61.k n.a aVar, @Y61.k B b12, @Y61.k Set<FV0.h> set, @Y61.k aU0.b bVar, @Y61.k ZS.b bVar2, @Y61.k R0 r02) {
        this.f254813E = b12;
        this.f254814J = set;
        this.f254815K = bVar;
        this.f254816L = bVar2;
        this.f254817M = r02;
        this.f254818N = C42727D.c(new c(gVar, this));
        InterfaceC42726C interfaceC42726CC = C42727D.c(new b(aVar, this));
        this.f254819O = interfaceC42726CC;
        m mVarN = C43175k.N(le(), C43175k.G(new e(C43175k.t((x) interfaceC42726CC.getValue(), 1), null, this)));
        A1.a aVarA = N0.a(this);
        i2.f411430a.getClass();
        this.f254820P = C43175k.U(mVarN, aVarA, i2.a.f411433c, c.C0977c.f14614b);
        this.f254821Q = new d(C43175k.N(C43175k.G(new f(le().f91928q, null, this)), C43175k.G(new C7627g(((x) interfaceC42726CC.getValue()).getEvents(), null, this))));
    }

    @Override // com.avito.android.arch.mvi.android.m
    @Y61.k
    public final InterfaceC43160i<Rm0.b> getEvents() {
        return this.f254821Q;
    }

    @Override // com.avito.android.arch.mvi.android.m
    @Y61.k
    public final n2<Rm0.c> getState() {
        return this.f254820P;
    }

    @Override // com.avito.android.arch.mvi.android.l
    /* renamed from: ke, reason: merged with bridge method [inline-methods] */
    public final void accept(@Y61.k InterfaceC15059a interfaceC15059a) {
        C43259k.d(N0.a(this), this.f254817M.b(), null, new a(interfaceC15059a, this, null), 2);
    }

    public final com.avito.android.arch.mvi.c<InterfaceC15059a, ReputationInternalAction, Rm0.c, Rm0.b> le() {
        return (com.avito.android.arch.mvi.c) this.f254818N.getValue();
    }
}
