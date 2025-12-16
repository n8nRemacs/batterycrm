package defpackage;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class bdf implements Runnable {
    public final AtomicInteger a = new AtomicInteger(0);
    public final hj0 b;
    public final rac c;
    public final oac d;
    public final String o;

    public bdf(hj0 hj0Var, rac racVar, oac oacVar, String str) {
        this.b = hj0Var;
        this.c = racVar;
        this.d = oacVar;
        this.o = str;
        racVar.j(oacVar, str);
    }

    public final void a() {
        if (this.a.compareAndSet(0, 2)) {
            e();
        }
    }

    public abstract void b(Object obj);

    public Map c(Object obj) {
        return null;
    }

    public abstract Object d();

    public void e() {
        rac racVar = this.c;
        oac oacVar = this.d;
        String str = this.o;
        racVar.i(oacVar, str);
        racVar.k(oacVar, str);
        this.b.c();
    }

    public void f(Exception exc) {
        rac racVar = this.c;
        oac oacVar = this.d;
        String str = this.o;
        racVar.i(oacVar, str);
        racVar.d(oacVar, str, exc, null);
        this.b.e(exc);
    }

    public void g(Object obj) {
        rac racVar = this.c;
        oac oacVar = this.d;
        String str = this.o;
        racVar.a(oacVar, str, racVar.i(oacVar, str) ? c(obj) : null);
        this.b.g(1, obj);
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicInteger atomicInteger = this.a;
        if (atomicInteger.compareAndSet(0, 1)) {
            try {
                Object objD = d();
                atomicInteger.set(3);
                try {
                    g(objD);
                } finally {
                    b(objD);
                }
            } catch (Exception e) {
                atomicInteger.set(4);
                f(e);
            }
        }
    }
}
