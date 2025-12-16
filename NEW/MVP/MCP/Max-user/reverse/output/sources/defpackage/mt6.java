package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class mt6 implements mf8 {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final /* synthetic */ l42 b;

    public mt6(l42 l42Var) {
        this.b = l42Var;
    }

    @Override // defpackage.mf8
    public final void E() {
        l42 l42Var = this.b;
        if (l42Var.r() && this.a.compareAndSet(false, true)) {
            l42Var.resumeWith(null);
        }
    }

    @Override // defpackage.mf8
    public final void P(cf8 cf8Var) {
        l42 l42Var = this.b;
        if (l42Var.r() && this.a.compareAndSet(false, true)) {
            l42Var.resumeWith(cf8Var);
        }
    }
}
