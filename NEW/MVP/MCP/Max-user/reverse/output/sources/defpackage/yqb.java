package defpackage;

import android.os.SystemClock;
import java.util.UUID;
import one.me.sdk.statistics.perf.utils.ExplicitTimeInNonLazyRegistrarException;
import one.me.sdk.statistics.perf.utils.ImplicitTimeInLazyRegistrarException;

/* loaded from: classes2.dex */
public abstract class yqb {
    public jqb a;
    public final String b = getClass().getName();
    public final c9a c;
    public final c9a d;
    public final c9a e;
    public final jve f;

    public yqb(jqb jqbVar) {
        this.a = jqbVar;
        long[] jArr = fzd.a;
        this.c = new c9a();
        this.d = new c9a();
        this.e = new c9a();
        this.f = kve.a(this.a.c ? 10 : 1, Integer.MAX_VALUE, 2);
        if (this.a.c) {
            return;
        }
        n();
    }

    public static void b(yqb yqbVar, String str, w8a w8aVar, c9a c9aVar) {
        yqbVar.f.h(new pqb(str, c9aVar, w8aVar));
    }

    public static void c(yqb yqbVar, String str, int i, String str2, int i2) {
        boolean z = (i2 & 8) == 0;
        c9a c9aVar = fzd.b;
        lg8 lg8Var = lg8.X;
        if (yqbVar.a.c) {
            String str3 = yqbVar.b;
            l6b l6bVar = wqi.a;
            if (l6bVar != null && l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str3, wy1.j("Metric(", yqbVar.g(), "-", str2, "): Trying to add span to metric in lazy mode without implicit sliceTime!"), null);
            }
            yqbVar.a.a(new ImplicitTimeInLazyRegistrarException(wy1.i("Adding span to metric=", yqbVar.g(), ", span=", str)));
        }
        jve jveVar = yqbVar.f;
        if (yqbVar.a.d == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        jveVar.h(new qqb(str2, str, i, SystemClock.elapsedRealtime(), z, c9aVar));
    }

    public static void e(yqb yqbVar, lqb lqbVar, String str) {
        yqbVar.f.h(new oqb(str, lqbVar, fzd.b));
    }

    public static String l(yqb yqbVar, String str, c9a c9aVar, Long l, int i) {
        long jElapsedRealtime;
        if ((i & 1) != 0) {
            str = UUID.randomUUID().toString();
        }
        if ((i & 2) != 0) {
            c9aVar = fzd.b;
        }
        if ((i & 4) != 0) {
            l = null;
        }
        lg8 lg8Var = lg8.X;
        boolean z = yqbVar.a.c;
        if (z && l == null) {
            String str2 = yqbVar.b;
            l6b l6bVar = wqi.a;
            if (l6bVar != null && l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str2, wy1.j("Metric(", yqbVar.g(), "-", str, "): Trying to start metric in lazy mode without implicit sliceTime!"), null);
            }
            yqbVar.a.a(new ImplicitTimeInLazyRegistrarException(wy1.h("Starting metric=", yqbVar.g())));
        } else if (!z && l != null) {
            String str3 = yqbVar.b;
            l6b l6bVar2 = wqi.a;
            if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
                l6bVar2.c(lg8Var, str3, wy1.j("Metric(", yqbVar.g(), "-", str, "): Trying to start metric in non lazy mode with explicit sliceTime!"), null);
            }
            yqbVar.a.a(new ExplicitTimeInNonLazyRegistrarException(wy1.h("Starting metric=", yqbVar.g())));
        }
        jve jveVar = yqbVar.f;
        if (l != null) {
            jElapsedRealtime = l.longValue();
        } else {
            if (yqbVar.a.d == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        jveVar.h(new rqb(str, jElapsedRealtime, c9aVar));
        return str;
    }

    public final void a(String str, imb imbVar) {
        this.f.h(new mqb(str, fzd.c(imbVar)));
    }

    public final void d(String str) {
        qt7 qt7Var = (qt7) this.c.k(new ceg(str));
        if (qt7Var != null) {
            qt7Var.cancel(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0191 A[EDGE_INSN: B:82:0x0191->B:64:0x0191 BREAK  A[LOOP:3: B:59:0x017a->B:84:?], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.util.List, o98] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Iterable, java.util.Collection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(java.lang.String r18, defpackage.lqb r19) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yqb.f(java.lang.String, lqb):void");
    }

    public abstract String g();

    public final void h(String str, qqb qqbVar) {
        ceg cegVar = new ceg(str);
        c9a c9aVar = this.d;
        Object objF = c9aVar.f(cegVar);
        if (objF == null) {
            objF = new w8a();
            c9aVar.m(cegVar, objF);
        }
        ((w8a) objF).b(qqbVar);
    }

    public void i(boolean z) {
    }

    public c9a j() {
        return fzd.b;
    }

    public long k(c9a c9aVar) {
        int i = s65.d;
        return v9j.h(10, y65.SECONDS);
    }

    public final void m(String str) {
        this.c.m(new ceg(str), svi.e((f84) this.a.i.getValue(), null, null, new uqb(this, str, null), 3));
    }

    public final void n() {
        gw0.w(new g56(new y83(new m36(new wqb(this, null), this.f), 27, this), new xqb(this, null), 1), (f84) this.a.i.getValue());
    }
}
