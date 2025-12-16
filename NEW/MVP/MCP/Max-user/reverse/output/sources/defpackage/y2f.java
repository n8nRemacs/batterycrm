package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class y2f extends s9g {
    public static final Object q = new Object();
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final Object n;
    public final k09 o;
    public final yz8 p;

    static {
        oz8 oz8Var = new oz8();
        uz8 uz8Var = new uz8();
        List list = Collections.EMPTY_LIST;
        zjd zjdVar = zjd.o;
        wz8 wz8Var = new wz8();
        d09 d09Var = d09.d;
        Uri uri = Uri.EMPTY;
        hsi.g(uz8Var.b == null || uz8Var.a != null);
        if (uri != null) {
            new a09(uri, null, uz8Var.a != null ? new vz8(uz8Var) : null, null, list, null, zjdVar, -9223372036854775807L);
        }
        new sz8(oz8Var);
        new yz8(wz8Var);
        w19 w19Var = w19.K;
    }

    public y2f(long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, boolean z3, tha thaVar, k09 k09Var, yz8 yz8Var) {
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
        this.i = j5;
        this.j = j6;
        this.k = z;
        this.l = z2;
        this.m = z3;
        this.n = thaVar;
        k09Var.getClass();
        this.o = k09Var;
        this.p = yz8Var;
    }

    @Override // defpackage.s9g
    public final int b(Object obj) {
        return q.equals(obj) ? 0 : -1;
    }

    @Override // defpackage.s9g
    public final m9g f(int i, m9g m9gVar, boolean z) {
        hsi.c(i, 1);
        Object obj = z ? q : null;
        long j = -this.i;
        m9gVar.getClass();
        m9gVar.i(null, obj, 0, this.g, j, v8.f, false);
        return m9gVar;
    }

    @Override // defpackage.s9g
    public final int h() {
        return 1;
    }

    @Override // defpackage.s9g
    public final Object l(int i) {
        hsi.c(i, 1);
        return q;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d A[PHI: r1
  0x002d: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v4 long) binds: [B:3:0x000c, B:5:0x0010, B:7:0x0016, B:12:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.s9g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.q9g m(int r25, defpackage.q9g r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 1
            r2 = r25
            defpackage.hsi.c(r2, r1)
            long r1 = r0.j
            boolean r14 = r0.l
            if (r14 == 0) goto L2d
            boolean r3 = r0.m
            if (r3 != 0) goto L2d
            r3 = 0
            int r3 = (r27 > r3 ? 1 : (r27 == r3 ? 0 : -1))
            if (r3 == 0) goto L2d
            long r3 = r0.h
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L26
        L23:
            r16 = r5
            goto L2f
        L26:
            long r1 = r1 + r27
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L2d
            goto L23
        L2d:
            r16 = r1
        L2f:
            java.lang.Object r4 = defpackage.q9g.q
            r21 = 0
            long r1 = r0.i
            k09 r5 = r0.o
            java.lang.Object r6 = r0.n
            long r7 = r0.e
            long r9 = r0.f
            boolean r13 = r0.k
            yz8 r15 = r0.p
            long r11 = r0.h
            r20 = 0
            r3 = r26
            r22 = r1
            r18 = r11
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.b(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r26
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y2f.m(int, q9g, long):q9g");
    }

    @Override // defpackage.s9g
    public final int o() {
        return 1;
    }
}
