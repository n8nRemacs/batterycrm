package defpackage;

import kotlinx.coroutines.internal.ContextScope;
import org.apache.http.HttpStatus;

/* loaded from: classes2.dex */
public abstract class ej0 {
    public final jve a = kve.b(0, 0, 7);
    public final ContextScope b;

    public ej0(lzf lzfVar) {
        this.b = d7j.a(((q2b) lzfVar).a());
    }

    public final void a(r03 r03Var) {
        svi.e(this.b, null, null, new dj0(this, r03Var, null), 3);
    }

    public final y83 b() {
        int i = s65.d;
        return zs0.a(this.a, v9j.h(HttpStatus.SC_MULTIPLE_CHOICES, y65.MILLISECONDS), new cj0(0));
    }
}
