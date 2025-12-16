package defpackage;

import java.util.TreeSet;

/* loaded from: classes.dex */
public final class w18 implements ny0 {
    public final long a;
    public final TreeSet b = new TreeSet(new ov5(7));
    public long c;

    public w18(long j) {
        this.a = j;
    }

    @Override // defpackage.ny0
    public final void a(b1f b1fVar, e1f e1fVar) {
        this.b.add(e1fVar);
        this.c += e1fVar.c;
        e(b1fVar, 0L);
    }

    @Override // defpackage.ny0
    public final void b(ey0 ey0Var, String str, long j, long j2) {
        if (j2 != -1) {
            e(ey0Var, j2);
        }
    }

    @Override // defpackage.ny0
    public final void c(b1f b1fVar, e1f e1fVar, e1f e1fVar2) {
        d(b1fVar, e1fVar);
        a(b1fVar, e1fVar2);
    }

    @Override // defpackage.ny0
    public final void d(b1f b1fVar, xy0 xy0Var) {
        this.b.remove(xy0Var);
        this.c -= xy0Var.c;
    }

    public final void e(ey0 ey0Var, long j) {
        while (this.c + j > this.a && !this.b.isEmpty()) {
            xy0 xy0Var = (xy0) this.b.first();
            b1f b1fVar = (b1f) ey0Var;
            synchronized (b1fVar) {
                b1fVar.m(xy0Var);
            }
        }
    }
}
