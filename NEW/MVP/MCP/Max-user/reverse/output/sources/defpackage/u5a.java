package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class u5a {
    public final k18 a;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final k18 e;
    public final k18 f;
    public final k18 g;
    public final k18 h;
    public final k18 i;
    public final k18 j;
    public final k18 k;
    public final k18 l;

    public u5a(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5, k18 k18Var6, k18 k18Var7, k18 k18Var8, k18 k18Var9, k18 k18Var10, k18 k18Var11, k18 k18Var12) {
        this.a = k18Var;
        this.b = k18Var2;
        this.c = k18Var3;
        this.d = k18Var4;
        this.e = k18Var5;
        this.f = k18Var6;
        this.g = k18Var7;
        this.h = k18Var8;
        this.i = k18Var9;
        this.j = k18Var10;
        this.k = k18Var11;
        this.l = k18Var12;
    }

    public final void a(long j, long j2, fh9 fh9Var) {
        si9 si9VarB;
        qi9 qi9Var = (qi9) this.a.getValue();
        long j3 = fh9Var.X;
        bsd bsdVar = qi9Var.a.c;
        gj9 gj9VarH = bsdVar.d().h(j, j3);
        si9 si9VarB2 = gj9VarH != null ? bsdVar.b(gj9VarH) : null;
        if (si9VarB2 == null) {
            l6b l6bVar = wqi.a;
            if (l6bVar == null) {
                return;
            }
            lg8 lg8Var = lg8.X;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "MsgSendLogic", ho7.k(az1.l(fh9Var.X, "message cid=", " for chatId="), j, " not found!"), null);
                return;
            }
            return;
        }
        if (si9VarB2.b == 0) {
            bsd bsdVar2 = ((ie4) this.b.getValue()).c;
            List list = xi9.b;
            bsdVar2.t(j, ((w4e) ((pb3) this.l.getValue())).s(), fh9Var, null, false);
            ((qi9) this.a.getValue()).s(si9VarB2, po8.e(fh9Var.Z, (m4e) this.c.getValue()));
            qi9 qi9Var2 = (qi9) this.a.getValue();
            long j4 = fh9Var.X;
            bsd bsdVar3 = qi9Var2.a.c;
            gj9 gj9VarH2 = bsdVar3.d().h(j, j4);
            si9VarB = gj9VarH2 != null ? bsdVar3.b(gj9VarH2) : null;
        } else {
            si9VarB = si9VarB2;
        }
        if (si9VarB == null) {
            return;
        }
        pb2 pb2VarB0 = ((ve2) this.e.getValue()).b0(si9VarB.Z, j2, si9VarB);
        ((c7c) this.d.getValue()).b(pb2VarB0, si9VarB);
        if (pb2VarB0 != null) {
            if (pb2VarB0.b.m == 0) {
                ((abd) this.j.getValue()).b(pb2VarB0);
            }
            if (((lv4) this.f.getValue()).d()) {
                ArrayList arrayListL = pb2VarB0.l();
                hwa hwaVar = (hwa) this.h.getValue();
                ArrayList arrayList = new ArrayList(we3.q(arrayListL, 10));
                Iterator it = arrayListL.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((ku3) it.next()).p()));
                }
                hwaVar.p(arrayList);
            }
            if (pb2VarB0.M()) {
                gu5 gu5Var = (gu5) ((rt5) this.k.getValue());
                gu5Var.getClass();
                int i = 0;
                if (gu5Var.j(PmsKey.f155viewscountenabled, false)) {
                    long j5 = si9VarB.Z;
                    List listSingletonList = Collections.singletonList(Long.valueOf(si9VarB.b));
                    hwa hwaVar2 = (hwa) this.h.getValue();
                    String str = hwaVar2.a;
                    int size = listSingletonList.size();
                    StringBuilder sbL = az1.l(j5, "msgGetStat: chatId=", ", chatServerId=");
                    long j6 = j2;
                    sbL.append(j6);
                    sbL.append(", messageIds.size=");
                    sbL.append(size);
                    wqi.c(str, sbL.toString(), new Object[0]);
                    if (hwaVar2.j(j5) && !listSingletonList.isEmpty()) {
                        ArrayList arrayListI0 = ue3.i0(listSingletonList, 100, 100);
                        int size2 = arrayListI0.size();
                        long[] jArr = new long[size2];
                        while (i < size2) {
                            jArr[i] = hwa.q(hwaVar2, new e5a(hwaVar2.t().a.k(), j5, j6, (List) arrayListI0.get(i)));
                            i++;
                            j6 = j2;
                        }
                    }
                }
            }
            ((tw0) this.g.getValue()).c(new itg(pb2VarB0.a, si9VarB.a, false));
            eh9 eh9Var = pb2VarB0.c;
            if (eh9Var != null && eh9Var.a.a == si9VarB.a) {
                ((tw0) this.g.getValue()).c(new n73(Collections.singletonList(Long.valueOf(pb2VarB0.a)), false, false, null, null, 124));
            }
        }
        jdc jdcVar = si9VarB.x0;
        if (jdcVar == null || jdcVar.p() <= 0) {
            return;
        }
        for (w10 w10Var : (List) jdcVar.b) {
            k10 k10Var = w10Var.b;
            if (k10Var != null && k10Var.o && (w10Var.s.length() <= 0 || !w10Var.s.endsWith(".mp4"))) {
                long j7 = si9VarB.a;
                String str2 = w10Var.r;
                k10 k10Var2 = w10Var.b;
                ((dv5) this.i.getValue()).a(new m2g(j7, str2, 0L, 0L, k10Var2.Z, 0L, k10Var2.s0, false, false, 0L, "", 0, false, false, w10Var.a()));
            }
        }
    }
}
