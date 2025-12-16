package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes.dex */
public class su7 implements qt7, a83, tmb {
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    private static final /* synthetic */ AtomicReferenceFieldUpdater _state$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(su7.class, Object.class, "_state$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater _parentHandle$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(su7.class, Object.class, "_parentHandle$volatile");

    public su7(boolean z) {
        this._state$volatile = z ? tu7.g : tu7.f;
    }

    public static String A(Object obj) {
        if (!(obj instanceof mu7)) {
            return obj instanceof jj7 ? ((jj7) obj).isActive() ? "Active" : "New" : obj instanceof zk3 ? "Cancelled" : "Completed";
        }
        mu7 mu7Var = (mu7) obj;
        return mu7Var.d() ? "Cancelling" : mu7.b.get(mu7Var) != 0 ? "Completing" : "Active";
    }

    public static final void access$continueCompleting(su7 su7Var, mu7 mu7Var, z73 z73Var, Object obj) {
        su7Var.getClass();
        z73 z73VarV = v(z73Var);
        if (z73VarV == null || !su7Var.C(mu7Var, z73VarV, obj)) {
            mu7Var.a.close(2);
            z73 z73VarV2 = v(z73Var);
            if (z73VarV2 == null || !su7Var.C(mu7Var, z73VarV2, obj)) {
                su7Var.afterCompletion(su7Var.r(mu7Var, obj));
            }
        }
    }

    public static final Object access$onAwaitInternalProcessResFunc(su7 su7Var, Object obj, Object obj2) throws Throwable {
        su7Var.getClass();
        if (obj2 instanceof zk3) {
            throw ((zk3) obj2).a;
        }
        return obj2;
    }

    public static final void access$onAwaitInternalRegFunc(su7 su7Var, nbe nbeVar, Object obj) {
        Object state$kotlinx_coroutines_core;
        do {
            state$kotlinx_coroutines_core = su7Var.getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof jj7)) {
                if (!(state$kotlinx_coroutines_core instanceof zk3)) {
                    state$kotlinx_coroutines_core = tu7.a(state$kotlinx_coroutines_core);
                }
                ((mbe) nbeVar).o = state$kotlinx_coroutines_core;
                return;
            }
        } while (su7Var.z(state$kotlinx_coroutines_core) < 0);
        ((mbe) nbeVar).c = eoi.i(su7Var, true, new nu7(su7Var, nbeVar, 0));
    }

    public static final void access$registerSelectForOnJoin(su7 su7Var, nbe nbeVar, Object obj) {
        Object state$kotlinx_coroutines_core;
        do {
            state$kotlinx_coroutines_core = su7Var.getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof jj7)) {
                ((mbe) nbeVar).o = qqg.a;
                return;
            }
        } while (su7Var.z(state$kotlinx_coroutines_core) < 0);
        ((mbe) nbeVar).c = eoi.i(su7Var, true, new nu7(su7Var, nbeVar, 1));
    }

    public static /* synthetic */ JobCancellationException defaultCancellationException$kotlinx_coroutines_core$default(su7 su7Var, String str, Throwable th, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: defaultCancellationException");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            th = null;
        }
        if (str == null) {
            str = su7Var.cancellationExceptionMessage();
        }
        return new JobCancellationException(str, th, su7Var);
    }

    public static /* synthetic */ void getOnAwaitInternal$annotations() {
    }

    public static /* synthetic */ void getOnJoin$annotations() {
    }

    public static /* synthetic */ CancellationException toCancellationException$default(su7 su7Var, Throwable th, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        return su7Var.toCancellationException(th, str);
    }

    public static z73 v(LockFreeLinkedListNode lockFreeLinkedListNode) {
        while (lockFreeLinkedListNode.isRemoved()) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.getPrevNode();
        }
        while (true) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.getNextNode();
            if (!lockFreeLinkedListNode.isRemoved()) {
                if (lockFreeLinkedListNode instanceof z73) {
                    return (z73) lockFreeLinkedListNode;
                }
                if (lockFreeLinkedListNode instanceof xha) {
                    return null;
                }
            }
        }
    }

    public final Object B(Object obj, Object obj2) throws Throwable {
        if (!(obj instanceof jj7)) {
            return tu7.a;
        }
        if (((obj instanceof yc5) || (obj instanceof du7)) && !(obj instanceof z73) && !(obj2 instanceof zk3)) {
            jj7 jj7Var = (jj7) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
            Symbol symbol = tu7.a;
            Object kj7Var = obj2 instanceof jj7 ? new kj7((jj7) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, jj7Var, kj7Var)) {
                if (atomicReferenceFieldUpdater.get(this) != jj7Var) {
                    return tu7.c;
                }
            }
            onCancelling(null);
            onCompletionInternal(obj2);
            p(jj7Var, obj2);
            return obj2;
        }
        jj7 jj7Var2 = (jj7) obj;
        xha xhaVarT = t(jj7Var2);
        if (xhaVarT == null) {
            return tu7.c;
        }
        mu7 mu7Var = jj7Var2 instanceof mu7 ? (mu7) jj7Var2 : null;
        if (mu7Var == null) {
            mu7Var = new mu7(xhaVarT, null);
        }
        synchronized (mu7Var) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = mu7.b;
            if (atomicIntegerFieldUpdater.get(mu7Var) != 0) {
                return tu7.a;
            }
            atomicIntegerFieldUpdater.set(mu7Var, 1);
            if (mu7Var != jj7Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _state$volatile$FU;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, jj7Var2, mu7Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != jj7Var2) {
                        return tu7.c;
                    }
                }
            }
            boolean zD = mu7Var.d();
            zk3 zk3Var = obj2 instanceof zk3 ? (zk3) obj2 : null;
            if (zk3Var != null) {
                mu7Var.a(zk3Var.a);
            }
            Throwable thC = zD ? null : mu7Var.c();
            if (thC != null) {
                w(xhaVarT, thC);
            }
            z73 z73VarV = v(xhaVarT);
            if (z73VarV != null && C(mu7Var, z73VarV, obj2)) {
                return tu7.b;
            }
            xhaVarT.close(2);
            z73 z73VarV2 = v(xhaVarT);
            return (z73VarV2 == null || !C(mu7Var, z73VarV2, obj2)) ? r(mu7Var, obj2) : tu7.b;
        }
    }

    public final boolean C(mu7 mu7Var, z73 z73Var, Object obj) {
        while (eoi.i(z73Var.b, false, new lu7(this, mu7Var, z73Var, obj)) == iia.a) {
            z73Var = v(z73Var);
            if (z73Var == null) {
                return false;
            }
        }
        return true;
    }

    public void afterCompletion(Object obj) {
    }

    public void afterResume(Object obj) {
        afterCompletion(obj);
    }

    @Override // defpackage.qt7
    public final y73 attachChild(a83 a83Var) {
        z73 z73Var = new z73(a83Var);
        z73Var.a = this;
        loop0: while (true) {
            Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (state$kotlinx_coroutines_core instanceof yc5) {
                yc5 yc5Var = (yc5) state$kotlinx_coroutines_core;
                if (yc5Var.a) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, state$kotlinx_coroutines_core, z73Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != state$kotlinx_coroutines_core) {
                            break;
                        }
                    }
                    break loop0;
                }
                x(yc5Var);
            } else {
                boolean z = state$kotlinx_coroutines_core instanceof jj7;
                iia iiaVar = iia.a;
                if (!z) {
                    Object state$kotlinx_coroutines_core2 = getState$kotlinx_coroutines_core();
                    zk3 zk3Var = state$kotlinx_coroutines_core2 instanceof zk3 ? (zk3) state$kotlinx_coroutines_core2 : null;
                    z73Var.d(zk3Var != null ? zk3Var.a : null);
                    return iiaVar;
                }
                xha xhaVarB = ((jj7) state$kotlinx_coroutines_core).b();
                if (xhaVarB == null) {
                    y((du7) state$kotlinx_coroutines_core);
                } else if (!xhaVarB.addLast(z73Var, 7)) {
                    boolean zAddLast = xhaVarB.addLast(z73Var, 3);
                    Object state$kotlinx_coroutines_core3 = getState$kotlinx_coroutines_core();
                    if (state$kotlinx_coroutines_core3 instanceof mu7) {
                        thC = ((mu7) state$kotlinx_coroutines_core3).c();
                    } else {
                        zk3 zk3Var2 = state$kotlinx_coroutines_core3 instanceof zk3 ? (zk3) state$kotlinx_coroutines_core3 : null;
                        if (zk3Var2 != null) {
                            thC = zk3Var2.a;
                        }
                    }
                    z73Var.d(thC);
                    if (zAddLast) {
                        break loop0;
                    }
                    return iiaVar;
                }
            }
        }
        return z73Var;
    }

    public final Object awaitInternal(Continuation<Object> continuation) throws Throwable {
        Object state$kotlinx_coroutines_core;
        do {
            state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof jj7)) {
                if (state$kotlinx_coroutines_core instanceof zk3) {
                    throw ((zk3) state$kotlinx_coroutines_core).a;
                }
                return tu7.a(state$kotlinx_coroutines_core);
            }
        } while (z(state$kotlinx_coroutines_core) < 0);
        return n(continuation);
    }

    public Object c(q44 q44Var) {
        return awaitInternal(q44Var);
    }

    public /* synthetic */ void cancel() {
        cancel((CancellationException) null);
    }

    public final boolean cancelCoroutine(Throwable th) {
        return cancelImpl$kotlinx_coroutines_core(th);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f A[PHI: r0
  0x003f: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v12 java.lang.Object) binds: [B:3:0x0008, B:16:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean cancelImpl$kotlinx_coroutines_core(java.lang.Object r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.su7.cancelImpl$kotlinx_coroutines_core(java.lang.Object):boolean");
    }

    public void cancelInternal(Throwable th) throws Throwable {
        cancelImpl$kotlinx_coroutines_core(th);
    }

    public String cancellationExceptionMessage() {
        return "Job was cancelled";
    }

    public boolean childCancelled(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return cancelImpl$kotlinx_coroutines_core(th) && getHandlesException$kotlinx_coroutines_core();
    }

    public final JobCancellationException defaultCancellationException$kotlinx_coroutines_core(String str, Throwable th) {
        if (str == null) {
            str = cancellationExceptionMessage();
        }
        return new JobCancellationException(str, th, this);
    }

    @Override // defpackage.x74
    public <R> R fold(R r, sm6 sm6Var) {
        return (R) sm6Var.invoke(r, this);
    }

    @Override // defpackage.x74
    public <E extends v74> E get(w74 w74Var) {
        return (E) y6j.a(this, w74Var);
    }

    @Override // defpackage.qt7
    public final CancellationException getCancellationException() {
        CancellationException cancellationException;
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (!(state$kotlinx_coroutines_core instanceof mu7)) {
            if (!(state$kotlinx_coroutines_core instanceof jj7)) {
                return state$kotlinx_coroutines_core instanceof zk3 ? toCancellationException$default(this, ((zk3) state$kotlinx_coroutines_core).a, null, 1, null) : new JobCancellationException(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        Throwable thC = ((mu7) state$kotlinx_coroutines_core).c();
        if (thC != null && (cancellationException = toCancellationException(thC, getClass().getSimpleName().concat(" is cancelling"))) != null) {
            return cancellationException;
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    @Override // defpackage.tmb
    public CancellationException getChildJobCancellationCause() {
        CancellationException cancellationExceptionC;
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof mu7) {
            cancellationExceptionC = ((mu7) state$kotlinx_coroutines_core).c();
        } else if (state$kotlinx_coroutines_core instanceof zk3) {
            cancellationExceptionC = ((zk3) state$kotlinx_coroutines_core).a;
        } else {
            if (state$kotlinx_coroutines_core instanceof jj7) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + state$kotlinx_coroutines_core).toString());
            }
            cancellationExceptionC = null;
        }
        CancellationException cancellationException = cancellationExceptionC instanceof CancellationException ? cancellationExceptionC : null;
        return cancellationException == null ? new JobCancellationException("Parent job is ".concat(A(state$kotlinx_coroutines_core)), cancellationExceptionC, this) : cancellationException;
    }

    @Override // defpackage.qt7
    public final zde getChildren() {
        return new at(new ou7(this, null));
    }

    public final Object getCompletedInternal$kotlinx_coroutines_core() throws Throwable {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof jj7) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (state$kotlinx_coroutines_core instanceof zk3) {
            throw ((zk3) state$kotlinx_coroutines_core).a;
        }
        return tu7.a(state$kotlinx_coroutines_core);
    }

    public final Throwable getCompletionCause() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof mu7) {
            Throwable thC = ((mu7) state$kotlinx_coroutines_core).c();
            if (thC != null) {
                return thC;
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (state$kotlinx_coroutines_core instanceof jj7) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (state$kotlinx_coroutines_core instanceof zk3) {
            return ((zk3) state$kotlinx_coroutines_core).a;
        }
        return null;
    }

    public final boolean getCompletionCauseHandled() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (!(state$kotlinx_coroutines_core instanceof zk3)) {
            return false;
        }
        zk3 zk3Var = (zk3) state$kotlinx_coroutines_core;
        zk3Var.getClass();
        return zk3.b.get(zk3Var) != 0;
    }

    public final Throwable getCompletionExceptionOrNull() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof jj7) {
            throw new IllegalStateException("This job has not completed yet");
        }
        zk3 zk3Var = state$kotlinx_coroutines_core instanceof zk3 ? (zk3) state$kotlinx_coroutines_core : null;
        if (zk3Var != null) {
            return zk3Var.a;
        }
        return null;
    }

    public boolean getHandlesException$kotlinx_coroutines_core() {
        return true;
    }

    @Override // defpackage.v74
    public final w74 getKey() {
        return wha.w0;
    }

    public final ibe getOnAwaitInternal() {
        pu7 pu7Var = pu7.a;
        uog.d(3, pu7Var);
        qu7 qu7Var = qu7.a;
        uog.d(3, qu7Var);
        return new zva(this, pu7Var, qu7Var, (jv0) null);
    }

    public boolean getOnCancelComplete$kotlinx_coroutines_core() {
        return false;
    }

    public final hbe getOnJoin() {
        ru7 ru7Var = ru7.a;
        uog.d(3, ru7Var);
        ka5 ka5Var = new ka5();
        ka5Var.a = this;
        ka5Var.b = ru7Var;
        Symbol symbol = pbe.a;
        ka5Var.c = obe.b;
        return ka5Var;
    }

    public qt7 getParent() {
        y73 parentHandle$kotlinx_coroutines_core = getParentHandle$kotlinx_coroutines_core();
        if (parentHandle$kotlinx_coroutines_core != null) {
            return parentHandle$kotlinx_coroutines_core.getParent();
        }
        return null;
    }

    public final y73 getParentHandle$kotlinx_coroutines_core() {
        return (y73) _parentHandle$volatile$FU.get(this);
    }

    public final Object getState$kotlinx_coroutines_core() {
        return _state$volatile$FU.get(this);
    }

    public boolean handleJobException(Throwable th) {
        return false;
    }

    public void handleOnCompletionException$kotlinx_coroutines_core(Throwable th) throws Throwable {
        throw th;
    }

    public final void initParentJob(qt7 qt7Var) {
        iia iiaVar = iia.a;
        if (qt7Var == null) {
            setParentHandle$kotlinx_coroutines_core(iiaVar);
            return;
        }
        qt7Var.start();
        y73 y73VarAttachChild = qt7Var.attachChild(this);
        setParentHandle$kotlinx_coroutines_core(y73VarAttachChild);
        if (isCompleted()) {
            y73VarAttachChild.dispose();
            setParentHandle$kotlinx_coroutines_core(iiaVar);
        }
    }

    @Override // defpackage.qt7
    public final sy4 invokeOnCompletion(em6 em6Var) {
        return invokeOnCompletionInternal$kotlinx_coroutines_core(true, new wy4(1, em6Var));
    }

    public final sy4 invokeOnCompletionInternal$kotlinx_coroutines_core(boolean z, du7 du7Var) {
        iia iiaVar;
        boolean z2;
        boolean zAddLast;
        du7Var.a = this;
        loop0: while (true) {
            Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            boolean z3 = state$kotlinx_coroutines_core instanceof yc5;
            iiaVar = iia.a;
            z2 = true;
            if (!z3) {
                if (!(state$kotlinx_coroutines_core instanceof jj7)) {
                    z2 = false;
                    break;
                }
                jj7 jj7Var = (jj7) state$kotlinx_coroutines_core;
                xha xhaVarB = jj7Var.b();
                if (xhaVarB == null) {
                    y((du7) state$kotlinx_coroutines_core);
                } else {
                    if (du7Var.c()) {
                        mu7 mu7Var = jj7Var instanceof mu7 ? (mu7) jj7Var : null;
                        Throwable thC = mu7Var != null ? mu7Var.c() : null;
                        if (thC == null) {
                            zAddLast = xhaVarB.addLast(du7Var, 5);
                        } else if (z) {
                            du7Var.d(thC);
                            return iiaVar;
                        }
                    } else {
                        zAddLast = xhaVarB.addLast(du7Var, 1);
                    }
                    if (zAddLast) {
                        break;
                    }
                }
            } else {
                yc5 yc5Var = (yc5) state$kotlinx_coroutines_core;
                if (yc5Var.a) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, state$kotlinx_coroutines_core, du7Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != state$kotlinx_coroutines_core) {
                            break;
                        }
                    }
                    break loop0;
                }
                x(yc5Var);
            }
        }
        if (z2) {
            return du7Var;
        }
        if (z) {
            Object state$kotlinx_coroutines_core2 = getState$kotlinx_coroutines_core();
            zk3 zk3Var = state$kotlinx_coroutines_core2 instanceof zk3 ? (zk3) state$kotlinx_coroutines_core2 : null;
            du7Var.d(zk3Var != null ? zk3Var.a : null);
        }
        return iiaVar;
    }

    @Override // defpackage.qt7
    public boolean isActive() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        return (state$kotlinx_coroutines_core instanceof jj7) && ((jj7) state$kotlinx_coroutines_core).isActive();
    }

    @Override // defpackage.qt7
    public final boolean isCancelled() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof zk3) {
            return true;
        }
        return (state$kotlinx_coroutines_core instanceof mu7) && ((mu7) state$kotlinx_coroutines_core).d();
    }

    @Override // defpackage.qt7
    public final boolean isCompleted() {
        return !(getState$kotlinx_coroutines_core() instanceof jj7);
    }

    public final boolean isCompletedExceptionally() {
        return getState$kotlinx_coroutines_core() instanceof zk3;
    }

    public boolean isScopedCoroutine() {
        return this instanceof oq0;
    }

    @Override // defpackage.qt7
    public final Object join(Continuation<? super qqg> continuation) {
        Object state$kotlinx_coroutines_core;
        qqg qqgVar;
        do {
            state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            boolean z = state$kotlinx_coroutines_core instanceof jj7;
            qqgVar = qqg.a;
            if (!z) {
                eoi.d(continuation.getContext());
                return qqgVar;
            }
        } while (z(state$kotlinx_coroutines_core) < 0);
        Object objU = u(continuation);
        return objU == g84.a ? objU : qqgVar;
    }

    public Object l() {
        return getCompletedInternal$kotlinx_coroutines_core();
    }

    public final boolean makeCompleting$kotlinx_coroutines_core(Object obj) throws Throwable {
        Object objB;
        do {
            objB = B(getState$kotlinx_coroutines_core(), obj);
            if (objB == tu7.a) {
                return false;
            }
            if (objB == tu7.b) {
                return true;
            }
        } while (objB == tu7.c);
        afterCompletion(objB);
        return true;
    }

    public final Object makeCompletingOnce$kotlinx_coroutines_core(Object obj) {
        Object objB;
        do {
            objB = B(getState$kotlinx_coroutines_core(), obj);
            if (objB == tu7.a) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                zk3 zk3Var = obj instanceof zk3 ? (zk3) obj : null;
                throw new IllegalStateException(str, zk3Var != null ? zk3Var.a : null);
            }
        } while (objB == tu7.c);
        return objB;
    }

    @Override // defpackage.x74
    public x74 minusKey(w74 w74Var) {
        return y6j.b(this, w74Var);
    }

    public final Object n(Continuation continuation) {
        ku7 ku7Var = new ku7(this, hni.f(continuation));
        ku7Var.o();
        nyi.b(ku7Var, new y32(2, eoi.i(this, true, new wy4(2, ku7Var))));
        return ku7Var.n();
    }

    public String nameString$kotlinx_coroutines_core() {
        return getClass().getSimpleName();
    }

    public final boolean o(Throwable th) {
        if (!isScopedCoroutine()) {
            boolean z = th instanceof CancellationException;
            y73 parentHandle$kotlinx_coroutines_core = getParentHandle$kotlinx_coroutines_core();
            return (parentHandle$kotlinx_coroutines_core == null || parentHandle$kotlinx_coroutines_core == iia.a) ? z : parentHandle$kotlinx_coroutines_core.a(th) || z;
        }
        return true;
    }

    public void onCancelling(Throwable th) {
    }

    public void onCompletionInternal(Object obj) {
    }

    public void onStart() {
    }

    public final void p(jj7 jj7Var, Object obj) throws Throwable {
        y73 parentHandle$kotlinx_coroutines_core = getParentHandle$kotlinx_coroutines_core();
        if (parentHandle$kotlinx_coroutines_core != null) {
            parentHandle$kotlinx_coroutines_core.dispose();
            setParentHandle$kotlinx_coroutines_core(iia.a);
        }
        CompletionHandlerException completionHandlerException = null;
        zk3 zk3Var = obj instanceof zk3 ? (zk3) obj : null;
        Throwable th = zk3Var != null ? zk3Var.a : null;
        if (jj7Var instanceof du7) {
            try {
                ((du7) jj7Var).d(th);
                return;
            } catch (Throwable th2) {
                handleOnCompletionException$kotlinx_coroutines_core(new CompletionHandlerException("Exception in completion handler " + jj7Var + " for " + this, th2));
                return;
            }
        }
        xha xhaVarB = jj7Var.b();
        if (xhaVarB != null) {
            xhaVarB.close(1);
            for (LockFreeLinkedListNode nextNode = (LockFreeLinkedListNode) xhaVarB.getNext(); !fni.a(nextNode, xhaVarB); nextNode = nextNode.getNextNode()) {
                if (nextNode instanceof du7) {
                    try {
                        ((du7) nextNode).d(th);
                    } catch (Throwable th3) {
                        if (completionHandlerException != null) {
                            saj.a(completionHandlerException, th3);
                        } else {
                            completionHandlerException = new CompletionHandlerException("Exception in completion handler " + nextNode + " for " + this, th3);
                        }
                    }
                }
            }
            if (completionHandlerException != null) {
                handleOnCompletionException$kotlinx_coroutines_core(completionHandlerException);
            }
        }
    }

    @Override // defpackage.a83
    public final void parentCancelled(tmb tmbVar) throws Throwable {
        cancelImpl$kotlinx_coroutines_core(tmbVar);
    }

    public qt7 plus(qt7 qt7Var) {
        return qt7Var;
    }

    public final Throwable q(Object obj) {
        if (!(obj == null ? true : obj instanceof Throwable)) {
            return ((tmb) obj).getChildJobCancellationCause();
        }
        Throwable th = (Throwable) obj;
        return th == null ? new JobCancellationException(cancellationExceptionMessage(), null, this) : th;
    }

    public final Object r(mu7 mu7Var, Object obj) throws Throwable {
        boolean zD;
        Throwable thS;
        zk3 zk3Var = obj instanceof zk3 ? (zk3) obj : null;
        Throwable th = zk3Var != null ? zk3Var.a : null;
        synchronized (mu7Var) {
            zD = mu7Var.d();
            ArrayList<Throwable> arrayListE = mu7Var.e(th);
            thS = s(mu7Var, arrayListE);
            if (thS != null && arrayListE.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListE.size()));
                for (Throwable th2 : arrayListE) {
                    if (th2 != thS && th2 != thS && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        saj.a(thS, th2);
                    }
                }
            }
        }
        if (thS != null && thS != th) {
            obj = new zk3(thS, false);
        }
        if (thS != null && (o(thS) || handleJobException(thS))) {
            zk3 zk3Var2 = (zk3) obj;
            zk3Var2.getClass();
            zk3.b.compareAndSet(zk3Var2, 0, 1);
        }
        if (!zD) {
            onCancelling(thS);
        }
        onCompletionInternal(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
        Object kj7Var = obj instanceof jj7 ? new kj7((jj7) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, mu7Var, kj7Var) && atomicReferenceFieldUpdater.get(this) == mu7Var) {
        }
        p(mu7Var, obj);
        return obj;
    }

    public final void removeNode$kotlinx_coroutines_core(du7 du7Var) {
        while (true) {
            Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof du7)) {
                if (!(state$kotlinx_coroutines_core instanceof jj7) || ((jj7) state$kotlinx_coroutines_core).b() == null) {
                    return;
                }
                du7Var.mo12remove();
                return;
            }
            if (state$kotlinx_coroutines_core != du7Var) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
            yc5 yc5Var = tu7.g;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, state$kotlinx_coroutines_core, yc5Var)) {
                if (atomicReferenceFieldUpdater.get(this) != state$kotlinx_coroutines_core) {
                    break;
                }
            }
            return;
        }
    }

    public final Throwable s(mu7 mu7Var, ArrayList arrayList) {
        Object next;
        Object obj = null;
        if (arrayList.isEmpty()) {
            if (mu7Var.d()) {
                return new JobCancellationException(cancellationExceptionMessage(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof TimeoutCancellationException) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                Throwable th3 = (Throwable) next2;
                if (th3 != th2 && (th3 instanceof TimeoutCancellationException)) {
                    obj = next2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public final void setParentHandle$kotlinx_coroutines_core(y73 y73Var) {
        _parentHandle$volatile$FU.set(this, y73Var);
    }

    @Override // defpackage.qt7
    public final boolean start() {
        int iZ;
        do {
            iZ = z(getState$kotlinx_coroutines_core());
            if (iZ == 0) {
                return false;
            }
        } while (iZ != 1);
        return true;
    }

    public final xha t(jj7 jj7Var) {
        xha xhaVarB = jj7Var.b();
        if (xhaVarB != null) {
            return xhaVarB;
        }
        if (jj7Var instanceof yc5) {
            return new xha();
        }
        if (jj7Var instanceof du7) {
            y((du7) jj7Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + jj7Var).toString());
    }

    public final CancellationException toCancellationException(Throwable th, String str) {
        CancellationException jobCancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (jobCancellationException == null) {
            if (str == null) {
                str = cancellationExceptionMessage();
            }
            jobCancellationException = new JobCancellationException(str, th, this);
        }
        return jobCancellationException;
    }

    public final String toDebugString() {
        return nameString$kotlinx_coroutines_core() + '{' + A(getState$kotlinx_coroutines_core()) + '}';
    }

    public String toString() {
        return toDebugString() + '@' + zg4.a(this);
    }

    public final Object u(Continuation continuation) {
        l42 l42Var = new l42(1, hni.f(continuation));
        l42Var.o();
        nyi.b(l42Var, new y32(2, eoi.i(this, true, new x73(l42Var, 1))));
        Object objN = l42Var.n();
        return objN == g84.a ? objN : qqg.a;
    }

    public final void w(xha xhaVar, Throwable th) throws Throwable {
        onCancelling(th);
        xhaVar.close(4);
        CompletionHandlerException completionHandlerException = null;
        for (LockFreeLinkedListNode nextNode = (LockFreeLinkedListNode) xhaVar.getNext(); !fni.a(nextNode, xhaVar); nextNode = nextNode.getNextNode()) {
            if ((nextNode instanceof du7) && ((du7) nextNode).c()) {
                try {
                    ((du7) nextNode).d(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        saj.a(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + nextNode + " for " + this, th2);
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            handleOnCompletionException$kotlinx_coroutines_core(completionHandlerException);
        }
        o(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [cj7] */
    public final void x(yc5 yc5Var) {
        xha xhaVar = new xha();
        if (!yc5Var.a) {
            xhaVar = new cj7(xhaVar);
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, yc5Var, xhaVar) && atomicReferenceFieldUpdater.get(this) == yc5Var) {
        }
    }

    public final void y(du7 du7Var) {
        du7Var.addOneIfEmpty(new xha());
        LockFreeLinkedListNode nextNode = du7Var.getNextNode();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, du7Var, nextNode) && atomicReferenceFieldUpdater.get(this) == du7Var) {
        }
    }

    public final int z(Object obj) {
        if (obj instanceof yc5) {
            if (((yc5) obj).a) {
                return 0;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
            yc5 yc5Var = tu7.g;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, yc5Var)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            onStart();
            return 1;
        }
        if (!(obj instanceof cj7)) {
            return 0;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _state$volatile$FU;
        xha xhaVar = ((cj7) obj).a;
        while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, xhaVar)) {
            if (atomicReferenceFieldUpdater2.get(this) != obj) {
                return -1;
            }
        }
        onStart();
        return 1;
    }

    public /* synthetic */ boolean cancel(Throwable th) throws Throwable {
        Throwable jobCancellationException;
        if (th == null || (jobCancellationException = toCancellationException$default(this, th, null, 1, null)) == null) {
            jobCancellationException = new JobCancellationException(cancellationExceptionMessage(), null, this);
        }
        cancelInternal(jobCancellationException);
        return true;
    }

    @Override // defpackage.x74
    public x74 plus(x74 x74Var) {
        return x6j.b(this, x74Var);
    }

    @Override // defpackage.qt7
    public final sy4 invokeOnCompletion(boolean z, boolean z2, em6 em6Var) {
        du7 wy4Var;
        if (z) {
            wy4Var = new js7(em6Var);
        } else {
            wy4Var = new wy4(1, em6Var);
        }
        return invokeOnCompletionInternal$kotlinx_coroutines_core(z2, wy4Var);
    }

    @Override // defpackage.qt7
    public void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(cancellationExceptionMessage(), null, this);
        }
        cancelInternal(cancellationException);
    }
}
