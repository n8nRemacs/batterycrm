package defpackage;

import androidx.media3.common.ParserException;
import org.apache.http.HttpStatus;
import ru.ok.android.externcalls.analytics.config.UploadConfig;

/* loaded from: classes2.dex */
public abstract class aw0 {
    public static final int[] a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, UploadConfig.DEFAULT_MAX_EVENT_COUNT, UploadConfig.DEFAULT_MAX_EVENT_COUNT, 480, HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_BAD_REQUEST, 2048};

    public static final su1 a(x26 x26Var, l48 l48Var, l38 l38Var) {
        return gw0.c(new p36(l48Var, l38Var, x26Var, null));
    }

    public static void b(int i, umb umbVar) {
        umbVar.G(7);
        byte[] bArr = umbVar.a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & 255);
        bArr[5] = (byte) ((i >> 8) & 255);
        bArr[6] = (byte) (i & 255);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.u70 c(defpackage.u62 r9) {
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
            int[] r8 = defpackage.aw0.a
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
            r2 = 2
            r1.<init>(r5, r0, r9, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aw0.c(u62):u70");
    }

    public static void d(u62 u62Var, v4 v4Var) {
        int i = u62Var.i(5);
        u62Var.t(2);
        if (u62Var.h()) {
            u62Var.t(5);
        }
        if (i >= 7 && i <= 10) {
            u62Var.s();
        }
        if (u62Var.h()) {
            int i2 = u62Var.i(3);
            if (v4Var.b == -1 && i >= 0 && i <= 15 && (i2 == 0 || i2 == 1)) {
                v4Var.b = i;
            }
            if (u62Var.h()) {
                f(u62Var);
            }
        }
    }

    public static void e(u62 u62Var, v4 v4Var) {
        u62Var.t(2);
        boolean zH = u62Var.h();
        int i = u62Var.i(8);
        for (int i2 = 0; i2 < i; i2++) {
            u62Var.t(2);
            if (u62Var.h()) {
                u62Var.t(5);
            }
            if (zH) {
                u62Var.t(24);
            } else {
                if (u62Var.h()) {
                    if (!u62Var.h()) {
                        u62Var.t(4);
                    }
                    v4Var.c = u62Var.i(6) + 1;
                }
                u62Var.t(4);
            }
        }
        if (u62Var.h()) {
            u62Var.t(3);
            if (u62Var.h()) {
                f(u62Var);
            }
        }
    }

    public static void f(u62 u62Var) throws ParserException {
        int i = u62Var.i(6);
        if (i < 2 || i > 42) {
            throw ParserException.c(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(i)));
        }
        u62Var.t(i * 8);
    }

    public static final void g(esg esgVar) {
        esgVar.b(1, new a4e(23));
    }
}
