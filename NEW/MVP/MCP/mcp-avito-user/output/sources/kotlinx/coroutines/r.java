package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.InterfaceC43269p;
import kotlinx.coroutines.internal.C43242l;
import kotlinx.coroutines.internal.C43243m;

/* compiled from: CancellableContinuationImpl.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0011\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u00052\u00020\u0006R\u000b\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004R\u0013\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t8\u0002X\u0082\u0004R\u0013\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\t8\u0002X\u0082\u0004¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/r;", "T", "Lkotlinx/coroutines/i0;", "Lkotlinx/coroutines/q;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/H1;", "Lkotlinx/atomicfu/AtomicInt;", "_decisionAndIndex", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/o0;", "_parentHandle", "", "_state", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.X
/* loaded from: classes8.dex */
public class r<T> extends AbstractC43229i0<T> implements InterfaceC43271q<T>, CoroutineStackFrame, H1 {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f411956g = AtomicIntegerFieldUpdater.newUpdater(r.class, "_decisionAndIndex$volatile");

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f411957h = AtomicReferenceFieldUpdater.newUpdater(r.class, Object.class, "_state$volatile");

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f411958i = AtomicReferenceFieldUpdater.newUpdater(r.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Continuation<T> f411959e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final CoroutineContext f411960f;

    public r(int i12, @Y61.k Continuation continuation) {
        super(i12);
        this.f411959e = continuation;
        this.f411960f = continuation.get$context();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C43127d.f411043b;
    }

    public static Object D(InterfaceC43227h1 interfaceC43227h1, Object obj, int i12, Y41.l lVar) {
        if ((obj instanceof E) || !C43257j0.a(i12)) {
            return obj;
        }
        if (lVar != null || (interfaceC43227h1 instanceof InterfaceC43269p)) {
            return new D(obj, interfaceC43227h1 instanceof InterfaceC43269p ? (InterfaceC43269p) interfaceC43227h1 : null, lVar, null, null, 16, null);
        }
        return obj;
    }

    public static void x(InterfaceC43227h1 interfaceC43227h1, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + interfaceC43227h1 + ", already has " + obj).toString());
    }

    public final void A(int i12, Y41.l lVar, Object obj) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f411957h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof InterfaceC43227h1) {
                Object objD = D((InterfaceC43227h1) obj2, obj, i12, lVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objD)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!w()) {
                    l();
                }
                m(i12);
                return;
            }
            if (obj2 instanceof C43304u) {
                C43304u c43304u = (C43304u) obj2;
                c43304u.getClass();
                if (C43304u.f412297c.compareAndSet(c43304u, 0, 1)) {
                    if (lVar != null) {
                        j(lVar, c43304u.f410693a);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    public final void B(@Y61.k M m12, T t12) {
        Continuation<T> continuation = this.f411959e;
        C43242l c43242l = continuation instanceof C43242l ? (C43242l) continuation : null;
        A((c43242l != null ? c43242l.f411914e : null) == m12 ? 4 : this.f411859d, null, t12);
    }

    @Override // kotlinx.coroutines.InterfaceC43271q
    public final void C(@Y61.l Y41.l lVar, Object obj) {
        A(this.f411859d, lVar, obj);
    }

    public final kotlinx.coroutines.internal.a0 E(Y41.l lVar, Object obj) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f411957h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z12 = obj2 instanceof InterfaceC43227h1;
            kotlinx.coroutines.internal.a0 a0Var = C43299s.f412135a;
            if (!z12) {
                boolean z13 = obj2 instanceof D;
                return null;
            }
            Object objD = D((InterfaceC43227h1) obj2, obj, this.f411859d, lVar);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objD)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!w()) {
                l();
            }
            return a0Var;
        }
    }

    @Override // kotlinx.coroutines.InterfaceC43271q
    public final void I(@Y61.k Object obj) {
        m(this.f411859d);
    }

    @Override // kotlinx.coroutines.AbstractC43229i0
    public final void a(@Y61.l Object obj, @Y61.k CancellationException cancellationException) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f411957h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof InterfaceC43227h1) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof E) {
                return;
            }
            if (!(obj2 instanceof D)) {
                D d12 = new D(obj2, null, null, null, cancellationException, 14, null);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, d12)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            D d13 = (D) obj2;
            if (d13.f410690e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            D dA2 = D.a(d13, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, dA2)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            InterfaceC43269p interfaceC43269p = d13.f410687b;
            if (interfaceC43269p != null) {
                i(interfaceC43269p, cancellationException);
            }
            Y41.l<Throwable, kotlin.G0> lVar = d13.f410688c;
            if (lVar != null) {
                j(lVar, cancellationException);
                return;
            }
            return;
        }
    }

    @Override // kotlinx.coroutines.AbstractC43229i0
    @Y61.k
    public final Continuation<T> b() {
        return this.f411959e;
    }

    @Override // kotlinx.coroutines.H1
    public final void c(@Y61.k kotlinx.coroutines.internal.X<?> x12, int i12) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i13;
        do {
            atomicIntegerFieldUpdater = f411956g;
            i13 = atomicIntegerFieldUpdater.get(this);
            if ((i13 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i13, ((i13 >> 29) << 29) + i12));
        s(x12);
    }

    @Override // kotlinx.coroutines.AbstractC43229i0
    @Y61.l
    public final Throwable d(@Y61.l Object obj) {
        Throwable thD = super.d(obj);
        if (thD != null) {
            return thD;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.AbstractC43229i0
    public final <T> T e(@Y61.l Object obj) {
        return obj instanceof D ? (T) ((D) obj).f410686a : obj;
    }

    @Override // kotlinx.coroutines.InterfaceC43271q
    public final boolean f(@Y61.l Throwable th2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f411957h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof InterfaceC43227h1)) {
                return false;
            }
            C43304u c43304u = new C43304u(this, th2, (obj instanceof InterfaceC43269p) || (obj instanceof kotlinx.coroutines.internal.X));
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c43304u)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            InterfaceC43227h1 interfaceC43227h1 = (InterfaceC43227h1) obj;
            if (interfaceC43227h1 instanceof InterfaceC43269p) {
                i((InterfaceC43269p) obj, th2);
            } else if (interfaceC43227h1 instanceof kotlinx.coroutines.internal.X) {
                k((kotlinx.coroutines.internal.X) obj, th2);
            }
            if (!w()) {
                l();
            }
            m(this.f411859d);
            return true;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Y61.l
    public final CoroutineStackFrame getCallerFrame() {
        Continuation<T> continuation = this.f411959e;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    @Y61.k
    /* renamed from: getContext, reason: from getter */
    public final CoroutineContext get$context() {
        return this.f411960f;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Y61.l
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlinx.coroutines.AbstractC43229i0
    @Y61.l
    public final Object h() {
        return f411957h.get(this);
    }

    public final void i(@Y61.k InterfaceC43269p interfaceC43269p, @Y61.l Throwable th2) {
        try {
            interfaceC43269p.a(th2);
        } catch (Throwable th3) {
            P.a(this.f411960f, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    @Override // kotlinx.coroutines.InterfaceC43271q
    public final boolean isActive() {
        return f411957h.get(this) instanceof InterfaceC43227h1;
    }

    public final void j(@Y61.k Y41.l<? super Throwable, kotlin.G0> lVar, @Y61.k Throwable th2) {
        try {
            lVar.invoke(th2);
        } catch (Throwable th3) {
            P.a(this.f411960f, new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th3));
        }
    }

    public final void k(kotlinx.coroutines.internal.X<?> x12, Throwable th2) {
        CoroutineContext coroutineContext = this.f411960f;
        int i12 = f411956g.get(this) & 536870911;
        if (i12 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            x12.h(i12, coroutineContext);
        } catch (Throwable th3) {
            P.a(coroutineContext, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    public final void l() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f411958i;
        InterfaceC43268o0 interfaceC43268o0 = (InterfaceC43268o0) atomicReferenceFieldUpdater.get(this);
        if (interfaceC43268o0 == null) {
            return;
        }
        interfaceC43268o0.dispose();
        atomicReferenceFieldUpdater.set(this, C43224g1.f411855b);
    }

    public final void m(int i12) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i13;
        do {
            atomicIntegerFieldUpdater = f411956g;
            i13 = atomicIntegerFieldUpdater.get(this);
            int i14 = i13 >> 29;
            if (i14 != 0) {
                if (i14 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z12 = i12 == 4;
                Continuation<T> continuation = this.f411959e;
                if (z12 || !(continuation instanceof C43242l) || C43257j0.a(i12) != C43257j0.a(this.f411859d)) {
                    C43257j0.b(this, continuation, z12);
                    return;
                }
                M m12 = ((C43242l) continuation).f411914e;
                CoroutineContext f411960f = ((C43242l) continuation).f411915f.get$context();
                if (m12.p(f411960f)) {
                    m12.h(f411960f, this);
                    return;
                }
                w1.f412301a.getClass();
                AbstractC43300s0 abstractC43300s0A = w1.a();
                if (abstractC43300s0A.G()) {
                    abstractC43300s0A.B(this);
                    return;
                }
                abstractC43300s0A.D(true);
                try {
                    C43257j0.b(this, continuation, true);
                    do {
                    } while (abstractC43300s0A.I());
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i13, 1073741824 + (536870911 & i13)));
    }

    @Y61.k
    public Throwable n(@Y61.k V0 v02) {
        return v02.J();
    }

    @Y61.l
    @kotlin.X
    public final Object o() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i12;
        boolean zW2 = w();
        do {
            atomicIntegerFieldUpdater = f411956g;
            i12 = atomicIntegerFieldUpdater.get(this);
            int i13 = i12 >> 29;
            if (i13 != 0) {
                if (i13 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zW2) {
                    z();
                }
                Object obj = f411957h.get(this);
                if (obj instanceof E) {
                    throw ((E) obj).f410693a;
                }
                if (C43257j0.a(this.f411859d)) {
                    N0 n02 = (N0) this.f411960f.get(N0.f410716u2);
                    if (n02 != null && !n02.isActive()) {
                        CancellationException cancellationExceptionJ = n02.J();
                        a(obj, cancellationExceptionJ);
                        throw cancellationExceptionJ;
                    }
                }
                return e(obj);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i12, 536870912 + (536870911 & i12)));
        if (((InterfaceC43268o0) f411958i.get(this)) == null) {
            q();
        }
        if (zW2) {
            z();
        }
        return IntrinsicsKt.getCOROUTINE_SUSPENDED();
    }

    public final void p() {
        InterfaceC43268o0 interfaceC43268o0Q = q();
        if (interfaceC43268o0Q != null && v()) {
            interfaceC43268o0Q.dispose();
            f411958i.set(this, C43224g1.f411855b);
        }
    }

    public final InterfaceC43268o0 q() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        N0 n02 = (N0) this.f411960f.get(N0.f410716u2);
        if (n02 == null) {
            return null;
        }
        InterfaceC43268o0 interfaceC43268o0G = Q0.g(n02, new C43306v(this), 2);
        do {
            atomicReferenceFieldUpdater = f411958i;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, interfaceC43268o0G)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return interfaceC43268o0G;
    }

    public final void r(@Y61.k Y41.l<? super Throwable, kotlin.G0> lVar) {
        s(new InterfaceC43269p.a(lVar));
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(@Y61.k Object obj) {
        Throwable thB = kotlin.Z.b(obj);
        C42822w c42822w = null;
        if (thB != null) {
            obj = new E(thB, false, 2, c42822w);
        }
        A(this.f411859d, null, obj);
    }

    public final void s(InterfaceC43227h1 interfaceC43227h1) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f411957h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C43127d) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, interfaceC43227h1)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            if (obj instanceof InterfaceC43269p ? true : obj instanceof kotlinx.coroutines.internal.X) {
                x(interfaceC43227h1, obj);
                throw null;
            }
            if (obj instanceof E) {
                E e12 = (E) obj;
                e12.getClass();
                if (!E.f410692b.compareAndSet(e12, 0, 1)) {
                    x(interfaceC43227h1, obj);
                    throw null;
                }
                if (obj instanceof C43304u) {
                    if (!(obj instanceof E)) {
                        e12 = null;
                    }
                    Throwable th2 = e12 != null ? e12.f410693a : null;
                    if (interfaceC43227h1 instanceof InterfaceC43269p) {
                        i((InterfaceC43269p) interfaceC43227h1, th2);
                        return;
                    } else {
                        k((kotlinx.coroutines.internal.X) interfaceC43227h1, th2);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof D)) {
                if (interfaceC43227h1 instanceof kotlinx.coroutines.internal.X) {
                    return;
                }
                D d12 = new D(obj, (InterfaceC43269p) interfaceC43227h1, null, null, null, 28, null);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, d12)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            D d13 = (D) obj;
            if (d13.f410687b != null) {
                x(interfaceC43227h1, obj);
                throw null;
            }
            if (interfaceC43227h1 instanceof kotlinx.coroutines.internal.X) {
                return;
            }
            InterfaceC43269p interfaceC43269p = (InterfaceC43269p) interfaceC43227h1;
            Throwable th3 = d13.f410690e;
            if (th3 != null) {
                i(interfaceC43269p, th3);
                return;
            }
            D dA2 = D.a(d13, interfaceC43269p, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, dA2)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    @Override // kotlinx.coroutines.InterfaceC43271q
    @Y61.l
    public final kotlinx.coroutines.internal.a0 t(@Y61.l Y41.l lVar, Object obj) {
        return E(lVar, obj);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(y());
        sb2.append('(');
        sb2.append(X.b(this.f411959e));
        sb2.append("){");
        Object obj = f411957h.get(this);
        sb2.append(obj instanceof InterfaceC43227h1 ? "Active" : obj instanceof C43304u ? "Cancelled" : "Completed");
        sb2.append("}@");
        sb2.append(X.a(this));
        return sb2.toString();
    }

    public final boolean u() {
        return f411957h.get(this) instanceof C43304u;
    }

    public final boolean v() {
        return !(f411957h.get(this) instanceof InterfaceC43227h1);
    }

    public final boolean w() {
        if (this.f411859d == 2) {
            if (C43242l.f411913i.get((C43242l) this.f411959e) != null) {
                return true;
            }
        }
        return false;
    }

    @Y61.k
    public String y() {
        return "CancellableContinuation";
    }

    public final void z() {
        Continuation<T> continuation = this.f411959e;
        Throwable th2 = null;
        C43242l c43242l = continuation instanceof C43242l ? (C43242l) continuation : null;
        if (c43242l != null) {
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C43242l.f411913i;
                Object obj = atomicReferenceFieldUpdater.get(c43242l);
                kotlinx.coroutines.internal.a0 a0Var = C43243m.f411919b;
                if (obj == a0Var) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(c43242l, a0Var, this)) {
                        if (atomicReferenceFieldUpdater.get(c43242l) != a0Var) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(c43242l, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(c43242l) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th2 = (Throwable) obj;
                }
            }
            if (th2 == null) {
                return;
            }
            l();
            f(th2);
        }
    }
}
