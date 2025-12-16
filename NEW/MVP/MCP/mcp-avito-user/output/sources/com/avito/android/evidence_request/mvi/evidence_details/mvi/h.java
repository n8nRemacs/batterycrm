package com.avito.android.evidence_request.mvi.evidence_details.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.deep_linking.K;
import com.avito.android.evidence_request.mvi.evidence_details.mvi.entity.EvidenceDetailsInternalAction;
import com.avito.android.util.V2;
import java.util.Iterator;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.rx3.y;

/* compiled from: EvidenceDetailsBootstrap.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/evidence_request/mvi/evidence_details/mvi/entity/EvidenceDetailsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.evidence_request.mvi.evidence_details.mvi.EvidenceDetailsBootstrap$deeplinkClicks$1", f = "EvidenceDetailsBootstrap.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class h extends SuspendLambda implements Y41.p<InterfaceC43172j<? super EvidenceDetailsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ e f149051q;

    /* compiled from: EvidenceDetailsBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/evidence_request/mvi/evidence_details/mvi/entity/EvidenceDetailsInternalAction$OpenScreen;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.evidence_request.mvi.evidence_details.mvi.EvidenceDetailsBootstrap$deeplinkClicks$1$1$2", f = "EvidenceDetailsBootstrap.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.q<InterfaceC43172j<? super EvidenceDetailsInternalAction.OpenScreen>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Throwable f149052q;

        public a() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super EvidenceDetailsInternalAction.OpenScreen> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            a aVar = new a(3, continuation);
            aVar.f149052q = th2;
            return aVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            V2.f318762a.f(this.f149052q);
            return G0.f406611a;
        }
    }

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "kotlinx/coroutines/flow/b0"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.evidence_request.mvi.evidence_details.mvi.EvidenceDetailsBootstrap$deeplinkClicks$1$invokeSuspend$lambda$1$$inlined$transform$1", f = "EvidenceDetailsBootstrap.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super EvidenceDetailsInternalAction.OpenScreen>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f149053q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f149054r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f149055s;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<EvidenceDetailsInternalAction.OpenScreen> f149056b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.evidence_request.mvi.evidence_details.mvi.EvidenceDetailsBootstrap$deeplinkClicks$1$invokeSuspend$lambda$1$$inlined$transform$1$1", f = "EvidenceDetailsBootstrap.kt", i = {}, l = {219, 220}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.evidence_request.mvi.evidence_details.mvi.h$b$a$a, reason: collision with other inner class name */
            public static final class C4367a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f149057q;

                /* renamed from: r, reason: collision with root package name */
                public int f149058r;

                public C4367a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f149057q = obj;
                    this.f149058r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f149056b = interfaceC43172j;
            }

            /* JADX WARN: Multi-variable type inference failed */
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
                    boolean r0 = r7 instanceof com.avito.android.evidence_request.mvi.evidence_details.mvi.h.b.a.C4367a
                    if (r0 == 0) goto L13
                    r0 = r7
                    com.avito.android.evidence_request.mvi.evidence_details.mvi.h$b$a$a r0 = (com.avito.android.evidence_request.mvi.evidence_details.mvi.h.b.a.C4367a) r0
                    int r1 = r0.f149058r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f149058r = r1
                    goto L18
                L13:
                    com.avito.android.evidence_request.mvi.evidence_details.mvi.h$b$a$a r0 = new com.avito.android.evidence_request.mvi.evidence_details.mvi.h$b$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f149057q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f149058r
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L38
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    kotlin.C42729a0.b(r7)
                    goto L58
                L2c:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L34:
                    kotlin.C42729a0.b(r7)
                    goto L4d
                L38:
                    kotlin.C42729a0.b(r7)
                    com.avito.android.deep_linking.links.DeepLink r6 = (com.avito.android.deep_linking.links.DeepLink) r6
                    com.avito.android.evidence_request.mvi.evidence_details.mvi.entity.EvidenceDetailsInternalAction$OpenScreen r7 = new com.avito.android.evidence_request.mvi.evidence_details.mvi.entity.EvidenceDetailsInternalAction$OpenScreen
                    r7.<init>(r6)
                    r0.f149058r = r4
                    kotlinx.coroutines.flow.j<com.avito.android.evidence_request.mvi.evidence_details.mvi.entity.EvidenceDetailsInternalAction$OpenScreen> r6 = r5.f149056b
                    java.lang.Object r6 = r6.emit(r7, r0)
                    if (r6 != r1) goto L4d
                    return r1
                L4d:
                    r0.f149058r = r3
                    r6 = 100
                    java.lang.Object r6 = kotlinx.coroutines.C43131e0.b(r6, r0)
                    if (r6 != r1) goto L58
                    return r1
                L58:
                    kotlin.G0 r6 = kotlin.G0.f406611a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.evidence_request.mvi.evidence_details.mvi.h.b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC43160i interfaceC43160i, Continuation continuation) {
            super(2, continuation);
            this.f149055s = interfaceC43160i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(this.f149055s, continuation);
            bVar.f149054r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super EvidenceDetailsInternalAction.OpenScreen> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f149053q;
            if (i12 == 0) {
                C42729a0.b(obj);
                a aVar = new a((InterfaceC43172j) this.f149054r);
                this.f149053q = 1;
                if (this.f149055s.collect(aVar, this) == coroutine_suspended) {
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
    public h(e eVar, Continuation<? super h> continuation) {
        super(2, continuation);
        this.f149051q = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new h(this.f149051q, continuation);
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super EvidenceDetailsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((h) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        e eVar = this.f149051q;
        Iterator<T> it = eVar.f149025f.iterator();
        while (it.hasNext()) {
            TV0.d dVar = (TV0.d) it.next();
            if (dVar instanceof K) {
                C43175k.I(eVar.f149020a.b(), new C43152f0(C43175k.G(new b(C43175k.c(y.a(((K) dVar).k()), -1, 2), null)), new a(3, null)));
            }
        }
        return G0.f406611a;
    }
}
