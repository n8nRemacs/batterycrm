package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final /* synthetic */ class tu0 implements uu1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicReference b;

    public /* synthetic */ tu0(AtomicReference atomicReference, int i) {
        this.a = i;
        this.b = atomicReference;
    }

    @Override // defpackage.uu1
    public final String m(tu1 tu1Var) {
        switch (this.a) {
            case 0:
                this.b.set(tu1Var);
                return "Data closed";
            case 1:
                this.b.set(new wz1(0, tu1Var));
                return "OnScreenFlashUiApplied";
            case 2:
                this.b.set(tu1Var);
                return "Data closed";
            case 3:
                this.b.set(tu1Var);
                return "acquireInputBuffer";
            case 4:
                this.b.set(tu1Var);
                return "mReleasedFuture";
            default:
                this.b.set(tu1Var);
                return "Terminate InputBuffer";
        }
    }
}
