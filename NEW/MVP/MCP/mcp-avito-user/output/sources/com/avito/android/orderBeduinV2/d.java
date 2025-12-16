package com.avito.android.orderBeduinV2;

import FV0.h;
import U40.a;
import U40.b;
import Y41.p;
import Y61.l;
import androidx.view.M0;
import androidx.view.N0;
import com.avito.android.arch.mvi.android.k;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import com.avito.android.lib.beduin_v2.feature.mvi.n;
import com.avito.android.lib.beduin_v2.feature.mvi.x;
import com.avito.android.orderBeduinV2.mvi.entity.OrderInternalAction;
import com.avito.android.orderBeduinV2.mvi.q;
import com.avito.android.util.R0;
import com.avito.beduin.v2.engine.component.B;
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
import kotlinx.coroutines.flow.internal.m;
import kotlinx.coroutines.flow.n2;

/* compiled from: OrderViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002¨\u0006\u0006"}, d2 = {"Lcom/avito/android/orderBeduinV2/d;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/arch/mvi/android/k;", "LU40/a$d;", "LU40/c;", "LU40/b$d;", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d extends M0 implements k<a.d, U40.c, b.d> {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final B f209752E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final Set<h> f209753J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final aU0.b f209754K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final R0 f209755L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final ZS.b f209756M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final dD.b f209757N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f209758O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f209759P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final n2<U40.c> f209760Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final C6253d f209761R;

    /* compiled from: OrderViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.orderBeduinV2.OrderViewModel$accept$1", f = "OrderViewModel.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f209762q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ a.d f209764s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(a.d dVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f209764s = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            return d.this.new a(this.f209764s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f209762q;
            if (i12 == 0) {
                C42729a0.b(obj);
                com.avito.android.arch.mvi.c<U40.a, OrderInternalAction, U40.c, U40.b> cVarLe = d.this.le();
                this.f209762q = 1;
                if (cVarLe.ya(this.f209764s, this) == coroutine_suspended) {
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

    /* compiled from: OrderViewModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/mvi/x;", "LeT/a;", "LeT/c;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinOneTimeEvent;", "invoke", "()Lcom/avito/android/lib/beduin_v2/feature/mvi/x;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<x<? super InterfaceC40047a, ? extends AbstractC40048c, ? extends BeduinOneTimeEvent>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ n.a f209765l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ d f209766m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(n.a aVar, d dVar) {
            super(0);
            this.f209765l = aVar;
            this.f209766m = dVar;
        }

        @Override // Y41.a
        public final x<? super InterfaceC40047a, ? extends AbstractC40048c, ? extends BeduinOneTimeEvent> invoke() {
            return this.f209765l.a(N0.a(this.f209766m));
        }
    }

    /* compiled from: OrderViewModel.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/arch/mvi/c;", "LU40/a;", "Lcom/avito/android/orderBeduinV2/mvi/entity/OrderInternalAction;", "LU40/c;", "LU40/b;", "invoke", "()Lcom/avito/android/arch/mvi/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<com.avito.android.arch.mvi.c<U40.a, OrderInternalAction, U40.c, U40.b>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ q f209767l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ d f209768m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(q qVar, d dVar) {
            super(0);
            this.f209767l = qVar;
            this.f209768m = dVar;
        }

        @Override // Y41.a
        public final com.avito.android.arch.mvi.c<U40.a, OrderInternalAction, U40.c, U40.b> invoke() {
            return this.f209767l.a(null, N0.a(this.f209768m));
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/l1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.orderBeduinV2.d$d, reason: collision with other inner class name */
    public static final class C6253d implements InterfaceC43160i<Object> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m f209769b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/l1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.orderBeduinV2.d$d$a */
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f209770b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.orderBeduinV2.OrderViewModel$special$$inlined$filterIsInstance$1$2", f = "OrderViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.orderBeduinV2.d$d$a$a, reason: collision with other inner class name */
            public static final class C6254a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f209771q;

                /* renamed from: r, reason: collision with root package name */
                public int f209772r;

                public C6254a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f209771q = obj;
                    this.f209772r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f209770b = interfaceC43172j;
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
                    boolean r0 = r6 instanceof com.avito.android.orderBeduinV2.d.C6253d.a.C6254a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.orderBeduinV2.d$d$a$a r0 = (com.avito.android.orderBeduinV2.d.C6253d.a.C6254a) r0
                    int r1 = r0.f209772r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f209772r = r1
                    goto L18
                L13:
                    com.avito.android.orderBeduinV2.d$d$a$a r0 = new com.avito.android.orderBeduinV2.d$d$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f209771q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f209772r
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
                    boolean r6 = r5 instanceof U40.b.d
                    if (r6 == 0) goto L43
                    r0.f209772r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f209770b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.orderBeduinV2.d.C6253d.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public C6253d(m mVar) {
            this.f209769b = mVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @l
        public final Object collect(@Y61.k InterfaceC43172j<? super Object> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f209769b.collect(new a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "kotlinx/coroutines/flow/b0"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.orderBeduinV2.OrderViewModel$special$$inlined$transform$1", f = "OrderViewModel.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements p<InterfaceC43172j<? super U40.c>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f209774q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f209775r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ C43188o0 f209776s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ d f209777t;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<U40.c> f209778b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ d f209779c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.orderBeduinV2.OrderViewModel$special$$inlined$transform$1$1", f = "OrderViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.orderBeduinV2.d$e$a$a, reason: collision with other inner class name */
            public static final class C6255a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f209780q;

                /* renamed from: r, reason: collision with root package name */
                public int f209781r;

                public C6255a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f209780q = obj;
                    this.f209781r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j, d dVar) {
                this.f209779c = dVar;
                this.f209778b = interfaceC43172j;
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
                    boolean r0 = r6 instanceof com.avito.android.orderBeduinV2.d.e.a.C6255a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.orderBeduinV2.d$e$a$a r0 = (com.avito.android.orderBeduinV2.d.e.a.C6255a) r0
                    int r1 = r0.f209781r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f209781r = r1
                    goto L18
                L13:
                    com.avito.android.orderBeduinV2.d$e$a$a r0 = new com.avito.android.orderBeduinV2.d$e$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f209780q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f209781r
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
                    com.avito.android.orderBeduinV2.d r6 = r4.f209779c
                    com.avito.android.arch.mvi.c r6 = r6.le()
                    U40.a$h r2 = new U40.a$h
                    r2.<init>(r5)
                    r0.f209781r = r3
                    java.lang.Object r5 = r6.ya(r2, r0)
                    if (r5 != r1) goto L4a
                    return r1
                L4a:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.orderBeduinV2.d.e.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C43188o0 c43188o0, Continuation continuation, d dVar) {
            super(2, continuation);
            this.f209776s = c43188o0;
            this.f209777t = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            e eVar = new e(this.f209776s, continuation, this.f209777t);
            eVar.f209775r = obj;
            return eVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super U40.c> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f209774q;
            if (i12 == 0) {
                C42729a0.b(obj);
                a aVar = new a((InterfaceC43172j) this.f209775r, this.f209777t);
                this.f209774q = 1;
                if (this.f209776s.collect(aVar, this) == coroutine_suspended) {
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
    @DebugMetadata(c = "com.avito.android.orderBeduinV2.OrderViewModel$special$$inlined$transform$2", f = "OrderViewModel.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements p<InterfaceC43172j<? super U40.b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f209783q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f209784r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f209785s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ d f209786t;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<U40.b> f209787b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ d f209788c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.orderBeduinV2.OrderViewModel$special$$inlined$transform$2$1", f = "OrderViewModel.kt", i = {1, 1}, l = {220, JfifUtil.MARKER_APP1, 227}, m = "emit", n = {"this", "event"}, s = {"L$0", "L$1"})
            /* renamed from: com.avito.android.orderBeduinV2.d$f$a$a, reason: collision with other inner class name */
            public static final class C6256a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f209789q;

                /* renamed from: r, reason: collision with root package name */
                public int f209790r;

                /* renamed from: t, reason: collision with root package name */
                public a f209792t;

                /* renamed from: u, reason: collision with root package name */
                public b.c f209793u;

                public C6256a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f209789q = obj;
                    this.f209790r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j, d dVar) {
                this.f209788c = dVar;
                this.f209787b = interfaceC43172j;
            }

            /* JADX WARN: Removed duplicated region for block: B:35:0x00bc A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r7, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof com.avito.android.orderBeduinV2.d.f.a.C6256a
                    if (r0 == 0) goto L13
                    r0 = r8
                    com.avito.android.orderBeduinV2.d$f$a$a r0 = (com.avito.android.orderBeduinV2.d.f.a.C6256a) r0
                    int r1 = r0.f209790r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f209790r = r1
                    goto L18
                L13:
                    com.avito.android.orderBeduinV2.d$f$a$a r0 = new com.avito.android.orderBeduinV2.d$f$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f209789q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f209790r
                    r3 = 2
                    r4 = 1
                    r5 = 3
                    if (r2 == 0) goto L41
                    if (r2 == r4) goto L3c
                    if (r2 == r3) goto L34
                    if (r2 != r5) goto L2c
                    goto L3c
                L2c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L34:
                    U40.b$c r7 = r0.f209793u
                    com.avito.android.orderBeduinV2.d$f$a r2 = r0.f209792t
                    kotlin.C42729a0.b(r8)
                    goto L98
                L3c:
                    kotlin.C42729a0.b(r8)
                    goto Lbd
                L41:
                    kotlin.C42729a0.b(r8)
                    U40.b r7 = (U40.b) r7
                    boolean r8 = r7 instanceof U40.b.d
                    if (r8 == 0) goto L55
                    r0.f209790r = r4
                    kotlinx.coroutines.flow.j<U40.b> r8 = r6.f209787b
                    java.lang.Object r7 = r8.emit(r7, r0)
                    if (r7 != r1) goto Lbd
                    return r1
                L55:
                    boolean r8 = r7 instanceof U40.b.c
                    if (r8 == 0) goto Lbd
                    r8 = r7
                    U40.b$c r8 = (U40.b.c) r8
                    boolean r8 = r8 instanceof U40.b.C1097b
                    if (r8 == 0) goto Lbd
                    com.avito.android.orderBeduinV2.d r8 = r6.f209788c
                    dD.b r2 = r8.f209757N
                    r2.getClass()
                    kotlin.reflect.n<java.lang.Object>[] r4 = dD.b.f393739f
                    r4 = r4[r5]
                    com.avito.android.A0$a r2 = r2.f393743e
                    DE0.a r2 = r2.a()
                    java.lang.Object r2 = r2.invoke()
                    java.lang.Boolean r2 = (java.lang.Boolean) r2
                    boolean r2 = r2.booleanValue()
                    if (r2 == 0) goto L97
                    kotlin.C r8 = r8.f209759P
                    java.lang.Object r8 = r8.getValue()
                    com.avito.android.lib.beduin_v2.feature.mvi.x r8 = (com.avito.android.lib.beduin_v2.feature.mvi.x) r8
                    eT.a$b r2 = kotlin.InterfaceC40047a.b.f395205a
                    r0.f209792t = r6
                    r4 = r7
                    U40.b$c r4 = (U40.b.c) r4
                    r0.f209793u = r4
                    r0.f209790r = r3
                    java.lang.Object r8 = r8.ya(r2, r0)
                    if (r8 != r1) goto L97
                    return r1
                L97:
                    r2 = r6
                L98:
                    com.avito.android.orderBeduinV2.d r8 = r2.f209788c
                    kotlin.C r8 = r8.f209759P
                    java.lang.Object r8 = r8.getValue()
                    com.avito.android.lib.beduin_v2.feature.mvi.x r8 = (com.avito.android.lib.beduin_v2.feature.mvi.x) r8
                    eT.a$e r3 = new eT.a$e
                    U40.b$b r7 = (U40.b.C1097b) r7
                    java.lang.String r7 = r7.f16169a
                    com.avito.android.orderBeduinV2.d r2 = r2.f209788c
                    ZS.b r2 = r2.f209756M
                    r3.<init>(r7, r2)
                    r7 = 0
                    r0.f209792t = r7
                    r0.f209793u = r7
                    r0.f209790r = r5
                    java.lang.Object r7 = r8.ya(r3, r0)
                    if (r7 != r1) goto Lbd
                    return r1
                Lbd:
                    kotlin.G0 r7 = kotlin.G0.f406611a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.orderBeduinV2.d.f.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC43160i interfaceC43160i, Continuation continuation, d dVar) {
            super(2, continuation);
            this.f209785s = interfaceC43160i;
            this.f209786t = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            f fVar = new f(this.f209785s, continuation, this.f209786t);
            fVar.f209784r = obj;
            return fVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super U40.b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f209783q;
            if (i12 == 0) {
                C42729a0.b(obj);
                a aVar = new a((InterfaceC43172j) this.f209784r, this.f209786t);
                this.f209783q = 1;
                if (this.f209785s.collect(aVar, this) == coroutine_suspended) {
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
    @DebugMetadata(c = "com.avito.android.orderBeduinV2.OrderViewModel$special$$inlined$transform$3", f = "OrderViewModel.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements p<InterfaceC43172j<? super U40.b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f209794q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f209795r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f209796s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ d f209797t;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<U40.b> f209798b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ d f209799c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.orderBeduinV2.OrderViewModel$special$$inlined$transform$3$1", f = "OrderViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.orderBeduinV2.d$g$a$a, reason: collision with other inner class name */
            public static final class C6257a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f209800q;

                /* renamed from: r, reason: collision with root package name */
                public int f209801r;

                public C6257a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f209800q = obj;
                    this.f209801r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j, d dVar) {
                this.f209799c = dVar;
                this.f209798b = interfaceC43172j;
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
                    boolean r0 = r6 instanceof com.avito.android.orderBeduinV2.d.g.a.C6257a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.orderBeduinV2.d$g$a$a r0 = (com.avito.android.orderBeduinV2.d.g.a.C6257a) r0
                    int r1 = r0.f209801r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f209801r = r1
                    goto L18
                L13:
                    com.avito.android.orderBeduinV2.d$g$a$a r0 = new com.avito.android.orderBeduinV2.d$g$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f209800q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f209801r
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
                    com.avito.android.orderBeduinV2.d r6 = r4.f209799c
                    com.avito.android.arch.mvi.c r6 = r6.le()
                    U40.a$a r2 = new U40.a$a
                    r2.<init>(r5)
                    r0.f209801r = r3
                    java.lang.Object r5 = r6.ya(r2, r0)
                    if (r5 != r1) goto L4a
                    return r1
                L4a:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.orderBeduinV2.d.g.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC43160i interfaceC43160i, Continuation continuation, d dVar) {
            super(2, continuation);
            this.f209796s = interfaceC43160i;
            this.f209797t = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            g gVar = new g(this.f209796s, continuation, this.f209797t);
            gVar.f209795r = obj;
            return gVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super U40.b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f209794q;
            if (i12 == 0) {
                C42729a0.b(obj);
                a aVar = new a((InterfaceC43172j) this.f209795r, this.f209797t);
                this.f209794q = 1;
                if (this.f209796s.collect(aVar, this) == coroutine_suspended) {
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
    public d(@Y61.k q qVar, @Y61.k n.a aVar, @Y61.k B b12, @Y61.k Set<h> set, @Y61.k aU0.b bVar, @Y61.k R0 r02, @Y61.k ZS.b bVar2, @Y61.k dD.b bVar3) {
        this.f209752E = b12;
        this.f209753J = set;
        this.f209754K = bVar;
        this.f209755L = r02;
        this.f209756M = bVar2;
        this.f209757N = bVar3;
        this.f209758O = C42727D.c(new c(qVar, this));
        InterfaceC42726C interfaceC42726CC = C42727D.c(new b(aVar, this));
        this.f209759P = interfaceC42726CC;
        m mVarN = C43175k.N(le(), C43175k.G(new e(C43175k.t((x) interfaceC42726CC.getValue(), 1), null, this)));
        A1.a aVarA = N0.a(this);
        i2.f411430a.getClass();
        i2 i2Var = i2.a.f411433c;
        U40.c.f16170g.getClass();
        this.f209760Q = C43175k.U(mVarN, aVarA, i2Var, U40.c.f16171h);
        this.f209761R = new C6253d(C43175k.N(C43175k.G(new f(le().f91928q, null, this)), C43175k.G(new g(((x) interfaceC42726CC.getValue()).getEvents(), null, this))));
    }

    @Override // com.avito.android.arch.mvi.android.m
    @Y61.k
    public final InterfaceC43160i<b.d> getEvents() {
        return this.f209761R;
    }

    @Override // com.avito.android.arch.mvi.android.m
    @Y61.k
    public final n2<U40.c> getState() {
        return this.f209760Q;
    }

    @Override // com.avito.android.arch.mvi.android.l
    /* renamed from: ke, reason: merged with bridge method [inline-methods] */
    public final void accept(@Y61.k a.d dVar) {
        C43259k.d(N0.a(this), this.f209755L.b(), null, new a(dVar, null), 2);
    }

    public final com.avito.android.arch.mvi.c<U40.a, OrderInternalAction, U40.c, U40.b> le() {
        return (com.avito.android.arch.mvi.c) this.f209758O.getValue();
    }
}
