package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class w2i {
    public static int f;
    public ArrayList a;
    public int b;
    public int c;
    public ArrayList d;
    public int e;

    public final void a(ArrayList arrayList) {
        int size = this.a.size();
        if (this.e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                w2i w2iVar = (w2i) arrayList.get(i);
                if (this.e == w2iVar.b) {
                    c(this.c, w2iVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(d58 d58Var, int i) {
        int iN;
        int iN2;
        ArrayList arrayList = this.a;
        if (arrayList.size() == 0) {
            return 0;
        }
        zt3 zt3Var = (zt3) ((yt3) arrayList.get(0)).T;
        d58Var.t();
        zt3Var.b(d58Var, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((yt3) arrayList.get(i2)).b(d58Var, false);
        }
        if (i == 0 && zt3Var.z0 > 0) {
            yyi.a(zt3Var, d58Var, arrayList, 0);
        }
        if (i == 1 && zt3Var.A0 > 0) {
            yyi.a(zt3Var, d58Var, arrayList, 1);
        }
        try {
            d58Var.p();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.d = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            yt3 yt3Var = (yt3) arrayList.get(i3);
            nwf nwfVar = new nwf();
            new WeakReference(yt3Var);
            d58.n(yt3Var.I);
            d58.n(yt3Var.J);
            d58.n(yt3Var.K);
            d58.n(yt3Var.L);
            d58.n(yt3Var.M);
            this.d.add(nwfVar);
        }
        if (i == 0) {
            iN = d58.n(zt3Var.I);
            iN2 = d58.n(zt3Var.K);
            d58Var.t();
        } else {
            iN = d58.n(zt3Var.J);
            iN2 = d58.n(zt3Var.L);
            d58Var.t();
        }
        return iN2 - iN;
    }

    public final void c(int i, w2i w2iVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            yt3 yt3Var = (yt3) it.next();
            ArrayList arrayList = w2iVar.a;
            if (!arrayList.contains(yt3Var)) {
                arrayList.add(yt3Var);
            }
            int i2 = w2iVar.b;
            if (i == 0) {
                yt3Var.n0 = i2;
            } else {
                yt3Var.o0 = i2;
            }
        }
        this.e = w2iVar.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.c;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        String strJ = ho7.j(sb, this.b, "] <");
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            yt3 yt3Var = (yt3) it.next();
            StringBuilder sbO = ho7.o(strJ, " ");
            sbO.append(yt3Var.h0);
            strJ = sbO.toString();
        }
        return az1.i(strJ, " >");
    }
}
