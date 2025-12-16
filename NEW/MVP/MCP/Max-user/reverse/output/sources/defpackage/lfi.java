package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Trace;

/* loaded from: classes.dex */
public abstract class lfi {
    public static final String[] a = {"android.permission.READ_CONTACTS"};
    public static final String[] b = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
    public static final String[] c = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_BACKGROUND_LOCATION"};
    public static final String[] d = {"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES"};
    public static SharedPreferences e;

    public static void a(String str) {
        if (xxg.a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static boolean b(Context context, String[] strArr) {
        for (String str : strArr) {
            if (z7.b(context, str) != 0) {
                return false;
            }
        }
        return true;
    }

    public static void c() {
        if (xxg.a >= 18) {
            Trace.endSection();
        }
    }

    public static void d(SharedPreferences sharedPreferences, String[] strArr) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        for (String str : strArr) {
            editorEdit.putBoolean(str + "_req", true);
        }
        editorEdit.apply();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0029, code lost:
    
        if (r12[r8] != 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002b, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0095 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean e(ru.ok.messages.location.FrgLocationMap r10, java.lang.String[] r11, int[] r12, java.lang.String[] r13, int r14) {
        /*
            int r0 = defpackage.mvd.g1
            androidx.fragment.app.b r1 = r10.t()
            d6 r1 = (defpackage.d6) r1
            r2 = 0
            if (r1 == 0) goto L96
            int r3 = r13.length
            r4 = r2
        Ld:
            r5 = 1
            java.lang.String r6 = "lfi"
            if (r4 >= r3) goto L8d
            r7 = r13[r4]
            int r8 = r11.length
            if (r8 < r5) goto L31
            int r8 = r12.length
            if (r8 >= r5) goto L1b
            goto L31
        L1b:
            r8 = r2
        L1c:
            int r9 = r11.length
            if (r8 >= r9) goto L31
            r9 = r11[r8]
            boolean r9 = r9.equals(r7)
            if (r9 == 0) goto L2e
            r7 = r12[r8]
            if (r7 != 0) goto L31
            int r4 = r4 + 1
            goto Ld
        L2e:
            int r8 = r8 + 1
            goto L1c
        L31:
            int r11 = r13.length
            r12 = r2
        L33:
            if (r12 >= r11) goto L64
            r3 = r13[r12]
            int r4 = android.os.Build.VERSION.SDK_INT
            r7 = 33
            if (r4 >= r7) goto L47
            java.lang.String r7 = "android.permission.POST_NOTIFICATIONS"
            boolean r7 = android.text.TextUtils.equals(r7, r3)
            if (r7 == 0) goto L47
            r3 = r2
            goto L5d
        L47:
            r7 = 32
            if (r4 < r7) goto L50
            boolean r3 = defpackage.y7.a(r1, r3)
            goto L5d
        L50:
            r7 = 31
            if (r4 != r7) goto L59
            boolean r3 = defpackage.x7.b(r1, r3)
            goto L5d
        L59:
            boolean r3 = defpackage.w7.c(r1, r3)
        L5d:
            if (r3 == 0) goto L61
            r11 = r5
            goto L65
        L61:
            int r12 = r12 + 1
            goto L33
        L64:
            r11 = r2
        L65:
            if (r11 == 0) goto L74
            java.lang.String r10 = "some permissions denied"
            defpackage.wqi.d(r6, r10)
            java.lang.String r10 = r1.getString(r0)
            defpackage.efi.r(r1, r10, r2)
            goto L8b
        L74:
            int r11 = ru.ok.messages.views.dialogs.FrgDlgPermissions.C1
            int r12 = ru.ok.messages.views.dialogs.FrgDlgPermissions.D1
            r13 = 0
            ru.ok.messages.views.dialogs.FrgDlgPermissions r11 = ru.ok.messages.views.dialogs.FrgDlgPermissions.y0(r13, r11, r14, r12, r5)
            androidx.fragment.app.c r10 = r10.u()
            java.lang.String r12 = "ru.ok.messages.views.dialogs.FrgDlgPermissions"
            r11.x0(r10, r12)
            java.lang.String r10 = "some permissions denied forever"
            defpackage.wqi.d(r6, r10)
        L8b:
            r10 = r2
            goto L93
        L8d:
            java.lang.String r10 = "all permissions granted"
            defpackage.wqi.d(r6, r10)
            r10 = r5
        L93:
            if (r10 == 0) goto L96
            return r5
        L96:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lfi.e(ru.ok.messages.location.FrgLocationMap, java.lang.String[], int[], java.lang.String[], int):boolean");
    }
}
