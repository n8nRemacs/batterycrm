package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class n3g extends wl8 implements ms4 {
    public m3g a;

    @Override // defpackage.ms4
    public final Object delay(long j, Continuation continuation) {
        return q8j.a(this, j, continuation);
    }

    @Override // defpackage.z74
    /* renamed from: dispatch */
    public final void mo13dispatch(x74 x74Var, Runnable runnable) {
        ((z74) this.a.a()).mo13dispatch(x74Var, runnable);
    }

    @Override // defpackage.z74
    public final void dispatchYield(x74 x74Var, Runnable runnable) {
        ((z74) this.a.a()).dispatchYield(x74Var, runnable);
    }

    @Override // defpackage.wl8
    public final wl8 getImmediate() {
        wl8 immediate;
        Object objA = this.a.a();
        wl8 wl8Var = objA instanceof wl8 ? (wl8) objA : null;
        return (wl8Var == null || (immediate = wl8Var.getImmediate()) == null) ? this : immediate;
    }

    @Override // defpackage.ms4
    public final sy4 invokeOnTimeout(long j, Runnable runnable, x74 x74Var) {
        Object objA = this.a.a();
        ms4 ms4Var = objA instanceof ms4 ? (ms4) objA : null;
        if (ms4Var == null) {
            ms4Var = lm4.a;
        }
        return ms4Var.invokeOnTimeout(j, runnable, x74Var);
    }

    @Override // defpackage.z74
    public final boolean isDispatchNeeded(x74 x74Var) {
        return ((z74) this.a.a()).isDispatchNeeded(x74Var);
    }

    @Override // defpackage.ms4
    /* renamed from: scheduleResumeAfterDelay */
    public final void mo14scheduleResumeAfterDelay(long j, k42 k42Var) {
        Object objA = this.a.a();
        ms4 ms4Var = objA instanceof ms4 ? (ms4) objA : null;
        if (ms4Var == null) {
            ms4Var = lm4.a;
        }
        ms4Var.mo14scheduleResumeAfterDelay(j, k42Var);
    }
}
