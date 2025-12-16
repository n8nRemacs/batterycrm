package defpackage;

import java.util.ArrayList;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class fz0 {
    public final int a;
    public final String b;
    public final TreeSet c = new TreeSet();
    public final ArrayList d = new ArrayList();
    public uk4 e;

    public fz0(int i, String str, uk4 uk4Var) {
        this.a = i;
        this.b = str;
        this.e = uk4Var;
    }

    public final d1f a(long j, long j2) {
        long jMin = j2;
        d1f d1fVar = new d1f(this.b, j, -1L, -9223372036854775807L, null);
        TreeSet treeSet = this.c;
        d1f d1fVar2 = (d1f) treeSet.floor(d1fVar);
        if (d1fVar2 != null && d1fVar2.b + d1fVar2.c > j) {
            return d1fVar2;
        }
        d1f d1fVar3 = (d1f) treeSet.ceiling(d1fVar);
        if (d1fVar3 != null) {
            long j3 = d1fVar3.b - j;
            jMin = jMin == -1 ? j3 : Math.min(j3, jMin);
        }
        return new d1f(this.b, j, jMin, -9223372036854775807L, null);
    }

    public final boolean b(long j, long j2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                return false;
            }
            dz0 dz0Var = (dz0) arrayList.get(i);
            long j3 = dz0Var.a;
            long j4 = dz0Var.b;
            if (j4 == -1) {
                if (j >= j3) {
                    return true;
                }
            } else if (j2 != -1 && j3 <= j && j + j2 <= j3 + j4) {
                return true;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && fz0.class == obj.getClass()) {
            fz0 fz0Var = (fz0) obj;
            if (this.a == fz0Var.a && this.b.equals(fz0Var.b) && this.c.equals(fz0Var.c) && this.e.equals(fz0Var.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + u45.e(this.a * 31, 31, this.b);
    }
}
