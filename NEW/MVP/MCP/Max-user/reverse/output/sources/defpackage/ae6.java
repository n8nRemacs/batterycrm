package defpackage;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.http.HttpStatus;

/* loaded from: classes2.dex */
public final class ae6 extends xfh {
    public final tih X;
    public final w86 Y;
    public final k18 Z;
    public final lzf b;
    public final g5b c;
    public final ks3 d;
    public final q5b o;
    public final k18 s0;
    public final tcf t0;
    public final hbd u0;
    public final tcf v0;
    public final hbd w0;
    public final hbd x0;
    public boolean y0;

    public ae6() {
        k18 k18Var = x4e.w;
        e03 e03Var = e03.a;
        c5b c5bVar = (c5b) e03Var.getAccessor().c(561);
        bwf bwfVarD = e03Var.getAccessor().d(454);
        y4e y4eVar = y4e.a;
        lzf lzfVarJ = y4eVar.j();
        g5b g5bVar = (g5b) y4eVar.getAccessor().c(421);
        ks3 ks3Var = (ks3) e03Var.getAccessor().c(566);
        q5b q5bVar = (q5b) e03Var.getAccessor().c(HttpStatus.SC_LOCKED);
        tih tihVar = (tih) e03Var.getAccessor().c(75);
        bwf bwfVarD2 = e03Var.getAccessor().d(149);
        bwf bwfVarD3 = e03Var.getAccessor().d(79);
        lzf lzfVar = (lzf) e03Var.getAccessor().c(8);
        a84 a84Var = (a84) e03Var.getAccessor().c(84);
        bwf bwfVarD4 = e03Var.getAccessor().d(9);
        int i = 8;
        w86 w86Var = new w86(a84Var, bwfVarD2, bwfVarD3, bwfVarD4, lzfVar);
        this.b = lzfVarJ;
        this.c = g5bVar;
        this.d = ks3Var;
        this.o = q5bVar;
        this.X = tihVar;
        this.Y = w86Var;
        this.Z = bwfVarD;
        this.s0 = k18Var;
        o98 o98VarD = ve3.d();
        List<l0a> list = (List) ((AtomicReference) ((m0a) q5bVar.b.getValue()).b).get();
        ArrayList arrayList = new ArrayList(we3.q(list, 10));
        boolean z = false;
        for (l0a l0aVar : list) {
            if (fni.a(l0aVar.a, "all.chat.folder")) {
                z = true;
            }
            arrayList.add(new pa6(l0aVar.a, l0aVar.b, null, l0aVar.c, l0aVar.d));
        }
        o98VarD.addAll(arrayList);
        if (!z) {
            o98VarD.add(0, new pa6("all.chat.folder", this.c.a.getString(mvd.Y), null, u84.b, EnumSet.allOf(ra6.class)));
        }
        tcf tcfVarA = ucf.a(ve3.a(o98VarD));
        this.t0 = tcfVarA;
        this.u0 = new hbd(tcfVarA);
        tcf tcfVarA2 = ucf.a(0);
        this.v0 = tcfVarA2;
        this.w0 = new hbd(tcfVarA2);
        va4 va4Var = (va4) this.s0.getValue();
        va4Var.getClass();
        gw0.w(gw0.u(new g56(gw0.u(new z41(new d53(va4Var.v0, 13), new d53(c5bVar.g, 14), new s3(this, null, 13), 3), ((q2b) this.b).a()), new rd6(this, null), 1), ((q2b) this.b).b()), this.a);
        int i2 = s65.d;
        long jG = s65.g(v9j.h(2, y65.SECONDS));
        tid tidVar = new tid();
        tidVar.a = System.currentTimeMillis();
        this.x0 = gw0.C(gw0.m(gw0.x(gw0.m(zs0.g(new z41(gw0.c(new xd6(this, tidVar, null)), new y83(new hbd(this.d.a), i, this), new em1(3, null, 1), 3), v9j.h(500, y65.MILLISECONDS))), new vd6(tidVar, jG, null))), this.a, yve.b, e17.c);
    }

    public final void t(String str) {
        if (str == null) {
            return;
        }
        Iterator it = ((List) this.t0.getValue()).iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (fni.a(((pa6) it.next()).a, str)) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            this.v0.m(null, Integer.valueOf(i));
        }
    }
}
