package defpackage;

import android.util.Pair;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;

/* loaded from: classes.dex */
public final class q29 {
    public final Object a;
    public final Object b;
    public final ixd[] c;
    public boolean d;
    public boolean e;
    public t29 f;
    public boolean g;
    public final boolean[] h;
    public final sk0[] i;
    public final no8 j;
    public final y87 k;
    public q29 l;
    public mfg m;
    public ggg n;
    public long o;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [ac3] */
    public q29(sk0[] sk0VarArr, long j, no8 no8Var, qi4 qi4Var, y87 y87Var, t29 t29Var, ggg gggVar) {
        this.i = sk0VarArr;
        this.o = j;
        this.j = no8Var;
        this.k = y87Var;
        c99 c99Var = t29Var.a;
        this.b = c99Var.a;
        this.f = t29Var;
        this.m = mfg.d;
        this.n = gggVar;
        this.c = new ixd[sk0VarArr.length];
        this.h = new boolean[sk0VarArr.length];
        long j2 = t29Var.b;
        long j3 = t29Var.d;
        y87Var.getClass();
        Pair pair = (Pair) c99Var.a;
        Object obj = pair.first;
        c99 c99VarB = c99Var.b(pair.second);
        y99 y99Var = (y99) ((HashMap) y87Var.c).get(obj);
        y99Var.getClass();
        ((HashSet) y87Var.l).add(y99Var);
        w99 w99Var = (w99) ((HashMap) y87Var.d).get(y99Var);
        if (w99Var != null) {
            w99Var.a.d(w99Var.b);
        }
        y99Var.c.add(c99VarB);
        op8 op8VarA = y99Var.a.a(c99VarB, qi4Var, j2);
        ((IdentityHashMap) y87Var.h).put(op8VarA, y99Var);
        y87Var.h();
        this.a = j3 != -9223372036854775807L ? new ac3(op8VarA, true, 0L, j3) : op8VarA;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, o29] */
    public final long a(ggg gggVar, long j, boolean z, boolean[] zArr) {
        sk0[] sk0VarArr;
        ixd[] ixdVarArr;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= gggVar.b) {
                break;
            }
            if (z || !gggVar.Q(this.n, i)) {
                z2 = false;
            }
            this.h[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            sk0VarArr = this.i;
            int length = sk0VarArr.length;
            ixdVarArr = this.c;
            if (i2 >= length) {
                break;
            }
            if (sk0VarArr[i2].a == -2) {
                ixdVarArr[i2] = null;
            }
            i2++;
        }
        b();
        this.n = gggVar;
        c();
        long jE = this.a.E((an5[]) gggVar.o, this.h, this.c, zArr, j);
        for (int i3 = 0; i3 < sk0VarArr.length; i3++) {
            if (sk0VarArr[i3].a == -2 && this.n.S(i3)) {
                ixdVarArr[i3] = new md5();
            }
        }
        this.e = false;
        for (int i4 = 0; i4 < ixdVarArr.length; i4++) {
            if (ixdVarArr[i4] != null) {
                fsi.d(gggVar.S(i4));
                if (sk0VarArr[i4].a != -2) {
                    this.e = true;
                }
            } else {
                fsi.d(((an5[]) gggVar.o)[i4] == null);
            }
        }
        return jE;
    }

    public final void b() {
        if (this.l != null) {
            return;
        }
        int i = 0;
        while (true) {
            ggg gggVar = this.n;
            if (i >= gggVar.b) {
                return;
            }
            boolean zS = gggVar.S(i);
            an5 an5Var = ((an5[]) this.n.o)[i];
            if (zS && an5Var != null) {
                an5Var.h();
            }
            i++;
        }
    }

    public final void c() {
        if (this.l != null) {
            return;
        }
        int i = 0;
        while (true) {
            ggg gggVar = this.n;
            if (i >= gggVar.b) {
                return;
            }
            boolean zS = gggVar.S(i);
            an5 an5Var = ((an5[]) this.n.o)[i];
            if (zS && an5Var != null) {
                an5Var.e();
            }
            i++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [iee, java.lang.Object] */
    public final long d() {
        if (!this.d) {
            return this.f.b;
        }
        long jO = this.e ? this.a.o() : Long.MIN_VALUE;
        return jO == Long.MIN_VALUE ? this.f.e : jO;
    }

    public final long e() {
        return this.f.b + this.o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o29] */
    public final void f() {
        b();
        ?? r0 = this.a;
        try {
            boolean z = r0 instanceof ac3;
            y87 y87Var = this.k;
            if (z) {
                y87Var.r(((ac3) r0).a);
            } else {
                y87Var.r(r0);
            }
        } catch (RuntimeException e) {
            pai.c("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:222:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0629  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ggg g(float r36, defpackage.r9g r37) {
        /*
            Method dump skipped, instructions count: 1786
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q29.g(float, r9g):ggg");
    }

    public final void h() {
        Object obj = this.a;
        if (obj instanceof ac3) {
            long j = this.f.d;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            ac3 ac3Var = (ac3) obj;
            ac3Var.o = 0L;
            ac3Var.X = j;
        }
    }
}
