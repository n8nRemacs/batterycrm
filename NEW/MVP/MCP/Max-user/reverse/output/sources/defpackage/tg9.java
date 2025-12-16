package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class tg9 implements jb4 {
    public static final tm3 b = new tm3(new mx0(new p89(3), yca.b), new mx0(new p89(4), yca.c));
    public final ArrayList a = new ArrayList();

    @Override // defpackage.jb4
    public final long a(long j) {
        int i = 0;
        long jMin = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                break;
            }
            long j2 = ((kb4) arrayList.get(i)).b;
            long j3 = ((kb4) arrayList.get(i)).d;
            if (j < j2) {
                jMin = jMin == -9223372036854775807L ? j2 : Math.min(jMin, j2);
            } else {
                if (j < j3) {
                    jMin = jMin == -9223372036854775807L ? j3 : Math.min(jMin, j3);
                }
                i++;
            }
        }
        if (jMin != -9223372036854775807L) {
            return jMin;
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.jb4
    public final boolean b(kb4 kb4Var, long j) {
        long j2 = kb4Var.b;
        hsi.b(j2 != -9223372036854775807L);
        hsi.b(kb4Var.c != -9223372036854775807L);
        boolean z = j2 <= j && j < kb4Var.d;
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j2 >= ((kb4) arrayList.get(size)).b) {
                arrayList.add(size + 1, kb4Var);
                return z;
            }
        }
        arrayList.add(0, kb4Var);
        return z;
    }

    @Override // defpackage.jb4
    public final wg7 c(long j) {
        ArrayList arrayList = this.a;
        if (!arrayList.isEmpty()) {
            if (j >= ((kb4) arrayList.get(0)).b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < arrayList.size(); i++) {
                    kb4 kb4Var = (kb4) arrayList.get(i);
                    if (j >= kb4Var.b && j < kb4Var.d) {
                        arrayList2.add(kb4Var);
                    }
                    if (j < kb4Var.b) {
                        break;
                    }
                }
                zjd zjdVarR = wg7.r(b, arrayList2);
                tg7 tg7VarI = wg7.i();
                for (int i2 = 0; i2 < zjdVarR.d; i2++) {
                    tg7VarI.d(((kb4) zjdVarR.get(i2)).a);
                }
                return tg7VarI.i();
            }
        }
        t76 t76Var = wg7.b;
        return zjd.o;
    }

    @Override // defpackage.jb4
    public final void clear() {
        this.a.clear();
    }

    @Override // defpackage.jb4
    public final long d(long j) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j < ((kb4) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        long jMax = ((kb4) arrayList.get(0)).b;
        for (int i = 0; i < arrayList.size(); i++) {
            long j2 = ((kb4) arrayList.get(i)).b;
            long j3 = ((kb4) arrayList.get(i)).d;
            if (j3 > j) {
                if (j2 > j) {
                    break;
                }
                jMax = Math.max(jMax, j2);
            } else {
                jMax = Math.max(jMax, j3);
            }
        }
        return jMax;
    }

    @Override // defpackage.jb4
    public final void e(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return;
            }
            long j2 = ((kb4) arrayList.get(i)).b;
            if (j > j2 && j > ((kb4) arrayList.get(i)).d) {
                arrayList.remove(i);
                i--;
            } else if (j < j2) {
                return;
            }
            i++;
        }
    }
}
