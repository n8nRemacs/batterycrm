package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public abstract class jae {
    public final jy0 a;
    public final xmb b;
    public long d;
    public Executor c = new es(2);
    public long e = -9223372036854775807L;

    public jae(jy0 jy0Var, xmb xmbVar) {
        this.a = jy0Var;
        this.b = xmbVar;
    }

    public abstract nae a(k09 k09Var);

    public abstract jae b(long j);

    public abstract jae c(ExecutorService executorService);

    public abstract jae d(long j);
}
