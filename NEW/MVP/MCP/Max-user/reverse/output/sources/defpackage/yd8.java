package defpackage;

import java.io.File;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class yd8 {
    public final k18 a;
    public final k18 b;
    public final k18 c;

    public yd8(k18 k18Var, k18 k18Var2, k18 k18Var3) {
        this.a = k18Var;
        this.b = k18Var2;
        this.c = k18Var3;
    }

    public final zd8 a(ne8 ne8Var, pd8 pd8Var) {
        int i;
        jdc jdcVar;
        int i2;
        hz xubVar;
        if (!(pd8Var instanceof g00)) {
            return new zd8(ne8Var, (dce) this.a.getValue(), (m0g) this.b.getValue(), pd8Var);
        }
        dce dceVar = (dce) this.a.getValue();
        m0g m0gVar = (m0g) this.b.getValue();
        g00 g00Var = (g00) pd8Var;
        kz kzVar = (kz) this.c.getValue();
        j00 j00Var = new j00(ne8Var, dceVar, m0gVar, g00Var);
        String str = g00Var.t0.s;
        int i3 = 0;
        if (str != null && str.length() != 0) {
            dceVar.o(g00Var, new File(g00Var.t0.s));
            ne8Var.j(false);
            return j00Var;
        }
        wqi.c("j00", "Start download attach", new Object[0]);
        int i4 = 1;
        ne8Var.j(true);
        w10 w10Var = g00Var.t0;
        x10 x10Var = new x10();
        x10Var.a(w10Var);
        jdc jdcVarC = x10Var.c();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i5 = 0;
        while (i5 < jdcVarC.p()) {
            w10 w10VarO = jdcVarC.o(i5);
            String str2 = w10VarO.r;
            hz hzVar = (hz) kzVar.a.get(str2);
            if (hzVar == null || hzVar.b) {
                jz jzVar = kzVar.b;
                yy7[] yy7VarArr = jz.h;
                kz4 kz4Var = jzVar.b;
                i = i3;
                s10 s10Var = w10VarO.a;
                int i6 = s10Var == null ? -1 : iz.$EnumSwitchMapping$0[s10Var.ordinal()];
                if (i6 != i4) {
                    i2 = i4;
                    if (i6 == 2) {
                        jdcVar = jdcVarC;
                        kz4 kz4Var2 = jzVar.c;
                        yy7 yy7Var = yy7VarArr[i];
                        hwa hwaVar = (hwa) kz4Var2.get();
                        kz4 kz4Var3 = jzVar.d;
                        yy7 yy7Var2 = yy7VarArr[i2];
                        pb3 pb3Var = (pb3) kz4Var3.get();
                        kz4 kz4Var4 = jzVar.e;
                        yy7 yy7Var3 = yy7VarArr[2];
                        dv5 dv5Var = (dv5) kz4Var4.get();
                        kz4 kz4Var5 = jzVar.f;
                        yy7 yy7Var4 = yy7VarArr[3];
                        xubVar = new u0h(w10VarO, hwaVar, pb3Var, dv5Var, (tw0) kz4Var5.get());
                    } else if (i6 == 3) {
                        jdcVar = jdcVarC;
                        kz4 kz4Var6 = jzVar.e;
                        yy7 yy7Var5 = yy7VarArr[2];
                        dv5 dv5Var2 = (dv5) kz4Var6.get();
                        kz4 kz4Var7 = jzVar.f;
                        yy7 yy7Var6 = yy7VarArr[3];
                        xubVar = new g20(w10VarO, dv5Var2, (tw0) kz4Var7.get());
                    } else if (i6 != 4) {
                        xubVar = null;
                        jdcVar = jdcVarC;
                    } else {
                        jdcVar = jdcVarC;
                        bwf bwfVar = new bwf(new e44(5, jzVar.a));
                        bwf bwfVar2 = new bwf(new e44(5, kz4Var));
                        kz4 kz4Var8 = jzVar.g;
                        yy7 yy7Var7 = yy7VarArr[4];
                        xubVar = new nef(w10VarO, bwfVar, bwfVar2, (qx5) kz4Var8.get());
                    }
                } else {
                    jdcVar = jdcVarC;
                    i2 = i4;
                    xubVar = new xub(w10VarO, new bwf(new e44(5, kz4Var)));
                }
                if (xubVar != null) {
                    kzVar.a.put(str2, xubVar);
                    arrayList2.add(xubVar);
                    arrayList.add(str2);
                }
            } else {
                arrayList2.add(hzVar);
                arrayList.add(str2);
                jdcVar = jdcVarC;
                i2 = i4;
                i = i3;
            }
            i5++;
            i3 = i;
            i4 = i2;
            jdcVarC = jdcVar;
        }
        int i7 = i3;
        kz4 kz4Var9 = kzVar.c;
        mc5 mc5Var = new mc5(kz4Var9, arrayList2);
        i00 i00Var = new i00(j00Var, i7, g00Var);
        xtd xtdVar = new xtd(4, j00Var);
        v08 v08Var = (v08) mc5Var.b;
        if (v08Var == null || v08Var.e()) {
            vqa vqaVarB = ((hz) arrayList2.get(i7)).b();
            m0g m0gVar2 = (m0g) kz4Var9.get();
            m0gVar2.getClass();
            lra lraVarP = vqaVarB.p(((n0g) m0gVar2).a());
            v08 v08Var2 = new v08(i00Var, xtdVar, pdf.d);
            lraVarP.a(v08Var2);
            mc5Var.b = v08Var2;
        }
        j00Var.X = mc5Var;
        return j00Var;
    }
}
