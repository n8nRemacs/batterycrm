package kotlinx.coroutines.internal;

import defpackage.al3;
import defpackage.d5j;
import defpackage.em6;
import defpackage.ey4;
import defpackage.fni;
import defpackage.h84;
import defpackage.ipd;
import defpackage.k42;
import defpackage.ki5;
import defpackage.l42;
import defpackage.lqg;
import defpackage.qt7;
import defpackage.r7g;
import defpackage.wha;
import defpackage.x74;
import defpackage.z6j;
import defpackage.z74;
import defpackage.zg4;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0016\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u001c\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0019H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010!\u001a\u0004\u0018\u00010\u001e2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u001dH\u0000¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010%\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u001eH\u0000¢\u0006\u0004\b#\u0010$J\u0011\u0010)\u001a\u0004\u0018\u00010&H\u0010¢\u0006\u0004\b'\u0010(J\u001d\u0010,\u001a\u00020\u00132\f\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000*H\u0016¢\u0006\u0004\b,\u0010-J6\u00102\u001a\u00020\u00132\f\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000*2\u0016\b\b\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0013\u0018\u00010.H\u0080\b¢\u0006\u0004\b0\u00101J!\u00106\u001a\u00020\u00132\b\u00103\u001a\u0004\u0018\u00010&2\u0006\u0010\"\u001a\u00020\u001eH\u0010¢\u0006\u0004\b4\u00105J\u001a\u0010:\u001a\u00020\u000f2\b\u00107\u001a\u0004\u0018\u00010&H\u0080\b¢\u0006\u0004\b8\u00109J\u001e\u0010<\u001a\u00020\u00132\f\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000*H\u0080\b¢\u0006\u0004\b;\u0010-J\u001f\u0010B\u001a\u00020\u00132\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u00028\u0000H\u0000¢\u0006\u0004\b@\u0010AJ\u000f\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bD\u0010ER\u0014\u0010\u0007\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010FR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010GR\u001e\u0010H\u001a\u0004\u0018\u00010&8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bH\u0010I\u0012\u0004\bJ\u0010\u0015R\u0014\u0010K\u001a\u00020&8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\bK\u0010IR\u001a\u0010M\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u0010\u001bR\u001c\u0010P\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010OR\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0013\u0010U\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0T8\u0002X\u0082\u0004R\u000b\u0010>\u001a\u00020=8\u0016X\u0096\u0005¨\u0006V"}, d2 = {"Lkotlinx/coroutines/internal/DispatchedContinuation;", "T", "Ley4;", "Lh84;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlin/coroutines/Continuation;", "Lz74;", "dispatcher", "continuation", "<init>", "(Lz74;Lkotlin/coroutines/Continuation;)V", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "", "isReusable$kotlinx_coroutines_core", "()Z", "isReusable", "Lqqg;", "awaitReusability$kotlinx_coroutines_core", "()V", "awaitReusability", "release$kotlinx_coroutines_core", "release", "Ll42;", "claimReusableCancellableContinuation$kotlinx_coroutines_core", "()Ll42;", "claimReusableCancellableContinuation", "Lk42;", "", "tryReleaseClaimedContinuation$kotlinx_coroutines_core", "(Lk42;)Ljava/lang/Throwable;", "tryReleaseClaimedContinuation", "cause", "postponeCancellation$kotlinx_coroutines_core", "(Ljava/lang/Throwable;)Z", "postponeCancellation", "", "takeState$kotlinx_coroutines_core", "()Ljava/lang/Object;", "takeState", "Lkpd;", "result", "resumeWith", "(Ljava/lang/Object;)V", "Lkotlin/Function1;", "onCancellation", "resumeCancellableWith$kotlinx_coroutines_core", "(Ljava/lang/Object;Lem6;)V", "resumeCancellableWith", "takenState", "cancelCompletedResult$kotlinx_coroutines_core", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "cancelCompletedResult", "state", "resumeCancelled$kotlinx_coroutines_core", "(Ljava/lang/Object;)Z", "resumeCancelled", "resumeUndispatchedWith$kotlinx_coroutines_core", "resumeUndispatchedWith", "Lx74;", "context", SdkMetricStatEvent.VALUE_KEY, "dispatchYield$kotlinx_coroutines_core", "(Lx74;Ljava/lang/Object;)V", "dispatchYield", "", "toString", "()Ljava/lang/String;", "Lz74;", "Lkotlin/coroutines/Continuation;", "_state", "Ljava/lang/Object;", "get_state$kotlinx_coroutines_core$annotations", "countOrElement", "getReusableCancellableContinuation", "reusableCancellableContinuation", "getCallerFrame", "()Lh84;", "callerFrame", "getDelegate$kotlinx_coroutines_core", "()Lkotlin/coroutines/Continuation;", "delegate", "Lkotlinx/atomicfu/AtomicRef;", "_reusableCancellableContinuation", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DispatchedContinuation<T> extends ey4 implements h84, Continuation<T> {
    private static final /* synthetic */ AtomicReferenceFieldUpdater _reusableCancellableContinuation$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(DispatchedContinuation.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public Object _state;
    public final Continuation<T> continuation;
    public final Object countOrElement;
    public final z74 dispatcher;

    /* JADX WARN: Multi-variable type inference failed */
    public DispatchedContinuation(z74 z74Var, Continuation<? super T> continuation) {
        super(-1);
        this.dispatcher = z74Var;
        this.continuation = continuation;
        this._state = DispatchedContinuationKt.UNDEFINED;
        this.countOrElement = ThreadContextKt.threadContextElements(getContext());
    }

    private final l42 getReusableCancellableContinuation() {
        Object obj = _reusableCancellableContinuation$volatile$FU.get(this);
        if (obj instanceof l42) {
            return (l42) obj;
        }
        return null;
    }

    private final /* synthetic */ Object get_reusableCancellableContinuation$volatile() {
        return this._reusableCancellableContinuation$volatile;
    }

    public static /* synthetic */ void get_state$kotlinx_coroutines_core$annotations() {
    }

    private final /* synthetic */ void loop$atomicfu(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, em6 em6Var) {
        while (true) {
            em6Var.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    private final /* synthetic */ void set_reusableCancellableContinuation$volatile(Object obj) {
        this._reusableCancellableContinuation$volatile = obj;
    }

    public final void awaitReusability$kotlinx_coroutines_core() {
        while (_reusableCancellableContinuation$volatile$FU.get(this) == DispatchedContinuationKt.REUSABLE_CLAIMED) {
        }
    }

    @Override // defpackage.ey4
    public void cancelCompletedResult$kotlinx_coroutines_core(Object takenState, Throwable cause) {
        if (takenState instanceof al3) {
            ((al3) takenState).b.invoke(cause);
        }
    }

    public final l42 claimReusableCancellableContinuation$kotlinx_coroutines_core() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _reusableCancellableContinuation$volatile$FU;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                _reusableCancellableContinuation$volatile$FU.set(this, DispatchedContinuationKt.REUSABLE_CLAIMED);
                return null;
            }
            if (obj instanceof l42) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _reusableCancellableContinuation$volatile$FU;
                Symbol symbol = DispatchedContinuationKt.REUSABLE_CLAIMED;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, symbol)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
                return (l42) obj;
            }
            if (obj != DispatchedContinuationKt.REUSABLE_CLAIMED && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final void dispatchYield$kotlinx_coroutines_core(x74 context, T value) {
        this._state = value;
        this.resumeMode = 1;
        this.dispatcher.dispatchYield(context, this);
    }

    @Override // defpackage.h84
    public h84 getCallerFrame() {
        Continuation<T> continuation = this.continuation;
        if (continuation instanceof h84) {
            return (h84) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public x74 getContext() {
        return this.continuation.getContext();
    }

    @Override // defpackage.ey4
    public Continuation<T> getDelegate$kotlinx_coroutines_core() {
        return this;
    }

    @Override // defpackage.h84
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    public final boolean isReusable$kotlinx_coroutines_core() {
        return _reusableCancellableContinuation$volatile$FU.get(this) != null;
    }

    public final boolean postponeCancellation$kotlinx_coroutines_core(Throwable cause) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _reusableCancellableContinuation$volatile$FU;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            Symbol symbol = DispatchedContinuationKt.REUSABLE_CLAIMED;
            if (fni.a(obj, symbol)) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _reusableCancellableContinuation$volatile$FU;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, symbol, cause)) {
                    if (atomicReferenceFieldUpdater2.get(this) != symbol) {
                        break;
                    }
                }
                return true;
            }
            if (obj instanceof Throwable) {
                return true;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = _reusableCancellableContinuation$volatile$FU;
            while (!atomicReferenceFieldUpdater3.compareAndSet(this, obj, null)) {
                if (atomicReferenceFieldUpdater3.get(this) != obj) {
                    break;
                }
            }
            return false;
        }
    }

    public final void release$kotlinx_coroutines_core() {
        awaitReusability$kotlinx_coroutines_core();
        l42 reusableCancellableContinuation = getReusableCancellableContinuation();
        if (reusableCancellableContinuation != null) {
            reusableCancellableContinuation.i();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007e A[Catch: all -> 0x0059, DONT_GENERATE, TryCatch #0 {all -> 0x0059, blocks: (B:11:0x0035, B:13:0x0043, B:15:0x0049, B:28:0x0081, B:18:0x005b, B:20:0x006b, B:25:0x0078, B:27:0x007e, B:33:0x008e, B:36:0x0097, B:35:0x0094, B:23:0x0071), top: B:43:0x0035, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void resumeCancellableWith$kotlinx_coroutines_core(java.lang.Object r7, defpackage.em6 r8) {
        /*
            r6 = this;
            java.lang.Object r8 = defpackage.d5j.b(r7, r8)
            z74 r0 = r6.dispatcher
            x74 r1 = r6.getContext()
            boolean r0 = r0.isDispatchNeeded(r1)
            r1 = 1
            if (r0 == 0) goto L1f
            r6._state = r8
            r6.resumeMode = r1
            z74 r7 = r6.dispatcher
            x74 r8 = r6.getContext()
            r7.mo13dispatch(r8, r6)
            return
        L1f:
            ki5 r0 = defpackage.r7g.a()
            boolean r2 = r0.Q()
            if (r2 == 0) goto L31
            r6._state = r8
            r6.resumeMode = r1
            r0.w(r6)
            return
        L31:
            r0.P(r1)
            r2 = 0
            x74 r3 = r6.getContext()     // Catch: java.lang.Throwable -> L59
            wha r4 = defpackage.wha.w0     // Catch: java.lang.Throwable -> L59
            v74 r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L59
            qt7 r3 = (defpackage.qt7) r3     // Catch: java.lang.Throwable -> L59
            if (r3 == 0) goto L5b
            boolean r4 = r3.isActive()     // Catch: java.lang.Throwable -> L59
            if (r4 != 0) goto L5b
            java.util.concurrent.CancellationException r7 = r3.getCancellationException()     // Catch: java.lang.Throwable -> L59
            r6.cancelCompletedResult$kotlinx_coroutines_core(r8, r7)     // Catch: java.lang.Throwable -> L59
            ipd r8 = new ipd     // Catch: java.lang.Throwable -> L59
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L59
            r6.resumeWith(r8)     // Catch: java.lang.Throwable -> L59
            goto L81
        L59:
            r7 = move-exception
            goto L98
        L5b:
            kotlin.coroutines.Continuation<T> r8 = r6.continuation     // Catch: java.lang.Throwable -> L59
            java.lang.Object r3 = r6.countOrElement     // Catch: java.lang.Throwable -> L59
            x74 r4 = r8.getContext()     // Catch: java.lang.Throwable -> L59
            java.lang.Object r3 = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(r4, r3)     // Catch: java.lang.Throwable -> L59
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.internal.ThreadContextKt.NO_THREAD_ELEMENTS     // Catch: java.lang.Throwable -> L59
            if (r3 == r5) goto L70
            lqg r8 = defpackage.z6j.d(r8, r4, r3)     // Catch: java.lang.Throwable -> L59
            goto L71
        L70:
            r8 = r2
        L71:
            kotlin.coroutines.Continuation<T> r5 = r6.continuation     // Catch: java.lang.Throwable -> L8b
            r5.resumeWith(r7)     // Catch: java.lang.Throwable -> L8b
            if (r8 == 0) goto L7e
            boolean r7 = r8.D()     // Catch: java.lang.Throwable -> L59
            if (r7 == 0) goto L81
        L7e:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r4, r3)     // Catch: java.lang.Throwable -> L59
        L81:
            boolean r7 = r0.h0()     // Catch: java.lang.Throwable -> L59
            if (r7 != 0) goto L81
        L87:
            r0.d(r1)
            goto L9c
        L8b:
            r7 = move-exception
            if (r8 == 0) goto L94
            boolean r8 = r8.D()     // Catch: java.lang.Throwable -> L59
            if (r8 == 0) goto L97
        L94:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r4, r3)     // Catch: java.lang.Throwable -> L59
        L97:
            throw r7     // Catch: java.lang.Throwable -> L59
        L98:
            r6.handleFatalException$kotlinx_coroutines_core(r7, r2)     // Catch: java.lang.Throwable -> L9d
            goto L87
        L9c:
            return
        L9d:
            r7 = move-exception
            r0.d(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.DispatchedContinuation.resumeCancellableWith$kotlinx_coroutines_core(java.lang.Object, em6):void");
    }

    public final boolean resumeCancelled$kotlinx_coroutines_core(Object state) {
        qt7 qt7Var = (qt7) getContext().get(wha.w0);
        if (qt7Var == null || qt7Var.isActive()) {
            return false;
        }
        CancellationException cancellationException = qt7Var.getCancellationException();
        cancelCompletedResult$kotlinx_coroutines_core(state, cancellationException);
        resumeWith(new ipd(cancellationException));
        return true;
    }

    public final void resumeUndispatchedWith$kotlinx_coroutines_core(Object result) {
        Continuation<T> continuation = this.continuation;
        Object obj = this.countOrElement;
        x74 context = continuation.getContext();
        Object objUpdateThreadContext = ThreadContextKt.updateThreadContext(context, obj);
        lqg lqgVarD = objUpdateThreadContext != ThreadContextKt.NO_THREAD_ELEMENTS ? z6j.d(continuation, context, objUpdateThreadContext) : null;
        try {
            this.continuation.resumeWith(result);
        } finally {
            if (lqgVarD == null || lqgVarD.D()) {
                ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
            }
        }
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object result) {
        x74 context = this.continuation.getContext();
        Object objB = d5j.b(result, null);
        if (this.dispatcher.isDispatchNeeded(context)) {
            this._state = objB;
            this.resumeMode = 0;
            this.dispatcher.mo13dispatch(context, this);
            return;
        }
        ki5 ki5VarA = r7g.a();
        if (ki5VarA.Q()) {
            this._state = objB;
            this.resumeMode = 0;
            ki5VarA.w(this);
            return;
        }
        ki5VarA.P(true);
        try {
            x74 context2 = getContext();
            Object objUpdateThreadContext = ThreadContextKt.updateThreadContext(context2, this.countOrElement);
            try {
                this.continuation.resumeWith(result);
                while (ki5VarA.h0()) {
                }
            } finally {
                ThreadContextKt.restoreThreadContext(context2, objUpdateThreadContext);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // defpackage.ey4
    public Object takeState$kotlinx_coroutines_core() {
        Object obj = this._state;
        this._state = DispatchedContinuationKt.UNDEFINED;
        return obj;
    }

    public String toString() {
        return "DispatchedContinuation[" + this.dispatcher + ", " + zg4.g(this.continuation) + ']';
    }

    public final Throwable tryReleaseClaimedContinuation$kotlinx_coroutines_core(k42 continuation) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _reusableCancellableContinuation$volatile$FU;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            Symbol symbol = DispatchedContinuationKt.REUSABLE_CLAIMED;
            if (obj == symbol) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _reusableCancellableContinuation$volatile$FU;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, symbol, continuation)) {
                    if (atomicReferenceFieldUpdater2.get(this) != symbol) {
                        break;
                    }
                }
                return null;
            }
            if (!(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = _reusableCancellableContinuation$volatile$FU;
            while (!atomicReferenceFieldUpdater3.compareAndSet(this, obj, null)) {
                if (atomicReferenceFieldUpdater3.get(this) != obj) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            return (Throwable) obj;
        }
    }
}
