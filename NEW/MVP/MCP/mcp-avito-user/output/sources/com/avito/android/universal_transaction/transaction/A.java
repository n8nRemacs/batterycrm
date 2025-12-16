package com.avito.android.universal_transaction.transaction;

import CG0.a;
import CG0.b;
import androidx.compose.runtime.internal.P;
import androidx.view.M0;
import androidx.view.N0;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import com.avito.android.lib.beduin_v2.feature.mvi.n;
import com.avito.android.universal_transaction.mvi.entity.TransactionInternalAction;
import com.avito.android.util.R0;
import com.facebook.imageutils.JfifUtil;
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
import kotlinx.coroutines.flow.n2;
import yG0.C50113a;

/* compiled from: TransactionViewModel.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002¨\u0006\u0006"}, d2 = {"Lcom/avito/android/universal_transaction/transaction/A;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/arch/mvi/android/k;", "LCG0/a$c;", "LCG0/c;", "LCG0/b$d;", "_avito_universal-transaction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class A extends M0 implements com.avito.android.arch.mvi.android.k<a.c, CG0.c, b.d> {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final R0 f306490E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final ZS.b f306491J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final C50113a f306492K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.engine.component.B f306493L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final Set<FV0.h> f306494M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final aU0.b f306495N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f306496O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f306497P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final n2<CG0.c> f306498Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final d f306499R;

    /* compiled from: TransactionViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.universal_transaction.transaction.TransactionViewModel$accept$1", f = "TransactionViewModel.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f306500q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ a.c f306502s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(a.c cVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f306502s = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return A.this.new a(this.f306502s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f306500q;
            if (i12 == 0) {
                C42729a0.b(obj);
                com.avito.android.arch.mvi.c<CG0.a, TransactionInternalAction, CG0.c, CG0.b> cVarLe = A.this.le();
                this.f306500q = 1;
                if (cVarLe.ya(this.f306502s, this) == coroutine_suspended) {
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

    /* compiled from: TransactionViewModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/mvi/x;", "LeT/a;", "LeT/c;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinOneTimeEvent;", "invoke", "()Lcom/avito/android/lib/beduin_v2/feature/mvi/x;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<com.avito.android.lib.beduin_v2.feature.mvi.x<? super InterfaceC40047a, ? extends AbstractC40048c, ? extends BeduinOneTimeEvent>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ n.a f306503l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ A f306504m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(n.a aVar, A a12) {
            super(0);
            this.f306503l = aVar;
            this.f306504m = a12;
        }

        @Override // Y41.a
        public final com.avito.android.lib.beduin_v2.feature.mvi.x<? super InterfaceC40047a, ? extends AbstractC40048c, ? extends BeduinOneTimeEvent> invoke() {
            return this.f306503l.a(N0.a(this.f306504m));
        }
    }

    /* compiled from: TransactionViewModel.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/arch/mvi/c;", "LCG0/a;", "Lcom/avito/android/universal_transaction/mvi/entity/TransactionInternalAction;", "LCG0/c;", "LCG0/b;", "invoke", "()Lcom/avito/android/arch/mvi/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<com.avito.android.arch.mvi.c<CG0.a, TransactionInternalAction, CG0.c, CG0.b>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.universal_transaction.mvi.n f306505l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ A f306506m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.avito.android.universal_transaction.mvi.n nVar, A a12) {
            super(0);
            this.f306505l = nVar;
            this.f306506m = a12;
        }

        @Override // Y41.a
        public final com.avito.android.arch.mvi.c<CG0.a, TransactionInternalAction, CG0.c, CG0.b> invoke() {
            return this.f306505l.a(null, N0.a(this.f306506m));
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/l1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements InterfaceC43160i<Object> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.internal.m f306507b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/l1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f306508b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.universal_transaction.transaction.TransactionViewModel$special$$inlined$filterIsInstance$1$2", f = "TransactionViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.universal_transaction.transaction.A$d$a$a, reason: collision with other inner class name */
            public static final class C9417a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f306509q;

                /* renamed from: r, reason: collision with root package name */
                public int f306510r;

                public C9417a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f306509q = obj;
                    this.f306510r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f306508b = interfaceC43172j;
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
                    boolean r0 = r6 instanceof com.avito.android.universal_transaction.transaction.A.d.a.C9417a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.universal_transaction.transaction.A$d$a$a r0 = (com.avito.android.universal_transaction.transaction.A.d.a.C9417a) r0
                    int r1 = r0.f306510r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f306510r = r1
                    goto L18
                L13:
                    com.avito.android.universal_transaction.transaction.A$d$a$a r0 = new com.avito.android.universal_transaction.transaction.A$d$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f306509q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f306510r
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
                    boolean r6 = r5 instanceof CG0.b.d
                    if (r6 == 0) goto L43
                    r0.f306510r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f306508b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.universal_transaction.transaction.A.d.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public d(kotlinx.coroutines.flow.internal.m mVar) {
            this.f306507b = mVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super Object> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f306507b.collect(new a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "kotlinx/coroutines/flow/b0"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.universal_transaction.transaction.TransactionViewModel$special$$inlined$transform$1", f = "TransactionViewModel.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CG0.c>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f306512q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f306513r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ C43188o0 f306514s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ A f306515t;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<CG0.c> f306516b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ A f306517c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.universal_transaction.transaction.TransactionViewModel$special$$inlined$transform$1$1", f = "TransactionViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.universal_transaction.transaction.A$e$a$a, reason: collision with other inner class name */
            public static final class C9418a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f306518q;

                /* renamed from: r, reason: collision with root package name */
                public int f306519r;

                public C9418a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f306518q = obj;
                    this.f306519r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j, A a12) {
                this.f306517c = a12;
                this.f306516b = interfaceC43172j;
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
                    boolean r0 = r6 instanceof com.avito.android.universal_transaction.transaction.A.e.a.C9418a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.universal_transaction.transaction.A$e$a$a r0 = (com.avito.android.universal_transaction.transaction.A.e.a.C9418a) r0
                    int r1 = r0.f306519r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f306519r = r1
                    goto L18
                L13:
                    com.avito.android.universal_transaction.transaction.A$e$a$a r0 = new com.avito.android.universal_transaction.transaction.A$e$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f306518q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f306519r
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
                    com.avito.android.universal_transaction.transaction.A r6 = r4.f306517c
                    com.avito.android.arch.mvi.c r6 = r6.le()
                    CG0.a$e r2 = new CG0.a$e
                    r2.<init>(r5)
                    r0.f306519r = r3
                    java.lang.Object r5 = r6.ya(r2, r0)
                    if (r5 != r1) goto L4a
                    return r1
                L4a:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.universal_transaction.transaction.A.e.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C43188o0 c43188o0, Continuation continuation, A a12) {
            super(2, continuation);
            this.f306514s = c43188o0;
            this.f306515t = a12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            e eVar = new e(this.f306514s, continuation, this.f306515t);
            eVar.f306513r = obj;
            return eVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CG0.c> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f306512q;
            if (i12 == 0) {
                C42729a0.b(obj);
                a aVar = new a((InterfaceC43172j) this.f306513r, this.f306515t);
                this.f306512q = 1;
                if (this.f306514s.collect(aVar, this) == coroutine_suspended) {
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
    @DebugMetadata(c = "com.avito.android.universal_transaction.transaction.TransactionViewModel$special$$inlined$transform$2", f = "TransactionViewModel.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CG0.b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f306521q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f306522r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f306523s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ A f306524t;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<CG0.b> f306525b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ A f306526c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.universal_transaction.transaction.TransactionViewModel$special$$inlined$transform$2$1", f = "TransactionViewModel.kt", i = {1, 1}, l = {220, JfifUtil.MARKER_APP1, 227}, m = "emit", n = {"this", "event"}, s = {"L$0", "L$1"})
            /* renamed from: com.avito.android.universal_transaction.transaction.A$f$a$a, reason: collision with other inner class name */
            public static final class C9419a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f306527q;

                /* renamed from: r, reason: collision with root package name */
                public int f306528r;

                /* renamed from: t, reason: collision with root package name */
                public a f306530t;

                /* renamed from: u, reason: collision with root package name */
                public b.c f306531u;

                public C9419a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f306527q = obj;
                    this.f306528r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j, A a12) {
                this.f306526c = a12;
                this.f306525b = interfaceC43172j;
            }

            /* JADX WARN: Removed duplicated region for block: B:35:0x00bd A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r8, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof com.avito.android.universal_transaction.transaction.A.f.a.C9419a
                    if (r0 == 0) goto L13
                    r0 = r9
                    com.avito.android.universal_transaction.transaction.A$f$a$a r0 = (com.avito.android.universal_transaction.transaction.A.f.a.C9419a) r0
                    int r1 = r0.f306528r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f306528r = r1
                    goto L18
                L13:
                    com.avito.android.universal_transaction.transaction.A$f$a$a r0 = new com.avito.android.universal_transaction.transaction.A$f$a$a
                    r0.<init>(r9)
                L18:
                    java.lang.Object r9 = r0.f306527q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f306528r
                    r3 = 3
                    r4 = 2
                    r5 = 1
                    if (r2 == 0) goto L41
                    if (r2 == r5) goto L3c
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    goto L3c
                L2c:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L34:
                    CG0.b$c r8 = r0.f306531u
                    com.avito.android.universal_transaction.transaction.A$f$a r2 = r0.f306530t
                    kotlin.C42729a0.b(r9)
                    goto L99
                L3c:
                    kotlin.C42729a0.b(r9)
                    goto Lbe
                L41:
                    kotlin.C42729a0.b(r9)
                    CG0.b r8 = (CG0.b) r8
                    boolean r9 = r8 instanceof CG0.b.d
                    if (r9 == 0) goto L55
                    r0.f306528r = r5
                    kotlinx.coroutines.flow.j<CG0.b> r9 = r7.f306525b
                    java.lang.Object r8 = r9.emit(r8, r0)
                    if (r8 != r1) goto Lbe
                    return r1
                L55:
                    boolean r9 = r8 instanceof CG0.b.c
                    if (r9 == 0) goto Lbe
                    r9 = r8
                    CG0.b$c r9 = (CG0.b.c) r9
                    boolean r9 = r9 instanceof CG0.b.C0099b
                    if (r9 == 0) goto Lbe
                    com.avito.android.universal_transaction.transaction.A r9 = r7.f306526c
                    yG0.a r2 = r9.f306492K
                    r2.getClass()
                    kotlin.reflect.n<java.lang.Object>[] r5 = yG0.C50113a.f443005d
                    r6 = 0
                    r5 = r5[r6]
                    com.avito.android.A0$a r2 = r2.f443006b
                    DE0.a r2 = r2.a()
                    java.lang.Object r2 = r2.invoke()
                    java.lang.Boolean r2 = (java.lang.Boolean) r2
                    boolean r2 = r2.booleanValue()
                    if (r2 == 0) goto L98
                    kotlin.C r9 = r9.f306497P
                    java.lang.Object r9 = r9.getValue()
                    com.avito.android.lib.beduin_v2.feature.mvi.x r9 = (com.avito.android.lib.beduin_v2.feature.mvi.x) r9
                    eT.a$b r2 = kotlin.InterfaceC40047a.b.f395205a
                    r0.f306530t = r7
                    r5 = r8
                    CG0.b$c r5 = (CG0.b.c) r5
                    r0.f306531u = r5
                    r0.f306528r = r4
                    java.lang.Object r9 = r9.ya(r2, r0)
                    if (r9 != r1) goto L98
                    return r1
                L98:
                    r2 = r7
                L99:
                    com.avito.android.universal_transaction.transaction.A r9 = r2.f306526c
                    kotlin.C r9 = r9.f306497P
                    java.lang.Object r9 = r9.getValue()
                    com.avito.android.lib.beduin_v2.feature.mvi.x r9 = (com.avito.android.lib.beduin_v2.feature.mvi.x) r9
                    eT.a$e r4 = new eT.a$e
                    CG0.b$b r8 = (CG0.b.C0099b) r8
                    java.lang.String r8 = r8.f2062a
                    com.avito.android.universal_transaction.transaction.A r2 = r2.f306526c
                    ZS.b r2 = r2.f306491J
                    r4.<init>(r8, r2)
                    r8 = 0
                    r0.f306530t = r8
                    r0.f306531u = r8
                    r0.f306528r = r3
                    java.lang.Object r8 = r9.ya(r4, r0)
                    if (r8 != r1) goto Lbe
                    return r1
                Lbe:
                    kotlin.G0 r8 = kotlin.G0.f406611a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.universal_transaction.transaction.A.f.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC43160i interfaceC43160i, Continuation continuation, A a12) {
            super(2, continuation);
            this.f306523s = interfaceC43160i;
            this.f306524t = a12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            f fVar = new f(this.f306523s, continuation, this.f306524t);
            fVar.f306522r = obj;
            return fVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CG0.b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f306521q;
            if (i12 == 0) {
                C42729a0.b(obj);
                a aVar = new a((InterfaceC43172j) this.f306522r, this.f306524t);
                this.f306521q = 1;
                if (this.f306523s.collect(aVar, this) == coroutine_suspended) {
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
    @DebugMetadata(c = "com.avito.android.universal_transaction.transaction.TransactionViewModel$special$$inlined$transform$3", f = "TransactionViewModel.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CG0.b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f306532q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f306533r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f306534s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ A f306535t;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<CG0.b> f306536b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ A f306537c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.universal_transaction.transaction.TransactionViewModel$special$$inlined$transform$3$1", f = "TransactionViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.universal_transaction.transaction.A$g$a$a, reason: collision with other inner class name */
            public static final class C9420a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f306538q;

                /* renamed from: r, reason: collision with root package name */
                public int f306539r;

                public C9420a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f306538q = obj;
                    this.f306539r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j, A a12) {
                this.f306537c = a12;
                this.f306536b = interfaceC43172j;
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
                    boolean r0 = r6 instanceof com.avito.android.universal_transaction.transaction.A.g.a.C9420a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.universal_transaction.transaction.A$g$a$a r0 = (com.avito.android.universal_transaction.transaction.A.g.a.C9420a) r0
                    int r1 = r0.f306539r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f306539r = r1
                    goto L18
                L13:
                    com.avito.android.universal_transaction.transaction.A$g$a$a r0 = new com.avito.android.universal_transaction.transaction.A$g$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f306538q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f306539r
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
                    com.avito.android.universal_transaction.transaction.A r6 = r4.f306537c
                    com.avito.android.arch.mvi.c r6 = r6.le()
                    CG0.a$a r2 = new CG0.a$a
                    r2.<init>(r5)
                    r0.f306539r = r3
                    java.lang.Object r5 = r6.ya(r2, r0)
                    if (r5 != r1) goto L4a
                    return r1
                L4a:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.universal_transaction.transaction.A.g.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC43160i interfaceC43160i, Continuation continuation, A a12) {
            super(2, continuation);
            this.f306534s = interfaceC43160i;
            this.f306535t = a12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            g gVar = new g(this.f306534s, continuation, this.f306535t);
            gVar.f306533r = obj;
            return gVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CG0.b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f306532q;
            if (i12 == 0) {
                C42729a0.b(obj);
                a aVar = new a((InterfaceC43172j) this.f306533r, this.f306535t);
                this.f306532q = 1;
                if (this.f306534s.collect(aVar, this) == coroutine_suspended) {
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
    public A(@Y61.k com.avito.android.universal_transaction.mvi.n nVar, @Y61.k n.a aVar, @Y61.k R0 r02, @Y61.k ZS.b bVar, @Y61.k C50113a c50113a, @Y61.k com.avito.beduin.v2.engine.component.B b12, @Y61.k Set<FV0.h> set, @Y61.k aU0.b bVar2) {
        this.f306490E = r02;
        this.f306491J = bVar;
        this.f306492K = c50113a;
        this.f306493L = b12;
        this.f306494M = set;
        this.f306495N = bVar2;
        this.f306496O = C42727D.c(new c(nVar, this));
        InterfaceC42726C interfaceC42726CC = C42727D.c(new b(aVar, this));
        this.f306497P = interfaceC42726CC;
        kotlinx.coroutines.flow.internal.m mVarN = C43175k.N(le(), C43175k.G(new e(C43175k.t((com.avito.android.lib.beduin_v2.feature.mvi.x) interfaceC42726CC.getValue(), 1), null, this)));
        A1.a aVarA = N0.a(this);
        i2.f411430a.getClass();
        i2 i2Var = i2.a.f411433c;
        CG0.c.f2063e.getClass();
        this.f306498Q = C43175k.U(mVarN, aVarA, i2Var, CG0.c.f2064f);
        this.f306499R = new d(C43175k.N(C43175k.G(new f(le().f91928q, null, this)), C43175k.G(new g(((com.avito.android.lib.beduin_v2.feature.mvi.x) interfaceC42726CC.getValue()).getEvents(), null, this))));
    }

    @Override // com.avito.android.arch.mvi.android.m
    @Y61.k
    public final InterfaceC43160i<b.d> getEvents() {
        return this.f306499R;
    }

    @Override // com.avito.android.arch.mvi.android.m
    @Y61.k
    public final n2<CG0.c> getState() {
        return this.f306498Q;
    }

    @Override // com.avito.android.arch.mvi.android.l
    /* renamed from: ke, reason: merged with bridge method [inline-methods] */
    public final void accept(@Y61.k a.c cVar) {
        C43259k.d(N0.a(this), this.f306490E.b(), null, new a(cVar, null), 2);
    }

    public final com.avito.android.arch.mvi.c<CG0.a, TransactionInternalAction, CG0.c, CG0.b> le() {
        return (com.avito.android.arch.mvi.c) this.f306496O.getValue();
    }
}
