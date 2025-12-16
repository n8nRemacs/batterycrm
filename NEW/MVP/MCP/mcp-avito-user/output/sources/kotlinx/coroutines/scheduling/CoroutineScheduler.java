package kotlinx.coroutines.scheduling;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.camera.camera2.internal.G;
import androidx.compose.foundation.H;
import androidx.media3.exoplayer.C23179x;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.X;
import kotlinx.coroutines.internal.V;
import kotlinx.coroutines.internal.a0;

/* compiled from: CoroutineScheduler.kt */
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\b\t\nR\u000b\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004R\u000b\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004R\u000b\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "Ljava/util/concurrent/Executor;", "Ljava/io/Closeable;", "Lkotlinx/atomicfu/AtomicBoolean;", "_isTerminated", "Lkotlinx/atomicfu/AtomicLong;", "controlState", "parkedWorkersStack", "a", "c", "WorkerState", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CoroutineScheduler implements Executor, Closeable {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f412140i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f412141j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f412142k;

    /* renamed from: l, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final a0 f412143l;
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    public final int f412144b;

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    public final int f412145c;
    private volatile /* synthetic */ long controlState$volatile;

    /* renamed from: d, reason: collision with root package name */
    @X41.f
    public final long f412146d;

    /* renamed from: e, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final String f412147e;

    /* renamed from: f, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final e f412148f;

    /* renamed from: g, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final e f412149g;

    /* renamed from: h, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final V<c> f412150h;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CoroutineScheduler.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class WorkerState {

        /* renamed from: b, reason: collision with root package name */
        public static final WorkerState f412151b;

        /* renamed from: c, reason: collision with root package name */
        public static final WorkerState f412152c;

        /* renamed from: d, reason: collision with root package name */
        public static final WorkerState f412153d;

        /* renamed from: e, reason: collision with root package name */
        public static final WorkerState f412154e;

        /* renamed from: f, reason: collision with root package name */
        public static final WorkerState f412155f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ WorkerState[] f412156g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f412157h;

        static {
            WorkerState workerState = new WorkerState("CPU_ACQUIRED", 0);
            f412151b = workerState;
            WorkerState workerState2 = new WorkerState("BLOCKING", 1);
            f412152c = workerState2;
            WorkerState workerState3 = new WorkerState("PARKING", 2);
            f412153d = workerState3;
            WorkerState workerState4 = new WorkerState("DORMANT", 3);
            f412154e = workerState4;
            WorkerState workerState5 = new WorkerState("TERMINATED", 4);
            f412155f = workerState5;
            WorkerState[] workerStateArr = {workerState, workerState2, workerState3, workerState4, workerState5};
            f412156g = workerStateArr;
            f412157h = kotlin.enums.c.a(workerStateArr);
        }

        public WorkerState() {
            throw null;
        }

        public static WorkerState valueOf(String str) {
            return (WorkerState) Enum.valueOf(WorkerState.class, str);
        }

        public static WorkerState[] values() {
            return (WorkerState[]) f412156g.clone();
        }
    }

    /* compiled from: CoroutineScheduler.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00078\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\tR\u0014\u0010\u000f\u001a\u00020\u00078\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\tR\u0014\u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\tR\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\t¨\u0006\u0018"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$a;", "", "<init>", "()V", "", "BLOCKING_MASK", "J", "", "BLOCKING_SHIFT", "I", "CLAIMED", "CPU_PERMITS_MASK", "CPU_PERMITS_SHIFT", "CREATED_MASK", "MAX_SUPPORTED_POOL_SIZE", "MIN_SUPPORTED_POOL_SIZE", "Lkotlinx/coroutines/internal/a0;", "NOT_IN_STACK", "Lkotlinx/coroutines/internal/a0;", "PARKED", "PARKED_INDEX_MASK", "PARKED_VERSION_INC", "PARKED_VERSION_MASK", "TERMINATED", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: CoroutineScheduler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[WorkerState.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                WorkerState workerState = WorkerState.f412151b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                WorkerState workerState2 = WorkerState.f412151b;
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                WorkerState workerState3 = WorkerState.f412151b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                WorkerState workerState4 = WorkerState.f412151b;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: CoroutineScheduler.kt */
    @s0
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0004\u0018\u00002\u00020\u0001R*\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\b\u0010\u0012\u001a\u00020\u00118\u0006¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$c;", "Ljava/lang/Thread;", "", "index", "indexInArray", "I", "b", "()I", "f", "(I)V", "", "nextParkedWorker", "Ljava/lang/Object;", "c", "()Ljava/lang/Object;", "g", "(Ljava/lang/Object;)V", "Lkotlinx/atomicfu/AtomicInt;", "workerCtl", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class c extends Thread {

        /* renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f412158j = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl$volatile");

        /* renamed from: b, reason: collision with root package name */
        @X41.f
        @Y61.k
        public final p f412159b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final l0.h<j> f412160c;

        /* renamed from: d, reason: collision with root package name */
        @X41.f
        @Y61.k
        public WorkerState f412161d;

        /* renamed from: e, reason: collision with root package name */
        public long f412162e;

        /* renamed from: f, reason: collision with root package name */
        public long f412163f;

        /* renamed from: g, reason: collision with root package name */
        public int f412164g;

        /* renamed from: h, reason: collision with root package name */
        @X41.f
        public boolean f412165h;
        private volatile int indexInArray;

        @Y61.l
        private volatile Object nextParkedWorker;
        private volatile /* synthetic */ int workerCtl$volatile;

        public c() {
            throw null;
        }

        public c(int i12) {
            setDaemon(true);
            setContextClassLoader(CoroutineScheduler.this.getClass().getClassLoader());
            this.f412159b = new p();
            this.f412160c = new l0.h<>();
            this.f412161d = WorkerState.f412154e;
            this.nextParkedWorker = CoroutineScheduler.f412143l;
            int iNanoTime = (int) System.nanoTime();
            this.f412164g = iNanoTime == 0 ? 42 : iNanoTime;
            f(i12);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
        
            r13 = kotlinx.coroutines.scheduling.p.f412189d.get(r3);
            r0 = kotlinx.coroutines.scheduling.p.f412188c.get(r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
        
            if (r13 == r0) goto L67;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
        
            if (kotlinx.coroutines.scheduling.p.f412190e.get(r3) != 0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
        
            r0 = r0 - 1;
            r1 = r3.c(r0, true);
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
        
            if (r1 == null) goto L70;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
        
            r2 = r1;
         */
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlinx.coroutines.scheduling.j a(boolean r13) {
            /*
                r12 = this;
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = r12.f412161d
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.f412151b
                r2 = 0
                kotlinx.coroutines.scheduling.p r3 = r12.f412159b
                r4 = 1
                kotlinx.coroutines.scheduling.CoroutineScheduler r5 = kotlinx.coroutines.scheduling.CoroutineScheduler.this
                if (r0 != r1) goto Le
                goto L8c
            Le:
                java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.f412141j
            L10:
                kotlinx.coroutines.scheduling.CoroutineScheduler r7 = kotlinx.coroutines.scheduling.CoroutineScheduler.this
                long r8 = r0.get(r7)
                r10 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
                long r10 = r10 & r8
                r1 = 42
                long r10 = r10 >> r1
                int r1 = (int) r10
                if (r1 != 0) goto L79
                r3.getClass()
            L25:
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r13 = kotlinx.coroutines.scheduling.p.f412187b
                java.lang.Object r0 = r13.get(r3)
                kotlinx.coroutines.scheduling.j r0 = (kotlinx.coroutines.scheduling.j) r0
                if (r0 != 0) goto L30
                goto L47
            L30:
                kotlinx.coroutines.scheduling.k r1 = r0.f412175c
                kotlinx.coroutines.scheduling.l r1 = (kotlinx.coroutines.scheduling.l) r1
                int r1 = r1.f412176b
                if (r1 != r4) goto L47
            L38:
                boolean r1 = r13.compareAndSet(r3, r0, r2)
                if (r1 == 0) goto L40
                r2 = r0
                goto L67
            L40:
                java.lang.Object r1 = r13.get(r3)
                if (r1 == r0) goto L38
                goto L25
            L47:
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r13 = kotlinx.coroutines.scheduling.p.f412189d
                int r13 = r13.get(r3)
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.scheduling.p.f412188c
                int r0 = r0.get(r3)
            L53:
                if (r13 == r0) goto L67
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = kotlinx.coroutines.scheduling.p.f412190e
                int r1 = r1.get(r3)
                if (r1 != 0) goto L5e
                goto L67
            L5e:
                int r0 = r0 + (-1)
                kotlinx.coroutines.scheduling.j r1 = r3.c(r0, r4)
                if (r1 == 0) goto L53
                r2 = r1
            L67:
                if (r2 != 0) goto L78
                kotlinx.coroutines.scheduling.e r13 = r5.f412149g
                java.lang.Object r13 = r13.d()
                r2 = r13
                kotlinx.coroutines.scheduling.j r2 = (kotlinx.coroutines.scheduling.j) r2
                if (r2 != 0) goto L78
                kotlinx.coroutines.scheduling.j r2 = r12.i(r4)
            L78:
                return r2
            L79:
                r10 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
                long r10 = r8 - r10
                java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = kotlinx.coroutines.scheduling.CoroutineScheduler.f412141j
                boolean r1 = r6.compareAndSet(r7, r8, r10)
                if (r1 == 0) goto L10
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.f412151b
                r12.f412161d = r0
            L8c:
                if (r13 == 0) goto Lc0
                int r13 = r5.f412144b
                int r13 = r13 * 2
                int r13 = r12.d(r13)
                if (r13 != 0) goto L99
                goto L9a
            L99:
                r4 = 0
            L9a:
                if (r4 == 0) goto La3
                kotlinx.coroutines.scheduling.j r13 = r12.e()
                if (r13 == 0) goto La3
                goto Lcc
            La3:
                r3.getClass()
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r13 = kotlinx.coroutines.scheduling.p.f412187b
                java.lang.Object r13 = r13.getAndSet(r3, r2)
                kotlinx.coroutines.scheduling.j r13 = (kotlinx.coroutines.scheduling.j) r13
                if (r13 != 0) goto Lb4
                kotlinx.coroutines.scheduling.j r13 = r3.b()
            Lb4:
                if (r13 == 0) goto Lb7
                goto Lcc
            Lb7:
                if (r4 != 0) goto Lc7
                kotlinx.coroutines.scheduling.j r13 = r12.e()
                if (r13 == 0) goto Lc7
                goto Lcc
            Lc0:
                kotlinx.coroutines.scheduling.j r13 = r12.e()
                if (r13 == 0) goto Lc7
                goto Lcc
            Lc7:
                r13 = 3
                kotlinx.coroutines.scheduling.j r13 = r12.i(r13)
            Lcc:
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.CoroutineScheduler.c.a(boolean):kotlinx.coroutines.scheduling.j");
        }

        /* renamed from: b, reason: from getter */
        public final int getIndexInArray() {
            return this.indexInArray;
        }

        @Y61.l
        /* renamed from: c, reason: from getter */
        public final Object getNextParkedWorker() {
            return this.nextParkedWorker;
        }

        public final int d(int i12) {
            int i13 = this.f412164g;
            int i14 = i13 ^ (i13 << 13);
            int i15 = i14 ^ (i14 >> 17);
            int i16 = i15 ^ (i15 << 5);
            this.f412164g = i16;
            int i17 = i12 - 1;
            return (i17 & i12) == 0 ? i16 & i17 : (i16 & Integer.MAX_VALUE) % i12;
        }

        public final j e() {
            int iD2 = d(2);
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            if (iD2 == 0) {
                j jVarD = coroutineScheduler.f412148f.d();
                return jVarD != null ? jVarD : coroutineScheduler.f412149g.d();
            }
            j jVarD2 = coroutineScheduler.f412149g.d();
            return jVarD2 != null ? jVarD2 : coroutineScheduler.f412148f.d();
        }

        public final void f(int i12) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(CoroutineScheduler.this.f412147e);
            sb2.append("-worker-");
            sb2.append(i12 == 0 ? "TERMINATED" : String.valueOf(i12));
            setName(sb2.toString());
            this.indexInArray = i12;
        }

        public final void g(@Y61.l Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean h(@Y61.k WorkerState workerState) {
            WorkerState workerState2 = this.f412161d;
            boolean z12 = workerState2 == WorkerState.f412151b;
            if (z12) {
                CoroutineScheduler.f412141j.addAndGet(CoroutineScheduler.this, 4398046511104L);
            }
            if (workerState2 != workerState) {
                this.f412161d = workerState;
            }
            return z12;
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
        
            r19 = r6;
            r6 = -2;
            r5 = r5;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r14v1, types: [T, java.lang.Object, kotlinx.coroutines.scheduling.j] */
        /* JADX WARN: Type inference failed for: r7v4 */
        /* JADX WARN: Type inference failed for: r7v5, types: [kotlinx.coroutines.scheduling.j] */
        /* JADX WARN: Type inference failed for: r7v9, types: [kotlinx.coroutines.scheduling.j] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlinx.coroutines.scheduling.j i(int r24) {
            /*
                Method dump skipped, instructions count: 251
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.CoroutineScheduler.c.i(int):kotlinx.coroutines.scheduling.j");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
            boolean z12;
            boolean z13 = false;
            loop0: while (true) {
                boolean z14 = z13;
                while (true) {
                    CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
                    coroutineScheduler.getClass();
                    if (CoroutineScheduler.f412142k.get(coroutineScheduler) == 0) {
                        WorkerState workerState = this.f412161d;
                        WorkerState workerState2 = WorkerState.f412155f;
                        if (workerState == workerState2) {
                            break loop0;
                        }
                        j jVarA = a(this.f412165h);
                        long j12 = -2097152;
                        if (jVarA != null) {
                            this.f412163f = 0L;
                            int i12 = ((l) jVarA.f412175c).f412176b;
                            this.f412162e = 0L;
                            if (this.f412161d == WorkerState.f412153d) {
                                this.f412161d = WorkerState.f412152c;
                            }
                            CoroutineScheduler coroutineScheduler2 = CoroutineScheduler.this;
                            if (i12 != 0 && h(WorkerState.f412152c) && !coroutineScheduler2.g() && !coroutineScheduler2.f(CoroutineScheduler.f412141j.get(coroutineScheduler2))) {
                                coroutineScheduler2.g();
                            }
                            coroutineScheduler2.getClass();
                            try {
                                jVarA.run();
                            } catch (Throwable th2) {
                                Thread threadCurrentThread = Thread.currentThread();
                                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
                            }
                            if (i12 != 0) {
                                CoroutineScheduler.f412141j.addAndGet(coroutineScheduler2, -2097152L);
                                if (this.f412161d != workerState2) {
                                    this.f412161d = WorkerState.f412154e;
                                }
                            }
                        } else {
                            this.f412165h = z13;
                            if (this.f412163f == 0) {
                                Object obj = this.nextParkedWorker;
                                a0 a0Var = CoroutineScheduler.f412143l;
                                if (obj != a0Var ? true : z13) {
                                    f412158j.set(this, -1);
                                    while (this.nextParkedWorker != CoroutineScheduler.f412143l) {
                                        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = f412158j;
                                        if (atomicIntegerFieldUpdater2.get(this) != -1) {
                                            break;
                                        }
                                        CoroutineScheduler coroutineScheduler3 = CoroutineScheduler.this;
                                        coroutineScheduler3.getClass();
                                        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater3 = CoroutineScheduler.f412142k;
                                        if (atomicIntegerFieldUpdater3.get(coroutineScheduler3) != 0) {
                                            break;
                                        }
                                        WorkerState workerState3 = this.f412161d;
                                        WorkerState workerState4 = WorkerState.f412155f;
                                        if (workerState3 == workerState4) {
                                            break;
                                        }
                                        h(WorkerState.f412153d);
                                        Thread.interrupted();
                                        if (this.f412162e == 0) {
                                            atomicIntegerFieldUpdater = atomicIntegerFieldUpdater2;
                                            this.f412162e = System.nanoTime() + CoroutineScheduler.this.f412146d;
                                        } else {
                                            atomicIntegerFieldUpdater = atomicIntegerFieldUpdater2;
                                        }
                                        LockSupport.parkNanos(CoroutineScheduler.this.f412146d);
                                        if (System.nanoTime() - this.f412162e >= 0) {
                                            this.f412162e = 0L;
                                            CoroutineScheduler coroutineScheduler4 = CoroutineScheduler.this;
                                            synchronized (coroutineScheduler4.f412150h) {
                                                try {
                                                    if (!(atomicIntegerFieldUpdater3.get(coroutineScheduler4) != 0)) {
                                                        AtomicLongFieldUpdater atomicLongFieldUpdater = CoroutineScheduler.f412141j;
                                                        if (((int) (atomicLongFieldUpdater.get(coroutineScheduler4) & 2097151)) > coroutineScheduler4.f412144b && atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                            int i13 = this.indexInArray;
                                                            z12 = false;
                                                            f(0);
                                                            coroutineScheduler4.d(this, i13, 0);
                                                            int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(coroutineScheduler4) & 2097151);
                                                            if (andDecrement != i13) {
                                                                c cVarB = coroutineScheduler4.f412150h.b(andDecrement);
                                                                coroutineScheduler4.f412150h.c(i13, cVarB);
                                                                cVarB.f(i13);
                                                                coroutineScheduler4.d(cVarB, andDecrement, i13);
                                                            }
                                                            coroutineScheduler4.f412150h.c(andDecrement, null);
                                                            G0 g02 = G0.f406611a;
                                                            this.f412161d = workerState4;
                                                        }
                                                    }
                                                    z12 = false;
                                                } catch (Throwable th3) {
                                                    throw th3;
                                                }
                                            }
                                        } else {
                                            z12 = false;
                                        }
                                        z13 = z12;
                                    }
                                } else {
                                    CoroutineScheduler coroutineScheduler5 = CoroutineScheduler.this;
                                    coroutineScheduler5.getClass();
                                    if (this.nextParkedWorker == a0Var) {
                                        while (true) {
                                            AtomicLongFieldUpdater atomicLongFieldUpdater2 = CoroutineScheduler.f412140i;
                                            long j13 = atomicLongFieldUpdater2.get(coroutineScheduler5);
                                            long j14 = (PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j13) & j12;
                                            int i14 = this.indexInArray;
                                            this.nextParkedWorker = coroutineScheduler5.f412150h.b((int) (j13 & 2097151));
                                            if (atomicLongFieldUpdater2.compareAndSet(coroutineScheduler5, j13, j14 | i14)) {
                                                break;
                                            } else {
                                                j12 = -2097152;
                                            }
                                        }
                                    }
                                }
                                z13 = z13;
                            } else {
                                if (z14) {
                                    h(WorkerState.f412153d);
                                    Thread.interrupted();
                                    LockSupport.parkNanos(this.f412163f);
                                    this.f412163f = 0L;
                                    break;
                                }
                                z14 = true;
                            }
                        }
                    } else {
                        break loop0;
                    }
                }
            }
            h(WorkerState.f412155f);
        }
    }

    static {
        new a(null);
        f412140i = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "parkedWorkersStack$volatile");
        f412141j = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "controlState$volatile");
        f412142k = AtomicIntegerFieldUpdater.newUpdater(CoroutineScheduler.class, "_isTerminated$volatile");
        f412143l = new a0("NOT_IN_STACK");
    }

    public CoroutineScheduler(long j12, @Y61.k String str, int i12, int i13) {
        this.f412144b = i12;
        this.f412145c = i13;
        this.f412146d = j12;
        this.f412147e = str;
        if (i12 < 1) {
            throw new IllegalArgumentException(G.e(i12, "Core pool size ", " should be at least 1").toString());
        }
        if (i13 < i12) {
            throw new IllegalArgumentException(H.j(i13, i12, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i13 > 2097150) {
            throw new IllegalArgumentException(G.e(i13, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j12 <= 0) {
            throw new IllegalArgumentException(androidx.compose.ui.graphics.colorspace.e.i(j12, "Idle worker keep alive time ", " must be positive").toString());
        }
        this.f412148f = new e();
        this.f412149g = new e();
        this.f412150h = new V<>((i12 + 1) * 2);
        this.controlState$volatile = i12 << 42;
        this._isTerminated$volatile = 0;
    }

    public static /* synthetic */ void c(CoroutineScheduler coroutineScheduler, Runnable runnable, int i12) {
        coroutineScheduler.b(runnable, n.f412184g, (i12 & 4) == 0);
    }

    public final int a() {
        synchronized (this.f412150h) {
            try {
                if (f412142k.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f412141j;
                long j12 = atomicLongFieldUpdater.get(this);
                int i12 = (int) (j12 & 2097151);
                int i13 = i12 - ((int) ((j12 & 4398044413952L) >> 21));
                if (i13 < 0) {
                    i13 = 0;
                }
                if (i13 >= this.f412144b) {
                    return 0;
                }
                if (i12 >= this.f412145c) {
                    return 0;
                }
                int i14 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i14 <= 0 || this.f412150h.b(i14) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                c cVar = new c(i14);
                this.f412150h.c(i14, cVar);
                if (i14 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i15 = i13 + 1;
                cVar.start();
                return i15;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(@Y61.k Runnable runnable, @Y61.k k kVar, boolean z12) {
        j mVar;
        WorkerState workerState;
        n.f412183f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof j) {
            mVar = (j) runnable;
            mVar.f412174b = jNanoTime;
            mVar.f412175c = kVar;
        } else {
            mVar = new m(runnable, jNanoTime, kVar);
        }
        boolean z13 = false;
        boolean z14 = ((l) mVar.f412175c).f412176b == 1;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f412141j;
        long jAddAndGet = z14 ? atomicLongFieldUpdater.addAndGet(this, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        c cVar = threadCurrentThread instanceof c ? (c) threadCurrentThread : null;
        if (cVar == null || !L.f(CoroutineScheduler.this, this)) {
            cVar = null;
        }
        if (cVar != null && (workerState = cVar.f412161d) != WorkerState.f412155f && (((l) mVar.f412175c).f412176b != 0 || workerState != WorkerState.f412152c)) {
            cVar.f412165h = true;
            p pVar = cVar.f412159b;
            if (z12) {
                mVar = pVar.a(mVar);
            } else {
                pVar.getClass();
                j jVar = (j) p.f412187b.getAndSet(pVar, mVar);
                mVar = jVar == null ? null : pVar.a(jVar);
            }
        }
        if (mVar != null) {
            if (!(((l) mVar.f412175c).f412176b == 1 ? this.f412149g.a(mVar) : this.f412148f.a(mVar))) {
                throw new RejectedExecutionException(AK.c.s(new StringBuilder(), this.f412147e, " was terminated"));
            }
        }
        if (z12 && cVar != null) {
            z13 = true;
        }
        if (z14) {
            if (z13 || g() || f(jAddAndGet)) {
                return;
            }
            g();
            return;
        }
        if (z13 || g() || f(atomicLongFieldUpdater.get(this))) {
            return;
        }
        g();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0088  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() throws java.lang.InterruptedException {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.f412142k
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lc
            goto Laf
        Lc:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof kotlinx.coroutines.scheduling.CoroutineScheduler.c
            r3 = 0
            if (r1 == 0) goto L18
            kotlinx.coroutines.scheduling.CoroutineScheduler$c r0 = (kotlinx.coroutines.scheduling.CoroutineScheduler.c) r0
            goto L19
        L18:
            r0 = r3
        L19:
            if (r0 == 0) goto L24
            kotlinx.coroutines.scheduling.CoroutineScheduler r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.this
            boolean r1 = kotlin.jvm.internal.L.f(r1, r8)
            if (r1 == 0) goto L24
            goto L25
        L24:
            r0 = r3
        L25:
            kotlinx.coroutines.internal.V<kotlinx.coroutines.scheduling.CoroutineScheduler$c> r1 = r8.f412150h
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = kotlinx.coroutines.scheduling.CoroutineScheduler.f412141j     // Catch: java.lang.Throwable -> Lc1
            long r4 = r4.get(r8)     // Catch: java.lang.Throwable -> Lc1
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r1)
            if (r2 > r4) goto L76
            r1 = r2
        L37:
            kotlinx.coroutines.internal.V<kotlinx.coroutines.scheduling.CoroutineScheduler$c> r5 = r8.f412150h
            java.lang.Object r5 = r5.b(r1)
            kotlinx.coroutines.scheduling.CoroutineScheduler$c r5 = (kotlinx.coroutines.scheduling.CoroutineScheduler.c) r5
            if (r5 == r0) goto L71
        L41:
            java.lang.Thread$State r6 = r5.getState()
            java.lang.Thread$State r7 = java.lang.Thread.State.TERMINATED
            if (r6 == r7) goto L52
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r6 = 10000(0x2710, double:4.9407E-320)
            r5.join(r6)
            goto L41
        L52:
            kotlinx.coroutines.scheduling.p r5 = r5.f412159b
            kotlinx.coroutines.scheduling.e r6 = r8.f412149g
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = kotlinx.coroutines.scheduling.p.f412187b
            java.lang.Object r7 = r7.getAndSet(r5, r3)
            kotlinx.coroutines.scheduling.j r7 = (kotlinx.coroutines.scheduling.j) r7
            if (r7 == 0) goto L66
            r6.a(r7)
        L66:
            kotlinx.coroutines.scheduling.j r7 = r5.b()
            if (r7 != 0) goto L6d
            goto L71
        L6d:
            r6.a(r7)
            goto L66
        L71:
            if (r1 == r4) goto L76
            int r1 = r1 + 1
            goto L37
        L76:
            kotlinx.coroutines.scheduling.e r1 = r8.f412149g
            r1.b()
            kotlinx.coroutines.scheduling.e r1 = r8.f412148f
            r1.b()
        L80:
            if (r0 == 0) goto L88
            kotlinx.coroutines.scheduling.j r1 = r0.a(r2)
            if (r1 != 0) goto Lb0
        L88:
            kotlinx.coroutines.scheduling.e r1 = r8.f412148f
            java.lang.Object r1 = r1.d()
            kotlinx.coroutines.scheduling.j r1 = (kotlinx.coroutines.scheduling.j) r1
            if (r1 != 0) goto Lb0
            kotlinx.coroutines.scheduling.e r1 = r8.f412149g
            java.lang.Object r1 = r1.d()
            kotlinx.coroutines.scheduling.j r1 = (kotlinx.coroutines.scheduling.j) r1
            if (r1 != 0) goto Lb0
            if (r0 == 0) goto La3
            kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.f412155f
            r0.h(r1)
        La3:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.f412140i
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.f412141j
            r0.set(r8, r1)
        Laf:
            return
        Lb0:
            r1.run()     // Catch: java.lang.Throwable -> Lb4
            goto L80
        Lb4:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L80
        Lc1:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.CoroutineScheduler.close():void");
    }

    public final void d(@Y61.k c cVar, int i12, int i13) {
        while (true) {
            long j12 = f412140i.get(this);
            int i14 = (int) (2097151 & j12);
            long j13 = (PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j12) & (-2097152);
            if (i14 == i12) {
                if (i13 == 0) {
                    Object nextParkedWorker = cVar.getNextParkedWorker();
                    while (true) {
                        if (nextParkedWorker == f412143l) {
                            i14 = -1;
                            break;
                        }
                        if (nextParkedWorker == null) {
                            i14 = 0;
                            break;
                        }
                        c cVar2 = (c) nextParkedWorker;
                        int indexInArray = cVar2.getIndexInArray();
                        if (indexInArray != 0) {
                            i14 = indexInArray;
                            break;
                        }
                        nextParkedWorker = cVar2.getNextParkedWorker();
                    }
                } else {
                    i14 = i13;
                }
            }
            if (i14 >= 0) {
                if (f412140i.compareAndSet(this, j12, i14 | j13)) {
                    return;
                }
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@Y61.k Runnable runnable) {
        c(this, runnable, 6);
    }

    public final boolean f(long j12) {
        int i12 = ((int) (2097151 & j12)) - ((int) ((j12 & 4398044413952L) >> 21));
        if (i12 < 0) {
            i12 = 0;
        }
        int i13 = this.f412144b;
        if (i12 < i13) {
            int iA2 = a();
            if (iA2 == 1 && i13 > 1) {
                a();
            }
            if (iA2 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean g() {
        a0 a0Var;
        int indexInArray;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f412140i;
            long j12 = atomicLongFieldUpdater.get(this);
            c cVarB = this.f412150h.b((int) (2097151 & j12));
            if (cVarB == null) {
                cVarB = null;
            } else {
                long j13 = (PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j12) & (-2097152);
                Object nextParkedWorker = cVarB.getNextParkedWorker();
                while (true) {
                    a0Var = f412143l;
                    if (nextParkedWorker == a0Var) {
                        indexInArray = -1;
                        break;
                    }
                    if (nextParkedWorker == null) {
                        indexInArray = 0;
                        break;
                    }
                    c cVar = (c) nextParkedWorker;
                    indexInArray = cVar.getIndexInArray();
                    if (indexInArray != 0) {
                        break;
                    }
                    nextParkedWorker = cVar.getNextParkedWorker();
                }
                if (indexInArray >= 0 && atomicLongFieldUpdater.compareAndSet(this, j12, j13 | indexInArray)) {
                    cVarB.g(a0Var);
                }
            }
            if (cVarB == null) {
                return false;
            }
            if (c.f412158j.compareAndSet(cVarB, -1, 0)) {
                LockSupport.unpark(cVarB);
                return true;
            }
        }
    }

    @Y61.k
    public final String toString() {
        ArrayList arrayList = new ArrayList();
        V<c> v12 = this.f412150h;
        int iA2 = v12.a();
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 1; i17 < iA2; i17++) {
            c cVarB = v12.b(i17);
            if (cVarB != null) {
                p pVar = cVarB.f412159b;
                pVar.getClass();
                int i18 = p.f412187b.get(pVar) != null ? (p.f412188c.get(pVar) - p.f412189d.get(pVar)) + 1 : p.f412188c.get(pVar) - p.f412189d.get(pVar);
                int iOrdinal = cVarB.f412161d.ordinal();
                if (iOrdinal == 0) {
                    i12++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i18);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 1) {
                    i13++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i18);
                    sb3.append('b');
                    arrayList.add(sb3.toString());
                } else if (iOrdinal == 2) {
                    i14++;
                } else if (iOrdinal == 3) {
                    i15++;
                    if (i18 > 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(i18);
                        sb4.append('d');
                        arrayList.add(sb4.toString());
                    }
                } else if (iOrdinal == 4) {
                    i16++;
                }
            }
        }
        long j12 = f412141j.get(this);
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.f412147e);
        sb5.append('@');
        sb5.append(X.a(this));
        sb5.append("[Pool Size {core = ");
        int i19 = this.f412144b;
        sb5.append(i19);
        sb5.append(", max = ");
        C23179x.a(sb5, this.f412145c, "}, Worker States {CPU = ", i12, ", blocking = ");
        C23179x.a(sb5, i13, ", parked = ", i14, ", dormant = ");
        C23179x.a(sb5, i15, ", terminated = ", i16, "}, running workers queues = ");
        sb5.append(arrayList);
        sb5.append(", global CPU queue size = ");
        sb5.append(this.f412148f.c());
        sb5.append(", global blocking queue size = ");
        sb5.append(this.f412149g.c());
        sb5.append(", Control State {created workers= ");
        sb5.append((int) (2097151 & j12));
        sb5.append(", blocking tasks = ");
        sb5.append((int) ((4398044413952L & j12) >> 21));
        sb5.append(", CPUs acquired = ");
        sb5.append(i19 - ((int) ((j12 & 9223367638808264704L) >> 42)));
        sb5.append("}]");
        return sb5.toString();
    }

    public /* synthetic */ CoroutineScheduler(int i12, int i13, long j12, String str, int i14, C42822w c42822w) {
        this((i14 & 4) != 0 ? n.f412182e : j12, (i14 & 8) != 0 ? n.f412178a : str, i12, i13);
    }
}
