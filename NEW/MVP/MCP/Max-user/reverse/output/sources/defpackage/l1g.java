package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import ru.ok.tamtam.errors.TamErrorException;

/* loaded from: classes2.dex */
public final class l1g implements j1g {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final /* synthetic */ l42 b;

    public l1g(l42 l42Var) {
        this.b = l42Var;
    }

    @Override // defpackage.j1g
    public final void d(l0g l0gVar) {
        l42 l42Var = this.b;
        if (l42Var.r() && this.a.compareAndSet(false, true)) {
            l42Var.resumeWith(l0gVar);
        }
    }

    @Override // defpackage.j1g
    public final void e(pzf pzfVar) {
        l42 l42Var = this.b;
        if (l42Var.r() && this.a.compareAndSet(false, true)) {
            l42Var.resumeWith(new ipd(new TamErrorException(pzfVar)));
        }
    }
}
