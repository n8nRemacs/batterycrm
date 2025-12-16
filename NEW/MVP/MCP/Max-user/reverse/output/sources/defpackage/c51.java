package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class c51 implements s41 {
    public static final /* synthetic */ yy7[] o;
    public final sv1 a;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final k18 e;
    public final k18 f;
    public final k18 g;
    public final k18 h;
    public final tcf i;
    public final tcf j;
    public final bwf k;
    public final t9f l;
    public x9f m;
    public x9f n;

    static {
        z8a z8aVar = new z8a(c51.class, "observeJob", "getObserveJob()Lkotlinx/coroutines/Job;");
        vid.a.getClass();
        o = new yy7[]{z8aVar};
    }

    public c51(sv1 sv1Var, k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5, k18 k18Var6, k18 k18Var7) {
        this.a = sv1Var;
        this.b = k18Var;
        this.c = k18Var2;
        this.d = k18Var3;
        this.e = k18Var4;
        this.f = k18Var5;
        this.g = k18Var6;
        this.h = k18Var7;
        tcf tcfVarA = ucf.a(n41.h);
        this.i = tcfVarA;
        this.j = tcfVarA;
        this.k = new bwf(new nz(k18Var4, 2));
        this.l = c7j.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.CharSequence] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.c51 r18, defpackage.k58 r19, defpackage.q44 r20) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c51.a(c51, k58, q44):java.lang.Object");
    }

    public final w63 b() {
        return (w63) this.b.getValue();
    }

    public final x9f c(pn6 pn6Var, boolean z) {
        int i = s65.d;
        return svi.e(this.a, null, i84.b, new r36(gw0.u(new m36(new g56(new d53(new g56(zs0.g(pn6Var, v9j.h(1, y65.SECONDS)), new u41(this, null), 1), 12), new v41(this, z, null), 1), new w41(3, null, 0)), (z74) this.k.getValue()), null), 1);
    }

    public final void d(String str, boolean z) {
        x9f x9fVar = this.n;
        if (x9fVar != null) {
            x9fVar.cancel((CancellationException) null);
        }
        x9f x9fVar2 = this.m;
        if (x9fVar2 == null || !x9fVar2.isActive()) {
            this.m = svi.e(this.a, ((q2b) ((lzf) this.e.getValue())).b(), null, new x41(this, str, z, null), 2);
        }
    }
}
