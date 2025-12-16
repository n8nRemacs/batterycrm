package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class psa extends vqa {
    public final j0e a;
    public final long b;
    public final long c;
    public final TimeUnit d;

    public psa(long j, long j2, TimeUnit timeUnit, j0e j0eVar) {
        this.b = j;
        this.c = j2;
        this.d = timeUnit;
        this.a = j0eVar;
    }

    @Override // defpackage.vqa
    public final void o(vta vtaVar) {
        osa osaVar = new osa(vtaVar);
        vtaVar.c(osaVar);
        j0e j0eVar = this.a;
        if (!(j0eVar instanceof qgg)) {
            ty4.h(osaVar, j0eVar.d(osaVar, this.b, this.c, this.d));
        } else {
            ((qgg) j0eVar).getClass();
            pgg pggVar = new pgg();
            ty4.h(osaVar, pggVar);
            pggVar.d(osaVar, this.b, this.c, this.d);
        }
    }
}
