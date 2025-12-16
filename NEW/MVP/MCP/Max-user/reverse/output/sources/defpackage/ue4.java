package defpackage;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.net.Uri;

/* loaded from: classes.dex */
public final class ue4 implements gp0 {
    public static final crf o = ml6.k(new te4(0));
    public final va8 a;
    public final bl4 b;
    public final BitmapFactory.Options c;
    public final int d;

    /* JADX WARN: Illegal instructions before constructor call */
    public ue4(Context context) {
        va8 va8Var = (va8) o.get();
        hsi.h(va8Var);
        this(va8Var, new bl4(context), null, -1);
    }

    @Override // defpackage.gp0
    public final ha8 e(Uri uri) {
        return ((i2a) this.a).a(new u64(this, 2, uri));
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0064 A[RETURN] */
    @Override // defpackage.gp0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r0 = defpackage.zxg.a
            int r0 = r5.hashCode()
            r1 = 0
            r2 = 1
            r3 = -1
            switch(r0) {
                case -1487656890: goto L4f;
                case -1487464693: goto L44;
                case -1487464690: goto L39;
                case -1487394660: goto L2e;
                case -1487018032: goto L23;
                case -879272239: goto L18;
                case -879258763: goto Ld;
                default: goto Lc;
            }
        Lc:
            goto L59
        Ld:
            java.lang.String r0 = "image/png"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L16
            goto L59
        L16:
            r3 = 6
            goto L59
        L18:
            java.lang.String r0 = "image/bmp"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L21
            goto L59
        L21:
            r3 = 5
            goto L59
        L23:
            java.lang.String r0 = "image/webp"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L2c
            goto L59
        L2c:
            r3 = 4
            goto L59
        L2e:
            java.lang.String r0 = "image/jpeg"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L37
            goto L59
        L37:
            r3 = 3
            goto L59
        L39:
            java.lang.String r0 = "image/heif"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L42
            goto L59
        L42:
            r3 = 2
            goto L59
        L44:
            java.lang.String r0 = "image/heic"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L4d
            goto L59
        L4d:
            r3 = r2
            goto L59
        L4f:
            java.lang.String r0 = "image/avif"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L58
            goto L59
        L58:
            r3 = r1
        L59:
            switch(r3) {
                case 0: goto L5d;
                case 1: goto L63;
                case 2: goto L63;
                case 3: goto L63;
                case 4: goto L63;
                case 5: goto L63;
                case 6: goto L63;
                default: goto L5c;
            }
        L5c:
            goto L64
        L5d:
            int r5 = android.os.Build.VERSION.SDK_INT
            r0 = 34
            if (r5 < r0) goto L64
        L63:
            return r2
        L64:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ue4.l(java.lang.String):boolean");
    }

    @Override // defpackage.gp0
    public final ha8 q(byte[] bArr) {
        return ((i2a) this.a).a(new u64(this, 1, bArr));
    }

    public ue4(va8 va8Var, bl4 bl4Var, BitmapFactory.Options options, int i) {
        this.a = va8Var;
        this.b = bl4Var;
        this.c = options;
        this.d = i;
    }
}
