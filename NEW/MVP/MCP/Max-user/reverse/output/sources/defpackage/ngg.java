package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class ngg implements r3c, jd {
    public j60 X;
    public bdh Y;
    public bdh Z;
    public final mhb a;
    public ssb b;
    public u5g s0;
    public fk6 t0;
    public hf6 v0;
    public hf6 w0;
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final ArrayList o = new ArrayList();
    public final LinkedHashMap u0 = new LinkedHashMap();

    public ngg(mhb mhbVar, int i) {
        this.a = mhbVar;
    }

    @Override // defpackage.jd
    public final void L(id idVar, hf6 hf6Var) {
        this.w0 = hf6Var;
        b(hf6Var);
    }

    public final void a() {
        this.c.clear();
        this.d.clear();
        this.o.clear();
        this.X = null;
        this.w0 = null;
        this.Y = null;
        this.Z = null;
        this.v0 = null;
        this.s0 = null;
    }

    public final void b(hf6 hf6Var) {
        Object next;
        u30 u30VarA = rui.a(hf6Var);
        String str = (String) this.u0.get(u30VarA.a);
        j60 j60Var = this.X;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (fni.a((String) ((j60) next).b, str)) {
                    break;
                }
            }
        }
        j60 j60Var2 = (j60) next;
        j60 j60Var3 = j60Var2 != null ? new j60(j60Var2.d, (String) j60Var2.b, u30VarA) : null;
        if (j60Var3 != j60Var) {
            this.X = j60Var3;
            ssb ssbVar = this.b;
            if (ssbVar != null) {
                ((oh6) ssbVar.c).o((vgb) ssbVar.b, j60Var3);
            }
        }
    }

    @Override // defpackage.jd
    public final void b0(id idVar, hf6 hf6Var) {
        this.v0 = hf6Var;
        d(hf6Var);
    }

    public final void d(hf6 hf6Var) {
        Object next;
        v3h v3hVarB = rui.b(hf6Var);
        bdh bdhVar = this.Z;
        Iterator it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (fni.a((String) ((bdh) next).b, npi.b(v3hVarB))) {
                    break;
                }
            }
        }
        bdh bdhVar2 = (bdh) next;
        bdh bdhVar3 = bdhVar2 != null ? new bdh(bdhVar2.d, (String) bdhVar2.b, v3hVarB) : null;
        if (bdhVar3 != bdhVar) {
            this.Z = bdhVar3;
            ssb ssbVar = this.b;
            if (ssbVar != null) {
                ((oh6) ssbVar.c).k((vgb) ssbVar.b, bdhVar3);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:235:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ec  */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    @Override // defpackage.r3c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e0(defpackage.kgg r31) {
        /*
            Method dump skipped, instructions count: 939
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ngg.e0(kgg):void");
    }
}
