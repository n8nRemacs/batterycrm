package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class wr3 implements tr3 {
    public final /* synthetic */ ur3 a;
    public final /* synthetic */ l42 b;
    public final /* synthetic */ AtomicBoolean c;

    public wr3(ur3 ur3Var, l42 l42Var, AtomicBoolean atomicBoolean) {
        this.a = ur3Var;
        this.b = l42Var;
        this.c = atomicBoolean;
    }

    @Override // defpackage.tr3
    public final void a() {
        ur3 ur3Var = this.a;
        if (ur3Var.f()) {
            ur3Var.e(this);
            l42 l42Var = this.b;
            if (l42Var.r() && this.c.compareAndSet(false, true)) {
                l42Var.resumeWith(qqg.a);
            }
        }
    }

    @Override // defpackage.tr3
    public final void b() {
        ur3 ur3Var = this.a;
        if (ur3Var.f()) {
            ur3Var.e(this);
            l42 l42Var = this.b;
            if (l42Var.r() && this.c.compareAndSet(false, true)) {
                l42Var.resumeWith(qqg.a);
            }
        }
    }
}
