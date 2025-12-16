package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final class kg0 {
    public final boolean d;
    public final boolean l;
    public boolean m;
    public boolean n;
    public double o;
    public double p;
    public final m8i a = new m8i();
    public final CopyOnWriteArraySet k = new CopyOnWriteArraySet();
    public final ha5 b = new ha5();
    public final ha5 c = new ha5();
    public final hk8 g = new hk8();
    public final hk8 h = new hk8();
    public final dq0 e = new dq0(8);
    public final dq0 f = new dq0(8);
    public final d9i i = new d9i();
    public final d9i j = new d9i();

    public kg0(boolean z, boolean z2) {
        this.l = z2;
        this.d = z;
    }

    public static boolean b(m8i m8iVar, double d, double d2, double d3, ig0 ig0Var) {
        if (d > d3 && d3 > 0.0d) {
            return m8iVar.a(ig0Var, true);
        }
        if (d >= d2 || d2 <= 0.0d) {
            return false;
        }
        return m8iVar.a(ig0Var, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [int] */
    public final void a() {
        boolean z;
        boolean z2;
        boolean z3;
        ig0 ig0Var;
        ig0 ig0Var2;
        boolean zA;
        ti1 ti1VarS;
        ig0 ig0Var3 = ig0.o;
        ig0 ig0Var4 = ig0.d;
        ig0 ig0Var5 = ig0.a;
        ig0 ig0Var6 = ig0.c;
        ig0 ig0Var7 = ig0.b;
        boolean z4 = this.a.b == 0;
        boolean zA2 = (this.n ? this.a.a(ig0Var5, this.m) : this.a.a(ig0Var5, false)) | b(this.a, this.b.b, this.i.a, this.j.a, ig0Var7) | b(this.a, this.c.b, this.i.b, this.j.b, ig0Var6);
        if (!this.l || Double.isNaN(this.o) || Double.isNaN(this.p)) {
            z = z4;
            z2 = true;
            z3 = false;
            ig0Var = ig0Var6;
            ig0Var2 = ig0Var7;
            zA = zA2 | this.a.a(ig0Var3, false) | this.a.a(ig0Var4, false);
        } else {
            z = z4;
            z3 = false;
            z2 = true;
            ig0Var = ig0Var6;
            ig0Var2 = ig0Var7;
            zA = b(this.a, this.p, this.i.b, this.j.b, ig0Var3) | zA2 | b(this.a, this.o, this.i.a, this.j.a, ig0Var4);
        }
        if (zA) {
            m8i m8iVar = this.a;
            boolean z5 = m8iVar.b == 0 ? z2 : z3;
            HashSet hashSet = new HashSet();
            ig0[] ig0VarArrValues = ig0.values();
            ?? r5 = z3;
            while (true) {
                boolean[] zArr = m8iVar.a;
                if (r5 >= zArr.length) {
                    break;
                }
                if (zArr[r5]) {
                    hashSet.add(ig0VarArrValues[r5]);
                }
                r5++;
            }
            Iterator it = this.k.iterator();
            while (it.hasNext()) {
                jg0 jg0Var = (jg0) it.next();
                if (z5 != z) {
                    if (z5) {
                        jg0Var.getClass();
                    } else {
                        jg0Var.getClass();
                    }
                }
                fai faiVar = (fai) jg0Var;
                k01 k01Var = faiVar.b;
                boolean z6 = k01Var.n.y.c.a;
                if (!k01Var.u && k01Var.o0.E(mdg.b) && !z6 && (ti1VarS = k01Var.s()) != null) {
                    if (!faiVar.a && (hashSet.contains(ig0Var2) || hashSet.contains(ig0Var))) {
                        faiVar.a = z2;
                        k01Var.k.i(pui.a(ti1VarS, z2));
                    } else if (faiVar.a && !hashSet.contains(ig0Var2) && !hashSet.contains(ig0Var)) {
                        faiVar.a = z3;
                        k01Var.k.i(pui.a(ti1VarS, z3));
                    }
                }
            }
        }
    }
}
