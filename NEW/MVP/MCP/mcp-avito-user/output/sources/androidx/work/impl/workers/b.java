package androidx.work.impl.workers;

import Y41.p;
import androidx.work.F;
import androidx.work.impl.model.H;
import com.google.common.util.concurrent.D0;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;

/* compiled from: ConstraintTrackingWorker.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Landroidx/work/F$a;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lkotlinx/coroutines/T;)Landroidx/work/F$a;"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$2", f = "ConstraintTrackingWorker.kt", i = {0, 0, 0}, l = {134}, m = "invokeSuspend", n = {"atomicReason", "future", "constraintTrackingJob"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes10.dex */
final class b extends SuspendLambda implements p<T, Continuation<? super F.a>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public D0 f56052q;

    /* renamed from: r, reason: collision with root package name */
    public Object f56053r;

    /* renamed from: s, reason: collision with root package name */
    public int f56054s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f56055t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ F f56056u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ androidx.work.impl.constraints.f f56057v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ H f56058w;

    /* compiled from: ConstraintTrackingWorker.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$2$constraintTrackingJob$1", f = "ConstraintTrackingWorker.kt", i = {}, l = {129}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f56059q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ androidx.work.impl.constraints.f f56060r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ H f56061s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ AtomicInteger f56062t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ D0<F.a> f56063u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.work.impl.constraints.f fVar, H h12, AtomicInteger atomicInteger, D0<F.a> d02, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f56060r = fVar;
            this.f56061s = h12;
            this.f56062t = atomicInteger;
            this.f56063u = d02;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
            return new a(this.f56060r, this.f56061s, this.f56062t, this.f56063u, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f56059q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f56059q = 1;
                obj = h.a(this.f56060r, this.f56061s, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            this.f56062t.set(((Number) obj).intValue());
            this.f56063u.cancel(true);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(F f12, androidx.work.impl.constraints.f fVar, H h12, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f56056u = f12;
        this.f56057v = fVar;
        this.f56058w = h12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        b bVar = new b(this.f56056u, this.f56057v, this.f56058w, continuation);
        bVar.f56055t = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super F.a> continuation) {
        return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.N0] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v5, types: [kotlinx.coroutines.N0] */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r1 = r16
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r1.f56054s
            r3 = 0
            r4 = -256(0xffffffffffffff00, float:NaN)
            androidx.work.F r5 = r1.f56056u
            r6 = 1
            if (r2 == 0) goto L31
            if (r2 != r6) goto L29
            java.lang.Object r0 = r1.f56053r
            r2 = r0
            kotlinx.coroutines.N0 r2 = (kotlinx.coroutines.N0) r2
            com.google.common.util.concurrent.D0 r7 = r1.f56052q
            java.lang.Object r0 = r1.f56055t
            r8 = r0
            java.util.concurrent.atomic.AtomicInteger r8 = (java.util.concurrent.atomic.AtomicInteger) r8
            kotlin.C42729a0.b(r17)     // Catch: java.lang.Throwable -> L25 java.util.concurrent.CancellationException -> L27
            r14 = r7
            r7 = r17
            goto L63
        L25:
            r0 = move-exception
            goto L70
        L27:
            r0 = move-exception
            goto L83
        L29:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L31:
            kotlin.C42729a0.b(r17)
            java.lang.Object r2 = r1.f56055t
            kotlinx.coroutines.T r2 = (kotlinx.coroutines.T) r2
            java.util.concurrent.atomic.AtomicInteger r13 = new java.util.concurrent.atomic.AtomicInteger
            r13.<init>(r4)
            com.google.common.util.concurrent.D0 r14 = r5.startWork()
            androidx.work.impl.workers.b$a r15 = new androidx.work.impl.workers.b$a
            r12 = 0
            androidx.work.impl.constraints.f r8 = r1.f56057v
            androidx.work.impl.model.H r9 = r1.f56058w
            r7 = r15
            r10 = r13
            r11 = r14
            r7.<init>(r8, r9, r10, r11, r12)
            r7 = 3
            kotlinx.coroutines.N0 r2 = kotlinx.coroutines.C43259k.d(r2, r3, r3, r15, r7)
            r1.f56055t = r13     // Catch: java.lang.Throwable -> L25 java.util.concurrent.CancellationException -> L6e
            r1.f56052q = r14     // Catch: java.lang.Throwable -> L25 java.util.concurrent.CancellationException -> L6e
            r1.f56053r = r2     // Catch: java.lang.Throwable -> L25 java.util.concurrent.CancellationException -> L6e
            r1.f56054s = r6     // Catch: java.lang.Throwable -> L25 java.util.concurrent.CancellationException -> L6e
            java.lang.Object r7 = androidx.concurrent.futures.d.a(r14, r1)     // Catch: java.lang.Throwable -> L25 java.util.concurrent.CancellationException -> L6e
            if (r7 != r0) goto L62
            return r0
        L62:
            r8 = r13
        L63:
            androidx.work.F$a r7 = (androidx.work.F.a) r7     // Catch: java.lang.Throwable -> L25 java.util.concurrent.CancellationException -> L69
            r2.c(r3)
            return r7
        L69:
            r0 = move-exception
        L6a:
            r7 = r14
            goto L83
        L6c:
            r8 = r13
            goto L6a
        L6e:
            r0 = move-exception
            goto L6c
        L70:
            int r4 = androidx.work.impl.workers.h.f56082a     // Catch: java.lang.Throwable -> L81
            androidx.work.G r4 = androidx.work.G.a()     // Catch: java.lang.Throwable -> L81
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.Throwable -> L81
            r5.toString()     // Catch: java.lang.Throwable -> L81
            r4.getClass()     // Catch: java.lang.Throwable -> L81
            throw r0     // Catch: java.lang.Throwable -> L81
        L81:
            r0 = move-exception
            goto Lae
        L83:
            int r9 = androidx.work.impl.workers.h.f56082a     // Catch: java.lang.Throwable -> L81
            androidx.work.G r9 = androidx.work.G.a()     // Catch: java.lang.Throwable -> L81
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.Throwable -> L81
            r5.toString()     // Catch: java.lang.Throwable -> L81
            r9.getClass()     // Catch: java.lang.Throwable -> L81
            int r5 = r8.get()     // Catch: java.lang.Throwable -> L81
            if (r5 == r4) goto L9a
            goto L9b
        L9a:
            r6 = 0
        L9b:
            boolean r4 = r7.isCancelled()     // Catch: java.lang.Throwable -> L81
            if (r4 == 0) goto Lad
            if (r6 == 0) goto Lad
            androidx.work.impl.workers.ConstraintTrackingWorker$a r0 = new androidx.work.impl.workers.ConstraintTrackingWorker$a     // Catch: java.lang.Throwable -> L81
            int r4 = r8.get()     // Catch: java.lang.Throwable -> L81
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L81
            throw r0     // Catch: java.lang.Throwable -> L81
        Lad:
            throw r0     // Catch: java.lang.Throwable -> L81
        Lae:
            r2.c(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.workers.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
