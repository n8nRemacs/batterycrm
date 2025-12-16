package defpackage;

import java.util.BitSet;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class kb2 {
    public final kb2 a;
    public final AtomicReference b;
    public final int c;
    public final int d;
    public boolean e;
    public String[] f;
    public ib2[] g;
    public int h;
    public int i;
    public int j;
    public int k;
    public boolean l;
    public BitSet m;

    public kb2(int i) {
        this.a = null;
        this.c = i;
        this.e = true;
        this.d = -1;
        this.l = false;
        this.k = 0;
        this.b = new AtomicReference(new jb2(new String[64], new ib2[32]));
    }

    public final int a(int i) {
        int i2 = i + (i >>> 15);
        int i3 = i2 ^ (i2 << 7);
        return (i3 + (i3 >>> 3)) & this.j;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0085 A[EDGE_INSN: B:128:0x0085->B:48:0x0085 BREAK  A[LOOP:1: B:34:0x0062->B:46:0x0081], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0081 A[LOOP:1: B:34:0x0062->B:46:0x0081, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String b(char[] r19, int r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kb2.b(char[], int, int, int):java.lang.String");
    }

    public kb2(kb2 kb2Var, int i, int i2, jb2 jb2Var) {
        this.a = kb2Var;
        this.c = i2;
        this.b = null;
        this.d = i;
        this.e = ho7.a(2, i);
        String[] strArr = jb2Var.c;
        this.f = strArr;
        this.g = jb2Var.d;
        this.h = jb2Var.a;
        this.k = jb2Var.b;
        int length = strArr.length;
        this.i = length - (length >> 2);
        this.j = length - 1;
        this.l = true;
    }
}
