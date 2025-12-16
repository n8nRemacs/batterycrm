package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import com.google.android.gms.common.api.Status;
import java.lang.reflect.Field;

/* loaded from: classes2.dex */
public abstract class jqd {
    public static final long[] a = {1, 2, 5, 10, 16};
    public static Field b;
    public static Field c;

    public static final void a(GradientDrawable gradientDrawable, int[] iArr, float[] fArr) {
        if (Build.VERSION.SDK_INT >= 29) {
            gradientDrawable.setColors(iArr, fArr);
            return;
        }
        try {
            if (b == null) {
                Field declaredField = gradientDrawable.getClass().getDeclaredField("mGradientState");
                declaredField.setAccessible(true);
                b = declaredField;
            }
            Field field = b;
            Field field2 = null;
            if (field == null) {
                field = null;
            }
            Object obj = field.get(gradientDrawable);
            if (c == null) {
                Field declaredField2 = obj.getClass().getDeclaredField("mPositions");
                declaredField2.setAccessible(true);
                c = declaredField2;
            }
            Field field3 = c;
            if (field3 != null) {
                field2 = field3;
            }
            field2.set(obj, fArr);
        } catch (Throwable unused) {
        }
        gradientDrawable.setColors(iArr);
    }

    public static void b(Status status, Object obj, n2g n2gVar) {
        if (status.b()) {
            n2gVar.a.q(obj);
        } else {
            n2gVar.c(yqi.c(status));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0049 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[LOOP:0: B:15:0x0027->B:40:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean c(boolean r7, defpackage.cx5 r8, defpackage.cm6 r9) {
        /*
            java.lang.Object r0 = r9.invoke()
            java.io.File r0 = (java.io.File) r0
            r1 = 1
            if (r0 == 0) goto L1c
            boolean r2 = r0.exists()
            if (r2 == 0) goto L19
            if (r7 == 0) goto L66
            if (r8 == 0) goto L66
            java.lang.String r7 = "checkFilesDirAvailable: filesDir exists"
            r8.log(r7)
            return r1
        L19:
            r0.mkdirs()     // Catch: java.lang.SecurityException -> L1c
        L1c:
            if (r0 == 0) goto L24
            boolean r7 = r0.exists()
            if (r7 != 0) goto L50
        L24:
            r2 = 0
            r7 = -1
        L27:
            if (r0 == 0) goto L2f
            boolean r0 = r0.exists()
            if (r0 != 0) goto L50
        L2f:
            int r7 = r7 + r1
            r0 = 4
            int r0 = java.lang.Math.min(r7, r0)
            long[] r4 = defpackage.jqd.a
            r5 = r4[r0]
            android.os.SystemClock.sleep(r5)
            java.lang.Object r0 = r9.invoke()
            java.io.File r0 = (java.io.File) r0
            long r2 = r2 + r5
            r4 = 200(0xc8, double:9.9E-322)
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 <= 0) goto L27
            if (r8 == 0) goto L50
            java.lang.String r7 = "checkFilesDirAvailable: waiting max time! break"
            r8.log(r7)
        L50:
            java.lang.Object r7 = r9.invoke()
            java.io.File r7 = (java.io.File) r7
            if (r7 == 0) goto L67
            boolean r9 = r7.exists()
            if (r9 != 0) goto L5f
            goto L67
        L5f:
            if (r8 == 0) goto L66
            java.lang.String r7 = "checkFilesDirAvailable: dir is created!"
            r8.log(r7)
        L66:
            return r1
        L67:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "checkFilesDirAvailable: filesDir returns "
            r9.<init>(r0)
            r9.append(r7)
            java.lang.String r7 = " which is not an existing directory. See https://issuetracker.google.com/issues/36918154"
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            if (r8 == 0) goto L84
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r7)
            r8.error(r7, r9)
        L84:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jqd.c(boolean, cx5, cm6):boolean");
    }
}
