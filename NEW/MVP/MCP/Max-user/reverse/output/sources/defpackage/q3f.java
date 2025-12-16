package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class q3f extends e2f {
    public final long a;
    public final j0e b;

    public q3f(long j, j0e j0eVar) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.a = j;
        this.b = j0eVar;
    }

    @Override // defpackage.e2f
    public final void l(v2f v2fVar) {
        sta staVar = new sta(1, v2fVar);
        v2fVar.c(staVar);
        ty4.d(staVar, this.b.c(staVar, this.a, TimeUnit.MILLISECONDS));
    }
}
