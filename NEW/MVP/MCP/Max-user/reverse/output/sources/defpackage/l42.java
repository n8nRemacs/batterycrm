package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes.dex */
public class l42 extends ey4 implements k42, h84, ojh {
    public static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(l42.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(l42.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater o = AtomicReferenceFieldUpdater.newUpdater(l42.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public final Continuation a;
    public final x74 b;

    public l42(int i, Continuation continuation) {
        super(i);
        this.a = continuation;
        this.b = continuation.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = p7.a;
    }

    public static void t(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public static Object x(mia miaVar, Object obj, int i, um6 um6Var) {
        if (obj instanceof zk3) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (um6Var != null || (miaVar instanceof z32)) {
            return new xk3(obj, miaVar instanceof z32 ? (z32) miaVar : null, um6Var, (Throwable) null, 16);
        }
        return obj;
    }

    @Override // defpackage.ojh
    public final void a(Segment segment, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = c;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        q(segment);
    }

    public final void b(z32 z32Var, Throwable th) {
        try {
            z32Var.b(th);
        } catch (Throwable th2) {
            b7j.c(this.b, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void c(um6 um6Var, Throwable th, Object obj) {
        x74 x74Var = this.b;
        try {
            um6Var.invoke(th, obj, x74Var);
        } catch (Throwable th2) {
            b7j.c(x74Var, new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    @Override // defpackage.ey4
    public final void cancelCompletedResult$kotlinx_coroutines_core(Object obj, Throwable th) {
        Throwable th2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof mia) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof zk3) {
                return;
            }
            if (!(obj2 instanceof xk3)) {
                th2 = th;
                xk3 xk3Var = new xk3(obj2, (z32) null, (um6) null, th2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, xk3Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            xk3 xk3Var2 = (xk3) obj2;
            if (xk3Var2.e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            xk3 xk3VarA = xk3.a(xk3Var2, null, th, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, xk3VarA)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    th2 = th;
                }
            }
            z32 z32Var = xk3Var2.b;
            if (z32Var != null) {
                b(z32Var, th);
            }
            um6 um6Var = xk3Var2.c;
            if (um6Var != null) {
                c(um6Var, th, xk3Var2.a);
                return;
            }
            return;
            th = th2;
        }
    }

    @Override // defpackage.k42
    public final void d(z74 z74Var) {
        Continuation continuation = this.a;
        DispatchedContinuation dispatchedContinuation = continuation instanceof DispatchedContinuation ? (DispatchedContinuation) continuation : null;
        w(qqg.a, (dispatchedContinuation != null ? dispatchedContinuation.dispatcher : null) == z74Var ? 4 : this.resumeMode, null);
    }

    @Override // defpackage.k42
    public final void e(em6 em6Var) {
        nyi.b(this, new y32(1, em6Var));
    }

    @Override // defpackage.k42
    public final void f(Object obj, um6 um6Var) {
        w(obj, this.resumeMode, um6Var);
    }

    public final void g(Segment segment, Throwable th) {
        x74 x74Var = this.b;
        int i = c.get(this) & 536870911;
        if (i == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            segment.onCancellation(i, th, x74Var);
        } catch (Throwable th2) {
            b7j.c(x74Var, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // defpackage.h84
    public final h84 getCallerFrame() {
        Continuation continuation = this.a;
        if (continuation instanceof h84) {
            return (h84) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public final x74 getContext() {
        return this.b;
    }

    @Override // defpackage.ey4
    public final Continuation getDelegate$kotlinx_coroutines_core() {
        return this.a;
    }

    @Override // defpackage.ey4
    public final Throwable getExceptionalResult$kotlinx_coroutines_core(Object obj) {
        Throwable exceptionalResult$kotlinx_coroutines_core = super.getExceptionalResult$kotlinx_coroutines_core(obj);
        if (exceptionalResult$kotlinx_coroutines_core != null) {
            return exceptionalResult$kotlinx_coroutines_core;
        }
        return null;
    }

    @Override // defpackage.h84
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // defpackage.ey4
    public final Object getSuccessfulResult$kotlinx_coroutines_core(Object obj) {
        return obj instanceof xk3 ? ((xk3) obj).a : obj;
    }

    public final boolean h(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof mia)) {
                return false;
            }
            t42 t42Var = new t42(this, th, (obj instanceof z32) || (obj instanceof Segment));
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, t42Var)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            mia miaVar = (mia) obj;
            if (miaVar instanceof z32) {
                b((z32) obj, th);
            } else if (miaVar instanceof Segment) {
                g((Segment) obj, th);
            }
            if (!s()) {
                i();
            }
            k(this.resumeMode);
            return true;
        }
    }

    public final void i() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = o;
        sy4 sy4Var = (sy4) atomicReferenceFieldUpdater.get(this);
        if (sy4Var == null) {
            return;
        }
        sy4Var.dispose();
        atomicReferenceFieldUpdater.set(this, iia.a);
    }

    @Override // defpackage.k42
    public final boolean isCancelled() {
        return d.get(this) instanceof t42;
    }

    @Override // defpackage.k42
    public final Symbol j(Object obj, um6 um6Var) {
        return y(obj, um6Var);
    }

    public final void k(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = c;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z = i == 4;
                Continuation continuation = this.a;
                if (!z && (continuation instanceof DispatchedContinuation)) {
                    boolean z2 = i == 1 || i == 2;
                    int i4 = this.resumeMode;
                    if (z2 == (i4 == 1 || i4 == 2)) {
                        DispatchedContinuation dispatchedContinuation = (DispatchedContinuation) continuation;
                        z74 z74Var = dispatchedContinuation.dispatcher;
                        x74 context = dispatchedContinuation.getContext();
                        if (z74Var.isDispatchNeeded(context)) {
                            z74Var.mo13dispatch(context, this);
                            return;
                        }
                        ki5 ki5VarA = r7g.a();
                        if (ki5VarA.Q()) {
                            ki5VarA.w(this);
                            return;
                        }
                        ki5VarA.P(true);
                        try {
                            h9j.a(this, continuation, true);
                            do {
                            } while (ki5VarA.h0());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                h9j.a(this, continuation, z);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    public Throwable l(su7 su7Var) {
        return su7Var.getCancellationException();
    }

    @Override // defpackage.k42
    public final void m(Object obj) {
        k(this.resumeMode);
    }

    public final Object n() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        qt7 qt7Var;
        boolean zS = s();
        do {
            atomicIntegerFieldUpdater = c;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zS) {
                    v();
                }
                Object obj = d.get(this);
                if (obj instanceof zk3) {
                    throw ((zk3) obj).a;
                }
                int i3 = this.resumeMode;
                if ((i3 != 1 && i3 != 2) || (qt7Var = (qt7) this.b.get(wha.w0)) == null || qt7Var.isActive()) {
                    return getSuccessfulResult$kotlinx_coroutines_core(obj);
                }
                CancellationException cancellationException = qt7Var.getCancellationException();
                cancelCompletedResult$kotlinx_coroutines_core(obj, cancellationException);
                throw cancellationException;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (((sy4) o.get(this)) == null) {
            p();
        }
        if (zS) {
            v();
        }
        return g84.a;
    }

    public final void o() {
        sy4 sy4VarP = p();
        if (sy4VarP == null || (d.get(this) instanceof mia)) {
            return;
        }
        sy4VarP.dispose();
        o.set(this, iia.a);
    }

    public final sy4 p() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        qt7 qt7Var = (qt7) this.b.get(wha.w0);
        if (qt7Var == null) {
            return null;
        }
        sy4 sy4VarI = eoi.i(qt7Var, true, new x73(this, 0));
        do {
            atomicReferenceFieldUpdater = o;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, sy4VarI)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return sy4VarI;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00aa, code lost:
    
        t(r8, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ad, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(defpackage.mia r8) {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.l42.d
            java.lang.Object r2 = r0.get(r7)
            boolean r1 = r2 instanceof defpackage.p7
            if (r1 == 0) goto L19
        La:
            boolean r1 = r0.compareAndSet(r7, r2, r8)
            if (r1 == 0) goto L12
            goto La1
        L12:
            java.lang.Object r1 = r0.get(r7)
            if (r1 == r2) goto La
            goto L0
        L19:
            boolean r1 = r2 instanceof defpackage.z32
            r3 = 0
            if (r1 != 0) goto Laa
            boolean r1 = r2 instanceof kotlinx.coroutines.internal.Segment
            if (r1 != 0) goto Laa
            boolean r1 = r2 instanceof defpackage.zk3
            if (r1 == 0) goto L56
            r0 = r2
            zk3 r0 = (defpackage.zk3) r0
            r0.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.zk3.b
            r4 = 0
            r5 = 1
            boolean r1 = r1.compareAndSet(r0, r4, r5)
            if (r1 == 0) goto L52
            boolean r1 = r2 instanceof defpackage.t42
            if (r1 == 0) goto La1
            if (r2 == 0) goto L3d
            goto L3e
        L3d:
            r0 = r3
        L3e:
            if (r0 == 0) goto L42
            java.lang.Throwable r3 = r0.a
        L42:
            boolean r0 = r8 instanceof defpackage.z32
            if (r0 == 0) goto L4c
            z32 r8 = (defpackage.z32) r8
            r7.b(r8, r3)
            return
        L4c:
            kotlinx.coroutines.internal.Segment r8 = (kotlinx.coroutines.internal.Segment) r8
            r7.g(r8, r3)
            return
        L52:
            t(r8, r2)
            throw r3
        L56:
            boolean r1 = r2 instanceof defpackage.xk3
            if (r1 == 0) goto L8a
            r1 = r2
            xk3 r1 = (defpackage.xk3) r1
            z32 r4 = r1.b
            if (r4 != 0) goto L86
            boolean r4 = r8 instanceof kotlinx.coroutines.internal.Segment
            if (r4 == 0) goto L66
            return
        L66:
            r4 = r8
            z32 r4 = (defpackage.z32) r4
            java.lang.Throwable r5 = r1.e
            if (r5 == 0) goto L71
            r7.b(r4, r5)
            return
        L71:
            r5 = 29
            xk3 r1 = defpackage.xk3.a(r1, r4, r3, r5)
        L77:
            boolean r3 = r0.compareAndSet(r7, r2, r1)
            if (r3 == 0) goto L7e
            goto La1
        L7e:
            java.lang.Object r3 = r0.get(r7)
            if (r3 == r2) goto L77
            goto L0
        L86:
            t(r8, r2)
            throw r3
        L8a:
            boolean r1 = r8 instanceof kotlinx.coroutines.internal.Segment
            if (r1 == 0) goto L8f
            return
        L8f:
            r3 = r8
            z32 r3 = (defpackage.z32) r3
            xk3 r1 = new xk3
            r5 = 0
            r6 = 28
            r4 = 0
            r1.<init>(r2, r3, r4, r5, r6)
        L9b:
            boolean r3 = r0.compareAndSet(r7, r2, r1)
            if (r3 == 0) goto La2
        La1:
            return
        La2:
            java.lang.Object r3 = r0.get(r7)
            if (r3 == r2) goto L9b
            goto L0
        Laa:
            t(r8, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l42.q(mia):void");
    }

    public final boolean r() {
        return d.get(this) instanceof mia;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        Throwable thA = kpd.a(obj);
        if (thA != null) {
            obj = new zk3(thA, false);
        }
        w(obj, this.resumeMode, null);
    }

    public final boolean s() {
        return this.resumeMode == 2 && ((DispatchedContinuation) this.a).isReusable$kotlinx_coroutines_core();
    }

    @Override // defpackage.ey4
    public final Object takeState$kotlinx_coroutines_core() {
        return d.get(this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(u());
        sb.append('(');
        sb.append(zg4.g(this.a));
        sb.append("){");
        Object obj = d.get(this);
        sb.append(obj instanceof mia ? "Active" : obj instanceof t42 ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(zg4.a(this));
        return sb.toString();
    }

    public String u() {
        return "CancellableContinuation";
    }

    public final void v() {
        Throwable thTryReleaseClaimedContinuation$kotlinx_coroutines_core;
        Continuation continuation = this.a;
        DispatchedContinuation dispatchedContinuation = continuation instanceof DispatchedContinuation ? (DispatchedContinuation) continuation : null;
        if (dispatchedContinuation == null || (thTryReleaseClaimedContinuation$kotlinx_coroutines_core = dispatchedContinuation.tryReleaseClaimedContinuation$kotlinx_coroutines_core(this)) == null) {
            return;
        }
        i();
        h(thTryReleaseClaimedContinuation$kotlinx_coroutines_core);
    }

    public final void w(Object obj, int i, um6 um6Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof mia) {
                Object objX = x((mia) obj2, obj, i, um6Var);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objX)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!s()) {
                    i();
                }
                k(i);
                return;
            }
            if (obj2 instanceof t42) {
                t42 t42Var = (t42) obj2;
                t42Var.getClass();
                if (t42.c.compareAndSet(t42Var, 0, 1)) {
                    if (um6Var != null) {
                        c(um6Var, t42Var.a, obj);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    public final Symbol y(Object obj, um6 um6Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof mia)) {
                return null;
            }
            Object objX = x((mia) obj2, obj, this.resumeMode, um6Var);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objX)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!s()) {
                i();
            }
            return m42.a;
        }
    }
}
