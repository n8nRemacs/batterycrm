package defpackage;

import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.internal.ScopeCoroutine;

/* loaded from: classes.dex */
public final class v9g extends ScopeCoroutine implements Runnable {
    public final long a;

    public v9g(long j, q44 q44Var) {
        super(q44Var.getContext(), q44Var);
        this.a = j;
    }

    @Override // defpackage.o0, defpackage.su7
    public final String nameString$kotlinx_coroutines_core() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.nameString$kotlinx_coroutines_core());
        sb.append("(timeMillis=");
        return utb.l(sb, this.a, ')');
    }

    @Override // java.lang.Runnable
    public final void run() {
        s8j.e(getContext());
        cancelCoroutine(new TimeoutCancellationException("Timed out waiting for " + this.a + " ms", this));
    }
}
