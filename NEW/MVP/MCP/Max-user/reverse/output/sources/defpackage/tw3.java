package defpackage;

import android.graphics.RectF;
import android.net.Uri;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class tw3 extends b95 {
    public final bwf A;
    public final AtomicBoolean B;
    public final kh5 C;
    public final kh5 D;
    public final long n;
    public final k18 o;
    public final k18 p;
    public final k18 q;
    public final k18 r;
    public final k18 s;
    public final k18 t;
    public final k18 u;
    public final k18 v;
    public final k18 w;
    public final k18 x;
    public final hfd y;
    public final k18 z;

    public tw3(long j, ContextScope contextScope) {
        super(contextScope);
        this.n = j;
        yec yecVar = yec.a;
        bwf bwfVarD = yecVar.getAccessor().d(123);
        this.o = bwfVarD;
        this.p = yecVar.b();
        this.q = yecVar.getAccessor().d(46);
        this.r = yecVar.getAccessor().d(60);
        this.s = yecVar.c();
        this.t = yecVar.getAccessor().d(31);
        this.u = yecVar.getAccessor().d(15);
        this.v = yecVar.getAccessor().d(333);
        this.w = yecVar.getAccessor().d(330);
        this.x = yecVar.getAccessor().d(332);
        this.y = new hfd(1, yecVar.getAccessor().d(42));
        this.z = yecVar.a();
        this.A = new bwf(new ps3(3));
        this.B = new AtomicBoolean(false);
        this.C = new kh5(0, ve3.j(new x28(), new ad(), new pha()));
        this.D = new kh5(0, ue3.U(ve3.j(new x28(), new ad(), new pha()), new ed5()));
        gw0.w(gw0.u(new g56(new y83(new mwd(new nw3(new d53(((l24) bwfVarD.getValue()).c(j), 12), null, this)), 3, this), new bw3(this, null), 1), ((q2b) q()).b()), contextScope);
    }

    public static final Object n(tw3 tw3Var, cw3 cw3Var) throws Throwable {
        jve jveVar = tw3Var.d;
        boolean z = tw3Var.B.get();
        g84 g84Var = g84.a;
        if (z) {
            tw3Var.c().getClass();
            Object objA = jveVar.a(new cgc(new n5g(u8b.X), new n5g(u8b.W), ve3.j(new pq3(r8b.e0, new n5g(u8b.V), 1, 56), new pq3(r8b.f0, new n5g(u8b.U), 2, 56))), cw3Var);
            if (objA == g84Var) {
                return objA;
            }
        } else {
            ku3 ku3Var = (ku3) ((l24) tw3Var.o.getValue()).c(tw3Var.n).a.getValue();
            String strE = ku3Var != null ? ku3Var.e() : null;
            if (strE == null) {
                strE = "";
            }
            tw3Var.c().getClass();
            p5g p5gVar = new p5g(u8b.B0, ys.D(new Object[]{strE}));
            o98 o98VarD = ve3.d();
            o98VarD.add(new pq3(r8b.f, new n5g(u8b.A0), 1, 56));
            o98VarD.add(new pq3(r8b.e, new n5g(mvd.p), 2, 56));
            Object objA2 = jveVar.a(new cgc(p5gVar, null, ve3.a(o98VarD)), cw3Var);
            if (objA2 == g84Var) {
                return objA2;
            }
        }
        return qqg.a;
    }

    public static final s85 o(tw3 tw3Var, ku3 ku3Var) {
        s5g n5gVar;
        String strS = ku3Var.s(((w4e) ((pb3) tw3Var.q.getValue())).n(), il0.c);
        long jP = ku3Var.p();
        CharSequence charSequenceO = ku3Var.o();
        String strG = ku3Var.g();
        String strH = ku3Var.h();
        zv3 zv3Var = ku3Var.a.b;
        String str = zv3Var.o;
        String str2 = zv3Var.p;
        if (str2 == null || str2.length() == 0) {
            n5gVar = new n5g(u8b.T1);
        } else {
            String lastPathSegment = Uri.parse(zv3Var.p).getLastPathSegment();
            if (lastPathSegment == null) {
                lastPathSegment = "";
            }
            n5gVar = new r5g(lastPathSegment);
        }
        s5g s5gVar = n5gVar;
        String strValueOf = String.valueOf(ku3Var.q());
        String string = ((sxg) tw3Var.r.getValue()).g.getString("app.privacy.inactive.ttl", "6M");
        pxg pxgVar = pxg.TTL_6M;
        if (string != null) {
            switch (string) {
                case "1M":
                    pxgVar = pxg.TTL_1M;
                    break;
                case "3M":
                    pxgVar = pxg.TTL_3M;
                    break;
            }
        }
        return new s85(strS, jP, strG, charSequenceO, null, strH, null, str, s5gVar, strValueOf, pxgVar, false, null);
    }

    public static final void p(tw3 tw3Var, long j) {
        Object value;
        s85 s85VarC;
        Object value2;
        tcf tcfVar = tw3Var.j;
        do {
            value = tcfVar.getValue();
            s85 s85Var = (s85) value;
            if (s85Var != null) {
                s85VarC = s85.c(s85Var, null, null, null, null, null, null, null, j != 0, Long.valueOf(j), 2047);
            } else {
                s85VarC = null;
            }
        } while (!tcfVar.c(value, s85VarC));
        tcf tcfVar2 = tw3Var.c;
        do {
            value2 = tcfVar2.getValue();
        } while (!tcfVar2.c(value2, tw3Var.f().a(tw3Var)));
    }

    @Override // defpackage.b95
    public final void a(int i) {
        svi.e(this.a, ((q2b) q()).a(), null, new cw3(i, this, null), 2);
    }

    @Override // defpackage.b95
    public final void b() {
    }

    @Override // defpackage.b95
    public final boolean d() {
        return this.B.get();
    }

    @Override // defpackage.b95
    public final long e() {
        return this.n;
    }

    @Override // defpackage.b95
    public final void g(int i) {
        if (i == r8b.b) {
            r(pxg.TTL_1M);
            return;
        }
        if (i == r8b.c) {
            r(pxg.TTL_3M);
            return;
        }
        if (i == r8b.d) {
            r(pxg.TTL_6M);
            return;
        }
        int i2 = r8b.e0;
        f84 f84Var = this.a;
        if (i == i2) {
            svi.e(f84Var, ((q2b) q()).b(), null, new gw3(this, true, null), 2);
            return;
        }
        if (i == r8b.f) {
            svi.e(f84Var, ((q2b) q()).b().plus(bia.a), null, new fw3(this, null), 2);
        } else if (i == r8b.j0) {
            ((hw1) ((tv1) this.u.getValue())).y();
            svi.e(f84Var, ((q2b) q()).b(), null, new iw3(this, null), 2);
        }
    }

    @Override // defpackage.b95
    public final Object h(String str, RectF rectF, Continuation continuation) throws Throwable {
        this.m.set(((hwa) this.z.getValue()).A(str, qfi.a(rectF)));
        Object objA = this.d.a(new dgc(new n5g(u8b.q), new Integer(yud.n)), continuation);
        return objA == g84.a ? objA : qqg.a;
    }

    @Override // defpackage.b95
    public final qqg i() {
        ku3 ku3Var = (ku3) ((l24) this.o.getValue()).c(this.n).a.getValue();
        qqg qqgVar = qqg.a;
        if (ku3Var == null) {
            return qqgVar;
        }
        tcf tcfVar = this.b;
        xec xecVar = (xec) tcfVar.getValue();
        tcfVar.setValue(xecVar != null ? xec.a(xecVar, ku3Var.s(((w4e) ((pb3) this.q.getValue())).n(), il0.c), false, 126) : null);
        return qqgVar;
    }

    @Override // defpackage.b95
    public final void j() {
        svi.e(this.a, ((q2b) q()).b(), null, new jw3(this, null), 2);
    }

    @Override // defpackage.b95
    public final void k() {
        svi.e(this.a, ((q2b) q()).a(), null, new kw3(this, null), 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d5, code lost:
    
        if (defpackage.svi.i(r12, r4, r0) == r6) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f8, code lost:
    
        if (defpackage.svi.i(r12, r3, r0) == r6) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.b95
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.q44 r12) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tw3.l(q44):java.lang.Object");
    }

    @Override // defpackage.b95
    public final void m(int i, String str) {
        Object value;
        s85 s85Var;
        Object value2;
        s85 s85Var2;
        Object value3;
        s85 s85Var3;
        tcf tcfVar = this.j;
        if (i == 1) {
            do {
                value3 = tcfVar.getValue();
                s85Var3 = (s85) value3;
            } while (!tcfVar.c(value3, s85Var3 != null ? s85.c(s85Var3, str, null, null, null, null, null, null, false, null, 8171) : null));
        } else if (i == 2) {
            do {
                value2 = tcfVar.getValue();
                s85Var2 = (s85) value2;
            } while (!tcfVar.c(value2, s85Var2 != null ? s85.c(s85Var2, null, null, str, null, null, null, null, false, null, 8095) : null));
        } else if (i == 4) {
            do {
                value = tcfVar.getValue();
                s85Var = (s85) value;
            } while (!tcfVar.c(value, s85Var != null ? s85.c(s85Var, null, null, null, null, str, null, null, false, null, 8063) : null));
        }
    }

    public final lzf q() {
        return (lzf) this.s.getValue();
    }

    public final void r(pxg pxgVar) {
        pxg pxgVar2;
        s85 s85VarC;
        while (true) {
            tcf tcfVar = this.j;
            Object value = tcfVar.getValue();
            s85 s85Var = (s85) value;
            if (s85Var != null) {
                pxgVar2 = pxgVar;
                s85VarC = s85.c(s85Var, null, null, null, null, null, null, pxgVar2, false, null, 7167);
            } else {
                pxgVar2 = pxgVar;
                s85VarC = null;
            }
            if (tcfVar.c(value, s85VarC)) {
                return;
            } else {
                pxgVar = pxgVar2;
            }
        }
    }

    public final boolean s(kh5 kh5Var) {
        Object value;
        s85 s85Var;
        tcf tcfVar;
        Object value2;
        String str;
        s85 s85Var2;
        String str2;
        tcf tcfVar2 = this.j;
        s85 s85Var3 = (s85) tcfVar2.getValue();
        String str3 = s85Var3 != null ? s85Var3.c : null;
        if (str3 == null) {
            str3 = "";
        }
        zf3 zf3VarA = kh5Var.a(1, str3);
        s85 s85Var4 = (s85) tcfVar2.getValue();
        String str4 = s85Var4 != null ? s85Var4.f : null;
        zf3 zf3VarA2 = kh5Var.a(2, str4 != null ? str4 : "");
        s85 s85Var5 = (s85) tcfVar2.getValue();
        if (s85Var5 != null && (str = s85Var5.c) != null && vmf.F(str) && (s85Var2 = (s85) tcfVar2.getValue()) != null && (str2 = s85Var2.f) != null && !vmf.F(str2)) {
            zf3VarA = new zf3(Collections.singletonList(new n5g(avd.r0)));
        }
        zf3 zf3Var = zf3VarA;
        boolean z = zf3Var == null && zf3VarA2 == null;
        do {
            value = tcfVar2.getValue();
            s85Var = (s85) value;
        } while (!tcfVar2.c(value, s85Var != null ? s85.c(s85Var, null, zf3Var, null, zf3VarA2, null, null, null, false, null, 8111) : null));
        do {
            tcfVar = this.c;
            value2 = tcfVar.getValue();
        } while (!tcfVar.c(value2, f().a(this)));
        return z;
    }
}
