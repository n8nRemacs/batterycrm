package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class x2f extends r9g {
    public static final Object x0 = new Object();
    public final long X;
    public final long Y;
    public final boolean Z;
    public final long b;
    public final long c;
    public final long d;
    public final long o;
    public final boolean s0;
    public final boolean t0;
    public final Object u0;
    public final i09 v0;
    public final xz8 w0;

    static {
        nz8 nz8Var = new nz8();
        t76 t76Var = wg7.b;
        zjd zjdVar = zjd.o;
        List list = Collections.EMPTY_LIST;
        zjd zjdVar2 = zjd.o;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            new c09(uri, null, zjdVar2);
        }
        nz8Var.a();
        v19 v19Var = v19.R0;
    }

    public x2f(long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, boolean z3, rha rhaVar, i09 i09Var, xz8 xz8Var) {
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.o = j4;
        this.X = j5;
        this.Y = j6;
        this.Z = z;
        this.s0 = z2;
        this.t0 = z3;
        this.u0 = rhaVar;
        i09Var.getClass();
        this.v0 = i09Var;
        this.w0 = xz8Var;
    }

    @Override // defpackage.r9g
    public final int b(Object obj) {
        return x0.equals(obj) ? 0 : -1;
    }

    @Override // defpackage.r9g
    public final l9g f(int i, l9g l9gVar, boolean z) {
        fsi.c(i, 1);
        Object obj = z ? x0 : null;
        long j = -this.X;
        l9gVar.getClass();
        l9gVar.g(null, obj, 0, this.d, j, u8.X, false);
        return l9gVar;
    }

    @Override // defpackage.r9g
    public final int h() {
        return 1;
    }

    @Override // defpackage.r9g
    public final Object l(int i) {
        fsi.c(i, 1);
        return x0;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d A[PHI: r1
  0x002d: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v4 long) binds: [B:3:0x000c, B:5:0x0010, B:7:0x0016, B:12:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.r9g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.p9g m(int r25, defpackage.p9g r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 1
            r2 = r25
            defpackage.fsi.c(r2, r1)
            long r1 = r0.Y
            boolean r14 = r0.s0
            if (r14 == 0) goto L2d
            boolean r3 = r0.t0
            if (r3 != 0) goto L2d
            r3 = 0
            int r3 = (r27 > r3 ? 1 : (r27 == r3 ? 0 : -1))
            if (r3 == 0) goto L2d
            long r3 = r0.o
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
            java.lang.Object r4 = defpackage.p9g.B0
            r21 = 0
            long r1 = r0.X
            i09 r5 = r0.v0
            java.lang.Object r6 = r0.u0
            long r7 = r0.b
            long r9 = r0.c
            boolean r13 = r0.Z
            xz8 r15 = r0.w0
            long r11 = r0.o
            r20 = 0
            r3 = r26
            r22 = r1
            r18 = r11
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.b(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r26
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x2f.m(int, p9g, long):p9g");
    }

    @Override // defpackage.r9g
    public final int o() {
        return 1;
    }
}
