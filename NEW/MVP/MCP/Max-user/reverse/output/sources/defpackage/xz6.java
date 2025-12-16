package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class xz6 extends wl8 implements ms4 {
    public final Handler a;
    public final boolean b;
    public final xz6 c;

    public xz6(Handler handler, boolean z) {
        this.a = handler;
        this.b = z;
        this.c = z ? this : new xz6(handler, true);
    }

    public final void d(x74 x74Var, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        qt7 qt7Var = (qt7) x74Var.get(wha.w0);
        if (qt7Var != null) {
            qt7Var.cancel(cancellationException);
        }
        gy4.c.mo13dispatch(x74Var, runnable);
    }

    @Override // defpackage.ms4
    public final Object delay(long j, Continuation continuation) {
        return q8j.a(this, j, continuation);
    }

    @Override // defpackage.z74
    /* renamed from: dispatch */
    public final void mo13dispatch(x74 x74Var, Runnable runnable) {
        if (this.a.post(runnable)) {
            return;
        }
        d(x74Var, runnable);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xz6)) {
            return false;
        }
        xz6 xz6Var = (xz6) obj;
        return xz6Var.a == this.a && xz6Var.b == this.b;
    }

    @Override // defpackage.wl8
    public final wl8 getImmediate() {
        return this.c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.a) ^ (this.b ? 1231 : 1237);
    }

    @Override // defpackage.ms4
    public final sy4 invokeOnTimeout(long j, final Runnable runnable, x74 x74Var) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.a.postDelayed(runnable, j)) {
            return new sy4() { // from class: wz6
                @Override // defpackage.sy4
                public final void dispose() {
                    this.a.a.removeCallbacks(runnable);
                }
            };
        }
        d(x74Var, runnable);
        return iia.a;
    }

    @Override // defpackage.z74
    public final boolean isDispatchNeeded(x74 x74Var) {
        return (this.b && fni.a(Looper.myLooper(), this.a.getLooper())) ? false : true;
    }

    @Override // defpackage.ms4
    /* renamed from: scheduleResumeAfterDelay */
    public final void mo14scheduleResumeAfterDelay(long j, k42 k42Var) {
        zn6 zn6Var = new zn6(k42Var, 9, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.a.postDelayed(zn6Var, j)) {
            k42Var.e(new ia(this, 16, zn6Var));
        } else {
            d(k42Var.getContext(), zn6Var);
        }
    }

    @Override // defpackage.wl8, defpackage.z74
    public final String toString() {
        String stringInternalImpl = toStringInternalImpl();
        if (stringInternalImpl != null) {
            return stringInternalImpl;
        }
        String string = this.a.toString();
        return this.b ? az1.i(string, ".immediate") : string;
    }
}
