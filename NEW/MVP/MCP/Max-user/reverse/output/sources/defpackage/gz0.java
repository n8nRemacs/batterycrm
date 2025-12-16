package defpackage;

import java.util.ArrayList;
import java.util.TreeSet;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public final class gz0 {
    public final int a;
    public final String b;
    public final TreeSet c = new TreeSet();
    public final ArrayList d = new ArrayList();
    public vk4 e;

    public gz0(int i, String str, vk4 vk4Var) {
        this.a = i;
        this.b = str;
        this.e = vk4Var;
    }

    public final long a(long j, long j2) {
        hsi.b(j >= 0);
        hsi.b(j2 >= 0);
        e1f e1fVarB = b(j, j2);
        long j3 = e1fVarB.c;
        boolean z = e1fVarB.d;
        long j4 = BuildConfig.MAX_TIME_TO_UPLOAD;
        if (!z) {
            if (j3 == -1) {
                j3 = Long.MAX_VALUE;
            }
            return -Math.min(j3, j2);
        }
        long j5 = j + j2;
        if (j5 >= 0) {
            j4 = j5;
        }
        long jMax = e1fVarB.b + j3;
        if (jMax < j4) {
            for (e1f e1fVar : this.c.tailSet(e1fVarB, false)) {
                long j6 = e1fVar.b;
                if (j6 > jMax) {
                    break;
                }
                jMax = Math.max(jMax, j6 + e1fVar.c);
                if (jMax >= j4) {
                    break;
                }
            }
        }
        return Math.min(jMax - j, j2);
    }

    public final e1f b(long j, long j2) {
        long jMin = j2;
        e1f e1fVar = new e1f(this.b, j, -1L, -9223372036854775807L, null);
        TreeSet treeSet = this.c;
        e1f e1fVar2 = (e1f) treeSet.floor(e1fVar);
        if (e1fVar2 != null && e1fVar2.b + e1fVar2.c > j) {
            return e1fVar2;
        }
        e1f e1fVar3 = (e1f) treeSet.ceiling(e1fVar);
        if (e1fVar3 != null) {
            long j3 = e1fVar3.b - j;
            jMin = jMin == -1 ? j3 : Math.min(j3, jMin);
        }
        return new e1f(this.b, j, jMin, -9223372036854775807L, null);
    }

    public final boolean c(long j, long j2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                return false;
            }
            ez0 ez0Var = (ez0) arrayList.get(i);
            long j3 = ez0Var.a;
            long j4 = ez0Var.b;
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
        if (obj != null && gz0.class == obj.getClass()) {
            gz0 gz0Var = (gz0) obj;
            if (this.a == gz0Var.a && this.b.equals(gz0Var.b) && this.c.equals(gz0Var.c) && this.e.equals(gz0Var.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + u45.e(this.a * 31, 31, this.b);
    }
}
