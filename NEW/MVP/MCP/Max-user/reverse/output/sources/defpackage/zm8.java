package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class zm8 {
    public final ve2 a;
    public final j0e b;
    public final j0e c;
    public final o0g d;
    public final tw0 e;
    public final d1g f;
    public final yi5 g;
    public final long h;
    public rm8 i;
    public w08 j;
    public qu1 k;
    public qu1 l;
    public qu1 m;
    public String r;
    public final rl t;
    public ArrayList n = new ArrayList();
    public volatile List o = new ArrayList();
    public final ArrayList p = new ArrayList();
    public final ArrayList q = new ArrayList();
    public String s = "";

    public zm8(ve2 ve2Var, qv3 qv3Var, o7e o7eVar, v04 v04Var, j0e j0eVar, j0e j0eVar2, o0g o0gVar, tw0 tw0Var, d1g d1gVar, yi5 yi5Var, age ageVar) {
        this.a = ve2Var;
        this.b = j0eVar2;
        this.c = j0eVar;
        this.d = o0gVar;
        this.e = tw0Var;
        this.f = d1gVar;
        this.g = yi5Var;
        this.h = qv3Var.i(qv3Var.g.a.s(), false).p();
        this.t = new rl(5, new vm8(ve2Var, qv3Var, v04Var, o7eVar, ageVar));
    }

    public final void a() {
        if (!bwd.c(this.j)) {
            w08 w08Var = this.j;
            w08Var.getClass();
            fof.a(w08Var);
            try {
                this.e.f(this);
            } catch (Exception unused) {
            }
        }
        this.n.clear();
        this.r = null;
        this.s = "";
    }

    public final void b() {
        if (!bwd.c(this.k)) {
            qu1 qu1Var = this.k;
            qu1Var.getClass();
            ty4.a(qu1Var);
            try {
                this.e.f(this);
            } catch (Exception unused) {
            }
        }
        this.p.clear();
        this.o.clear();
    }

    public final void c() {
        wqi.c("zm8", "clear", new Object[0]);
        a();
        b();
        if (!bwd.c(this.l)) {
            qu1 qu1Var = this.l;
            qu1Var.getClass();
            ty4.a(qu1Var);
        }
        this.q.clear();
        this.s = "";
    }

    public final u2f d(String str) {
        zf8 zf8Var = new zf8(0L, str, 5);
        u0g u0gVar = (u0g) this.d;
        u0gVar.getClass();
        wk3 wk3Var = new wk3(2, new z9a(u0gVar, 29, zf8Var));
        j0e j0eVar = this.c;
        return new m2f(new m2f(wk3Var.i(j0eVar).h(new sm8(this, 2)).h(new zb8(6)), new sm8(this, 3), 0), new zb8(7), 2).m(j0eVar);
    }

    @vnf
    public void onEvent(n73 n73Var) {
        Iterator it = this.n.iterator();
        while (it.hasNext()) {
            pb2 pb2Var = ((u6e) it.next()).d;
            if (pb2Var != null && n73Var.b.contains(Long.valueOf(pb2Var.a))) {
                bwd.b(this.m);
                this.m = bwd.a(new gk0(7, this), new zb8(14), this.c);
                return;
            }
        }
    }
}
