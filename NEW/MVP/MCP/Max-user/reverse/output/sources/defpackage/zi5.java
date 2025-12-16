package defpackage;

import java.util.concurrent.CancellationException;
import ru.ok.tamtam.exception.UncaughtIssueKeyException;

/* loaded from: classes2.dex */
public final class zi5 extends p0 implements a84 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: Illegal instructions before constructor call */
    public zi5(xw xwVar) {
        this.a = 2;
        u1j u1jVar = u1j.u0;
        this.b = xwVar;
        super(u1jVar);
    }

    @Override // defpackage.a84
    public final void i(x74 x74Var, Throwable th) {
        switch (this.a) {
            case 0:
                if (!(th instanceof CancellationException)) {
                    ((y3b) ((yi5) this.b)).a(new UncaughtIssueKeyException("ONEME-25589", x74Var + ". " + th.getMessage(), th));
                    break;
                }
                break;
            case 1:
                wqi.b("SingletonCoroutineExceptionHandler", x74Var.toString(), th);
                ((y3b) ((yi5) this.b)).a(th);
                break;
            default:
                xw xwVar = (xw) this.b;
                xwVar.c.u("failed " + x74Var + " with " + th + " @" + System.identityHashCode(xwVar));
                xwVar.g.i(x74Var, th);
                break;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zi5(yi5 yi5Var, int i) {
        this.a = i;
        switch (i) {
            case 1:
                u1j u1jVar = u1j.u0;
                this.b = yi5Var;
                super(u1jVar);
                break;
            default:
                u1j u1jVar2 = u1j.u0;
                this.b = yi5Var;
                super(u1jVar2);
                break;
        }
    }
}
