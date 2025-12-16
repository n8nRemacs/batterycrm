package com.avito.android.job.cv_packages.mvi;

import cQ.InterfaceC27084a;
import cQ.c;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.job.cv_packages.mvi.a;
import com.avito.android.job.cv_packages.mvi.entity.CvPackageInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CvPackageActor.kt */
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/job/cv_packages/mvi/a$a;", "Lkotlinx/coroutines/flow/i;", "LcQ/a;", "<name for destructuring parameter 0>", "Lcom/avito/android/job/cv_packages/mvi/entity/CvPackageInternalAction;", "<anonymous>", "(Lkotlin/Q;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.job.cv_packages.mvi.CvPackageActor$process$2", f = "CvPackageActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class c extends SuspendLambda implements Y41.p<Q<? extends a.InterfaceC5142a, ? extends InterfaceC43160i<? extends InterfaceC27084a>>, Continuation<? super InterfaceC43160i<? extends CvPackageInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f174434q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.job.cv_packages.mvi.a f174435r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<com.avito.android.job.cv_packages.mvi.entity.a> f174436s;

    /* compiled from: CvPackageActor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LcQ/a;", "privateAction", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/job/cv_packages/mvi/entity/CvPackageInternalAction;", "<anonymous>", "(LcQ/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.job.cv_packages.mvi.CvPackageActor$process$2$2", f = "CvPackageActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC27084a, Continuation<? super InterfaceC43160i<? extends CvPackageInternalAction>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f174437q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.job.cv_packages.mvi.a f174438r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.avito.android.job.cv_packages.mvi.a aVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f174438r = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f174438r, continuation);
            aVar.f174437q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC27084a interfaceC27084a, Continuation<? super InterfaceC43160i<? extends CvPackageInternalAction>> continuation) {
            return ((a) create(interfaceC27084a, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            InterfaceC27084a interfaceC27084a = (InterfaceC27084a) this.f174437q;
            if (!(interfaceC27084a instanceof cQ.c)) {
                return C43175k.w();
            }
            cQ.c cVar = (cQ.c) interfaceC27084a;
            this.f174438r.getClass();
            if (cVar instanceof c.a) {
                return C43175k.h(new d(cVar, null));
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/l1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC43160i<Object> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f174439b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/l1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f174440b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.job.cv_packages.mvi.CvPackageActor$process$2$invokeSuspend$$inlined$filterIsInstance$1$2", f = "CvPackageActor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.job.cv_packages.mvi.c$b$a$a, reason: collision with other inner class name */
            public static final class C5144a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f174441q;

                /* renamed from: r, reason: collision with root package name */
                public int f174442r;

                public C5144a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f174441q = obj;
                    this.f174442r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f174440b = interfaceC43172j;
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
                    boolean r0 = r6 instanceof com.avito.android.job.cv_packages.mvi.c.b.a.C5144a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.job.cv_packages.mvi.c$b$a$a r0 = (com.avito.android.job.cv_packages.mvi.c.b.a.C5144a) r0
                    int r1 = r0.f174442r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f174442r = r1
                    goto L18
                L13:
                    com.avito.android.job.cv_packages.mvi.c$b$a$a r0 = new com.avito.android.job.cv_packages.mvi.c$b$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f174441q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f174442r
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
                    boolean r6 = r5 instanceof cQ.b
                    if (r6 == 0) goto L43
                    r0.f174442r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f174440b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.job.cv_packages.mvi.c.b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public b(InterfaceC43160i interfaceC43160i) {
            this.f174439b = interfaceC43160i;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super Object> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f174439b.collect(new a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: Merge.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.job.cv_packages.mvi.CvPackageActor$process$2$invokeSuspend$$inlined$flatMapLatest$1", f = "CvPackageActor.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.job.cv_packages.mvi.c$c, reason: collision with other inner class name */
    public static final class C5145c extends SuspendLambda implements Y41.q<InterfaceC43172j<? super CvPackageInternalAction>, cQ.b, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f174444q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f174445r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f174446s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.job.cv_packages.mvi.a f174447t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Y41.a f174448u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5145c(Y41.a aVar, com.avito.android.job.cv_packages.mvi.a aVar2, Continuation continuation) {
            super(3, continuation);
            this.f174447t = aVar2;
            this.f174448u = aVar;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super CvPackageInternalAction> interfaceC43172j, cQ.b bVar, Continuation<? super G0> continuation) {
            C5145c c5145c = new C5145c(this.f174448u, this.f174447t, continuation);
            c5145c.f174445r = interfaceC43172j;
            c5145c.f174446s = bVar;
            return c5145c.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f174444q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f174445r;
                cQ.b bVar = (cQ.b) this.f174446s;
                com.avito.android.job.cv_packages.mvi.a aVar = this.f174447t;
                aVar.getClass();
                InterfaceC43160i interfaceC43160iG = C43175k.G(new e(bVar, aVar, null));
                this.f174444q = 1;
                if (C43175k.u(this, interfaceC43160iG, interfaceC43172j) == coroutine_suspended) {
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
    public c(Y41.a aVar, com.avito.android.job.cv_packages.mvi.a aVar2, Continuation continuation) {
        super(2, continuation);
        this.f174435r = aVar2;
        this.f174436s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f174436s, this.f174435r, continuation);
        cVar.f174434q = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(Q<? extends a.InterfaceC5142a, ? extends InterfaceC43160i<? extends InterfaceC27084a>> q12, Continuation<? super InterfaceC43160i<? extends CvPackageInternalAction>> continuation) {
        return ((c) create(q12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        Q q12 = (Q) this.f174434q;
        a.InterfaceC5142a interfaceC5142a = (a.InterfaceC5142a) q12.f406619b;
        InterfaceC43160i interfaceC43160i = (InterfaceC43160i) q12.f406620c;
        boolean z12 = interfaceC5142a instanceof a.InterfaceC5142a.b;
        com.avito.android.job.cv_packages.mvi.a aVar = this.f174435r;
        if (z12) {
            return C43175k.Y(new b(interfaceC43160i), new C5145c(this.f174436s, aVar, null));
        }
        if (interfaceC5142a instanceof a.InterfaceC5142a.C5143a) {
            return C43175k.B(new a(aVar, null), interfaceC43160i);
        }
        throw new NoWhenBranchMatchedException();
    }
}
