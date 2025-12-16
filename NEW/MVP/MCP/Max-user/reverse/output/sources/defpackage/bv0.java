package defpackage;

import java.io.EOFException;

/* loaded from: classes.dex */
public abstract class bv0 {
    public static final byte[] a = "0123456789abcdef".getBytes(lb2.a);

    public static final String a(qu0 qu0Var, long j) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (qu0Var.Q(j2) == ((byte) 13)) {
                String strJ0 = qu0Var.j0(j2, lb2.a);
                qu0Var.skip(2L);
                return strJ0;
            }
        }
        String strJ02 = qu0Var.j0(j, lb2.a);
        qu0Var.skip(1L);
        return strJ02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        if (r18 == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006f, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:?, code lost:
    
        return -2;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0091 A[LOOP:0: B:5:0x0015->B:45:0x0091, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0090 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int b(defpackage.qu0 r16, defpackage.ejb r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 160
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bv0.b(qu0, ejb, boolean):int");
    }
}
