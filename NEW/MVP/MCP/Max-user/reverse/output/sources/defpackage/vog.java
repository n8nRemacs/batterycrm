package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;

/* loaded from: classes.dex */
public abstract class vog {
    public static final i3 a;
    public static final yk8 b;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            a = new yog(17);
        } else if (i >= 28) {
            a = new xog();
        } else {
            a = new wog();
        }
        b = new yk8(16);
    }

    public static Typeface a(Context context, Typeface typeface, int i) {
        if (context == null) {
            throw new IllegalArgumentException("Context cannot be null");
        }
        z5j.c(i, "weight", 1, 1000);
        if (typeface == null) {
            typeface = Typeface.DEFAULT;
        }
        return a.h0(context, typeface, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface b(android.content.Context r12, defpackage.ie6 r13, android.content.res.Resources r14, int r15, java.lang.String r16, int r17, int r18, defpackage.f8j r19, boolean r20) throws java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vog.b(android.content.Context, ie6, android.content.res.Resources, int, java.lang.String, int, int, f8j, boolean):android.graphics.Typeface");
    }

    public static String c(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }
}
