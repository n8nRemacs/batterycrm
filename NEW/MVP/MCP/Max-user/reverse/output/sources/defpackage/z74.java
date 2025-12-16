package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.LimitedDispatcher;
import kotlinx.coroutines.internal.LimitedDispatcherKt;

/* loaded from: classes.dex */
public abstract class z74 extends p0 implements r44 {
    public static final y74 Key = new y74(jbe.t0, new d73(12));

    public z74() {
        super(jbe.t0);
    }

    public static /* synthetic */ z74 limitedParallelism$default(z74 z74Var, int i, String str, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: limitedParallelism");
        }
        if ((i2 & 2) != 0) {
            str = null;
        }
        return z74Var.limitedParallelism(i, str);
    }

    /* renamed from: dispatch */
    public abstract void mo13dispatch(x74 x74Var, Runnable runnable);

    public void dispatchYield(x74 x74Var, Runnable runnable) {
        mo13dispatch(x74Var, runnable);
    }

    @Override // defpackage.p0, defpackage.x74
    public <E extends v74> E get(w74 w74Var) {
        boolean z;
        E e;
        if (!(w74Var instanceof y74)) {
            if (jbe.t0 == w74Var) {
                return this;
            }
            return null;
        }
        y74 y74Var = (y74) w74Var;
        w74 key = getKey();
        if (key != y74Var) {
            if (y74Var.b != key) {
                z = false;
            }
            if (!z && (e = (E) y74Var.a.invoke(this)) != null) {
                return e;
            }
        }
        y74Var.getClass();
        z = true;
        return !z ? null : null;
    }

    @Override // defpackage.r44
    public final <T> Continuation<T> interceptContinuation(Continuation<? super T> continuation) {
        return new DispatchedContinuation(this, continuation);
    }

    public boolean isDispatchNeeded(x74 x74Var) {
        return true;
    }

    public z74 limitedParallelism(int i, String str) {
        LimitedDispatcherKt.checkParallelism(i);
        return new LimitedDispatcher(this, i, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0021, code lost:
    
        if (((defpackage.v74) r3.a.invoke(r2)) != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0026, code lost:
    
        if (defpackage.jbe.t0 == r3) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002a, code lost:
    
        return defpackage.bd5.a;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0019  */
    @Override // defpackage.p0, defpackage.x74
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.x74 minusKey(defpackage.w74 r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof defpackage.y74
            if (r0 == 0) goto L24
            y74 r3 = (defpackage.y74) r3
            w74 r0 = r2.getKey()
            if (r0 == r3) goto L13
            w74 r1 = r3.b
            if (r1 != r0) goto L11
            goto L16
        L11:
            r0 = 0
            goto L17
        L13:
            r3.getClass()
        L16:
            r0 = 1
        L17:
            if (r0 == 0) goto L2b
            em6 r3 = r3.a
            java.lang.Object r3 = r3.invoke(r2)
            v74 r3 = (defpackage.v74) r3
            if (r3 == 0) goto L2b
            goto L28
        L24:
            jbe r0 = defpackage.jbe.t0
            if (r0 != r3) goto L2b
        L28:
            bd5 r3 = defpackage.bd5.a
            return r3
        L2b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z74.minusKey(w74):x74");
    }

    public final z74 plus(z74 z74Var) {
        return z74Var;
    }

    @Override // defpackage.r44
    public final void releaseInterceptedContinuation(Continuation<?> continuation) {
        ((DispatchedContinuation) continuation).release$kotlinx_coroutines_core();
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + zg4.a(this);
    }

    public /* synthetic */ z74 limitedParallelism(int i) {
        return limitedParallelism(i, null);
    }
}
