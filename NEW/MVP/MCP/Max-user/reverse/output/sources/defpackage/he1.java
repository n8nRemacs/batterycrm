package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class he1 extends xfh {
    public static final /* synthetic */ yy7[] B0;
    public static final imb C0;
    public final ci5 A0;
    public final boolean X;
    public final k18 Y;
    public final k18 Z;
    public final String b;
    public final enb c;
    public final s2i d;
    public final bsb o;
    public final k18 s0;
    public final k18 t0;
    public final k18 u0;
    public final Object v0;
    public final tcf w0;
    public final tcf x0;
    public final t9f y0;
    public volatile x9f z0;

    static {
        z8a z8aVar = new z8a(he1.class, "requestParticipantsJob", "getRequestParticipantsJob()Lkotlinx/coroutines/Job;");
        vid.a.getClass();
        B0 = new yy7[]{z8aVar};
        C0 = new imb(fui.a("", Long.MIN_VALUE), mwg.c(i0b.A0).toString());
    }

    public he1(String str, enb enbVar, s2i s2iVar, bsb bsbVar, boolean z, k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5) {
        x9f x9fVar;
        ms8 ms8Var = ms8.a;
        this.b = str;
        this.c = enbVar;
        this.d = s2iVar;
        this.o = bsbVar;
        this.X = z;
        this.Y = k18Var;
        this.Z = k18Var3;
        this.s0 = k18Var4;
        this.t0 = k18Var5;
        this.u0 = k18Var2;
        this.v0 = ipi.b(3, new i6(28, this));
        tcf tcfVarA = ucf.a(new ae1(null, ms8Var, z ? ms8.b : ms8Var, true, new r5g(""), null, null));
        this.w0 = tcfVarA;
        this.x0 = tcfVarA;
        this.y0 = c7j.c();
        this.A0 = new ci5(0);
        svi.e(this.a, ((q2b) ((lzf) k18Var2.getValue())).b(), null, new zd1(this, null), 2);
        if (this.z0 == null || (x9fVar = this.z0) == null || !x9fVar.isActive()) {
            this.z0 = svi.e(this.a, ((q2b) ((lzf) k18Var2.getValue())).b(), null, new be1(this, null), 2);
        }
    }

    public static final s5g t(he1 he1Var, List list, int i) {
        List listK;
        tv3 tv3Var;
        if (i == 0) {
            return new n5g(m0b.v2);
        }
        if (i == 1) {
            ku3 ku3Var = (ku3) ue3.I(list);
            String strA = (ku3Var == null || (listK = ku3Var.k()) == null || (tv3Var = (tv3) ue3.I(listK)) == null) ? null : tv3Var.a();
            if (strA == null) {
                strA = "";
            }
            return new r5g(strA);
        }
        if (i != 2) {
            return new j5g(l0b.b, i);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            tv3 tv3Var2 = (tv3) ue3.I(((ku3) it.next()).k());
            String str = tv3Var2 != null ? tv3Var2.a : null;
            if (str != null) {
                arrayList.add(str);
            }
        }
        return new r5g(ue3.N(arrayList, null, null, null, null, 63));
    }

    public final void u(boolean z) {
        tcf tcfVar;
        Object value;
        s2i s2iVar = this.d;
        bsb bsbVar = this.o;
        if (bsbVar.c(s2iVar)) {
            return;
        }
        yx1 yx1Var = (yx1) this.Z.getValue();
        long j = z ? 1L : 0L;
        yx1Var.getClass();
        yx1.d(yx1Var, "AUDIO_ENABLED", null, null, Long.valueOf(j), null, null, true, 116);
        do {
            tcfVar = this.w0;
            value = tcfVar.getValue();
        } while (!tcfVar.c(value, ae1.a((ae1) value, null, !bsbVar.b().c(qsb.h) ? ms8.o : z ? ms8.b : ms8.a, null, false, null, null, null, 125)));
    }

    public final void v(boolean z) {
        tcf tcfVar;
        Object value;
        bsb bsbVar = this.o;
        if (!bsbVar.b().c(qsb.m)) {
            bsbVar.b().m(this.d);
            return;
        }
        yx1 yx1Var = (yx1) this.Z.getValue();
        long j = z ? 1L : 0L;
        yx1Var.getClass();
        yx1.d(yx1Var, "VIDEO_ENABLED", null, null, Long.valueOf(j), null, null, true, 116);
        do {
            tcfVar = this.w0;
            value = tcfVar.getValue();
        } while (!tcfVar.c(value, ae1.a((ae1) value, null, null, bsbVar.a(z), false, null, null, null, 123)));
    }
}
