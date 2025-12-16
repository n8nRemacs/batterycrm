package com.avito.android.legal_request;

import FV0.h;
import Y41.p;
import Y61.l;
import androidx.view.M0;
import androidx.view.N0;
import com.avito.android.arch.mvi.android.k;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.legal_request.mvi.entity.LegalRequestInternalAction;
import com.avito.android.legal_request.mvi.i;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import com.avito.android.lib.beduin_v2.feature.mvi.n;
import com.avito.android.lib.beduin_v2.feature.mvi.x;
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
import sR.C48100c;
import sR.InterfaceC48098a;
import sR.InterfaceC48099b;

/* compiled from: LegalRequestViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002¨\u0006\u0006"}, d2 = {"Lcom/avito/android/legal_request/d;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/arch/mvi/android/k;", "LsR/a$f;", "LsR/c;", "LsR/b$e;", "_avito_legal-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d extends M0 implements k<InterfaceC48098a.f, C48100c, InterfaceC48099b.e> {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final B f175202E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final Set<h> f175203J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final aU0.b f175204K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final R0 f175205L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f175206M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f175207N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final n2<C48100c> f175208O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final C5163d f175209P;

    /* compiled from: LegalRequestViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.legal_request.LegalRequestViewModel$accept$1", f = "LegalRequestViewModel.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f175210q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC48098a.f f175212s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC48098a.f fVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f175212s = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            return d.this.new a(this.f175212s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f175210q;
            if (i12 == 0) {
                C42729a0.b(obj);
                com.avito.android.arch.mvi.c<InterfaceC48098a, LegalRequestInternalAction, C48100c, InterfaceC48099b> cVarLe = d.this.le();
                this.f175210q = 1;
                if (cVarLe.ya(this.f175212s, this) == coroutine_suspended) {
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

    /* compiled from: LegalRequestViewModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/mvi/x;", "LeT/a;", "LeT/c;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinOneTimeEvent;", "invoke", "()Lcom/avito/android/lib/beduin_v2/feature/mvi/x;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<x<? super InterfaceC40047a, ? extends AbstractC40048c, ? extends BeduinOneTimeEvent>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ n.a f175213l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ d f175214m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(n.a aVar, d dVar) {
            super(0);
            this.f175213l = aVar;
            this.f175214m = dVar;
        }

        @Override // Y41.a
        public final x<? super InterfaceC40047a, ? extends AbstractC40048c, ? extends BeduinOneTimeEvent> invoke() {
            return this.f175213l.a(N0.a(this.f175214m));
        }
    }

    /* compiled from: LegalRequestViewModel.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/arch/mvi/c;", "LsR/a;", "Lcom/avito/android/legal_request/mvi/entity/LegalRequestInternalAction;", "LsR/c;", "LsR/b;", "invoke", "()Lcom/avito/android/arch/mvi/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<com.avito.android.arch.mvi.c<InterfaceC48098a, LegalRequestInternalAction, C48100c, InterfaceC48099b>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ i f175215l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ d f175216m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(i iVar, d dVar) {
            super(0);
            this.f175215l = iVar;
            this.f175216m = dVar;
        }

        @Override // Y41.a
        public final com.avito.android.arch.mvi.c<InterfaceC48098a, LegalRequestInternalAction, C48100c, InterfaceC48099b> invoke() {
            return this.f175215l.a(null, N0.a(this.f175216m));
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/l1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.legal_request.d$d, reason: collision with other inner class name */
    public static final class C5163d implements InterfaceC43160i<Object> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m f175217b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/l1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.legal_request.d$d$a */
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f175218b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.legal_request.LegalRequestViewModel$special$$inlined$filterIsInstance$1$2", f = "LegalRequestViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.legal_request.d$d$a$a, reason: collision with other inner class name */
            public static final class C5164a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f175219q;

                /* renamed from: r, reason: collision with root package name */
                public int f175220r;

                public C5164a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f175219q = obj;
                    this.f175220r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f175218b = interfaceC43172j;
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
                    boolean r0 = r6 instanceof com.avito.android.legal_request.d.C5163d.a.C5164a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.legal_request.d$d$a$a r0 = (com.avito.android.legal_request.d.C5163d.a.C5164a) r0
                    int r1 = r0.f175220r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f175220r = r1
                    goto L18
                L13:
                    com.avito.android.legal_request.d$d$a$a r0 = new com.avito.android.legal_request.d$d$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f175219q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f175220r
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
                    boolean r6 = r5 instanceof sR.InterfaceC48099b.e
                    if (r6 == 0) goto L43
                    r0.f175220r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f175218b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.legal_request.d.C5163d.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public C5163d(m mVar) {
            this.f175217b = mVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @l
        public final Object collect(@Y61.k InterfaceC43172j<? super Object> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f175217b.collect(new a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "kotlinx/coroutines/flow/b0"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.legal_request.LegalRequestViewModel$special$$inlined$transform$1", f = "LegalRequestViewModel.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements p<InterfaceC43172j<? super C48100c>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f175222q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f175223r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ C43188o0 f175224s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ d f175225t;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<C48100c> f175226b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ d f175227c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.legal_request.LegalRequestViewModel$special$$inlined$transform$1$1", f = "LegalRequestViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.legal_request.d$e$a$a, reason: collision with other inner class name */
            public static final class C5165a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f175228q;

                /* renamed from: r, reason: collision with root package name */
                public int f175229r;

                public C5165a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f175228q = obj;
                    this.f175229r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j, d dVar) {
                this.f175227c = dVar;
                this.f175226b = interfaceC43172j;
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
                    boolean r0 = r6 instanceof com.avito.android.legal_request.d.e.a.C5165a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.legal_request.d$e$a$a r0 = (com.avito.android.legal_request.d.e.a.C5165a) r0
                    int r1 = r0.f175229r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f175229r = r1
                    goto L18
                L13:
                    com.avito.android.legal_request.d$e$a$a r0 = new com.avito.android.legal_request.d$e$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f175228q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f175229r
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
                    com.avito.android.legal_request.d r6 = r4.f175227c
                    com.avito.android.arch.mvi.c r6 = r6.le()
                    sR.a$g r2 = new sR.a$g
                    r2.<init>(r5)
                    r0.f175229r = r3
                    java.lang.Object r5 = r6.ya(r2, r0)
                    if (r5 != r1) goto L4a
                    return r1
                L4a:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.legal_request.d.e.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C43188o0 c43188o0, Continuation continuation, d dVar) {
            super(2, continuation);
            this.f175224s = c43188o0;
            this.f175225t = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            e eVar = new e(this.f175224s, continuation, this.f175225t);
            eVar.f175223r = obj;
            return eVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super C48100c> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f175222q;
            if (i12 == 0) {
                C42729a0.b(obj);
                a aVar = new a((InterfaceC43172j) this.f175223r, this.f175225t);
                this.f175222q = 1;
                if (this.f175224s.collect(aVar, this) == coroutine_suspended) {
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
    @DebugMetadata(c = "com.avito.android.legal_request.LegalRequestViewModel$special$$inlined$transform$2", f = "LegalRequestViewModel.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements p<InterfaceC43172j<? super InterfaceC48099b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f175231q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f175232r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f175233s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ d f175234t;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<InterfaceC48099b> f175235b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ d f175236c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.legal_request.LegalRequestViewModel$special$$inlined$transform$2$1", f = "LegalRequestViewModel.kt", i = {}, l = {220, 222}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.legal_request.d$f$a$a, reason: collision with other inner class name */
            public static final class C5166a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f175237q;

                /* renamed from: r, reason: collision with root package name */
                public int f175238r;

                public C5166a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f175237q = obj;
                    this.f175238r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j, d dVar) {
                this.f175236c = dVar;
                this.f175235b = interfaceC43172j;
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
                    boolean r0 = r7 instanceof com.avito.android.legal_request.d.f.a.C5166a
                    if (r0 == 0) goto L13
                    r0 = r7
                    com.avito.android.legal_request.d$f$a$a r0 = (com.avito.android.legal_request.d.f.a.C5166a) r0
                    int r1 = r0.f175238r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f175238r = r1
                    goto L18
                L13:
                    com.avito.android.legal_request.d$f$a$a r0 = new com.avito.android.legal_request.d$f$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f175237q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f175238r
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L35
                    if (r2 == r4) goto L31
                    if (r2 != r3) goto L29
                    goto L31
                L29:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L31:
                    kotlin.C42729a0.b(r7)
                    goto L6b
                L35:
                    kotlin.C42729a0.b(r7)
                    sR.b r6 = (sR.InterfaceC48099b) r6
                    boolean r7 = r6 instanceof sR.InterfaceC48099b.e
                    if (r7 == 0) goto L49
                    r0.f175238r = r4
                    kotlinx.coroutines.flow.j<sR.b> r7 = r5.f175235b
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L6b
                    return r1
                L49:
                    boolean r7 = r6 instanceof sR.InterfaceC48099b.d
                    if (r7 == 0) goto L6b
                    r7 = r6
                    sR.b$d r7 = (sR.InterfaceC48099b.d) r7
                    boolean r7 = r7 instanceof sR.InterfaceC48099b.a
                    if (r7 == 0) goto L6b
                    com.avito.android.legal_request.d r7 = r5.f175236c
                    kotlin.C r7 = r7.f175207N
                    java.lang.Object r7 = r7.getValue()
                    com.avito.android.lib.beduin_v2.feature.mvi.x r7 = (com.avito.android.lib.beduin_v2.feature.mvi.x) r7
                    sR.b$a r6 = (sR.InterfaceC48099b.a) r6
                    eT.a r6 = r6.f437651a
                    r0.f175238r = r3
                    java.lang.Object r6 = r7.ya(r6, r0)
                    if (r6 != r1) goto L6b
                    return r1
                L6b:
                    kotlin.G0 r6 = kotlin.G0.f406611a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.legal_request.d.f.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC43160i interfaceC43160i, Continuation continuation, d dVar) {
            super(2, continuation);
            this.f175233s = interfaceC43160i;
            this.f175234t = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            f fVar = new f(this.f175233s, continuation, this.f175234t);
            fVar.f175232r = obj;
            return fVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super InterfaceC48099b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f175231q;
            if (i12 == 0) {
                C42729a0.b(obj);
                a aVar = new a((InterfaceC43172j) this.f175232r, this.f175234t);
                this.f175231q = 1;
                if (this.f175233s.collect(aVar, this) == coroutine_suspended) {
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
    @DebugMetadata(c = "com.avito.android.legal_request.LegalRequestViewModel$special$$inlined$transform$3", f = "LegalRequestViewModel.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements p<InterfaceC43172j<? super InterfaceC48099b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f175240q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f175241r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f175242s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ d f175243t;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<InterfaceC48099b> f175244b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ d f175245c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.legal_request.LegalRequestViewModel$special$$inlined$transform$3$1", f = "LegalRequestViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.legal_request.d$g$a$a, reason: collision with other inner class name */
            public static final class C5167a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f175246q;

                /* renamed from: r, reason: collision with root package name */
                public int f175247r;

                public C5167a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f175246q = obj;
                    this.f175247r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j, d dVar) {
                this.f175245c = dVar;
                this.f175244b = interfaceC43172j;
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
                    boolean r0 = r6 instanceof com.avito.android.legal_request.d.g.a.C5167a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.legal_request.d$g$a$a r0 = (com.avito.android.legal_request.d.g.a.C5167a) r0
                    int r1 = r0.f175247r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f175247r = r1
                    goto L18
                L13:
                    com.avito.android.legal_request.d$g$a$a r0 = new com.avito.android.legal_request.d$g$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f175246q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f175247r
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
                    com.avito.android.legal_request.d r6 = r4.f175245c
                    com.avito.android.arch.mvi.c r6 = r6.le()
                    sR.a$b r2 = new sR.a$b
                    r2.<init>(r5)
                    r0.f175247r = r3
                    java.lang.Object r5 = r6.ya(r2, r0)
                    if (r5 != r1) goto L4a
                    return r1
                L4a:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.legal_request.d.g.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC43160i interfaceC43160i, Continuation continuation, d dVar) {
            super(2, continuation);
            this.f175242s = interfaceC43160i;
            this.f175243t = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            g gVar = new g(this.f175242s, continuation, this.f175243t);
            gVar.f175241r = obj;
            return gVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super InterfaceC48099b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f175240q;
            if (i12 == 0) {
                C42729a0.b(obj);
                a aVar = new a((InterfaceC43172j) this.f175241r, this.f175243t);
                this.f175240q = 1;
                if (this.f175242s.collect(aVar, this) == coroutine_suspended) {
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
    public d(@Y61.k i iVar, @Y61.k n.a aVar, @Y61.k B b12, @Y61.k Set<h> set, @Y61.k aU0.b bVar, @Y61.k R0 r02) {
        this.f175202E = b12;
        this.f175203J = set;
        this.f175204K = bVar;
        this.f175205L = r02;
        this.f175206M = C42727D.c(new c(iVar, this));
        InterfaceC42726C interfaceC42726CC = C42727D.c(new b(aVar, this));
        this.f175207N = interfaceC42726CC;
        m mVarN = C43175k.N(le(), C43175k.G(new e(C43175k.t((x) interfaceC42726CC.getValue(), 1), null, this)));
        A1.a aVarA = N0.a(this);
        i2 i2Var = com.avito.android.arch.mvi.android.a.f91843a;
        C48100c.f437655d.getClass();
        this.f175208O = C43175k.U(mVarN, aVarA, i2Var, C48100c.f437656e);
        this.f175209P = new C5163d(C43175k.N(C43175k.G(new f(le().f91928q, null, this)), C43175k.G(new g(((x) interfaceC42726CC.getValue()).getEvents(), null, this))));
    }

    @Override // com.avito.android.arch.mvi.android.m
    @Y61.k
    public final InterfaceC43160i<InterfaceC48099b.e> getEvents() {
        return this.f175209P;
    }

    @Override // com.avito.android.arch.mvi.android.m
    @Y61.k
    public final n2<C48100c> getState() {
        return this.f175208O;
    }

    @Override // com.avito.android.arch.mvi.android.l
    /* renamed from: ke, reason: merged with bridge method [inline-methods] */
    public final void accept(@Y61.k InterfaceC48098a.f fVar) {
        C43259k.d(N0.a(this), this.f175205L.b(), null, new a(fVar, null), 2);
    }

    public final com.avito.android.arch.mvi.c<InterfaceC48098a, LegalRequestInternalAction, C48100c, InterfaceC48099b> le() {
        return (com.avito.android.arch.mvi.c) this.f175206M.getValue();
    }
}
