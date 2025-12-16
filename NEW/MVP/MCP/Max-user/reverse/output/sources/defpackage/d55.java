package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class d55 {
    public final int a;
    public final d99 b;
    public final CopyOnWriteArrayList c;

    public d55(CopyOnWriteArrayList copyOnWriteArrayList, int i, d99 d99Var) {
        this.c = copyOnWriteArrayList;
        this.a = i;
        this.b = d99Var;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [f55, java.lang.Object] */
    public final void a() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            c55 c55Var = (c55) it.next();
            zxg.a0(c55Var.a, new a55(this, c55Var.b, 2));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [f55, java.lang.Object] */
    public final void b() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            c55 c55Var = (c55) it.next();
            zxg.a0(c55Var.a, new a55(this, c55Var.b, 1));
        }
    }

    public final void c(int i) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            c55 c55Var = (c55) it.next();
            zxg.a0(c55Var.a, new mn1(this, c55Var.b, i, 9));
        }
    }

    public final void d(Exception exc) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            c55 c55Var = (c55) it.next();
            zxg.a0(c55Var.a, new cj(this, c55Var.b, exc, 24));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [f55, java.lang.Object] */
    public final void e() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            c55 c55Var = (c55) it.next();
            zxg.a0(c55Var.a, new a55(this, c55Var.b, 0));
        }
    }
}
