package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class p3f extends e2f {
    public final m2f a;
    public final long b;
    public final j0e c;

    public p3f(m2f m2fVar, long j, j0e j0eVar) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.a = m2fVar;
        this.b = j;
        this.c = j0eVar;
    }

    @Override // defpackage.e2f
    public final void l(v2f v2fVar) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long j = this.b;
        jra jraVar = new jra(v2fVar, j);
        v2fVar.c(jraVar);
        ty4.d((AtomicReference) jraVar.d, this.c.c(jraVar, j, timeUnit));
        this.a.k(jraVar);
    }
}
