package defpackage;

import org.apache.http.HttpStatus;
import ru.ok.android.externcalls.analytics.config.UploadConfig;

/* loaded from: classes.dex */
public abstract class zs0 {
    public static final int[] a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, UploadConfig.DEFAULT_MAX_EVENT_COUNT, UploadConfig.DEFAULT_MAX_EVENT_COUNT, 480, HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_BAD_REQUEST, 2048};

    public static final y83 a(x26 x26Var, long j, sm6 sm6Var) {
        return new y83(new lo1(gw0.f(new i36(j, x26Var, null)), 2), 5, sm6Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0023, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List b(defpackage.ccd r3, int r4) throws java.lang.Throwable {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            int r1 = r0.size()
            if (r1 != r4) goto Lc
            goto L23
        Lc:
            java.lang.Object r1 = r3.b()
            boolean r2 = r1 instanceof defpackage.ma2
            if (r2 == 0) goto L25
            boolean r3 = r1 instanceof defpackage.la2
            r4 = 0
            if (r3 == 0) goto L1c
            la2 r1 = (defpackage.la2) r1
            goto L1d
        L1c:
            r1 = r4
        L1d:
            if (r1 == 0) goto L21
            java.lang.Throwable r4 = r1.a
        L21:
            if (r4 != 0) goto L24
        L23:
            return r0
        L24:
            throw r4
        L25:
            r0.add(r1)
            goto L5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zs0.b(ccd, int):java.util.List");
    }

    public static final m36 c(x26 x26Var, long j, sm6 sm6Var) {
        d53 d53Var = new d53(new m36(x26Var, sm6Var), 9);
        int i = s65.d;
        return new m36(new m11(10, new m11(new k46(v9j.i(j, y65.MILLISECONDS), d53Var, null))), new op2(3, null, 2));
    }

    public static void d(int i, qyg qygVar) {
        qygVar.B(7);
        byte[] bArr = qygVar.a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & 255);
        bArr[5] = (byte) ((i >> 8) & 255);
        bArr[6] = (byte) (i & 255);
    }

    public static x9f e(x26 x26Var, f84 f84Var) {
        return svi.e(f84Var, null, i84.a, new r36(x26Var, null), 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.u70 f(defpackage.u62 r9) {
        /*
            r0 = 16
            int r1 = r9.i(r0)
            int r0 = r9.i(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r9.i(r0)
            r2 = 7
            goto L19
        L18:
            r2 = r3
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r1 = 2
            int r2 = r9.i(r1)
            r4 = 3
            if (r2 != r4) goto L32
        L29:
            r9.i(r1)
            boolean r2 = r9.h()
            if (r2 != 0) goto L29
        L32:
            r2 = 10
            int r2 = r9.i(r2)
            boolean r5 = r9.h()
            if (r5 == 0) goto L47
            int r5 = r9.i(r4)
            if (r5 <= 0) goto L47
            r9.t(r1)
        L47:
            boolean r5 = r9.h()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            if (r5 == 0) goto L55
            r5 = r7
            goto L56
        L55:
            r5 = r6
        L56:
            int r9 = r9.i(r3)
            int[] r8 = defpackage.zs0.a
            if (r5 != r6) goto L65
            r6 = 13
            if (r9 != r6) goto L65
            r9 = r8[r9]
            goto L93
        L65:
            if (r5 != r7) goto L92
            r6 = 14
            if (r9 >= r6) goto L92
            r6 = r8[r9]
            int r2 = r2 % 5
            r7 = 8
            r8 = 1
            if (r2 == r8) goto L8b
            r8 = 11
            if (r2 == r1) goto L86
            if (r2 == r4) goto L8b
            if (r2 == r3) goto L7d
            goto L90
        L7d:
            if (r9 == r4) goto L83
            if (r9 == r7) goto L83
            if (r9 != r8) goto L90
        L83:
            int r9 = r6 + 1
            goto L93
        L86:
            if (r9 == r7) goto L83
            if (r9 != r8) goto L90
            goto L83
        L8b:
            if (r9 == r4) goto L83
            if (r9 != r7) goto L90
            goto L83
        L90:
            r9 = r6
            goto L93
        L92:
            r9 = 0
        L93:
            u70 r1 = new u70
            r2 = 1
            r1.<init>(r5, r0, r9, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zs0.f(u62):u70");
    }

    public static final u92 g(x26 x26Var, long j) {
        return gw0.f(new x36(j, x26Var, null));
    }

    public static final void h(esg esgVar) {
        esgVar.b(1, new a4e(22));
    }
}
