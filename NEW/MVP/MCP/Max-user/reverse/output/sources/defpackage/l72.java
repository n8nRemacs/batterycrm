package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class l72 extends z2i {
    public final ArrayList k;
    public int l;

    public l72(yt3 yt3Var, int i) {
        yt3 yt3Var2;
        super(yt3Var);
        ArrayList arrayList = new ArrayList();
        this.k = arrayList;
        this.f = i;
        yt3 yt3Var3 = this.b;
        yt3 yt3VarM = yt3Var3.m(i);
        while (true) {
            yt3Var2 = yt3Var3;
            yt3Var3 = yt3VarM;
            if (yt3Var3 == null) {
                break;
            } else {
                yt3VarM = yt3Var3.m(this.f);
            }
        }
        this.b = yt3Var2;
        int i2 = this.f;
        arrayList.add(i2 == 0 ? yt3Var2.d : i2 == 1 ? yt3Var2.e : null);
        yt3 yt3VarL = yt3Var2.l(this.f);
        while (yt3VarL != null) {
            int i3 = this.f;
            arrayList.add(i3 == 0 ? yt3VarL.d : i3 == 1 ? yt3VarL.e : null);
            yt3VarL = yt3VarL.l(this.f);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            z2i z2iVar = (z2i) it.next();
            int i4 = this.f;
            if (i4 == 0) {
                z2iVar.b.b = this;
            } else if (i4 == 1) {
                z2iVar.b.c = this;
            }
        }
        if (this.f == 0 && ((zt3) this.b.T).v0 && arrayList.size() > 1) {
            this.b = ((z2i) wy1.d(arrayList, 1)).b;
        }
        this.l = this.f == 0 ? this.b.i0 : this.b.j0;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dd  */
    @Override // defpackage.wt4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.wt4 r28) {
        /*
            Method dump skipped, instructions count: 945
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l72.a(wt4):void");
    }

    @Override // defpackage.z2i
    public final void d() {
        ArrayList arrayList = this.k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((z2i) it.next()).d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        yt3 yt3Var = ((z2i) arrayList.get(0)).b;
        yt3 yt3Var2 = ((z2i) arrayList.get(size - 1)).b;
        int i = this.f;
        zt4 zt4Var = this.i;
        zt4 zt4Var2 = this.h;
        if (i == 0) {
            ft3 ft3Var = yt3Var.I;
            ft3 ft3Var2 = yt3Var2.K;
            zt4 zt4VarI = z2i.i(ft3Var, 0);
            int iE = ft3Var.e();
            yt3 yt3VarM = m();
            if (yt3VarM != null) {
                iE = yt3VarM.I.e();
            }
            if (zt4VarI != null) {
                z2i.b(zt4Var2, zt4VarI, iE);
            }
            zt4 zt4VarI2 = z2i.i(ft3Var2, 0);
            int iE2 = ft3Var2.e();
            yt3 yt3VarN = n();
            if (yt3VarN != null) {
                iE2 = yt3VarN.K.e();
            }
            if (zt4VarI2 != null) {
                z2i.b(zt4Var, zt4VarI2, -iE2);
            }
        } else {
            ft3 ft3Var3 = yt3Var.J;
            ft3 ft3Var4 = yt3Var2.L;
            zt4 zt4VarI3 = z2i.i(ft3Var3, 1);
            int iE3 = ft3Var3.e();
            yt3 yt3VarM2 = m();
            if (yt3VarM2 != null) {
                iE3 = yt3VarM2.J.e();
            }
            if (zt4VarI3 != null) {
                z2i.b(zt4Var2, zt4VarI3, iE3);
            }
            zt4 zt4VarI4 = z2i.i(ft3Var4, 1);
            int iE4 = ft3Var4.e();
            yt3 yt3VarN2 = n();
            if (yt3VarN2 != null) {
                iE4 = yt3VarN2.L.e();
            }
            if (zt4VarI4 != null) {
                z2i.b(zt4Var, zt4VarI4, -iE4);
            }
        }
        zt4Var2.a = this;
        zt4Var.a = this;
    }

    @Override // defpackage.z2i
    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i >= arrayList.size()) {
                return;
            }
            ((z2i) arrayList.get(i)).e();
            i++;
        }
    }

    @Override // defpackage.z2i
    public final void f() {
        this.c = null;
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((z2i) it.next()).f();
        }
    }

    @Override // defpackage.z2i
    public final long j() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            j = r5.i.f + ((z2i) arrayList.get(i)).j() + j + r5.h.f;
        }
        return j;
    }

    @Override // defpackage.z2i
    public final boolean k() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((z2i) arrayList.get(i)).k()) {
                return false;
            }
        }
        return true;
    }

    public final yt3 m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i >= arrayList.size()) {
                return null;
            }
            yt3 yt3Var = ((z2i) arrayList.get(i)).b;
            if (yt3Var.g0 != 8) {
                return yt3Var;
            }
            i++;
        }
    }

    public final yt3 n() {
        ArrayList arrayList = this.k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            yt3 yt3Var = ((z2i) arrayList.get(size)).b;
            if (yt3Var.g0 != 8) {
                return yt3Var;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f == 0 ? "horizontal : " : "vertical : ");
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            z2i z2iVar = (z2i) it.next();
            sb.append("<");
            sb.append(z2iVar);
            sb.append("> ");
        }
        return sb.toString();
    }
}
