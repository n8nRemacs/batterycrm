package defpackage;

import android.content.Context;

/* loaded from: classes2.dex */
public final class jq {
    public final Context a;
    public final lk4 b;
    public final k18 c;
    public final k18 d;
    public final k18 e;
    public final k18 f;
    public final k18 g;
    public final k18 h;
    public final kw9 i;
    public final bwf j;
    public final bwf k;
    public final k18 l;
    public final k18 m;
    public final Object n;
    public final Object o;
    public final Object p;
    public final Object q;

    public jq(Context context, k18 k18Var, k18 k18Var2, g5i g5iVar, lk4 lk4Var, k18 k18Var3, k18 k18Var4, k18 k18Var5, k18 k18Var6, k18 k18Var7, k18 k18Var8, k18 k18Var9) {
        this.a = context;
        this.b = lk4Var;
        this.c = k18Var2;
        this.d = k18Var5;
        this.e = k18Var4;
        this.f = k18Var6;
        this.g = ((kw9) k18Var7.getValue()).a;
        ((kw9) k18Var7.getValue()).getClass();
        this.h = ((kw9) k18Var7.getValue()).b;
        this.i = (kw9) k18Var7.getValue();
        this.j = new bwf(new hq(this, 2));
        this.k = new bwf(new hq(this, 3));
        this.l = k18Var8;
        this.m = k18Var;
        this.n = ipi.b(2, new fq(context, this, lk4Var, g5iVar, k18Var9));
        this.o = ipi.b(2, new gq(context, this, lk4Var, 0));
        this.p = ipi.b(2, new gq(context, this, lk4Var, 1));
        this.q = ipi.b(2, new gq(this, lk4Var, context));
        ipi.b(2, new hq(this, lk4Var, context));
    }

    public final x7b a() {
        return (x7b) this.e.getValue();
    }

    public final boolean b() {
        if (!vma.a(a().i(false).b)) {
            int i = s65.d;
            long jH = v9j.h(7, y65.DAYS);
            pe8 pe8Var = ((z7c) this.m.getValue()).a;
            if (System.currentTimeMillis() - ((Number) pe8Var.y0.D(pe8Var, pe8.U0[12])).longValue() > s65.g(jH)) {
                return true;
            }
        }
        return false;
    }
}
