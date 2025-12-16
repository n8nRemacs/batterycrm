package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class tta extends vqa {
    public final j0e a;
    public final long b;
    public final TimeUnit c;

    public tta(long j, TimeUnit timeUnit, j0e j0eVar) {
        this.b = j;
        this.c = timeUnit;
        this.a = j0eVar;
    }

    @Override // defpackage.vqa
    public final void o(vta vtaVar) {
        sta staVar = new sta(0, vtaVar);
        vtaVar.c(staVar);
        py4 py4VarC = this.a.c(staVar, this.b, this.c);
        while (!staVar.compareAndSet(null, py4VarC)) {
            if (staVar.get() != null) {
                if (staVar.get() == ty4.a) {
                    py4VarC.dispose();
                    return;
                }
                return;
            }
        }
    }
}
