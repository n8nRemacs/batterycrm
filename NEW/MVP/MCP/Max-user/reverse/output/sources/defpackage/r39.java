package defpackage;

import android.os.Build;

/* loaded from: classes2.dex */
public final class r39 extends xfh {
    public final k18 X;
    public final k18 Y;
    public final k18 Z;
    public final xo6 b;
    public final dbe c;
    public final mp6 d;
    public final k18 o;
    public final psb s0;
    public final psb t0;
    public x9f u0;
    public final ci5 v0;
    public final jve w0;
    public final hbd x0;

    public r39(xo6 xo6Var, dbe dbeVar, mp6 mp6Var) {
        x29 x29Var = x29.a;
        bwf bwfVarD = x29Var.getAccessor().d(8);
        bwf bwfVarD2 = x29Var.getAccessor().d(137);
        bwf bwfVarD3 = x29Var.getAccessor().d(47);
        x29Var.getAccessor().d(48);
        bwf bwfVarD4 = x29Var.getAccessor().d(12);
        this.b = xo6Var;
        this.c = dbeVar;
        this.d = mp6Var;
        this.o = bwfVarD;
        this.X = bwfVarD2;
        this.Y = bwfVarD3;
        this.Z = bwfVarD4;
        String[] strArr = qsb.n;
        psb psbVar = new psb(strArr);
        this.s0 = psbVar;
        psb psbVar2 = new psb(Build.VERSION.SDK_INT >= 34 ? new String[]{"android.permission.READ_MEDIA_VISUAL_USER_SELECTED"} : strArr);
        this.t0 = psbVar2;
        this.v0 = new ci5(0);
        this.w0 = kve.a(1, 1, 2);
        this.x0 = gw0.C(new d53(new y83(new z41(new z41(psbVar, psbVar2, new gu8(3, null, 2), 3), dbeVar.Y, new em1(3, null, 3), 3), 18, this), 12), this.a, yve.a, new l34(new n5g(xo6Var.s0 ? y6b.b : y6b.a)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object t(defpackage.r39 r4, java.io.File r5, android.net.Uri r6, defpackage.q44 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.o39
            if (r0 == 0) goto L13
            r0 = r7
            o39 r0 = (defpackage.o39) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            o39 r0 = new o39
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.o
            int r1 = r0.Y
            qqg r2 = defpackage.qqg.a
            r3 = 1
            if (r1 == 0) goto L33
            if (r1 != r3) goto L2b
            r39 r4 = r0.d
            defpackage.g8j.b(r7)     // Catch: java.lang.Throwable -> L29
            goto L5f
        L29:
            r5 = move-exception
            goto L61
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.g8j.b(r7)
            boolean r7 = r5.exists()     // Catch: java.lang.Throwable -> L29
            if (r7 != 0) goto L5f
            if (r6 == 0) goto L5f
            k18 r7 = r4.Z     // Catch: java.lang.Throwable -> L29
            java.lang.Object r7 = r7.getValue()     // Catch: java.lang.Throwable -> L29
            android.content.Context r7 = (android.content.Context) r7     // Catch: java.lang.Throwable -> L29
            android.content.ContentResolver r7 = r7.getContentResolver()     // Catch: java.lang.Throwable -> L29
            java.io.InputStream r6 = r7.openInputStream(r6)     // Catch: java.lang.Throwable -> L29
            if (r6 == 0) goto L5f
            b6a r7 = defpackage.b6a.v0     // Catch: java.lang.Throwable -> L29
            r0.d = r4     // Catch: java.lang.Throwable -> L29
            r0.Y = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r5 = r7.T(r5, r6, r0)     // Catch: java.lang.Throwable -> L29
            g84 r6 = defpackage.g84.a
            if (r5 != r6) goto L5f
            return r6
        L5f:
            r6 = r2
            goto L66
        L61:
            ipd r6 = new ipd
            r6.<init>(r5)
        L66:
            java.lang.Throwable r5 = defpackage.kpd.a(r6)
            if (r5 == 0) goto L79
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.String r6 = "failed to copy picked image"
            defpackage.wqi.e(r4, r6, r5)
        L79:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r39.t(r39, java.io.File, android.net.Uri, q44):java.lang.Object");
    }
}
