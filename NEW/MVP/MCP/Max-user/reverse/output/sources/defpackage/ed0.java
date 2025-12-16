package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;

/* loaded from: classes2.dex */
public final class ed0 {
    public static final int f;
    public static final cd0 g = new cd0(20);
    public final ve2 a;
    public final zd0 b;
    public final ku3 c;
    public final String d;
    public final int e = -1;

    static {
        int dimension = (int) Resources.getSystem().getDimension(R.dimen.notification_large_icon_width);
        if (dimension == 0) {
            dimension = Math.round(64 * Resources.getSystem().getDisplayMetrics().density);
        }
        f = dimension;
    }

    public ed0(f7b f7bVar, ve2 ve2Var, zd0 zd0Var) {
        this.b = zd0Var;
        this.a = ve2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap a(android.content.Context r11, defpackage.f7b r12, defpackage.ve2 r13, defpackage.zd0 r14, defpackage.ku3 r15, java.lang.String r16, java.lang.String r17, defpackage.j0e r18) {
        /*
            r0 = r16
            r1 = r17
            if (r0 == 0) goto Ld
            ed0 r15 = new ed0
            r15.<init>(r12, r13, r14, r0)
        Lb:
            r2 = r15
            goto L1c
        Ld:
            if (r15 == 0) goto L16
            ed0 r0 = new ed0
            r0.<init>(r12, r13, r14, r15)
            r2 = r0
            goto L1c
        L16:
            ed0 r15 = new ed0
            r15.<init>(r12, r13, r14)
            goto Lb
        L1c:
            android.graphics.Bitmap$Config r12 = android.graphics.Bitmap.Config.ARGB_8888
            int r4 = defpackage.ed0.f
            android.graphics.Bitmap r12 = android.graphics.Bitmap.createBitmap(r4, r4, r12)
            android.graphics.Canvas r13 = new android.graphics.Canvas
            r13.<init>(r12)
            android.net.Uri r14 = r2.b(r1)
            if (r14 != 0) goto L3b
            android.graphics.drawable.Drawable r11 = r2.c(r11)
            r14 = 0
            r11.setBounds(r14, r14, r4, r4)
            r11.draw(r13)
            return r12
        L3b:
            bd0 r14 = new bd0
            r14.<init>(r2, r1, r4, r11)
            vk3 r15 = new vk3
            r0 = 2
            r15.<init>(r0, r14)
            r9 = r18
            lra r6 = r15.p(r9)
            java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.lang.String r15 = "unit is null"
            java.util.Objects.requireNonNull(r14, r15)
            ota r5 = new ota
            r10 = 1
            r7 = 1000(0x3e8, double:4.94E-321)
            r5.<init>(r6, r7, r9, r10)
            r14 = r5
            ad0 r15 = new ad0
            r0 = 0
            r15.<init>(r13, r4, r0)
            bd0 r0 = new bd0
            r5 = 0
            r3 = r11
            r1 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            jn6 r11 = defpackage.pdf.d
            defpackage.azi.b(r14, r15, r0, r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ed0.a(android.content.Context, f7b, ve2, zd0, ku3, java.lang.String, java.lang.String, j0e):android.graphics.Bitmap");
    }

    public final Uri b(String str) {
        String str2 = this.d;
        if (str2 != null) {
            return tfi.g(str2);
        }
        ku3 ku3Var = this.c;
        if (ku3Var != null) {
            return tfi.g(ku3Var.s(str, il0.c));
        }
        return null;
    }

    public final Drawable c(Context context) {
        int i;
        ku3 ku3Var = this.c;
        Bitmap bitmap = ku3Var != null ? (Bitmap) g.get(Long.valueOf(ku3Var.p() ^ this.a.U())) : null;
        if (bitmap != null && !bitmap.isRecycled()) {
            try {
                return new BitmapDrawable(context.getResources(), bitmap.copy(bitmap.getConfig(), false));
            } catch (Throwable th) {
                wqi.p("ed0", "couldnt use cached bitmap", th);
            }
        }
        return (this.d == null || (i = this.e) == -1) ? ku3Var != null ? new ae0(this.b, ku3Var) : r34.b(context, 0) : r34.b(context, i);
    }

    public ed0(f7b f7bVar, ve2 ve2Var, zd0 zd0Var, ku3 ku3Var) {
        this.b = zd0Var;
        this.c = ku3Var;
        this.a = ve2Var;
    }

    public ed0(f7b f7bVar, ve2 ve2Var, zd0 zd0Var, String str) {
        this.b = zd0Var;
        this.d = str;
        this.a = ve2Var;
    }
}
