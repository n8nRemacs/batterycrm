package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class rvd {
    public z2i a;
    public ArrayList b;

    public static long a(zt4 zt4Var, long j) {
        z2i z2iVar = zt4Var.d;
        ArrayList arrayList = zt4Var.k;
        if (z2iVar instanceof d27) {
            return j;
        }
        int size = arrayList.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            wt4 wt4Var = (wt4) arrayList.get(i);
            if (wt4Var instanceof zt4) {
                zt4 zt4Var2 = (zt4) wt4Var;
                if (zt4Var2.d != z2iVar) {
                    jMin = Math.min(jMin, a(zt4Var2, zt4Var2.f + j));
                }
            }
        }
        zt4 zt4Var3 = z2iVar.i;
        zt4 zt4Var4 = z2iVar.h;
        if (zt4Var != zt4Var3) {
            return jMin;
        }
        long j2 = j - z2iVar.j();
        return Math.min(Math.min(jMin, a(zt4Var4, j2)), j2 - zt4Var4.f);
    }

    public static long b(zt4 zt4Var, long j) {
        z2i z2iVar = zt4Var.d;
        ArrayList arrayList = zt4Var.k;
        if (z2iVar instanceof d27) {
            return j;
        }
        int size = arrayList.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            wt4 wt4Var = (wt4) arrayList.get(i);
            if (wt4Var instanceof zt4) {
                zt4 zt4Var2 = (zt4) wt4Var;
                if (zt4Var2.d != z2iVar) {
                    jMax = Math.max(jMax, b(zt4Var2, zt4Var2.f + j));
                }
            }
        }
        zt4 zt4Var3 = z2iVar.h;
        zt4 zt4Var4 = z2iVar.i;
        if (zt4Var != zt4Var3) {
            return jMax;
        }
        long j2 = z2iVar.j() + j;
        return Math.max(Math.max(jMax, b(zt4Var4, j2)), j2 - zt4Var4.f);
    }
}
