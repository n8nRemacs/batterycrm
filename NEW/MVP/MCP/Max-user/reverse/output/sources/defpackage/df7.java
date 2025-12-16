package defpackage;

import android.net.Uri;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class df7 {
    public static final CancellationException l = new CancellationException("Prefetching is not enabled");
    public final uac a;
    public final brf b;
    public final brf c;
    public final th6 d;
    public final sh6 e;
    public final jf9 f;
    public final jf9 g;
    public final kk4 h;
    public final brf i;
    public final AtomicLong j = new AtomicLong();
    public final ff7 k;

    static {
        new CancellationException("ImageRequest is null");
        new CancellationException("Modified URL is null");
    }

    public df7(uac uacVar, Set set, Set set2, brf brfVar, lo7 lo7Var, lo7 lo7Var2, brf brfVar2, kk4 kk4Var, lx4 lx4Var, ff7 ff7Var) {
        this.a = uacVar;
        this.b = brfVar;
        this.c = brfVar2;
        this.d = new th6(set);
        this.e = new sh6(set2);
        this.f = lo7Var;
        this.g = lo7Var2;
        this.h = kk4Var;
        this.i = lx4Var;
        this.k = ff7Var;
    }

    public final r0 a(rf7 rf7Var, Object obj, qf7 qf7Var, th6 th6Var, String str) {
        if (rf7Var == null) {
            return b8j.a(new NullPointerException());
        }
        try {
            uac uacVar = this.a;
            uacVar.getClass();
            y6c y6cVar = rf7Var.o;
            ml6.i();
            nac nacVarA = uacVar.a(rf7Var);
            if (y6cVar != null) {
                nacVarA = uacVar.e(nacVarA);
            }
            if (qf7Var == null) {
                qf7Var = qf7.FULL_FETCH;
            }
            return g(nacVarA, rf7Var, qf7Var, obj, th6Var, str);
        } catch (Exception e) {
            return b8j.a(e);
        }
    }

    public final pe4 b(rf7 rf7Var, Object obj) {
        return a(rf7Var, obj, null, null, null);
    }

    public final r0 c(rf7 rf7Var) {
        if (rf7Var.b == null) {
            throw new IllegalStateException("Required value was null.");
        }
        try {
            nac nacVarC = this.a.c(rf7Var);
            if (rf7Var.h != null) {
                sf7 sf7VarB = sf7.b(rf7Var);
                sf7VarB.d = null;
                rf7Var = sf7VarB.a();
            }
            return g(nacVarC, rf7Var, qf7.FULL_FETCH, null, null, null);
        } catch (Exception e) {
            return b8j.a(e);
        }
    }

    public final th6 d(rf7 rf7Var, fnd fndVar) {
        if (rf7Var == null) {
            throw new IllegalStateException("Required value was null.");
        }
        uk0 uk0Var = rf7Var.p;
        th6 th6Var = this.d;
        return fndVar == null ? uk0Var == null ? th6Var : new th6(th6Var, uk0Var) : uk0Var == null ? new th6(th6Var, fndVar) : new th6(th6Var, fndVar, uk0Var);
    }

    public final r0 e(rf7 rf7Var, c0a c0aVar) {
        nac nacVarB;
        m9c m9cVar = m9c.b;
        brf brfVar = this.i;
        ff7 ff7Var = this.k;
        CancellationException cancellationException = l;
        brf brfVar2 = this.b;
        uac uacVar = this.a;
        ml6.i();
        if (!((Boolean) brfVar2.get()).booleanValue()) {
            return b8j.a(cancellationException);
        }
        try {
            ff7Var.w.getClass();
            if (rf7Var == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (((Boolean) brfVar.get()).booleanValue()) {
                nacVarB = uacVar.b(rf7Var);
            } else {
                nac nacVarA = uacVar.a(rf7Var);
                synchronized (uacVar) {
                    nac t9Var = (nac) uacVar.k.get(nacVarA);
                    if (t9Var == null) {
                        uacVar.b.getClass();
                        t9Var = new t9(nacVarA, 2);
                        uacVar.k.put(nacVarA, t9Var);
                    }
                    nacVarB = t9Var;
                }
            }
            return h(nacVarB, rf7Var, c0aVar, m9cVar);
        } catch (Exception e) {
            return b8j.a(e);
        }
    }

    public final r0 f(rf7 rf7Var) {
        m9c m9cVar = m9c.c;
        if (!((Boolean) this.b.get()).booleanValue()) {
            return b8j.a(l);
        }
        if (rf7Var == null) {
            return b8j.a(new NullPointerException("imageRequest is null"));
        }
        try {
            return h(this.a.b(rf7Var), rf7Var, null, m9cVar);
        } catch (Exception e) {
            return b8j.a(e);
        }
    }

    public final r0 g(nac nacVar, rf7 rf7Var, qf7 qf7Var, Object obj, fnd fndVar, String str) {
        ml6.i();
        qp7 qp7Var = new qp7(d(rf7Var, fndVar), this.e);
        try {
            qf7 qf7Var2 = rf7Var.k;
            kke kkeVar = new kke(rf7Var, String.valueOf(this.j.getAndIncrement()), str, qp7Var, obj, qf7Var2.a > qf7Var.a ? qf7Var2 : qf7Var, false, !mwg.d(rf7Var.b), rf7Var.j, this.k);
            ml6.i();
            tc3 tc3Var = new tc3(nacVar, kkeVar, qp7Var, 0);
            ml6.i();
            return tc3Var;
        } catch (Exception e) {
            return b8j.a(e);
        }
    }

    public final r0 h(nac nacVar, rf7 rf7Var, Object obj, m9c m9cVar) throws NumberFormatException {
        qp7 qp7Var = new qp7(d(rf7Var, null), this.e);
        Uri uri = rf7Var.b;
        if (!uri.equals(uri)) {
            sf7 sf7VarB = sf7.b(rf7Var);
            sf7VarB.a = uri;
            rf7Var = sf7VarB.a();
        }
        rf7 rf7Var2 = rf7Var;
        try {
            qf7 qf7Var = rf7Var2.k;
            if (qf7Var.a <= 1) {
                qf7Var = qf7.FULL_FETCH;
            }
            qf7 qf7Var2 = qf7Var;
            String strValueOf = String.valueOf(this.j.getAndIncrement());
            ff7 ff7Var = this.k;
            pea peaVar = ff7Var.w;
            return new tc3(nacVar, new kke(rf7Var2, strValueOf, null, qp7Var, obj, qf7Var2, true, false, m9cVar, ff7Var), qp7Var, 1);
        } catch (Exception e) {
            return b8j.a(e);
        }
    }
}
