package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.collections.C42754k;
import kotlin.coroutines.CoroutineContext;

/* compiled from: EventLoop.common.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\b \u0018\u00002\u00020\u00012\u00020\u0002:\u0004\f\r\u000e\u000fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u0013\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0002X\u0082\u0004R\u000b\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004R\u0013\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00058\u0002X\u0082\u0004¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/t0;", "Lkotlinx/coroutines/u0;", "Lkotlinx/coroutines/c0;", "<init>", "()V", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/t0$d;", "_delayed", "Lkotlinx/atomicfu/AtomicBoolean;", "_isCompleted", "", "_queue", "a", "b", "c", "d", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.t0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43303t0 extends AbstractC43305u0 implements InterfaceC43082c0 {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f412288g = AtomicReferenceFieldUpdater.newUpdater(AbstractC43303t0.class, Object.class, "_queue$volatile");

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f412289h = AtomicReferenceFieldUpdater.newUpdater(AbstractC43303t0.class, Object.class, "_delayed$volatile");

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f412290i = AtomicIntegerFieldUpdater.newUpdater(AbstractC43303t0.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    /* compiled from: EventLoop.common.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/t0$a;", "Lkotlinx/coroutines/t0$c;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlinx.coroutines.t0$a */
    public final class a extends c {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final r f412291d;

        public a(long j12, @Y61.k r rVar) {
            super(j12);
            this.f412291d = rVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f412291d.B(AbstractC43303t0.this, kotlin.G0.f406611a);
        }

        @Override // kotlinx.coroutines.AbstractC43303t0.c
        @Y61.k
        public final String toString() {
            return super.toString() + this.f412291d;
        }
    }

    /* compiled from: EventLoop.common.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/t0$b;", "Lkotlinx/coroutines/t0$c;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlinx.coroutines.t0$b */
    public static final class b extends c {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final Runnable f412293d;

        public b(long j12, @Y61.k Runnable runnable) {
            super(j12);
            this.f412293d = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f412293d.run();
        }

        @Override // kotlinx.coroutines.AbstractC43303t0.c
        @Y61.k
        public final String toString() {
            return super.toString() + this.f412293d;
        }
    }

    /* compiled from: EventLoop.common.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u00032\u00020\u00042\u00020\u00052\u00060\u0006j\u0002`\u0007R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/t0$c;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "Lkotlinx/coroutines/o0;", "Lkotlinx/coroutines/internal/l0;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "_heap", "Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlinx.coroutines.t0$c */
    public static abstract class c implements Runnable, Comparable<c>, InterfaceC43268o0, kotlinx.coroutines.internal.l0 {

        @Y61.l
        private volatile Object _heap;

        /* renamed from: b, reason: collision with root package name */
        @X41.f
        public long f412294b;

        /* renamed from: c, reason: collision with root package name */
        public int f412295c = -1;

        public c(long j12) {
            this.f412294b = j12;
        }

        @Override // kotlinx.coroutines.internal.l0
        public final void a(@Y61.l d dVar) {
            if (this._heap == C43309w0.f412299a) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            this._heap = dVar;
        }

        public final int c(long j12, @Y61.k d dVar, @Y61.k AbstractC43303t0 abstractC43303t0) {
            synchronized (this) {
                if (this._heap == C43309w0.f412299a) {
                    return 2;
                }
                synchronized (dVar) {
                    try {
                        Object[] objArr = dVar.f411912a;
                        c cVar = (c) (objArr != null ? objArr[0] : null);
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AbstractC43303t0.f412288g;
                        abstractC43303t0.getClass();
                        if (AbstractC43303t0.f412290i.get(abstractC43303t0) != 0) {
                            return 1;
                        }
                        if (cVar == null) {
                            dVar.f412296c = j12;
                        } else {
                            long j13 = cVar.f412294b;
                            if (j13 - j12 < 0) {
                                j12 = j13;
                            }
                            if (j12 - dVar.f412296c > 0) {
                                dVar.f412296c = j12;
                            }
                        }
                        long j14 = this.f412294b;
                        long j15 = dVar.f412296c;
                        if (j14 - j15 < 0) {
                            this.f412294b = j15;
                        }
                        dVar.a(this);
                        return 0;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        @Override // java.lang.Comparable
        public final int compareTo(c cVar) {
            long j12 = this.f412294b - cVar.f412294b;
            if (j12 > 0) {
                return 1;
            }
            return j12 < 0 ? -1 : 0;
        }

        @Override // kotlinx.coroutines.InterfaceC43268o0
        public final void dispose() {
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    kotlinx.coroutines.internal.a0 a0Var = C43309w0.f412299a;
                    if (obj == a0Var) {
                        return;
                    }
                    d dVar = obj instanceof d ? (d) obj : null;
                    if (dVar != null) {
                        synchronized (dVar) {
                            Object obj2 = this._heap;
                            if ((obj2 instanceof kotlinx.coroutines.internal.k0 ? (kotlinx.coroutines.internal.k0) obj2 : null) != null) {
                                dVar.b(this.f412295c);
                            }
                        }
                    }
                    this._heap = a0Var;
                    kotlin.G0 g02 = kotlin.G0.f406611a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // kotlinx.coroutines.internal.l0
        public final void setIndex(int i12) {
            this.f412295c = i12;
        }

        @Y61.k
        public String toString() {
            return androidx.appcompat.app.r.u(new StringBuilder("Delayed[nanos="), this.f412294b, ']');
        }
    }

    /* compiled from: EventLoop.common.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/t0$d;", "Lkotlinx/coroutines/internal/k0;", "Lkotlinx/coroutines/t0$c;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlinx.coroutines.t0$d */
    public static final class d extends kotlinx.coroutines.internal.k0<c> {

        /* renamed from: c, reason: collision with root package name */
        @X41.f
        public long f412296c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x005a, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e7  */
    @Override // kotlinx.coroutines.AbstractC43300s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long H() {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.AbstractC43303t0.H():long");
    }

    public void U(@Y61.k Runnable runnable) {
        if (!V(runnable)) {
            Y.f410745j.U(runnable);
            return;
        }
        Thread threadM = getF411942j();
        if (Thread.currentThread() != threadM) {
            LockSupport.unpark(threadM);
        }
    }

    public final boolean V(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f412288g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f412290i.get(this) != 0) {
                return false;
            }
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                return true;
            }
            if (!(obj instanceof kotlinx.coroutines.internal.H)) {
                if (obj == C43309w0.f412300b) {
                    return false;
                }
                kotlinx.coroutines.internal.H h12 = new kotlinx.coroutines.internal.H(8, true);
                h12.a((Runnable) obj);
                h12.a(runnable);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, h12)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return true;
            }
            kotlinx.coroutines.internal.H h13 = (kotlinx.coroutines.internal.H) obj;
            int iA2 = h13.a(runnable);
            if (iA2 == 0) {
                return true;
            }
            if (iA2 == 1) {
                kotlinx.coroutines.internal.H hC2 = h13.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, hC2) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else if (iA2 == 2) {
                return false;
            }
        }
    }

    public final void W(long j12, @Y61.k c cVar) {
        int iC2;
        Thread threadM;
        boolean z12 = f412290i.get(this) != 0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f412289h;
        if (z12) {
            iC2 = 1;
        } else {
            d dVar = (d) atomicReferenceFieldUpdater.get(this);
            if (dVar == null) {
                d dVar2 = new d();
                dVar2.f412296c = j12;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, dVar2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                dVar = (d) atomicReferenceFieldUpdater.get(this);
            }
            iC2 = cVar.c(j12, dVar, this);
        }
        if (iC2 != 0) {
            if (iC2 == 1) {
                T(j12, cVar);
                return;
            } else {
                if (iC2 != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        d dVar3 = (d) atomicReferenceFieldUpdater.get(this);
        if (dVar3 != null) {
            synchronized (dVar3) {
                kotlinx.coroutines.internal.l0[] l0VarArr = dVar3.f411912a;
                l0Var = l0VarArr != null ? l0VarArr[0] : null;
            }
            l0Var = (c) l0Var;
        }
        if (l0Var != cVar || Thread.currentThread() == (threadM = getF411942j())) {
            return;
        }
        LockSupport.unpark(threadM);
    }

    @Override // kotlinx.coroutines.InterfaceC43082c0
    public final void f(long j12, @Y61.k r rVar) {
        long jA2 = C43309w0.a(j12);
        if (jA2 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            a aVar = new a(jA2 + jNanoTime, rVar);
            W(jNanoTime, aVar);
            C43302t.a(rVar, aVar);
        }
    }

    @Y61.k
    public InterfaceC43268o0 g(long j12, @Y61.k Runnable runnable, @Y61.k CoroutineContext coroutineContext) {
        return Z.f410747a.g(j12, runnable, coroutineContext);
    }

    @Override // kotlinx.coroutines.M
    public final void h(@Y61.k CoroutineContext coroutineContext, @Y61.k Runnable runnable) {
        U(runnable);
    }

    public final boolean isEmpty() {
        C42754k<AbstractC43229i0<?>> c42754k = this.f412139e;
        if (!(c42754k != null ? c42754k.isEmpty() : true)) {
            return false;
        }
        d dVar = (d) f412289h.get(this);
        if (dVar != null && kotlinx.coroutines.internal.k0.f411911b.get(dVar) != 0) {
            return false;
        }
        Object obj = f412288g.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof kotlinx.coroutines.internal.H) {
            long j12 = kotlinx.coroutines.internal.H.f411870g.get((kotlinx.coroutines.internal.H) obj);
            if (((int) (1073741823 & j12)) == ((int) ((j12 & 1152921503533105152L) >> 30))) {
                return true;
            }
        } else if (obj == C43309w0.f412300b) {
            return true;
        }
        return false;
    }

    @Override // kotlinx.coroutines.AbstractC43300s0
    public void shutdown() {
        c cVarB;
        w1.f412301a.getClass();
        w1.f412302b.set(null);
        f412290i.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f412288g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            kotlinx.coroutines.internal.a0 a0Var = C43309w0.f412300b;
            if (obj != null) {
                if (!(obj instanceof kotlinx.coroutines.internal.H)) {
                    if (obj != a0Var) {
                        kotlinx.coroutines.internal.H h12 = new kotlinx.coroutines.internal.H(8, true);
                        h12.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, h12)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((kotlinx.coroutines.internal.H) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, a0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (H() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            d dVar = (d) f412289h.get(this);
            if (dVar == null) {
                return;
            }
            synchronized (dVar) {
                cVarB = kotlinx.coroutines.internal.k0.f411911b.get(dVar) > 0 ? dVar.b(0) : null;
            }
            c cVar = cVarB;
            if (cVar == null) {
                return;
            } else {
                T(jNanoTime, cVar);
            }
        }
    }
}
