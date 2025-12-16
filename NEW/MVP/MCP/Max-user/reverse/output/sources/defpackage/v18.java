package defpackage;

import java.util.TreeSet;

/* loaded from: classes.dex */
public final class v18 {
    public final TreeSet a = new TreeSet(new ov5(6));
    public long b;

    public final void a(fy0 fy0Var, long j) {
        while (this.b + j > 104857600 && !this.a.isEmpty()) {
            wy0 wy0Var = (wy0) this.a.first();
            a1f a1fVar = (a1f) fy0Var;
            synchronized (a1fVar) {
                a1fVar.j(wy0Var);
            }
        }
    }

    public final void b(a1f a1fVar, d1f d1fVar) {
        this.a.add(d1fVar);
        this.b += d1fVar.c;
        a(a1fVar, 0L);
    }
}
