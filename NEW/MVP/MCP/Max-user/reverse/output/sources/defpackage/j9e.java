package defpackage;

import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public final class j9e {
    public static final j9e c;
    public final long a;
    public final long b;

    static {
        j9e j9eVar = new j9e(0L, 0L);
        new j9e(BuildConfig.MAX_TIME_TO_UPLOAD, BuildConfig.MAX_TIME_TO_UPLOAD);
        new j9e(BuildConfig.MAX_TIME_TO_UPLOAD, 0L);
        new j9e(0L, BuildConfig.MAX_TIME_TO_UPLOAD);
        c = j9eVar;
    }

    public j9e(long j, long j2) {
        fsi.b(j >= 0);
        fsi.b(j2 >= 0);
        this.a = j;
        this.b = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x005d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(long r12, long r14, long r16) {
        /*
            r11 = this;
            long r0 = r11.a
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            long r5 = r11.b
            if (r4 != 0) goto Lf
            int r4 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r4 != 0) goto Lf
            return r12
        Lf:
            int r4 = defpackage.xxg.a
            long r7 = r12 - r0
            long r0 = r0 ^ r12
            long r9 = r12 ^ r7
            long r0 = r0 & r9
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L1d
            r7 = -9223372036854775808
        L1d:
            long r0 = r12 + r5
            long r9 = r12 ^ r0
            long r4 = r5 ^ r0
            long r4 = r4 & r9
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L2d
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L2d:
            int r2 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 > 0) goto L39
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r2 > 0) goto L39
            r2 = r4
            goto L3a
        L39:
            r2 = r3
        L3a:
            int r5 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r5 > 0) goto L43
            int r0 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1))
            if (r0 > 0) goto L43
            r3 = r4
        L43:
            if (r2 == 0) goto L58
            if (r3 == 0) goto L58
            long r0 = r14 - r12
            long r0 = java.lang.Math.abs(r0)
            long r12 = r16 - r12
            long r12 = java.lang.Math.abs(r12)
            int r12 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r12 > 0) goto L5d
            goto L5a
        L58:
            if (r2 == 0) goto L5b
        L5a:
            return r14
        L5b:
            if (r3 == 0) goto L5e
        L5d:
            return r16
        L5e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j9e.a(long, long, long):long");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j9e.class == obj.getClass()) {
            j9e j9eVar = (j9e) obj;
            if (this.a == j9eVar.a && this.b == j9eVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
