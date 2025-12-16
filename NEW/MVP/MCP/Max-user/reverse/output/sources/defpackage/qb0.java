package defpackage;

/* loaded from: classes.dex */
public final class qb0 {
    public final int a;
    public final wrf b;
    public final long c;

    public qb0(int i, wrf wrfVar, long j) {
        if (i == 0) {
            throw new NullPointerException("Null configType");
        }
        this.a = i;
        this.b = wrfVar;
        this.c = j;
    }

    public static int a(int i) {
        if (i == 35) {
            return 2;
        }
        if (i == 256) {
            return 3;
        }
        if (i == 4101) {
            return 4;
        }
        return i == 32 ? 5 : 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.qb0 b(int r2, int r3, android.util.Size r4, defpackage.wb0 r5) {
        /*
            int r0 = a(r3)
            int r4 = defpackage.d4f.a(r4)
            r1 = 1
            if (r2 != r1) goto L35
            java.util.HashMap r2 = r5.b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.Object r2 = r2.get(r1)
            android.util.Size r2 = (android.util.Size) r2
            int r2 = defpackage.d4f.a(r2)
            if (r4 > r2) goto L20
            wrf r2 = defpackage.wrf.s720p
            goto L89
        L20:
            java.util.HashMap r2 = r5.d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r2 = r2.get(r3)
            android.util.Size r2 = (android.util.Size) r2
            int r2 = defpackage.d4f.a(r2)
            if (r4 > r2) goto L87
            wrf r2 = defpackage.wrf.s1440p
            goto L89
        L35:
            android.util.Size r2 = r5.a
            int r2 = defpackage.d4f.a(r2)
            if (r4 > r2) goto L40
            wrf r2 = defpackage.wrf.VGA
            goto L89
        L40:
            android.util.Size r2 = r5.c
            int r2 = defpackage.d4f.a(r2)
            if (r4 > r2) goto L4b
            wrf r2 = defpackage.wrf.PREVIEW
            goto L89
        L4b:
            android.util.Size r2 = r5.e
            int r2 = defpackage.d4f.a(r2)
            if (r4 > r2) goto L56
            wrf r2 = defpackage.wrf.RECORD
            goto L89
        L56:
            java.util.HashMap r2 = r5.f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.Object r2 = r2.get(r1)
            android.util.Size r2 = (android.util.Size) r2
            int r2 = defpackage.d4f.a(r2)
            if (r4 > r2) goto L6b
            wrf r2 = defpackage.wrf.MAXIMUM
            goto L89
        L6b:
            java.util.HashMap r2 = r5.g
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r2 = r2.get(r3)
            android.util.Size r2 = (android.util.Size) r2
            if (r2 == 0) goto L87
            int r3 = r2.getWidth()
            int r2 = r2.getHeight()
            int r2 = r2 * r3
            if (r4 > r2) goto L87
            wrf r2 = defpackage.wrf.ULTRA_MAXIMUM
            goto L89
        L87:
            wrf r2 = defpackage.wrf.NOT_SUPPORT
        L89:
            qb0 r3 = new qb0
            r4 = 0
            r3.<init>(r0, r2, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qb0.b(int, int, android.util.Size, wb0):qb0");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qb0)) {
            return false;
        }
        qb0 qb0Var = (qb0) obj;
        return az1.c(this.a, qb0Var.a) && this.b.equals(qb0Var.b) && this.c == qb0Var.c;
    }

    public final int hashCode() {
        int iV = (((az1.v(this.a) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        long j = this.c;
        return iV ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SurfaceConfig{configType=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "RAW" : "JPEG_R" : "JPEG" : "YUV" : "PRIV");
        sb.append(", configSize=");
        sb.append(this.b);
        sb.append(", streamUseCase=");
        return ho7.k(sb, this.c, "}");
    }
}
