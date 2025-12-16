package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class jz7 implements jb4 {
    public ArrayList a;

    @Override // defpackage.jb4
    public long a(long j) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j < ((kb4) arrayList.get(0)).b) {
            return ((kb4) arrayList.get(0)).b;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            kb4 kb4Var = (kb4) arrayList.get(i);
            long j2 = kb4Var.b;
            long j3 = kb4Var.b;
            if (j < j2) {
                long j4 = ((kb4) arrayList.get(i - 1)).d;
                return (j4 == -9223372036854775807L || j4 <= j || j4 >= j3) ? j3 : j4;
            }
        }
        long j5 = ((kb4) uni.c(arrayList)).d;
        if (j5 == -9223372036854775807L || j >= j5) {
            return Long.MIN_VALUE;
        }
        return j5;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    @Override // defpackage.jb4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(defpackage.kb4 r11, long r12) {
        /*
            r10 = this;
            java.util.ArrayList r0 = r10.a
            long r1 = r11.b
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L11
            r5 = r7
            goto L12
        L11:
            r5 = r6
        L12:
            defpackage.hsi.b(r5)
            int r5 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r5 > 0) goto L25
            long r8 = r11.d
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 == 0) goto L23
            int r3 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r3 >= 0) goto L25
        L23:
            r3 = r7
            goto L26
        L25:
            r3 = r6
        L26:
            int r4 = r0.size()
            int r4 = r4 - r7
        L2b:
            if (r4 < 0) goto L4e
            java.lang.Object r5 = r0.get(r4)
            kb4 r5 = (defpackage.kb4) r5
            long r8 = r5.b
            int r5 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r5 < 0) goto L3e
            int r4 = r4 + r7
            r0.add(r4, r11)
            return r3
        L3e:
            java.lang.Object r5 = r0.get(r4)
            kb4 r5 = (defpackage.kb4) r5
            long r8 = r5.b
            int r5 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r5 > 0) goto L4b
            r3 = r6
        L4b:
            int r4 = r4 + (-1)
            goto L2b
        L4e:
            r0.add(r6, r11)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jz7.b(kb4, long):boolean");
    }

    @Override // defpackage.jb4
    public wg7 c(long j) {
        int iF = f(j);
        if (iF == 0) {
            t76 t76Var = wg7.b;
            return zjd.o;
        }
        kb4 kb4Var = (kb4) this.a.get(iF - 1);
        long j2 = kb4Var.d;
        if (j2 == -9223372036854775807L || j < j2) {
            return kb4Var.a;
        }
        t76 t76Var2 = wg7.b;
        return zjd.o;
    }

    @Override // defpackage.jb4
    public void clear() {
        this.a.clear();
    }

    @Override // defpackage.jb4
    public long d(long j) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty() || j < ((kb4) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            long j2 = ((kb4) arrayList.get(i)).b;
            if (j == j2) {
                return j2;
            }
            if (j < j2) {
                kb4 kb4Var = (kb4) arrayList.get(i - 1);
                long j3 = kb4Var.d;
                return (j3 == -9223372036854775807L || j3 > j) ? kb4Var.b : j3;
            }
        }
        kb4 kb4Var2 = (kb4) uni.c(arrayList);
        long j4 = kb4Var2.d;
        return (j4 == -9223372036854775807L || j < j4) ? kb4Var2.b : j4;
    }

    @Override // defpackage.jb4
    public void e(long j) {
        ArrayList arrayList = this.a;
        int iF = f(j);
        if (iF == 0) {
            return;
        }
        long j2 = ((kb4) arrayList.get(iF - 1)).d;
        if (j2 == -9223372036854775807L || j2 >= j) {
            iF--;
        }
        arrayList.subList(0, iF).clear();
    }

    public int f(long j) {
        ArrayList arrayList = this.a;
        for (int i = 0; i < arrayList.size(); i++) {
            if (j < ((kb4) arrayList.get(i)).b) {
                return i;
            }
        }
        return arrayList.size();
    }
}
