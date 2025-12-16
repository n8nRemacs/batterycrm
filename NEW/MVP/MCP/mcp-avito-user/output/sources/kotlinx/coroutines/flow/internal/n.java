package kotlinx.coroutines.flow.internal;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.X;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.channels.C43108m;
import kotlinx.coroutines.channels.InterfaceC43123w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: Combine.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002*\u001c\b\u0002\u0010\u0002\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000¨\u0006\u0003"}, d2 = {"Lkotlin/collections/H0;", "", "Update", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class n {

    /* compiled from: Combine.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "T", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {51, 73, 76}, m = "invokeSuspend", n = {"latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1"})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public InterfaceC43123w f411511q;

        /* renamed from: r, reason: collision with root package name */
        public byte[] f411512r;

        /* renamed from: s, reason: collision with root package name */
        public int f411513s;

        /* renamed from: t, reason: collision with root package name */
        public int f411514t;

        /* renamed from: u, reason: collision with root package name */
        public int f411515u;

        /* renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f411516v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<Object>[] f411517w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ N f411518x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ SuspendLambda f411519y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<Object> f411520z;

        /* compiled from: Combine.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "T", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", i = {}, l = {AvailableCode.APP_IS_BACKGROUND_OR_LOCKED}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: kotlinx.coroutines.flow.internal.n$a$a, reason: collision with other inner class name */
        public static final class C11722a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f411521q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43160i<Object>[] f411522r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ int f411523s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ AtomicInteger f411524t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ C43108m f411525u;

            /* compiled from: Combine.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "T", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: kotlinx.coroutines.flow.internal.n$a$a$a, reason: collision with other inner class name */
            public static final class C11723a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C43108m f411526b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ int f411527c;

                /* compiled from: Combine.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", f = "Combine.kt", i = {}, l = {AvailableCode.HMS_IS_SPOOF, 30}, m = "emit", n = {}, s = {})
                /* renamed from: kotlinx.coroutines.flow.internal.n$a$a$a$a, reason: collision with other inner class name */
                public static final class C11724a extends ContinuationImpl {

                    /* renamed from: q, reason: collision with root package name */
                    public /* synthetic */ Object f411528q;

                    /* renamed from: r, reason: collision with root package name */
                    public final /* synthetic */ C11723a<T> f411529r;

                    /* renamed from: s, reason: collision with root package name */
                    public int f411530s;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C11724a(C11723a<? super T> c11723a, Continuation<? super C11724a> continuation) {
                        super(continuation);
                        this.f411529r = c11723a;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Y61.l
                    public final Object invokeSuspend(@Y61.k Object obj) {
                        this.f411528q = obj;
                        this.f411530s |= BeduinInputModel.MIN_TEXT_VERSION;
                        return this.f411529r.emit(null, this);
                    }
                }

                public C11723a(C43108m c43108m, int i12) {
                    this.f411526b = c43108m;
                    this.f411527c = i12;
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
                        boolean r0 = r7 instanceof kotlinx.coroutines.flow.internal.n.a.C11722a.C11723a.C11724a
                        if (r0 == 0) goto L13
                        r0 = r7
                        kotlinx.coroutines.flow.internal.n$a$a$a$a r0 = (kotlinx.coroutines.flow.internal.n.a.C11722a.C11723a.C11724a) r0
                        int r1 = r0.f411530s
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f411530s = r1
                        goto L18
                    L13:
                        kotlinx.coroutines.flow.internal.n$a$a$a$a r0 = new kotlinx.coroutines.flow.internal.n$a$a$a$a
                        r0.<init>(r5, r7)
                    L18:
                        java.lang.Object r7 = r0.f411528q
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f411530s
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L38
                        if (r2 == r4) goto L34
                        if (r2 != r3) goto L2c
                        kotlin.C42729a0.b(r7)
                        goto L56
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
                        kotlin.collections.H0 r7 = new kotlin.collections.H0
                        int r2 = r5.f411527c
                        r7.<init>(r2, r6)
                        r0.f411530s = r4
                        kotlinx.coroutines.channels.m r6 = r5.f411526b
                        java.lang.Object r6 = r6.send(r7, r0)
                        if (r6 != r1) goto L4d
                        return r1
                    L4d:
                        r0.f411530s = r3
                        java.lang.Object r6 = kotlinx.coroutines.J1.a(r0)
                        if (r6 != r1) goto L56
                        return r1
                    L56:
                        kotlin.G0 r6 = kotlin.G0.f406611a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.n.a.C11722a.C11723a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11722a(InterfaceC43160i[] interfaceC43160iArr, int i12, AtomicInteger atomicInteger, C43108m c43108m, Continuation continuation) {
                super(2, continuation);
                this.f411522r = interfaceC43160iArr;
                this.f411523s = i12;
                this.f411524t = atomicInteger;
                this.f411525u = c43108m;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new C11722a(this.f411522r, this.f411523s, this.f411524t, this.f411525u, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C11722a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f411521q;
                AtomicInteger atomicInteger = this.f411524t;
                C43108m c43108m = this.f411525u;
                try {
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        InterfaceC43160i<Object>[] interfaceC43160iArr = this.f411522r;
                        int i13 = this.f411523s;
                        InterfaceC43160i<Object> interfaceC43160i = interfaceC43160iArr[i13];
                        C11723a c11723a = new C11723a(c43108m, i13);
                        this.f411521q = 1;
                        if (interfaceC43160i.collect(c11723a, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        c43108m.h(null);
                    }
                    return G0.f406611a;
                } finally {
                    if (atomicInteger.decrementAndGet() == 0) {
                        c43108m.h(null);
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.a aVar, Y41.q qVar, Continuation continuation, InterfaceC43172j interfaceC43172j, InterfaceC43160i[] interfaceC43160iArr) {
            super(2, continuation);
            this.f411517w = interfaceC43160iArr;
            this.f411518x = (N) aVar;
            this.f411519y = (SuspendLambda) qVar;
            this.f411520z = interfaceC43172j;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [Y41.a, kotlin.jvm.internal.N] */
        /* JADX WARN: Type inference failed for: r2v0, types: [Y41.q, kotlin.coroutines.jvm.internal.SuspendLambda] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            ?? r22 = this.f411519y;
            a aVar = new a(this.f411518x, r22, continuation, this.f411520z, this.f411517w);
            aVar.f411516v = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:44:0x009c, code lost:
        
            if (r8 != 0) goto L21;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00b9  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00bc A[LOOP:0: B:28:0x00bc->B:46:?, LOOP_START, PHI: r8 r11
  0x00bc: PHI (r8v3 int) = (r8v2 int), (r8v4 int) binds: [B:25:0x00b7, B:46:?] A[DONT_GENERATE, DONT_INLINE]
  0x00bc: PHI (r11v3 kotlin.collections.H0) = (r11v2 kotlin.collections.H0), (r11v9 kotlin.collections.H0) binds: [B:25:0x00b7, B:46:?] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00dd  */
        /* JADX WARN: Type inference failed for: r10v4, types: [kotlinx.coroutines.channels.w] */
        /* JADX WARN: Type inference failed for: r10v5, types: [kotlinx.coroutines.channels.w] */
        /* JADX WARN: Type inference failed for: r10v7, types: [kotlinx.coroutines.channels.w] */
        /* JADX WARN: Type inference failed for: r11v10, types: [Y41.a, kotlin.jvm.internal.N] */
        /* JADX WARN: Type inference failed for: r12v4, types: [Y41.q, kotlin.coroutines.jvm.internal.SuspendLambda] */
        /* JADX WARN: Type inference failed for: r2v12, types: [int] */
        /* JADX WARN: Type inference failed for: r2v6, types: [int] */
        /* JADX WARN: Type inference failed for: r2v8, types: [int] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00fb -> B:21:0x009c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0114 -> B:21:0x009c). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r21) {
            /*
                Method dump skipped, instructions count: 279
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.n.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Y61.l
    @X
    public static final Object a(@Y61.k Y41.a aVar, @Y61.k Y41.q qVar, @Y61.k Continuation continuation, @Y61.k InterfaceC43172j interfaceC43172j, @Y61.k InterfaceC43160i[] interfaceC43160iArr) {
        a aVar2 = new a(aVar, qVar, null, interfaceC43172j, interfaceC43160iArr);
        r rVar = new r(continuation, continuation.getF411447c());
        Object objA = F51.b.a(rVar, rVar, aVar2);
        if (objA == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : G0.f406611a;
    }
}
